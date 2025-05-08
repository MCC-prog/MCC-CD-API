package com.centralizedData.centralized.repository.Curriculum;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.centralizedData.centralized.model.curriculum.NewProgram;

@Repository
public interface NewProgramDao extends JpaRepository<NewProgram, Long> {

	NewProgram findByIdAndIsActive(Long newProgramId, boolean b);

	List<NewProgram> findByIsActive(boolean b);

	List<NewProgram> findByCreatedByAndIsActive(String userId, boolean b);

	@Query("from NewProgram b where b.createdBy in (:userIds) and b.isActive=true")
	List<NewProgram> getByCreatedIds(List<String> userIds);
	
	

}
