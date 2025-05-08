package com.centralizedData.centralized.dto.curriculum;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.centralizedData.centralized.model.curriculum.ValueAddedCourse;
import com.centralizedData.centralized.utils.CommonUtil;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ValueAddedCourseResponseDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2133696210234303527L;

	private Long valueAddedCourseId;
	private Integer academicYear;
	private Long streamId;
	private String streamName;
	private Long departmentId;
	private String departmentName;
	private String studentName;
	private Integer registerNo;
	private String courseTitle;
	private Integer noOfStudentsEnrolled;
	private Integer noOfStudentsCompleted;
	private String startDate;
	private String endDate;
	private String resourcePerson;
	private String organization;
	private Integer noOfCredits;
	private Map<String, String> documents;

	public static ValueAddedCourseResponseDto fromValueAddedCourse(ValueAddedCourse valueAddedCourse) {
		ValueAddedCourseResponseDto responseDto = new ValueAddedCourseResponseDto();

		responseDto.setValueAddedCourseId(valueAddedCourse.getId());
		responseDto.setAcademicYear(valueAddedCourse.getAcademicYear());
		responseDto.setRegisterNo(valueAddedCourse.getRegisterNo() != null ? 
				Integer.parseInt(valueAddedCourse.getRegisterNo()) : null);
		responseDto.setStudentName(valueAddedCourse.getStudentName());
		responseDto.setCourseTitle(valueAddedCourse.getCourseTitle());
		responseDto.setNoOfStudentsEnrolled(valueAddedCourse.getStudentsEnrolled());
		responseDto.setNoOfStudentsCompleted(valueAddedCourse.getStudentsCompleted());
		responseDto.setStartDate(CommonUtil.convertLocalDateToString(valueAddedCourse.getStartDate()));
		responseDto.setEndDate(CommonUtil.convertLocalDateToString(valueAddedCourse.getEndDate()));
		responseDto.setResourcePerson(valueAddedCourse.getResoursePerson());
		responseDto.setOrganization(valueAddedCourse.getOrganization());
		responseDto.setNoOfCredits(valueAddedCourse.getNoOfCredits());

		if (valueAddedCourse.getStream() != null) {
			responseDto.setStreamId(valueAddedCourse.getStream().getId());
			responseDto.setStreamName(valueAddedCourse.getStream().getName());
		}
		if (valueAddedCourse.getDepartment() != null) {
			responseDto.setDepartmentId(valueAddedCourse.getDepartment().getDepartmentId());
			responseDto.setDepartmentName(valueAddedCourse.getDepartment().getDepartmentName());
		}

		Map<String, String> documents = new HashMap<>();
		valueAddedCourse.getValueAddedCourseDocuments().forEach(doc -> {
			if (doc.getIsActive()) {
				documents.put(doc.getDocType(), doc.getFileName());
			}
		});
		responseDto.setDocuments(documents);
		return responseDto;
	}

	
}
