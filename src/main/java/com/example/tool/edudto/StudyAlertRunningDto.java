package com.example.tool.edudto;

import java.util.Date;

import com.globits.core.dto.BaseObjectDto;
import com.globits.education.domain.StudyAlertRunning;
import com.globits.education.dto.CourseYearDto;
import com.globits.education.dto.StudyAlertConditionDto;

public class StudyAlertRunningDto extends BaseObjectDto{
	private StudyAlertConditionDto studyAlertCondition;
	private int runningNumber;//Lần chạy thứ bao nhiêu
	private Date startTime;
	private Date endTime;
	private Boolean isRunning;
	public StudyAlertConditionDto getStudyAlertCondition() {
		return studyAlertCondition;
	}
	public void setStudyAlertCondition(StudyAlertConditionDto studyAlertCondition) {
		this.studyAlertCondition = studyAlertCondition;
	}
	public int getRunningNumber() {
		return runningNumber;
	}
	public void setRunningNumber(int runningNumber) {
		this.runningNumber = runningNumber;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Boolean getIsRunning() {
		return isRunning;
	}
	public void setIsRunning(Boolean isRunning) {
		this.isRunning = isRunning;
	}
	
	public StudyAlertRunningDto() {
		
	}
	public StudyAlertRunningDto(StudyAlertRunning entity) {
		if(entity!=null) {
			this.createDate = entity.getCreateDate();
			this.createdBy = entity.getCreatedBy();
			this.endTime = entity.getEndTime();
			this.startTime = entity.getStartTime();
			this.id = entity.getId();
			this.isRunning = entity.getIsRunning();
			this.runningNumber = entity.getRunningNumber();
			if(entity.getStudyAlertCondition()!=null) {
				this.studyAlertCondition = new  StudyAlertConditionDto();
				this.studyAlertCondition.setId(entity.getStudyAlertCondition().getId());
				this.studyAlertCondition.setName(entity.getStudyAlertCondition().getName());
				this.studyAlertCondition.setCode(entity.getStudyAlertCondition().getCode());
				this.studyAlertCondition.setCourseYear(new CourseYearDto());
				this.studyAlertCondition.getCourseYear().setCode(entity.getStudyAlertCondition().getCourseYear().getCode());
				this.studyAlertCondition.getCourseYear().setName(entity.getStudyAlertCondition().getCourseYear().getName());
				this.studyAlertCondition.getCourseYear().setId(entity.getStudyAlertCondition().getCourseYear().getId());				
			}

		}
	}
}
