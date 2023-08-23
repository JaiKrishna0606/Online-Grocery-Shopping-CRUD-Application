package com.example.demo.Model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="UserDetails")
public class UserDetails {
	private String name;
	private String email;
	@Id
	private long phoneno;
	private String address;
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
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public UserDetails(String name, String email, long phoneno, String address) {
		super();
		this.name = name;
		this.email = email;
		this.phoneno = phoneno;
		this.address = address;
	}
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
}
