package com.example.tool.edudto;

public class ExportFeeDto {
	private String title;
	private Long semesterId;
	private Long semesterRegisterPeriodDtoId;
	private Integer type;
	private Integer status;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Long getSemesterId() {
		return semesterId;
	}
	public void setSemesterId(Long semesterId) {
		this.semesterId = semesterId;
	}
	public Long getSemesterRegisterPeriodDtoId() {
		return semesterRegisterPeriodDtoId;
	}
	public void setSemesterRegisterPeriodDtoId(Long semesterRegisterPeriodDtoId) {
		this.semesterRegisterPeriodDtoId = semesterRegisterPeriodDtoId;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}

}
