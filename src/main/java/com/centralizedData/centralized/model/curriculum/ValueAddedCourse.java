package com.centralizedData.centralized.model.curriculum;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.centralizedData.centralized.model.admin.EmpStream;
import com.centralizedData.centralized.model.employee.Department;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="ce_curriculum_value_added_course")
public class ValueAddedCourse implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = -6055103974678786734L;
	
	
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "academic_year")
	private Integer academicYear;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "department_id")
	private Department department;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "stream_id")
	private EmpStream stream;
	
	@Column(name = "student_name")
	private String studentName;
	
	@Column(name = "register_no")
	private String registerNo;
	
	@Column(name = "course_title")
	private String courseTitle;
	
	@Column(name = "no_of_students_enrolled")
	private Integer studentsEnrolled;
	
	@Column(name = "no_of_students_completed")
	private Integer studentsCompleted;
	
	@Column(name = "start_date")
	private LocalDate startDate;
	
	@Column(name = "end_date")
	private LocalDate endDate;
	
	@Column(name = "resourse_person")
	private String resoursePerson;
	
	@Column(name = "organization")
	private String organization;
	
	@Column(name = "no_of_credits")
	private Integer noOfCredits;
	
	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	private LocalDate createdDate;

	@Column(name = "modified_by")
	private String modifiedBy;

	@Column(name = "last_modified_date")
	private LocalDateTime lastModifiedDate;

	@Column(name = "is_active")
	private Boolean isActive;
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "valueAddedCourse", orphanRemoval = true, cascade = CascadeType.ALL)
	private Set<ValueAddedCourseDocuments> valueAddedCourseDocuments = new HashSet<ValueAddedCourseDocuments>();
	
	
	
	
	
	
	
	

}
