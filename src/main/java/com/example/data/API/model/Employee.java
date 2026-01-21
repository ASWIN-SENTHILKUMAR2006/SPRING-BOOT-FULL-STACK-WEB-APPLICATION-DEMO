package com.example.data.API.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="emp_id")
	private Integer  ID;
	
	@Column(name="emp_name",nullable=false,length=75)
	private String Name;
	@Column(name="experience_years",nullable=false)
	private Integer Experience;
	
	@Column(name="file_name",nullable=false)
	private String FileName;
	
	
}
