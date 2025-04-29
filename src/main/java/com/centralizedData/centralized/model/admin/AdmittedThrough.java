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

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="admitted_through")
public class AdmittedThrough implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5256188447152310553L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
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
	
	@Column(name="bankAdmittedTrough")
	private String admittedThroughCode;
	
//	private Set<FeeAccountAssignment> feeAccountAssignments = new HashSet<FeeAccountAssignment>(
//			0);
//	private Set<SeatAllocation> seatAllocations = new HashSet<SeatAllocation>(0);
//	private Set<AdmAppln> admApplns = new HashSet<AdmAppln>(0);
//	private Set<FeeCriteria> feeCriteriasAdm = new HashSet<FeeCriteria>();
	

	
//	public AdmittedThrough() {
//	}
//
//	public AdmittedThrough(int id) {
//		this.id = id;
//	}

	public AdmittedThrough(Long id, String createdBy,
			String modifiedBy, String name, Instant createdDate,
			Instant lastModifiedDate) {
//			Set<FeeAccountAssignment> feeAccountAssignments,
//			Set<SeatAllocation> seatAllocations, Set<AdmAppln> admApplns, Set<FeeCriteria> feeCriteriasAdm, String admittedThroughCode) {
		this.id = id;
		this.createdBy = createdBy;
		this.modifiedBy = modifiedBy;
		this.name = name;
		this.createdDate = createdDate;
		this.lastModifiedDate = lastModifiedDate;
//		this.feeAccountAssignments = feeAccountAssignments;
//		this.seatAllocations = seatAllocations;
//		this.admApplns = admApplns;
//		this.feeCriteriasAdm = feeCriteriasAdm;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy)  {
		this.createdBy = createdBy;
	}

	public String getModifiedBy()  {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Instant getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Instant createdDate) {
		this.createdDate = createdDate;
	}

	public Instant getLastModifiedDate() {
		return this.lastModifiedDate;
	}

	public void setLastModifiedDate(Instant lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

//	public Set<FeeAccountAssignment> getFeeAccountAssignments() {
//		return this.feeAccountAssignments;
//	}
//
//	public void setFeeAccountAssignments(
//			Set<FeeAccountAssignment> feeAccountAssignments) {
//		this.feeAccountAssignments = feeAccountAssignments;
//	}
//
//	public Set<SeatAllocation> getSeatAllocations() {
//		return this.seatAllocations;
//	}
//
//	public void setSeatAllocations(Set<SeatAllocation> seatAllocations) {
//		this.seatAllocations = seatAllocations;
//	}

	public Integer getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}
//	public Set<AdmAppln> getAdmApplns() {
//		return this.admApplns;
//	}
//
//	public void setAdmApplns(Set<AdmAppln> admApplns) {
//		this.admApplns = admApplns;
//	}
//
//	public Set<FeeCriteria> getFeeCriteriasAdm() {
//		return feeCriteriasAdm;
//	}
//
//	public void setFeeCriteriasAdm(Set<FeeCriteria> feeCriteriasAdm) {
//		this.feeCriteriasAdm = feeCriteriasAdm;
//	}

	public void setAdmittedThroughCode(String admittedThroughCode) {
		this.admittedThroughCode = admittedThroughCode;
	}

	public String getAdmittedThroughCode() {
		return admittedThroughCode;
	}


}
