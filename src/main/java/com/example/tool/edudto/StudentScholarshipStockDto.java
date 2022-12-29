package com.example.tool.edudto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.globits.education.domain.StudentObjectStudentSemester;
import com.globits.education.domain.StudentScholarshipStock;
import com.globits.education.domain.StudentScholarshipStockDetail;
import com.globits.education.dto.ScholarshipFundDto;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.StudentDto;
import com.globits.education.dto.StudentScholarshipStockDetailDto;
import com.globits.education.dto.StudentScholarshipStockDto;

public class StudentScholarshipStockDto {
	private Long id;
	private StudentDto student;
	
	private SemesterDto semester;
	
	private Double semesterValue=0D;
	
	private Double semesterReceiveValue=0D;//Tiền đã nhận của học kỳ
	
	private Double stockSemesterValue=0D;//tiền tồn của học kỳ
	
	private Double receiveSemesterValue =0D;
	
	private Double totalValue=0D;

	private Double totalReceiveValue=0D;
	
	private Double totalStockValue=0D;
	
	private Set<StudentScholarshipStockDetailDto> details;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public StudentDto getStudent() {
		return student;
	}

	public void setStudent(StudentDto student) {
		this.student = student;
	}

	public SemesterDto getSemester() {
		return semester;
	}

	public void setSemester(SemesterDto semester) {
		this.semester = semester;
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

	public Double getReceiveSemesterValue() {
		return receiveSemesterValue;
	}

	public void setReceiveSemesterValue(Double receiveSemesterValue) {
		this.receiveSemesterValue = receiveSemesterValue;
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

	public Set<StudentScholarshipStockDetailDto> getDetails() {
		return details;
	}

	public void setDetails(Set<StudentScholarshipStockDetailDto> details) {
		this.details = details;
	}
	
	public StudentScholarshipStockDto() {}
	
	public StudentScholarshipStockDto (StudentScholarshipStock entity) {
		this.id = entity.getId();
		this.student = new StudentDto(entity.getStudent(), true);
		if (entity.getSemester() != null) {
			this.semester = new SemesterDto();
			this.semester.setId(entity.getSemester().getId());
			this.semester.setSemesterCode(entity.getSemester().getSemesterCode());
			this.semester.setSemesterName(entity.getSemester().getSemesterName());
		}
		this.semesterValue = entity.getSemesterValue();
		this.semesterReceiveValue = entity.getSemesterReceiveValue();
		this.stockSemesterValue = entity.getStockSemesterValue();
		this.receiveSemesterValue = entity.getReceiveSemesterValue();
		this.totalValue = entity.getTotalValue();
		this.totalReceiveValue = entity.getTotalReceiveValue();
		this.totalStockValue = entity.getTotalStockValue();
		
		if (entity.getDetails() != null && entity.getDetails().size() > 0) {
			this.details = new HashSet<StudentScholarshipStockDetailDto>();
			for(StudentScholarshipStockDetail studentScholarshipStockDetail:entity.getDetails()) {
				StudentScholarshipStockDetailDto detail = new StudentScholarshipStockDetailDto();
				detail.setId(studentScholarshipStockDetail.getId());
				
				if (studentScholarshipStockDetail.getScholarshipStock() != null) {
					detail.setScholarshipStock(new StudentScholarshipStockDto());
					detail.getScholarshipStock().setId(studentScholarshipStockDetail.getScholarshipStock().getId());
				}
				
				detail.setSemesterValue(studentScholarshipStockDetail.getSemesterValue());
				detail.setSemesterReceiveValue(studentScholarshipStockDetail.getSemesterReceiveValue());
				detail.setStockSemesterValue(studentScholarshipStockDetail.getStockSemesterValue());
				detail.setTotalValue(studentScholarshipStockDetail.getTotalValue());
				detail.setTotalReceiveValue(studentScholarshipStockDetail.getTotalReceiveValue());
				detail.setTotalStockValue(studentScholarshipStockDetail.getTotalStockValue());
				
				if (studentScholarshipStockDetail.getScholarshipFund() != null) {
					detail.setScholarshipFund(new ScholarshipFundDto(studentScholarshipStockDetail.getScholarshipFund()));
				}
				
				this.details.add(detail);
			}
			
		}
	}
	
}
