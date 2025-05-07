package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "block_attendanceentry_by_ProType")
public class BlockAttendanceEntryByProgramType implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	
//	private int programtypeid;
//	
//	@Column(name = "id")
//	private String programtypename;
//	
//	@Column(name = "id")
//	private String attendanceType;
	
	@Column(name = "block_days")
	private String blockDays;
	
//	@Column(name = "id")
//	private String classid;
//	
//	@Column(name = "id")
//	private String facultyid;
	
	//private Map<Integer, String> pgmMap;
	//private Map<Integer, String> classMap;
	//private Map<Integer,String> teacherMap;
	
	@Column(name = "created_by")
	private String CreatedBy;
	
	@Column(name = "modified_by")
	private String ModifiedBy;
	
	@Column(name = "created_date")
	private Date CreatedDate;
	
	@Column(name = "is_active")
	private Boolean isActive;
	
	@Column(name = "last_modified_date")
	private Date LastModifiedDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "programtype_id")
	private ProgramType blockProgramtype;
	
	@Column(name = "block_type")
	private String blockType;

}
