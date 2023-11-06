package com.tu.TestApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(TestApplication.class, args);
		
		Student stud=context.getBean(Student.class);
		
		stud.Show();
		Student stud1=context.getBean(Student.class);
		
		stud1.Show();
		
		System.out.println("test application new");
	}

}
