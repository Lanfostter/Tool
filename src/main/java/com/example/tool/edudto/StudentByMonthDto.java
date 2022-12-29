package com.example.tool.edudto;


import java.util.Date;

import org.joda.time.LocalDateTime;

import com.globits.education.domain.Student;
import com.globits.education.domain.StudentStatusStudentSemester;

public class StudentByMonthDto {

	private Long enc_id;
	private Long class_id;
	private Long scp_studentid;
	private String gender;
	private Long status;
	private String enc_className;
	private String special_Name;
	private String department_Name;
	private int enc_schoolYear;
	private Date start_Date;
	private LocalDateTime modify_Date;
	
	public Long getScp_studentid() {
		return scp_studentid;
	}
	public void setScp_studentid(Long scp_studentid) {
		this.scp_studentid = scp_studentid;
	}
	
	public Date getStart_Date() {
		return start_Date;
	}
	public void setStart_Date(Date start_Date) {
		this.start_Date = start_Date;
	}
	public LocalDateTime getModify_Date() {
		return modify_Date;
	}
	public void setModify_Date(LocalDateTime modify_Date) {
		this.modify_Date = modify_Date;
	}
	public Long getEnc_id() {
		return enc_id;
	}
	public void setEnc_id(Long enc_id) {
		this.enc_id = enc_id;
	}
	public Long getClass_id() {
		return class_id;
	}
	public void setClass_id(Long class_id) {
		this.class_id = class_id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getStatus() {
		return status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}
	public String getEnc_className() {
		return enc_className;
	}
	public void setEnc_className(String enc_className) {
		this.enc_className = enc_className;
	}
	public String getSpecial_Name() {
		return special_Name;
	}
	public void setSpecial_Name(String special_Name) {
		this.special_Name = special_Name;
	}
	public String getDepartment_Name() {
		return department_Name;
	}
	public void setDepartment_Name(String department_Name) {
		this.department_Name = department_Name;
	}
	public int getEnc_schoolYear() {
		return enc_schoolYear;
	}
	public void setEnc_schoolYear(int enc_schoolYear) {
		this.enc_schoolYear = enc_schoolYear;
	}
	
	public StudentByMonthDto(Long enc_id, Long class_id,Long scp_studentid, String gender, Long status, String enc_className,
			String special_Name, String department_Name, int enc_schoolYear,Date start_Date,LocalDateTime modifyDate) {
		super();
		this.enc_id = enc_id;
		this.class_id = class_id;
		this.scp_studentid = scp_studentid;
		this.gender = gender;
		this.status = status;
		this.enc_className = enc_className;
		this.special_Name = special_Name;
		this.department_Name = department_Name;
		this.enc_schoolYear = enc_schoolYear;
		this.start_Date = start_Date;
		this.modify_Date = modifyDate;
	}
}
