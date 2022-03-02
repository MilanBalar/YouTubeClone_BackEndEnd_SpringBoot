package com.balarinfotech.youtubeclone.models;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TblVideo {
	
	@Id
	private Long vid;
	private String title;
	private String description;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "userId")
	private TblUser tblUser;
	
	private Long likes;
	private Long disLikes;
	private String tags;
	private String videoUrl;
	private VideoStatus VideoStatus;
	private Long viewCount;
	private String thumbnailUrl;
	
	/* private List<TblComment> tblComment; */

	public Long getVid() {
		return vid;
	}

	public void setVid(Long vid) {
		this.vid = vid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public TblUser getTblUser() {
		return tblUser;
	}

	public void setTblUser(TblUser tblUser) {
		this.tblUser = tblUser;
	}

	public Long getLikes() {
		return likes;
	}

	public void setLikes(Long likes) {
		this.likes = likes;
	}

	public Long getDisLikes() {
		return disLikes;
	}

	public void setDisLikes(Long disLikes) {
		this.disLikes = disLikes;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public VideoStatus getVideoStatus() {
		return VideoStatus;
	}

	public void setVideoStatus(VideoStatus videoStatus) {
		VideoStatus = videoStatus;
	}

	public Long getViewCount() {
		return viewCount;
	}

	public void setViewCount(Long viewCount) {
		this.viewCount = viewCount;
	}

	public String getThumbnailUrl() {
		return thumbnailUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

	/*
	 * public List<TblComment> getTblComment() { return tblComment; }
	 * 
	 * public void setTblComment(List<TblComment> tblComment) { this.tblComment =
	 * tblComment; }
	 */
	
	
	
	
	

}
