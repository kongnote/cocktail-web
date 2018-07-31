package com.cocktail_web.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	//
	// primary key
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable=false, length=50)
	private String userId;
	private String userPassword;
	private String userName;
	private String userEmail;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	public void update(User newUser) {
		this.userName = newUser.getUserName();
		this.userPassword = newUser.getUserPassword();
		this.userEmail = newUser.getUserEmail();
	}
	
}
