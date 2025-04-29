package com.centralizedData.centralized.repository.Curriculum;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.centralizedData.centralized.model.curriculum.CoursesWithFocusAssignedCourses;

@Repository
public interface CoursesWithFocusAssignedCoursesDao extends JpaRepository<CoursesWithFocusAssignedCourses, Long>{

	@Modifying
	@Query(value = "delete from ce_curriculum_courses_with_focus_assigned_courses where courses_with_focus_id = :coursesWithFocusId", nativeQuery = true)
	void deleteByCoursesWithFocusId(@Param("coursesWithFocusId") Long coursesWithFocusId);

}
