package com.example.tool.edudto;

import java.util.List;

import com.globits.education.domain.StudentSemesterSubjectExamRoom;

public class RoomExamCodeInBagDto {
	private String roomCode;
	private Integer startExamcode;
	private Integer endExamcode;
	private Integer index;
	private List<StudentSemesterSubjectExamRoom> listStudent;
	private Integer startMarkingcode;
	private Integer endMarkingcode;
	public String getRoomCode() {
		return roomCode;
	}
	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}
	public Integer getStartExamcode() {
		return startExamcode;
	}
	public void setStartExamcode(Integer startExamcode) {
		this.startExamcode = startExamcode;
	}
	public Integer getEndExamcode() {
		return endExamcode;
	}
	public void setEndExamcode(Integer endExamcode) {
		this.endExamcode = endExamcode;
	}
	public List<StudentSemesterSubjectExamRoom> getListStudent() {
		return listStudent;
	}
	public void setListStudent(List<StudentSemesterSubjectExamRoom> listStudent) {
		this.listStudent = listStudent;
	}
	public Integer getIndex() {
		return index;
	}
	public void setIndex(Integer index) {
		this.index = index;
	}
	public Integer getStartMarkingcode() {
		return startMarkingcode;
	}
	public void setStartMarkingcode(Integer startMarkingcode) {
		this.startMarkingcode = startMarkingcode;
	}
	public Integer getEndMarkingcode() {
		return endMarkingcode;
	}
	public void setEndMarkingcode(Integer endMarkingcode) {
		this.endMarkingcode = endMarkingcode;
	}		
	
}
