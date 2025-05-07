package com.centralizedData.centralized.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.centralizedData.centralized.model.user.UserRoles;

@Repository
public interface UserRolesRepository extends JpaRepository<UserRoles, Integer>{

    @Query("select ur from UserRoles ur  where ur.user.userId=:userId")
	List<UserRoles> getUserDetails(Integer userId);

	List<UserRoles> findByUser_UserId(Integer userId);
}
