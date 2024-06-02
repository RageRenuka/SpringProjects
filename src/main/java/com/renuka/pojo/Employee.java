package com.renuka.pojo;

import java.util.List;

public class Employee {
	private int empId;
	private String empName;
	private double salarey;
	private Address address;
	private List<Long> mobilecontact;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalarey() {
		return salarey;
	}
	public void setSalarey(double salarey) {
		this.salarey = salarey;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public List<Long> getMobilecontact() {
		return mobilecontact;
	}
	public void setMobilecontact(List<Long> mobilecontact) {
		this.mobilecontact = mobilecontact;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salarey=" + salarey + ", address=" + address
				+ ", mobilecontact=" + mobilecontact + "]";
	}
	
	
	
	
	

}
