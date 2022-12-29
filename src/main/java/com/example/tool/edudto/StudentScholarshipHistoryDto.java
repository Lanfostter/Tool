package com.example.tool.edudto;

import java.util.Date;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.globits.education.domain.ReceivePayAble;
import com.globits.education.domain.StudentScholarshipHistory;
import com.globits.education.domain.StudentSemesterScholarship;
import com.globits.education.dto.ReceivePayAbleDto;
import com.globits.education.dto.StudentSemesterScholarshipDto;

public class StudentScholarshipHistoryDto {
	
	private Long id;
	private StudentSemesterScholarshipDto studentSemesterScholarship;
	
	private ReceivePayAbleDto receivePayAble;//Khoản thu tạo ra khi thay đổi
	
	private Double amount;//Số tiền học bổng sau điều chỉnh
	private Double amountBefore;//Số tiền trước khi điều chỉnh
	private Date dateModify;//Thời điểm thay đổi
	private String userModify;//Người thay đổi	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public StudentSemesterScholarshipDto getStudentSemesterScholarship() {
		return studentSemesterScholarship;
	}
	public void setStudentSemesterScholarship(StudentSemesterScholarshipDto studentSemesterScholarship) {
		this.studentSemesterScholarship = studentSemesterScholarship;
	}
	public ReceivePayAbleDto getReceivePayAble() {
		return receivePayAble;
	}
	public void setReceivePayAble(ReceivePayAbleDto receivePayAble) {
		this.receivePayAble = receivePayAble;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getAmountBefore() {
		return amountBefore;
	}
	public void setAmountBefore(Double amountBefore) {
		this.amountBefore = amountBefore;
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
	
	public StudentScholarshipHistoryDto() {
		
	}
	public StudentScholarshipHistoryDto(StudentScholarshipHistory entity) {
		if(entity!=null) {
			if(entity.getStudentSemesterScholarship()!=null) {
				this.studentSemesterScholarship = new StudentSemesterScholarshipDto(entity.getStudentSemesterScholarship());
			}
			if(entity.getReceivePayAble()!=null) {
				this.receivePayAble = new ReceivePayAbleDto(entity.getReceivePayAble());
			}
			this.amount = entity.getAmount();
			this.amountBefore = entity.getAmountBefore();
			this.dateModify = entity.getDateModify();
			this.userModify = entity.getUserModify();
		}
	}
}
