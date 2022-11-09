package com.mkj.gtest.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Entity
@Table(name="FBUsers")
public class AppUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;


	private String username;
	private String password;
	private String role;  // admin , tech-user , customer , corporates 
     
	
	

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "profile")
	private Profile userProfile;
	

	@ElementCollection
	@CollectionTable(name = "FBUser_Hobbies")
	private List<String> hobbies;
	

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "userid")
	private List<Post> allPosts;


	
	public AppUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppUser(String username, String password, String role) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	

	public Profile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(Profile userProfile) {
		this.userProfile = userProfile;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public List<Post> getAllPosts() {
		return allPosts;
	}

	public void setAllPosts(List<Post> allPosts) {
		this.allPosts = allPosts;
	}

	@Override
	public String toString() {
		return "AppUser [userId=" + userId + ", username=" + username + ", password=" + password + ", role=" + role
				+ ", userProfile=" + userProfile + ", hobbies=" + hobbies + "]";
	}

	
	}
	


