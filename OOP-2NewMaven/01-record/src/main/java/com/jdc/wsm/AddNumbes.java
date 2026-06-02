package com.jdc.wsm;

import java.util.Arrays;

import javax.swing.JOptionPane;
@SuppressWarnings("unused")
public class AddNumbes {

	public static void main(String[] args) {
	int []numbers= {2,3,4,1,5,22,4,0};
	for(int i=0;i<numbers.length;i++) {
		for(int j=0+i;j<numbers.length;j++) {
			if(numbers[i] < numbers[j]) {
				int temp=numbers[i];
				numbers[i]=numbers[j];
				numbers[j]=temp;
				}
		}
	}
	}
		
}










