package com.centralizedData.centralized.repository.Curriculum;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.centralizedData.centralized.model.curriculum.InnovativeTeachingMethodologyDocument;

@Repository
public interface InnovativeTeachingMethodologyDocumentDao extends JpaRepository<InnovativeTeachingMethodologyDocument, Long> {

	@Modifying
	@Query(value = "delete from ce_curriculum_innovative_teaching_methodology_document "
			+ "where innovative_teaching_methodology_id = :id", nativeQuery = true)
	void deleteByInnovativeMethId(Long id);

	Optional<InnovativeTeachingMethodologyDocument> findByInnovativeTeachingMethodology_Id(Long innovativeMethodologyId);

}
