package com.centralizedData.centralized.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.centralizedData.centralized.model.employee.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	List<Employee> findByIsActive(boolean b);

	Employee findByIsActiveAndUid(boolean b, String uId);

	Employee findByIsActiveAndFingerPrintId(boolean b, String fingerPrintId);

	Employee findByIsActiveAndCode(boolean b, String code);

	Employee findByEmployeeId(long longValue);

	Employee findByIsActiveAndEmployeeId(boolean b, Long selectedEmpId);

	Employee findByCode(String empCode);

	Employee findByFingerPrintId(String fingerPrintId);

	Employee findByUserses_userId(Integer userId);

	Employee findByEmployeeIdAndIsActive(long parseLong, boolean b);

	List<Employee> findByDepartment_DepartmentIdAndIsActive(int intValue, boolean b);

	
	
//	 @Query("select e from Employee e join e.users u where " +
//	            "(:tempActive is null or :tempActive = '2' or e.active = :tempActive) and " +
//	            "(:tempName is null or e.firstName like concat(:tempName, '%')) and " +
//	            "(:empTypeIds is null or e.emptype.id in :empTypeIds) and " +
//	            "(:tempDepartmentId is null or e.department.id = :tempDepartmentId) " +
//	            "order by e.department.name, e.emptype.name, e.firstName")
//	List<Employee> getEmployeeListDeatils1(String departmentId, String[] empTypeIds, String tempActive,
//			String firstName);

	//Employee findByIsActiveAndYearAndEmployeeIdAndEmpLeaveType_Id(boolean b, int year, Integer userId, long parseLong);
	
	 
}
