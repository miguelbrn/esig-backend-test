package com.miguel.backend.controller;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miguel.backend.model.Task;
import com.miguel.backend.repository.TaskRepository;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping({"/api/tasks"})
@Component
@AllArgsConstructor
public class TaskController {

    private TaskRepository taskRepository;


    @GetMapping
    public List<Task> list() {
        return taskRepository.findAll();
    }

    @GetMapping(path = {"/{id}"})
    public Task get(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    @PostMapping(path = {"/{id}"})
    public Task create(Task task) {
        return taskRepository.save(task);
    }

    @PutMapping(value="path/{id}")
    public Task update(@PathVariable Long id, @RequestBody Task task) {
        Task taskToUpdate = taskRepository.findById(id).orElse(null);
        taskToUpdate.setTitle(task.getTitle());
        taskToUpdate.setDescription(task.getDescription());
        taskToUpdate.setPriority(task.getPriority());
        taskToUpdate.setDeadline(task.getDeadline());
        return taskRepository.save(taskToUpdate);
    }

    @DeleteMapping(path = {"/{id}"})
    public void delete(Long id) {
        taskRepository.deleteById(id);
    }
}
