package com.centralizedData.centralized.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.centralizedData.centralized.model.admin.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{

	@Query("from Users where isActive = 1 and id = :userId")
	List<Users> getUsersById(long userId);

	@Query("select u.id, e.department.departmentName, u.UserName from Users u left join u.employee e with (e.active=1 and e.isActive=1) "
			+ "left join e.department d  where  u.isActive=1 and u.active=1 and u.isTeachingStaff=1 and u.UserName is not null ")
	List<Object[]> getTeacherDepartmentsName();

	@Query("select u.id, e.department.departmentName, u.UserName from Users u left join u.employee e with (e.active=1 and e.isActive=1) "
			+ "left join e.department d  where  u.isActive=1 and u.active=1 and u.isTeachingStaff=1 and u.UserName is not null "
			+ " and (u.employee.id is not null or u.guest.id is not null)")
	List<Object[]> getTeacherDepartmentsName1();

	@Query("select u.id, u.department.departmentName, u.UserName from Users u left join u.department d "
			+ "where u.isActive=1 and u.active=1 and u.isTeachingStaff=1 and u.UserName is not null and u.id = :userIdEmpl")
	List<Object[]> getTeacherDepartmentsNameFromUser(long userIdEmpl);

	@Query("select u.id, g.department.departmentName, u.UserName from Users u left join u.guest g with (g.active=1 and g.isActive=1) "
			+ "left join g.department d where u.isActive=1 and u.active=1 and u.isTeachingStaff=1 and u.UserName is not null and u.id = :userId")
	List<Object[]> getTeacherDepartmentsNameFromGuest(long userId);
	

	
}
