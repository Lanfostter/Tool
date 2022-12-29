package com.example.tool.edudto;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;


public class CourseRegisterViewDto implements Serializable {
	private boolean isAllowRegister; 
	private Boolean isAllowUnRegister;//Cho phép hủy học phần đăng ký học
	//@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private Date startDate;
	private Date endDate;
	
	private String startDateString;
	private String endDateString;
	
	private Date startUnDate;
	private Date endUnDate;
	
	private String startUnDateString;
	private String endUnDateString;
	
	private List<SubjectRegistrationDto> listSubjectRegistrationDtos;
	private Boolean isDuplicated;
	
	private List<CourseSubjectDto> listOldCs;

	public boolean isAllowRegister() {
		return isAllowRegister;
	}

	public void setAllowRegister(boolean isAllowRegister) {
		this.isAllowRegister = isAllowRegister;
	}

	public Boolean getIsAllowUnRegister() {
		return isAllowUnRegister;
	}

	public void setIsAllowUnRegister(Boolean isAllowUnRegister) {
		this.isAllowUnRegister = isAllowUnRegister;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getStartDateString() {
		return startDateString;
	}

	public void setStartDateString(String startDateString) {
		this.startDateString = startDateString;
	}

	public String getEndDateString() {
		return endDateString;
	}

	public void setEndDateString(String endDateString) {
		this.endDateString = endDateString;
	}

	public Date getStartUnDate() {
		return startUnDate;
	}

	public void setStartUnDate(Date startUnDate) {
		this.startUnDate = startUnDate;
	}

	public Date getEndUnDate() {
		return endUnDate;
	}

	public void setEndUnDate(Date endUnDate) {
		this.endUnDate = endUnDate;
	}

	public String getStartUnDateString() {
		return startUnDateString;
	}

	public void setStartUnDateString(String startUnDateString) {
		this.startUnDateString = startUnDateString;
	}

	public String getEndUnDateString() {
		return endUnDateString;
	}

	public void setEndUnDateString(String endUnDateString) {
		this.endUnDateString = endUnDateString;
	}

	public List<SubjectRegistrationDto> getListSubjectRegistrationDtos() {
		return listSubjectRegistrationDtos;
	}

	public void setListSubjectRegistrationDtos(List<SubjectRegistrationDto> listSubjectRegistrationDtos) {
		this.listSubjectRegistrationDtos = listSubjectRegistrationDtos;
	}

	public Boolean getIsDuplicated() {
		return isDuplicated;
	}

	public void setIsDuplicated(Boolean isDuplicated) {
		this.isDuplicated = isDuplicated;
	}

	public List<CourseSubjectDto> getListOldCs() {
		return listOldCs;
	}

	public void setListOldCs(List<CourseSubjectDto> listOldCs) {
		this.listOldCs = listOldCs;
	}
	
	
}
