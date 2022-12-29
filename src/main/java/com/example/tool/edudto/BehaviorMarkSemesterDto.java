package com.example.tool.edudto;

import java.io.Serializable;
import java.util.Date;

import com.globits.core.dto.DepartmentDto;
import com.globits.core.dto.TrainingBaseDto;
import com.globits.education.domain.BehaviorMarkSemester;
import com.globits.education.dto.CourseYearDto;
import com.globits.education.dto.EnrollmentClassDto;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.SpecialityDto;

public class BehaviorMarkSemesterDto implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private SemesterDto semester;
	private CourseYearDto courseYear;
	private TrainingBaseDto trainingBase;
	private DepartmentDto department;
	private SpecialityDto speciality;
	private EnrollmentClassDto enrollmentClass;
	private Date behaviorMarkStart;
	private Date behaviorMarkEnd;
	private String semesterName;
	private String courseYearName;
	private String trainingBaseName;
	private String departmentName;
	private String specialityName;
	private String enrollmentClassName;
	private Boolean isStudying = true;

	public Boolean getIsStudying() {
		return isStudying;
	}

	public void setIsStudying(Boolean isStudying) {
		this.isStudying = isStudying;
	}

	public String getSemesterName() {
		return semesterName;
	}

	public void setSemesterName(String semesterName) {
		this.semesterName = semesterName;
	}

	public String getCourseYearName() {
		return courseYearName;
	}

	public void setCourseYearName(String courseYearName) {
		this.courseYearName = courseYearName;
	}

	public String getTrainingBaseName() {
		return trainingBaseName;
	}

	public void setTrainingBaseName(String trainingBaseName) {
		this.trainingBaseName = trainingBaseName;
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

	public String getEnrollmentClassName() {
		return enrollmentClassName;
	}

	public void setEnrollmentClassName(String enrollmentClassName) {
		this.enrollmentClassName = enrollmentClassName;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
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

	public TrainingBaseDto getTrainingBase() {
		return trainingBase;
	}

	public void setTrainingBase(TrainingBaseDto trainingBase) {
		this.trainingBase = trainingBase;
	}

	public DepartmentDto getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentDto department) {
		this.department = department;
	}

	public SpecialityDto getSpeciality() {
		return speciality;
	}

	public void setSpeciality(SpecialityDto speciality) {
		this.speciality = speciality;
	}

	public EnrollmentClassDto getEnrollmentClass() {
		return enrollmentClass;
	}

	public void setEnrollmentClass(EnrollmentClassDto enrollmentClass) {
		this.enrollmentClass = enrollmentClass;
	}

	public Date getBehaviorMarkStart() {
		return behaviorMarkStart;
	}

	public void setBehaviorMarkStart(Date behaviorMarkStart) {
		this.behaviorMarkStart = behaviorMarkStart;
	}

	public Date getBehaviorMarkEnd() {
		return behaviorMarkEnd;
	}

	public void setBehaviorMarkEnd(Date behaviorMarkEnd) {
		this.behaviorMarkEnd = behaviorMarkEnd;
	}

	public BehaviorMarkSemesterDto() {
		
	}
	
	public BehaviorMarkSemesterDto(BehaviorMarkSemester behaviorMarkSemester) {
		if(behaviorMarkSemester.getId() != null)
			this.setId(behaviorMarkSemester.getId());
		
		if(behaviorMarkSemester.getBehaviorMarkEnd() != null)
			this.setBehaviorMarkEnd(behaviorMarkSemester.getBehaviorMarkEnd());
		
		if(behaviorMarkSemester.getBehaviorMarkStart() != null)
			this.setBehaviorMarkStart(behaviorMarkSemester.getBehaviorMarkStart());
		
		if(behaviorMarkSemester.getCourseYear() != null) {
			this.setCourseYear(new CourseYearDto(behaviorMarkSemester.getCourseYear()));
			this.setCourseYearName(behaviorMarkSemester.getCourseYear().getName());
		}
			
		if(behaviorMarkSemester.getSemester() != null) {
			this.setSemester(new SemesterDto(behaviorMarkSemester.getSemester()));
			this.setSemesterName(behaviorMarkSemester.getSemester().getSemesterName());
		}
			
		if(behaviorMarkSemester.getTrainingBase() != null) {
			this.setTrainingBase(new TrainingBaseDto(behaviorMarkSemester.getTrainingBase()));
			this.setTrainingBaseName(behaviorMarkSemester.getTrainingBase().getName());
		}
			
		if(behaviorMarkSemester.getDepartment() != null) {
			this.setDepartment(new DepartmentDto(behaviorMarkSemester.getDepartment()));
			this.setDepartmentName(behaviorMarkSemester.getDepartment().getName());
		}
			
		if(behaviorMarkSemester.getSpeciality() != null) {
			this.setSpeciality(new SpecialityDto(behaviorMarkSemester.getSpeciality()));
			this.setSpecialityName(behaviorMarkSemester.getSpeciality().getName());
		}
			
		if(behaviorMarkSemester.getEnrollmentClass() != null) {
			this.setEnrollmentClass(new EnrollmentClassDto(behaviorMarkSemester.getEnrollmentClass()));
			this.setEnrollmentClassName(behaviorMarkSemester.getEnrollmentClass().getClassName());
		}
			
	}
	
}
