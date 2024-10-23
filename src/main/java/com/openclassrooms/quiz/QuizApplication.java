package com.openclassrooms.quiz;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.openclassrooms.quiz.model.User;
import com.openclassrooms.quiz.repository.UserRepository;

@SpringBootApplication
public class QuizApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(QuizApplication.class);

	@Autowired
	private UserRepository userRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(QuizApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		List<User> users = userRepository.findAll();
		users.forEach((user) -> logger.info(user.getUsername()));
	}
	
}
