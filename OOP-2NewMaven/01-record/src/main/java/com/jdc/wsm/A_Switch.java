package com.jdc.wsm;

import java.util.HashSet;
import java.util.Set;

public class A_Switch {
	private Set<String>set;

	public static void main(String[] args) {
		
		
	}
	Set<String>getSet(String name){
		return switch(name) {
		case"hash"->new HashSet<>();
		default->null;
		
		};
		
	}
	

}
