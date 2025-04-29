package com.centralizedData.centralized.repository.Curriculum;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.centralizedData.centralized.model.curriculum.BosDataDocuments;

@Repository
public interface BosDataDocumentDao extends JpaRepository<BosDataDocuments, Long> {

	@Modifying
	@Query(value = "delete from ce_curriculum_bos_documents where bos_id = :bosId", nativeQuery = true)
	void deleteByBosId(Long bosId);

	Optional<BosDataDocuments> findByBosDataId_Id(Long bosDocumentId);

}
