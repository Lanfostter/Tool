package com.example.tool.edudto;

import java.util.List;

import com.globits.core.dto.DepartmentDto;
import com.globits.education.dto.CourseSubjectDto;
import com.globits.education.dto.SchoolYearDto;
import com.globits.education.dto.SemesterDto;
import com.globits.hr.dto.StaffDto;

public class TeachingVolumeDetailDto {
	private StaffDto staff;
	private SemesterDto semester;
	private SchoolYearDto schoolYear;
	private DepartmentDto department;
	private List<CourseSubjectDto> courseSubjectDtos;
	private Double totalNumberHours;
	public StaffDto getStaff() {
		return staff;
	}
	public void setStaff(StaffDto staff) {
		this.staff = staff;
	}
	public SemesterDto getSemester() {
		return semester;
	}
	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}
	public SchoolYearDto getSchoolYear() {
		return schoolYear;
	}
	public void setSchoolYear(SchoolYearDto schoolYear) {
		this.schoolYear = schoolYear;
	}
	public DepartmentDto getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentDto department) {
		this.department = department;
	}
	public List<CourseSubjectDto> getCourseSubjectDtos() {
		return courseSubjectDtos;
	}
	public void setCourseSubjectDtos(List<CourseSubjectDto> courseSubjectDtos) {
		this.courseSubjectDtos = courseSubjectDtos;
	}
	public Double getTotalNumberHours() {
		return totalNumberHours;
	}
	public void setTotalNumberHours(Double totalNumberHours) {
		this.totalNumberHours = totalNumberHours;
	}
	
}
