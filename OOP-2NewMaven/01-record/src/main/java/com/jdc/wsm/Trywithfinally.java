package com.jdc.wsm;

import java.awt.FontFormatException;
import java.io.File;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Trywithfinally{
	public static void main(String[]args) {
		useTryWithFinally();
		
	}
	static void  useTryWithFinally() {
		try {
			System.out.println("Before invoking check");
			System.out.println("wieo");
			System.out.println("After invoking check");
			withChecked("Font");
			withUnChecked();
			
			
			
		}catch(RuntimeException|FontFormatException e){
			System.out.println("Catch block process");
			
		}finally {
			System.out.println("Success");
		}
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
