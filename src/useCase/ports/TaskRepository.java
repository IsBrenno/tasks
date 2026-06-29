package useCase.ports;

import entity.Category;
import entity.Task;

import java.util.List;

public interface TaskRepository {
    void saveTask(Task task);
    Task getTask(String task);
    List<Task> listTask();
}
