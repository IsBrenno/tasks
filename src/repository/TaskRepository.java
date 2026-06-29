package repository;

import entity.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository implements useCase.ports.TaskRepository {
    ArrayList<Task> tasks = new ArrayList<>();

    @Override
    public void saveTask(Task task) {
        tasks.add(task);
    }

    @Override
    public Task getTask(String task) {
        for (int i=0; i <= tasks.size(); i++) {
            if (tasks.get(i).getTitle().equals(task)) {
                return tasks.get(i);
            }
        }
        System.out.println("Task not found");
        return null;
    }

    @Override
    public List<Task> listTask() {
        return tasks;
    }
}
