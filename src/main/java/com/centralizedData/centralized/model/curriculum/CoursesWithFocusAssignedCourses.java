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

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity 
@Table(name="ce_curriculum_courses_with_focus_assigned_courses")
public class CoursesWithFocusAssignedCourses implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long coursesWithFocusAssignedCoursesId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "courses_with_focus_id", nullable = false)
	private CoursesWithFocus coursesWithFocus;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id", nullable = false)
	private Courses course;
	
}
