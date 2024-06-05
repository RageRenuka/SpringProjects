package com.renuka.pojo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	
	private int sid;
	private String Name;
	
	private List<Long> mobileContact;
	private Set<String> subjects;
	private Map<String,Integer> marks; 
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
	public List<Long> getMobileContact() {
		return mobileContact;
	}
	public void setMobileContact(List<Long> mobileContact) {
		this.mobileContact = mobileContact;
	}
	public Set<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(Set<String> subjects) {
		this.subjects = subjects;
	}
	public Map<String, Integer> getMarks() {
		return marks;
	}
	public void setMarks(Map<String, Integer> marks) {
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
		return "Student [sid=" + sid + ", Name=" + Name + ", mobileContact=" + mobileContact + ", subjects=" + subjects
				+ ", marks=" + marks + ", address=" + address + "]";
	}
	
	
	
	
	
	

}
