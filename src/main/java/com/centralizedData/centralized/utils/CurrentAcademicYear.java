package com.centralizedData.centralized.utils;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.centralizedData.centralized.model.admin.AcademicYear;
import com.centralizedData.centralized.repository.AcademicYearRepository;

@Component
@Service
public class CurrentAcademicYear {
	
	@Autowired
	AcademicYearRepository academicYearRepository;
	
	 public int getAcademicyear() throws Exception
		{
			
			 int year=0; 
			
			List<AcademicYear> yearList = academicYearRepository.findByIsActiveOrderByYearDesc(true);
			       if(yearList!=null){
		  
		        for (AcademicYear attendanceAcademicYear: yearList) {
		        	
					if(attendanceAcademicYear.getIsCurrent()!=null && attendanceAcademicYear.getIsCurrent()){
						year=attendanceAcademicYear.getYear();
					}
				}
			       }	
		
		 return year;
		 }

}
