package com.example.tool.edudto;

public class StudentScholarshipFundDto {
	private String studentCode;
	private String fundCode;
	private Double amount;//Tổng số tiền học bổng loại này trong kỳ
	public String getFundCode() {
		return fundCode;
	}
	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public String getStudentCode() {
		return studentCode;
	}
	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}
	public StudentScholarshipFundDto() {
		
	}
	
	public StudentScholarshipFundDto(String studentCode, String fundCode, Double amount) {
		this.studentCode = studentCode;
		this.fundCode = fundCode;
		this.amount = amount;
	}
}
