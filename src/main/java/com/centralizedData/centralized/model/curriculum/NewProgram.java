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

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Builder
@Table(name="ce_curriculum_new_program")
public class NewProgram implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = -4803622482893728848L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "department_id")
	private Department department;
	
	@Column(name = "sem_type")
	private String semType;
	
	@Column(name = "academic_year")
	private Integer academicYear;
	
	@Column(name = "introduction_year")
	private LocalDate introductionYear;
	
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
	
	@Column(name = "program_name")
	private String ProgramName;
	
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
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "newProgram", orphanRemoval = true, cascade = CascadeType.ALL)
	private Set<NewProgramDocuments> newProgramDocuments = new HashSet<NewProgramDocuments>();
	
}
