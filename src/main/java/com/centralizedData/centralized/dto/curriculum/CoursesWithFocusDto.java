package com.centralizedData.centralized.dto.curriculum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CoursesWithFocusDto {
	private Long CoursesWithFocusId;
    private Integer academicYear;
    private String semType;
    private Integer semNumber;
    private Long streamId;
    private Long departmentId;
    private Long programTypeId;
    private Long programId;
    private String focusArea;
    private String subjectTittle;
    private String courseType;
 
}
