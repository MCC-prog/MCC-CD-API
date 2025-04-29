package com.centralizedData.centralized.dto;

import org.springframework.web.multipart.MultipartFile;

public class FileUploadRequest {
	
	 private String name;
	    private MultipartFile file;

	    // Getters and Setters
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public MultipartFile getFile() {
	        return file;
	    }

	    public void setFile(MultipartFile file) {
	        this.file = file;
	    }

}
