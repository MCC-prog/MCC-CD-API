package com.centralizedData.centralized.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.centralizedData.centralized.model.admin.AcademicYear;

public interface AcademicYearRepository extends JpaRepository<AcademicYear,Long>{
	
	@Query("from AcademicYear c where c.isActive=true order by year")
	List<AcademicYear> getByIsActive();

	@Query("from AcademicYear c where c.isActive=true and c.id != :id and c.year = :year")
	AcademicYear getByYear(Integer year, Long id);

	AcademicYear findByYear(Integer year);

	AcademicYear findByIsCurrent(boolean b);

	AcademicYear findByIsCurrentForAdmission(boolean b);

	List<AcademicYear> findByIsActiveOrderByYearDesc(boolean b);

	List<AcademicYear> findByIsActiveOrderByYearAsc(boolean b);

	@Query("from AcademicYear a where a.isCurrent=1")
	AcademicYear getYear();

	@Query("Select a.year from AcademicYear a where a.isActive=1 and a.isCurrent=1")
	Integer getAcademicyear();

}
