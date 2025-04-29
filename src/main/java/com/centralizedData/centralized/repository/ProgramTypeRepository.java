package com.centralizedData.centralized.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.centralizedData.centralized.model.admin.ProgramType;
import com.centralizedData.centralized.model.employee.Stream;

public interface ProgramTypeRepository extends JpaRepository<ProgramType, Integer>{

	@Query("from ProgramType c where c.isActive=1")
	List<ProgramType> getByIsActive();

	ProgramType findByName(String name);

	@Query("from ProgramType c where c.isActive=1 and c.name=:name and c.id!=:id")
	ProgramType getByName(String name, Long id);

	List<ProgramType> findByIdAndIsActive(long programtypeList, boolean b);

	
	@Query("from ProgramType d where d.id =:programTypeId")
	ProgramType findById(@Param("programTypeId") Long programTypeId);

}

