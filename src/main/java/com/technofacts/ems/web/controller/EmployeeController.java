package com.technofacts.ems.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.technofacts.ems.EmployeeManagmentSystemApplication;

@RestController
public class EmployeeController {

	private static final Logger log = LoggerFactory.getLogger(EmployeeManagmentSystemApplication.class);

	@GetMapping("/employee")
    public String list() {
		log.debug("employees");
        return "employees";
    }
}

