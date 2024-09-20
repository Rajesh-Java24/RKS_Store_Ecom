package com.ecom.Shopping_Cart.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class UserDtls {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	
	private String name;
	
	private String mobileNumber;
	
	private String email;
	
	private String address;
	
	private String city;
	
	private String state;
	
	private String pincode;
	
	private String password;
	
	private String profileimage;
	
	private String role;
	
	private Boolean isEnable;
	
	private Boolean accountNonLocked;
	
	private Integer failedAttempt;
	
	private Date lockTime;
	
	private String resetToken;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getPincode() {
		return pincode;
	}

	public String getPassword() {
		return password;
	}

	public String getProfileimage() {
		return profileimage;
	}

	public String getRole() {
		return role;
	}

	public Boolean getIsEnable() {
		return isEnable;
	}

	public Boolean getAccountNonLocked() {
		return accountNonLocked;
	}

	public Integer getFailedAttempt() {
		return failedAttempt;
	}

	public Date getLockTime() {
		return lockTime;
	}

	public String getResetToken() {
		return resetToken;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setProfileimage(String profileimage) {
		this.profileimage = profileimage;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setIsEnable(Boolean isEnable) {
		this.isEnable = isEnable;
	}

	public void setAccountNonLocked(Boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}

	public void setFailedAttempt(Integer failedAttempt) {
		this.failedAttempt = failedAttempt;
	}

	public void setLockTime(Date lockTime) {
		this.lockTime = lockTime;
	}

	public void setResetToken(String resetToken) {
		this.resetToken = resetToken;
	}

	
}
