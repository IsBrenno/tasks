package repository;

import entity.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryRepository implements useCase.ports.CategoryRepository {
    ArrayList<Category> categories = new ArrayList<>();

    @Override
    public void saveCategory(Category category) {
        categories.add(category);
    }

    @Override
    public Category getCategory(String category) {
        for (int i=0; i < categories.size(); i++){
            if (categories.get(i).getTitle().equalsIgnoreCase(category)) {
                return categories.get(i);
            }
        }
        return null;
    }

    @Override
    public List<Category> listCategory() {
        return categories;
    }
}
