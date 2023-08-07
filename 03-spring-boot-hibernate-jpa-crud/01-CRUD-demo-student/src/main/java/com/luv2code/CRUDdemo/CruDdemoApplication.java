package com.luv2code.CRUDdemo;

import com.luv2code.CRUDdemo.dao.StudentDAO;
import com.luv2code.CRUDdemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruDdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruDdemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){

		return runner -> {
			//System.out.println("Hello World");
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		//create the student object
		System.out.println("Creating a new student object...");
		Student tempStudent = new Student("Paul", "Doe", "paul@luv2code.com");


		//save the student object
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);

		//display id of the saved student
		System.out.println("Saved student. Generated id: " + tempStudent.getId());



	}

}
