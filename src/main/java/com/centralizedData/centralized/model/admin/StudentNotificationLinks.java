package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
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

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="student_notification_link")
public class StudentNotificationLinks implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = -1710286119248991760L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long  id;
	
	
	@Column(name = "academic_year")
	private Integer academicYear;
	
	@Column(name = "is_link")
	private Boolean linkOrFile;
	
	@Column(name = "is_active")
	private Boolean isActive;
	
	@Column(name = "to_date")
	private Date toDate;
	
	@Column(name = "from_date")
	private Date fromDate;
	
	@Column(name = "to_time")
	private String toTime;
	
	@Column(name = "from_time")
	private String fromTime;
	
	@Column(name = "link")
	private String link;
	
	@Column(name = "description")
	private String description;
	
//	@OneToMany(mappedBy = "studentNotificationLinks", cascade = CascadeType.ALL,orphanRemoval=true)
//	private Set<StudentNotificationLinkClasses> linkclasses = new HashSet<StudentNotificationLinkClasses>();

}
