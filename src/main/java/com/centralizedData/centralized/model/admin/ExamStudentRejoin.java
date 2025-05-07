package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "EXAM_student_rejoin")
public class ExamStudentRejoin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -476596092065608074L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "class_id")
	private Classes classes;

	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	private Student student;

	@Column(name = "new_register_no")
	private String newRegisterNo;

	@Column(name = "remarks")
	private String remarks;

	@Column(name = "new_roll_no")
	private String newRollNo;

	@Column(name = "rejoin_date")
	private Date rejoinDate;

	@Column(name = "batch")
	private String batch;

}
