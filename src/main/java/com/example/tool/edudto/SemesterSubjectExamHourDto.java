package com.example.tool.edudto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import com.globits.core.dto.BaseObjectDto;
import com.globits.core.dto.RoomDto;
import com.globits.education.domain.SemesterSubjectExamDate;
import com.globits.education.domain.SemesterSubjectExamHour;
import com.globits.education.domain.SemesterSubjectExamHourRoom;
import com.globits.education.domain.SemesterSubjectExamRoom;
import com.globits.education.domain.StudentSemesterSubjectExamRoom;
import com.globits.education.dto.ExamHourDto;
import com.globits.education.dto.SemesterSubjectExamDateDto;
import com.globits.education.dto.SemesterSubjectExamHourDto;
import com.globits.education.dto.SemesterSubjectExamRoomDto;
import com.globits.education.dto.StudentSemesterSubjectExamRoomDto;

public class SemesterSubjectExamHourDto extends BaseObjectDto {
	private SemesterSubjectExamDateDto examDate;
	
	private ExamHourDto examHour;
	
	private Set<SemesterSubjectExamRoomDto> examRooms;//phòng thi dự kiến

	public SemesterSubjectExamDateDto getExamDate() {
		return examDate;
	}

	public void setExamDate(SemesterSubjectExamDateDto examDate) {
		this.examDate = examDate;
	}

	public void setExamHour(ExamHourDto examHour) {
		this.examHour = examHour;
	}

	public ExamHourDto getExamHour() {
		return examHour;
	}

	public Set<SemesterSubjectExamRoomDto> getExamRooms() {
		return examRooms;
	}

	public void setExamRooms(Set<SemesterSubjectExamRoomDto> examRooms) {
		this.examRooms = examRooms;
	}
	public SemesterSubjectExamHourDto() {
		super();
	}

	public SemesterSubjectExamHourDto(SemesterSubjectExamHour entity) {
		this.id = entity.getId();
		if(entity.getExamDate() != null) {
			SemesterSubjectExamDateDto semesterSubjectExamDate = new SemesterSubjectExamDateDto();
			semesterSubjectExamDate.setId(entity.getExamDate().getId());			
			this.examDate = semesterSubjectExamDate;
		}
		if(entity.getExamHour() != null && entity.getExamHour().getId()!=null) {
			ExamHourDto dto=new ExamHourDto(entity.getExamHour());
			this.examHour = dto;
		}
		if(entity.getExamRooms() != null && entity.getExamRooms().size()>0) {
			Set<SemesterSubjectExamRoomDto> examRooms = new HashSet<SemesterSubjectExamRoomDto>();
			for (SemesterSubjectExamRoom semesterSubjectExamRoom : entity.getExamRooms()) {
				SemesterSubjectExamRoomDto examRoomDto=new SemesterSubjectExamRoomDto();
				examRoomDto.setId(semesterSubjectExamRoom.getId());
				examRoomDto.setRoom(new RoomDto(semesterSubjectExamRoom.getRoom()));
				examRoomDto.setNumberExpectedStudent(semesterSubjectExamRoom.getNumberExpectedStudent());
				examRoomDto.setRoomCode(semesterSubjectExamRoom.getRoomCode());
				ExamHourDto examHourDto=null;
				if(semesterSubjectExamRoom.getExamHour()!=null) {
					examHourDto=new ExamHourDto();
					examHourDto.setCode(semesterSubjectExamRoom.getExamHour().getCode());
					examHourDto.setName(semesterSubjectExamRoom.getExamHour().getName());
					examHourDto.setId(semesterSubjectExamRoom.getExamHour().getId());
					examRoomDto.setExamHour(examHourDto);
				}
				if(semesterSubjectExamRoom.getSubjectExamHour()!=null) {
					SemesterSubjectExamHourDto subjectExamHourDto=new SemesterSubjectExamHourDto();
					subjectExamHourDto.setId(semesterSubjectExamRoom.getSubjectExamHour().getId());
					subjectExamHourDto.setExamHour(examHourDto);
					examRoomDto.setSubjectExamHour(subjectExamHourDto);
				}
				examRooms.add(examRoomDto);
			}

			this.examRooms = examRooms;
		}
		
		
	}
	
	public SemesterSubjectExamHourDto(SemesterSubjectExamHour entity, Boolean isGetStudentInRoom) {
		this.id = entity.getId();
		if(entity.getExamDate() != null) {
			SemesterSubjectExamDateDto semesterSubjectExamDate = new SemesterSubjectExamDateDto();
			semesterSubjectExamDate.setId(entity.getExamDate().getId());			
			this.examDate = semesterSubjectExamDate;
		}
		if(entity.getExamHour() != null && entity.getExamHour().getId()!=null) {
			ExamHourDto dto=new ExamHourDto(entity.getExamHour());
			this.examHour = dto;
		}
		if(entity.getExamRooms() != null && entity.getExamRooms().size()>0) {
			Set<SemesterSubjectExamRoomDto> examRooms = new HashSet<SemesterSubjectExamRoomDto>();
			for (SemesterSubjectExamRoom semesterSubjectExamRoom : entity.getExamRooms()) {
				SemesterSubjectExamRoomDto examRoomDto=new SemesterSubjectExamRoomDto();
				examRoomDto.setId(semesterSubjectExamRoom.getId());
				examRoomDto.setRoom(new RoomDto(semesterSubjectExamRoom.getRoom()));
				examRoomDto.setNumberExpectedStudent(semesterSubjectExamRoom.getNumberExpectedStudent());
				examRoomDto.setRoomCode(semesterSubjectExamRoom.getRoomCode());
				ExamHourDto examHourDto=null;
				if(semesterSubjectExamRoom.getExamHour()!=null) {
					examHourDto=new ExamHourDto();
					examHourDto.setCode(semesterSubjectExamRoom.getExamHour().getCode());
					examHourDto.setName(semesterSubjectExamRoom.getExamHour().getName());
					examHourDto.setId(semesterSubjectExamRoom.getExamHour().getId());
					examRoomDto.setExamHour(examHourDto);
				}
				if(semesterSubjectExamRoom.getSubjectExamHour()!=null) {
					SemesterSubjectExamHourDto subjectExamHourDto=new SemesterSubjectExamHourDto();
					subjectExamHourDto.setId(semesterSubjectExamRoom.getSubjectExamHour().getId());
					subjectExamHourDto.setExamHour(examHourDto);
					examRoomDto.setSubjectExamHour(subjectExamHourDto);
				}
				if(isGetStudentInRoom) {
					examRoomDto.setStudentList(new ArrayList<StudentSemesterSubjectExamRoomDto>());
					for(StudentSemesterSubjectExamRoom ssser:semesterSubjectExamRoom.getStudentList()) {
						StudentSemesterSubjectExamRoomDto ssserDto = new StudentSemesterSubjectExamRoomDto(ssser);
						examRoomDto.getStudentList().add(ssserDto);
					}
				}
				examRooms.add(examRoomDto);
			}

			this.examRooms = examRooms;
		}
		
		
	}
}
