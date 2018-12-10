package com.sundar.employee.api.model;



import java.util.Date;

import lombok.Builder;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Component
@Data
@ToString
@Builder
public class Employee {

	private String name;
	private Date doj;
	private Date dob;
	private String address;
	private double salary;
	
	
}
