package com.example.tool.edudto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;

import com.globits.core.dto.BaseObjectDto;
import com.globits.education.domain.ExamRegisterPeriod;
import com.globits.education.domain.ExamRoomPeriod;
import com.globits.education.domain.SemesterRegisterPeriod;
import com.globits.education.domain.SemesterSubjectExam;
import com.globits.education.dto.ExamRoomPeriodDto;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.SemesterRegisterPeriodDto;
import com.globits.education.dto.SemesterSubjectExamDto;

public class ExamRegisterPeriodDto extends BaseObjectDto {

	private static final long serialVersionUID = 1L;
	private SemesterDto semester;

	private String name;
	private String code;
	private Date start; 
	private Date end;
	private Date fromDate;
	private Date toDate;
	private SemesterRegisterPeriodDto registerPeriod;
	private List<SemesterSubjectExamDto> semesterSubjectExams;
	private Set<ExamRoomPeriodDto> examRooms;
	private Boolean isPublished;// Được công bố lịch thi hay chưa
	
	
	public Set<ExamRoomPeriodDto> getExamRooms() {
		return examRooms;
	}
	public void setExamRooms(Set<ExamRoomPeriodDto> examRooms) {
		this.examRooms = examRooms;
	}
	public SemesterDto getSemester() {
		return semester;
	}
	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}	
		
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public SemesterRegisterPeriodDto getRegisterPeriod() {
		return registerPeriod;
	}
	public void setRegisterPeriod(SemesterRegisterPeriodDto registerPeriod) {
		this.registerPeriod = registerPeriod;
	}
	public List<SemesterSubjectExamDto> getSemesterSubjectExams() {
		return semesterSubjectExams;
	}
	public void setSemesterSubjectExam(List<SemesterSubjectExamDto> semesterSubjectExams) {
		this.semesterSubjectExams = semesterSubjectExams;
	}
	
	public Boolean getIsPublished() {
		return isPublished;
	}
	public void setIsPublished(Boolean isPublished) {
		this.isPublished = isPublished;
	}
	public ExamRegisterPeriodDto() {
		
	}
	
	public ExamRegisterPeriodDto(ExamRegisterPeriod entity) {
		if(entity!=null) {
			this.setId(entity.getId());
			this.code=entity.getCode();
			this.name = entity.getName();
			this.start=entity.getStart();
			this.end=entity.getEnd();
			this.fromDate=entity.getFromDate();
			this.toDate=entity.getToDate();
			this.isPublished=entity.getIsPublished();
			if(entity.getSemester()!=null) {
				this.semester = new SemesterDto();
				this.semester.setId(entity.getSemester().getId());	
				this.semester.setSemesterCode(entity.getSemester().getSemesterCode());
				this.semester.setSemesterName(entity.getSemester().getSemesterName());
				this.semester.setDescription(entity.getSemester().getDescription());
				this.semester.setStartDate(entity.getSemester().getStartDate());
				this.semester.setEndDate(entity.getSemester().getEndDate());
				this.semester.setStartRegisterDate(entity.getSemester().getStartRegisterDate());
				this.semester.setEndRegisterDate(entity.getSemester().getEndRegisterDate());
				if(entity.getSemester().getIsLockRegister()!=null) {
					this.semester.setIsLockRegister(entity.getSemester().getIsLockRegister());
				}
			}
			if (entity.getExamRooms() != null) {
				this.examRooms = new HashSet<ExamRoomPeriodDto>();
				for (ExamRoomPeriod examRoomPeriod : entity.getExamRooms()) {
					ExamRoomPeriodDto erpDto = new ExamRoomPeriodDto(examRoomPeriod);
					
					this.examRooms.add(erpDto);
				}
			}
			if(entity.getSemesterSubjectExams()!=null) {
				this.semesterSubjectExams = new ArrayList<SemesterSubjectExamDto>();
				for(SemesterSubjectExam sse : entity.getSemesterSubjectExams()) {
					/*SemesterSubjectExamDto ssxExamDto = new SemesterSubjectExamDto();
					if(sse.getSubject()!=null) {
						SubjectDto subject = new SubjectDto();
						subject.setId(sse.getSubject().getId());
						subject.setSubjectCode(sse.getSubject().getSubjectCode());
						subject.setSubjectName(sse.getSubject().getSubjectName());
						ssxExamDto.setSubject(subject);
						ssxExamDto.setSubjectName(sse.getSubject().getSubjectName());
					}
					if(sse.getExamType()!=null) {
						ssxExamDto.setExamType(new ExamTypeDto(sse.getExamType()));	
					}
					
					ssxExamDto.setId(sse.getId());
					ssxExamDto.setNumberEstimateStudent(sse.getNumberEstimateStudent());
					ssxExamDto.setNumberRoom(sse.getNumberRoom());
					ssxExamDto.setExamRound(sse.getExamRound());
					this.semesterSubjectExams.add(ssxExamDto);*/
					
					this.semesterSubjectExams.add(new SemesterSubjectExamDto(sse));
				}
			}
			if(entity.getRegisterPeriod()!=null) {
				this.registerPeriod=new SemesterRegisterPeriodDto();
				this.registerPeriod.setId(entity.getRegisterPeriod().getId());
				this.registerPeriod.setName(entity.getRegisterPeriod().getName());
				this.registerPeriod.setDisplayOrder(entity.getRegisterPeriod().getDisplayOrder());
				if(entity.getRegisterPeriod().getEndRegisterTime()!=null)
					this.registerPeriod.setEndRegisterTime(entity.getRegisterPeriod().getEndRegisterTime().toDate());
				if(entity.getRegisterPeriod().getEndUnRegisterTime()!=null)
					this.registerPeriod.setEndUnRegisterTime(entity.getRegisterPeriod().getEndUnRegisterTime().toDate());
				if(entity.getRegisterPeriod().getStartRegisterTime()!=null)
					this.registerPeriod.setStartRegisterTime(entity.getRegisterPeriod().getStartRegisterTime().toDate());
				this.registerPeriod.setIsLockRegister(entity.getRegisterPeriod().getIsLockRegister());
			}			
		}
	}
	public ExamRegisterPeriodDto(ExamRegisterPeriod entity, Boolean isGetFull) {
		if(entity!=null) {
			if(!isGetFull) {
				this.setId(entity.getId());
				this.code=entity.getCode();
				this.name = entity.getName();
				this.start=entity.getStart();
				this.end=entity.getEnd();
				this.fromDate=entity.getFromDate();
				this.toDate=entity.getToDate();
				this.isPublished=entity.getIsPublished();
				if (entity.getSemester() != null) {
					this.semester = new SemesterDto(entity.getSemester().getId(), entity.getSemester().getSemesterName(), entity.getSemester().getSemesterCode());
				}				
			}else {
				this.setId(entity.getId());
				this.code=entity.getCode();
				this.name = entity.getName();
				this.start=entity.getStart();
				this.end=entity.getEnd();
				this.fromDate=entity.getFromDate();
				this.toDate=entity.getToDate();
				if(entity.getSemester()!=null) {
					this.semester = new SemesterDto();
					this.semester.setId(entity.getSemester().getId());	
					this.semester.setSemesterCode(entity.getSemester().getSemesterCode());
					this.semester.setSemesterName(entity.getSemester().getSemesterName());
					this.semester.setDescription(entity.getSemester().getDescription());
					this.semester.setStartDate(entity.getSemester().getStartDate());
					this.semester.setEndDate(entity.getSemester().getEndDate());
					this.semester.setStartRegisterDate(entity.getSemester().getStartRegisterDate());
					this.semester.setEndRegisterDate(entity.getSemester().getEndRegisterDate());
					if(entity.getSemester().getIsLockRegister()!=null) {
						this.semester.setIsLockRegister(entity.getSemester().getIsLockRegister());
					}
				}
				if (entity.getExamRooms() != null) {
					this.examRooms = new HashSet<ExamRoomPeriodDto>();
					for (ExamRoomPeriod examRoomPeriod : entity.getExamRooms()) {
						ExamRoomPeriodDto erpDto = new ExamRoomPeriodDto(examRoomPeriod);
						
						this.examRooms.add(erpDto);
					}
				}
				if(entity.getSemesterSubjectExams()!=null) {
					this.semesterSubjectExams = new ArrayList<SemesterSubjectExamDto>();
					for(SemesterSubjectExam sse : entity.getSemesterSubjectExams()) {
						/*SemesterSubjectExamDto ssxExamDto = new SemesterSubjectExamDto();
						if(sse.getSubject()!=null) {
							SubjectDto subject = new SubjectDto();
							subject.setId(sse.getSubject().getId());
							subject.setSubjectCode(sse.getSubject().getSubjectCode());
							subject.setSubjectName(sse.getSubject().getSubjectName());
							ssxExamDto.setSubject(subject);
							ssxExamDto.setSubjectName(sse.getSubject().getSubjectName());
						}
						if(sse.getExamType()!=null) {
							ssxExamDto.setExamType(new ExamTypeDto(sse.getExamType()));	
						}
						
						ssxExamDto.setId(sse.getId());
						ssxExamDto.setNumberEstimateStudent(sse.getNumberEstimateStudent());
						ssxExamDto.setNumberRoom(sse.getNumberRoom());
						ssxExamDto.setExamRound(sse.getExamRound());
						this.semesterSubjectExams.add(ssxExamDto);*/
						
						this.semesterSubjectExams.add(new SemesterSubjectExamDto(sse,isGetFull));
					}
				}
				if(entity.getRegisterPeriod()!=null) {
					this.registerPeriod=new SemesterRegisterPeriodDto();
					this.registerPeriod.setId(entity.getRegisterPeriod().getId());
					this.registerPeriod.setName(entity.getRegisterPeriod().getName());
					this.registerPeriod.setDisplayOrder(entity.getRegisterPeriod().getDisplayOrder());
					if(entity.getRegisterPeriod().getEndRegisterTime()!=null)
						this.registerPeriod.setEndRegisterTime(entity.getRegisterPeriod().getEndRegisterTime().toDate());
					if(entity.getRegisterPeriod().getEndUnRegisterTime()!=null)
						this.registerPeriod.setEndUnRegisterTime(entity.getRegisterPeriod().getEndUnRegisterTime().toDate());
					if(entity.getRegisterPeriod().getStartRegisterTime()!=null)
						this.registerPeriod.setStartRegisterTime(entity.getRegisterPeriod().getStartRegisterTime().toDate());
					this.registerPeriod.setIsLockRegister(entity.getRegisterPeriod().getIsLockRegister());
				}				
			}
		}
	}
}
