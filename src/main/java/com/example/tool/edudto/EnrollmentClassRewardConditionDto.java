package com.example.tool.edudto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.tool.edudto.CourseYearDto;
import com.example.tool.edudto.SchoolYearDto;
import com.globits.education.domain.CourseYear;
import com.globits.education.domain.SchoolYear;
import com.globits.education.domain.EnrollmentClassReward;
import com.globits.education.domain.EnrollmentClassRewardCondition;

public class EnrollmentClassRewardConditionDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	private Integer academicClassification; //Xếp loại học tập
	
	private Float academicClassificationPercent; //Phần trăm xếp loại học tập
	
	private Float studentAlertPercent; //Phần trăm cảnh báo
	
	public Float getStudentAlertPercent() {
		return studentAlertPercent;
	}

	public void setStudentAlertPercent(Float studentAlertPercent) {
		this.studentAlertPercent = studentAlertPercent;
	}

	private Boolean isWarning;//Bị cảnh báo
	

	private Integer rewardName;//Danh hiệu
	

	private Integer inspectCourseYear;//Xét danh hiệu cuối khóa, trong class const tên là inspectCourseYear
	
	private Integer inspectSchoolYear;//Xét danh hiệu cuối năm, trong class const tên là inspectSchoolYear
	
	private CourseYearDto courseYear; //Khóa học
	
	private SchoolYearDto schoolYear; //Năm học

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getAcademicClassification() {
		return academicClassification;
	}

	public void setAcademicClassification(Integer academicClassification) {
		this.academicClassification = academicClassification;
	}

	public Float getAcademicClassificationPercent() {
		return academicClassificationPercent;
	}

	public void setAcademicClassificationPercent(Float academicClassificationPercent) {
		this.academicClassificationPercent = academicClassificationPercent;
	}

	public Boolean getIsWarning() {
		return isWarning;
	}

	public void setIsWarning(Boolean isWarning) {
		this.isWarning = isWarning;
	}

	public Integer getRewardName() {
		return rewardName;
	}

	public void setRewardName(Integer rewardName) {
		this.rewardName = rewardName;
	}

	public Integer getInspectCourseYear() {
		return inspectCourseYear;
	}

	public void setInspectCourseYear(Integer inspectCourseYear) {
		this.inspectCourseYear = inspectCourseYear;
	}

	public Integer getInspectSchoolYear() {
		return inspectSchoolYear;
	}

	public void setInspectSchoolYear(Integer inspectSchoolYear) {
		this.inspectSchoolYear = inspectSchoolYear;
	}



	public CourseYearDto getCourseYear() {
		return courseYear;
	}

	public void setCourseYear(CourseYearDto courseYear) {
		this.courseYear = courseYear;
	}

	public SchoolYearDto getSchoolYear() {
		return schoolYear;
	}

	public void setSchoolYear(SchoolYearDto schoolYear) {
		this.schoolYear = schoolYear;
	}

	public EnrollmentClassRewardConditionDto() {

	}

	public EnrollmentClassRewardConditionDto(EnrollmentClassRewardCondition sr) {
		this.id = sr.getId();
		this.academicClassification = sr.getAcademicClassification();
		this.academicClassificationPercent = sr.getAcademicClassificationPercent();
		this.isWarning = sr.getIsWarning();
		this.rewardName = sr.getRewardName();
		this.inspectCourseYear = sr.getInspectCourseYear();
		this.inspectSchoolYear = sr.getInspectSchoolYear();
		this.studentAlertPercent = sr.getStudentAlertPercent();
		
		if (sr.getCourseYear() != null) {
			this.courseYear = new CourseYearDto();
			this.courseYear.setId(sr.getCourseYear().getId());
			this.courseYear.setName(sr.getCourseYear().getName());
			this.courseYear.setCode(sr.getCourseYear().getCode());
		}

		if (sr.getSchoolYear() != null) {
			this.schoolYear = new SchoolYearDto();
			this.schoolYear.setId(sr.getSchoolYear().getId());
			this.schoolYear.setName(sr.getSchoolYear().getName());
			this.schoolYear.setCode(sr.getSchoolYear().getCode());
		}
	}

}
