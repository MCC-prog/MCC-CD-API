package com.centralizedData.centralized.handler;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.springframework.web.multipart.MultipartFile;


public class FileThreadHandler implements Callable<Map<String, String>> {

	private MultipartFile uploadedFile;

	private String folderPath;

	public FileThreadHandler(MultipartFile uploadedFile, String folderPath) {
		this.uploadedFile = uploadedFile;
		this.folderPath = folderPath;
	}

	@Override
	public Map<String, String> call() throws Exception {
		Map<String, String> fileDetails = new HashMap<String, String>();
		try {
			byte[] decodedBytes = uploadedFile.getBytes();
			if (decodedBytes.length < 10)
				return null;
			String fileType = FilenameUtils.getExtension(uploadedFile.getOriginalFilename());
			fileDetails.put("FileSize", String.valueOf(uploadedFile.getSize()));
			fileDetails.put("FileType", fileType);
			File dir = new File(folderPath);
			File file = null;
			file = new File(dir.getAbsolutePath() + File.separator + uploadedFile.getOriginalFilename());
			if (file.exists()) {
				for (int i = 1; i < 100; i++) {
					String fileName = uploadedFile.getOriginalFilename().substring(0,
							uploadedFile.getOriginalFilename().indexOf("."));
					String fileExtn = FilenameUtils.getExtension(uploadedFile.getOriginalFilename());
					file = new File(dir.getAbsolutePath() + File.separator + fileName + "(" + i + ")." + fileExtn);
					if (!file.exists())
						break;
				}
			}
			if (file != null && !file.exists()) {
				FileUtils.writeByteArrayToFile(file, decodedBytes);
				
			
				 //Code for Posix remove this for windows system 
//		     Set<PosixFilePermission>
//			 perms = new HashSet<PosixFilePermission>();
//			 perms.add(PosixFilePermission.OWNER_READ);
//			 perms.add(PosixFilePermission.OWNER_WRITE);
//			 perms.add(PosixFilePermission.GROUP_READ);
//			 perms.add(PosixFilePermission.OTHERS_READ);
//			 Files.setPosixFilePermissions(file.toPath(), perms); 
			 //Posix Code Ends
					 
				fileDetails.put("FileName", file.getName());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fileDetails;
	}

}
