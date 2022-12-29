package com.example.tool.edudto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.globits.education.domain.CourseHour;
import com.globits.education.domain.Semester;
import com.globits.education.domain.SemesterRegisterPeriod;
import com.globits.education.domain.Student;
import com.globits.education.domain.StudentCourseSubjectEdited;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.SemesterRegisterPeriodDto;
import com.globits.education.dto.StudentDto;

public class StudentCourseSubjectEditedDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private StudentDto student;
	
	private SemesterDto semester;
	
	private SemesterRegisterPeriodDto registerPeriod;
	
	private Integer changeTime;//Số lần sửa đổi
	
	private Boolean isLock;//Chốt sửa đổi

	public StudentDto getStudent() {
		return student;
	}

	public void setStudent(StudentDto student) {
		this.student = student;
	}

	public SemesterDto getSemester() {
		return semester;
	}

	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}

	public SemesterRegisterPeriodDto getRegisterPeriod() {
		return registerPeriod;
	}

	public void setRegisterPeriod(SemesterRegisterPeriodDto registerPeriod) {
		this.registerPeriod = registerPeriod;
	}

	public Integer getChangeTime() {
		return changeTime;
	}

	public void setChangeTime(Integer changeTime) {
		this.changeTime = changeTime;
	}

	public Boolean getIsLock() {
		return isLock;
	}

	public void setIsLock(Boolean isLock) {
		this.isLock = isLock;
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public StudentCourseSubjectEditedDto() {
		
	}
	
	public StudentCourseSubjectEditedDto(StudentCourseSubjectEdited entity) {
		this.id = entity.getId();
		if(entity.getStudent()!=null) {
			this.student = new StudentDto(entity.getStudent(), true);
		}
		if(entity.getSemester()!=null) {
			this.semester = new SemesterDto(entity.getSemester());
		}
		if(entity.getRegisterPeriod()!=null) {
			this.registerPeriod = new SemesterRegisterPeriodDto(entity.getRegisterPeriod());
		}
		this.isLock = entity.getIsLock();
		this.changeTime = entity.getChangeTime();
	}
}
