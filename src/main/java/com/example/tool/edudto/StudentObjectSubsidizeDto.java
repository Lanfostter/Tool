package com.example.tool.edudto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.tool.edudto.CourseYearDto;
import com.example.tool.edudto.EnrollmentClassDto;
import com.example.tool.edudto.SchoolYearDto;
import com.example.tool.edudto.SemesterDto;
import com.example.tool.edudto.StudentDto;
import com.example.tool.edudto.StudentObjectDto;
import com.globits.core.domain.Reward;
import com.globits.core.dto.RewardDto;
import com.globits.education.domain.EnrollmentClass;
import com.globits.education.domain.SchoolYear;
import com.globits.education.domain.Semester;
import com.globits.education.domain.StudentObject;
import com.globits.education.domain.EnrollmentClassReward;
import com.globits.education.domain.EnrollmentClassRewardCondition;
import com.globits.education.domain.RewardDecree;
import com.globits.education.domain.StudentObjectSubsidize;
import com.globits.education.domain.StudentReward;

public class StudentObjectSubsidizeDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	
	private float  money_subsidize;
	
	private String name;
	
	private SemesterDto semester; // Học kỳ
	
	private CourseYearDto courseYear; // Khóa học
	
	private StudentObjectDto studentObject;
	

	private Integer academicClassification; //Xếp loại học tập
	
	private Integer behaviorClassification; //Xếp loại rèn luyện
	
	private Boolean isDisciplined;//Bị kỷ luật
	
	private Integer numberOfRetestAllowed;//Số lần thi lại cho phép
	
	private Integer numberOfCreditLearning;//Số tin chỉ yêu cầu
	
	private Integer number_month_subsidize;
	
	private Integer status;
	
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getNumber_month_subsidize() {
		return number_month_subsidize;
	}

	public void setNumber_month_subsidize(Integer number_month_subsidize) {
		this.number_month_subsidize = number_month_subsidize;
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

	public Integer getNumberOfCreditLearning() {
		return numberOfCreditLearning;
	}

	public void setNumberOfCreditLearning(Integer numberOfCreditLearning) {
		this.numberOfCreditLearning = numberOfCreditLearning;
	}

	public float getMoney_subsidize() {
		return money_subsidize;
	}

	public void setMoney_subsidize(float money_subsidize) {
		this.money_subsidize = money_subsidize;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SemesterDto getSemester() {
		return semester;
	}

	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}

	public CourseYearDto getCourseYear() {
		return courseYear;
	}

	public void setCourseYear(CourseYearDto courseYear) {
		this.courseYear = courseYear;
	}

	public StudentObjectDto getStudentObject() {
		return studentObject;
	}

	public void setStudentObject(StudentObjectDto studentObject) {
		this.studentObject = studentObject;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public StudentObjectSubsidizeDto() {
		
	}
	public StudentObjectSubsidizeDto(StudentObjectSubsidize sos) {
		// TODO Auto-generated constructor stub
		this.id = sos.getId();
		this.name = sos.getName();
		this.money_subsidize = sos.getMoney_subsidize();
		this.academicClassification = sos.getAcademicClassification();
		this.behaviorClassification = sos.getBehaviorClassification();
		this.isDisciplined = sos.getIsDisciplined();
		this.numberOfRetestAllowed = sos.getNumberOfRetestAllowed();
		this.numberOfCreditLearning = sos.getNumberOfCreditLearning();
		this.number_month_subsidize = sos.getNumber_month_subsidize();
		
		if(sos.getSemester() != null) {
			this.semester = new SemesterDto();
			this.semester.setId(sos.getSemester().getId());
			this.semester.setSemesterName(sos.getSemester().getSemesterName());
			this.semester.setSemesterCode(sos.getSemester().getSemesterCode());
		}
		if(sos.getCourseYear() != null) {
			this.courseYear = new CourseYearDto();
			this.courseYear.setId(sos.getCourseYear().getId());
			this.courseYear.setName(sos.getCourseYear().getName());
			this.courseYear.setCode(sos.getCourseYear().getCode());
		}
		
		if(sos.getStudentObject() != null) {
			this.studentObject = new StudentObjectDto();
			this.studentObject.setId(sos.getStudentObject().getId());
			this.studentObject.setName(sos.getStudentObject().getName());
			this.studentObject.setCode(sos.getStudentObject().getCode());
		}
	}

}
