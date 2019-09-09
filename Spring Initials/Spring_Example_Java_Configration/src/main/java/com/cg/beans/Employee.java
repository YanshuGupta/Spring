package com.cg.beans;

public class Employee {
	private Person person;
	public void display() {
		System.out.println("This is Employee Bean class");
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
}
