package com.centralizedData.centralized.repository.Curriculum;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.centralizedData.centralized.model.curriculum.CoursesWithFocusDocuments;

@Repository
public interface CoursesWithFocusDocumentsDao extends JpaRepository<CoursesWithFocusDocuments, Long>{

	@Modifying
	@Query(value = "delete from ce_curriculum_courses_with_focus_documents "
			+ "where courses_with_focus_id = :coursesWithFocusId", nativeQuery = true)
	void deleteByCoursesWithFocusId(Long coursesWithFocusId);

}
