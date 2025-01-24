package com.utn.todoappse.repository;

import com.utn.todoappse.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryTask extends JpaRepository<Task,Long> {
}
