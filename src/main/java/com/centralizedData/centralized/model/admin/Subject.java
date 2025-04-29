package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="subject")
public class Subject implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 3128850949807026313L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="code")
	private String code;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@Column(name="created_date")
	private Instant createdDate;
	
	@Column(name="last_modified_date")
	private Instant lastModifiedDate;
	
	@Column(name="is_active")
	private Boolean isActive;
	
	@Column(name="total_marks")
	private Integer totalMarks;
	
	@Column(name="passing_marks")
	private Integer passingMarks;
	
	@Column(name="is_second_language")
	private Boolean isSecondLanguage;
	
	@Column(name="question_bank_isrequired")
	private Boolean questionbyrequired;
	
	@Column(name="teachning_hour_persem")
	private Integer hourpersem;
	
	@Column(name="is_optional_subject")
	private Boolean isOptionalSubject;
	
	
	
	
	

}
