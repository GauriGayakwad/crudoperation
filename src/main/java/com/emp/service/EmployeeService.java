package com.emp.service;

import com.emp.model.Employee;

public interface EmployeeService {

	public Employee save(Employee e);
	
	public Employee getById(Integer empid);
	
	public void deleteById(Integer empid);
}
