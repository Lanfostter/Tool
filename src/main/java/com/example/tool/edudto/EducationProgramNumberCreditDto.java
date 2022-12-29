package com.example.tool.edudto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.globits.core.domain.TrainingBase;
import com.globits.core.dto.TrainingBaseDto;
import com.globits.education.domain.CourseYear;
import com.globits.education.domain.EducationProgram;
import com.globits.education.domain.EducationProgramNumberCredit;
import com.globits.education.domain.EnrollmentClass;
import com.globits.education.domain.GroupSubjectProgram;
import com.globits.education.domain.ProgramSubject;
import com.globits.education.domain.Semester;
import com.globits.education.domain.Speciality;
import com.globits.education.dto.CourseYearDto;
import com.globits.education.dto.EnrollmentClassDto;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.SpecialityDto;

public class EducationProgramNumberCreditDto implements Serializable {
	private String name;
	private Long id;
	private String code;	
	private SemesterDto semester;	
	private SpecialityDto speciality;
	private CourseYearDto courseYear;	
	private EnrollmentClassDto enrollmentClass;
	private TrainingBaseDto trainingBase;	
	private Integer numberSubject;//Tổng số môn
	private Integer numberOfCredit;//Tổng số tín chỉ đào tạo mở cho ngành
	private Integer minNumberOfCredit;//Tổng số tín chỉ xét học bổng
	private Integer numberSubjectNotMark;//Tổng số môn (+) KTĐ
	private Integer minNumberOfCreditNotMark;//Tổng số tín chỉ xét học bổng (+) KTĐ
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public SpecialityDto getSpeciality() {
		return speciality;
	}

	public void setSpeciality(SpecialityDto speciality) {
		this.speciality = speciality;
	}

	public CourseYearDto getCourseYear() {
		return courseYear;
	}

	public void setCourseYear(CourseYearDto courseYear) {
		this.courseYear = courseYear;
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

	public EnrollmentClassDto getEnrollmentClass() {
		return enrollmentClass;
	}

	public void setEnrollmentClass(EnrollmentClassDto enrollmentClass) {
		this.enrollmentClass = enrollmentClass;
	}

	public TrainingBaseDto getTrainingBase() {
		return trainingBase;
	}

	public void setTrainingBase(TrainingBaseDto trainingBase) {
		this.trainingBase = trainingBase;
	}

	public Integer getNumberSubject() {
		return numberSubject;
	}

	public void setNumberSubject(Integer numberSubject) {
		this.numberSubject = numberSubject;
	}

	public Integer getNumberOfCredit() {
		return numberOfCredit;
	}

	public void setNumberOfCredit(Integer numberOfCredit) {
		this.numberOfCredit = numberOfCredit;
	}

	public Integer getMinNumberOfCredit() {
		return minNumberOfCredit;
	}

	public void setMinNumberOfCredit(Integer minNumberOfCredit) {
		this.minNumberOfCredit = minNumberOfCredit;
	}	

	public Integer getNumberSubjectNotMark() {
		return numberSubjectNotMark;
	}

	public void setNumberSubjectNotMark(Integer numberSubjectNotMark) {
		this.numberSubjectNotMark = numberSubjectNotMark;
	}

	public Integer getMinNumberOfCreditNotMark() {
		return minNumberOfCreditNotMark;
	}

	public void setMinNumberOfCreditNotMark(Integer minNumberOfCreditNotMark) {
		this.minNumberOfCreditNotMark = minNumberOfCreditNotMark;
	}

	public EducationProgramNumberCreditDto() {

	}

	public EducationProgramNumberCreditDto(EducationProgramNumberCredit ep) {
		this.id = ep.getId();
		this.code = ep.getCode();
		this.name = ep.getName();
		if (ep.getCourseYear() != null) {
			this.courseYear = new CourseYearDto(ep.getCourseYear());
		}
		if (ep.getSpeciality() != null) {
			this.speciality = new SpecialityDto();
			this.speciality.setId(ep.getSpeciality().getId());
			this.speciality.setCode(ep.getSpeciality().getCode());
			this.speciality.setName(ep.getSpeciality().getName());
		}
		if(ep.getSemester()!=null) {
			this.semester=new SemesterDto();
			this.semester.setId(ep.getSemester().getId());
			this.semester.setSemesterName(ep.getSemester().getSemesterName());
			this.semester.setSemesterCode(ep.getSemester().getSemesterCode());
		}
		if(ep.getEnrollmentClass()!=null) {
			this.enrollmentClass=new EnrollmentClassDto();
			this.enrollmentClass.setId(ep.getEnrollmentClass().getId());
			this.enrollmentClass.setClassCode(ep.getEnrollmentClass().getClassCode());
			this.enrollmentClass.setClassName(ep.getEnrollmentClass().getClassName());
		}
		if(ep.getTrainingBase()!=null) {
			this.trainingBase=new TrainingBaseDto();
			this.trainingBase.setId(ep.getTrainingBase().getId());
			this.trainingBase.setName(ep.getTrainingBase().getName());
			this.trainingBase.setCode(ep.getTrainingBase().getCode());
		}
		this.numberOfCredit=ep.getNumberOfCredit();
		this.numberSubject=ep.getNumberSubject();
		this.minNumberOfCredit=ep.getMinNumberOfCredit();
		this.numberSubjectNotMark=ep.getNumberSubjectNotMark();
		this.minNumberOfCreditNotMark=ep.getMinNumberOfCreditNotMark();
	}
	
}
