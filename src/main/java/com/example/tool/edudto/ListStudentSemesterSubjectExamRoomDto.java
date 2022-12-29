package com.example.tool.edudto;

import java.util.Hashtable;
import java.util.List;

import com.globits.education.domain.StudentSemesterSubjectExamRoom;
import com.globits.education.dto.SemesterSubjectExamRoomDto;

public class ListStudentSemesterSubjectExamRoomDto {
	private SemesterSubjectExamRoomDto examRoom;
	private List<StudentSemesterSubjectExamRoom> listStudentExamRoom;
	public SemesterSubjectExamRoomDto getExamRoom() {
		return examRoom;
	}
	public void setExamRoom(SemesterSubjectExamRoomDto examRoom) {
		this.examRoom = examRoom;
	}
	public List<StudentSemesterSubjectExamRoom> getListStudentExamRoom() {
		return listStudentExamRoom;
	}
	public void setListStudentExamRoom(List<StudentSemesterSubjectExamRoom> listStudentExamRoom) {
		this.listStudentExamRoom = listStudentExamRoom;
	}	
	
	
}
