package com.spring.jdbc.xml.entities;

public class PhonePayTable 
{
	
	private int id;
	private String name;
	private String city;
	private int pin;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "PhonePayTable [id=" + id + ", name=" + name + ", city=" + city + ", pin=" + pin + "]";
	}
	public PhonePayTable(int id, String name, String city, int pin) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.pin = pin;
	}
	public PhonePayTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
