package com.centralizedData.centralized.model.user;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.LazyToOneOption;

import com.centralizedData.centralized.model.admin.GuestFaculty;
import com.centralizedData.centralized.model.employee.Department;
import com.centralizedData.centralized.model.employee.Employee;







@Entity
@Table(name = "users")
public class User implements Serializable {
	private static final long serialVersionUID = 2164150043694209789L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer userId;

	@Column(name = "user_name", unique = true)
	private String userName;

	@Column(name = "pwd")
	private String pwd;
	
	@Column(name = "android_pwd")
	private String androidPwd;

	@Column(name = "spring_password")
	private String springPassword;
	
	@Column(name = "staff_type")
	private String staffType;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id")
	@LazyToOne(LazyToOneOption.NO_PROXY)
	private Employee employee;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	private Instant createdDate;
	
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "department_id")
	private Department department;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_roles", joinColumns = { @JoinColumn(name = "users_id") }, inverseJoinColumns = {
			@JoinColumn(name = "roles_id") })
	private Set<Role> userRoles = new HashSet<Role>();

	@Column(name = "modified_by")
	private String modifiedBy;

	@Column(name = "last_modified_date")
	private Instant lastModifiedDate;

	@Column(name = "last_logged_in")
	private LocalDateTime lastLoggedIn;

	@Column(name = "is_active")
	private Boolean isActive;

	@Column(name = "active")
	private Boolean active;

	@Column(name = "is_locked")
	private Boolean isLocked;

	@Column(name = "student_id", insertable = false, updatable = false)
	private Integer studentId;

	@Column(name = "roles_id", insertable = false, updatable = false)
	private Integer oldRoleId;
	
	@Column(name = "jwt_token")
	private String jwtToken;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user", orphanRemoval = true, cascade = CascadeType.ALL)
	private Set<UserRoles> userRole = new HashSet<UserRoles>();

	@Transient
	private String currentPassword;

	@Transient
	private String newPassword;

	@Transient
	private String retypePassword;
	
	@Column(name = "is_teaching_staff")
	private Boolean isTeachingStaff;
	
	@Column(name = "restricted_user")
	private Boolean isRestrictedUser;
	
	@Column(name = "is_add_remarks")
	private Boolean isAddRemarks;
	
	@Column(name = "is_view_remarks")
	private Boolean isViewRemarks;
	
	@Column(name = "multiple_login_allow")
	private Boolean multipleLoginAllow;
	
	@Column(name = "till_date")
	private Date tillDate;
	
	@Column(name = "enable_attendance_entry")
	private Boolean enableAttendanceEntry;
	
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "guest_id")
	private GuestFaculty guest;

	public User() {
	}

	public User(Integer userId) {
		super();
		this.userId = userId;
	}

	public User(Integer userId, Integer oldRoleId) {
		super();
		this.userId = userId;
		this.oldRoleId = oldRoleId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getSpringPassword() {
		return springPassword;
	}

	public void setSpringPassword(String springPassword) {
		this.springPassword = springPassword;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Instant getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Instant createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Instant getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Instant lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public LocalDateTime getLastLoggedIn() {
		return lastLoggedIn;
	}

	public void setLastLoggedIn(LocalDateTime lastLoggedIn) {
		this.lastLoggedIn = lastLoggedIn;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsLocked() {
		return isLocked;
	}

	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}

	

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Integer getOldRoleId() {
		return oldRoleId;
	}

	public void setOldRoleId(Integer oldRoleId) {
		this.oldRoleId = oldRoleId;
	}
	
	public String getJwtToken() {
		return jwtToken;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getRetypePassword() {
		return retypePassword;
	}

	public void setRetypePassword(String retypePassword) {
		this.retypePassword = retypePassword;
	}

	public String getCurrentPassword() {
		return currentPassword;
	}

	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	
	public Set<UserRoles> getUserRole() {
		return userRole;
	}

	public void setUserRole(Set<UserRoles> userRole) {
		this.userRole = userRole;
	}

	public Set<Role> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(Set<Role> userRoles) {
		this.userRoles = userRoles;
	}
	
	
	

	public Boolean getEnableAttendanceEntry() {
		return enableAttendanceEntry;
	}

	public void setEnableAttendanceEntry(Boolean enableAttendanceEntry) {
		this.enableAttendanceEntry = enableAttendanceEntry;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}
	
	

	public String getStaffType() {
		return staffType;
	}

	public void setStaffType(String staffType) {
		this.staffType = staffType;
	}

	
	
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	

	public Boolean getIsTeachingStaff() {
		return isTeachingStaff;
	}

	public void setIsTeachingStaff(Boolean isTeachingStaff) {
		this.isTeachingStaff = isTeachingStaff;
	}
	
	
	
	
	

	public Boolean getIsRestrictedUser() {
		return isRestrictedUser;
	}

	public void setIsRestrictedUser(Boolean isRestrictedUser) {
		this.isRestrictedUser = isRestrictedUser;
	}

	public Boolean getIsAddRemarks() {
		return isAddRemarks;
	}

	public void setIsAddRemarks(Boolean isAddRemarks) {
		this.isAddRemarks = isAddRemarks;
	}

	public Boolean getIsViewRemarks() {
		return isViewRemarks;
	}

	public void setIsViewRemarks(Boolean isViewRemarks) {
		this.isViewRemarks = isViewRemarks;
	}

	public Boolean getMultipleLoginAllow() {
		return multipleLoginAllow;
	}

	public void setMultipleLoginAllow(Boolean multipleLoginAllow) {
		this.multipleLoginAllow = multipleLoginAllow;
	}

	public Date getTillDate() {
		return tillDate;
	}

	public void setTillDate(Date tillDate) {
		this.tillDate = tillDate;
	}
	
	

	public GuestFaculty getGuest() {
		return guest;
	}

	public void setGuest(GuestFaculty guest) {
		this.guest = guest;
	}
	
	
	

	public String getAndroidPwd() {
		return androidPwd;
	}

	public void setAndroidPwd(String androidPwd) {
		this.androidPwd = androidPwd;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
}
	






