package com.centralizedData.centralized.repository.Curriculum;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.centralizedData.centralized.model.curriculum.InnovativeTeachingMethodology;

@Repository
public interface InnovativeTeachingMethodologyDao extends JpaRepository<InnovativeTeachingMethodology, Long> {

	InnovativeTeachingMethodology findByIdAndIsActive(Long innovativeMethodologyId, boolean b);

	List<InnovativeTeachingMethodology> findByIsActive(boolean b);

	@Query("from InnovativeTeachingMethodology b where b.createdBy in (:userIds) and b.isActive=true")
	List<InnovativeTeachingMethodology> getByCreatedIds(List<String> userIds);

	List<InnovativeTeachingMethodology> findByCreatedByAndIsActive(String userId, boolean b);

}
