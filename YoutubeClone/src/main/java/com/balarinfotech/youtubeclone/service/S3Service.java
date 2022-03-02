package com.balarinfotech.youtubeclone.service;

import java.io.IOException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.SdkClientException;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;

@Service
public class S3Service implements FileService {
	
	@Autowired
	private AmazonS3Client amazonS3Client;

	public S3Service(AmazonS3Client amazonS3Client) {
		super();
		this.setAmazonS3Client(amazonS3Client);
	}

	public AmazonS3Client getAmazonS3Client() {
		return amazonS3Client;
	}

	public void setAmazonS3Client(AmazonS3Client amazonS3Client) {
		this.amazonS3Client = amazonS3Client;
	}
	
	@Override
	public String uploadFile(MultipartFile file) {
		
		String filenameExtension = StringUtils.getFilenameExtension(file.getOriginalFilename());
		String key = UUID.randomUUID().toString() +"."+ filenameExtension;
		
		var metadata=new ObjectMetadata();
		metadata.setContentLength(file.getSize());
		metadata.setContentType(file.getContentType());
		
		try {
			amazonS3Client.putObject("milanbalarbucket",key,file.getInputStream(),metadata);
			amazonS3Client.setObjectAcl("milanbalarbucket",key,CannedAccessControlList.PublicRead);
		} catch (SdkClientException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		String resourceUrl = amazonS3Client.getResourceUrl("milanbalarbucket",key);
		return resourceUrl != null || !resourceUrl.isEmpty() ? resourceUrl : "";
	}


}
