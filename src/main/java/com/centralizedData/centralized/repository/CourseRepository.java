package com.centralizedData.centralized.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.centralizedData.centralized.model.admin.Courses;

@Repository
public interface CourseRepository extends JpaRepository<Courses, Long> {

	@Query("from Courses c where c.isActive=1")
	List<Courses> getByIsActive();

	Courses findByCourseName(String courseName);

	@Query("Select p from Courses p where p.program.id=:programId")
	List<Courses> findCourse(@Param("programId") Long programId);

	List<Courses> findByProgram_Id(Long long1);

	Courses findCourseById(Long id);

	@Query("from Courses bo where bo.isActive=1 and bo.id=:id")
	Courses getCourseById(Long id);

	@Query("from Courses bo where bo.isActive=1 and bo.program.isActive=1 and bo.program.id=:id ")
	List<Courses> getCoursesByProgram(Long id);

	@Query("from Courses where id = :courseId and isActive=1 and program.isActive=1 and "
			+ "program.programType.isActive = 1")
	Courses getByCourseId(Long courseId);

	@Query("from Courses course where course.isActive = 1 and course.program.isActive=1 order by program.programType.name asc, program.name, name")
	List<Courses> getActiveCourses();

	@Query("from Courses course where course.isActive = 1 and course.program.isActive=1 and course.onlyForApplication=0 "
			+ "order by program.programType.name asc, program.name")
	List<Courses> getCousesList();

	@Query("from Courses bo " + "where bo.isActive = 1 " + "and bo.program.isActive = 1 "
			+ "and bo.program.programType.id = :programTypeId "
			+ "group by bo.program.programType, bo.program.name, bo.courseName "
			+ "order by bo.program.programType desc")
	List<Courses> getCousesListByFilter(Long programTypeId);

	List<Courses> findByIdIn(List<Long> courseList);

	@Query("select c.courseName from Courses c where c.id=:courseId")
	String getCoursesNames(long courseId);

	@Query("from Courses c where c.isActive=1 and c.program.id=:progmId")
	List<Courses> getByProgramId(long progmId);

	@Query("from Courses bo where bo.isActive = 1 and bo.program.isActive=1 group by bo.program.programType,"
			+ " bo.program.name,bo.courseName order by bo.program.programType desc")
	List<Courses> getAllData();

	@Query("from Courses c where c.id IN (:listCourses)")
	List<Courses> getByIds(ArrayList<Long> listCourses);

	@Query("from Courses bo where bo.isActive = 1 and bo.program.isActive=1 group by bo.program.programType,bo.program.name,bo.courseName"
			+ " order by bo.program.programType desc")
	List<Courses> getExamActiveCourses();

	@Query("from Courses course where course.isActive = 1 and course.program.isActive=1 and course.onlyForApplication=0 "
			+ "order by program.programType.name asc, program.name")
	List<Courses> getCousesLists();

	@Query("from Courses where id = :cou")
	Courses loadByCourseId(Long cou);

	
}