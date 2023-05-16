package com.ehsan.cruddemo;

import com.ehsan.cruddemo.DAO.StudentDAO;
import com.ehsan.cruddemo.DAO.StudentDAOImpl;
import com.ehsan.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			creatStudent(studentDAO);
		};
	}

	private void creatStudent(StudentDAO studentDAO) {
		//create the student obj

		System.out.println("creating nes student obj...");
		Student tempStudent = new Student("Ehsan", "Rezazadeh", "Ehsan@NRDC.com");

		//save student obj
		System.out.println("saving...");
		studentDAO.save(tempStudent);

		//display id of saved student
		System.out.println("saved student. generated id:" + tempStudent.getId());
	}

}

















