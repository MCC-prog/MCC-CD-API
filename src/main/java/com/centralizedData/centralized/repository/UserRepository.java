package com.centralizedData.centralized.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.centralizedData.centralized.model.admin.Users;
import com.centralizedData.centralized.model.user.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUserName(String userName);

	User findByIsActiveAndUserId(boolean b, Integer userId);

	User findByEmployee_EmployeeId(Long empId);

	User findByUserId(Integer userId);
//venu
	List<User> findByIsActive(boolean b);

    @Query("from User u left join u.employee e  with (e.active=1 and e.isActive=1) left join e.department d  where  u.isActive=1 and u.active=1 and u.isTeachingStaff=1 and u.userName is not null")
	List<User> getTeacherDepartmentNamesList();

    
    @Query("from User u left join u.department d where u.isActive=1 and u.active=1 and u.isTeachingStaff=1 and u.userName is not null and u.userId=:userIdEmpl")
	List<User> getTeacherDepartmentsNameFromUser(int userIdEmpl);

    
    @Query("from User u left join u.guest g with (g.active=1 and g.isActive=1) left join g.department d where u.isActive=1 and u.active=1 and u.isTeachingStaff=1 and u.userName is not null and u.userId=:userIdEmpl")
	List<User> getTeacherDepartmentsNameFromGuest(int userIdEmpl);
    
    @Query("from User u join u.employee e with (e.active=1 and e.isActive=1) where u.employee.employeeId = e.employeeId and u.isActive=1 and u.active=1 and u.isTeachingStaff=1 and u.userName is not null and e.department.departmentId = :deptId ")
	List<User> getFilteredTeacherDepartmentsName(int deptId);
    
    
	@Query("from User u join u.employee e with (e.active=1 and e.isActive=1) where u.employee.employeeId = e.employeeId and u.isActive=1 and u.active=1 and u.isTeachingStaff=1 and u.userName is not null and e.department.departmentId = :deptId "
			+" and (u.employee.employeeId is not null or u.guest.id is not null)")
	List<User> getTeacherDeptName(Integer deptId);

	@Query("from User u where u.userId= :uId")
	User getMobileNoByUserId(int uId);

	@Query(value = "SELECT u.user_id FROM users u " +
            "INNER JOIN employees e ON u.employee_id = e.employee_id " +
            "INNER JOIN departments d ON e.department_id = d.department_id " +
            "WHERE d.department_id = :deptId", nativeQuery = true)
	List<Integer> findUserIdsByDeptId(@Param("deptId") Long deptId);

	
	
	

}
