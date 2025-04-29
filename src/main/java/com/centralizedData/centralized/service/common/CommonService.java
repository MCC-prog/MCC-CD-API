package com.centralizedData.centralized.service.common;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.centralizedData.centralized.dto.admin.AcademicYearDto;
import com.centralizedData.centralized.dto.admin.CourseNewDto;
import com.centralizedData.centralized.dto.admin.CoursesDto;
import com.centralizedData.centralized.dto.admin.DepartmentEntryDto;
import com.centralizedData.centralized.dto.admin.ProgramDto;
import com.centralizedData.centralized.dto.admin.ProgramTypeDto;
import com.centralizedData.centralized.dto.admin.SubjectEntryDto;
import com.centralizedData.centralized.model.admin.AcademicYear;
import com.centralizedData.centralized.model.employee.Stream;

@Service
public interface CommonService {

	List<AcademicYear> getAllAcademicYear();

	Optional<AcademicYear> getAcademicYearById(Long id);

	List<AcademicYearDto> getAllDispalayYear();

	List<ProgramDto> getAllProgram();

	ProgramDto getProgramById(Long id);

	List<CoursesDto> getAllCourses();

	CoursesDto getCoursesById(Long id);

	List<CoursesDto> getAllCourseById(Long programId);

	List<CoursesDto> getCouresByProgramList(List<Long> listOfId);

	List<DepartmentEntryDto> getAllDepartmentEntry();

	DepartmentEntryDto getDepartmentEntryById(Long id);

	List<ProgramDto> getProgramByIdFilter(Long programTypeId);

	List<Stream> getAllStream();

	List<DepartmentEntryDto> getDepartentFilterByStreamId(Long streamId);

	List<ProgramTypeDto> getAllProgramType();

	List<CoursesDto> getDepartentFilterByDeptProgramType(Long departId, Long programTypeId);

	List<ProgramTypeDto> getProgramTypeFilterByDepartent(Long departId);

	List<CourseNewDto> getcoursesByFilters(Long deptId, Long programTypeId, Long programId);

	List<SubjectEntryDto> getsubjectsByFilters(Long deptId, Long streamId);




	
	
	
}
