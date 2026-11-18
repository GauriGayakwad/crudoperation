package com.emp.controlller;


import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@GetMapping("/getById/{empid}")
	public Employee getById(@PathVariable Integer empid)
	{
		Employee e=es.getById(empid);
		return e;
	}
	
	@GetMapping("/getAllData")
	public List<Employee> getData(){
		List<Employee>list=es.getAllData();
		return list;
	}
	@DeleteMapping("/deleteById/{empid}")
	public String deleteById(@PathVariable Integer empid)
	{
		es.deleteById(empid);
		return "Record deleted "+empid;

	}
}
