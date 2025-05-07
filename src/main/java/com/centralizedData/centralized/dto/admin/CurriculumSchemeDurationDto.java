package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CurriculumSchemeDurationDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8665198514956144236L;

	private long id;
	private int semester;
	private int curriculumSchemeId;
	private CurriculumSchemeDto curriculumSchemeTO;

	private String startDate;
	private String endDate;
	private int academicYear;
	private String[] subjectGroup;
	private int selectedIndex;
	private String tempYear;

//	private Set<CurriculumSchemeSubjectDto>curriculumSchemeSubjectDto;
//
//	private List<CurriculumSchemeSubjectDto> curriculumSubjectTOList;

}
