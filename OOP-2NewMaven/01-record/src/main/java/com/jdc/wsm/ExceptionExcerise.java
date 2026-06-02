package com.jdc.wsm;

public class ExceptionExcerise {
private static final String loginId="admin";
private static final String password="123";
	public static void main(String[] args) {
		login("admin","123");
		

	}
	static void login(String loginId,String password) {
		try{
			if(loginId==null || loginId.isBlank()) {
			throw new MyLoginException("please loginId can't be empty");
			
		}if(password==null || password.isBlank()) {
			throw new MyLoginException("please password can't be empty");
		}if(!loginId.equals(loginId)) {
			throw new MyLoginException("Invalid LoginId!");
		}if(!password.equals(password)) {
			throw new MyLoginException("Invalid password");
		}
		System.out.println("Go To Home page");
	}catch(RuntimeException e) {
		System.out.println(e.getMessage());		}
	}

}
@SuppressWarnings("serial")
class MyLoginException extends RuntimeException{
	public MyLoginException (String message){
		super(message);
	}
}
