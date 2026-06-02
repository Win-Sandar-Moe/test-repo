package com.jdc.wsm;

import java.awt.FontFormatException;

public class Throw {

	public static void main(String[] args) {
		try {
			methodOne();
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}
	static void methodOne() throws Exception {
		System.out.println("Use method one");
		methodWithUnchecked();
		methodWithChecked();
		
	}
	static void methodWithUnchecked() throws Exception {
		System.out.println("Use Unchecked");
		withUnChecked();
		
	}
	static void methodWithChecked()throws Exception {
		System.out.println("Use Checked");
		withChecked("font");
		
	}
	static void withChecked(String font) throws FontFormatException {
		System.out.println("Starting WithChecked method");
		throw new FontFormatException(font);
	}
	static void withUnChecked() throws RuntimeException{
		System.out.println("Starting WithUnChecked method");
		throw new RuntimeException();
	}

}
