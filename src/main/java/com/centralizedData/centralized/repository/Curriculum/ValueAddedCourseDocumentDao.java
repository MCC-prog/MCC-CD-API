package com.centralizedData.centralized.repository.Curriculum;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.centralizedData.centralized.model.curriculum.ValueAddedCourseDocuments;

@Repository
public interface ValueAddedCourseDocumentDao extends JpaRepository<ValueAddedCourseDocuments, Long> {

	@Modifying
	@Query(value = "delete from ce_curriculum_value_added_course_document "
			+ "where value_added_course_id = :id", nativeQuery = true)
	void deleteByvalueAddedCourseId(Long id);

	Optional<ValueAddedCourseDocuments> findByValueAddedCourse_Id(Long valueAddedCourseId);

}
