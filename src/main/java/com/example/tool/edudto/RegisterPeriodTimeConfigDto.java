package com.example.tool.edudto;

import java.util.Date;

import javax.persistence.Column;

import com.globits.core.dto.BaseObjectDto;
import com.globits.education.domain.RegisterPeriodTimeConfig;
import com.globits.education.dto.EnrollmentClassDto;
import com.globits.education.dto.SemesterRegisterPeriodDto;

public class RegisterPeriodTimeConfigDto extends BaseObjectDto {
	private SemesterRegisterPeriodDto semesterRegisterPeriod;
	private EnrollmentClassDto enrollmentClass;
	private Boolean isGrant;
	private Date startRegisterDate;
	private Date endRegisterDate;
	private Date startUnRegisterTime; //ngày bắt đầu hủy đăng ký học
	private Date endUnRegisterTime; //ngày kết thúc hủy đăng ký học
	
	public SemesterRegisterPeriodDto getSemesterRegisterPeriod() {
		return semesterRegisterPeriod;
	}
	public void setSemesterRegisterPeriod(SemesterRegisterPeriodDto semesterRegisterPeriod) {
		this.semesterRegisterPeriod = semesterRegisterPeriod;
	}
	public EnrollmentClassDto getEnrollmentClass() {
		return enrollmentClass;
	}
	public void setEnrollmentClass(EnrollmentClassDto enrollmentClass) {
		this.enrollmentClass = enrollmentClass;
	}
	public Boolean getIsGrant() {
		return isGrant;
	}
	public void setIsGrant(Boolean isGrant) {
		this.isGrant = isGrant;
	}
	public Date getStartRegisterDate() {
		return startRegisterDate;
	}
	public void setStartRegisterDate(Date startRegisterDate) {
		this.startRegisterDate = startRegisterDate;
	}
	public Date getEndRegisterDate() {
		return endRegisterDate;
	}
	public void setEndRegisterDate(Date endRegisterDate) {
		this.endRegisterDate = endRegisterDate;
	}	
	public Date getStartUnRegisterTime() {
		return startUnRegisterTime;
	}
	public void setStartUnRegisterTime(Date startUnRegisterTime) {
		this.startUnRegisterTime = startUnRegisterTime;
	}
	public Date getEndUnRegisterTime() {
		return endUnRegisterTime;
	}
	public void setEndUnRegisterTime(Date endUnRegisterTime) {
		this.endUnRegisterTime = endUnRegisterTime;
	}
	public RegisterPeriodTimeConfigDto() {
		isGrant = false;
	}
	
	public RegisterPeriodTimeConfigDto(RegisterPeriodTimeConfig entity) {
		if(entity!=null) {
			this.isGrant = entity.getIsGrant();
			this.startRegisterDate = entity.getStartRegisterDate();
			this.endRegisterDate = entity.getEndRegisterDate();
			this.startUnRegisterTime=entity.getStartUnRegisterTime();
			this.endUnRegisterTime=entity.getEndUnRegisterTime();
			if(entity.getRegisterPeriod()!=null) {
				semesterRegisterPeriod = new SemesterRegisterPeriodDto();
				semesterRegisterPeriod.setId(entity.getRegisterPeriod().getId());
				semesterRegisterPeriod.setName(entity.getRegisterPeriod().getName());
			}
			if(entity.getEnrollmentClass()!=null) {
				this.enrollmentClass = new EnrollmentClassDto();
				this.enrollmentClass.setId(entity.getEnrollmentClass().getId());
				this.enrollmentClass.setClassCode(entity.getEnrollmentClass().getClassCode());
			}			
		}
	}
}
