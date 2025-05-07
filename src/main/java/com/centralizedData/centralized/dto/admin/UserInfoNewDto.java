package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;

public class UserInfoNewDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4880916872285116064L;
	
	private int id;
	private StudentDto studentTO;
	private RolesDto rolesTO;
	private EmployeeNewDto employeeTO;
	private GuestFacultyNewDto guestFacultyTO;
	private String userName;
	private String pwd;
	private Boolean isTeachingStaff;
	private String lastLoggedIn;
	private String modifiedBy;
	private String modifieddate;
	private String createdBy;
	private String createddate;
	private Boolean remarksEntry;
	private Boolean viewRemarks;
	private DepartmentEntryDto department;
	private String departmentName;
	private String designationName;
	private String rolesName;
	private Boolean isRestrictedUser;
	private Boolean enableAtendanceEntry;
	private Boolean active;
	private String staffType;
	private String name;
	private String dob;
	private int empOrGuestId;
	private Boolean isLoggedIn;
	private Boolean multipleLoginAllow;
	private String tillDate;
	private boolean checked;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public StudentDto getStudentTO() {
		return studentTO;
	}
	public void setStudentTO(StudentDto studentTO) {
		this.studentTO = studentTO;
	}
	public RolesDto getRolesTO() {
		return rolesTO;
	}
	public void setRolesTO(RolesDto rolesTO) {
		this.rolesTO = rolesTO;
	}
	public EmployeeNewDto getEmployeeTO() {
		return employeeTO;
	}
	public void setEmployeeTO(EmployeeNewDto employeeTO) {
		this.employeeTO = employeeTO;
	}
	public GuestFacultyNewDto getGuestFacultyTO() {
		return guestFacultyTO;
	}
	public void setGuestFacultyTO(GuestFacultyNewDto guestFacultyTO) {
		this.guestFacultyTO = guestFacultyTO;
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
	public Boolean getIsTeachingStaff() {
		return isTeachingStaff;
	}
	public void setIsTeachingStaff(Boolean isTeachingStaff) {
		this.isTeachingStaff = isTeachingStaff;
	}
	public String getLastLoggedIn() {
		return lastLoggedIn;
	}
	public void setLastLoggedIn(String lastLoggedIn) {
		this.lastLoggedIn = lastLoggedIn;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public String getModifieddate() {
		return modifieddate;
	}
	public void setModifieddate(String modifieddate) {
		this.modifieddate = modifieddate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreateddate() {
		return createddate;
	}
	public void setCreateddate(String createddate) {
		this.createddate = createddate;
	}
	public Boolean getRemarksEntry() {
		return remarksEntry;
	}
	public void setRemarksEntry(Boolean remarksEntry) {
		this.remarksEntry = remarksEntry;
	}
	public Boolean getViewRemarks() {
		return viewRemarks;
	}
	public void setViewRemarks(Boolean viewRemarks) {
		this.viewRemarks = viewRemarks;
	}
	public DepartmentEntryDto getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentEntryDto department) {
		this.department = department;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDesignationName() {
		return designationName;
	}
	public void setDesignationName(String designationName) {
		this.designationName = designationName;
	}
	public String getRolesName() {
		return rolesName;
	}
	public void setRolesName(String rolesName) {
		this.rolesName = rolesName;
	}
	public Boolean getIsRestrictedUser() {
		return isRestrictedUser;
	}
	public void setIsRestrictedUser(Boolean isRestrictedUser) {
		this.isRestrictedUser = isRestrictedUser;
	}
	public Boolean getEnableAtendanceEntry() {
		return enableAtendanceEntry;
	}
	public void setEnableAtendanceEntry(Boolean enableAtendanceEntry) {
		this.enableAtendanceEntry = enableAtendanceEntry;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public String getStaffType() {
		return staffType;
	}
	public void setStaffType(String staffType) {
		this.staffType = staffType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getEmpOrGuestId() {
		return empOrGuestId;
	}
	public void setEmpOrGuestId(int empOrGuestId) {
		this.empOrGuestId = empOrGuestId;
	}
	public Boolean getIsLoggedIn() {
		return isLoggedIn;
	}
	public void setIsLoggedIn(Boolean isLoggedIn) {
		this.isLoggedIn = isLoggedIn;
	}
	public Boolean getMultipleLoginAllow() {
		return multipleLoginAllow;
	}
	public void setMultipleLoginAllow(Boolean multipleLoginAllow) {
		this.multipleLoginAllow = multipleLoginAllow;
	}
	public String getTillDate() {
		return tillDate;
	}
	public void setTillDate(String tillDate) {
		this.tillDate = tillDate;
	}
	public boolean isChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	
	
	
}
