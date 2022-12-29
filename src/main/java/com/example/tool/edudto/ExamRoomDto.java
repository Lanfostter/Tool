package com.example.tool.edudto;

import java.io.Serializable;

import com.globits.core.dto.RoomDto;
import com.globits.education.domain.SemesterSubjectExamRoom;
import com.globits.education.dto.SemesterSubjectExamDto;

public class ExamRoomDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long Id;
	private Integer numberExpectedStudent;// So luong sinh vien du kien
	private Integer numberStudent;// So luong sinh vien thuc te du thi
	private SemesterSubjectExamDto semesterSubjectExam;
	private RoomDto room;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Integer getNumberExpectedStudent() {
		return numberExpectedStudent;
	}

	public void setNumberExpectedStudent(Integer numberExpectedStudent) {
		this.numberExpectedStudent = numberExpectedStudent;
	}

	public Integer getNumberStudent() {
		return numberStudent;
	}

	public void setNumberStudent(Integer numberStudent) {
		this.numberStudent = numberStudent;
	}

	public SemesterSubjectExamDto getSemesterSubjectExam() {
		return semesterSubjectExam;
	}

	public void setSemesterSubjectExam(SemesterSubjectExamDto semesterSubjectExam) {
		this.semesterSubjectExam = semesterSubjectExam;
	}

	public RoomDto getRoom() {
		return room;
	}

	public void setRoom(RoomDto room) {
		this.room = room;
	}

	public ExamRoomDto() {

	}

	public ExamRoomDto(SemesterSubjectExamRoom sr) {
		this.Id = sr.getId();
		this.numberExpectedStudent = sr.getNumberExpectedStudent();
		this.numberStudent = sr.getNumberStudent();
		if (sr.getRoom() != null) {
			this.room = new RoomDto(sr.getRoom());
		}
		if (sr.getSemesterSubjectExam() != null) {
			this.semesterSubjectExam = new SemesterSubjectExamDto(sr.getSemesterSubjectExam());
		}
	}

}
