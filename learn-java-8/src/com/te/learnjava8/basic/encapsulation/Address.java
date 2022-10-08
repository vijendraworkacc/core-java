package com.te.learnjava8.basic.encapsulation;

public class Address {
	private String streetNo;
	private String houseNo;
	private String city;
	private String state;
	private String country;

	public Address() {
		super();
	}

	public Address(String streetNo, String houseNo, String city, String state, String country) {
		super();
		this.streetNo = streetNo;
		this.houseNo = houseNo;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public String getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
