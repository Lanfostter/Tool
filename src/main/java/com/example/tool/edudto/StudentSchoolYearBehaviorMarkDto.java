package com.example.tool.edudto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.example.tool.edudto.SchoolYearDto;
import com.example.tool.edudto.StudentDto;
import com.globits.core.domain.BaseObject;
import com.globits.core.dto.BaseObjectDto;
import com.globits.core.utils.NumberUtils;
import com.globits.education.dto.StudentSemesterBehaviorMarkDto;


//class SortStudentSchoolYearBehaviorMarkDto implements Comparator<StudentSchoolYearBehaviorMarkDto> 
//{ 
//    // Used for sorting in ascending order of 
//    // roll number 
//    public int compare(StudentSchoolYearBehaviorMarkDto a, StudentSchoolYearBehaviorMarkDto b) 
//    { 
//        return a.getSchoolYear().getYear() - b.getSchoolYear().getYear(); 
//    } 
//} 
public class StudentSchoolYearBehaviorMarkDto extends BaseObjectDto {

	private static final long serialVersionUID = 1L;

	private SchoolYearDto schoolYear;
	
	private StudentDto student;
	private Double mark;//Điểm thang 100
	private Double markConversion;//điểm quy  đổi

	private String sort;//xếp loại
	private Integer classication;
	
	private List<StudentSemesterBehaviorMarkDto> semesterMarks = new ArrayList<StudentSemesterBehaviorMarkDto>(); 
	
	

	public StudentDto getStudent() {
		return student;
	}

	public void setStudent(StudentDto student) {
		this.student = student;
	}

	public Double getMark() {
		return NumberUtils.round(mark,2);
	}

	public void setMark(Double mark) {
		this.mark = mark;
	}


	public SchoolYearDto getSchoolYear() {
		return schoolYear;
	}

	public void setSchoolYear(SchoolYearDto schoolYear) {
		this.schoolYear = schoolYear;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public List<StudentSemesterBehaviorMarkDto> getSemesterMarks() {
		return semesterMarks;
	}

	public void setSemesterMarks(List<StudentSemesterBehaviorMarkDto> semesterMarks) {
		this.semesterMarks = semesterMarks;
	}	

	public Double getMarkConversion() {
		return markConversion;
	}

	public void setMarkConversion(Double markConversion) {
		this.markConversion = markConversion;
	}
	
	public Integer getClassication() {
		return classication;
	}

	public void setClassication(Integer classication) {
		this.classication = classication;
	}

	public StudentSchoolYearBehaviorMarkDto() {
		
	}
}
