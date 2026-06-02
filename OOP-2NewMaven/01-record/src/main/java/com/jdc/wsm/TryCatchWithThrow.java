package com.jdc.wsm;

import java.awt.FontFormatException;

public class TryCatchWithThrow {

	public static void main(String[] args) {
		useChecked();
		

	}
	static void useChecked() {
		try {
			withChecked("checked");
		} catch (FontFormatException e) {
			e.printStackTrace();
		}
	}
	static void withChecked(String font) throws FontFormatException {
		System.out.println("Starting WithChecked method");
		throw new FontFormatException(font);
	}
}
