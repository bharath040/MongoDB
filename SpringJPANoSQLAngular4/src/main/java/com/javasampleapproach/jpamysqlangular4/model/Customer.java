package com.javasampleapproach.jpamysqlangular4.model;

import java.io.Serializable;



import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "customer")
public class Customer implements Serializable {

	

	private String firstName;
	private String lastName;

	protected Customer() {
	}

	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return String.format("Customer[id=%d, firstName='%s', lastName='%s']", firstName, lastName);
	}
}