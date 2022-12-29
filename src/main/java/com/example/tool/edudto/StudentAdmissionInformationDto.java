package com.example.tool.edudto;

import java.io.Serializable;
import java.util.Date;

import com.globits.education.domain.StudentAdmissionInformation;

public class StudentAdmissionInformationDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long Id;

	private String code;// Số báo danh
	private String fullName; // Họ tên
	private Date birthDate; // Ngày sinh

	private String blockSubjectCode;// Khối thi
	private String subjectName1;
	private String subjectName2;
	private String subjectName3;
	private String subjectName4;

	private Double mark1;
	private Double mark2;
	private Double mark3;
	private Double mark4;

	private Double coefficient1 = new Double(1);
	private Double coefficient2 = new Double(1);
	private Double coefficient3 = new Double(1);
	private Double coefficient4 = new Double(1);

	private String candidateCodeType;

	private Integer candidateArea;// Khu vực tuyển sinh

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getBlockSubjectCode() {
		return blockSubjectCode;
	}

	public void setBlockSubjectCode(String blockSubjectCode) {
		this.blockSubjectCode = blockSubjectCode;
	}

	public String getSubjectName1() {
		return subjectName1;
	}

	public void setSubjectName1(String subjectName1) {
		this.subjectName1 = subjectName1;
	}

	public String getSubjectName2() {
		return subjectName2;
	}

	public void setSubjectName2(String subjectName2) {
		this.subjectName2 = subjectName2;
	}

	public String getSubjectName3() {
		return subjectName3;
	}

	public void setSubjectName3(String subjectName3) {
		this.subjectName3 = subjectName3;
	}

	public String getSubjectName4() {
		return subjectName4;
	}

	public void setSubjectName4(String subjectName4) {
		this.subjectName4 = subjectName4;
	}

	public Double getMark1() {
		return mark1;
	}

	public void setMark1(Double mark1) {
		this.mark1 = mark1;
	}

	public Double getMark2() {
		return mark2;
	}

	public void setMark2(Double mark2) {
		this.mark2 = mark2;
	}

	public Double getMark3() {
		return mark3;
	}

	public void setMark3(Double mark3) {
		this.mark3 = mark3;
	}

	public Double getMark4() {
		return mark4;
	}

	public void setMark4(Double mark4) {
		this.mark4 = mark4;
	}

	public Double getCoefficient1() {
		return coefficient1;
	}

	public void setCoefficient1(Double coefficient1) {
		this.coefficient1 = coefficient1;
	}

	public Double getCoefficient2() {
		return coefficient2;
	}

	public void setCoefficient2(Double coefficient2) {
		this.coefficient2 = coefficient2;
	}

	public Double getCoefficient3() {
		return coefficient3;
	}

	public void setCoefficient3(Double coefficient3) {
		this.coefficient3 = coefficient3;
	}

	public Double getCoefficient4() {
		return coefficient4;
	}

	public void setCoefficient4(Double coefficient4) {
		this.coefficient4 = coefficient4;
	}

	public String getCandidateCodeType() {
		return candidateCodeType;
	}

	public void setCandidateCodeType(String candidateCodeType) {
		this.candidateCodeType = candidateCodeType;
	}

	public Integer getCandidateArea() {
		return candidateArea;
	}

	public void setCandidateArea(Integer candidateArea) {
		this.candidateArea = candidateArea;
	}

	public StudentAdmissionInformationDto() {

	}

	public StudentAdmissionInformationDto(StudentAdmissionInformation sr) {
		this.Id = sr.getId();
		this.birthDate = sr.getBirthDate();
		this.blockSubjectCode = sr.getBlockSubjectCode();
		this.candidateArea = sr.getCandidateArea();
		this.candidateCodeType = sr.getCandidateCodeType();
		this.code = sr.getCode();
		this.coefficient1 = sr.getCoefficient1();
		this.coefficient2 = sr.getCoefficient2();
		this.coefficient3 = sr.getCoefficient3();
		this.coefficient4 = sr.getCoefficient4();
		this.fullName = sr.getFullName();
		this.mark1 = sr.getMark1();
		this.mark2 = sr.getMark2();
		this.mark3 = sr.getMark3();
		this.mark4 = sr.getMark4();
		this.subjectName1 = sr.getSubjectName1();
		this.subjectName2 = sr.getSubjectName2();
		this.subjectName3 = sr.getSubjectName3();
		this.subjectName4 = sr.getSubjectName4();
	}

}
