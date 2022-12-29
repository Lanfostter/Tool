package com.example.tool.edudto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.tool.edudto.TimeTableDto;
import com.globits.education.domain.CourseSubject;
import com.globits.education.domain.TimetableDetail;
import com.globits.education.dto.CourseSubjectDto;

public class TimetableDetailDto {
	private Date date; // Ngày
	private Long id;
	private TimeTableDto timeTable;
	
	private Long subjectId;
	
	private String subjectName;
	
	private String subjectCode;
	
	private String semesterName="";
	
	private String schoolYear="";
	private Integer week;// Tuần 
	private Integer status;// Tuần 
	private CourseSubjectDto courseSubject;// Lớp học phần
	private boolean isNew=false;

	public String getSemesterName() {
		return semesterName;
	}

	public void setSemesterName(String semesterName) {
		this.semesterName = semesterName;
	}

	public String getSchoolYear() {
		return schoolYear;
	}

	public void setSchoolYear(String schoolYear) {
		this.schoolYear = schoolYear;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public TimeTableDto getTimeTable() {
		return timeTable;
	}

	public void setTimeTable(TimeTableDto timeTable) {
		this.timeTable = timeTable;
	}

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}
	
	public Integer getWeek() {
		return week;
	}

	public void setWeek(Integer week) {
		this.week = week;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public CourseSubjectDto getCourseSubject() {
		return courseSubject;
	}

	public void setCourseSubject(CourseSubjectDto courseSubject) {
		this.courseSubject = courseSubject;
	}

	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	public TimetableDetailDto() {
		
	}
	public TimetableDetailDto(TimetableDetail time) {
			this.id=time.getId();
			this.date=time.getDate();
			this.week=time.getWeek();
			this.status=time.getStatus();
			if(time.getTimeTable()!=null)
			this.timeTable=new TimeTableDto(time.getTimeTable());
			if(time.getCourseSubject()!=null) {
				this.courseSubject=new CourseSubjectDto();
				this.courseSubject.setId(time.getCourseSubject().getId());
				this.courseSubject.setCode(time.getCourseSubject().getCode());
				if(time.getCourseSubject().getSemesterSubject()!=null && time.getCourseSubject().getSemesterSubject().getSubject()!=null)
				this.subjectName=time.getCourseSubject().getSemesterSubject().getSubject().getSubjectName();
			}
			
		}
}
