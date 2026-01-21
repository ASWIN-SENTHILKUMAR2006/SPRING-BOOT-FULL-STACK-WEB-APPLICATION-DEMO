package com.example.data.API.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.data.API.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

	
	@Query(value = "Select  * FROM employee  where experience_years > 5 ",nativeQuery = true)
	public List<Employee> customquery();
}

