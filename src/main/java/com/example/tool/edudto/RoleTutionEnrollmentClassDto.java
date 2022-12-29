package com.example.tool.edudto;

import java.util.Date;

import javax.persistence.Column;

import com.globits.core.dto.BaseObjectDto;
import com.globits.education.domain.EnrollmentClass;
import com.globits.education.domain.EnrollmentClassStaff;
import com.globits.education.domain.RoleTutionEnrollmentClass;
import com.globits.education.dto.EnrollmentClassDto;
import com.globits.hr.dto.StaffDto;
import com.globits.security.domain.User;
import com.globits.security.dto.UserDto;

public class RoleTutionEnrollmentClassDto extends BaseObjectDto {
	private String displayName;
	private String username;
	private String className;
	private String classCode;
	private String courseYearName;
	private String departmentName;
	private String specialityName;
	private UserDto user;
	private Date startDate; // Từ ngày
	private Date endDate; // Đến ngày

	private boolean search; // tra cứu
	
	private boolean inputText; // nhập

	private boolean edit; // sửa
	
	private boolean delete; // xóa
	
	private boolean withdraw; // rút

	private boolean calculate; // tính
	private EnrollmentClassDto enrollmentClass;
	private boolean lockCoefficient; // =0 không mở khóa học phí và hệ số; =1 được mở khóa và hệ số học phí
	
	
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public UserDto getUser() {
		return user;
	}
	public void setUser(UserDto user) {
		this.user = user;
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
	
	public String getCourseYearName() {
		return courseYearName;
	}
	public void setCourseYearName(String courseYearName) {
		this.courseYearName = courseYearName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getSpecialityName() {
		return specialityName;
	}
	public void setSpecialityName(String specialityName) {
		this.specialityName = specialityName;
	}
	
	public EnrollmentClassDto getEnrollmentClass() {
		return enrollmentClass;
	}
	public void setEnrollmentClass(EnrollmentClassDto enrollmentClass) {
		this.enrollmentClass = enrollmentClass;
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
	public boolean isSearch() {
		return search;
	}
	public void setSearch(boolean search) {
		this.search = search;
	}
	public boolean isInputText() {
		return inputText;
	}
	public void setInputText(boolean inputText) {
		this.inputText = inputText;
	}
	public boolean isEdit() {
		return edit;
	}
	public void setEdit(boolean edit) {
		this.edit = edit;
	}
	public boolean isDelete() {
		return delete;
	}
	public void setDelete(boolean delete) {
		this.delete = delete;
	}
	public boolean isWithdraw() {
		return withdraw;
	}
	public void setWithdraw(boolean withdraw) {
		this.withdraw = withdraw;
	}
	public boolean isCalculate() {
		return calculate;
	}
	public void setCalculate(boolean calculate) {
		this.calculate = calculate;
	}
	
	public boolean getLockCoefficient() {
		return lockCoefficient;
	}
	public void setLockCoefficient(boolean lockCoefficient) {
		this.lockCoefficient = lockCoefficient;
	}
	public RoleTutionEnrollmentClassDto() {
		
	}
	
	public RoleTutionEnrollmentClassDto(RoleTutionEnrollmentClass entity) {
		if(entity!=null) {
			this.id = entity.getId();
			
			if(entity.getUser()!=null) {
				if(entity.getUser().getPerson()!=null)
				this.displayName = entity.getUser().getPerson().getDisplayName();
				this.username = entity.getUser().getUsername();
				this.user = new UserDto();
				this.user.setId(entity.getUser().getId());
			}
			if(entity.getEnrollmentClass()!=null) {
				this.classCode = entity.getEnrollmentClass().getClassCode();
				this.className = entity.getEnrollmentClass().getClassName();
				this.enrollmentClass = new EnrollmentClassDto();
				this.enrollmentClass.setId(entity.getEnrollmentClass().getId());
			}
			this.calculate=entity.isCalculate();
			this.delete=entity.isDelete();
			this.edit=entity.isEdit();
			this.endDate=entity.getEndDate();
			this.startDate=entity.getStartDate();
			this.inputText=entity.isInput();
			this.withdraw=entity.isWithdraw();
			this.search=entity.isSearch();
			this.lockCoefficient=entity.isLockCoefficient();
		}
	}
	public RoleTutionEnrollmentClassDto(RoleTutionEnrollmentClass entity, EnrollmentClass ec) {
		if(entity!=null) {
			this.id = entity.getId();			
			if(entity.getUser()!=null) {
				if(entity.getUser().getPerson()!=null)
				this.displayName = entity.getUser().getPerson().getDisplayName();
				this.username = entity.getUser().getUsername();
				this.user = new UserDto();
				this.user.setId(entity.getUser().getId());
			}
//			if(entity.getEnrollmentClass()!=null) {
//				this.classCode = entity.getEnrollmentClass().getClassCode();
//				this.className = entity.getEnrollmentClass().getClassName();
//				this.enrollmentClass = new EnrollmentClassDto();
//				this.enrollmentClass.setId(entity.getEnrollmentClass().getId());
//			}
			this.calculate=entity.isCalculate();
			this.delete=entity.isDelete();
			this.edit=entity.isEdit();
			this.endDate=entity.getEndDate();
			this.startDate=entity.getStartDate();
			this.inputText=entity.isInput();
			this.withdraw=entity.isWithdraw();
			this.search=entity.isSearch();
			this.lockCoefficient=entity.isLockCoefficient();
		}
		if(ec!=null) {
			this.classCode = ec.getClassCode();
			this.className = ec.getClassName();
			this.enrollmentClass = new EnrollmentClassDto();
			this.enrollmentClass.setId(ec.getId());
			if(ec.getCourseyear()!=null) {
				this.courseYearName=ec.getCourseyear().getName();
			}
			if(ec.getDepartment()!=null) {
				this.departmentName=ec.getDepartment().getName();
			}
			if(ec.getSpeciality()!=null) {
				this.specialityName=ec.getSpeciality().getName();
			}
		}
	}
}
