package com.jdc.wsm.model;

public class Users {
	private String name,car;
	private int age;
	private double height;
	public Users(String name,String car,int age,double height) {
		this.name = name;
		this.car = car;
		this.age = age;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	
	public String getCar() {
		return car;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getHeight() {
		return height;
	}
	
	
}
	
