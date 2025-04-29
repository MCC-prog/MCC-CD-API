package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Set;

import com.centralizedData.centralized.model.admin.DocChecklist;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EdnQualificationDto implements Serializable,Comparable<EdnQualificationDto> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7321648639612936924L;

	private long id;
	private DocChecklistNewDto docChecklistDto;
	
	private String universityId;
	private Long docCheckListId;
	private Integer docTypeId;
	private int boardId;
	private String institutionName;
	private String institutionId;
	private String stateId;
	private boolean outsideIndia;
	private String stateName;
	private int noOfAttempts;
	private int yearPassing;
	private int monthPassing;
	private String passGrade;
	private String universityOthers;
	private int countId;
	private String docName;
	private boolean consolidated;
	private boolean semesterWise;
	private boolean isMarksCard;
	private boolean isPreviousExam;
	private boolean isExamReq;
	private boolean needToProduceSemWise;
	private boolean lastExam;
	private String marksObtained;
	private String totalMarks;
	private String otherInstitute;
	private CandidateMarkNewDto detailmark;
	private String universityName;
	private List<UniversityNewDto> universityList;
	private List<CollegeDto> instituteList;
	Set<ApplicantMarksDetailsNewDto> semesterList;
	private String previousRegNo;
	private boolean isLanguage;
	private DocChecklist orignalCheckList;
	private String createdBy;
	private Instant createdDate;
	private String percentage;
	private List<DocTypeExamsDto> examTos;
	private String selectedExamId;
	private String selectedExamName;
	private boolean examRequired;
	private boolean examConfigured;
	
	List<ApplicantMarksDetailsNewDto> semesters;
	private Integer displayOrder;
	private Boolean isClass10or12;
	private boolean blockedMarks;
	private String  previousCourse;
	private String  monthOfPassInWords;
	private Boolean detailSemMarksPrint;
	private Boolean detailSubMarksPrint;


	@Override
	public int compareTo(EdnQualificationDto arg0) {
		if(arg0!=null && this!=null ){
			if (arg0.getDisplayOrder() != null && arg0.getDisplayOrder()!=0 && this.getDisplayOrder()!=null && this.getDisplayOrder()!=0){
				if(this.getDisplayOrder() >  arg0.getDisplayOrder())
					return 1;
				else if(this.getDisplayOrder() <  arg0.getDisplayOrder())
					return -1;
				else
					return 0;
			}		
		}
		return 0;
	}	

}
