package com.balarinfotech.youtubeclone.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TblComment {
	
	@Id
	private Long comId;
	private String text;
	private Long authorId;
	private Long likeCount;
	private Long disLikeCount;
	public Long getComId() {
		return comId;
	}
	public void setComId(Long comId) {
		this.comId = comId;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Long getAuthorId() {
		return authorId;
	}
	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}
	public Long getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(Long likeCount) {
		this.likeCount = likeCount;
	}
	public Long getDisLikeCount() {
		return disLikeCount;
	}
	public void setDisLikeCount(Long disLikeCount) {
		this.disLikeCount = disLikeCount;
	}
	
	
	

}
