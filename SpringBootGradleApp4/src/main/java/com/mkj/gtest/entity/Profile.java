package com.mkj.gtest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

@Entity
@Table(name = "FBProfiles")
public class Profile {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int profileId;
	@NotNull(message = "Username cannot be Null")
	@Size(min = 2,message = "Username is not valid, should have more than 2 characters")
	private String fullName;
	private String city;
	private String locations;
	@Email(message = "Not a valid email")
	private String email;
	@PositiveOrZero(message = "Invalid Phone Number")
	@Pattern(regexp = "[0-9]{10}",message = "Phone number is not valid")
	private long phoneNumber;
	private String companyName;
	
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Profile(int profileId, String fullName, String city, String locations, String email, long phoneNumber,
			String companyName) {
		super();
		this.profileId = profileId;
		this.fullName = fullName;
		this.city = city;
		this.locations = locations;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.companyName = companyName;
	}

	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLocations() {
		return locations;
	}

	public void setLocations(String locations) {
		this.locations = locations;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Profile [profileId=" + profileId + ", fullName=" + fullName + ", city=" + city + ", locations="
				+ locations + ", email=" + email + ", phoneNumber=" + phoneNumber + ", companyName=" + companyName
				+ "]";
	}
	
	


}
