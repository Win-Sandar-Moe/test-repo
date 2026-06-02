package com.jdc.wsm;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.jupiter.api.Test;

public class E_QueueInterface {
	private Queue<Integer> queue;
	@Test
	void task() {
		queue = new LinkedList<>();
		add();
		show();
		
	}
	
	
	
	void add() {
		queue.add(1);
		queue.add(50);
		queue.add(10);
		queue.add(30);
		queue.offer(302);
		
	}
	void show() {
		for(int s : queue) {
			System.out.println(s);
		}
	}

}
