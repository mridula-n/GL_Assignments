package com.greatlearning.oopsAssignments;

public class Employee {
	String firstName;
	String lastName;
	String department;
//using getter setter for encapsulation
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
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

	Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
}