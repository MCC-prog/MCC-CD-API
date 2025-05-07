package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="applicant_marks_details")
public class ApplicantMarksDetails implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4033519411405431004L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="course_scheme_id")
	private CourseScheme courseScheme;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "edn_qualification_id")
	private EdnQualification ednQualification;
	
	@Column(name="semester_no")
	private Integer semesterNo;
	
	@Column(name="semester_name")
	private String semesterName;
	
	@Column(name="max_marks")
	private Integer maxMarks;
	
	@Column(name="marks_obtained")
	private Integer marksObtained;
	
	@Column(name="percentage")
	private BigDecimal percentage;
	
	@Column(name="is_last_exam")
	private Boolean isLastExam;
	
	@Column(name="max_marks_languagewise")
	private Integer maxMarksLanguagewise;
	
	@Column(name="marks_obtained_languagewise")
	private Integer marksObtainedLanguagewise;
	
	@Column(name="percentage_languagewise")
	private BigDecimal percentageLanguagewise;

	public ApplicantMarksDetails() {
	}

	public ApplicantMarksDetails(Long id) {
		this.id = id;
	}

	public ApplicantMarksDetails(Long id, CourseScheme courseScheme,
			EdnQualification ednQualification, Integer semesterNo, String semesterName,
			Integer maxMarks, Integer marksObtained, BigDecimal percentage,
			Boolean isLastExam,Integer maxMarksLanguagewise,
			Integer marksObtainedLanguagewise,
			BigDecimal percentageLanguagewise) {
		this.id = id;
		this.courseScheme = courseScheme;
		this.ednQualification = ednQualification;
		this.semesterNo = semesterNo;
		this.semesterName = semesterName;
		this.maxMarks = maxMarks;
		this.marksObtained = marksObtained;
		this.percentage = percentage;
		this.isLastExam = isLastExam;
		this.maxMarksLanguagewise = maxMarksLanguagewise;
		this.marksObtainedLanguagewise = marksObtainedLanguagewise;
		this.percentageLanguagewise = percentageLanguagewise;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CourseScheme getCourseScheme() {
		return this.courseScheme;
	}

	public void setCourseScheme(CourseScheme courseScheme) {
		this.courseScheme = courseScheme;
	}

	public EdnQualification getEdnQualification() {
		return this.ednQualification;
	}

	public void setEdnQualification(EdnQualification ednQualification) {
		this.ednQualification = ednQualification;
	}


	public Integer getSemesterNo() {
		return this.semesterNo;
	}

	public void setSemesterNo(Integer semesterNo) {
		this.semesterNo = semesterNo;
	}

	public String getSemesterName() {
		return this.semesterName;
	}

	public void setSemesterName(String semesterName) {
		this.semesterName = semesterName;
	}

	public Integer getMaxMarks() {
		return this.maxMarks;
	}

	public void setMaxMarks(Integer maxMarks) {
		this.maxMarks = maxMarks;
	}

	public Integer getMarksObtained() {
		return this.marksObtained;
	}

	public void setMarksObtained(Integer marksObtained) {
		this.marksObtained = marksObtained;
	}

	public BigDecimal getPercentage() {
		return this.percentage;
	}

	public void setPercentage(BigDecimal percentage) {
		this.percentage = percentage;
	}

	public Boolean getIsLastExam() {
		return this.isLastExam;
	}

	public void setIsLastExam(Boolean isLastExam) {
		this.isLastExam = isLastExam;
	}

	public Integer getMaxMarksLanguagewise() {
		return this.maxMarksLanguagewise;
	}

	public void setMaxMarksLanguagewise(Integer maxMarksLanguagewise) {
		this.maxMarksLanguagewise = maxMarksLanguagewise;
	}

	public Integer getMarksObtainedLanguagewise() {
		return this.marksObtainedLanguagewise;
	}

	public void setMarksObtainedLanguagewise(
			Integer marksObtainedLanguagewise) {
		this.marksObtainedLanguagewise = marksObtainedLanguagewise;
	}

	public BigDecimal getPercentageLanguagewise() {
		return this.percentageLanguagewise;
	}

	public void setPercentageLanguagewise(BigDecimal percentageLanguagewise) {
		this.percentageLanguagewise = percentageLanguagewise;
	}

}
