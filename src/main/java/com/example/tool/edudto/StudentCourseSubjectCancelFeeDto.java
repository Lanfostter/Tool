package com.example.tool.edudto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.globits.core.dto.BaseObjectDto;
import com.globits.education.domain.CourseSubject;
import com.globits.education.domain.ReceivePayAble;
import com.globits.education.domain.Student;
import com.globits.education.domain.StudentCourseSubjectCancelFee;
import com.globits.education.dto.CourseSubjectDto;
import com.globits.education.dto.ReceivePayAbleDetailDto;
import com.globits.education.dto.ReceivePayAbleDto;
import com.globits.education.dto.StudentDto;

public class StudentCourseSubjectCancelFeeDto extends BaseObjectDto implements Serializable {
	
	private StudentDto student;//Sinh viên nào

	private CourseSubjectDto courseSubject;//Hủy đăng ký học cho lớp học phần nào
	
	private String note;//Ghi chú
	
	private double tuitionFee;//Học phí ban đầu của môn học này
	
	private double payPercent;//Phần trăm sinh viên phải trả
	
	private double payAmount;//Số tiền phải trả = tuitionFee * payPercent/100
	
	private ReceivePayAbleDto receivePayAble;
	
	private ReceivePayAbleDetailDto receivePayAbleDetail;
	
	private String courseSubjectName;

	public StudentDto getStudent() {
		return student;
	}

	public void setStudent(StudentDto student) {
		this.student = student;
	}

	public CourseSubjectDto getCourseSubject() {
		return courseSubject;
	}

	public void setCourseSubject(CourseSubjectDto courseSubject) {
		this.courseSubject = courseSubject;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public double getTuitionFee() {
		return tuitionFee;
	}

	public void setTuitionFee(double tuitionFee) {
		this.tuitionFee = tuitionFee;
	}

	public double getPayPercent() {
		return payPercent;
	}

	public void setPayPercent(double payPercent) {
		this.payPercent = payPercent;
	}

	public double getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(double payAmount) {
		this.payAmount = payAmount;
	}

	public ReceivePayAbleDto getReceivePayAble() {
		return receivePayAble;
	}

	public void setReceivePayAble(ReceivePayAbleDto receivePayAble) {
		this.receivePayAble = receivePayAble;
	}
	
	public ReceivePayAbleDetailDto getReceivePayAbleDetail() {
		return receivePayAbleDetail;
	}

	public void setReceivePayAbleDetail(ReceivePayAbleDetailDto receivePayAbleDetail) {
		this.receivePayAbleDetail = receivePayAbleDetail;
	}

	public String getCourseSubjectName() {
		return courseSubjectName;
	}

	public void setCourseSubjectName(String courseSubjectName) {
		this.courseSubjectName = courseSubjectName;
	}

	public StudentCourseSubjectCancelFeeDto() {
		
	}
	public StudentCourseSubjectCancelFeeDto(StudentCourseSubjectCancelFee entity) {
		this.student = new StudentDto(entity.getStudent(), 0);
		if(entity.getCourseSubject()!=null) {
			this.courseSubject = new CourseSubjectDto(entity.getCourseSubject(),false);
			this.courseSubjectName = this.courseSubject.getDisplayName();
		}
		this.id = entity.getId();
		this.note = entity.getNote();
		this.tuitionFee = entity.getTuitionFee();
		this.payAmount = entity.getPayAmount();
		this.payPercent = entity.getPayPercent();		
	}
}
