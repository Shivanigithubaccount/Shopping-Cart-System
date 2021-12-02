package com.User.Models;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

public class UserModel {
	
	@Id
	private int userID;
	private String userFullName;
	private String emailID;
	private Long mobileNo;
	private String gender;
	private LocalDate dateOfBirth;
	private String role;
	private String password;
	
	
	
	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserFullName() {
		return userFullName;
	}

	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}


	public UserModel(int userID, String userFullName, String emailID, Long mobileNo, String gender,
			LocalDate dateOfBirth, String role, String password) {
		super();
		this.userID = userID;
		this.userFullName = userFullName;
		this.emailID = emailID;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.role = role;
		this.password = password;
	}

	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}	

	
}
