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
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;

import org.springframework.format.annotation.DateTimeFormat;

import com.centralizedData.centralized.model.admin.EmpStream;
import com.centralizedData.centralized.model.admin.Program;
import com.centralizedData.centralized.model.admin.ProgramType;
import com.centralizedData.centralized.model.employee.Department;
import com.centralizedData.centralized.model.user.User;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity 
@Table(name="ce_curriculum_bos")
public class BosData implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "department_id")
	private Department department;
	
	@Column(name = "sem_type")
	private String semType;
	
	@Column(name = "academic_year")
	@Min(value = 2000, message = "Academic Year should be greater than 2000")
	private Integer academicYear;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@Column(name = "date_of_conduct")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate dateOfConduct;
	
	@DecimalMax(value = "100.0", inclusive = true)
    @DecimalMin(value = "0.0", inclusive = true)
    @Digits(integer=8, fraction=2)
	@Column(name = "revision_per")
	private Double revisionPerc;
	
	@Column(name = "semester_no")
	private Integer semesterNo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "program_type_id")
	private ProgramType programType;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "program_id")
    private Program program;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "stream_id")
	private EmpStream stream;
	
	@Column(name = "course_or_program")
	private String courseOrProgram;
	
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
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bosData", orphanRemoval = true, cascade = CascadeType.ALL)
	private Set<BosDataDocuments> bosDataDocuments = new HashSet<BosDataDocuments>();
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bosData", orphanRemoval = true, cascade = CascadeType.ALL)
	private Set<BosDataAssignedCourses> bosDataAssignedCourses = new HashSet<BosDataAssignedCourses>();

}