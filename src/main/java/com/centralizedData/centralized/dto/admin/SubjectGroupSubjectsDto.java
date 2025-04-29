package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubjectGroupSubjectsDto implements Serializable,Comparable<SubjectGroupSubjectsDto>{

	private long id;
	private String createdBy;;
	private SubjectDto subjectTo;
	private String modifiedBy;
	private SubjectGroupNewDto subjectGroupTo;
	private Date createdDate;
	private Date lastModifiedDate;
	
	@Override
	public int compareTo(SubjectGroupSubjectsDto arg0) {
		if(arg0!=null && this!=null && arg0.getSubjectTo()!=null 
				&& arg0.getSubjectTo().getName()!=null && this.getSubjectTo()!=null && this.getSubjectTo().getName()!=null){
			
				return this.getSubjectTo().getName().compareTo(arg0.getSubjectTo().getName());
		}else
		return 0;
	}
}
