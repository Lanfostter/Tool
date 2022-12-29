package com.example.tool.edudto;

import java.util.ArrayList;
import java.util.List;

import com.globits.education.domain.SyncLogViewMongo;

public class SyncLogViewMongoDto {
	private List<String> listSuccess;
	private Long semesterId;
	private Long periodId;
	private Long schoolYear;
	private Long schoolBase;
	private Long courseYear;
	private Long department;
	private Long speciality;
	private Long enrollmentClass;
	private Integer typeOfData;
	private String threadId;
	private int numberOfSucces;
	private int numberOfSyncData;
	private List<String> listError;
	private Boolean isRunning;
	public SyncLogViewMongoDto(List<String> listSuccess, Long semesterId, Long periodId, Long schoolYear,
			Long schoolBase, Long courseYear, Long department, Long speciality, Long enrollmentClass,
			Integer typeOfData, String threadId, int numberOfSucces, int numberOfSyncData, List<String> listError,
			Boolean isRunning) {
		super();
		this.listSuccess = listSuccess;
		this.semesterId = semesterId;
		this.periodId = periodId;
		this.schoolYear = schoolYear;
		this.schoolBase = schoolBase;
		this.courseYear = courseYear;
		this.department = department;
		this.speciality = speciality;
		this.enrollmentClass = enrollmentClass;
		this.typeOfData = typeOfData;
		this.threadId = threadId;
		this.numberOfSucces = numberOfSucces;
		this.numberOfSyncData = numberOfSyncData;
		this.listError = listError;
		this.isRunning = isRunning;
	}
	
	public SyncLogViewMongoDto(SyncLogViewMongo entity) {
		this.semesterId = entity.getSemesterId();
		this.periodId = entity.getPeriodId();
		this.schoolYear = entity.getSchoolYear();
		this.schoolBase = entity.getSchoolBase();
		this.courseYear = entity.getCourseYear();
		this.department = entity.getDepartment();
		this.speciality = entity.getSpeciality();
		this.enrollmentClass = entity.getEnrollmentClass();
		this.typeOfData = entity.getTypeOfData();
		this.threadId = entity.getThreadId();
		this.numberOfSucces = entity.getNumberOfSucces();
		this.numberOfSyncData = entity.getNumberOfSyncData();
		this.isRunning = entity.getIsRunning();
		this.setListSuccess(new ArrayList<>());
		this.setListError(new ArrayList<>());
		this.getListSuccess().addAll(entity.getListSuccess());
		this.getListError().addAll(entity.getListError());
	}

	public List<String> getListSuccess() {
		return listSuccess;
	}
	public void setListSuccess(List<String> listSuccess) {
		this.listSuccess = listSuccess;
	}
	public Long getSemesterId() {
		return semesterId;
	}
	public void setSemesterId(Long semesterId) {
		this.semesterId = semesterId;
	}
	public Long getPeriodId() {
		return periodId;
	}
	public void setPeriodId(Long periodId) {
		this.periodId = periodId;
	}
	public Long getSchoolYear() {
		return schoolYear;
	}
	public void setSchoolYear(Long schoolYear) {
		this.schoolYear = schoolYear;
	}
	public Long getSchoolBase() {
		return schoolBase;
	}
	public void setSchoolBase(Long schoolBase) {
		this.schoolBase = schoolBase;
	}
	public Long getCourseYear() {
		return courseYear;
	}
	public void setCourseYear(Long courseYear) {
		this.courseYear = courseYear;
	}
	public Long getDepartment() {
		return department;
	}
	public void setDepartment(Long department) {
		this.department = department;
	}
	public Long getSpeciality() {
		return speciality;
	}
	public void setSpeciality(Long speciality) {
		this.speciality = speciality;
	}
	public Long getEnrollmentClass() {
		return enrollmentClass;
	}
	public void setEnrollmentClass(Long enrollmentClass) {
		this.enrollmentClass = enrollmentClass;
	}
	public Integer getTypeOfData() {
		return typeOfData;
	}
	public void setTypeOfData(Integer typeOfData) {
		this.typeOfData = typeOfData;
	}
	public String getThreadId() {
		return threadId;
	}
	public void setThreadId(String threadId) {
		this.threadId = threadId;
	}
	public int getNumberOfSucces() {
		return numberOfSucces;
	}
	public void setNumberOfSucces(int numberOfSucces) {
		this.numberOfSucces = numberOfSucces;
	}
	public int getNumberOfSyncData() {
		return numberOfSyncData;
	}
	public void setNumberOfSyncData(int numberOfSyncData) {
		this.numberOfSyncData = numberOfSyncData;
	}
	public List<String> getListError() {
		return listError;
	}
	public void setListError(List<String> listError) {
		this.listError = listError;
	}
	public Boolean getIsRunning() {
		return isRunning;
	}
	public void setIsRunning(Boolean isRunning) {
		this.isRunning = isRunning;
	}
	
}
