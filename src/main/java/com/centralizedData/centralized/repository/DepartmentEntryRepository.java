package com.centralizedData.centralized.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.centralizedData.centralized.dto.admin.DepartmentEntryDto;
import com.centralizedData.centralized.model.admin.DepartmentEntry;
import com.centralizedData.centralized.model.employee.Department;



@Repository
public interface DepartmentEntryRepository extends JpaRepository<Department, Integer> {

	@Query("from DepartmentEntry c where c.isActive=1")
	List<DepartmentEntry> getByIsActive();

	Department save(DepartmentEntryDto departmentEntry);

	Department findByDepartmentName(String name);

	@Query("from DepartmentEntry c where c.isActive=1 and c.name=:name and c.id!=:id")
	Department getByName(String name, Long id);

	List<Department> findByStreamId(int intValue);

	Optional<Department> findByDepartmentId(Integer iterateDepartment);

	List<Department> findByStreamId_Id(Long stramId);

	List<Department> findByIsActive(boolean b);

	Department findByDepartmentIdAndIsActive(Integer departmentId, boolean b);

	@Query("from Department c where c.isActive=1 order by departmentName")
	List<Department> getData();
	
	@Query("from DepartmentEntry d where d.id =:departmentId")
	DepartmentEntry findBiDepartmentId(@Param("departmentId") Long departmentId);

	@Query("from DepartmentEntry d where d.stream.id=:streamId")
	List<DepartmentEntry> findDepartmenByStreamId(@Param("streamId") Long streamId);

	@Query(value = "SELECT subject.id, subject.name "
			+ "FROM department department "
			+ "INNER JOIN emp_stream emp_stream "
			+ "ON department.stream_id = emp_stream.id "
			+ "INNER JOIN subject subject "
			+ "ON subject.department_id = department.id "
			+ "where department.id = :deptId and emp_stream.id = :streamId",nativeQuery = true)
	List<Object[]> getsubjectsByDeptIdStreamId(
	        @Param("deptId") Long deptId, 
	        @Param("streamId") Long streamId);
	
}
