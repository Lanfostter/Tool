package com.example.tool.edudto;

import java.io.Serializable;
import java.util.List;

import com.globits.education.dto.EnrollmentClassDto;
import com.globits.education.dto.SpecialityDto;
/**
 * Cây lớp học, theo ngành
 */
public class EnrollmentClassSpecTree  implements Serializable {	
	
	private static final long serialVersionUID = -6002102640897538652L;
	
	private SpecialityDto specialityDto;
	private List<EnrollmentClassDto> enrollmentClassDtos;
	
	public SpecialityDto getSpecialityDto() {
		return specialityDto;
	}
	public void setSpecialityDto(SpecialityDto specialityDto) {
		this.specialityDto = specialityDto;
	}
	public List<EnrollmentClassDto> getEnrollmentClassDtos() {
		return enrollmentClassDtos;
	}
	public void setEnrollmentClassDtos(List<EnrollmentClassDto> enrollmentClassDtos) {
		this.enrollmentClassDtos = enrollmentClassDtos;
	}	
}
