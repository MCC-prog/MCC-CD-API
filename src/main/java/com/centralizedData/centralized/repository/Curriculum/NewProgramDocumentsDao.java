package com.centralizedData.centralized.repository.Curriculum;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.centralizedData.centralized.model.curriculum.NewProgramDocuments;

@Repository
public interface NewProgramDocumentsDao extends JpaRepository<NewProgramDocuments, Long> {

	@Modifying
	@Query(value = "delete from ce_curriculum_new_program_documents where new_program_id = :id", nativeQuery = true)
	void deleteByNewProgramId(Long id);

	List<NewProgramDocuments> findByNewProgram_Id(Long newProgramId);

	
}
