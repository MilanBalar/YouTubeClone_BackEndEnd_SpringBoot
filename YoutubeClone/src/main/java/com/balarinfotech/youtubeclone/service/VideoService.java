package com.balarinfotech.youtubeclone.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.SdkClientException;
import com.balarinfotech.youtubeclone.models.TblVideo;
import com.balarinfotech.youtubeclone.repository.VideoRepo;

@Service
public class VideoService {
	
	@Autowired
	private S3Service s3Service;
	
	@Autowired
	private VideoRepo videoRepo;
	
	public void uploadVideo(MultipartFile file){
		String videoUrl = s3Service.uploadFile(file);
		if (!videoUrl.isEmpty() || videoUrl != null || !videoUrl.equals("")) {
			TblVideo tblVideo=new TblVideo();
			tblVideo.setVideoUrl(videoUrl);
			
			//videoRepo.save(tblVideo);
		}
	}

}
