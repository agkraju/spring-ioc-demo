package com.agkr.springiocdemo;

public class Employee {
	private String name;
	private int eid;
	private Address address;
	private Address2 address2;
	
	public class Address2 {
		
		private String state;


		public Address2(String state) {
			super();
			System.out.println("Address2 Constructor");
			this.state = state;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		@Override
		public String toString() {
			return "Address2 [state=" + state + "]";
		}
		
	}
	
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

	
	public Address2 getAddress2() {
		return address2;
	}

	public void setAddress2(Address2 address2) {
		this.address2 = address2;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", eid=" + eid + ", address=" + address + ", address2=" + address2 + "]";
	}
	
	
	

}
