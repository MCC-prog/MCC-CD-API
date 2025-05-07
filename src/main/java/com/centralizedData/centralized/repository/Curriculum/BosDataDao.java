package com.centralizedData.centralized.repository.Curriculum;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.centralizedData.centralized.model.curriculum.BosData;


public interface BosDataDao extends JpaRepository<BosData,Long>{

	BosData findByIdAndIsActive(Long bosId, boolean b);

	List<BosData> findByIsActive(boolean b);

	@Query("from BosData b where b.createdBy in (:userIds) and b.isActive=true")
	List<BosData> getByCreatedIds(List<String> userIds);

	List<BosData> findByCreatedByAndIsActive(String userId, boolean b);

	
	

}
