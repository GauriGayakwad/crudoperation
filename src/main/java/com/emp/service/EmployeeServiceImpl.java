package com.emp.service;

import java.util.List;

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

	@Override
	public Employee getById(Integer empid) {
		Employee e=er.findById(empid).get();
		return e;
	}
	
	@Override
	public List<Employee> getAllData() {
		List<Employee> list=er.findAll();
		return list;
	}

	@Override
	public void deleteById(Integer empid) {
		 er.deleteById(empid);

	}
}
