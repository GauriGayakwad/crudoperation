package com.emp.service;

import org.springframework.stereotype.Service;

import com.emp.model.Employee;
import com.emp.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	EmployeeRepository er;

	public EmployeeServiceImpl(EmployeeRepository er) {
		this.er = er;
	}

	public Employee save(Employee e) {
		er.save(e);
		return e;
	}
}
