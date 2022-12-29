package com.example.tool.edudto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.JoinColumn;

import com.globits.core.domain.Department;
import com.globits.core.dto.DepartmentDto;
import com.globits.education.domain.CourseSubject;
import com.globits.education.domain.CourseSubjectConfig;
import com.globits.education.domain.CourseYear;
import com.globits.education.domain.EducationProgram;
import com.globits.education.domain.EnrollmentClass;
import com.globits.education.dto.CourseSubjectConfigDto;
import com.globits.education.dto.CourseSubjectDto;
import com.globits.education.dto.CourseYearDto;
import com.globits.education.dto.EducationProgramDto;



public class ListCourseSubjectConfigDto {
	
	private List<CourseSubjectConfigDto> listCourseSubjectConfigDto;
	private CourseSubjectDto courseSubject;
	private CourseYearDto courseYear;

	private DepartmentDto department;	
	private EducationProgramDto program;
	
	public List<CourseSubjectConfigDto> getListCourseSubjectConfigDto() {
		return listCourseSubjectConfigDto;
	}
	public void setListCourseSubjectConfigDto(List<CourseSubjectConfigDto> listCourseSubjectConfigDto) {
		this.listCourseSubjectConfigDto = listCourseSubjectConfigDto;
	}
	public CourseSubjectDto getCourseSubject() {
		return courseSubject;
	}
	public void setCourseSubject(CourseSubjectDto courseSubject) {
		this.courseSubject = courseSubject;
	}
	public CourseYearDto getCourseYear() {
		return courseYear;
	}
	public void setCourseYear(CourseYearDto courseYear) {
		this.courseYear = courseYear;
	}
	public DepartmentDto getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentDto department) {
		this.department = department;
	}
	public EducationProgramDto getProgram() {
		return program;
	}
	public void setProgram(EducationProgramDto program) {
		this.program = program;
	}
}
