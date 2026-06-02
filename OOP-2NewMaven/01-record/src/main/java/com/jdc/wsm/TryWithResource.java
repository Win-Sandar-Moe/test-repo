package com.jdc.wsm;

import java.awt.FontFormatException;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;
@SuppressWarnings("unused")
public class TryWithResource{
	public static void main(String[]args) {
		useTryWithResource();
		
	}
	class Scan implements AutoCloseable{
		@Override
		public void close() {
			
		}
	}
	static void useTryWithResource() {
		try(Scanner sc=new Scanner(System.in);
				Scan s=new Scan()) {
			System.out.println("Before invoking check");
			withUnChecked();
			
			System.out.println("wieo");
			System.out.println("After invoking check");
			withChecked("Font");
			
			
		}catch(RuntimeException|FontFormatException e){
			System.out.println("Catch block process");
			
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
