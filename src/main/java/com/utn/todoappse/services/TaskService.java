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
}
