package com.example.tool.edudto;

import java.util.Hashtable;
import java.util.List;

import com.globits.education.dto.StudentSubjectMarkListDto;
import com.globits.education.dto.SubjectExamDto;
import com.globits.education.dto.SubjectExamTypeDto;

public class ListStudentSubjectMarkDto {
	private String displayName;
	private Integer maxRound;
	private List<StudentSubjectMarkListDto> listStudentMark;	
	private List<SubjectExamDto> listExam;
	private List<SubjectExamTypeDto> listExamType;
	private Long trainingBaseId;
	private Long courseYearId;
	private Long departmentId;
	private Long specialityId;
	private Long enrollmentClassId;
	private Long semesterId;
	private Long subjectId;
	
	public Long getTrainingBaseId() {
		return trainingBaseId;
	}
	public void setTrainingBaseId(Long trainingBaseId) {
		this.trainingBaseId = trainingBaseId;
	}
	public Long getCourseYearId() {
		return courseYearId;
	}
	public void setCourseYearId(Long courseYearId) {
		this.courseYearId = courseYearId;
	}
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	public Long getSpecialityId() {
		return specialityId;
	}
	public void setSpecialityId(Long specialityId) {
		this.specialityId = specialityId;
	}
	public Long getEnrollmentClassId() {
		return enrollmentClassId;
	}
	public void setEnrollmentClassId(Long enrollmentClassId) {
		this.enrollmentClassId = enrollmentClassId;
	}
	public Long getSemesterId() {
		return semesterId;
	}
	public void setSemesterId(Long semesterId) {
		this.semesterId = semesterId;
	}
	public Long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public Integer getMaxRound() {
		return maxRound;
	}
	public void setMaxRound(Integer maxRound) {
		this.maxRound = maxRound;
	}
	public List<StudentSubjectMarkListDto> getListStudentMark() {
		return listStudentMark;
	}
	public void setListStudentMark(List<StudentSubjectMarkListDto> listStudentMark) {
		this.listStudentMark = listStudentMark;
	}
	public List<SubjectExamDto> getListExam() {
		return listExam;
	}
	public void setListExam(List<SubjectExamDto> listExam) {
		this.listExam = listExam;
	}
	public List<SubjectExamTypeDto> getListExamType() {
		return listExamType;
	}
	public void setListExamType(List<SubjectExamTypeDto> listExamType) {
		this.listExamType = listExamType;
	}
	
}
