package com.jdc.wsm;

import com.jdc.wsm.model.Students;
import com.jdc.wsm.model.Users;

public class Main {

	public static void main(String[] args) {
		Students []stu = new Students[2];
		Users use1 = new Users("Ma Ma","Alphbert",30,33.3);
		Users use2 = new Users("Zaw Zaw","Swift",40,33.2);
		stu[0] = new Students("Yangon",1001,use1);
		stu[1] = new Students("Mandalay",1002,use2);
		for(int i=0;i<stu.length;i++) {
			
		}
		

	}
}
