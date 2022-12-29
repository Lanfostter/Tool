package com.example.tool.edudto;

import java.util.List;

import com.globits.education.dto.StudentScholarshipFundDto;

public class StudentScholarshipSummaryDto {
	private String studentCode;
	private Double amount;//Số tiền cấp (hoặc tổng số tiền tồn)
	//Số tiền học bổng trong kỳ tương ứng với cột số tiền cấp 
	private List<StudentScholarshipFundDto> scholarshipFund;
	//Số tiền đã lĩnh bằng tiền mặt
	private List<StudentScholarshipFundDto> receiveScholarshipFund;
	//Số tiền đã chuyển đổi sang học phí
	private List<StudentScholarshipFundDto> exchangeScholarshipFund;
	//Số tiền còn tồn
	private List<StudentScholarshipFundDto> inStockScholarshipFund;
	public String getStudentCode() {
		return studentCode;
	}
	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public StudentScholarshipSummaryDto() {
		
	}
	
	public List<StudentScholarshipFundDto> getScholarshipFund() {
		return scholarshipFund;
	}
	public void setScholarshipFund(List<StudentScholarshipFundDto> scholarshipFund) {
		this.scholarshipFund = scholarshipFund;
	}
	
	
	public List<StudentScholarshipFundDto> getReceiveScholarshipFund() {
		return receiveScholarshipFund;
	}
	public void setReceiveScholarshipFund(List<StudentScholarshipFundDto> receiveScholarshipFund) {
		this.receiveScholarshipFund = receiveScholarshipFund;
	}
	
	
	public List<StudentScholarshipFundDto> getExchangeScholarshipFund() {
		return exchangeScholarshipFund;
	}
	public void setExchangeScholarshipFund(List<StudentScholarshipFundDto> exchangeScholarshipFund) {
		this.exchangeScholarshipFund = exchangeScholarshipFund;
	}
	public List<StudentScholarshipFundDto> getInStockScholarshipFund() {
		return inStockScholarshipFund;
	}
	public void setInStockScholarshipFund(List<StudentScholarshipFundDto> inStockScholarshipFund) {
		this.inStockScholarshipFund = inStockScholarshipFund;
	}
	public StudentScholarshipSummaryDto(Double amount, String studentCode) {
		this.studentCode = studentCode;
		this.amount = amount;
	}
	
}
