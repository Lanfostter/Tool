package com.example.tool.edudto;

import java.util.List;

import com.globits.education.dto.StudentSubjectMarkDto;
import com.globits.education.dto.SubjectExamTypeDto;

public class StudentSubjectMarkListDto {
	private List<StudentSubjectMarkDto> marks;
	private String studentCode;
	private String studentName;
	private Integer studyTime;
	private Integer examRound;
	private String formulaMark;//công thức tính điểm
	private List<SubjectExamTypeDto> listExamType;
	private String note;//ghi chú
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

	public List<StudentSubjectMarkDto> getMarks() {
		return marks;
	}

	public void setMarks(List<StudentSubjectMarkDto> marks) {
		this.marks = marks;
	}

	public Integer getStudyTime() {
		return studyTime;
	}

	public void setStudyTime(Integer studyTime) {
		this.studyTime = studyTime;
	}

	public Integer getExamRound() {
		return examRound;
	}

	public void setExamRound(Integer examRound) {
		this.examRound = examRound;
	}

	public String getFormulaMark() {
		return formulaMark;
	}

	public void setFormulaMark(String formulaMark) {
		this.formulaMark = formulaMark;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public List<SubjectExamTypeDto> getListExamType() {
		return listExamType;
	}

	public void setListExamType(List<SubjectExamTypeDto> listExamType) {
		this.listExamType = listExamType;
	}
}
