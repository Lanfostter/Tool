package com.example.tool.edudto;

import com.globits.education.domain.StudentScholarshipStockDetail;
import com.globits.education.dto.ScholarshipFundDto;
import com.globits.education.dto.StudentScholarshipStockDto;

public class StudentScholarshipStockDetailDto {
	private Long id;
	private StudentScholarshipStockDto scholarshipStock;	
	
	private ScholarshipFundDto scholarshipFund;

	private Double semesterValue;//Tiền học bổng học kỳ cho loại học bồng này
	
	private Double semesterReceiveValue=0D;//Tiền đã nhận của học kỳ cho loại học bồng này
	
	private Double stockSemesterValue=0D;//tiền tồn của học kỳ

	private Double totalValue=0D;//Tổng số tiền được nhận của loại học bổng này, với sinh viên này

	private Double totalReceiveValue=0D;
	
	private Double totalStockValue=0D;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public StudentScholarshipStockDto getScholarshipStock() {
		return scholarshipStock;
	}

	public void setScholarshipStock(StudentScholarshipStockDto scholarshipStock) {
		this.scholarshipStock = scholarshipStock;
	}

	public ScholarshipFundDto getScholarshipFund() {
		return scholarshipFund;
	}

	public void setScholarshipFund(ScholarshipFundDto scholarshipFund) {
		this.scholarshipFund = scholarshipFund;
	}

	public Double getSemesterValue() {
		return semesterValue;
	}

	public void setSemesterValue(Double semesterValue) {
		this.semesterValue = semesterValue;
	}

	public Double getSemesterReceiveValue() {
		return semesterReceiveValue;
	}

	public void setSemesterReceiveValue(Double semesterReceiveValue) {
		this.semesterReceiveValue = semesterReceiveValue;
	}

	public Double getStockSemesterValue() {
		return stockSemesterValue;
	}

	public void setStockSemesterValue(Double stockSemesterValue) {
		this.stockSemesterValue = stockSemesterValue;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public Double getTotalReceiveValue() {
		return totalReceiveValue;
	}

	public void setTotalReceiveValue(Double totalReceiveValue) {
		this.totalReceiveValue = totalReceiveValue;
	}

	public Double getTotalStockValue() {
		return totalStockValue;
	}

	public void setTotalStockValue(Double totalStockValue) {
		this.totalStockValue = totalStockValue;
	}
	
	public StudentScholarshipStockDetailDto() {
		
	}
	public StudentScholarshipStockDetailDto(StudentScholarshipStockDetail entity) {
		this.id = entity.getId();
		this.semesterValue = entity.getSemesterValue();
		this.semesterReceiveValue = entity.getSemesterReceiveValue();
		this.stockSemesterValue = entity.getStockSemesterValue();
		this.totalReceiveValue = entity.getTotalReceiveValue();
		this.totalStockValue = entity.getTotalStockValue();
		this.totalValue = entity.getTotalValue();
		
		if (entity.getScholarshipStock() != null) {
			this.scholarshipStock = new StudentScholarshipStockDto();
			this.scholarshipStock.setId(entity.getScholarshipStock().getId());
		}
		if (entity.getScholarshipFund() != null) {
			this.scholarshipFund = new ScholarshipFundDto(entity.getScholarshipFund());
		}
	}
}
