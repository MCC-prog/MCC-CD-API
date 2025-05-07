package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name="doc_type")
public class DocType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3857162032128275585L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="created_date")
	private Instant createdDate;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@Column(name="last_modified_date")
	private Instant lastModifiedDate;
	
	@Column(name="is_active")
	private Boolean isActive;
	
	@Column(name="doc_short_name")
	private String docShortName;
	
	@Column(name="print_name")
	private String printName;
	
	@Column(name="educational_info")
	private Boolean isEducationalInfo; 
	
	@Column(name="display_order")
	private Integer displayOrder;
	
	@Column(name="is_display")
	private Boolean isDisplay;
	
	@Column(name="no_marks_details")
	private Boolean noMarksDisplay;
	
	@OneToMany(mappedBy = "docType" ,cascade = CascadeType.ALL,orphanRemoval = true)
	private Set<DocTypeExam> docTypeExamses = new HashSet<DocTypeExam>();
	
	@OneToMany(mappedBy = "docType", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<DocChecklist> docChecklists = new HashSet<DocChecklist>();

//	private Set<DocChecklist> docChecklists = new HashSet<DocChecklist>(0);
//	private Set<ApplnDoc> applnDocs = new HashSet<ApplnDoc>(0);
//	private Set<ProgCourseDoc> progCourseDocs = new HashSet<ProgCourseDoc>(0);
//	private Set<DocTypeExams> docTypeExamses = new HashSet<DocTypeExams>(0);
//	private Set<University> universitys = new HashSet<University>(0);

}
