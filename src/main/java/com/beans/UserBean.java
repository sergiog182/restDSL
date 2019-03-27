package com.beans;

import java.util.HashMap;

import org.apache.camel.Header;

import com.jackson.classes.User;

public class UserBean {
	
	public User getUser(@Header("id") String userId) {
		User usuario = new User();
		usuario.setId(userId);
		usuario.setAge(25);
		usuario.setGender("Male");
		usuario.setCountry("CO");
		usuario.setNames("Michael");
		usuario.setLastname("Jackson");
		return usuario;
	}
	
	public User updateUser(User user) {
		user.setNames("Sergio");
		user.setLastname("Gutierrez");
		return user;
	}
	
	public HashMap<String, String> saveUser(User user) {
		HashMap<String, String> response = new HashMap<String, String>();
		response.put("Result", "OK");
		response.put("id", user.getId());
		return response;
	}
	
	public HashMap<String, String> deleteUser(@Header("id") String id) {
		HashMap<String, String> response = new HashMap<String, String>();
		response.put("Result", "OK");
		response.put("id", id);
		return response;
	}
}
