package com.example.tool.edudto;

import java.util.List;

import com.globits.education.dto.StudentSubjectMarkDto;
import com.globits.education.dto.SubjectDto;

public class ViewStudentSubjectMarkDto {
	private SubjectDto subject;
	private List<StudentSubjectMarkDto> marks;
	
	private List<String> finalMark;
	private List<String> finalMark4;//Điểm hệ 4
	private List<String> finalMarkChar;//Điểm chữ
	private List<String> examMark;
	private List<String> learningMark;
	
	public SubjectDto getSubject() {
		return subject;
	}
	public void setSubject(SubjectDto subject) {
		this.subject = subject;
	}
	public List<StudentSubjectMarkDto> getMarks() {
		return marks;
	}
	public void setMarks(List<StudentSubjectMarkDto> marks) {
		this.marks = marks;
	}
	
	public List<String> getFinalMark() {
		return finalMark;
	}
	public void setFinalMark(List<String> finalMark) {
		this.finalMark = finalMark;
	}
	public List<String> getExamMark() {
		return examMark;
	}
	public void setExamMark(List<String> examMark) {
		this.examMark = examMark;
	}
	public List<String> getLearningMark() {
		return learningMark;
	}
	public void setLearningMark(List<String> learningMark) {
		this.learningMark = learningMark;
	}
	public List<String> getFinalMark4() {
		return finalMark4;
	}
	public void setFinalMark4(List<String> finalMark4) {
		this.finalMark4 = finalMark4;
	}
	public List<String> getFinalMarkChar() {
		return finalMarkChar;
	}
	public void setFinalMarkChar(List<String> finalMarkChar) {
		this.finalMarkChar = finalMarkChar;
	}
	
	
}
