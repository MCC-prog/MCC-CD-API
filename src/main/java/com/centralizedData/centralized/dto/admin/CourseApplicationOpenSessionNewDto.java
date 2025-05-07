package com.centralizedData.centralized.dto.admin;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.centralizedData.centralized.model.admin.Courses;
import com.centralizedData.centralized.utils.CommonUtil;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseApplicationOpenSessionNewDto implements Comparable<CourseApplicationOpenSessionNewDto>{
	
	private long id;
	private Courses courseId;
	private Integer sessionNo;
	private String openFrom;
	private String openTo;
	private String messageBeforeFromDate;
	private String messageAfterToDate;
	private String deleted;
	
	@Autowired
	CommonUtil commonUtil;

	@Override
	public int compareTo(CourseApplicationOpenSessionNewDto o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
//	@Override
//	public int compareTo(CourseApplicationOpenSessionNewDto o) {
//		Calendar cal1 = Calendar.getInstance();
//		Calendar cal2 = Calendar.getInstance();
//		Date date1 =commonUtil.ConvertStringToDate(this.openFrom);
//		Date date2 =  commonUtil.ConvertStringToDate(((CourseApplicationOpenSessionNewDto)o).openFrom);
//		cal1.setTime(date1);
//		cal2.setTime(date2);
//		return cal1.after(cal2) ? 1 : cal1.before(cal2) ? -1 : 0;
//	}
	

}
