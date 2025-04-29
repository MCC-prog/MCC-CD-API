package com.centralizedData.centralized.dto.admin;

import java.util.Date;
import java.util.List;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubjectDto {

	private Long id;
	private String name;
	private String code;
	private String optional;
	private String secondlanguage;
	private String passingmarks;
	private String totalmarks;
	private String nameCode;
	private String questionbyrequired;
	private String hourpersem;
	private String type;
	
	private String createdBy;;
	private String modifiedBy;
	private Date createdDate;
	private Date lastModifiedDate;
	private String totalMarks;
	private String passingMarks;
	private String isSecondLanguage;
	private String isOptionalSubject;
	private String isActive;
	private String cDate;
	private String lDate;
	private String className;

	private String theoryPractical;
	private String subjectType;
	private boolean checked;
	
	private String startDate;
	private String startTime;
	
	
	private String ciaMaxMarks;
	private String ciaMinMarks;
	private String ciaMarksAwarded;
	private String eseMaxMarks;
	private String eseMinMarks;
	private String eseMarksAwarded;
	private String totalMaxMarks;
	private String totalMarksAwarded;
	private String credits;
	private String grade;
	private String attMaxMarks;
	private String attMarksAwarded;
	private boolean practical;
	private String practicalCiaMaxMarks;
	private String practicalCiaMinMarks;
	private String practicalCiaMarksAwarded;
	private String practicalEseMaxMarks;
	private String practicalEseMinMarks;
	private String practicalEseMarksAwarded;
	private String practicalTotalMaxMarks;
	private String practicalTotalMarksAwarded;
	private String practicalCredits;
	private String practicalGrade;
	private String practicalAttMaxMarks;
	private String practicalAttMarksAwarded;
	private int subOrder;
	private boolean theory;
//	private List<ExamMarksEntryDetailsTO> examMarksEntryDetailsTOList;
	private int order;
	private String subjectID;
	private boolean displaySubject;
	private boolean appearedTheory;
	private boolean appearedPractical;
	private String departmentId;
	private String departmentName;
	private String schemeNo;
	private String status;
	private boolean revaluationReq;
	private String revType;
	private String theoryMarks;
	private String practicalMarks;
	private String checked1;
	private String tempChecked1;
	private String examMidsemExemptionDetailsId;
	private String roomNo;
	private String blockNo;
	private String floorNo;
//	private ExamMarksEntryDetailsTO attendanceAndTheoryTotalTO;
	private String subResult;
	private String selectedSubject;
	private Boolean isApplied=false;
	private String revStatus;
	private String termNo;
	private String overAllId;
	private String finalId;
    private String ciaMarksAwardedNew;
    private Boolean isSupply;
    private String supplyMonth;
    private String supplyYear;
    private String supplyOrMain;
    private String examName;
    private Integer examId;
    private String theoryResult;
    private String practicalResult;
	private Boolean showTheoryAttendance;
	private Boolean showPracticalAttendance;
}
