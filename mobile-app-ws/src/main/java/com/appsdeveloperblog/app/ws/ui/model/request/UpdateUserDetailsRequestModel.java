package com.appsdeveloperblog.app.ws.ui.model.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UpdateUserDetailsRequestModel {
	
	@NotNull(message = "First Name cannot be empty or missing")
	@Size(min = 2, message = "First name minimum two characters")
	private String firstName;

	@NotNull(message = "Last Name cannot be empty or missing")
	@Size(min = 2, message = "Last name minimum two characters")
	private String lastName;

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
}