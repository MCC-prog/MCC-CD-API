package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.sql.Time;
import java.time.Instant;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="employee_work_diary_details")
public class EmployeeWorkDiaryDetails implements Serializable{

	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
	
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "activity_id")
    private WorkDiaryActivity activity;
    
    
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "work_diary_id")
    private EmployeeWorkDiary workDiary;
    
    @Column(name="from_time")
    private Time fromTime;
    
    @Column(name="to_time")
    private Time toTime;
    
    @Column(name="total_time")
    private Time totalTime;
    
    @Column(name="other_activity")
    private String otherActivity;
    
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
    
    @Column(name="remarks")
    private String remarks;
    
    @Column(name="class_name")
    private String className;
    
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_id")
    private SubjectEntry subject;
}
