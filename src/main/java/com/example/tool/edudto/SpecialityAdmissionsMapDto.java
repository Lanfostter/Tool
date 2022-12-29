package com.example.tool.edudto;

import java.io.Serializable;

import com.globits.education.domain.CourseYear;
import com.globits.education.domain.Speciality;
import com.globits.education.domain.SpecialityAdmissionsMap;
import com.globits.education.dto.CourseYearDto;
import com.globits.education.dto.SpecialityDto;

public class SpecialityAdmissionsMapDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String admissionCode;
	private SpecialityDto speciality;
	private CourseYearDto courseYear;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAdmissionCode() {
		return admissionCode;
	}
	public void setAdmissionCode(String admissionCode) {
		this.admissionCode = admissionCode;
	}	
	public SpecialityDto getSpeciality() {
		return speciality;
	}
	public void setSpeciality(SpecialityDto speciality) {
		this.speciality = speciality;
	}
	public CourseYearDto getCourseYear() {
		return courseYear;
	}
	public void setCourseYear(CourseYearDto courseYear) {
		this.courseYear = courseYear;
	}
	public SpecialityAdmissionsMapDto(){
		
	}
	public SpecialityAdmissionsMapDto(SpecialityAdmissionsMap s){
		if(s!=null) {
			this.setId(s.getId());
			this.setAdmissionCode(s.getAdmissionCode());
			if(s.getSpeciality()!=null) {
				SpecialityDto dto=new SpecialityDto();
				dto.setId(s.getSpeciality().getId());
				dto.setName(s.getSpeciality().getName());
				dto.setCode(s.getSpeciality().getCode());
				dto.setNumbericCode(s.getSpeciality().getNumbericCode());
//				dto.setParent(s.getSpeciality().getParent());
//				dto.setDepartment(s.getSpeciality().getDepartment());
				dto.setIsGroup(s.getSpeciality().getIsGroup());
				this.speciality=dto;
			}
			if(s.getCourseYear()!=null) {
				CourseYearDto dto=new CourseYearDto();
				dto.setId(s.getCourseYear().getId());
				dto.setName(s.getCourseYear().getName());
				dto.setCode(s.getCourseYear().getCode());
				dto.setYear(s.getCourseYear().getYear());
				this.courseYear=dto;
			}
		}
	}
}
