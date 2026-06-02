package com.jdc.wsm;

import java.util.Calendar;
import java.util.Date;

public class A_Calendar {
	public static void main(String[]args) {
		Date d=new Date();
		LocalDate ld=new LocalDate();
		System.out.println(ld);
		System.out.println(d);
		useCalendar();
		
	}
	static void useCalendar() {
		Calendar c=Calendar.getInstance();
		System.out.println(c.getTime());
	System.out.println(c.get(Calendar.YEAR));
		
	}

}
