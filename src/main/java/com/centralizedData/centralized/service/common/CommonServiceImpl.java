package com.centralizedData.centralized.service.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centralizedData.centralized.dto.admin.AcademicYearDto;
import com.centralizedData.centralized.dto.admin.CourseNewDto;
import com.centralizedData.centralized.dto.admin.CoursesDto;
import com.centralizedData.centralized.dto.admin.DepartmentEntryDto;
import com.centralizedData.centralized.dto.admin.ProgramDto;
import com.centralizedData.centralized.dto.admin.ProgramTypeDto;
import com.centralizedData.centralized.dto.admin.SubjectEntryDto;
import com.centralizedData.centralized.exception.ResourceNotFoundException;
import com.centralizedData.centralized.model.admin.AcademicYear;
import com.centralizedData.centralized.model.admin.Courses;
import com.centralizedData.centralized.model.admin.DepartmentEntry;
import com.centralizedData.centralized.model.admin.Program;
import com.centralizedData.centralized.model.admin.ProgramType;
import com.centralizedData.centralized.model.employee.Department;
import com.centralizedData.centralized.model.employee.Stream;
import com.centralizedData.centralized.repository.AcademicYearRepository;
import com.centralizedData.centralized.repository.CourseRepository;
import com.centralizedData.centralized.repository.DepartmentEntryRepository;
import com.centralizedData.centralized.repository.ProgramRepository;
import com.centralizedData.centralized.repository.ProgramTypeRepository;
import com.centralizedData.centralized.repository.StreamRepository;


@Service
public class CommonServiceImpl implements CommonService{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CommonServiceImpl.class);
	
	@Autowired
	AcademicYearRepository adminAcademicYearRepository;
	
	@Autowired
	ProgramRepository programRepository;
	
	@Autowired
	CourseRepository courseRepository;
	
	@Autowired
	DepartmentEntryRepository departmentEntryRepository;
	
	@Autowired
	StreamRepository streamRepository;
	
	@Autowired
	ProgramTypeRepository programTypeRepository;
	
	@Override
	public List<AcademicYear> getAllAcademicYear() {
		List<AcademicYear> activeAcademicYear = adminAcademicYearRepository.getByIsActive();
		LOGGER.info("Getting all active AcademicYear:"+activeAcademicYear.toString());
		return activeAcademicYear;
	}


	@Override
	public Optional<AcademicYear> getAcademicYearById(Long id) {
		return adminAcademicYearRepository.findById(id);
	}

	@Override
	public List<AcademicYearDto> getAllDispalayYear() {
		LOGGER.info("in getAllDisplayYear method of serviceImpl class");
		try {
			ArrayList<AcademicYearDto> list = new ArrayList<AcademicYearDto>();
		List<AcademicYear> listOfAcademicYear = adminAcademicYearRepository.findAll();
		for(AcademicYear year : listOfAcademicYear) {
			AcademicYearDto dto = new AcademicYearDto();
			dto.setId(year.getId());
			if(year.getYear() != null)
				dto.setYear(year.getYear());
			if(year.getDisplay() != null)
				dto.setDisplayYear(year.getDisplay());
			if(year.getIsCurrent() != null)
				dto.setIsCurrent(year.getIsCurrent());
			if(year.getIsCurrentForAdmission() != null)
				dto.setIsCurrentForAdmission(year.getIsCurrentForAdmission());
			list.add(dto);
		}
		
		// Sorting years in ascending order
		 Collections.sort(list);
		return list;
		}catch(Exception e) {
			LOGGER.error("in getAllDisplayYear method of serviceImpl class"+e.getMessage());
			return null;
		}		
	}
	
	
	@Override
	public List<ProgramDto> getAllProgram() {
		LOGGER.info("In getAllProgram method of serviceImpl class");
		List<Program> listOfActiveProgram = programRepository.getByIsActive();
		List<ProgramDto> dtos = new ArrayList<ProgramDto>();
		if(listOfActiveProgram!=null) {
			for(Program  activeProgram : listOfActiveProgram) {
				ProgramDto dto=new ProgramDto();
				dto.setId(activeProgram.getId());
				dto.setCode(activeProgram.getCode());
				dto.setName(activeProgram.getName());
				dto.setStream(activeProgram.getStream());
				dto.setProgramTypeId(activeProgram.getProgramType().getId());
				dto.setProgramTypeName(activeProgram.getProgramType().getName());
				dto.setCertificateProgramName(activeProgram.getCertificateProgramName());
				dto.setIsMotherTongue(activeProgram.getIsMotherTongue());
				dto.setIsSecondLanguage(activeProgram.getIsSecondLanguage());
				dto.setIsDisplaylanguageKnown(activeProgram.getIsDisplaylanguageKnown());
				dto.setIsHeightWeight(activeProgram.getIsHeightWeight());
				dto.setIsFamilyBackground(activeProgram.getIsFamilyBackground());
				dto.setIsEntranceDetails(activeProgram.getIsEntranceDetails());
				dto.setIsDisplayTrainingshortCourse(activeProgram.getIsDisplayTrainingshortCourse());
				dto.setIsLateralDetails(activeProgram.getIsLateralDetails());
				dto.setIsAdditionalInfo(activeProgram.getIsAdditionalInfo());
				dto.setIsExtraDetails(activeProgram.getIsAdditionalInfo());
				dto.setIsTcDisplay(activeProgram.getIsTcDisplay());
				dto.setIsOpen(activeProgram.getIsOpen());
				dto.setAcademic_year(activeProgram.getAcademic_year());
				dto.setIsExamCenterRequired(activeProgram.getIsExamCenterRequired());
				dto.setIsRegistrationNo(activeProgram.getIsRegistrationNo());
				dtos.add(dto);
			}
		}
		LOGGER.info("Getting all active Currency");
		return dtos;
	}


	@Override
	public ProgramDto getProgramById(Long id) {
		LOGGER.info("In getProgramById method of serviceImpl class");
		Optional<Program> program = programRepository.findById(id);
		ProgramDto dto=null;
		if(program!=null) {
			dto=new ProgramDto();
			Program  pp =program.get();
			dto.setId(pp.getId());
			dto.setCode(pp.getCode());
			dto.setName(pp.getName());
			dto.setStream(pp.getStream());
			dto.setProgramTypeId(pp.getProgramType().getId());
			dto.setCertificateProgramName(pp.getCertificateProgramName());
			dto.setIsMotherTongue(pp.getIsMotherTongue());
			dto.setIsSecondLanguage(pp.getIsSecondLanguage());
			dto.setIsDisplaylanguageKnown(pp.getIsDisplaylanguageKnown());
			dto.setIsHeightWeight(pp.getIsHeightWeight());
			dto.setIsFamilyBackground(pp.getIsFamilyBackground());
			dto.setIsEntranceDetails(pp.getIsEntranceDetails());
			dto.setIsDisplayTrainingshortCourse(pp.getIsDisplayTrainingshortCourse());
			dto.setIsLateralDetails(pp.getIsLateralDetails());
			dto.setIsAdditionalInfo(pp.getIsAdditionalInfo());
			dto.setIsExtraDetails(pp.getIsAdditionalInfo());
			dto.setIsTcDisplay(pp.getIsTcDisplay());
			dto.setIsOpen(pp.getIsOpen());
			dto.setAcademic_year(pp.getAcademic_year());
			dto.setIsExamCenterRequired(pp.getIsExamCenterRequired());
			dto.setIsRegistrationNo(pp.getIsRegistrationNo());
		}
		return dto;
	}

	public List<ProgramDto> getProgramByIdFilter(Long programTypeId) {
		List<Program> programss = programRepository.findProgramByProgramTypeId(programTypeId);
		List<ProgramDto> programArray = new ArrayList<ProgramDto>();
		if(programss != null) {
			for(Program program: programss) {
				ProgramDto programDto = new ProgramDto();
				programDto.setId(program.getId());
				programDto.setName(program.getName());
				//programDto.setProgramType(programss.getClass());

				programArray.add(programDto);

			}
		}
		LOGGER.info("Getting all active course :" + programss.toString());
		return programArray;
	}
	@Override
	public List<CoursesDto> getAllCourses() {
		List<Courses> ListActiveCourses = courseRepository.getByIsActive();
		List<CoursesDto> dtos = new ArrayList<CoursesDto>();
		if(ListActiveCourses!=null) {
			for(Courses activeCourses : ListActiveCourses) {
				CoursesDto dto=new CoursesDto();
				dto.setId(activeCourses.getId());
				dto.setCourseName(activeCourses.getCourseName());
				dto.setProgramId(activeCourses.getProgram().getId());
				dto.setProgramName(activeCourses.getProgram().getName());
				dto.setProgramTypeId(activeCourses.getProgram().getProgramType().getId());
				dto.setProgramTypeName(activeCourses.getProgram().getProgramType().getName());
				dto.setMaxIntake(activeCourses.getMaxIntake());
				dto.setIsAutonomous(activeCourses.getIsAutonomous());
				dto.setIsWorkExperienceRequired(activeCourses.getIsWorkExperienceRequired());
				dto.setIsDetailMarksPrint(activeCourses.getIsDetailMarksPrint());
				dto.setPayCode(activeCourses.getPayCode());
				dto.setIntapplicationFees(activeCourses.getIntapplicationFees());
				dto.setAmount(activeCourses.getAmount());
				dtos.add(dto);
			}
		}
		LOGGER.info("Getting all active ReligionSection :");
		return dtos;
	}

	@Override
	public CoursesDto getCoursesById(Long id) {
		Optional<Courses> courses= courseRepository.findById(id);
		CoursesDto dto1=new CoursesDto();
		if(courses!=null) {		
			dto1.setId(courses.get().getId());
			dto1.setCourseName(courses.get().getCourseName());
			dto1.setBankNameCourse(courses.get().getBankNameCourse());
			dto1.setBankNameFullCourse(courses.get().getBankNameFullCourse());
			dto1.setBankIncludeSectionCourse(courses.get().getBankIncludeSectionCourse());
			dto1.setCourseNameCertificate(courses.get().getCourseNameCertificate());
			dto1.setMaxIntake(courses.get().getMaxIntake());
			dto1.setProgramId(courses.get().getProgram().getId());
			dto1.setProgramTypeId(courses.get().getProgram().getProgramType().getId());
			dto1.setIsAutonomous(courses.get().getIsAutonomous());
			dto1.setIsWorkExperienceRequired(courses.get().getIsWorkExperienceRequired());
			dto1.setIsDetailMarksPrint(courses.get().getIsDetailMarksPrint());
			dto1.setPayCode(courses.get().getPayCode());
			dto1.setIntapplicationFees(courses.get().getIntapplicationFees());
			dto1.setIsWorkExpMandatory(courses.get().getIsWorkExpMandatory());
			dto1.setIsAppearInOnline(courses.get().getIsAppearInOnline());
			dto1.setIsApplicationProcessSms(courses.get().getIsApplicationProcessSms());
			dto1.setOnlyForApplication(courses.get().getOnlyForApplication());
			dto1.setRegNoStartPrefix(courses.get().getRegNoStartPrefix());
//			dto1.setCourseCommencementDate(courses.get().getCourseCommencementDate());
			dto1.setAmount(courses.get().getAmount());
		}
		return dto1;
	}

	@Override
	public List<CoursesDto> getAllCourseById(Long programId) {
		List<Courses> ListCourses = courseRepository.findCourse(programId);
		List<CoursesDto> dtos = new ArrayList<CoursesDto>();
		if(ListCourses!=null) {
			for(Courses activeCourses : ListCourses) {
				CoursesDto dto=new CoursesDto();
				dto.setId(activeCourses.getId());
				dto.setCourseName(activeCourses.getCourseName());
				dtos.add(dto);	
			}
		}
		LOGGER.info("Getting all active course :" + ListCourses.toString());
		return dtos;
	}

	@Override
	public List<CoursesDto> getCouresByProgramList(List<Long> listOfId) {

		//List<Long> courseIdList = new ArrayList<Long>();
		List<CoursesDto> courseArray = new ArrayList<CoursesDto>();
		for(Long courseLi: listOfId) {
			List<Courses> coureses = courseRepository.findByProgram_Id(courseLi);
			if (coureses != null) {
				for (Courses couses : coureses) {
					CoursesDto courseDto = new CoursesDto();
					courseDto.setId(couses.getId());
					courseDto.setCourseName(couses.getCourseName());
					//courseIdList.add(couses.getId());
					courseArray.add(courseDto);
				}
			}
		}
		return courseArray;

	}
	@Override
	public List<DepartmentEntryDto> getAllDepartmentEntry() {
		List<DepartmentEntry> listActiveDepartmentEntry = departmentEntryRepository.getByIsActive();
		List<DepartmentEntryDto> dtos = new ArrayList<DepartmentEntryDto>();
		if(listActiveDepartmentEntry!=null) {
			for(DepartmentEntry activeDepartmentEntry : listActiveDepartmentEntry) {
				DepartmentEntryDto dto=new DepartmentEntryDto();
				dto.setId(activeDepartmentEntry.getId());
				dto.setName(activeDepartmentEntry.getName());
				if(activeDepartmentEntry.getStream() != null) {
					dto.setStreamId(activeDepartmentEntry.getStream().getId());
					dto.setStreamName(activeDepartmentEntry.getStream().getName());
					dto.setStreamId(activeDepartmentEntry.getStream().getId());
				}
				dto.setCode(activeDepartmentEntry.getCode());
				dto.setIsAcademic(activeDepartmentEntry.getIsAcademic());
				dto.setWebId(activeDepartmentEntry.getWebId());
				dto.setHodmail(activeDepartmentEntry.getHodMail());
				dtos.add(dto);
			}
		}
		LOGGER.info("Getting all active DepartmentEntry");
		return dtos;
	}
	@Override
	public DepartmentEntryDto getDepartmentEntryById(Long id) {
		Optional<Department> departmentEntry= departmentEntryRepository.findByDepartmentId(id.intValue());
		DepartmentEntryDto dto=null;
		if(departmentEntry!=null) {
			dto=new DepartmentEntryDto();
			Department dEntry=departmentEntry.get();
			dto.setId(dEntry.getDepartmentId().longValue());
			dto.setName(dEntry.getDepartmentName());
			dto.setStreamId(dEntry.getStreamId().getId());
			dto.setStreamName(dEntry.getStreamId().getDisplayName());
			dto.setCode(dEntry.getCode());
			dto.setWebId(dEntry.getWebId());
			dto.setHodmail(dEntry.getHodMail());
			dto.setIsAcademic(dEntry.getIsAcademic());
		}
		return dto;
	}

	@Override
	public List<Stream> getAllStream() {
		List<Stream> activeStream = streamRepository.getByIsActive();
		LOGGER.info("Getting all active DocumentType :"+activeStream.toString());
		return activeStream;
	}


	@Override
	public List<DepartmentEntryDto> getDepartentFilterByStreamId(Long streamId) {
		List<DepartmentEntry> department = departmentEntryRepository.findDepartmenByStreamId(streamId);
		List<DepartmentEntryDto> departmentArray = new ArrayList<DepartmentEntryDto>();
		if(department != null) {
			for(DepartmentEntry departmentEntry: department) {
				DepartmentEntryDto departmentEntryDto = new DepartmentEntryDto();
				departmentEntryDto.setId(departmentEntry.getId());
				departmentEntryDto.setName(departmentEntry.getName());
				departmentArray.add(departmentEntryDto);

			}
		}
		LOGGER.info("Getting all active department :" + department.toString());
		return departmentArray;
	}

	@Override
	public List<ProgramTypeDto> getAllProgramType() {
		LOGGER.info("In getAllProgramType method in serviceImpl");
		List<ProgramTypeDto> list = new ArrayList<ProgramTypeDto>();
		List<ProgramType> activeProgramType = programTypeRepository.getByIsActive();
		if(activeProgramType != null){
			for(ProgramType p : activeProgramType) {
			ProgramTypeDto dto = new ProgramTypeDto();
			dto.setId(p.getId());
			dto.setName(p.getName());	
			list.add(dto);
			}
		}
		LOGGER.info("Getting all active ProgramType:"+activeProgramType.toString());
		return list;
	}


	@Override
	public List<CoursesDto> getDepartentFilterByDeptProgramType(Long departId, Long programTypeId) {
		try {
		List<Object[]> courses = programRepository.getCoursesByDeptProgramType(departId,programTypeId);
		List<CoursesDto> coursesArray = new ArrayList<CoursesDto>();
		if(courses != null) {
			for(Object[] coursesList: courses) {
				CoursesDto coursesDto = new CoursesDto();
				coursesDto.setId(Long.parseLong(coursesList[0].toString()));
				coursesDto.setCourseName(coursesList[1].toString());
				coursesArray.add(coursesDto);

			}
		}
		LOGGER.info("Getting all active courses :" + courses.toString());
		return coursesArray;
		} catch(Exception e) {
			throw e;
		}
	}


	@Override
	public List<ProgramTypeDto> getProgramTypeFilterByDepartent(Long departId) {
		List<Object[]> programType = programRepository.findProgramTypeByDepartmenId(departId);
		List<ProgramTypeDto> programTypeArray = new ArrayList<ProgramTypeDto>();
		if(programType != null) {
			for(Object[] programTypeList: programType) {
				ProgramTypeDto programTypeDto = new ProgramTypeDto();
				programTypeDto.setId(Long.parseLong(programTypeList[0].toString()));
				programTypeDto.setName((programTypeList[1].toString()));
				programTypeArray.add(programTypeDto);

			}
		}
		LOGGER.info("Getting all active ProgramType :" + programType.toString());
		return programTypeArray;
	}


	@Override
	public List<CourseNewDto> getcoursesByFilters(Long deptId, Long programTypeId, Long programId) {
		LOGGER.info("In getcoursesByFilters method of CommonServiceImpl class");
		List<CourseNewDto> coursesArray = new ArrayList<CourseNewDto>();
		List<Object[]> courses = programRepository.getCoursesByDeptIdProgramTypeIdAndProgramId(deptId, programTypeId,
				programId);

		if (courses.isEmpty()) {
			LOGGER.error("No courses found for the given filters.");
			throw new ResourceNotFoundException("No courses found for the provided filters.");
		} else {
			for (Object[] coursesList : courses) {
				CourseNewDto coursesDto = new CourseNewDto();
				coursesDto.setId(Long.parseLong(coursesList[0].toString()));
				coursesDto.setCourseName(coursesList[1].toString());
				coursesArray.add(coursesDto);
			}
		}
		return coursesArray;
	}


	@Override
	public List<SubjectEntryDto> getsubjectsByFilters(Long deptId, Long streamId) {
		LOGGER.info("In getsubjectsByFilters method of CommonServiceImpl class");
		List<SubjectEntryDto> list = new ArrayList<SubjectEntryDto>();
		List<Object[]> subjects = departmentEntryRepository.getsubjectsByDeptIdStreamId(deptId, streamId);

		if (subjects.isEmpty()) {
			LOGGER.error("No subjects found for the given filters.");
			throw new ResourceNotFoundException("No subjects found for the provided filters.");
		} else {
			for (Object[] subjectsList : subjects) {
				SubjectEntryDto coursesDto = new SubjectEntryDto();
				coursesDto.setId(Long.parseLong(subjectsList[0].toString()));
				coursesDto.setName(subjectsList[1].toString());
				list.add(coursesDto);
			}
		}
		return list;
	}
	
	
}
