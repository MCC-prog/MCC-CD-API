package com.centralizedData.centralized.dto.curriculum;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.centralizedData.centralized.model.curriculum.InnovativeTeachingMethodology;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InnovativeMethodologyResponseDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7006954288974336614L;
	
	private Long innovativeTeachingMethodologyId;
	private Integer academicYear;
	private String semType;
	private Integer semesterNo;
	private String courseTitle;
	private Map<Long, String> courses;
	private Map<String, String> documents;
	
	
	
	public static InnovativeMethodologyResponseDto fromInnovativeMethodologyData(InnovativeTeachingMethodology bo) {
		InnovativeMethodologyResponseDto responseDto = new InnovativeMethodologyResponseDto();

		responseDto.setInnovativeTeachingMethodologyId(bo.getId());
		responseDto.setAcademicYear(bo.getAcademicYear());
		responseDto.setSemType(bo.getSemType());
		responseDto.setSemesterNo(bo.getSemesterNo());
		responseDto.setCourseTitle(bo.getCourseTitle());

		Map<Long, String> courses = new HashMap<>();
		bo.getInnovativeTeachingMethodologyCourses().forEach(cou -> {
			courses.put(cou.getCourse().getId(), cou.getCourse().getCourseName());
		});
		responseDto.setCourses(courses);
		Map<String, String> documents = new HashMap<>();
		bo.getInnovativeTeachingMethodologyDocument().forEach(doc -> {
			if (doc.getIsActive()) {
				documents.put(doc.getDocType(), doc.getFileName());
			}
		});
		responseDto.setDocuments(documents);
		return responseDto;
	}

	
}
