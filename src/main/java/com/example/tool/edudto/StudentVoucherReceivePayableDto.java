package com.example.tool.edudto;

import java.util.List;

import com.globits.education.dto.EducationVoucherDto;
import com.globits.education.dto.ReceivePayAbleDto;

public class StudentVoucherReceivePayableDto {
	private Long studentId;
	private String studentName;
	private Double differenceAmount;//Số tiền chênh lệch
	private String displayAmountText;
	private Double totalPayable;
	private Double totalVoucherAmount;
	private List<ReceivePayAbleDto> receivePayableDtos;
	private List<EducationVoucherDto> voucherDtos;
	
	
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Double getDifferenceAmount() {
		return differenceAmount;
	}
	public void setDifferenceAmount(Double differenceAmount) {
		this.differenceAmount = differenceAmount;
	}
	public String getDisplayAmountText() {
		return displayAmountText;
	}
	public void setDisplayAmountText(String displayAmountText) {
		this.displayAmountText = displayAmountText;
	}
	public List<ReceivePayAbleDto> getReceivePayableDtos() {
		return receivePayableDtos;
	}
	public void setReceivePayableDtos(List<ReceivePayAbleDto> receivePayableDtos) {
		this.receivePayableDtos = receivePayableDtos;
	}
	public List<EducationVoucherDto> getVoucherDtos() {
		return voucherDtos;
	}
	public void setVoucherDtos(List<EducationVoucherDto> voucherDtos) {
		this.voucherDtos = voucherDtos;
	}
	public Double getTotalPayable() {
		return totalPayable;
	}
	public void setTotalPayable(Double totalPayable) {
		this.totalPayable = totalPayable;
	}
	public Double getTotalVoucherAmount() {
		return totalVoucherAmount;
	}
	public void setTotalVoucherAmount(Double totalVoucherAmount) {
		this.totalVoucherAmount = totalVoucherAmount;
	}
	
}
