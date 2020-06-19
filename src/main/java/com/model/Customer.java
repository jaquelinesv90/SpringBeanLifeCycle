package com.model;

public class Customer {
	 
	private String name;
	private String email;
	private String telephone;
	private boolean active;
     
	public Customer() {}
	
	public Customer(String name, String email, String telephone) {
		this.name = name;
		this.email = email;
		this.telephone = telephone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public void activate() {
		this.active = true;
	}
}
