package com.example.tool.edudto;

import java.io.Serializable;

import com.globits.education.domain.StudentExpectationRegister;
import com.globits.education.dto.EnrollmentClassDto;
import com.globits.education.dto.ExpectationRegisterDto;
import com.globits.education.dto.StudentDto;

public class StudentExpectationRegisterDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	private StudentDto student;
	
	private ExpectationRegisterDto expectationRegister;

	/*
	 * Trạng thái:
	 * -1:đã hủy
	 * 0: mới đăng ký
	 * 1: đã chốt	 
	 */
	private Integer status;
	
	private Double fee;
	/*
	 * Đã chốt mức phí
	 */
	private Boolean checkedFee;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public StudentDto getStudent() {
		return student;
	}

	public void setStudent(StudentDto student) {
		this.student = student;
	}

	public ExpectationRegisterDto getExpectationRegister() {
		return expectationRegister;
	}

	public void setExpectationRegister(ExpectationRegisterDto expectationRegister) {
		this.expectationRegister = expectationRegister;
	}

	public StudentExpectationRegisterDto() {
		super();
	}
	
	public Integer getStatus() {
		return status;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}

	public Boolean getCheckedFee() {
		return checkedFee;
	}

	public void setCheckedFee(Boolean checkedFee) {
		this.checkedFee = checkedFee;
	}

	public StudentExpectationRegisterDto(StudentExpectationRegister studentExpectationRegister) {
		if(studentExpectationRegister != null) {
			this.id = studentExpectationRegister.getId();
			this.status = studentExpectationRegister.getStatus();
			this.fee = studentExpectationRegister.getFee();
			this.checkedFee = studentExpectationRegister.getCheckedFee();
			if(studentExpectationRegister.getStudent() != null) {
				StudentDto studentDto = new StudentDto();
				studentDto.setId(studentExpectationRegister.getStudent().getId());
				studentDto.setStudentCode(studentExpectationRegister.getStudent().getStudentCode());
				studentDto.setDisplayName(studentExpectationRegister.getStudent().getDisplayName());
				if(studentExpectationRegister.getStudent().getEnrollmentClass()!=null) {
					studentDto.setEnrollmentClass(new EnrollmentClassDto());
					studentDto.getEnrollmentClass().setClassCode(studentExpectationRegister.getStudent().getEnrollmentClass().getClassCode());					
				}
				this.setStudent(studentDto);
			}
			if(studentExpectationRegister.getExpectationRegister() != null) {
				ExpectationRegisterDto expectationRegisterDto = new ExpectationRegisterDto(studentExpectationRegister.getExpectationRegister());
				this.setExpectationRegister(expectationRegisterDto);
				
			}
		}
	}
}
