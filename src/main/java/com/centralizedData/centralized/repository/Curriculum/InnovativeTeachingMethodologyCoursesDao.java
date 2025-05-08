package com.centralizedData.centralized.repository.Curriculum;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.centralizedData.centralized.model.curriculum.InnovativeTeachingMethodologyCourses;

@Repository
public interface InnovativeTeachingMethodologyCoursesDao extends JpaRepository<InnovativeTeachingMethodologyCourses, Long> {

	@Modifying
	@Query(value = "delete from ce_curriculum_innovative_teaching_methodology_course "
			+ "where innovative_teaching_methodology_id = :innovativeMethodologyId", nativeQuery = true)
	void deleteByInnvovativeMethId(Long innovativeMethodologyId);



}
