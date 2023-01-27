package com.example.restapi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {
	public Course(){};

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;


	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}
}
