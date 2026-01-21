package com.example.data.API;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public ResponseEntity<List<Employee>> showmessage() {
		List <Employee> emps= empRepo.findAll();
		return ResponseEntity.ok(emps)  ;
	}
	
	@GetMapping("/slist")
	public ResponseEntity<List<Employee>> getList() {
		List<Employee> empList = empRepo.customquery();
		return ResponseEntity.ok(empList);
	}
	
	@GetMapping("/list")
	public List<Employee> getlist() {
		List<Employee> empList = empRepo.customquery();
		return empList;
	}
	
	@PutMapping("/edit/{Id}")
	public ResponseEntity<ApiResponse> editEmployee(@PathVariable int Id  , @RequestBody Employee emp1) {
		Optional<Employee> emp = empRepo.findById(Id);
		Employee oldemp;
		if(emp.isPresent()) {
		 oldemp = emp.get();
		oldemp.setName(emp1.getName());
		oldemp.setExperience(emp1.getExperience());
		oldemp.setFileName(emp1.getFileName());
		Employee updatedemp =  empRepo.save(oldemp);
		ApiResponse<Employee> response = new ApiResponse<>("Successfully edited Card.",true,updatedemp);
		return ResponseEntity.ok( response);
		}else {
			ApiResponse response = new ApiResponse("No Cards Found  in ID : "+Id , false , null);
			return ResponseEntity.ok(response);
		}	
	}
	
	@DeleteMapping("/delete/{Id}")
	public ResponseEntity<ApiResponse> deleteCard(@PathVariable int Id){
	empRepo.deleteById(Id);
	ApiResponse response = new ApiResponse("Successfully deleted Card "+Id , true ,null); //null -> not returning any object 
		return ResponseEntity.ok(response);
	}
}
