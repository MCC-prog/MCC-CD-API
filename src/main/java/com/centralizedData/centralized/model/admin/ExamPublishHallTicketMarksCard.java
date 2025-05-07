package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
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

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="EXAM_publish_hall_ticket_marks_card")
public class ExamPublishHallTicketMarksCard implements Serializable{/**
 * 
 */
	private static final long serialVersionUID = -6480441534280885033L;


	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "program_type_id")
	private ProgramType programType;

	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "exam_id")
	private ExamDefinition examDefinition;

	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "class_id")
	private Classes classes;

	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "agreement_id")
	private ExamFooterAgreement examAgreement;

	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "footer_id")
	private ExamFooterAgreement examFooter;

	@Column(name="publish_for")
	private String publishFor;

	@Column(name="download_start_date")
	private Date downloadStartDate;

	@Column(name="download_end_date")
	private Date downloadEndDate;

	@Column(name="revaluation_date")
	private Date revaluationEndDate;

	@Column(name="exam_center_code")
	private String examCenterCode;

	@Column(name="exam_center")
	private String examCenter;

	@Column(name="created_by")
	private String createdBy;;

	@Column(name="modified_by")
	private String modifiedBy;

	@Column(name="created_date")
	private Instant createdDate;

	@Column(name="last_modified_date")
	private Instant lastModifiedDate;

	@Column(name="is_active")
	private Boolean isActive;

}
