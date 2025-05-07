package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UniversityNewDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3772879172076677906L;

	private int id;
	private String name;
	private Integer addressId;
	private byte[] logo;
	private Set colleges = new HashSet(0);
	private List<CollegeDto> collegeTos=new ArrayList<CollegeDto>();
	private int docTypeId;
	private String docType;
	
}
