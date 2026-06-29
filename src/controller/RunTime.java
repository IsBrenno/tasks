package controller;

import entity.Category;
import entity.Task;
import useCase.CategoryUseCase;
import useCase.TaskUseCase;

import java.util.Scanner;

public class RunTime {
    static Scanner keyboard =  new Scanner(System.in);
    static Task[] tasks = new Task[5];
    static int  taskCount = 0;
    static TaskUseCase taskUseCase = new TaskUseCase();
    static CategoryUseCase categoryUseCase = new CategoryUseCase();

    public static void run() {
        boolean exit = false;
        do {
            System.out.println("Select a choice");
            System.out.println("1. Create a task");
            System.out.println("2. List tasks");
            System.out.println("3. Create a Category");
            System.out.println("4. List Categories");
            System.out.println("5. Exit");

            int choice = keyboard.nextInt();
            switch (choice) {
                case 1:
                    Task task = taskUseCase.createTask(keyboard);
                    if (taskCount > tasks.length) {
                        System.out.println("No more spaces");
                        break;
                    }
                    tasks[taskCount] = task;
                    taskCount += 1;
                    break;
                case 2:
                    taskUseCase.listTasks(tasks);
                    break;
                case 3:
                    categoryUseCase.createCategory(keyboard);
                    break;
                case 4:
                    categoryUseCase.listCategories();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("No options are available");
            }
        } while (!exit);
    }
}
