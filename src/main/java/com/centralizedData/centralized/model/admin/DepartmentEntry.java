package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Time;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

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

import com.centralizedData.centralized.model.employee.Department;
import com.centralizedData.centralized.model.employee.Stream;
import com.centralizedData.centralized.model.employee.WorkLocation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="department")
public class DepartmentEntry implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 147083111254236418L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	private Instant createdDate;

	@Column(name = "last_modified_by")
	private String lastModifiedBy;

	@Column(name = "last_modified_date")
	private Instant lastModifiedDate;

	@Column(name = "is_active")
	private Boolean isActive;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "stream_id")
	private Stream stream;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "is_academic")
	private Boolean isAcademic;
	
	@Column(name = "web_id")
	private Integer webId;
	
	@Column(name = "hod_mail")
	private String hodMail;
	
	@Column(name = "punch_in")
	private Time punchIn;
	
	@Column(name = "punch_out")
	private Time punchOut;
	
	@Column(name = "is_isrc")
	private Boolean Active;
}
