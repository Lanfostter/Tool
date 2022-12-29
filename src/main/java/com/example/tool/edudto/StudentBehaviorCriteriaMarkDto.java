package com.example.tool.edudto;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.globits.education.domain.BehaviorMarkCriteria;
import com.globits.education.domain.CourseYear;
import com.globits.education.domain.Semester;
import com.globits.education.domain.StudentBehaviorCriteriaMark;
import com.globits.education.domain.StudentSemesterBehaviorMark;
import com.globits.education.dto.BehaviorMarkCriteriaDto;
import com.globits.education.dto.StudentSemesterBehaviorMarkDto;
import com.globits.education.domain.StudentBehaviorCriteriaMark;

public class StudentBehaviorCriteriaMarkDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private StudentSemesterBehaviorMarkDto studentSemesterBehaviorMark;
	private BehaviorMarkCriteriaDto behaviorMarkCriteria;
	private Double mark;
	private Double mark_teacher;
	private Double mark_department_managerment;
	private Double mark_student_managerment;
	private String modifiedBy;
	
	
	public Double getMark_teacher() {
		return mark_teacher;
	}
	public void setMark_teacher(Double mark_teacher) {
		this.mark_teacher = mark_teacher;
	}
	

	
	public Double getMark_department_managerment() {
		return mark_department_managerment;
	}
	public void setMark_department_managerment(Double mark_department_managerment) {
		this.mark_department_managerment = mark_department_managerment;
	}
	public Double getMark_student_managerment() {
		return mark_student_managerment;
	}
	public void setMark_student_managerment(Double mark_student_managerment) {
		this.mark_student_managerment = mark_student_managerment;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public StudentSemesterBehaviorMarkDto getStudentSemesterBehaviorMark() {
		return studentSemesterBehaviorMark;
	}
	public void setStudentSemesterBehaviorMark(StudentSemesterBehaviorMarkDto studentSemesterBehaviorMark) {
		this.studentSemesterBehaviorMark = studentSemesterBehaviorMark;
	}
	public BehaviorMarkCriteriaDto getBehaviorMarkCriteria() {
		return behaviorMarkCriteria;
	}
	public void setBehaviorMarkCriteria(BehaviorMarkCriteriaDto behaviorMarkCriteria) {
		this.behaviorMarkCriteria = behaviorMarkCriteria;
	}
	public Double getMark() {
		return mark;
	}
	public void setMark(Double mark) {
		this.mark = mark;
	}
	
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public StudentBehaviorCriteriaMarkDto() {

	}

	public StudentBehaviorCriteriaMarkDto(StudentBehaviorCriteriaMark b) {
		this.id = b.getId();
		this.mark = b.getMark();
		this.mark_teacher = b.getMark_teacher();
		this.mark_department_managerment = b.getMark_department_managerment();
		this.mark_student_managerment = b.getMark_student_managerment();
		
		if(b.getStudentSemesterBehaviorMark() != null) {
			this.studentSemesterBehaviorMark = new StudentSemesterBehaviorMarkDto();
			this.studentSemesterBehaviorMark.setId(b.getStudentSemesterBehaviorMark().getId());
		}
		if(b.getBehaviorMarkCriteria() != null) {
			this.behaviorMarkCriteria = new BehaviorMarkCriteriaDto(b.getBehaviorMarkCriteria());
		}
	}
}
