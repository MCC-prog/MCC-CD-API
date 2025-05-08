package com.centralizedData.centralized.repository.Curriculum;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.centralizedData.centralized.model.curriculum.ValueAddedCourse;

@Repository
public interface ValueAddedCourseDao extends JpaRepository<ValueAddedCourse, Long> {

	ValueAddedCourse findByIdAndIsActive(Long valueAddedCourseId, boolean b);

	List<ValueAddedCourse> findByIsActive(boolean b);

	@Query("from ValueAddedCourse b where b.createdBy in (:userIds) and b.isActive=true")
	List<ValueAddedCourse> getByCreatedIds(List<String> userIds);

	List<ValueAddedCourse> findByCreatedByAndIsActive(String userId, boolean b);

}
