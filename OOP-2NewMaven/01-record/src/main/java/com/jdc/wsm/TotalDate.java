package com.jdc.wsm;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class TotalDate {

	public static void main(String[] args) {
		//useCalendar();
		//useFluentMethod();
		useChanges();
	}
	/*static void useCalendar() {
		Calendar c=Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));
		Date d=new Date();
		System.out.println(d);
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		LocalTime lt= LocalTime.now();
		System.out.println(lt);
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		System.out.println(ld.parse("2020-03-15"));
		System.out.println(ld.getYear());
		System.out.println(ld.getDayOfMonth());
		System.out.println(ld.getMonth());
		System.out.println(ld.isLeapYear());
	}*/
	/*static void useFluentMethod() {
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt.getYear());
		System.out.println(ldt.getHour());
		// Chrono Field or Temporal Field
		System.out.println(ldt.get(ChronoField.YEAR));
		System.out.println(ldt.get(ChronoField.YEAR));
		System.out.println(ldt.withYear(2030));
		System.out.println(ldt.withDayOfYear(30));
		//Date  Period
		System.out.println(ldt.plus(Period.ofDays(4)));
		System.out.println(ldt.minus(Period.ofYears(3)));
		//Time Duration
		System.out.println(ldt.plus(Duration.ofHours(1)));		
	}*/
	static void useChanges() {
		LocalDateTime ld=LocalDateTime.now();
		ZonedDateTime zdt=ld.atZone(ZoneId.of("Asia/Yangon"));
		OffsetDateTime odt=ld.atOffset(ZoneOffset.ofHours(3));
		System.out.println(odt);
		//Pattern
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.println(ld.format(dtf));
		
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("hh:mm:ss");
		System.out.println(ld.format(dtf1));
		//localized
		DateTimeFormatter dtf2=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println(ld.format(dtf2));
		//ISO_INSTANT
		DateTimeFormatter dtf3=DateTimeFormatter.ISO_TIME;
		System.out.println(ld.format(dtf3));
		DateTimeFormatter dtf4=DateTimeFormatter.ISO_WEEK_DATE;
		System.out.println(ld.format(dtf4));
	}

}
