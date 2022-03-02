package com.balarinfotech.youtubeclone.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.SdkClientException;

public interface FileService {

	String uploadFile(MultipartFile file) throws AmazonServiceException, SdkClientException, IOException; 
}
