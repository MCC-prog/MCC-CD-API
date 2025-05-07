package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.sql.Time;
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

import com.centralizedData.centralized.model.user.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="employee_work_diary")
public class EmployeeWorkDiary implements Serializable {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="academic_year")
	private Integer academicYear;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User users;
	
	@Column(name="created_by")
	private String createdBy;
	
	
	@Column(name="created_date")
	private Date createdDate;
	
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	
	@Column(name="last_modified_date")
	private Date lastModifiedDate;
	
	
	@Column(name="is_active")
	private Boolean isActive;
	
	@OneToMany(mappedBy = "workDiary", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<EmployeeWorkDiaryDetails> workDiaryDetails=new HashSet<EmployeeWorkDiaryDetails>(0);
	
	@Column(name="is_approved")
	private Boolean isApproved;
	
	@Column(name="approval_comment")
	private String approverComment;

}
