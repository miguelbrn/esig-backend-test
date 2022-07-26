package com.miguel.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miguel.backend.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    
}
