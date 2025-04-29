package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassDto implements Serializable{
	
	private Long id;
	
	private String className;

//	@Override
//	public int compareTo(ClassDto o) {
//		return Long.compare(o.id, o.id);  , Comparable<ClassDto>
//	}
	

}
