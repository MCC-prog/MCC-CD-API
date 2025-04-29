package com.centralizedData.centralized.repository.Curriculum;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.centralizedData.centralized.model.curriculum.CoursesWithFocus;



@Repository
public interface CoursesWithFocusDao extends JpaRepository<CoursesWithFocus, Long> {

	List<CoursesWithFocus> findByIsActive(Boolean isActive);

	List<CoursesWithFocus> findByCreatedByAndIsActive(String createdBy, Boolean isActive);
	
	@Query("from BosData b where b.createdBy in (:userIdsAsString) and b.isActive=true")
	List<CoursesWithFocus> getByCreatedIds(List<String> userIdsAsString);
	
	CoursesWithFocus findByIdAndIsActive(Long id, Boolean isActive);
	
}
