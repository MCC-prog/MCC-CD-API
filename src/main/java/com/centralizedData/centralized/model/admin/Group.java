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
@Table(name = "group")
public class Group implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "created_by")
	private String createdBy;;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "created_date")
	private Date createdDate;
	
	@Column(name = "last_modified_date")
	private Date lastModifiedDate;
	
	@OneToMany(mappedBy = "group", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<GroupStudent> groupStudents = new HashSet<GroupStudent>(0);
	
	@OneToMany(mappedBy = "group", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<GroupInstructor> groupInstructors = new HashSet<GroupInstructor>(
			0);
	
	@OneToMany(mappedBy = "group", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<SessionAttendee> sessionAttendees = new HashSet<SessionAttendee>(
			0);
	
	@OneToMany(mappedBy = "group", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<SessionIncharge> sessionIncharges = new HashSet<SessionIncharge>(
			0);

}
