package com.centralizedData.centralized.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.centralizedData.centralized.model.admin.SubjectEntry;

@Repository
public interface SubjectEntryRepository extends JpaRepository<SubjectEntry, Long>{

	SubjectEntry findByName(String subjectName);

	SubjectEntry findBySubjectCode(String subjectCode);

	List<SubjectEntry> findByIsActive(boolean b);

	List<SubjectEntry> findAllByIdIn(List<Long> subIdList);

	@Query("from SubjectEntry subject where subject.id = :subId")
	List<SubjectEntry> getBySubId(long subId);

	List<SubjectEntry> findByIdAndIsActive(long subId, boolean b);

    @Query(" from SubjectEntry s where s.id=:subId and s.isActive=1 ")
	SubjectEntry getPropertyValue(long subId);

    @Query("from SubjectEntry e where e.id=:subId")
   	List<SubjectEntry> getListOfSubEntry(long subId);

    @Query("from SubjectEntry s "
			+ "where (s.isOptionalSubject=1 or s.isSecondLanguage=1)"
			+ " and s.id= :subjectId")
List<SubjectEntry> checkOptionalAndSecondLang(long subjectId);

	List<SubjectEntry> findByIdInAndIsActive(List<Long> subList, boolean b);
}
