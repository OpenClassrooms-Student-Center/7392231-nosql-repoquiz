package com.openclassrooms.quiz.embeddedmongodb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.openclassrooms.quiz.model.Course;
import com.openclassrooms.quiz.model.User;
import com.openclassrooms.quiz.repository.CourseRepository;
import com.openclassrooms.quiz.repository.UserRepository;

@Order(1)
@Component
public class Loader implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private CourseRepository courseRepository;

	@Override
	public void run(String... args) throws Exception {

		// Really not a best practice but quick and useful for this test :-)

		// Quiz partie 2

		List<User> users = new ArrayList<User>();
		users.add(new User(null, "romain", "sessa", "admin"));
		users.add(new User(null, "bob", "leponge", "admin"));
		users.add(new User(null, "sophie", "foncek", "user"));
		users.add(new User(null, "james", "bond", "user"));

		userRepository.insert(users);

		// Quiz partie 3

		courseRepository.insert(List.of(new Course("Spring Security", "The best Spring Security course ever!"),
				new Course("Spring Data MongoDB", "Wahou, that's a course!")));
	}

}