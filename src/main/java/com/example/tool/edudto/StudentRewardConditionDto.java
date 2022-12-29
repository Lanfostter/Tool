package com.example.tool.edudto;

import java.io.Serializable;

import com.example.tool.edudto.CourseYearDto;
import com.example.tool.edudto.SchoolYearDto;
import com.globits.education.domain.StudentRewardCondition;

public class StudentRewardConditionDto implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	private Integer academicClassification; //Xếp loại học tập
	
	private Integer behaviorClassification; //Xếp loại rèn luyện
	
	private Boolean isDisciplined;//Bị kỷ luật
	
	private Integer numberOfRetestAllowed;//Số lần thi lại cho phép
	
	private Boolean isRewarded;//được khen thưởng
	
	private Integer rewardName;//Danh hiệu
	
	private Double mark10;//Thang điểm 10
	
	private Double mark4;//Thang điểm 4
	
	private String charMark;//Điểm chữ
	
	private Integer inspectCourseYear;//Xét danh hiệu cuối khóa, trong class const tên là inspectCourseYear
	
	private Integer inspectSchoolYear;//Xét danh hiệu cuối năm, trong class const tên là inspectSchoolYear
	
	private Boolean isEndCourseYear;//Xét cuối khóa - true => năm học bằng null
	
	private CourseYearDto courseYear; //Khóa học
	
	private SchoolYearDto schoolYear; //Năm học
	private Integer minCredit;//số tín chỉ

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

	public Integer getBehaviorClassification() {
		return behaviorClassification;
	}

	public void setBehaviorClassification(Integer behaviorClassification) {
		this.behaviorClassification = behaviorClassification;
	}

	public Boolean getIsDisciplined() {
		return isDisciplined;
	}

	public void setIsDisciplined(Boolean isDisciplined) {
		this.isDisciplined = isDisciplined;
	}

	public Integer getNumberOfRetestAllowed() {
		return numberOfRetestAllowed;
	}

	public void setNumberOfRetestAllowed(Integer numberOfRetestAllowed) {
		this.numberOfRetestAllowed = numberOfRetestAllowed;
	}

	public Boolean getIsRewarded() {
		return isRewarded;
	}

	public void setIsRewarded(Boolean isRewarded) {
		this.isRewarded = isRewarded;
	}

	public Integer getRewardName() {
		return rewardName;
	}

	public void setRewardName(Integer rewardName) {
		this.rewardName = rewardName;
	}

	public Double getMark10() {
		return mark10;
	}

	public void setMark10(Double mark10) {
		this.mark10 = mark10;
	}

	public Double getMark4() {
		return mark4;
	}

	public void setMark4(Double mark4) {
		this.mark4 = mark4;
	}

	public String getCharMark() {
		return charMark;
	}

	public void setCharMark(String charMark) {
		this.charMark = charMark;
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

	public Boolean getIsEndCourseYear() {
		return isEndCourseYear;
	}

	public void setIsEndCourseYear(Boolean isEndCourseYear) {
		this.isEndCourseYear = isEndCourseYear;
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
	
	public Integer getMinCredit() {
		return minCredit;
	}

	public void setMinCredit(Integer minCredit) {
		this.minCredit = minCredit;
	}

	public StudentRewardConditionDto() {

	}

	public StudentRewardConditionDto(StudentRewardCondition sr) {
		this.id = sr.getId();
		this.academicClassification = sr.getAcademicClassification();
		this.behaviorClassification = sr.getBehaviorClassification();
		this.isDisciplined = sr.getIsDisciplined();
		this.numberOfRetestAllowed = sr.getNumberOfRetestAllowed();
		this.isRewarded = sr.getIsRewarded();
		this.rewardName = sr.getRewardName();
		this.mark10 = sr.getMark10();
		this.mark4 = sr.getMark4();
		this.charMark = sr.getCharMark();
		this.inspectCourseYear = sr.getInspectCourseYear();
		this.inspectSchoolYear = sr.getInspectSchoolYear();
		this.isEndCourseYear = sr.getIsEndCourseYear();
		this.minCredit = sr.getMinCredit();
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
