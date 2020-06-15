package com.technofacts.ems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technofacts.ems.repository.Employee;
import com.technofacts.ems.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private EmployeeRepository employeeRespository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRespository) {
        this.employeeRespository = employeeRespository;
    }

    public List<Employee> findAll() {
		return employeeRespository.findAll();
    }

    public Optional<Employee> findById(Long id) {
        return employeeRespository.findById(id);
    }

    public Employee save(Employee employee) {
        return employeeRespository.save(employee);
    }

    public void deleteById(Long id) {
    	employeeRespository.deleteById(id);
	}

}
