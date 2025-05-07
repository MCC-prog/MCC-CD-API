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

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="certificate_course")
public class CertificateCourse implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 7842781946695528888L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "created_by")
	private String createdBy;
		
	@Column(name = "modified_by")
    private String modifiedBy;
    
	@Column(name = "created_date")
    private Instant createdDate;
    
	@Column(name = "last_modified_date")
    private Instant lastModifiedDate;
       
	@Column(name = "is_active")
    private Boolean isActive;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private Users users;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_id")
	private SubjectEntry subject;
	
	@Column(name = "certificate_course_name")
	private String certificateCourseName;
		
	@Column(name = "max_intake")
    private Integer maxIntake;
    
	@Column(name = "start_time")
    private String startTime;
    
	@Column(name = "end_time")
    private String endTime;
       
	@Column(name = "venue")
    private String venue;
	
	@Column(name = "year")
    private Integer year;
    
	@Column(name = "sem_type")
    private String semType;
       
	@Column(name = "extra_curricular")
    private Boolean extraCurricular;
	
	@Column(name = "amount")
    private String amount;
       
	@Column(name = "is_pg")
    private Boolean isPg;
	
	@Column(name = "description")
    private String description;
	
//	@OneToMany(mappedBy = "admAppln", cascade = CascadeType.ALL,orphanRemoval=true)
//	private Set<StudentCertificateCourse> studentCertificateCourses = new HashSet<StudentCertificateCourse>();
//	
//	@OneToMany(mappedBy = "admAppln", cascade = CascadeType.ALL,orphanRemoval=true)
//	private Set<StudentCertificateCoursePaymentDetails> studentCertificateCoursesPayement = new HashSet<StudentCertificateCoursePaymentDetails>();

}
