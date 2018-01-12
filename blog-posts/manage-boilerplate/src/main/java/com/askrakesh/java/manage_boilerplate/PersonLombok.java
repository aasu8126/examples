package com.askrakesh.java.manage_boilerplate;

import java.time.LocalDate;

import lombok.Data;

@Data
public class PersonLombok {
	String firstName;
	String lastName;
	LocalDate dateOfBirth;
}
