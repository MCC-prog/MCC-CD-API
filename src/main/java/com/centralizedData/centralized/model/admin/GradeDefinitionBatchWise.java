package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

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

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "EXAM_grade_class_definition_frombatch")
public class GradeDefinitionBatchWise implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = -1620698023599138322L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "from_batch")
	private Integer fromBatch;
	
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
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id")
	private Courses courses;
		
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@Column(name = "is_active")
	private Boolean isActive;
	
	@Column(name = "created_date")
	private Date createdDate;
	
	@Column(name = "last_modified_date")
	private Date lastModifiedDate;

}
