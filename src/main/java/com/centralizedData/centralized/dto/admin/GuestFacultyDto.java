package com.centralizedData.centralized.dto.admin;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GuestFacultyDto implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4155670012331904468L;
	private String guestId;
	private String guestName;
}
