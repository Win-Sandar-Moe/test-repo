package com.jdc.wsm;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class TimeZoneAbout {

	public static void main(String[] args) {
		humanToMechine();
		
		

	}
	
	static void humanToMechine() {
		LocalDateTime ldt=LocalDateTime.now();
		Instant l1=ldt.toInstant(ZoneOffset.ofHoursMinutes(4, 12));//minus
		System.out.println(l1);
		
		//ZonedDateTime z=ldt.atZone(ZoneId.of("Asia/Tokyo"));
		//System.out.println(z);//Zone define
		
		ZonedDateTime zdt=ZonedDateTime.ofInstant(l1, ZoneId.of("Asia/Yangon"));
		System.out.println(zdt);
	}

}
