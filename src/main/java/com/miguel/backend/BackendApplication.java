package com.miguel.backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.miguel.backend.model.Task;
import com.miguel.backend.repository.TaskRepository;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(TaskRepository taskRepository) {
		return args -> {
			taskRepository.deleteAll();
			Task task = new Task();

			task.setTitle("Task 1");
			task.setDescription("Description 1");
			task.setPriority("High");
			task.setDeadline("2022-01-01");

			taskRepository.save(task);
		};	
	}
}
