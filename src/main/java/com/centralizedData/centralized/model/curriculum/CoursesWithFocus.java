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
import com.centralizedData.centralized.model.admin.Program;
import com.centralizedData.centralized.model.admin.ProgramType;
import com.centralizedData.centralized.model.employee.Department;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "ce_curriculum_courses_with_focus")
public class CoursesWithFocus implements Serializable{
	
	private static final long serialVersionUID = 5673442403083130401L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "academic_year")
	private Integer academicYear;
    
	@Column(name = "sem_type")
	private String semType;
    
	@Column(name = "sem_number")
	private Integer semNumber;
    
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_stream_id")
	private EmpStream empStream;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "department_id")
    private Department department;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "program_type_id")
    private ProgramType programType;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "program_id")
    private Program program;
    
    @Column(name = "focus_area")
    private String focusArea;
    
    @Column(name = "subject_tittle" )
    private String subjectTittle;
    
    @Column(name = "course_type")
    private String courseType;
    
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
	
	@OneToMany(mappedBy = "coursesWithFocus", cascade = CascadeType.ALL)
	private Set<CoursesWithFocusDocuments> coursesWithFocusDocuments = new HashSet<CoursesWithFocusDocuments>();
	
	@OneToMany(mappedBy = "coursesWithFocus", cascade = CascadeType.ALL)
	private Set<CoursesWithFocusAssignedCourses> coursesWithFocusAssignedCourses = new HashSet<CoursesWithFocusAssignedCourses>();

}
