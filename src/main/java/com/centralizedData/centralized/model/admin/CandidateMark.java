package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

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
@Table(name="candidate_marks")
public class CandidateMark implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 291125411809940414L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long  id;
	
	@Column(name="subject_1")
	private String subject1;
	
	@Column(name="subject_2")
	private String subject2;
	
	@Column(name="subject_3")
	private String subject3;
	
	@Column(name="subject_4")
	private String subject4;
	
	@Column(name="subject_5")
	private String subject5;
	
	@Column(name="subject_6")
	private String subject6;
	
	@Column(name="subject_7")
	private String subject7;
	
	@Column(name="subject_8")
	private String subject8;
	
	@Column(name="subject_9")
	private String subject9;
	
	@Column(name="subject_10")
	private String subject10;
	
	@Column(name="subject_11")
	private String subject11;
	
	@Column(name="subject_12")
	private String subject12;
	
	@Column(name="subject_13")
	private String subject13;
	
	@Column(name="subject_14")
	private String subject14;
	
	@Column(name="subject_15")
	private String subject15;
	
	@Column(name="subject_16")
	private String subject16;
	
	@Column(name="subject_17")
	private String subject17;
	
	@Column(name="subject_18")
	private String subject18;
	
	@Column(name="subject_19")
	private String subject19;
	
	@Column(name="subject_20")
	private String subject20;
	
	@Column(name="subject_1_total_marks")
	private Double subject1TotalMarks;
	
	@Column(name="subject_2_total_marks")
	private Double subject2TotalMarks;
	
	@Column(name="subject_3_total_marks")
	private Double subject3TotalMarks;
	
	@Column(name="subject_4_total_marks")
	private Double subject4TotalMarks;
	
	@Column(name="subject_5_total_marks")
	private Double subject5TotalMarks;
	
	@Column(name="subject_6_total_marks")
	private Double subject6TotalMarks;
	
	@Column(name="subject_7_total_marks")
	private Double subject7TotalMarks;
	
	@Column(name="subject_8_total_marks")
	private Double subject8TotalMarks;
	
	@Column(name="subject_9_total_marks")
	private Double subject9TotalMarks;
	
	@Column(name="subject_10_total_marks")
	private Double subject10TotalMarks;
	
	@Column(name="subject_11_total_marks")
	private Double subject11TotalMarks;
	
	@Column(name="subject_12_total_marks")
	private Double subject12TotalMarks;
	
	@Column(name="subject_13_total_marks")
	private Double subject13TotalMarks;
	
	@Column(name="subject_14_total_marks")
	private Double subject14TotalMarks;
	
	@Column(name="subject_15_total_marks")
	private Double subject15TotalMarks;
	
	@Column(name="subject_16_total_marks")
	private Double subject16TotalMarks;
	
	@Column(name="subject_17_total_marks")
	private Double subject17TotalMarks;
	
	@Column(name="subject_18_total_marks")
	private Double subject18TotalMarks;
	
	@Column(name="subject_19_total_marks")
	private Double subject19TotalMarks;
	
	@Column(name="subject_20_total_marks")
	private Double subject20TotalMarks;
	
	@Column(name="subject_1_obtained_marks")
	private Double subject1ObtainedMarks;
	
	@Column(name="subject_2_obtained_marks")
	private Double subject2ObtainedMarks;
	
	@Column(name="subject_3_obtained_marks")
	private Double subject3ObtainedMarks;
	
	@Column(name="subject_4_obtained_marks")
	private Double subject4ObtainedMarks;
	
	@Column(name="subject_5_obtained_marks")
	private Double subject5ObtainedMarks;
	
	@Column(name="subject_6_obtained_marks")
	private Double subject6ObtainedMarks;
	
	@Column(name="subject_7_obtained_marks")
	private Double subject7ObtainedMarks;
	
	@Column(name="subject_8_obtained_marks")
	private Double subject8ObtainedMarks;
	
	@Column(name="subject_9_obtained_marks")
	private Double subject9ObtainedMarks;
	
	@Column(name="subject_10_obtained_marks")
	private Double subject10ObtainedMarks;
	
	@Column(name="subject_11_obtained_marks")
	private Double subject11ObtainedMarks;
	
	@Column(name="subject_12_obtained_marks")
	private Double subject12ObtainedMarks;
	
	@Column(name="subject_13_obtained_marks")
	private Double subject13ObtainedMarks;
	
	@Column(name="subject_14_obtained_marks")
	private Double subject14ObtainedMarks;
	
	@Column(name="subject_15_obtained_marks")
	private Double subject15ObtainedMarks;
	
	@Column(name="subject_16_obtained_marks")
	private Double subject16ObtainedMarks;
	
	@Column(name="subject_17_obtained_marks")
	private Double subject17ObtainedMarks;
	
	@Column(name="subject_18_obtained_marks")
	private Double subject18ObtainedMarks;
	
	@Column(name="subject_19_obtained_marks")
	private Double subject19ObtainedMarks;
	
	@Column(name="subject_20_obtained_marks")
	private Double subject20ObtainedMarks;
	
	@Column(name="overall_total")
	private Double overallTotal;
	
	@Column(name="total_marks")
	private Double totalMarks;
	
	@Column(name="total_obtained_marks")
	private Double totalObtainedMarks;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "edn_qualification_id")
	private EdnQualification ednQualification;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="created_date")
	private Instant createdDate;
	
	@Column(name="modified_by")
	private String modifiedBy;
		
	@Column(name="last_modified_date")
	private Instant lastModifiedDate;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "detailed_subject_id1")
	private DetailedSubjects detailedSubjects1;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "detailed_subject_id2")
	private DetailedSubjects detailedSubjects2;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "detailed_subject_id3")
	private DetailedSubjects detailedSubjects3;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "detailed_subject_id4")
	private DetailedSubjects detailedSubjects4;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "detailed_subject_id5")
	private DetailedSubjects detailedSubjects5;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "detailed_subject_id6")
	private DetailedSubjects detailedSubjects6;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "detailed_subject_id7")
	private DetailedSubjects detailedSubjects7;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "detailed_subject_id8")
	private DetailedSubjects detailedSubjects8;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "detailed_subject_id9")
	private DetailedSubjects detailedSubjects9;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "detailed_subject_id10")
	private DetailedSubjects detailedSubjects10;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "detailed_subject_id11")
	private DetailedSubjects detailedSubjects11;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "detailed_subject_id12")
	private DetailedSubjects detailedSubjects12;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "detailed_subject_id13")
	private DetailedSubjects detailedSubjects13;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "detailed_subject_id14")
	private DetailedSubjects detailedSubjects14;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "detailed_subject_id15")
	private DetailedSubjects detailedSubjects15;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "detailed_subject_id16")
	private DetailedSubjects detailedSubjects16;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "detailed_subject_id17")
	private DetailedSubjects detailedSubjects17;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "detailed_subject_id18")
	private DetailedSubjects detailedSubjects18;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "detailed_subject_id19")
	private DetailedSubjects detailedSubjects19;
	
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "detailed_subject_id20")
	private DetailedSubjects detailedSubjects20;
	
	@Column(name="total_marks_language")
	private Double totalMarksLanguage;

	
}
