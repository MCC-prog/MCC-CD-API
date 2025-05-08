package com.centralizedData.centralized.dto.curriculum;

import java.util.HashMap;
import java.util.Map;

import com.centralizedData.centralized.model.curriculum.BosData;
import com.centralizedData.centralized.utils.CommonUtil;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class BosResponseDto {

	private Long bosDataId;
	private Integer academicYear;
	private String semType;
	private Integer semesterNo;
	private Long streamId;
	private String streamName;
	private Long departmentId;
	private String departmentName;
	private Long programTypeId;
	private String programTypeName;
	private Long programId;
	private String programName;
	private String yearOfIntroduction;
	private String percentage;
	private Map<Long, String> courses;
	private Map<String, String> documents;

	public static BosResponseDto fromBosData(BosData bosBO) {
		BosResponseDto responseDto = new BosResponseDto();

		responseDto.setBosDataId(bosBO.getId());
		responseDto.setAcademicYear(bosBO.getAcademicYear());
		responseDto.setSemType(bosBO.getSemType());
		responseDto.setSemesterNo(bosBO.getSemesterNo());
		responseDto.setYearOfIntroduction(CommonUtil.convertLocalDateToString(bosBO.getDateOfConduct()));
		responseDto.setPercentage(bosBO.getRevisionPerc() != null ? bosBO.getRevisionPerc().toString() : null);

		if (bosBO.getStream() != null) {
		    responseDto.setStreamId(bosBO.getStream().getId());
		    responseDto.setStreamName(bosBO.getStream().getName());
		}
		if (bosBO.getDepartment() != null) {
		    responseDto.setDepartmentId(bosBO.getDepartment().getDepartmentId());
		    responseDto.setDepartmentName(bosBO.getDepartment().getDepartmentName());
		}
		if (bosBO.getProgramType() != null) {
		    responseDto.setProgramTypeId(bosBO.getProgramType().getId());
		    responseDto.setProgramTypeName(bosBO.getProgramType().getName());
		}
		if (bosBO.getProgram() != null) {
		    responseDto.setProgramId(bosBO.getProgram().getId());
		    responseDto.setProgramName(bosBO.getProgram().getName());
		}
		Map<Long, String> courses = new HashMap<>();
		bosBO.getBosDataAssignedCourses().forEach(cou -> {
			courses.put(cou.getCourse().getId(), cou.getCourse().getCourseName());
		});
		responseDto.setCourses(courses);
		Map<String, String> documents = new HashMap<>();
		bosBO.getBosDataDocuments().forEach(doc -> {
			if (doc.getIsActive()) {
				documents.put(doc.getDocType(), doc.getFileName());
			}
		});
		responseDto.setDocuments(documents);
		return responseDto;
	}

}
