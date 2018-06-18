package com.agkr.springiocdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Address {
	private String state;
	private String city;
	private int pinCode;
	
	private Employee employee;
		
	public Address(Employee employee) {
		super();
		this.employee = employee;
		System.out.println("Employee Default Contructer!");
	}

	public Address() {
		super();
		System.out.println("Address Default Contructer!");
	}
	
	public Address(String state, String city, int pinCode) {
		super();
		this.state = state;
		this.city = city;
		this.pinCode = pinCode;
		System.out.println("Address Default Contructer!");
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	@PreDestroy
	public String getCity() {
		System.out.println("City");
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public int getPinCode() {
		return pinCode;
	}
	
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	
	//public Employee getEmployee() {
		//return employee;
	//}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pinCode=" + pinCode + "]";
	}

}
