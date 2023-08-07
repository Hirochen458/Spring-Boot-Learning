package com.luv2code.CRUDdemo;

import com.luv2code.CRUDdemo.dao.StudentDAO;
import com.luv2code.CRUDdemo.dao.StudentDAOImpl;
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
			//createStudent(studentDAO);
			//createMultipleStudent(studentDAO);
			readStudent(studentDAO);

		};
	}
	private void readStudent(StudentDAO studentDAO){
		//create a student object
		System.out.println("Creating a new student object...");
		Student tempStudent = new Student("Daffy", "Duck", "daffy@luv2code.com");

		//save the student
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);

		//display if od the saved student
		int theId = tempStudent.getId();
		System.out.println("Saved student. Generated id: "+ theId);

		//retrieve student based pn the id: primary id
		System.out.println("Retrieving student with id: "+ theId);
		Student myStudent= studentDAO.findByID(theId);

		//display student
		System.out.println("Found the student: " + myStudent);

	};

	private void createMultipleStudent(StudentDAO studentDAO) {

		//Create multipleStudent
		System.out.println("Creating a new student object...");
		Student tempStudent1 = new Student("John", "Doe", "john@luv2code.com");
		Student tempStudent2 = new Student("Mary", "Public", "mary@luv2code.com");
		Student tempStudent3 = new Student("Bonite", "Applebum", "bonita@luv2code.com");


		//save the student objects
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

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
