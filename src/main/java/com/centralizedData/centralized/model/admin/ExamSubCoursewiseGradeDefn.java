package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;

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

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="EXAM_sub_coursewise_grade_defn")
public class ExamSubCoursewiseGradeDefn implements Serializable{
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "start_prcntg_grade")
	private BigDecimal startPrcntgGrade;
	
	@Column(name = "end_prcntg_grade")
	private BigDecimal endPrcntgGrade;
	
	@Column(name = "grade")
	private String grade;
	
	@Column(name = "grade_interpretation")
	private String gradeInterpretation;
	
	@Column(name = "result_class")
	private String resultClass;
	
	@Column(name = "grade_point")
	private BigDecimal gradePoint;
	
	@Column(name = "course_id")
	private Long courseId;
	
	@Column(name = "Academic_Year")
	private Integer academicYear;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_id")
	private SubjectEntry subjectUtilBO;
	
	public ExamSubCoursewiseGradeDefn(SubjectEntry subjectUtilBO,
			BigDecimal startPrcntgGrade, BigDecimal endPrcntgGrade,
			String grade, String gradeInterpretation, String resultClass,
			BigDecimal gradePoint, long courseId) {
		super();
		this.subjectUtilBO = subjectUtilBO;
		this.startPrcntgGrade = startPrcntgGrade;
		this.endPrcntgGrade = endPrcntgGrade;
		this.grade = grade;
		this.gradeInterpretation = gradeInterpretation;
		this.resultClass = resultClass;
		this.gradePoint = gradePoint;
		this.courseId = courseId;
	}

}
