package com.jdc.wsm;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

public class D_DequeInterface {
	private Deque <String> deque;
	@Test
	void test() {
		//deque = new ArrayDeque<>();
		deque = new LinkedList<>();		
		add();
		show();
		
	}
	void show() {
		for(String s : deque) {
			System.out.println(s);		
			}
	}
	void add() {
		deque.add("Mg");
		deque.add("John");		
		deque.addFirst("Zaw");
		deque.addLast("Khing");		
		deque.addFirst("Aye");
	}

}
