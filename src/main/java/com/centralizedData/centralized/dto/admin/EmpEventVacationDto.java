package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmpEventVacationDto  implements Serializable{
	
private String id;
private String[] deptId;
private String deptNmae;
private Boolean isTeachingStaff;
private String fromDate;
private String toDate;
private String description;
private String type;

}
