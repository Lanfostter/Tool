package com.example.tool.edudto;

import java.io.Serializable;

import com.globits.education.domain.EnrollmentClass;
import com.globits.education.dto.EnrollmentClassDto;

public class EnrollmentClassSummaryDto implements Serializable {
	private Long numberStudent;
	private EnrollmentClassDto enrollmentClass;
	public Long getNumberStudent() {
		return numberStudent;
	}
	public void setNumberStudent(Long numberStudent) {
		this.numberStudent = numberStudent;
	}
	public EnrollmentClassDto getEnrollmentClass() {
		return enrollmentClass;
	}
	public void setEnrollmentClass(EnrollmentClassDto enrollmentClass) {
		this.enrollmentClass = enrollmentClass;
	}
	
	public EnrollmentClassSummaryDto(){
		
	}
	public EnrollmentClassSummaryDto(Long numberStudent, Long classId, String classCode, String className ){
		this.enrollmentClass = new EnrollmentClassDto();
		this.enrollmentClass.setClassCode(classCode);
		this.enrollmentClass.setClassName(className);
		this.enrollmentClass.setId(classId);
		this.numberStudent = numberStudent;
	}
	
	public EnrollmentClassSummaryDto(Long numberStudent, EnrollmentClass enrollmentClass){
		this.enrollmentClass = new EnrollmentClassDto(enrollmentClass);
		this.numberStudent = numberStudent;
	}
	
}
