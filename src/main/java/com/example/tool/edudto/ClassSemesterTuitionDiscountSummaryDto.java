package com.example.tool.edudto;

import com.globits.education.dto.EnrollmentClassDto;
import com.globits.education.dto.SemesterDto;

public class ClassSemesterTuitionDiscountSummaryDto {
	
	private SemesterDto semester;
	private EnrollmentClassDto enrollmentClass;
	
	private String semesterName;
	private String className;
	private String classCode;
	private Integer numberStudent;
	private Integer numberFullDiscountStudent;//Miễn
	private Double fullDiscountValue;//Số tiền miễn

	private Integer numberDiscountStudent;//Số lượng sinh viên được giảm
	private Double discountValue;//Số tiền giảm
	public Integer getNumberStudent() {
		return numberStudent;
	}
	public void setNumberStudent(Integer numberStudent) {
		this.numberStudent = numberStudent;
	}
	public Integer getNumberFullDiscountStudent() {
		return numberFullDiscountStudent;
	}
	public void setNumberFullDiscountStudent(Integer numberFullDiscountStudent) {
		this.numberFullDiscountStudent = numberFullDiscountStudent;
	}
	public Double getFullDiscountValue() {
		return fullDiscountValue;
	}
	public void setFullDiscountValue(Double fullDiscountValue) {
		this.fullDiscountValue = fullDiscountValue;
	}
	public Integer getNumberDiscountStudent() {
		return numberDiscountStudent;
	}
	public void setNumberDiscountStudent(Integer numberDiscountStudent) {
		this.numberDiscountStudent = numberDiscountStudent;
	}
	public SemesterDto getSemester() {
		return semester;
	}
	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}
	public EnrollmentClassDto getEnrollmentClass() {
		return enrollmentClass;
	}
	public void setEnrollmentClass(EnrollmentClassDto enrollmentClass) {
		this.enrollmentClass = enrollmentClass;
	}
	public Double getDiscountValue() {
		return discountValue;
	}
	public void setDiscountValue(Double discountValue) {
		this.discountValue = discountValue;
	}
	public String getSemesterName() {
		return semesterName;
	}
	public void setSemesterName(String semesterName) {
		this.semesterName = semesterName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getClassCode() {
		return classCode;
	}
	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}
	
	
}
