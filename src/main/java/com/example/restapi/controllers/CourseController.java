package com.example.restapi.controllers;

import com.example.restapi.CourseRepository;
import com.example.restapi.entities.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
	private final CourseRepository repository;

	public CourseController(CourseRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/courses")
	List<Course> all() {
		return repository.findAll();
	}


	@PostMapping("/courses")
	void create() {
		repository.save(new Course());
	}
}
