package com.example.tool.edudto;

import java.io.Serializable;

import com.globits.education.domain.Exam;
import com.globits.education.dto.CourseSubjectDto;

public class ExamDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long Id;

	private CourseSubjectDto courseSubject;// Thuoc dot hoc nao
	private Integer numberMinutes;// So phut thi
	private Integer examIndex;// Lan thi doi voi lop hoc phan hoc ky nay

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public CourseSubjectDto getCourseSubject() {
		return courseSubject;
	}

	public void setCourseSubject(CourseSubjectDto courseSubject) {
		this.courseSubject = courseSubject;
	}

	public Integer getNumberMinutes() {
		return numberMinutes;
	}

	public void setNumberMinutes(Integer numberMinutes) {
		this.numberMinutes = numberMinutes;
	}

	public Integer getExamIndex() {
		return examIndex;
	}

	public void setExamIndex(Integer examIndex) {
		this.examIndex = examIndex;
	}

	public ExamDto() {

	}

	public ExamDto(Exam sr) {
		this.Id = sr.getId();
		this.examIndex = sr.getExamIndex();
		this.numberMinutes = sr.getNumberMinutes();
		if (sr.getCourseSubject() != null) {
			this.courseSubject = new CourseSubjectDto(sr.getCourseSubject());
		}

	}

}
