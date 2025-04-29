package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="EXAM_sub_definition_coursewise")
public class ExamSubDefinitionCourseWise implements Serializable{

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "subject_order")
	private int subjectOrder;
	
	@Column(name = "university_subject_code")
	private String universitySubjectCode;

	@Column(name = "theory_hours")
	private int theoryHours;
	
	@Column(name = "theory_credit")
	private BigDecimal theoryCredit;
	
	@Column(name = "practical_hours")
	private int practicalHours;
	
	@Column(name = "practical_credit")
	private BigDecimal practicalCredit;
	
	@Column(name = "dont_show_sub_type")
	private int dontShowSubType;
	
	@Column(name = "dont_show_max_marks")
	private int dontShowMaxMarks;
	
	@Column(name = "dont_show_min_marks")
	private int dontShowMinMarks;
	
	@Column(name = "dont_show_att_marks")
	private int dontShowAttMarks;
	
	@Column(name = "dont_add_tot_mark_cls_decln")
	private int dontAddTotMarkClsDecln;
	
	@Column(name = "dont_consider_failure_total_result")
	private int dontConsiderFailureTotalResult;
	
	
	@Column(name = "show_internal_final_mark_added")
	private int showInternalFinalMarkAdded;
	
	
	@Column(name = "show_only_grade")
	private int showOnlyGrade;
	
	@Column(name = "is_active_grade_defn")
	private int isActiveGradeDefn;
	
	@Column(name = "is_active_attndnc")
	private int isActiveAttndnc;
	
	
	@Column(name="created_by")
	private String createdBy;
	
	
	@Column(name="created_date")
	private Date createdDate;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@Column(name="last_modified_date")
	private Date lastModifiedDate;
	
	@Column(name = "course_id")
	private Long courseId;
	
	@Column(name = "scheme_no")
	private Integer schemeNo;
	
	@Column(name = "academic_year")
	private int academicYear;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_id")
	private SubjectEntry subjectUtilBO;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_section_id")
	private ExamSubjectSectionMaster examSubjectSectionMasterBO;
	
	
	
	public ExamSubDefinitionCourseWise(SubjectEntry subjectUtilBO, int subjectOrder,
			String universitySubjectCode, ExamSubjectSectionMaster examSubjectSectionMasterBO,
			int theoryHours, BigDecimal theoryCredit, int practicalHours,
			BigDecimal practicalCredit, int dontShowSubType, int dontShowMaxMarks,
			int dontShowMinMarks, int dontShowAttMarks,
			int dontAddTotMarkClsDecln, int dontConsiderFailureTotalResult,
			int showInternalFinalMarkAdded, int showOnlyGrade,
			int isActiveGradeDefn, int isActiveAttndnc, String userId,
			Long courseId, Integer schemeNo,int academicYear) {
		super();
		this.subjectUtilBO = subjectUtilBO;
		this.subjectOrder = subjectOrder;
		this.universitySubjectCode = universitySubjectCode;
		this.examSubjectSectionMasterBO = examSubjectSectionMasterBO;
		this.theoryHours = theoryHours;
		this.theoryCredit = theoryCredit;
		this.practicalHours = practicalHours;
		this.practicalCredit = practicalCredit;
		this.dontShowSubType = dontShowSubType;
		this.dontShowMaxMarks = dontShowMaxMarks;
		this.dontShowMinMarks = dontShowMinMarks;
		this.dontShowAttMarks = dontShowAttMarks;
		this.dontAddTotMarkClsDecln = dontAddTotMarkClsDecln;
		this.dontConsiderFailureTotalResult = dontConsiderFailureTotalResult;
		this.showInternalFinalMarkAdded = showInternalFinalMarkAdded;
		this.showOnlyGrade = showOnlyGrade;
		this.isActiveGradeDefn = isActiveGradeDefn;
		this.isActiveAttndnc = isActiveAttndnc;
		this.modifiedBy = userId;
		this.createdBy = userId;
		this.createdDate=new Date();
		this.lastModifiedDate = new Date();
		this.courseId = courseId;
		this.schemeNo = schemeNo;
		this.academicYear = academicYear;
	}



	public ExamSubDefinitionCourseWise(SubjectEntry subjectUtilBO, int subjectOrder,
			String universitySubjectCode, ExamSubjectSectionMaster examSubjectSectionMasterBO,
			int theoryHours, BigDecimal theoryCredit, int dontShowSubType,
			int dontShowMaxMarks, int dontShowMinMarks, int dontShowAttMarks,
			int dontAddTotMarkClsDecln, int dontConsiderFailureTotalResult,
			int showInternalFinalMarkAdded, int showOnlyGrade,
			int isActiveGradeDefn, int isActiveAttndnc, String userId,
			Long courseId, Integer schemeNo,int academicYear) {
		super();
		this.subjectUtilBO = subjectUtilBO;
		this.subjectOrder = subjectOrder;
		this.universitySubjectCode = universitySubjectCode;
		this.examSubjectSectionMasterBO = examSubjectSectionMasterBO;
		this.theoryHours = theoryHours;
		this.theoryCredit = theoryCredit;
		this.dontShowSubType = dontShowSubType;
		this.dontShowMaxMarks = dontShowMaxMarks;
		this.dontShowMinMarks = dontShowMinMarks;
		this.dontShowAttMarks = dontShowAttMarks;
		this.dontAddTotMarkClsDecln = dontAddTotMarkClsDecln;
		this.dontConsiderFailureTotalResult = dontConsiderFailureTotalResult;
		this.showInternalFinalMarkAdded = showInternalFinalMarkAdded;
		this.showOnlyGrade = showOnlyGrade;
		this.isActiveGradeDefn = isActiveGradeDefn;
		this.isActiveAttndnc = isActiveAttndnc;
		this.modifiedBy = userId;
		this.createdBy = userId;
		this.createdDate=new Date();
		this.lastModifiedDate = new Date();
		this.courseId = courseId;
		this.schemeNo = schemeNo;
		this.academicYear = academicYear;
	}



	public ExamSubDefinitionCourseWise(Long id2, SubjectEntry subjectEntry, int subjectOrder2,
			String universitySubjectCode2, ExamSubjectSectionMaster sectionId, int theoryHours2,
			BigDecimal theoryCredit2, int practicalHours2, BigDecimal practicalCredit2, int dontShowSubType2,
			int dontShowMaxMarks2, int dontShowMinMarks2, int dontShowAttMarks2, int dontAddTotMarkClsDecln2,
			int dontConsiderFailureTotalResult2, int showInternalFinalMarkAdded2, int showOnlyGrade2,
			int isActiveGradeDefn2, int isActiveAttndnc2, String userId, Long courseId2, Integer schemeNo2,
			int academicYear2) {
		super();
		this.subjectUtilBO = subjectEntry;
		this.subjectOrder = subjectOrder2;
		this.universitySubjectCode = universitySubjectCode2;
		this.examSubjectSectionMasterBO = sectionId;
		this.theoryHours = theoryHours2;
		this.theoryCredit = theoryCredit2;
		this.dontShowSubType = practicalHours2;
		this.dontShowMaxMarks = dontShowMaxMarks2;
		this.dontShowMinMarks = dontShowMinMarks2;
		this.dontShowAttMarks = dontShowAttMarks2;
		this.dontAddTotMarkClsDecln = dontAddTotMarkClsDecln2;
		this.dontConsiderFailureTotalResult = dontConsiderFailureTotalResult2;
		this.showInternalFinalMarkAdded = showInternalFinalMarkAdded2;
		this.showOnlyGrade = showOnlyGrade2;
		this.isActiveGradeDefn = isActiveGradeDefn2;
		this.isActiveAttndnc = isActiveAttndnc2;
		this.modifiedBy = userId;
		this.createdBy = userId;
		this.createdDate=new Date();
		this.lastModifiedDate = new Date();
		this.courseId = courseId2;
		this.schemeNo = schemeNo2;
		this.academicYear = academicYear2;
	}




}

