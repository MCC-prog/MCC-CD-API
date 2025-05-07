package com.centralizedData.centralized.model.admin;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity 
@Table(name="interview_status")
public class InterviewStatus implements Serializable{

	private static final long serialVersionUID = -1065677637258400923L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="modified_by")
	private String modifiedBy;

	@Column(name="name")
	private String name;

	@Column(name="created_date")
	private Instant createdDate;

	@Column(name="last_modified_date")
	private Instant lastModifiedDate;

	@Column(name="is_active")
	private Integer isActive;

	//			@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	//			@JoinColumn(name = "interview_status_id")
	//			private InterviewResult interviewResult;
}

