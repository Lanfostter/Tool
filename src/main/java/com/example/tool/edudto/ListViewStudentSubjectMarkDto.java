package com.example.tool.edudto;

import java.util.List;

import com.globits.core.utils.NumberUtils;
import com.globits.education.dto.StudentDto;
import com.globits.education.dto.ViewStudentSubjectMarkDto;

public class ListViewStudentSubjectMarkDto {
	private StudentDto student;
	private int numberCredit;//Số tín chỉ đăng ký

	private int numberCumulativeCredits;//Số tín chỉ tích lũy
	private int numberCumulativeCreditOfSpeciality;//Số tín chỉ tích lũy ngành
	private int averagePointSpeciality;//Điểm trung bình tích lũy ngành
	private int averagePointSpeciality4;//Điểm trung bình tích lũy ngành hệ 4
	private int numberOfcreditPoints;//Số tín chỉ tính điểm
	private int numberSubjectNotAchieved;//số môn không đạt
	private int numberOfcreditNotAchieved;//số tín chỉ không đạt
	private Double learningMark4;//Điểm chung bình chung hệ 4 ngành 1 
	private Double mark4;//Điểm thang 4 tích lũy ngành 1
	private Double learningMark;//Điểm chung bình chung hệ 10 ngành 1 
	private Double mark;//Điểm thang 10 tích lũy ngành 1
	
	private List<ViewStudentSubjectMarkDto> ListMarks;
	
	
	public int getNumberCredit() {
		return numberCredit;
	}
	public void setNumberCredit(int numberCredit) {
		this.numberCredit = numberCredit;
	}
	public int getNumberCumulativeCredits() {
		return numberCumulativeCredits;
	}
	public void setNumberCumulativeCredits(int numberCumulativeCredits) {
		this.numberCumulativeCredits = numberCumulativeCredits;
	}
	public int getNumberCumulativeCreditOfSpeciality() {
		return numberCumulativeCreditOfSpeciality;
	}
	public void setNumberCumulativeCreditOfSpeciality(int numberCumulativeCreditOfSpeciality) {
		this.numberCumulativeCreditOfSpeciality = numberCumulativeCreditOfSpeciality;
	}
	public int getAveragePointSpeciality() {
		return averagePointSpeciality;
	}
	public void setAveragePointSpeciality(int averagePointSpeciality) {
		this.averagePointSpeciality = averagePointSpeciality;
	}
	public int getAveragePointSpeciality4() {
		return averagePointSpeciality4;
	}
	public void setAveragePointSpeciality4(int averagePointSpeciality4) {
		this.averagePointSpeciality4 = averagePointSpeciality4;
	}
	public int getNumberOfcreditPoints() {
		return numberOfcreditPoints;
	}
	public void setNumberOfcreditPoints(int numberOfcreditPoints) {
		this.numberOfcreditPoints = numberOfcreditPoints;
	}
	public StudentDto getStudent() {
		return student;
	}
	public void setStudent(StudentDto student) {
		this.student = student;
	}
	public List<ViewStudentSubjectMarkDto> getListMarks() {
		return ListMarks;
	}
	public void setListMarks(List<ViewStudentSubjectMarkDto> listMarks) {
		ListMarks = listMarks;
	}
	public int getNumberSubjectNotAchieved() {
		return numberSubjectNotAchieved;
	}
	public void setNumberSubjectNotAchieved(int numberSubjectNotAchieved) {
		this.numberSubjectNotAchieved = numberSubjectNotAchieved;
	}
	public int getNumberOfcreditNotAchieved() {
		return numberOfcreditNotAchieved;
	}
	public void setNumberOfcreditNotAchieved(int numberOfcreditNotAchieved) {
		this.numberOfcreditNotAchieved = numberOfcreditNotAchieved;
	}
	public Double getLearningMark4() {
		return NumberUtils.round(learningMark4,2);
//		return learningMark4;
	}
	public void setLearningMark4(Double learningMark4) {
		this.learningMark4 = learningMark4;
	}
	public Double getMark4() {
		return NumberUtils.round(mark4,2);
//		return mark4;
	}
	public void setMark4(Double mark4) {
		this.mark4 = mark4;
	}
	public Double getLearningMark() {
		return NumberUtils.round(learningMark,2);
//		return learningMark;
	}
	public void setLearningMark(Double learningMark) {
		this.learningMark = learningMark;
	}
	public Double getMark() {
		return NumberUtils.round(mark,2);
//		return mark;
	}
	public void setMark(Double mark) {
		this.mark = mark;
	}	
}
