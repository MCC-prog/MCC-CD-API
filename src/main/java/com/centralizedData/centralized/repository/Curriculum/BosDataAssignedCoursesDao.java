package com.centralizedData.centralized.repository.Curriculum;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.centralizedData.centralized.model.curriculum.BosDataAssignedCourses;

@Repository
public interface BosDataAssignedCoursesDao extends JpaRepository<BosDataAssignedCourses, Long> {

	@Modifying
	@Query(value = "delete from ce_curriculum_bos_assigned_courses where ce_curriculum_bos_id = :bosId", nativeQuery = true)
	void deleteByBosId(Long bosId);

}
