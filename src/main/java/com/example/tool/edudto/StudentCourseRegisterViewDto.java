package com.example.tool.edudto;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;

import com.globits.core.dto.BaseObjectDto;


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
	private List<StudentSubjectMarkDto> studentSubjectMarks;
	private List<CsEduProgramParamDto> listEduProgram;
	private List<StudentCourseSubjectDto> listStudentCourseSubject;
	public StudentCourseRegisterViewDto() {
		
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
	public List<StudentSubjectMarkDto> getStudentSubjectMarks() {
		return studentSubjectMarks;
	}
	public void setStudentSubjectMarks(List<StudentSubjectMarkDto> studentSubjectMarks) {
		this.studentSubjectMarks = studentSubjectMarks;
	}
	public List<CsEduProgramParamDto> getListEduProgram() {
		return listEduProgram;
	}
	public void setListEduProgram(List<CsEduProgramParamDto> listEduProgram) {
		this.listEduProgram = listEduProgram;
	}
	public List<StudentCourseSubjectDto> getListStudentCourseSubject() {
		return listStudentCourseSubject;
	}
	public void setListStudentCourseSubject(List<StudentCourseSubjectDto> listStudentCourseSubject) {
		this.listStudentCourseSubject = listStudentCourseSubject;
	}
}
