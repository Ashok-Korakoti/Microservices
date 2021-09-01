package com.olx.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class RegisterRequest {

	private String username;
	private String password;
	private String firstname;
	private String lastname;
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getFirstname() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getLastname() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
