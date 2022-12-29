package com.example.tool.edudto;

public class StudentEnrollmentStatisticDto {
	private Long totalNumberOfCredit;
	private Long numberOfSubject;
	private Long numberOfStudent;
	public Long getTotalNumberOfCredit() {
		return totalNumberOfCredit;
	}
	public void setTotalNumberOfCredit(Long totalNumberOfCredit) {
		this.totalNumberOfCredit = totalNumberOfCredit;
	}
	public Long getNumberOfSubject() {
		return numberOfSubject;
	}
	public void setNumberOfSubject(Long numberOfSubject) {
		this.numberOfSubject = numberOfSubject;
	}
	public Long getNumberOfStudent() {
		return numberOfStudent;
	}
	public void setNumberOfStudent(Long numberOfStudent) {
		this.numberOfStudent = numberOfStudent;
	}
	public StudentEnrollmentStatisticDto() {
		
	}
	public StudentEnrollmentStatisticDto(Long totalNumberOfCredit,Long numberOfSubject,Long numberOfStudent) {
		this.totalNumberOfCredit=totalNumberOfCredit;
		this.numberOfSubject=numberOfSubject;
		this.numberOfStudent = numberOfStudent;
	}
}
