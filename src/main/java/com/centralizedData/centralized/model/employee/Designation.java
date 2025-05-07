//package com.centralizedData.centralized.model.employee;
//
//import java.io.Serializable;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//import lombok.Data;
//import lombok.EqualsAndHashCode;
//import lombok.NoArgsConstructor;
//
//@Entity
//@Table(name = "designation")
//@NoArgsConstructor
//@Data
//@EqualsAndHashCode(callSuper = false)
//public class Designation implements Serializable {
//	
//	private static final long serialVersionUID = -8396519616861883645L;
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id")
//	private Integer designationId;
//
//	@Column(name = "name")
//	private String designationName;
//
//	@Column(name = "desc_order")
//	private Integer designationOrder;
//
//	@Column(name = "created_by")
//	private String createdBy;
//
//	@Column(name = "created_date")
//	private LocalDate createdDate;
//
//	@Column(name = "modified_by")
//	private String modifiedBy;
//
//	@Column(name = "last_modified_date")
//	private LocalDateTime lastModifiedDate;
//
//	@Column(name = "is_active")
//	private Boolean isActive;
//
//	public Designation(Integer designationId, String designationName) {
//		super();
//		this.designationId = designationId;
//		this.designationName = designationName;
//	}
//
//
//
//
//}
