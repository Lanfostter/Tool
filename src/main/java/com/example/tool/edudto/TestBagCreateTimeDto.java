package com.example.tool.edudto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.globits.education.domain.CourseHour;
import com.globits.education.domain.SemesterSubjectExam;
import com.globits.education.domain.TestBagCreateTime;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.SemesterSubjectExamDto;
import com.globits.education.dto.SubjectDto;

public class TestBagCreateTimeDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String code;
	private SemesterSubjectExamDto semesterSubjectExam;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public SemesterSubjectExamDto getSemesterSubjectExam() {
		return semesterSubjectExam;
	}
	public void setSemesterSubjectExam(SemesterSubjectExamDto semesterSubjectExam) {
		this.semesterSubjectExam = semesterSubjectExam;
	}
	public TestBagCreateTimeDto() {
		
	}
	public TestBagCreateTimeDto(TestBagCreateTime entity) {
		if(entity!=null) {
			this.id = entity.getId();
			this.name = entity.getName();
			this.code = entity.getCode();
			if(entity.getSemesterSubjectExam()!=null) {
				this.semesterSubjectExam = new SemesterSubjectExamDto(entity.getSemesterSubjectExam());	
			}			
		}
	}
	public TestBagCreateTimeDto(TestBagCreateTime entity,Boolean simple) {
		if(entity!=null) {
			this.id = entity.getId();
			this.name = entity.getName();
			this.code = entity.getCode();
			if(entity.getSemesterSubjectExam()!=null) {
				SemesterSubjectExamDto dto=new SemesterSubjectExamDto();
				dto.setId(entity.getSemesterSubjectExam().getId());
				
				if(entity.getSemesterSubjectExam().getSemester()!=null) {
					SemesterDto semesterDto = new SemesterDto();
					semesterDto.setId(entity.getSemesterSubjectExam().getSemester().getId());
					semesterDto.setSemesterCode(entity.getSemesterSubjectExam().getSemester().getSemesterCode());
					semesterDto.setSemesterName(entity.getSemesterSubjectExam().getSemester().getSemesterName());
					dto.setSemester(semesterDto);
				}
				if(entity.getSemesterSubjectExam().getSubject()!=null) {
					SubjectDto subjectDto = new SubjectDto();
					subjectDto.setId(entity.getSemesterSubjectExam().getSubject().getId());
					subjectDto.setSubjectCode(entity.getSemesterSubjectExam().getSubject().getSubjectCode());
					subjectDto.setSubjectName(entity.getSemesterSubjectExam().getSubject().getSubjectName());
					subjectDto.setSubjectNameEng(entity.getSemesterSubjectExam().getSubject().getSubjectNameEng());
					dto.setSubject(subjectDto);
				}
				dto.setExamRound(entity.getSemesterSubjectExam().getExamRound());
				dto.setDescription(entity.getSemesterSubjectExam().getDescription());
				dto.setNumberRoom(entity.getSemesterSubjectExam().getNumberRoom());
				dto.setNumberStudent(entity.getSemesterSubjectExam().getNumberStudent());
				dto.setNumberEstimateStudent(entity.getSemesterSubjectExam().getNumberEstimateStudent());
				this.semesterSubjectExam=dto;
			}			
		}
	}
}
