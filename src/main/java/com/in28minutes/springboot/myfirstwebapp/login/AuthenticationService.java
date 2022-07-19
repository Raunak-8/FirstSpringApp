package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		boolean isValidUsername = username.equalsIgnoreCase("Raunak");
		boolean isValidPassword = password.equalsIgnoreCase("qwerty");
		
		return (isValidUsername && isValidPassword);
	}

}
