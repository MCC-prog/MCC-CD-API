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
public class EmpJobTypeDto implements Serializable{
	
	private int id;
	private String name;
	private String value;

}
