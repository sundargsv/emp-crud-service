package com.sundar.employee.api;

import com.sundar.employee.api.model.Employee;
import com.sundar.employee.commons.Constants;
import com.sundar.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path = {Constants.API_BASE_CONTEXT_PATH},produces = {MediaType.APPLICATION_JSON_VALUE})
@Slf4j
public class EmployeeApi {

@Autowired
private EmployeeService employeeService ;
	
	//REST mapping
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public Employee createEmployee(@RequestBody Employee emp)
	
	{
		log.info("Creating emp {}", emp.toString());
		return employeeService.add(emp);
	}

	//REST mapping
	@GetMapping
	public Employee testEmployee(){
		return Employee.builder()
				.name("Sundar Gsv")
				.build();
	}
}
	