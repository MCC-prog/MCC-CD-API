package com.centralizedData.centralized.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.centralizedData.centralized.model.admin.Organisation;

public interface AdminOrganisationRepository extends JpaRepository<Organisation, Long>{

	Organisation findByName(String name);
	
	@Query("from Organisation o")
	List<Organisation> getOrganizationDetails();

}
