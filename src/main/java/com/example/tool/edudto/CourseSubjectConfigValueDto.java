package com.example.tool.edudto;

import java.util.Set;

import com.globits.education.domain.CourseSubjectConfig;
import com.globits.education.utils.EducationConstant;

public class CourseSubjectConfigValueDto {
	private Long courseSubjectConfigId;
	private Long courseSubjectId;
	private String courseSubjectCode;
	private Long specialityId;
	private Long enrollmentClassId;
	private Boolean isGrant;
	private Boolean isDenied;
	private Long subjectId;
	private String subjectName;
	private String displayName;
	private boolean isSave;//trạng thái lưu
	private Integer status;//trạng thái lớp học phần
	private Long departmentId;
	private Long courseYearId;
	
	
	/**
	 * @return the departmentId
	 */
	public Long getDepartmentId() {
		return departmentId;
	}
	/**
	 * @param departmentId the departmentId to set
	 */
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	/**
	 * @return the courseYearId
	 */
	public Long getCourseYearId() {
		return courseYearId;
	}
	/**
	 * @param courseYearId the courseYearId to set
	 */
	public void setCourseYearId(Long courseYearId) {
		this.courseYearId = courseYearId;
	}
	public Long getCourseSubjectConfigId() {
		return courseSubjectConfigId;
	}
	public void setCourseSubjectConfigId(Long courseSubjectConfigId) {
		this.courseSubjectConfigId = courseSubjectConfigId;
	}
	public Long getCourseSubjectId() {
		return courseSubjectId;
	}
	public void setCourseSubjectId(Long courseSubjectId) {
		this.courseSubjectId = courseSubjectId;
	}
	public Long getSpecialityId() {
		return specialityId;
	}
	public void setSpecialityId(Long specialityId) {
		this.specialityId = specialityId;
	}
	public Long getEnrollmentClassId() {
		return enrollmentClassId;
	}
	public void setEnrollmentClassId(Long enrollmentClassId) {
		this.enrollmentClassId = enrollmentClassId;
	}
	public Boolean getIsGrant() {
		return isGrant;
	}
	public void setIsGrant(Boolean isGrant) {
		this.isGrant = isGrant;
	}
	public Boolean getIsDenied() {
		return isDenied;
	}
	public void setIsDenied(Boolean isDenied) {
		this.isDenied = isDenied;
	}	
	public String getCourseSubjectCode() {
		return courseSubjectCode;
	}
	public void setCourseSubjectCode(String courseSubjectCode) {
		this.courseSubjectCode = courseSubjectCode;
	}
	public Long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
	public boolean isSave() {
		return isSave;
	}
	public void setSave(boolean isSave) {
		this.isSave = isSave;
	}	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public CourseSubjectConfigValueDto() {
		
	}
	public CourseSubjectConfigValueDto(Long courseSubjectConfigId,Long courseSubjectId,int type,Long id,Boolean isGrant,Boolean isDenied) {
		this.courseSubjectConfigId = courseSubjectConfigId;
		this.courseSubjectId = courseSubjectId;
		this.isDenied = isDenied;
		this.isGrant = isGrant;
		if(type==EducationConstant.TreeItemType.Speciality.getValue()) {
			this.specialityId=id;
		}
		if(type==EducationConstant.TreeItemType.EnrollmentClass.getValue()) {
			this.enrollmentClassId=id;
		}
		if(isGrant==null && isDenied==null) {
			this.isDenied = true;
			this.isGrant = false;
		}
	}
	public CourseSubjectConfigValueDto(Long courseSubjectConfigId,Long courseSubjectId,String courseSubjectCode,Long specialityId,Long enrollmentClassId,Long subjectId,String subjectName,Boolean isGrant,Boolean isDenied) {
		this.courseSubjectConfigId = courseSubjectConfigId;
		this.courseSubjectId = courseSubjectId;
		this.isDenied = isDenied;
		this.isGrant = isGrant;
		this.specialityId=specialityId;
		this.enrollmentClassId=enrollmentClassId;		
		this.subjectId = subjectId;
		this.courseSubjectCode=courseSubjectCode;
		this.subjectName=subjectName;
		if(isGrant==null && isDenied==null) {
			this.isDenied = true;
			this.isGrant = false;
		}
	}
	public CourseSubjectConfigValueDto(Long courseSubjectConfigId,Long courseSubjectId,String courseSubjectCode,String displayName,Long specialityId,Long enrollmentClassId,Long subjectId,String subjectName,Boolean isGrant,Boolean isDenied) {
		this.courseSubjectConfigId = courseSubjectConfigId;
		this.courseSubjectId = courseSubjectId;
		this.isDenied = isDenied;
		this.isGrant = isGrant;
		this.specialityId=specialityId;
		this.enrollmentClassId=enrollmentClassId;		
		this.subjectId = subjectId;
		this.courseSubjectCode=courseSubjectCode;
		this.subjectName=subjectName;
		this.displayName=displayName;
		if(this.displayName==null||this.displayName=="") {
			if(subjectName!=null&&courseSubjectCode!=null && courseSubjectCode.contains("-")) {
				this.displayName = subjectName + courseSubjectCode.substring(courseSubjectCode.indexOf("-"), courseSubjectCode.length());	
			}
			else {
				this.displayName = subjectName +" " + courseSubjectCode;
			}
		}
		if(isGrant==null && isDenied==null) {
			this.isDenied = true;
			this.isGrant = false;
			this.isSave=false;
		}else {
			this.isSave=true;
		}
	}
	public CourseSubjectConfigValueDto(Long courseSubjectConfigId,Long courseSubjectId,String courseSubjectCode,String displayName,Long specialityId,Long enrollmentClassId,Long subjectId,String subjectName,Integer status,Boolean isGrant,Boolean isDenied) {
		this.courseSubjectConfigId = courseSubjectConfigId;
		this.courseSubjectId = courseSubjectId;
		this.isDenied = isDenied;
		this.isGrant = isGrant;
		this.specialityId=specialityId;
		this.enrollmentClassId=enrollmentClassId;		
		this.subjectId = subjectId;
		this.courseSubjectCode=courseSubjectCode;
		this.subjectName=subjectName;
		this.displayName=displayName;
		if(this.displayName==null||this.displayName=="") {
			if(subjectName!=null&&courseSubjectCode!=null && courseSubjectCode.contains("-")) {
				this.displayName = subjectName + courseSubjectCode.substring(courseSubjectCode.indexOf("-"), courseSubjectCode.length());	
			}
			else {
				this.displayName = subjectName +" " + courseSubjectCode;
			}
		}
		if(isGrant==null && isDenied==null) {
			this.isDenied = true;
			this.isGrant = false;
			this.isSave=false;
		}else {
			this.isSave=true;
		}
		this.status=status;
	}
	public CourseSubjectConfigValueDto (CourseSubjectConfig config) {
		if(config!=null) {
			this.courseSubjectConfigId = config.getId();
			if(config.getCourseSubject()!=null) {
				this.courseSubjectId = config.getCourseSubject().getId();
				this.courseSubjectCode=config.getCourseSubject().getCode();
				if(config.getCourseSubject().getSemesterSubject()!=null && config.getCourseSubject().getSemesterSubject().getSubject()!=null) {
					this.subjectId = config.getCourseSubject().getSemesterSubject().getSubject().getId();
					this.subjectName=config.getCourseSubject().getSemesterSubject().getSubject().getSubjectName();
				}
			}
			this.isDenied = config.getIsDenied();			
			this.isGrant = config.getIsGrant();
			if(config.getSpeciality()!=null)
				this.specialityId=config.getSpeciality().getId();
			if(config.getEnrollmentClass()!=null)
				this.enrollmentClassId=config.getEnrollmentClass().getId();
			if(config.getIsGrant()==null && config.getIsDenied()==null) {
				this.isDenied = true;
				this.isGrant = false;
			}
		}
	}
	public CourseSubjectConfigValueDto(Long courseSubjectConfigId,Long courseSubjectId,String courseSubjectCode,String displayName,Long courseYearId,Long departmentId,Long specialityId,Long enrollmentClassId,Long subjectId,String subjectName,Integer status,Boolean isGrant,Boolean isDenied) {
		this.courseSubjectConfigId = courseSubjectConfigId;
		this.courseSubjectId = courseSubjectId;
		this.isDenied = isDenied;
		this.isGrant = isGrant;
		this.specialityId=specialityId;
		this.enrollmentClassId=enrollmentClassId;		
		this.subjectId = subjectId;
		this.courseSubjectCode=courseSubjectCode;
		this.subjectName=subjectName;
		this.displayName=displayName;
		this.courseYearId = courseYearId;
		this.departmentId = departmentId;
		if(this.displayName==null||this.displayName=="") {
			if(subjectName!=null&&courseSubjectCode!=null && courseSubjectCode.contains("-")) {
				this.displayName = subjectName + courseSubjectCode.substring(courseSubjectCode.indexOf("-"), courseSubjectCode.length());	
			}
			else {
				this.displayName = subjectName +" " + courseSubjectCode;
			}
		}
		if(isGrant==null && isDenied==null) {
			this.isDenied = true;
			this.isGrant = false;
			this.isSave=false;
		}else {
			this.isSave=true;
		}
		this.status=status;
	}
}
