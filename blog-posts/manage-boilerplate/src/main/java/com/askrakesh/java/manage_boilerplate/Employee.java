package com.askrakesh.java.manage_boilerplate;

import java.time.LocalDate;

import lombok.Builder;

@Builder
public class Employee {
	String firstName;
	String lastName;
	LocalDate dateOfBirth;

	public static void main(String[] args) {
		Employee emp = new EmployeeBuilder().firstName("Rakesh")
				.lastName("Kumar")
				.dateOfBirth(LocalDate.now())
				.build();
	}
}
