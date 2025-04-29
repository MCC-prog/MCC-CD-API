package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApplnDocDto implements Serializable, Comparable<ApplnDocDto>,Comparator<ApplnDocDto>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5128313045508625556L;
	
	private Integer id;
	private DocTypeDto docTypeTO;
	private String name;
	private String applicationNo;
	private String regnNo;
	private MultipartFile document;
	private MultipartFile editDocument;
	private byte[] currDocument;
	private String contentType;
	private Integer docTypeId;
	private Boolean needToProduce;
	private Boolean documentPresent;
	private Boolean verified;
	private Boolean photo;
	private Boolean hardSubmitted;
	private Boolean notApplicable;
	private Boolean temphardSubmitted;
	private Boolean tempNotApplicable;
	private String docName;
	private byte[] photoBytes;
	private String submitDate;
	private String createdBy;
	private String createdDate;
	private String printName;
	private boolean defaultPhoto;
	private boolean needToProduceSemWiseMC;
	private String semisterNo;
	private List<ApplnDocDetailsDto> docDetailsList;
	private String semType;
	private int displayOrder;
	private Boolean signature;
	private String currentDocumentPath;
	private String fileName;
	
	@Override
	public int compare(ApplnDocDto arg0, ApplnDocDto arg1) {
		Integer a  = arg0.getDisplayOrder();
		Integer b  = arg1.getDisplayOrder();
		return a.compareTo(b);
	}

	@Override
	public int compareTo(ApplnDocDto to) {
		if(to != null && this != null && to.getPrintName() != null && this.printName != null){
			return this.printName.compareTo(to.getPrintName());
		}else{
			return 0;
		}
	}

}
