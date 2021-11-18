package com.openclassrooms.quiz.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.openclassrooms.quiz.model.Course;

public interface CourseRepository extends MongoRepository<Course, String> {
	
}
