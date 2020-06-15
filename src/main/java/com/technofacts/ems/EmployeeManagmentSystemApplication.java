package com.technofacts.ems;


import com.technofacts.ems.repository.Employee;
import com.technofacts.ems.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

@SpringBootApplication
public class EmployeeManagmentSystemApplication {
	private static final Logger log = LoggerFactory.getLogger(EmployeeManagmentSystemApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagmentSystemApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(EmployeeRepository repository) {
		return (args) -> {
			// save a few Employees
			repository.save(new Employee("Jack", "Bauer"));
			repository.save(new Employee("Chloe", "O'Brian"));
			repository.save(new Employee("Kim", "Bauer"));
			repository.save(new Employee("David", "Palmer"));
			repository.save(new Employee("Michelle", "Dessler"));

			// fetch all Employees
			log.info("Employees found with findAll():");
			log.info("-------------------------------");
			for (Employee Employee : repository.findAll()) {
				log.info(Employee.toString());
			}
			log.info("");

			// fetch an individual Employee by ID
			Optional<Employee> Employee = repository.findById(1L);
			log.info("Employee found with findById(1L):");
			log.info("--------------------------------");
			log.info(Employee.toString());
			log.info("");

		};
	}
}