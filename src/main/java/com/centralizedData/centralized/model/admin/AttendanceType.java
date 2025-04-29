package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.util.Date;
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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "attendance_type")
public class AttendanceType  implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "is_default")
	private Boolean isDefault;
	
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
	
	@OneToMany(mappedBy = "attendanceType", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<AttendanceTypeMandatory> attendanceTypeMandatories = new HashSet<AttendanceTypeMandatory>(0);
	
	@OneToMany(mappedBy = "attendanceType", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<Activity> activities = new HashSet<Activity>(0);
	
	@OneToMany(mappedBy = "attendanceType", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<Attendance> attendances = new HashSet<Attendance>(0);
	
	
	@OneToMany(mappedBy = "attendanceType", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<StuCocurrLeave> stuCocurrLeaves = new HashSet<StuCocurrLeave>(0);

}
