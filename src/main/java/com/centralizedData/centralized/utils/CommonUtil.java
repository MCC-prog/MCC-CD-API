package com.centralizedData.centralized.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.centralizedData.centralized.configuration.ExecutorServiceProvider;
import com.centralizedData.centralized.handler.FileThreadHandler;
import com.centralizedData.centralized.model.user.Role;
import com.centralizedData.centralized.model.user.User;
import com.centralizedData.centralized.repository.UserRepository;
import com.centralizedData.centralized.security.jwt.JwtUserDetails;



@Component
@Service
public class CommonUtil {

	private static final Logger log = LoggerFactory.getLogger(CommonUtil.class);
	
	private ExecutorService executorService = ExecutorServiceProvider.getInstance().getExecutorService();

	@Autowired
	UserRepository userRepository;

	public User gettingUserId(String userName) {
		try {
			User detailsOfUser = userRepository.findByUserName(userName);
			if (detailsOfUser != null)
				return detailsOfUser;
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return null;

	}

	public Integer getUserId(String userName) {
		User userDetail = gettingUserId(userName);
		int userId = userDetail.getUserId();
		return userId;
	}

	public JwtUserDetails getLoggedInUserDetails(){
		Authentication authenticationToken = SecurityContextHolder.getContext().getAuthentication();
		Object principal = authenticationToken.getPrincipal();
		if (principal.getClass() == JwtUserDetails.class) {
			return (JwtUserDetails) principal;
		}
		return  null;

	}
	
	@Transactional
	public Long getLoggedInDepartmentId(Integer userId) {
		User user = userRepository.findByUserId(userId);
		for(Role role : user.getUserRoles() ){
			if(role.getRoleName().equals("HOD")) {
		       return user.getEmployee().getDepartment().getDepartmentId();
			}
		}
		return null;
	}

	public LocalDate convertStringToLocalDate(String dateStr) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		try {
			return LocalDate.parse(dateStr, formatter);
		} catch (DateTimeParseException e) {
			throw new IllegalArgumentException("Invalid date format. Expected dd/MM/yyyy");
		}
	}
	
	public static String convertLocalDateToString(LocalDate localDate) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    return localDate.format(formatter);
	}
	
	
	public Map<String, String> getFileDetails(MultipartFile uploadedFile, String folderPath) {
		Map<String, String> fileDetails = null;
		if (uploadedFile != null && !uploadedFile.isEmpty() && folderPath != null) {
			FileThreadHandler fileThreadHandler = new FileThreadHandler(uploadedFile, folderPath);
			Future<Map<String, String>> future = executorService.submit(fileThreadHandler);
			try {
				fileDetails = future.get();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return fileDetails;
	}

}
