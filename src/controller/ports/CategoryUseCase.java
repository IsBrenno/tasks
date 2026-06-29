package controller.ports;

import entity.Category;

import java.util.Scanner;

public interface CategoryUseCase {
    void createCategory(Scanner keyboard);
    boolean verifyCategory(String category);
    void listCategories();
    void getInfo(String categoryInput);
}
