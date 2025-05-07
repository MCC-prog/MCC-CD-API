package com.centralizedData.centralized.model.employee;

import java.io.Serializable;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.centralizedData.centralized.model.admin.EmployeeStream;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "department")
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
public class Department implements Serializable{
	
private static final long serialVersionUID = -8396519616861883645L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long departmentId;

	@Column(name = "name")
	private String departmentName;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	private Date createdDate;

	@Column(name = "last_modified_by")
	private String lastModifiedBy;

	@Column(name = "last_modified_date")
	private Date lastModifiedDate;

	@Column(name = "is_active")
	private Boolean isActive;
	
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "stream_id")
	private EmployeeStream streamId;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "is_academic")
	private Boolean isAcademic;
	
	@Column(name = "web_id")
	private Integer webId;
	
	@Column(name = "hod_mail")
	private String hodMail;
	
//	@Column(name = "course_plan_group_id")
//	private Integer coursePlanGroupId;
	
//	@Column(name = "active")
//	private Boolean IsActive;
	@Column(name = "punch_in")
	private String punchIn;
	
	@Column(name = "punch_out")
	private String puncOut;
	
	public Department(Long DepartmentId, String DepartmentName) {
		super();
		this.departmentId = DepartmentId;
		this.departmentName = DepartmentName;
	}

	
	


}
