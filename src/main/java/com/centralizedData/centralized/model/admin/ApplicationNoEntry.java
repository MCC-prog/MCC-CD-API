package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name="application_number")
public class ApplicationNoEntry implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4460803139852683746L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long  id;
	
	@Column(name="online_appln_no_from")
	private String onlineApplnNoFrom;
	
	@Column(name="online_appln_no_to")
	private String onlineApplnNoTo;
	
	@Column(name="offline_appln_no_from")
	private String offlineApplnNoFrom;
	
	@Column(name="offline_appln_no_to")
	private String offlineApplnNoTo;
	
	@Column(name="year")
	private Integer year;
		
	@OneToMany(mappedBy = "applicationNoEntry", cascade = CascadeType.ALL,orphanRemoval=true)
	private List<CourseApplicationNumber> courseApplicationNumber;
	
	
	@Column(name="current_online_appln_no")
	private String currentOnlineApplnNo;
	
	@Column(name="current_offline_appln_no")
	private String currentOfflineApplnNo;
	
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

}
