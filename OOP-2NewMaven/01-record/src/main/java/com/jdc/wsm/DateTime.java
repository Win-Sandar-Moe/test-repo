package com.jdc.wsm;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoField;

public class DateTime {

	public static void main(String[] args) {
		LocalDateTime d=LocalDateTime.now();
		System.out.println(d);
		System.out.println(d.getYear());
		System.out.println(d.getMonth());
		System.out.println(d.get(ChronoField.YEAR));
		System.out.println(d.get(ChronoField.MONTH_OF_YEAR));
		System.out.println(d.withYear(2020));
		System.out.println(d.minusMonths(2));
		System.out.println(d.plusYears(5));
		System.out.println(d.with(LocalDate.parse("2020-04-20")));
		System.out.println(d.with(ChronoField.MONTH_OF_YEAR,3));
		System.out.println(d.get(ChronoField.DAY_OF_MONTH));
		System.out.println(d.plus(Period.ofDays(2)));
		System.out.println(d.minus(Period.ofMonths(2)));
		System.out.println(d.minus(Duration.ofHours(2)));
		System.out.println(d.plus(Duration.ofMinutes(35)));
		System.out.println(d.with(ChronoField.MONTH_OF_YEAR,3));

		

	}

}
