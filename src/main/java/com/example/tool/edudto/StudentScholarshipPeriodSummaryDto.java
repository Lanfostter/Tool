package com.example.tool.edudto;

import com.globits.education.dto.StudentScholarshipSummaryDto;

public class StudentScholarshipPeriodSummaryDto {
	private String studentCode;
	
	private StudentScholarshipSummaryDto prev;
	private StudentScholarshipSummaryDto current;
	public StudentScholarshipSummaryDto getPrev() {
		return prev;
	}
	public void setPrev(StudentScholarshipSummaryDto prev) {
		this.prev = prev;
	}
	public StudentScholarshipSummaryDto getCurrent() {
		return current;
	}
	public void setCurrent(StudentScholarshipSummaryDto current) {
		this.current = current;
	}
	
	
	public String getStudentCode() {
		return studentCode;
	}
	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}
	
	
}
