package com.centralizedData.centralized.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.centralizedData.centralized.model.employee.Department;


@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

	List<Department> findBystreamId_IdAndIsActive(Long departmentId, Boolean b);

	Optional<Department> findById(Long departmentId);

}
