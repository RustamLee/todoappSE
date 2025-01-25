package com.utn.todoappse.services;

import com.utn.todoappse.model.Task;
import com.utn.todoappse.repository.IRepositoryTask;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private  final  IRepositoryTask repositoryTask;

    public TaskService(IRepositoryTask repositoryTask) {
        this.repositoryTask = repositoryTask;
    }

    public List<Task> getAllTasks(){
        return repositoryTask.findAll();
    }

    public void createTask(String title){
        Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false);
        repositoryTask.save(task);
    }

    public void deleteTask(Long id){
        repositoryTask.deleteById(id);
    }

    public void toggleTask(Long id){
        Task task = repositoryTask.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid task id"));
        task.setCompleted(!task.isCompleted());
        repositoryTask.save(task);
    }

}
