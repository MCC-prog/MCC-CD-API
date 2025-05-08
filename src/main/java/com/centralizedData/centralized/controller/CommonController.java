package com.centralizedData.centralized.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.centralizedData.centralized.dto.admin.AcademicYearDto;
import com.centralizedData.centralized.dto.admin.CourseNewDto;
import com.centralizedData.centralized.dto.admin.CoursesDto;
import com.centralizedData.centralized.dto.admin.DepartmentEntryDto;
import com.centralizedData.centralized.dto.admin.ProgramDto;
import com.centralizedData.centralized.dto.admin.ProgramTypeDto;
import com.centralizedData.centralized.dto.admin.SubjectEntryDto;
import com.centralizedData.centralized.exception.ResourceNotFoundException;
import com.centralizedData.centralized.model.admin.AcademicYear;
import com.centralizedData.centralized.model.employee.Stream;
import com.centralizedData.centralized.service.common.CommonService;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;


@CrossOrigin(origins = "*")
//@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping({ "/", "/centralized/commonApi" })
@AllArgsConstructor
@RequiredArgsConstructor
public class CommonController {

	private static final Logger log = LoggerFactory.getLogger(CommonController.class);

	@Autowired
	HttpServletRequest request;

	@Autowired
	CommonService commonService;

	@GetMapping("/getAllAcademicYear")
	public List<AcademicYear> getAcademicYear() {
		log.info("Get AcademicYear  Controller =>");
		return commonService.getAllAcademicYear();
	}

	@GetMapping("/getAcademicYearById/{id}")
	public Optional<AcademicYear> getAcademicYear(@PathVariable Long id) {
		return commonService.getAcademicYearById(id);
	}

	@GetMapping("/getAllYears")
	public List<AcademicYearDto> getAllYear() {
		String userName = (String) request.getAttribute("userName");
		log.info("Getting all years of AcademicYear in Controller");
		return commonService.getAllDispalayYear();
	}

	// Stream
	@GetMapping("/getAllStream")
	public List<Stream> getStream() {
		log.info("Get Stream  Controller =>");
		return commonService.getAllStream();
	}
	
	@GetMapping("/getAllDepartmentEntry")
	public List<DepartmentEntryDto> getDepartmentEntry() {
		log.info("Get DepartmentEntry  Controller =>");
		return commonService.getAllDepartmentEntry();
	}

	@GetMapping("/getDepartmentByStream")
	public List<DepartmentEntryDto> getDepartmentByStream(@RequestParam(value = "streamId") Long streamId) {
		log.info("get Stream  Controller =>" + streamId);
		return commonService.getDepartentFilterByStreamId(streamId);

	}

	@GetMapping("/getProgramTypeByDept")
	public List<ProgramTypeDto> getProgramTypeByDept(@RequestParam(value = "deptId") Long deptId) {
		log.info("get getProgramTypeByDept  Controller =>" + deptId);
		return commonService.getProgramTypeFilterByDepartent(deptId);
	}
	
	@GetMapping("/ProgramsByProgramTypeId")
	public List<ProgramDto> getProgramId(@RequestParam(value = "programTypeId") Long programTypeId) {
		log.info("get programtype  Controller =>" + programTypeId);
		return commonService.getProgramByIdFilter(programTypeId);
	}
	
	@GetMapping("/getCourseByProgramId")
	public List<CoursesDto> getCourse(@RequestParam(value = "programId") Long programId) {
		log.info("get Courses  Controller =>" + programId);
		return commonService.getAllCourseById(programId);
	}

	

	@GetMapping("/getCoursesByDeptProgramType")
	public List<CoursesDto> getCoursesByDeptProgramType(@RequestParam(value = "deptId") Long deptId,
			@RequestParam(value = "programTypeId") Long programTypeId) {
		log.info("get getCoursesByDeptProgramType  Controller =>" + deptId, programTypeId);
		return commonService.getDepartentFilterByDeptProgramType(deptId, programTypeId);
	}
	
	
	//added by arun
	@GetMapping("/getCoursesByDeptIdProgramTypeIdPId")
	public ResponseEntity<?> getCoursesByDeptIdProgramTypeIdPId(
			@RequestParam Long deptId,
            @RequestParam Long programTypeId,
			@RequestParam(required = false) Long programId) {
		log.info("Entered getCoursesByDeptIdProgramTypeIdPId method in CommonController");
		try {
			List<CourseNewDto> courseList = commonService.getcoursesByFilters(deptId, programTypeId, programId);
			return ResponseEntity.ok(courseList);
		} catch (ResourceNotFoundException e) {
			log.warn("No courses found for the given filters.");
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		} catch (Exception e) {
			log.error("Error fetching courses", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while fetching courses data.");
		}
	}
	
	
	@GetMapping("/getSubjectsByDeptIdStreamId")
	public ResponseEntity<?> getSubjectsByDeptIdStreamId(
			@RequestParam Long deptId,
            @RequestParam Long streamId) {
		log.info("Entered getSubjectsByDeptIdStreamId method in CommonController");
		try {
			List<SubjectEntryDto> subjectList = commonService.getsubjectsByFilters(deptId, streamId);
			return ResponseEntity.ok(subjectList);
		} catch (ResourceNotFoundException e) {
			log.warn("No subjects found for the given filters.");
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		} catch (Exception e) {
			log.error("Error fetching subjects", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while fetching subjects data.");
		}
	}
	
	//arun code ended
	

	@GetMapping("/coursesList")
	public List<CoursesDto> getCourseByProgramList(HttpServletRequest request) {
		List<Long> listOfId = new ArrayList<Long>();
		String[] programId = request.getParameterValues("programId");
		for (String programIds : programId) {
			Long varLong = Long.parseLong(programIds);
			listOfId.add(varLong);

		}
		log.info("get coursesList Multiple  Controller =>" + programId);
		return commonService.getCouresByProgramList(listOfId);
	}

	@GetMapping("/getDepartmentEntryById/{id}")
	public DepartmentEntryDto getDepartmentEntry(@PathVariable Long id) {
		return commonService.getDepartmentEntryById(id);
	}
	
	@GetMapping("/getAllProgramType")
	public List<ProgramTypeDto> getProgramType() {
		log.info("In getProgramType method in controller class");
		return commonService.getAllProgramType();
	}

	@GetMapping("/getAllProgram")
	public List<ProgramDto> getProgram() {
		log.info("In getCurrencyAll method in controller class");
		return commonService.getAllProgram();
	}
	
	@GetMapping("/getAllCourses")
	public List<CoursesDto> getCourses() {
		log.info("Get Courses  Controller =>");
		return commonService.getAllCourses();
	}

	@GetMapping("/getProgramByProgramId/{id}")
	public ProgramDto getProgram(@PathVariable Long id) {
		log.info("In getCurrencyAll method in controller class");
		return commonService.getProgramById(id);
	}
	

	@GetMapping("/getCoursesById/{id}")
	public CoursesDto getCourses(@PathVariable Long id) {
		return commonService.getCoursesById(id);
	}

	

}
