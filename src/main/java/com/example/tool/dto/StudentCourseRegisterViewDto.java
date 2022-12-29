package com.example.tool.dto;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;

import com.globits.core.dto.BaseObjectDto;
import com.globits.education.domain.StudentCourseRegisterView;

public class StudentCourseRegisterViewDto extends BaseObjectDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2277866634914741534L;
	private Long studentId;
	private Long semesterId;
	private Long periodId;
	private Long classId;
	private StudentDto student;
	private CourseRegisterViewDto courseRegisterViewObject;

	public StudentCourseRegisterViewDto(Long studentId, Long semesterId, Long periodId, Long classId,
			StudentDto student, CourseRegisterViewDto courseRegisterViewObject) {
		super();
		this.studentId = studentId;
		this.semesterId = semesterId;
		this.periodId = periodId;
		this.classId = classId;
		this.student = student;
		this.courseRegisterViewObject = courseRegisterViewObject;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public Long getSemesterId() {
		return semesterId;
	}
	public void setSemesterId(Long semesterId) {
		this.semesterId = semesterId;
	}
	public Long getPeriodId() {
		return periodId;
	}
	public void setPeriodId(Long periodId) {
		this.periodId = periodId;
	}
	public Long getClassId() {
		return classId;
	}
	public void setClassId(Long classId) {
		this.classId = classId;
	}
	public StudentDto getStudent() {
		return student;
	}
	public void setStudent(StudentDto student) {
		this.student = student;
	}
	public CourseRegisterViewDto getCourseRegisterViewObject() {
		return courseRegisterViewObject;
	}
	public void setCourseRegisterViewObject(CourseRegisterViewDto courseRegisterViewObject) {
		this.courseRegisterViewObject = courseRegisterViewObject;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public StudentCourseRegisterViewDto() {
		super();
	}
	
}
