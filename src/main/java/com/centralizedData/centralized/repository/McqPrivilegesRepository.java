package com.centralizedData.centralized.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.centralizedData.centralized.model.admin.McqPrivileges;


@Repository
public interface McqPrivilegesRepository extends JpaRepository<McqPrivileges, Long> {

//	 @Query(value = "SELECT DISTINCT mp "
//	 		+ "FROM mcq_privileges mp "
//	 		+ "JOIN mcq_privileges_roles mpr ON mp.id = mpr.mcq_privilege_id "
//	 		+ "JOIN roles r ON mpr.roles_id = r.id "
//	 		+ "JOIN employee e ON r.id = e.role_id "
//	 		+ "JOIN user u ON e.id = u.employee_id "
//	 		+ "WHERE u.user_id = :userId "
//	 		+ "AND u.is_active = true "
//	 		+ "AND e.is_active = true "
//	 		+ "AND r.is_active = true "
//	 		+ "AND mp.is_active = true", nativeQuery = true)
	
	@Query(value = "SELECT DISTINCT mp.* "
			+ "FROM mcq_privileges mp "
			+ "JOIN mcq_privileges_roles mpr ON mp.id = mpr.mcq_privilege_id "
			+ "JOIN roles r ON mpr.roles_id = r.id "
			+ "JOIN user_roles ur ON ur.roles_id = r.id "
			+ "JOIN users u ON ur.users_id = u.id "
			+ "JOIN employee e ON u.employee_id = e.id "
			+ "WHERE u.id = :userId "
			+ "AND u.is_active = true "
			+ "AND e.is_active = true "
			+ "AND r.is_active = true "
			+ "AND mp.is_active = true ", nativeQuery = true)
	    List<McqPrivileges> getByUserId(@Param("userId") Integer userId);

}
