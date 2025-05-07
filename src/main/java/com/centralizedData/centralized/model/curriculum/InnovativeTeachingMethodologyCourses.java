package com.centralizedData.centralized.model.curriculum;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.centralizedData.centralized.model.admin.Courses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Builder
@Table(name="ce_curriculum_innovative_teaching_methodology_course")
public class InnovativeTeachingMethodologyCourses implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = -1280443815355504768L;

	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id", nullable = false)
	private Courses course;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "innovative_teaching_methodology_id", nullable = false)
	private InnovativeTeachingMethodology innovativeTeachingMethodology;
}
