package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;

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

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="EXAM_room_allotment_details")
public class ExamRoomAllotmentDetails implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4974874507232305200L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long  id;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "exam_room_allotment_id")
	private ExamRoomAllotment examRoomAllotment;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	private Student student;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "class_id")
	private Classes classes;
	
	@Column(name = "column_no")
	private Integer columnNo;
	
	@Column(name = "row_no")
	private Integer rowNo;
	
	@Column(name = "seating_position")
	private Integer seatingPosition;
	
	@Column(name = "seat_no")
	private Integer seatNo;
	
	@Column(name = "unique_id")
	private String uniqueId;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_id")
	private SubjectEntry subject;	
	
	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	private Instant createdDate;

	@Column(name = "modified_by")
	private String modifiedBy;

	@Column(name = "last_modified_date")
	private Instant lastModifiedDate;
	
	@Column(name = "is_active")
	private Boolean isActive;
	
	
	
}
