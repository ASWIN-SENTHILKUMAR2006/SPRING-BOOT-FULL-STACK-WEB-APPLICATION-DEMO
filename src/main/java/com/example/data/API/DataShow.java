package com.example.data.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.data.API.model.Employee;
import com.example.data.API.repository.EmployeeRepository;

// Since this is an simple Example we didn't use  Separate Controller and Service Packaging Structure
@RestController
public class DataShow {

	
	@Autowired
	EmployeeRepository empRepo;
	
	@CrossOrigin("*")
	@GetMapping("/show")
	public String showmessage() {
		List <Employee> emps= empRepo.findAll();
		String result = emps.toString();
		return  result;
	}
}
