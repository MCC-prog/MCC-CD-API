package com.centralizedData.centralized.utils;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import lombok.Getter;
@Getter
public class ByteArrayStreamInfo{
	
	  private String contentType;
	    private byte[] data;
	    
	    public ByteArrayStreamInfo(String contentType, byte[] data) {
	        this.contentType = contentType;
	        this.data = data;
	    }

	    public InputStream getInputStream() {
	        return new ByteArrayInputStream(data);
	    }

}

