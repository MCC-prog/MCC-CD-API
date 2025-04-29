package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmpEligibilityTestDto implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7532451451389887353L;
	private String checked;
	private String tempChecked;
	private String eligibilityTestNET;
	private String eligibilityTestSLET;
	private String eligibilityTestSET;
	private String eligibilityTestNone;
	private String eligibilityTestOther;
	private String eligibilityTest;

}
