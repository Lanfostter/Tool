package com.example.tool.edudto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;

import com.globits.education.domain.Student;
import com.globits.education.domain.StudentCourseSubject;
import com.globits.education.dto.CourseSubjectDto;
import com.globits.education.dto.StudentCallRollDto;
import com.globits.education.dto.StudentDto;

public class StudentCourseSubjectCallRollDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String studentName;
	private String subjectName;
	private String subjectCode;
	private Long subjectId;
	private CourseSubjectDto courseSubject;
	private StudentDto student;
	private StudentCallRollDto studentCallRoll;
	private int status;//trạng thái có mặt hay vắng mặt
	/*
	 * =0 có mặt
	 * =-1 vắng mặt
	 */
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public StudentDto getStudent() {
		return student;
	}

	public void setStudent(StudentDto student) {
		this.student = student;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public CourseSubjectDto getCourseSubject() {
		return courseSubject;
	}

	public void setCourseSubject(CourseSubjectDto courseSubject) {
		this.courseSubject = courseSubject;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	
	public StudentCallRollDto getStudentCallRoll() {
		return studentCallRoll;
	}

	public void setStudentCallRoll(StudentCallRollDto studentCallRoll) {
		this.studentCallRoll = studentCallRoll;
	}

	public StudentCourseSubjectCallRollDto() {

	}

	public StudentCourseSubjectCallRollDto(Long id, String displayName, int status) {
		this.setId(id);
		this.studentName = displayName;
		this.status = status;
	}

	public StudentCourseSubjectCallRollDto(StudentCourseSubject scb) {
		if (scb != null) {
			this.id = scb.getId();
			if (scb.getStudent() != null) {
				Student student = scb.getStudent();
				StudentDto stuDto = new StudentDto();
				stuDto.setId(student.getId());
				stuDto.setLastName(student.getLastName());
				stuDto.setFirstName(student.getFirstName());
				stuDto.setDisplayName(student.getDisplayName());
				stuDto.setStudentCode(student.getStudentCode());
				stuDto.setBirthDate(student.getBirthDate());
				stuDto.setGender(student.getGender());
				if(student.getEnrollmentClass()!=null) {
					stuDto.setClassName(student.getEnrollmentClass().getClassName());
				}
				this.student = stuDto;
				this.studentName = scb.getStudent().getDisplayName();
			}
			if (scb.getCourseSubject() != null) {
				this.courseSubject = new CourseSubjectDto();
				this.courseSubject.setId(scb.getCourseSubject().getId());
				this.courseSubject.setCode(scb.getCourseSubject().getCode());
			}
//			this.status = scb.getStatus();
		}
	}
	
	public StudentCourseSubjectCallRollDto(Student scb) {
		if (scb != null) {
			this.id = scb.getId();			
			if (scb != null) {
				Student student = scb;
				StudentDto stuDto = new StudentDto();
				stuDto.setId(student.getId());
				stuDto.setLastName(student.getLastName());
				stuDto.setFirstName(student.getFirstName());
				stuDto.setDisplayName(student.getDisplayName());
				stuDto.setStudentCode(student.getStudentCode());
				if(student.getEnrollmentClass()!=null) {
					stuDto.setClassName(student.getEnrollmentClass().getClassName());
				}
				this.student = stuDto;
				this.studentName = scb.getDisplayName();
//				if(student.getEnrollmentClass() != null) {
//					stuDto.setEnrollmentClass(new EnrollmentClassDto(student.getEnrollmentClass()));
//				}
			}
		}
		
	}
}
