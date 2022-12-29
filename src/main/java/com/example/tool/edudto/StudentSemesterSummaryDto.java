package com.example.tool.edudto;

import com.globits.core.dto.BaseObjectDto;
import com.globits.education.domain.Semester;
import com.globits.education.domain.Student;
import com.globits.education.domain.StudentSemesterSummary;
import com.globits.education.domain.StudentSemesterSummaryMark;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.StudentDto;

public class StudentSemesterSummaryDto extends BaseObjectDto{
	private SemesterDto semester;
	private StudentDto student;
	private Integer numberCumulativeCreditSemester; //Số tín chỉ tích lũy của học kỳ được xét
	private Integer numberCumulativeCredit2Semester;//Số tín chỉ tích lũy của học kỳ được xét và học kỳ trước đó
	private Double cumulativeMarkSemester;//Điểm trung bình học kỳ
	private Double cumulativeMark2Semester;//Điểm trung bình 2 học kỳ liên tiếp
	private Integer totalLearningCreditSemester;//Tổng số tín chỉ đăng ký học kỳ vừa xét
	private Integer totalLearningCredit2Semester;//Tổng số tín chỉ tích lũy 2 học kỳ liên tiếp
	private Double cumulativeMark;//Điểm trung bình tích lũy toàn bộ
	private Integer numberCumulativeCredit; //Số tín chỉ tích lũy toàn bộ
	
	private Double learningMark4;//Điểm chung bình chung hệ 4 ngành 1 
	private Double cumulativeMark4Semester;//Điểm trung bình học kỳ tích lũy hệ 4
	private Double cumulativeMark42Semester;//Điểm trung bình tích lũy hệ 4 2 học kỳ liên tiếp
	private Double learningMark42Semester;//Điểm trung bình chung 2 học kỳ liên tiếp hệ 4
	private Double cumulativeMark4;//Điểm trung bình tích lũy toàn bộ hệ 4
	public SemesterDto getSemester() {
		return semester;
	}
	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}
	public StudentDto getStudent() {
		return student;
	}
	public void setStudent(StudentDto student) {
		this.student = student;
	}
	
	public Integer getNumberCumulativeCreditSemester() {
		return numberCumulativeCreditSemester;
	}
	public void setNumberCumulativeCreditSemester(Integer numberCumulativeCreditSemester) {
		this.numberCumulativeCreditSemester = numberCumulativeCreditSemester;
	}
	public Integer getNumberCumulativeCredit2Semester() {
		return numberCumulativeCredit2Semester;
	}
	public void setNumberCumulativeCredit2Semester(Integer numberCumulativeCredit2Semester) {
		this.numberCumulativeCredit2Semester = numberCumulativeCredit2Semester;
	}
	public Double getCumulativeMarkSemester() {
		return cumulativeMarkSemester;
	}
	public void setCumulativeMarkSemester(Double cumulativeMarkSemester) {
		this.cumulativeMarkSemester = cumulativeMarkSemester;
	}
	public Double getCumulativeMark2Semester() {
		return cumulativeMark2Semester;
	}
	public void setCumulativeMark2Semester(Double cumulativeMark2Semester) {
		this.cumulativeMark2Semester = cumulativeMark2Semester;
	}


	public Integer getTotalLearningCreditSemester() {
		return totalLearningCreditSemester;
	}
	public void setTotalLearningCreditSemester(Integer totalLearningCreditSemester) {
		this.totalLearningCreditSemester = totalLearningCreditSemester;
	}
	public Integer getTotalLearningCredit2Semester() {
		return totalLearningCredit2Semester;
	}
	public void setTotalLearningCredit2Semester(Integer totalLearningCredit2Semester) {
		this.totalLearningCredit2Semester = totalLearningCredit2Semester;
	}
	public Double getCumulativeMark() {
		return cumulativeMark;
	}
	public void setCumulativeMark(Double cumulativeMark) {
		this.cumulativeMark = cumulativeMark;
	}
	public Integer getNumberCumulativeCredit() {
		return numberCumulativeCredit;
	}
	public void setNumberCumulativeCredit(Integer numberCumulativeCredit) {
		this.numberCumulativeCredit = numberCumulativeCredit;
	}
	
	
	public Double getLearningMark4() {
		return learningMark4;
	}
	public void setLearningMark4(Double learningMark4) {
		this.learningMark4 = learningMark4;
	}
	public Double getCumulativeMark4Semester() {
		return cumulativeMark4Semester;
	}
	public void setCumulativeMark4Semester(Double cumulativeMark4Semester) {
		this.cumulativeMark4Semester = cumulativeMark4Semester;
	}
	public Double getCumulativeMark42Semester() {
		return cumulativeMark42Semester;
	}
	public void setCumulativeMark42Semester(Double cumulativeMark42Semester) {
		this.cumulativeMark42Semester = cumulativeMark42Semester;
	}
	public Double getLearningMark42Semester() {
		return learningMark42Semester;
	}
	public void setLearningMark42Semester(Double learningMark42Semester) {
		this.learningMark42Semester = learningMark42Semester;
	}
	
	
	public Double getCumulativeMark4() {
		return cumulativeMark4;
	}
	public void setCumulativeMark4(Double cumulativeMark4) {
		this.cumulativeMark4 = cumulativeMark4;
	}
	public StudentSemesterSummaryDto() {
		
	}
	
	public StudentSemesterSummaryDto(StudentSemesterSummary entity) {
		if(entity!=null) {
			this.numberCumulativeCreditSemester = entity.getNumberCumulativeCreditSemester();
			this.numberCumulativeCredit = entity.getNumberCumulativeCredit();
			this.cumulativeMark = entity.getCumulativeMark();
			this.totalLearningCredit2Semester = entity.getTotalLearningCredit2Semester();
			this.totalLearningCreditSemester = entity.getTotalLearningCreditSemester();
			this.cumulativeMark2Semester = entity.getCumulativeMark2Semester();
			this.cumulativeMarkSemester = entity.getCumulativeMarkSemester();
			this.numberCumulativeCredit2Semester = entity.getNumberCumulativeCredit2Semester();
			this.cumulativeMark4Semester = entity.getCumulativeMark4Semester();
			this.cumulativeMark42Semester = entity.getCumulativeMark42Semester();
			this.learningMark4 = entity.getLearningMark4();
			this.learningMark42Semester = entity.getLearningMark42Semester();
			this.cumulativeMark4 = entity.getCumulativeMark4();
			this.numberCumulativeCredit = entity.getNumberCumulativeCredit();
			
			this.setId(entity.getId());
			if(entity.getSemester()!=null) {
				Semester semester = entity.getSemester();
				this.semester = new SemesterDto();
				this.semester.setDescription(semester.getDescription());
				this.semester.setId(semester.getId());
				this.semester.setStartDate(semester.getStartDate());
				this.semester.setEndDate(semester.getEndDate());
			}
			if(entity.getStudent()!=null) {
				this.student = new StudentDto(entity.getStudent());
			}			
		}
	}
}
