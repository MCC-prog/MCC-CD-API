package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.CascadeType;
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

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="room_master")
public class RoomMaster implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 5657802294160410535L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "block_id")
	private Block block;
	
	@Column(name = "floor_no")
	private String floor;
	
	@Column(name = "floor_name")
	private String floorName;
	
	@Column(name = "room_no")
	private String roomNo;
	
	@Column(name = "total_capacity")
	private String totalCapacity;
	
	@Column(name = "end_sem_capacity")
	private String endSemCapacity;
	
	@Column(name = "end_sem_total_column")
	private String endSemTotalColumn;
	
	@Column(name = "end_sem_seat_in_desk")
	private String endSemSeatInDesk;
	
	@Column(name = "mid_sem_capacity")
	private String midSemCapacity;
	
	@Column(name = "mid_sem_total_column")
	private String midSemTotalColumn;
	
	@Column(name = "mid_sem_seat_in_desk")
	private String midSemSeatInDesk;	
	
	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	private Instant createdDate;

	@Column(name = "modified_by")
	private String modifiedBy;

	@Column(name = "last_modified_date")
	private Instant lastModifiedDate;
	
	@Column(name = "is_active")
	private Boolean isActive;
	
	@Column(name = "is_tt")
	private Integer istt;
	
//	private Set<RoomEndMidSemRows> endMidSemRows =new HashSet<RoomEndMidSemRows>();


}
