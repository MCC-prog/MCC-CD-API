package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;
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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="organisation")
public class Organisation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6236017495347860904L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name")
	private String name;
		
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="created_date")
	private Instant createdDate;
		
	@Column(name="modified_by")
	private String modified_by;
		
	@Column(name="last_modified_date")
	private Instant lastModifiedDate;	
	
	@Column(name="is_active")
	private Boolean isActive;
	
	@Column(name="logo")
	private byte[] logo;
	
	@Column(name="topbar")
	private byte[] topbar;
	
	@Column(name="address_line_1")
	private String addressLine1;
	
	@Column(name="address_line_2")
	private String addressLine2;
	
	@Column(name="address_line_3")
	private String addressLine3;
	
	@Column(name="logo_name")
	private String logoName;
	
	@Column(name="topbar_name")
	private String topbarName;
	
	@Column(name="logo_content_type")
	private String logoContentType;
	
	@Column(name="topbar_content_type")
	private String topbarContentType;
	
	@Column(name="need_final_approval")
	private Boolean needFinalApproval;
	
	@Column(name="same_userid_password")
	private Boolean sameUserIdPassword;
	
	@Column(name="change_password")
	private Boolean changePassword;
	
	@Column(name="final_meritlist_approval")
	private Boolean finalMeritlistApproval;
//	
//	@Column(name="logo1")
//	private MultipartFile logo1;
//	
//	@Column(name="topbar1")
//	private MultipartFile topbar1;
	
	@Column(name="logo_name1")
	private String logoName1;
	
	@Column(name="topbar_name1")
	private String topbarName1;
	
	@Column(name="logo_content_type1")
	private String logoContentType1;
	
	@Column(name="topbar_content_type1")
	private String topbarContentType1;
	
	@Column(name="time_limit_for_automatic_att_entry")
	private Integer timeLimitForAutomaticAttEntry;
	
	@Column(name="open_honours_course_link")
	private Boolean openHonoursCourseLink;
	
	@Column(name="convocation_registration")
	private Boolean convocationRegistration;
	
	@Column(name="student_allotment_count")
	private Integer studentAllotmentCount;
	
	@Column(name="student_photo_upload")
	private Boolean studentPhotoUpload;

	@OneToMany(mappedBy = "organisation", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<ExtracurricularActivity> extracurricularActivities;
//	private Set<GuidelinesChecklist> guidelinesChecklists = new HashSet<GuidelinesChecklist>(0);
}
