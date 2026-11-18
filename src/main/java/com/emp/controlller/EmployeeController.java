package com.emp.controlller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emp.model.Employee;
import com.emp.service.EmployeeService;

@RestController
public class EmployeeController {
	
	EmployeeService es;
	
	public EmployeeController(EmployeeService es){
		this.es=es;
	}
	
	@PostMapping("/save")
	public Employee saveData(@RequestBody Employee e) {
		e =es.save(e);
		return e;
	}

}
