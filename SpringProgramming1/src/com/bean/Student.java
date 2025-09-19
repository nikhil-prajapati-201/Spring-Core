package com.bean;

public class Student {

	private int id;
	private int rollno;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void show() {
		
		System.out.println("Id: "+id);
		System.out.println("Roll No: "+rollno);
		System.out.println("Name: "+name);
	}
	
}
