package com.jdc.wsm;
@SuppressWarnings("unused")
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCardExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Alice","Bob");
		System.out.println(list);
		
		List<Integer> list1 = Arrays.asList(13,12,11,5);
		System.out.println(list1);
		

	}
	public static void list(List <?>list) {
		for(Object l: list) {
			System.out.println(l);
		}
		
	}

}
