package com.mkj.gtest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "FBPost")
public class Post {

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int postid;
	private String description;
	private String date;
	private int likes;
	private int dislikes;
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Post(int postid, String description, String date, int likes, int dislikes) {
		super();
		this.postid = postid;
		this.description = description;
		this.date = date;
		this.likes = likes;
		this.dislikes = dislikes;
	}
	public int getPostid() {
		return postid;
	}
	public void setPostid(int postid) {
		this.postid = postid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public int getDislikes() {
		return dislikes;
	}
	public void setDislikes(int dislikes) {
		this.dislikes = dislikes;
	}
	@Override
	public String toString() {
		return "Post [postid=" + postid + ", description=" + description + ", date=" + date + ", likes=" + likes
				+ ", dislikes=" + dislikes + "]";
	}
	
	
	
	
}
