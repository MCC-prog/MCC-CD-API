package com.centralizedData.centralized.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.centralizedData.centralized.model.admin.EmpStream;


@Repository
public interface EmpStreamRepository extends JpaRepository<EmpStream, Long> {

	List<EmpStream> findByIsActive(boolean b);

}
