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

import com.centralizedData.centralized.model.employee.Employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="EXAM_grade_class_definition")
public class ExamGradeDefinition implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "start_percentage")
	private BigDecimal startPercentage;
	
	@Column(name = "end_percentage")
	private BigDecimal endPercentage;
	
	@Column(name = "grade")
	private String grade;
	
	@Column(name = "interpretation")
	private String interpretation;
	
	@Column(name = "result_class")
	private String resultClass;
	
	@Column(name = "grade_point")
	private BigDecimal gradePoint;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id")
	private Courses courseId;

	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "created_date")
	private Date createdDate;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@Column(name = "last_modified_date")
	private Date lastModifiedDate;
	
	@Column(name = "is_active")
	private Boolean isActive;
}

