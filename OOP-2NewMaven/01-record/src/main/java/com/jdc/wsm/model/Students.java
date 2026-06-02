package com.jdc.wsm.model;

public class Students {
	private String city;
	private int StudentId;
	private Users user;
	public Students(String city,int StudentId,Users user) {
		this.city = city;
		this.StudentId = StudentId;
		this.user = user;
	}
	public String getCity() {
		return city;
	}
	public int getStudentId() {
		return StudentId;
	}
	public Users getUser() {
		return user;
	}

}
