package com.example.data.API;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DataShow {

	@CrossOrigin("*")
	@GetMapping("/show")
	public String showmessage() {
		return "Hello World";
	}
}
