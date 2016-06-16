package com.cog.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	int houseNumber;
	String locality;
	String city;
	public Address(int houseNumber, String locality, String city) {
		super();
		this.houseNumber = houseNumber;
		this.locality = locality;
		this.city = city;
	}
	
	public Address(){
		
	}
}
