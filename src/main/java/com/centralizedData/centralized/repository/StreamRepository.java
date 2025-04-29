package com.centralizedData.centralized.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.centralizedData.centralized.model.employee.Stream;

public interface StreamRepository extends JpaRepository<Stream, Integer>{

	@Query("from Stream c where c.isActive=1")
	List<Stream> getByIsActive();

	Optional<Stream> findByNameAndIsActive(String streamName, boolean b);

	List<Stream> findByIsActive(boolean b);

	@Query("from Stream d where d.id =:streamId")
	Stream findById(@Param("streamId") Long streamId);

}
