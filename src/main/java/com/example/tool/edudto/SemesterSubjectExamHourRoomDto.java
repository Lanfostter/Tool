package com.example.tool.edudto;

import com.globits.core.dto.BaseObjectDto;
import com.globits.core.dto.RoomDto;
import com.globits.education.dto.SemesterSubjectExamHourDto;

public class SemesterSubjectExamHourRoomDto  extends BaseObjectDto {
	
	private RoomDto room;
	private SemesterSubjectExamHourDto examHour;
	public RoomDto getRoom() {
		return room;
	}
	public void setRoom(RoomDto room) {
		this.room = room;
	}
	public SemesterSubjectExamHourDto getExamHour() {
		return examHour;
	}
	public void setExamHour(SemesterSubjectExamHourDto examHour) {
		this.examHour = examHour;
	}
	
}
