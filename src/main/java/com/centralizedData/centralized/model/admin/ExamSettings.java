package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

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

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="EXAM_exam_settings")
public class ExamSettings implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "absent_code_mark_entry")
	private String absentCodeMarkEntry;
	
	@Column(name = "not_proced_code_mark_entry")
	private String notProcedCodeMarkEntry;
	
	@Column(name = "secured_mark_entry_by")
	private String securedMarkEntryBy;
	
	@Column(name = "max_allwd_diff_prcntg_multi_evaluator")
	private BigDecimal maxAllwdDiffPrcntgMultiEvaluator;
	
	@Column(name = "grade_point_for_fail")
	private BigDecimal gradePointForFail;
	
	@Column(name = "grade_for_fail")
	private String gradeForFail;

	@Column(name = "is_active")
	private Boolean isActive;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="created_date")
	private Date createdDate;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@Column(name="last_modified_date")
	private Date lastModifiedDate;
}

