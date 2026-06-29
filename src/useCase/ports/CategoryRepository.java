package useCase.ports;

import entity.Category;

import java.util.List;

public interface CategoryRepository {
    void saveCategory(Category category);
    Category getCategory(String category);
    List<Category> listCategory();
}
