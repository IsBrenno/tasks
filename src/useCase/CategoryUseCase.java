package useCase;

import entity.Category;
import entity.Task;
import repository.CategoryRepository;

import java.util.List;
import java.util.Scanner;

public class CategoryUseCase implements controller.ports.CategoryUseCase {
    CategoryRepository categoryRepository = new CategoryRepository();
    @Override
    public void createCategory(Scanner keyboard) {
        System.out.println("==========Create a Category==========");
        System.out.println("Set title: ");
        String title = keyboard.next();

        System.out.println("Details: ");
        String details = keyboard.next();

        Category category = new Category(title, details);

        categoryRepository.saveCategory(category);

        System.out.println("Success to create category");
    }

    @Override
    public boolean verifyCategory(String category) {
        Category testCategory = categoryRepository.getCategory(category);
        if (testCategory == null) {
            return false;
        }
        return testCategory.getTitle().equals(category);
    }

    @Override
    public void listCategories() {
        List<Category> categories = categoryRepository.listCategory();

        for (int i=0; i < categories.size(); i++) {
            System.out.println("========= Category " + (i + 1) + "=========");
            System.out.println("Title: " + categories.get(i).getTitle());
            System.out.println("Details: " + categories.get(i).getDetails());
            System.out.println("=============================");
        }
    }

    @Override
    public void getInfo(String categoryInput) {
        Category category = categoryRepository.getCategory(categoryInput);
        System.out.println("=========== Category ===========");
        System.out.println("Title: " + category.getTitle());
        System.out.println("Details: " + category.getDetails());
        System.out.println("================================");
    }

    public Category getCategory(String categoryInput) {
        return categoryRepository.getCategory(categoryInput);
    }
}
