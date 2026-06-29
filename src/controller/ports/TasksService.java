package controller.ports;

import entity.Task;

import java.util.Scanner;

public interface TasksService {
    Task createTask(Scanner keyboard);
    void listTasks(Task[] tasks);
}