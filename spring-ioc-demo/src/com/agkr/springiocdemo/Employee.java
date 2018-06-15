package com.agkr.springiocdemo;

public class Employee {
	private String name;
	private int eid;
	private Address address;
		
	public Employee() {
		super();
		System.out.println("Employee Default Contructer!");
	}

	public Employee(String name, int eid, Address address) {
		super();
		this.name = name;
		this.eid = eid;
		this.address = address;
	}

	// Static Factory method
	public static Employee createEmployee()	{
		System.out.println("Static Factory Method");
		return new Employee();
	}
	
	// Instance Factory method
	public Address createAddress()	{
		System.out.println("Non Static Factory Method");
		System.out.println(address);
		return address;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", eid=" + eid + ", address=" + address + "]";
	}
	
	
	

}
