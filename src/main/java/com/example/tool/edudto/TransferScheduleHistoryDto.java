package com.example.tool.edudto;
import java.io.Serializable;
import java.util.Date;

import com.globits.education.domain.Certificate;
import com.globits.education.domain.CourseSubject;
import com.globits.education.domain.TransferScheduleHistory;
import com.globits.education.dto.CourseSubjectDto;

public class TransferScheduleHistoryDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String code;
	private String note;	//nội dung
	private Date dateTransfer;//ngày
	private CourseSubjectDto courseSubject;//lớp dịch chuyển lịch học
	
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
	
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Date getDateTransfer() {
		return dateTransfer;
	}
	public void setDateTransfer(Date dateTransfer) {
		this.dateTransfer = dateTransfer;
	}
	public CourseSubjectDto getCourseSubject() {
		return courseSubject;
	}
	public void setCourseSubject(CourseSubjectDto courseSubject) {
		this.courseSubject = courseSubject;
	}
	public TransferScheduleHistoryDto() {

	}

	public TransferScheduleHistoryDto(TransferScheduleHistory c) {
		this.id = c.getId();
		this.name = c.getName();
		this.code = c.getCode();
		this.note=c.getNote();
		this.dateTransfer=c.getDateTransfer();
		if(c.getCourseSubject()!=null) {
			CourseSubjectDto csDto=new CourseSubjectDto();
			csDto.setId(c.getCourseSubject().getId());
			csDto.setCode(c.getCourseSubject().getCode());
			csDto.setShortCode(c.getCourseSubject().getShortCode());
			csDto.setDisplayName(c.getCourseSubject().getDisplayName());
		}
	}
}
