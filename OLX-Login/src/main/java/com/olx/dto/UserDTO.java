package com.olx.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserDTO {
	private String username;
	private String firstName;
	private String lastName;
	private String jwtToken;
	public void setJwtToken(String generateToken) {
		// TODO Auto-generated method stub
		
	}
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setFirstName(String firstName2) {
		// TODO Auto-generated method stub
		
	}
	public void setLastName(String lastName2) {
		// TODO Auto-generated method stub
		
	}
	public void setUsername(String userName2) {
		// TODO Auto-generated method stub
		
	}
}
