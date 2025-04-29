package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DownloadIDcardPhotosDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3407089448942461260L;

	private String year;
	private String classId;
	private String pgmId;
	private String applnNo;
	private int semNo;
}
