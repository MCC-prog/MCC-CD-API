package com.centralizedData.centralized.dto.curriculum;

import java.util.HashMap;
import java.util.Map;

import com.centralizedData.centralized.model.curriculum.NewProgram;
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
public class NewProgramResponseDto {
	
	private Long newProgramId;
	private Integer academicYear;
	private String semType;
	private Integer semesterNo;
	private Long streamId;
	private String streamName;
	private Long departmentId;
	private String departmentName;
	private Long programTypeId;
	private String programTypeName;
	private Long degreeId;
	private String degreeName;
	private String IntroductionYear;
	private String programName;
	private Map<String, String> documents;
	
	
	public static NewProgramResponseDto fromNewProgram(NewProgram newProgram) {
		NewProgramResponseDto responseDto = new NewProgramResponseDto();

		responseDto.setNewProgramId(newProgram.getId());
		responseDto.setAcademicYear(newProgram.getAcademicYear());
		responseDto.setSemType(newProgram.getSemType());
		responseDto.setSemesterNo(newProgram.getSemesterNo());
		responseDto.setIntroductionYear(CommonUtil.convertLocalDateToString(newProgram.getIntroductionYear()));
		responseDto.setProgramName(newProgram.getProgramName());

		if (newProgram.getStream() != null) {
		    responseDto.setStreamId(newProgram.getStream().getId());
		    responseDto.setStreamName(newProgram.getStream().getName());
		}
		if (newProgram.getDepartment() != null) {
		    responseDto.setDepartmentId(newProgram.getDepartment().getDepartmentId());
		    responseDto.setDepartmentName(newProgram.getDepartment().getDepartmentName());
		}
		if (newProgram.getProgramType() != null) {
		    responseDto.setProgramTypeId(newProgram.getProgramType().getId());
		    responseDto.setProgramTypeName(newProgram.getProgramType().getName());
		}
		if (newProgram.getProgram() != null) {
		    responseDto.setDegreeId(newProgram.getProgram().getId());
		    responseDto.setDegreeName(newProgram.getProgram().getName());
		}
		Map<String, String> documents = new HashMap<>();
		newProgram.getNewProgramDocuments().forEach(doc -> {
			if (doc.getIsActive()) {
				documents.put(doc.getDocType(), doc.getFileName());
			}
		});
		responseDto.setDocuments(documents);
		return responseDto;
	}
	

}
