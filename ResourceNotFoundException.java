package com.hotelService.excepation;

public class ResourceNotFoundException extends RuntimeException{

	public ResourceNotFoundException() {
		super("Resource not Found!!!");
		
	}

	public ResourceNotFoundException(String s) {
		
		super(s);
	}

}
