package com.example.tool.edudto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.example.tool.edudto.StudentDto;
import com.globits.core.domain.BaseObject;
import com.globits.core.dto.BaseObjectDto;
import com.globits.core.utils.NumberUtils;
import com.globits.education.dto.StudentSchoolYearBehaviorMarkDto;

//class SortStudentSchoolYearBehaviorMarkDto implements Comparator<StudentSchoolYearBehaviorMarkDto> 
//{ 
//    // Used for sorting in ascending order of 
//    // roll number 
//    public int compare(StudentSchoolYearBehaviorMarkDto a, StudentSchoolYearBehaviorMarkDto b) 
//    { 
//        return a.getSchoolYear().getYear() - b.getSchoolYear().getYear(); 
//    } 
//} 
public class StudentBehaviorMarkDto extends BaseObjectDto {

	private static final long serialVersionUID = 1L;
	
	private StudentDto student;
	private Double mark;//Điểm thang 100

	private String sort;//xếp loại
	
	
	private List<StudentSchoolYearBehaviorMarkDto>  schoolYearBehaviorMarks = new ArrayList<StudentSchoolYearBehaviorMarkDto>();

	
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

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public List<StudentSchoolYearBehaviorMarkDto> getSchoolYearBehaviorMarks() {
		return schoolYearBehaviorMarks;
	}

	public void setSchoolYearBehaviorMarks(List<StudentSchoolYearBehaviorMarkDto> schoolYearBehaviorMarks) {
		this.schoolYearBehaviorMarks = schoolYearBehaviorMarks;
	}

	public StudentBehaviorMarkDto() {
		
	}

}
