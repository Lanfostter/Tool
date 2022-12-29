package com.example.tool.edudto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.globits.education.domain.CourseHour;
import com.globits.education.domain.CourseSubject;
import com.globits.education.domain.Semester;
import com.globits.education.domain.SemesterRegisterPeriod;
import com.globits.education.domain.Student;
import com.globits.education.domain.StudentCourseSubjectEdited;
import com.globits.education.domain.StudentCourseSubjectHistory;
import com.globits.education.dto.CourseSubjectDto;
import com.globits.education.dto.StudentDto;

public class StudentCourseSubjectHistoryDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private StudentDto student;
	
	private String username;//người tác động
	private CourseSubjectDto courseSubject;//Đăng ký học hay hủy đăng ký học cho lớp học phần nào
	/*Hành động gì - hủy, đăng ký mới. Lưu ý nếu đổi lớp thì sẽ tính là 2 action
	 *  1. Đăng ký học cho lớp mới
	 *  2. Hủy lớp cũ
	 *  Nên hành động đổi lớp sẽ tạo ra 2 bản ghi History hoặc 1 bản ghi tùy vào yêu cầu
	 *  Const.CourseSubjectRegAction
	 *  3. Chuyển lớp đăng ký
	 */
	private int action;	//hành động
	private String note;//Ghi chú	
	private Date actionTime;//thờig gian
	private String ip;
	private String subjectCode;
	private String subjectName;
	private String semesterCode;
	private String semesterName;
	private String periodName;
	private String createdBy;//người tạo
	private String displayName;//tên lớp học phần
	private String shortCode;//mã lớp học phần
	private int numberOfCredit;//số tín chỉ
	private String traningBaseName;//cơ sở thuộc lớp học phần
	private String courseYearName;//khóa của lớp học phần
	public StudentDto getStudent() {
		return student;
	}

	public void setStudent(StudentDto student) {
		this.student = student;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public int getAction() {
		return action;
	}

	public void setAction(int action) {
		this.action = action;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getActionTime() {
		return actionTime;
	}

	public void setActionTime(Date actionTime) {
		this.actionTime = actionTime;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSemesterCode() {
		return semesterCode;
	}

	public void setSemesterCode(String semesterCode) {
		this.semesterCode = semesterCode;
	}

	public String getSemesterName() {
		return semesterName;
	}

	public void setSemesterName(String semesterName) {
		this.semesterName = semesterName;
	}

	public String getPeriodName() {
		return periodName;
	}

	public void setPeriodName(String periodName) {
		this.periodName = periodName;
	}
	

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public int getNumberOfCredit() {
		return numberOfCredit;
	}

	public void setNumberOfCredit(int numberOfCredit) {
		this.numberOfCredit = numberOfCredit;
	}

	public String getTraningBaseName() {
		return traningBaseName;
	}

	public void setTraningBaseName(String traningBaseName) {
		this.traningBaseName = traningBaseName;
	}

	public String getCourseYearName() {
		return courseYearName;
	}

	public void setCourseYearName(String courseYearName) {
		this.courseYearName = courseYearName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getShortCode() {
		return shortCode;
	}

	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}

	public StudentCourseSubjectHistoryDto() {
		
	}
	
	public StudentCourseSubjectHistoryDto(StudentCourseSubjectHistory entity) {
		this.id = entity.getId();
		if(entity.getStudent()!=null) {
			this.student = new StudentDto(entity.getStudent(), true);
		}
		this.action=entity.getAction();
		this.actionTime=entity.getActionTime();
		this.ip=entity.getIp();
		this.note=entity.getNote();
		this.username=entity.getUsername();
		this.createdBy=entity.getCreatedBy();
		if(entity.getCourseSubject()!=null) {
			this.courseSubject=new CourseSubjectDto();
			this.courseSubject.setShortCode(entity.getCourseSubject().getShortCode());
			this.courseSubject.setDisplayName(entity.getCourseSubject().getDisplayName());
			this.displayName=entity.getCourseSubject().getDisplayName();
			this.shortCode=entity.getCourseSubject().getShortCode();
			this.courseSubject.setId(entity.getCourseSubject().getId());
			if(entity.getCourseSubject().getSemesterSubject()!=null) {
				if(entity.getCourseSubject().getSemesterSubject().getSubject()!=null) {
					this.subjectCode=entity.getCourseSubject().getSemesterSubject().getSubject().getSubjectCode();
					this.subjectName=entity.getCourseSubject().getSemesterSubject().getSubject().getSubjectName();
					this.numberOfCredit=entity.getCourseSubject().getSemesterSubject().getSubject().getNumberOfCredit();
				}
				if(entity.getCourseSubject().getSemesterSubject().getSemester()!=null) {
					this.semesterCode=entity.getCourseSubject().getSemesterSubject().getSemester().getSemesterCode();
					this.semesterName=entity.getCourseSubject().getSemesterSubject().getSemester().getSemesterName();
				}
				if(entity.getCourseSubject().getSemesterSubject().getRegisterPeriod()!=null) {
					this.periodName=entity.getCourseSubject().getSemesterSubject().getRegisterPeriod().getName();
				}
				if(entity.getCourseSubject().getSemesterSubject().getCourseyear()!=null) {
					this.courseYearName=entity.getCourseSubject().getSemesterSubject().getCourseyear().getName();
				}
				if(entity.getCourseSubject().getTrainingBase()!=null) {
					this.traningBaseName=entity.getCourseSubject().getTrainingBase().getName();
				}
				
			}
			if(this.displayName==null || this.displayName=="") {
				if(this.subjectName!=null&&entity.getCourseSubject().getShortCode()!=null && entity.getCourseSubject().getShortCode().contains("-")) {
					this.displayName = subjectName + entity.getCourseSubject().getShortCode().substring(entity.getCourseSubject().getShortCode().indexOf("-"), entity.getCourseSubject().getShortCode().length());	
				}
				else {
					this.displayName = subjectName +" " + entity.getCourseSubject().getShortCode();
				}
			}
		}
		
	}
}
