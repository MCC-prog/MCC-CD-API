/*
 * package com.centralizedData.centralized.model.admin;
 * 
 * import java.io.Serializable; import java.math.BigDecimal; import
 * java.time.Instant; import java.util.Date;
 * 
 * import javax.persistence.CascadeType; import javax.persistence.Column; import
 * javax.persistence.Entity; import javax.persistence.FetchType; import
 * javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
 * import javax.persistence.Id; import javax.persistence.JoinColumn; import
 * javax.persistence.ManyToOne; import javax.persistence.Table;
 * 
 * import com.centralizedData.centralized.model.user.User;
 * 
 * import lombok.AllArgsConstructor; import lombok.Getter; import
 * lombok.NoArgsConstructor; import lombok.Setter;
 * 
 * @Getter
 * 
 * @Setter
 * 
 * @AllArgsConstructor
 * 
 * @NoArgsConstructor
 * 
 * @Entity
 * 
 * @Table(name="consolidated_marks_card") public class ConsolidateMarksCard
 * implements Serializable{
 *//**
	* 
	*//*
		 * private static final long serialVersionUID = 806639911763514438L;
		 * 
		 * @Id
		 * 
		 * @Column(name="id")
		 * 
		 * @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
		 * 
		 * @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
		 * 
		 * @JoinColumn(name = "class_id") private Classes classes;
		 * 
		 * @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
		 * 
		 * @JoinColumn(name = "student_id") private Student student;
		 * 
		 * @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
		 * 
		 * @JoinColumn(name = "exam_id") private ExamDefinition exam;
		 * 
		 * @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
		 * 
		 * @JoinColumn(name = "subject_id") private SubjectEntry subject;
		 * 
		 * @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
		 * 
		 * @JoinColumn(name = "course_id") private Courses courses;
		 * 
		 * @Column(name="code") private String subjectCode;
		 * 
		 * @Column(name="subject") private String subjectName;
		 * 
		 * @Column(name="theory_total_sub_internal_mark") private String
		 * theoryTotalSubInternalMark;
		 * 
		 * @Column(name="theory_total_attendance_mark") private String
		 * theoryTotalAttendanceMark;
		 * 
		 * @Column(name="practical_total_sub_internal_mark") private String
		 * practicalTotalSubInternalMark;
		 * 
		 * @Column(name="practical_total_attendance_mark") private String
		 * practicalTotalAttendanceMark;
		 * 
		 * @Column(name="student_theory_marks") private String studentTheoryMark;
		 * 
		 * @Column(name="student_practical_marks") private String studentPracticalMark;
		 * 
		 * @Column(name="theory_ese_minimum_mark") private BigDecimal
		 * theoryeseMinimumMark;
		 * 
		 * @Column(name="theory_ese_maximum_mark") private BigDecimal
		 * theoryeseMaximumMark;
		 * 
		 * @Column(name="practical_ese_minimum_mark") private BigDecimal
		 * practicaleseMinimumMark;
		 * 
		 * @Column(name="practical_ese_maximum_mark") private BigDecimal
		 * practicaleseMaximumMark;
		 * 
		 * @Column(name="first_name") private String firstName;
		 * 
		 * @Column(name="middle_name") private String middleName;
		 * 
		 * @Column(name="last_name") private String lastName;
		 * 
		 * @Column(name="section") private String section;
		 * 
		 * @Column(name="is_initialise") private Boolean isInitialise;
		 * 
		 * @Column(name="subject_order") private Integer subjectOrder;
		 * 
		 * @Column(name="final_practical_internal_maximum_mark") private BigDecimal
		 * finalPracticalInternalMaximumMark;
		 * 
		 * @Column(name="final_theory_internal_maximum_mark") private BigDecimal
		 * finalTheoryInternalMaximumMark;
		 * 
		 * @Column(name="practical_credit") private BigDecimal practicalCredit;
		 * 
		 * @Column(name="theory_credit") private BigDecimal theoryCredit;
		 * 
		 * @Column(name="register_no") private String regNo;
		 * 
		 * @Column(name="subType") private String subType;
		 * 
		 * @Column(name="term_number") private Integer termNumber;
		 * 
		 * @Column(name="theoryObtain") private Double theoryObtain;
		 * 
		 * @Column(name="practicalObtain") private Double practicalObtain;
		 * 
		 * @Column(name="theoryMax") private BigDecimal theoryMax;
		 * 
		 * @Column(name="practicalMax") private BigDecimal practicalMax;
		 * 
		 * @Column(name="theoryPer") private Double theoryPercentage;
		 * 
		 * @Column(name="practicalper") private Double practicalPercentage;
		 * 
		 * @Column(name="dont_show_max_marks") private Boolean dontShowMaxMarks;
		 * 
		 * @Column(name="dont_show_min_marks") private Boolean dontShowMinMarks;
		 * 
		 * @Column(name="show_only_grade") private Boolean showOnlyGrade;
		 * 
		 * @Column(name="name") private String name;
		 * 
		 * @Column(name="dont_show_sub_type") private Boolean dontShowSubType;
		 * 
		 * @Column(name="applied_year") private Integer appliedYear;
		 * 
		 * @Column(name="section_id") private Integer sectionId;
		 * 
		 * @Column(name="academic_year") private Integer academicYear;
		 * 
		 * @Column(name="selected_course_id") private Integer selectedCourseId;
		 * 
		 * @Column(name="grade") private String grade;
		 * 
		 * @Column(name="pass_fail") private String passOrFail;
		 * 
		 * @Column(name="course_completed_year") private Integer courseCompleteYear;
		 * 
		 * @Column(name="batch_end_year") private Integer batchEndYear;
		 * 
		 * @Column(name="final_theory_internal_minimum_mark") private BigDecimal
		 * finalTheoryInternalMinimumMark;
		 * 
		 * @Column(name="final_practical_internal_minimum_mark") private BigDecimal
		 * finalPracticalInternalMinimumMark;
		 * 
		 * @Column(name="theoryMin") private BigDecimal theoryMin;
		 * 
		 * @Column(name="practicalMin") private BigDecimal practicalMin;
		 * 
		 * @Column(name="dont_consider_failure_total_result") private Boolean
		 * dontConsiderFailureTotalResult;
		 * 
		 * @Column(name="dont_add_in_total") private Boolean dontAddInTotal;
		 * 
		 * @Column(name="is_appeared_theory") private Boolean isTheoryAppeared;
		 * 
		 * @Column(name="is_appeard_practical") private Boolean isPracticalAppeared;
		 * 
		 * @Column(name="grade_point") private BigDecimal gradePoint;
		 * 
		 * @Column(name="is_certificate_course") private Boolean isCertificateCourse;
		 * 
		 * @Column(name="is_cia_appeared_theory") private Boolean isCIATheoryAppeared;
		 * 
		 * @Column(name="is_cia_appeared_practical") private Boolean
		 * isCIAPracticalAppeared;
		 * 
		 * @Column(name="created_date") private Date createdDate;
		 * 
		 * @Column(name="created_by") private String createdBy;
		 * 
		 * 
		 * 
		 * }
		 */