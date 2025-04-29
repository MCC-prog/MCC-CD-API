package com.centralizedData.centralized.utils;

import java.io.IOException;
import java.util.Properties;

import org.springframework.stereotype.Component;

public class PropertiesUtil {

	public static Properties getPropertiesFile(String theFileName) {

		Properties properties = new Properties();
		try {
			properties.load(PropertiesUtil.class
					.getResourceAsStream(theFileName));
		}catch(IOException e) {
			e.printStackTrace();
			throw new RuntimeException("No file Found the name:::" + theFileName);
		}
		return properties;
	}
}
