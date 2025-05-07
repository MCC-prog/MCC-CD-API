package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.centralizedData.centralized.model.employee.Department;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="subject")
public class SubjectEntry implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = -5207615988494020179L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "code")
	private String subjectCode;

	@Column(name = "name")
	private String name;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	private Instant createdDate;

	@Column(name = "modified_by")
	private String modifiedBy;

	@Column(name = "last_modified_date")
	private Instant lastModifiedDate;

	@Column(name = "total_marks")
	private Integer subjectTotalMark;

	@Column(name = "passing_marks")
	private Integer subjectPassingMarks;

	@Column(name = "is_second_language")
	private Boolean isSecondLanguage;

	@Column(name = "is_optional_subject")
	private Boolean isOptionalSubject;

	@Column(name = "is_active")
	private Boolean isActive;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_type_id")
	private SubjectType subjectType;

	@Column(name = "is_theory_practical")
	private String theoryOrPractical;

	@Column(name = "consldtd_mark_card_sub_name")
	private String consldtdMarkcardSubName;

	@Column(name = "sub_name_prefix")
	private String subNamePrefix;

	@Column(name = "university_subject_code")
	private String universitySubjectCode;

	@Column(name = "is_certificate_course")
	private Boolean isCertificateCourse;

	@Column(name = "is_additional_subject")
	private Boolean isAdditionalSubject;

	@Column(name = "teachning_hour_persem")
	private Integer teachningHourPersem;

	@Column(name = "question_bank_isrequired")
	private Boolean questionBankIsrequired;

	@Column(name = "scheme_no")
	private Integer schemeNo;

	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "department_id")
	private Department departmentEntry;

	@Column(name = "co_curricular_subject")
	private Boolean coCurricularSubject;

//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "eligible_course_id")
//	private Course eligibleCourse;

	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_code_group_id")
	private SubjectCodeGroup subjectCodeGroup;

	@Column(name = "subject_title")
	private String subjectTitle;

}
