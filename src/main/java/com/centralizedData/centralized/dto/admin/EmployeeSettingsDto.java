package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

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
public class EmployeeSettingsDto implements Serializable {
	private Integer ageOfRetirement;
	private Boolean smsAlert;
	private Boolean absenceChecking;
	private String employeeLeaveTypeId;
	private String employeeLeaveTypeName;
	private Integer currentApplicationNo;
	private String machineIdForOfflineINPunch;
	private String machineIdForOfflineOUTPunch;
	private Integer id;

}
