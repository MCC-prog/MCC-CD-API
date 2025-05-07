package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
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
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "period")
public class Period implements Serializable, Comparable<Period>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3238270830651549136L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "class_schemewise_id")
	private ClassSchemewise classSchemewise;
	
	@Column(name = "period_name")
	private String periodName;
	
	@Column(name = "start_time")
	private String startTime;
	
	@Column(name = "end_time")
	private String endTime;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "created_date")
	private Date createdDate;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@Column(name = "last_modified_date")
	private Date lastModifiedDate;
	
	@Column(name = "is_active")
	private Boolean isActive;
	
	
	@OneToMany(mappedBy = "period", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<AttendancePeriod> attendancePeriods = new HashSet<AttendancePeriod>();


	@Override
	public int compareTo(Period arg0) {
		if(arg0!=null && this!=null){
			DateFormat dateFormat = new SimpleDateFormat("k:mm:ss");
			Date startTime;
			try {
				startTime = dateFormat.parse(this.getStartTime());
				Date startTime1 = dateFormat.parse(arg0.getStartTime());
				if(startTime.compareTo(startTime1) > 0)
					return 1;
				else if(startTime.compareTo(startTime1) < 0)
					return -1;
				else{
					return 0;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}	
		return 0;
	}

}
