package com.example.tool.edudto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.globits.core.domain.TrainingBase;
import com.globits.core.dto.RoomDto;
import com.globits.core.dto.TrainingBaseDto;
import com.globits.education.domain.CourseSubject;
import com.globits.education.domain.CourseSubjectConfig;
import com.globits.education.domain.CourseSubjectSubjectExamFormula;
import com.globits.education.domain.CourseSubjectTimetable;
import com.globits.education.domain.SemesterSubject;
import com.globits.education.domain.Speciality;
import com.globits.education.domain.SubjectExam;
import com.globits.education.dto.CourseSubjectDto;
import com.globits.education.dto.SemesterSubjectDto;
import com.globits.education.dto.SubjectExamDto;
import com.globits.education.dto.SubjectExamTypeDto;
import com.globits.hr.domain.Staff;
import com.globits.hr.dto.StaffDto;


public class CourseSubjectSubjectExamFormulaDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	private String code; // Mã 
	private SubjectExamDto subjectExam;	
	private double coefficient;	
	private Integer coffi;
	private CourseSubjectDto courseSubject;
	private SemesterSubjectDto semesterSubject;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public SubjectExamDto getSubjectExam() {
		return subjectExam;
	}

	public void setSubjectExam(SubjectExamDto subjectExam) {
		this.subjectExam = subjectExam;
	}

	public double getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(double coefficient) {
		this.coefficient = coefficient;
	}

	public Integer getCoffi() {
		return coffi;
	}

	public void setCoffi(Integer coffi) {
		this.coffi = coffi;
	}	

	public CourseSubjectDto getCourseSubject() {
		return courseSubject;
	}

	public void setCourseSubject(CourseSubjectDto courseSubject) {
		this.courseSubject = courseSubject;
	}	

	public SemesterSubjectDto getSemesterSubject() {
		return semesterSubject;
	}

	public void setSemesterSubject(SemesterSubjectDto semesterSubject) {
		this.semesterSubject = semesterSubject;
	}

	public CourseSubjectSubjectExamFormulaDto(CourseSubjectSubjectExamFormula cs) {
		this.code = cs.getCode();		
		this.id = cs.getId();	
		this.coefficient=cs.getCoefficient();
		this.coffi=cs.getCoffi();
		if(cs.getSubjectExam()!=null) {
			this.subjectExam=new SubjectExamDto(cs.getSubjectExam(),true);
		}
		if(cs.getCourseSubject()!=null) {
			this.courseSubject=new CourseSubjectDto();
			this.courseSubject.setId(cs.getCourseSubject().getId());
			this.courseSubject.setCode(cs.getCourseSubject().getCode());
			this.courseSubject.setShortCode(cs.getCourseSubject().getShortCode());
			this.courseSubject.setDisplayName(cs.getCourseSubject().getDisplayName());
			this.courseSubject.setCheck(true);
		}
		if(cs.getSemesterSubject()!=null) {
			this.semesterSubject=new SemesterSubjectDto();
			this.semesterSubject.setId(cs.getSemesterSubject().getId());
		}
		
	}

	public CourseSubjectSubjectExamFormulaDto() {

	}
	public CourseSubjectSubjectExamFormulaDto(CourseSubjectSubjectExamFormula cs, SubjectExam se) {
		if(se!=null) {
			this.subjectExam=new SubjectExamDto();
			this.subjectExam.setId(se.getId());
			this.subjectExam.setCode(se.getCode());
			this.subjectExam.setName(se.getName());
			this.subjectExam.setInputMarkType(se.getInputMarkType());
			this.subjectExam.setExamType(se.getExamType());
			this.subjectExam.setSubjectExamType(new SubjectExamTypeDto(se.getSubjectExamType()));
			if(cs==null) {
				this.coefficient=se.getCoefficient();
				this.coffi=(int)(se.getCoefficient()*100);
				this.code=se.getCode();
			}
			if(se.getSemesterSubject()!=null) {
				this.semesterSubject=new SemesterSubjectDto();
				this.semesterSubject.setId(se.getSemesterSubject().getId());
			}
		}
		if(cs!=null) {
			this.code = cs.getCode();		
			this.id = cs.getId();	
			this.coefficient=cs.getCoefficient();
			this.coffi=cs.getCoffi();
			if(cs.getCourseSubject()!=null) {
				this.courseSubject=new CourseSubjectDto();
				this.courseSubject.setId(cs.getCourseSubject().getId());
				this.courseSubject.setCode(cs.getCourseSubject().getCode());
				this.courseSubject.setShortCode(cs.getCourseSubject().getShortCode());
				this.courseSubject.setDisplayName(cs.getCourseSubject().getDisplayName());
				this.courseSubject.setCheck(true);
			}
		}
		
	}
}
