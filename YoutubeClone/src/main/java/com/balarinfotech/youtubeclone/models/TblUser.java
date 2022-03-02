package com.balarinfotech.youtubeclone.models;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class TblUser {
	
	@Id
	private Long userId;
	private String firstName;
	private String lastName;
	private String fullName;
	private String email;
	private Long subscribedToUsers;
	private Long subscribers;
	private String videoHistory;
	private Long likedVideo;
	private int dislikedVideo;
	
    //relation
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "tblUser")
	@JsonIgnore
	private Set<TblVideo> tblVideo=new HashSet<>();

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getSubscribedToUsers() {
		return subscribedToUsers;
	}

	public void setSubscribedToUsers(Long subscribedToUsers) {
		this.subscribedToUsers = subscribedToUsers;
	}

	public Long getSubscribers() {
		return subscribers;
	}

	public void setSubscribers(Long subscribers) {
		this.subscribers = subscribers;
	}

	public String getVideoHistory() {
		return videoHistory;
	}

	public void setVideoHistory(String videoHistory) {
		this.videoHistory = videoHistory;
	}

	public Long getLikedVideo() {
		return likedVideo;
	}

	public void setLikedVideo(Long likedVideo) {
		this.likedVideo = likedVideo;
	}

	public int getDislikedVideo() {
		return dislikedVideo;
	}

	public void setDislikedVideo(int dislikedVideo) {
		this.dislikedVideo = dislikedVideo;
	}

	public Set<TblVideo> getTblVideo() {
		return tblVideo;
	}

	public void setTblVideo(Set<TblVideo> tblVideo) {
		this.tblVideo = tblVideo;
	}
	
	
}
