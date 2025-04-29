package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;

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
import com.centralizedData.centralized.model.employee.Employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity 
@Table(name="users")
public class Users implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8749492926235299538L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "roles_id")
	private Roles roles;
	
	@Column(name="created_by")
	private String createdBy;
		
	@Column(name="created_date")
	private Instant createdDate;
		
	@Column(name="modified_by")
	private String modified_by;
		
	@Column(name="last_modified_date")
	private Instant lastModifiedDate;
		
	@Column(name="is_active")
	private Boolean isActive;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id")
	private Employee employee;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "guest_id")
	private GuestFaculty guest;
	
	@Column(name="staff_type")
	private String staffType;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	private Student student;
	
	@Column(name="no_of_retries")
	private Integer noOfRetries;
	
	@Column(name="last_logged_in")
	private LocalDate LastLoggedIn;
	
	@Column(name="ip_address")
	private String IpAddress;
	
	@Column(name="is_locked")
	private Boolean isLocked;
	
	@Column(name="is_logged_in")
	private Boolean isLoggedIn;
	
	@Column(name="is_teaching_staff")
	private Boolean isTeachingStaff;
	
	@Column(name="user_name")
	private String UserName;
	
	@Column(name="pwd")
	private String pwd;
	
	@Column(name="spring_password")
	private String SpringPassword;
	
	@Column(name="is_add_remarks")
	private Boolean isAddRemarks;
	
	@Column(name="is_view_remarks")
	private Boolean isViewRemarks;
	
	@Column(name="restricted_user")
	private Boolean RestrictedUser;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "department_id")
	private Department department;
	
	@Column(name="enable_attendance_entry")
	private Boolean enableAttendanceEntry;
	
	@Column(name="active")
	private Boolean active;
	
	@Column(name="android_pwd")
	private String androidPwd;
	
	@Column(name="multiple_login_allow")
	private Boolean multipleLoginAllow;
	
	@Column(name="till_date")
	private LocalDate tillDate;
		
	@Column(name="jwt_token")
	private String jwtToken;
	

}
