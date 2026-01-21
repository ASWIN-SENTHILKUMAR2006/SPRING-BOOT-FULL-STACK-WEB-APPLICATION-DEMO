package com.example.data.API;

public class ApiResponse<T> {

	private String message;
	private boolean success ;
	private T data;
	
	public ApiResponse(String message ,  boolean success , T data) {
		this.message = message;
		this.success = success;
		this.data = data;
	}
	
	
}
