package com.centralizedData.centralized.dto.admin;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.centralizedData.centralized.utils.CommonUtil;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseUniversityMarksSettingsDto implements Comparable<CourseUniversityMarksSettingsDto>{

	private Long id;
	private String courseId;
	private String universityId;
	private Date markEntryOpenFrom;
	private String markEntryOpenTime;
	private String createdBy;
	private String modifiedBy;
	private Date createdDate;
	private Date lastModifiedDate;
	private Boolean isActive;
	private String deleted;
	private String openFrom;
	private String documentType;
	
	@Autowired
	CommonUtil commonUtil;

	@Override
	public int compareTo(CourseUniversityMarksSettingsDto o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
//	@Override
//	public int compareTo(CourseUniversityMarksSettingsDto o) {
//		Calendar cal1 = Calendar.getInstance();
//		Calendar cal2 = Calendar.getInstance();
//		Date date1 = commonUtil.ConvertStringToDate(this.openFrom);
//		Date date2 = commonUtil.ConvertStringToDate(((CourseUniversityMarksSettingsDto)o).openFrom);
//		cal1.setTime(date1);
//		cal2.setTime(date2);
//		return cal1.after(cal2) ? 1 : cal1.before(cal2) ? -1 : 0;
//	}
}
