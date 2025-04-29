package com.centralizedData.centralized.dto.admin;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AcademicYearDto implements Comparable<AcademicYearDto>{

		private Long id;
		
		private Integer Year;
		
		private String displayYear;
		
		private Boolean isCurrent;
		
		private Boolean isCurrentForAdmission;

		@Override
		public int compareTo(AcademicYearDto a) {
			return this.Year - a.Year;
		}


}
