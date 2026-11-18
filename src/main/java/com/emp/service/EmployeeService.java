package com.emp.service;

import java.util.List;

import com.emp.model.Employee;

public interface EmployeeService {

	public Employee save(Employee e);
	
	public Employee getById(Integer empid);
	
	public List<Employee> getAllData();

	public void deleteById(Integer empid);
}
