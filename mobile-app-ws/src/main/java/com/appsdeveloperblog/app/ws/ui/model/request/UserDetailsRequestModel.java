package com.appsdeveloperblog.app.ws.ui.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDetailsRequestModel {

	@NotNull(message = "First Name cannot be empty or missing")
	@Size(min=2, message="First name minimum two characters")
	private String firstName;
	
	@NotNull(message = "Last Name cannot be empty or missing")
	@Size(min=2, message="Last name minimum two characters")
	private String lastName;
	
	@NotNull(message = "Email cannot be empty or missing")
	@Email
	private String email;
	
	@NotNull(message = "Password cannot be empty or missing")
	@Size(min = 8,max = 16,message = "Password must be minimum 6 chars and max 18 chars")
	private String password;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
