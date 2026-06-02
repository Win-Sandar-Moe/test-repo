package com.jdc.wsm;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
@SuppressWarnings("unused")

public class B_LocalDate {

	public static void main(String[] args) {
		LocalDate d=LocalDate.now();
		System.out.println(d.getYear());
		System.out.println(d.getMonth());
		System.out.println(d.getDayOfMonth());
		System.out.println(d.getDayOfWeek());
		System.out.println(d.of(2020, 3, 24));
		System.out.println(d.parse("2030-10-01"));
		System.out.println(d.isLeapYear());
	Date d1=new Date();
	
	}
	

}
