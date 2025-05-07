package com.centralizedData.centralized.dto.admin;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseSettingsForApplicationDto {

	private Long id;
	private String programTypeMapId;
	private Map<Long, String> programTypeMap;
	private String programMapId;
	private Map<Long, String> programMap;
	private Map<Long, String> courseMap;
	private String courses;
	private Map<Long, String> selectedCourseMap;
	private String[] selectedCourses;
	private String applicationFee;
	private String applicationFeeIntl;
	private String currencyMapId;
	private Map<Long, String> currencyMap;
	private String payCode;
	private String courseCommencementDate;
	private String workExpRequired;
	private String workExpMandatory;
	private String applicationProcessingSms;
	private String isTcDisplay;
	private String motherTongue;
	private String secondLanguage;
	private String displayKnownLanguage;
	private String heightAndWeight;
	private String familyBackground;
	private String entranceDetails;
	private String lateralDetails;
	private String trainingShortCourse;
	private String transferCourse;
	private String isDetailMarksPrint;
	private String extraCurriculum;
	//private String isOnlineApplnOpen;
	private String appearInOnline;
	private String onlineApplnFor;
	private String seatNoGenRequired;
	private String additionalInformation;
	private String interdisciplinary;
	private List <InterAdmissionSessionDto> interAdmisssionSessionList;
	private List<CourseNewDto> courseToList;
	private String disabled;
	private String listSize;
	private String currentListSize;
	private String editForm;
	private List<CourseApplicationOpenSessionNewDto> courseApplicationOpenSessionList;
	private String applnListSize;
	private String currentApplnListSize;
	private String errMsg;
	private String eAdmitCardGeneration;
	private String statusTextOnSubmisstionOfApplnOnline;
	private String statusTextOnSubmisstionOfApplnOffline;
	private String statusTextOnAcknowledgementOnline;
	private String statusTextOnAcknowledgementOffline;
	private String origOnlineApplnFor;
	private String blockMarkEntryQualifyingExam;
	private List<CourseUniversityMarksSettingsDto> courseUniversityMarkSettingsList;
	private String currentUniversityListSize;
	private String universityListSize;
	private Map<Long, String> universityMap;
	private String documentType;
	private Map<String, String> documentTypeMap;
}
