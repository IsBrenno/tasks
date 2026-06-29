package useCase;

import controller.ports.TasksService;
import entity.Category;
import entity.Task;

import java.util.Scanner;

public class TaskUseCase implements TasksService {
    CategoryUseCase categoryUseCase = new CategoryUseCase();
    @Override
    public Task createTask(Scanner keyboard) {
        System.out.println("==========Create a Task==========");
        System.out.println("Set a title: ");
        String titleInput = keyboard.next();

        System.out.println("Set a Category: ");
        String categoryInput = keyboard.next();

        boolean exists = categoryUseCase.verifyCategory(categoryInput);
        if (!exists){
            System.out.println("Category does not exists");
            return null;
        }

        Category category = categoryUseCase.getCategory(categoryInput);

        System.out.println("Include task details? (yes/no)");
        String choice = keyboard.next().toLowerCase();

        if (!choice.equals("yes") && !choice.equals("no")) {
            System.out.println("No options are available");
            return null;
        }
        if (choice.equals("no")) {
            return new Task(titleInput, category);
        }

        System.out.println("Insert a task details: ");
        String detailsInput = keyboard.next();

        return new Task(titleInput, category, detailsInput);
    }

    @Override
    public void listTasks(Task[] tasks) {
        for (int i=0; i < tasks.length; i++) {
            if (tasks[i] == null) {
                return;
            } else {
                System.out.println("======= entity.Task " + i + "=======");
                System.out.println("Title: " + tasks[i].getTitle());
                System.out.println("entity.Category: " + tasks[i].getCategory());
                if (tasks[i].getDetails() == null) {
                    return;
                }
                System.out.println("Details: " + tasks[i].getDetails());
            }
        }
    }
}
