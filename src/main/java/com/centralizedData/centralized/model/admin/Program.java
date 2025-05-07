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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity 
@Table(name="program")
public class Program implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1003628514659739800L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long  id;

	@Column(name="code")
	private String  code;

	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "program_type_id")
	private ProgramType  programType;


	@Column(name="name")
	private String name;

	@Column(name=" certificate_program_name")
	private String certificateProgramName;


	@Column(name="is_active")
	private Boolean isActive;


	@Column(name="created_by")
	private String createdBy;


	@Column(name="created_date")
	private Instant createdDate;



	@Column(name="modified_by")
	private String modifiedBy;



	@Column(name="last_modified_date")
	private Instant lastModifiedDate;



	@Column(name="is_mother_tongue")
	private Boolean isMotherTongue;



	@Column(name="is_second_language")
	private Boolean isSecondLanguage;



	@Column(name="is_displaylanguage_known")
	private Boolean isDisplaylanguageKnown;



	@Column(name="is_family_background")
	private Boolean isFamilyBackground;



	@Column(name="is_height_weight")
	private Boolean isHeightWeight;



	@Column(name="is_entrance_details")
	private Boolean isEntranceDetails;



	@Column(name="is_lateral_details")
	private Boolean isLateralDetails;



	@Column(name="is_display_trainingshort_course")
	private Boolean isDisplayTrainingshortCourse;



	@Column(name="is_transfer_course")
	private Boolean isTransferCourse;



	@Column(name="is_additional_info")
	private Boolean isAdditionalInfo;



	@Column(name="is_extra_details")
	private Boolean isExtraDetails;



	@Column(name="is_tc_display")
	private Boolean isTcDisplay ;


	@Column(name="is_registration_no")
	private Boolean isRegistrationNo;



	@Column(name="is_open")
	private Boolean isOpen ;



	@Column(name="academic_year")
	private Integer academic_year;



	@Column(name="is_exam_center_required")
	private Boolean isExamCenterRequired;


	@Column(name="stream")
	private String stream;

	@OneToMany(mappedBy = "program" ,cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Courses> courses = new HashSet<Courses>();

//	@Column(name="emp_stream_id")
//	private Integer empStreamId ;
}

