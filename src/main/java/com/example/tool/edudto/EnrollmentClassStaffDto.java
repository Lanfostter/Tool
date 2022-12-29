package com.example.tool.edudto;

import com.globits.core.dto.BaseObjectDto;
import com.globits.education.domain.EnrollmentClass;
import com.globits.education.domain.EnrollmentClassStaff;
import com.globits.education.dto.EnrollmentClassDto;
import com.globits.hr.dto.StaffDto;

public class EnrollmentClassStaffDto extends BaseObjectDto {
	private String staffDisplayName;
	private String staffCode;
	private String className;
	private String classCode;
	private String role;
	private StaffDto staff;
	private EnrollmentClassDto enrollmentClass;
	public String getStaffDisplayName() {
		return staffDisplayName;
	}
	public void setStaffDisplayName(String staffDisplayName) {
		this.staffDisplayName = staffDisplayName;
	}
	public String getStaffCode() {
		return staffCode;
	}
	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getClassCode() {
		return classCode;
	}
	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public StaffDto getStaff() {
		return staff;
	}
	public void setStaff(StaffDto staff) {
		this.staff = staff;
	}
	public EnrollmentClassDto getEnrollmentClass() {
		return enrollmentClass;
	}
	public void setEnrollmentClass(EnrollmentClassDto enrollmentClass) {
		this.enrollmentClass = enrollmentClass;
	}
	
	public EnrollmentClassStaffDto() {
		
	}
	
	public EnrollmentClassStaffDto(EnrollmentClassStaff entity) {
		if(entity!=null) {
			this.id = entity.getId();
			this.role = entity.getRole();
			if(entity.getStaff()!=null) {
				this.staffDisplayName = entity.getStaff().getDisplayName();
				this.staffCode = entity.getStaff().getStaffCode();
				this.staff = new StaffDto();
				this.staff.setId(entity.getStaff().getId());
			}
			if(entity.getEnrollmentClass()!=null) {
				this.classCode = entity.getEnrollmentClass().getClassCode();
				this.className = entity.getEnrollmentClass().getClassName();
				this.enrollmentClass = new EnrollmentClassDto();
				this.enrollmentClass.setId(entity.getEnrollmentClass().getId());
			}
		}
	}
}
