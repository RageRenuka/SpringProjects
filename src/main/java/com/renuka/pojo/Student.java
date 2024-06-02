package com.renuka.pojo;

public class Student {
	
	private int sid;
	private String Name;
	private double marks;
	private Address address;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", Name=" + Name + ", marks=" + marks + ", address=" + address + "]";
	}
	
	

}
