package com.example.tool.edudto;

import java.util.Date;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.globits.education.domain.ReceivePayAble;
import com.globits.education.domain.StudentScholarshipHistory;
import com.globits.education.domain.StudentSemesterBehaviorMarkHistory;
import com.globits.education.domain.StudentSemesterScholarship;
import com.globits.education.dto.StudentSemesterBehaviorMarkDto;

public class StudentSemesterBehaviorMarkHistoryDto {
	
	private Long id;
	private StudentSemesterBehaviorMarkDto studentSemesterBehaviorMark;	
	private Double mark;//Số điểm rèn luỵện sau điều chỉnh
	private Double markBefore;//Số điểm trước khi điều chỉnh
	private Date dateModify;//Thời điểm thay đổi
	private String userModify;//Người thay đổi	
	private Integer level;//cấp nào chấm (=1:sinh viên, =2 cố vấn, 3=Khoa)
	
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
	public Double getMark() {
		return mark;
	}
	public void setMark(Double mark) {
		this.mark = mark;
	}
	public Double getMarkBefore() {
		return markBefore;
	}
	public void setMarkBefore(Double markBefore) {
		this.markBefore = markBefore;
	}
	public Date getDateModify() {
		return dateModify;
	}
	public void setDateModify(Date dateModify) {
		this.dateModify = dateModify;
	}
	public String getUserModify() {
		return userModify;
	}
	public void setUserModify(String userModify) {
		this.userModify = userModify;
	}
		
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public StudentSemesterBehaviorMarkHistoryDto() {
		
	}
	public StudentSemesterBehaviorMarkHistoryDto(StudentSemesterBehaviorMarkHistory entity) {
		if(entity!=null) {
			if(entity.getStudentSemesterBehaviorMark()!=null) {
				this.studentSemesterBehaviorMark = new StudentSemesterBehaviorMarkDto(entity.getStudentSemesterBehaviorMark());
			}
			
			this.mark = entity.getMark();
			this.markBefore = entity.getMarkBefore();
			this.dateModify = entity.getDateModify();
			this.userModify = entity.getUserModify();
			this.level=entity.getLevel();
		}
	}
}
