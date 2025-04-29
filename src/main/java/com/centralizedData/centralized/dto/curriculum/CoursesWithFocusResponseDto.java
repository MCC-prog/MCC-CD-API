package com.centralizedData.centralized.dto.curriculum;

import java.util.HashMap;
import java.util.Map;

import com.centralizedData.centralized.model.curriculum.CoursesWithFocus;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class CoursesWithFocusResponseDto extends CoursesWithFocusDto {
	
	private String streamName;
    private String departmentName;
    private String programTypeName;
    private String programName;
    private Map<Long, String> courses;
    private Map<String, String> documents;
	
    public static CoursesWithFocusResponseDto fromCoursesWithFocus(CoursesWithFocus coursesWithFocus) {
    	CoursesWithFocusResponseDto responseDto = new  CoursesWithFocusResponseDto();
    	responseDto.setCoursesWithFocusId(coursesWithFocus.getId());
    	responseDto.setAcademicYear(coursesWithFocus.getAcademicYear());
    	responseDto.setSemType(coursesWithFocus.getSemType());
    	responseDto.setSemNumber(coursesWithFocus.getSemNumber());
    	responseDto.setStreamId(coursesWithFocus.getEmpStream().getId());
    	responseDto.setStreamName(coursesWithFocus.getEmpStream().getName());
    	responseDto.setDepartmentId(coursesWithFocus.getDepartment().getDepartmentId());
    	responseDto.setDepartmentName(coursesWithFocus.getDepartment().getDepartmentName());
    	responseDto.setProgramTypeId(coursesWithFocus.getProgramType().getId());
    	responseDto.setProgramTypeName(coursesWithFocus.getProgramType().getName());
    	responseDto.setProgramId(coursesWithFocus.getProgram().getId());
    	responseDto.setProgramName(coursesWithFocus.getProgram().getName());
    	responseDto.setFocusArea(coursesWithFocus.getFocusArea());
    	responseDto.setSubjectTittle(coursesWithFocus.getSubjectTittle());
    	responseDto.setCourseType(coursesWithFocus.getCourseType());
    	Map<Long, String> courses = new HashMap<>();
    	coursesWithFocus.getCoursesWithFocusAssignedCourses().forEach(cou ->{
    		courses.put(cou.getCourse().getId(), cou.getCourse().getCourseName());
    	});
    	responseDto.setCourses(courses);
    	Map<String, String> documents = new HashMap<>();
    	coursesWithFocus.getCoursesWithFocusDocuments().forEach(doc ->{
    		if(doc.getIsActive()) {
    		documents.put(doc.getDocType(), doc.getFileName());
    		}
    	});
    	responseDto.setDocuments(documents);
    	return responseDto;
	}
	
	
	
	

}
