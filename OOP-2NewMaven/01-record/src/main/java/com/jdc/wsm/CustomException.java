package com.jdc.wsm;

public class CustomException {

	public static void main(String[] args) {
		try{
			useCustomException(" ");
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
			
		}
		
	}
	static void useCustomException(String value) {
		if(value==null||value.isEmpty()) {
			throw new MyCustomException("Invalid");
		}
		System.out.println("Message:::"+value);
	}
}
@SuppressWarnings("serial")
class MyCustomException extends RuntimeException{
	public MyCustomException (String message) {
		super(message);
	}
}