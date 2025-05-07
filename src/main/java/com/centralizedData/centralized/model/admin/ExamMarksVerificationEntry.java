package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

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
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="EXAM_marks_verification_details")
public class ExamMarksVerificationEntry implements Serializable{
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="exam_id")
	private Long examId;
	
	@Column(name="student_id")
	private Long studentId;
	
	@Column(name="subject_id")
	private Long subjectId;
	
//	@Column(name="id")
//	private String fsvm;
	
//	@Column(name="id")
//	private String ssvm;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@Column(name="last_modified_date")
	private Date lastModifiedDate;
	
	@Column(name="evaluator_type_id")
	private Integer evaluatorTypeId;
	
	@Column(name="vmarks")
	private String vmarks;
	
	@Column(name="answer_script_type")
	private Integer answerScriptTypeId;
	
	@Column(name="user_id")
	private Integer userId;
	
	@Column(name="created_date")
	private Date createdDate;
	
	@Column(name="packet_no")
	private String packetNo;
	

}

