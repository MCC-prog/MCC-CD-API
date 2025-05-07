package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;
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
@Table(name="classes")
public class Classes implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7285242107311674738L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long  id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "section_name")
	private String sectionName;
		
	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	private Instant createdDate;

	@Column(name = "modified_by")
	private String modifiedBy;

	@Column(name = "last_modified_date")
	private Instant lastModifiedDate;

	@Column(name = "is_active")
	private Boolean isActive;
	
	@ManyToOne(cascade = CascadeType.PERSIST ,fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id")
	private Courses courses;
	
	@Column(name = "term_number")
	private Integer termNumber;
	
	@Column(name = "course_group_code_id")
	private Integer courseGroupCodeId;
	
//	@Column(name = "room_master")
//	private Boolean roomMaster;
	
//	@Column(name = "course_term_academic_period_id")
//	private String courseTermAcademicPeriodId;
	
	@OneToMany(mappedBy = "classes", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<ClassSchemewise> classSchemewises = new HashSet<ClassSchemewise>();
}
