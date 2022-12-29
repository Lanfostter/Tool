package com.example.tool.edudto;

public class StudentSumaryMarkDto {
	private String studentCode;
	private String studentName;
	private Long studentId;
	private Double totalMark;
	private Double totalMark4;
	private Integer totalCredit;
	private Double avgMark4;
	private Double avgMark;
	public String getStudentCode() {
		return studentCode;
	}
	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public Double getTotalMark() {
		return totalMark;
	}
	public void setTotalMark(Double totalMark) {
		this.totalMark = totalMark;
	}
	public Double getTotalMark4() {
		return totalMark4;
	}
	public void setTotalMark4(Double totalMark4) {
		this.totalMark4 = totalMark4;
	}
	public Integer getTotalCredit() {
		return totalCredit;
	}
	public void setTotalCredit(Integer totalCredit) {
		this.totalCredit = totalCredit;
	}
	
	public Double getAvgMark4() {
		return avgMark4;
	}
	public void setAvgMark4(Double avgMark4) {
		this.avgMark4 = avgMark4;
	}
	public Double getAvgMark() {
		return avgMark;
	}
	public void setAvgMark(Double avgMark) {
		this.avgMark = avgMark;
	}
	public StudentSumaryMarkDto(String studentCode,String studentName, Double totalMark, Double totalMark4, Long totalCredit,Long studentId) {
		this.studentCode=studentCode;
		this.studentId = studentId;
		this.studentName= studentName;
		this.totalMark = totalMark;
		this.totalMark4 = totalMark4;
		if(totalCredit!=null) {
			this.totalCredit = totalCredit.intValue();
			if(this.totalCredit!=null && this.totalCredit>0) {
				this.avgMark = this.totalMark/this.totalCredit;
				this.avgMark4 = this.totalMark4/this.totalCredit;
			}
		}
		
		
	}
	public StudentSumaryMarkDto() {
		
	}
}
