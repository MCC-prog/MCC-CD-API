package com.centralizedData.centralized.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.centralizedData.centralized.dto.admin.CoursesDto;
import com.centralizedData.centralized.model.admin.Courses;
import com.centralizedData.centralized.model.admin.Program;
import com.centralizedData.centralized.model.admin.ProgramType;

public interface ProgramRepository extends JpaRepository<Program, Long> {
	
	@Query("from Program c where c.isActive=1")
	List<Program> getByIsActive();
	
	@Query("from Program c where c.id=:id")
	Program getById(Long id);

	Optional<Program> findById(Integer programId);

	@Query("from Program p where p.programType.id=:programTypeId")
    List<Program> findProgramByProgramTypeId(@Param("programTypeId") Long programTypeId);

	Program findByName(String name);

	@Query("from Program c where c.isActive=1 and c.name=:name and c.id!=:id")
	Program getByName(String name, Long id);

	@Query("select p from Program p where p.id=:pgmId")
	String getprogramNameById(String pgmId);

	@Query("from Program bo where bo.id=:id and bo.isActive=true")
	Program findById(long id);

	@Query("from ProgramType where isActive=1")
	List<ProgramType> getProgramType();

	Long findByIdAndIsActiveAndProgramType_IsActive(long courseId, boolean b, boolean c);

	@Query("from Program p where p.stream!=null and p.stream !='' ")
	List<Program> getStreamDetails();
	
	@Query( value = "SELECT course.id , course.name "
			+ "FROM program program "
			+ "INNER JOIN program_type program_type "
			+ "ON (program.program_type_id = program_type.id) "
			+ "INNER JOIN course course "
			+ "ON (program.id = course.program_id) "
			+ "INNER JOIN course_department course_department "
			+ "ON (course_department.course_id = course.id) "
			+ "INNER JOIN department department "
			+ "ON (course_department.department_id = department.id) "
			+ "where department.id = :departId  and program_type.id = :programTypeId", nativeQuery = true)
	 List<Object[]> getCoursesByDeptProgramType(@Param("departId") Long departId, @Param("programTypeId") Long programTypeId);
	
	@Query(value = "SELECT program_type.id,program_type.name "
			+ "FROM program    program "
			+ "INNER JOIN program_type program_type "
			+ "ON (program.program_type_id = program_type.id) "
			+ "INNER JOIN course course "
			+ "ON (program.id = course.program_id) "
			+ "INNER JOIN course_department course_department "
			+ "ON (course_department.course_id = course.id) "
			+ "INNER JOIN department department "
			+ "ON (course_department.department_id = department.id) "
			+ "where department.id = :departId "
			+ "group by program_type.name ", nativeQuery = true)
	List<Object[]> findProgramTypeByDepartmenId(@Param("departId") Long departId);

	@Query( value = "SELECT course.id , course.name "
			+ "FROM program program "
			+ "INNER JOIN program_type program_type "
			+ "ON (program.program_type_id = program_type.id) "
			+ "INNER JOIN course course "
			+ "ON (program.id = course.program_id) "
			+ "INNER JOIN course_department course_department "
			+ "ON (course_department.course_id = course.id) "
			+ "INNER JOIN department department "
			+ "ON (course_department.department_id = department.id) "
			+ "where department.id = :departId "
			+ "and program_type.id = :programTypeId "
			+ "and (:programId IS NULL OR program.id = :programId)", nativeQuery = true)
	List<Object[]> getCoursesByDeptIdProgramTypeIdAndProgramId(Long departId, Long programTypeId, Long programId);

}
