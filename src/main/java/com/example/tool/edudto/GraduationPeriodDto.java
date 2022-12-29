package com.example.tool.edudto;

import java.util.Date;

import javax.jdo.annotations.Column;

import com.globits.education.domain.GraduationPeriod;

public class GraduationPeriodDto {
	
	private Long id;
	
	private String code;
	
	private String name;
	
	
	private Date graduatedDate;//Ngày xét tốt nghiệp

	private Integer status;//Trạng thái (0 = chưa có danh sách, 1 = đã trình phê duyệt, 2 = đã phê duyệt, 3= đã công bố, 4= đã phát bằng)
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getGraduatedDate() {
		return graduatedDate;
	}

	public void setGraduatedDate(Date graduatedDate) {
		this.graduatedDate = graduatedDate;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	public GraduationPeriodDto() {
		
	}
	public GraduationPeriodDto(GraduationPeriod gp) {
		if(gp!=null) {
			this.id = gp.getId();
			this.code = gp.getCode();
			this.name = gp.getName();
			this.graduatedDate = gp.getGraduatedDate();
			this.status = gp.getStatus();
		}
	}
	
}
