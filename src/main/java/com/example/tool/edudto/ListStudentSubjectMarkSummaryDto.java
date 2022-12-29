package com.example.tool.edudto;

import java.util.Hashtable;
import java.util.List;

import com.globits.education.dto.CourseSubjectDto;
import com.globits.education.dto.CourseSubjectSubjectExamFormulaDto;
import com.globits.education.dto.ListStudentSubjectMarkDto;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.SemesterSubjectExamRoomDto;
import com.globits.education.dto.SubjectExamDto;

public class ListStudentSubjectMarkSummaryDto {
	
	private ListStudentSubjectMarkDto listStudentSubjectMark;	
	private CourseSubjectDto courseSubject;
	private SemesterDto semester;
	private List<SubjectExamDto> listExam;
	private SemesterSubjectExamRoomDto examRoom;
	private List<CourseSubjectSubjectExamFormulaDto> listCourseSubjectExam;
	
	public List<SubjectExamDto> getListExam() {
		return listExam;
	}
	public void setListExam(List<SubjectExamDto> listExam) {
		this.listExam = listExam;
	}
	
	public ListStudentSubjectMarkDto getListStudentSubjectMark() {
		return listStudentSubjectMark;
	}
	public void setListStudentSubjectMark(ListStudentSubjectMarkDto listStudentSubjectMark) {
		this.listStudentSubjectMark = listStudentSubjectMark;
	}
	public CourseSubjectDto getCourseSubject() {
		return courseSubject;
	}
	public void setCourseSubject(CourseSubjectDto courseSubject) {
		this.courseSubject = courseSubject;
	}
	public SemesterDto getSemester() {
		return semester;
	}
	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}
	public SemesterSubjectExamRoomDto getExamRoom() {
		return examRoom;
	}
	public void setExamRoom(SemesterSubjectExamRoomDto examRoom) {
		this.examRoom = examRoom;
	}
	public List<CourseSubjectSubjectExamFormulaDto> getListCourseSubjectExam() {
		return listCourseSubjectExam;
	}
	public void setListCourseSubjectExam(List<CourseSubjectSubjectExamFormulaDto> listCourseSubjectExam) {
		this.listCourseSubjectExam = listCourseSubjectExam;
	}
	
}
