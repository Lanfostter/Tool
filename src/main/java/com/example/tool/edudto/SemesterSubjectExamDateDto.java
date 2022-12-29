package com.example.tool.edudto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.formula.functions.Roman;

import com.globits.core.dto.RoomDto;
import com.globits.education.domain.SemesterSubjectExamDate;
import com.globits.education.domain.SemesterSubjectExamHour;
import com.globits.education.dto.SemesterSubjectExamDto;
import com.globits.education.dto.SemesterSubjectExamHourDto;
import com.globits.education.domain.ExamHour;

public class SemesterSubjectExamDateDto implements Serializable {

	private Long id;
	
	private SemesterSubjectExamDto semesterSubjectExam;

	private Date date;

	private Set<SemesterSubjectExamHourDto> examHours;
	
	private RoomDto room;

	public RoomDto getRoom() {
		return room;
	}

	public void setRoom(RoomDto room) {
		this.room = room;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SemesterSubjectExamDto getSemesterSubjectExam() {
		return semesterSubjectExam;
	}

	public void setSemesterSubjectExam(SemesterSubjectExamDto semesterSubjectExam) {
		this.semesterSubjectExam = semesterSubjectExam;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Set<SemesterSubjectExamHourDto> getExamHours() {
		return examHours;
	}

	public void setExamHours(Set<SemesterSubjectExamHourDto> examHours) {
		this.examHours = examHours;
	}

	public SemesterSubjectExamDateDto() {
		super();
	}

	public SemesterSubjectExamDateDto(SemesterSubjectExamDate entity) {
		this.id = entity.getId();
		if(entity.getSemesterSubjectExam() != null) {
			SemesterSubjectExamDto semesterSubjectExam = new SemesterSubjectExamDto();
			semesterSubjectExam.setId(entity.getSemesterSubjectExam().getId());
			
			this.semesterSubjectExam = semesterSubjectExam;
		}
		if(entity.getDate() != null) {
			this.date = entity.getDate();
		}
		if(entity.getExamHours() != null) {
			Set<SemesterSubjectExamHourDto> examHours = new HashSet<SemesterSubjectExamHourDto>();
			
			for(SemesterSubjectExamHour examHour : entity.getExamHours()) {
				SemesterSubjectExamHourDto examHourDto = new SemesterSubjectExamHourDto(examHour);
				examHourDto.setExamDate(null);
				examHours.add(examHourDto);
			}
			this.examHours = examHours;
		}
		if(entity.getRoom() != null) {
			this.room = new RoomDto(entity.getRoom());
		}
		
	}
	
	public SemesterSubjectExamDateDto(SemesterSubjectExamDate entity, Boolean isGetStudentInRoom) {
		this.id = entity.getId();
		if(entity.getSemesterSubjectExam() != null) {
			SemesterSubjectExamDto semesterSubjectExam = new SemesterSubjectExamDto();
			semesterSubjectExam.setId(entity.getSemesterSubjectExam().getId());
			
			this.semesterSubjectExam = semesterSubjectExam;
		}
		if(entity.getDate() != null) {
			this.date = entity.getDate();
		}
		if(entity.getExamHours() != null) {
			Set<SemesterSubjectExamHourDto> examHours = new HashSet<SemesterSubjectExamHourDto>();
			
			for(SemesterSubjectExamHour examHour : entity.getExamHours()) {
				SemesterSubjectExamHourDto examHourDto = new SemesterSubjectExamHourDto(examHour,isGetStudentInRoom);
				examHourDto.setExamDate(null);
				examHours.add(examHourDto);
			}
			this.examHours = examHours;
		}
		if(entity.getRoom() != null) {
			this.room = new RoomDto(entity.getRoom());
		}
		
	}

}
