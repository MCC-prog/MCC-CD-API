package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;
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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity 
@Table(name="tt_period_week_history")
public class TTPeriodWeekHistory implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 564916023893989484L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long  id;

	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "period_id")
	private Period period;

	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "tt_class_history_id")
	private TTClassesHistory tTClassesHistory;

	@Column(name="week_day")
	private String weekDay;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_date")
	private Instant createdDate;

	@Column(name="modified_by")
	private String modifiedBy;

	@Column(name="last_modified_date")
	private Instant lastModifiedDate;

	@Column(name="is_active")
	private Boolean isActive;

	@OneToMany(mappedBy = "tTPeriodWeekHistory", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<TTSubjectBatchHistory> ttSubjectBatchsHistory;



}
