package com.example.tool.edudto;

import java.io.Serializable;

import javax.jdo.annotations.Column;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.globits.core.domain.Department;
import com.globits.core.domain.TrainingBase;
import com.globits.core.dto.DepartmentDto;
import com.globits.core.dto.TrainingBaseDto;
import com.globits.education.domain.CourseYear;
import com.globits.education.domain.EducationLevel;
import com.globits.education.domain.EducationProgram;
import com.globits.education.domain.EducationProgramTuitionFee;
import com.globits.education.domain.EducationType;
import com.globits.education.domain.EnrollmentClass;
import com.globits.education.domain.Semester;
import com.globits.education.domain.SemesterRegisterPeriod;
import com.globits.education.domain.Speciality;
import com.globits.education.dto.CourseYearDto;
import com.globits.education.dto.EducationLevelDto;
import com.globits.education.dto.EducationProgramDto;
import com.globits.education.dto.EducationTypeDto;
import com.globits.education.dto.EnrollmentClassDto;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.SemesterRegisterPeriodDto;
import com.globits.education.dto.SpecialityDto;
/**
 * 
 */
public class EducationProgramTuitionFeeDto  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private EducationTypeDto educationType;//hệ đào tạo

	private EducationLevelDto educationLevel;//bậc đào tạo

	private TrainingBaseDto trainingBase;//cơ sở
	
	private CourseYearDto courseYear;//khóa
	
	private DepartmentDto department;
	
	private SpecialityDto speciality;//ngành

	private EnrollmentClassDto enrollmentClass; // Lớp
	private SemesterDto semester;
	private SemesterRegisterPeriodDto registerPeriod;//đợt học áp dụng
	private EducationProgramDto educationProgram;
	private Integer educationProgramType;
	private Integer type;//loại(=1 học phí đơn vị, =2 lệ phí)
	private Boolean isCurrent;
	
	private Double basicMainSpecFee;
	private Double mainSpecFee;
	
	private Double mainSpecFeeRetake;
	
	
	private Double mainSpecFeeImprove;
	
	private Double basicSecondSpecFee;
	private Double secondSpecFee;
	
	
	private Double secondSpecFeeRetake;
	
	
	private Double secondSpecFeeImprove;

	

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

	public EducationProgramDto getEducationProgram() {
		return educationProgram;
	}

	public void setEducationProgram(EducationProgramDto educationProgram) {
		this.educationProgram = educationProgram;
	}

	public Boolean getIsCurrent() {
		return isCurrent;
	}

	public void setIsCurrent(Boolean isCurrent) {
		this.isCurrent = isCurrent;
	}

	public Double getMainSpecFee() {
		return mainSpecFee;
	}

	public void setMainSpecFee(Double mainSpecFee) {
		this.mainSpecFee = mainSpecFee;
	}

	public Double getMainSpecFeeRetake() {
		return mainSpecFeeRetake;
	}

	public void setMainSpecFeeRetake(Double mainSpecFeeRetake) {
		this.mainSpecFeeRetake = mainSpecFeeRetake;
	}

	public Double getMainSpecFeeImprove() {
		return mainSpecFeeImprove;
	}

	public void setMainSpecFeeImprove(Double mainSpecFeeImprove) {
		this.mainSpecFeeImprove = mainSpecFeeImprove;
	}

	public Double getSecondSpecFee() {
		return secondSpecFee;
	}

	public void setSecondSpecFee(Double secondSpecFee) {
		this.secondSpecFee = secondSpecFee;
	}

	public Double getSecondSpecFeeRetake() {
		return secondSpecFeeRetake;
	}

	public void setSecondSpecFeeRetake(Double secondSpecFeeRetake) {
		this.secondSpecFeeRetake = secondSpecFeeRetake;
	}

	public Double getSecondSpecFeeImprove() {
		return secondSpecFeeImprove;
	}

	public void setSecondSpecFeeImprove(Double secondSpecFeeImprove) {
		this.secondSpecFeeImprove = secondSpecFeeImprove;
	}
	
	public Double getBasicMainSpecFee() {
		return basicMainSpecFee;
	}

	public void setBasicMainSpecFee(Double basicMainSpecFee) {
		this.basicMainSpecFee = basicMainSpecFee;
	}

	public Double getBasicSecondSpecFee() {
		return basicSecondSpecFee;
	}

	public void setBasicSecondSpecFee(Double basicSecondSpecFee) {
		this.basicSecondSpecFee = basicSecondSpecFee;
	}
	
	public EducationTypeDto getEducationType() {
		return educationType;
	}

	public void setEducationType(EducationTypeDto educationType) {
		this.educationType = educationType;
	}

	public EducationLevelDto getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(EducationLevelDto educationLevel) {
		this.educationLevel = educationLevel;
	}

	public TrainingBaseDto getTrainingBase() {
		return trainingBase;
	}

	public void setTrainingBase(TrainingBaseDto trainingBase) {
		this.trainingBase = trainingBase;
	}

	public CourseYearDto getCourseYear() {
		return courseYear;
	}

	public void setCourseYear(CourseYearDto courseYear) {
		this.courseYear = courseYear;
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

	public SemesterRegisterPeriodDto getRegisterPeriod() {
		return registerPeriod;
	}

	public void setRegisterPeriod(SemesterRegisterPeriodDto registerPeriod) {
		this.registerPeriod = registerPeriod;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public DepartmentDto getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentDto department) {
		this.department = department;
	}

	public Integer getEducationProgramType() {
		return educationProgramType;
	}

	public void setEducationProgramType(Integer educationProgramType) {
		this.educationProgramType = educationProgramType;
	}

	public EducationProgramTuitionFeeDto() {
		
	}
	public EducationProgramTuitionFeeDto(EducationProgramTuitionFee educationProgramTuitionFee) {
		if(educationProgramTuitionFee!=null) {
			this.id = educationProgramTuitionFee.getId();
			this.isCurrent = educationProgramTuitionFee.getIsCurrent();
			this.basicMainSpecFee = educationProgramTuitionFee.getBasicMainSpecFee();
			this.mainSpecFee = educationProgramTuitionFee.getMainSpecFee();
			this.mainSpecFeeImprove = educationProgramTuitionFee.getMainSpecFeeImprove();
			this.mainSpecFeeRetake = educationProgramTuitionFee.getMainSpecFeeRetake();
			this.basicSecondSpecFee = educationProgramTuitionFee.getBasicSecondSpecFee();
			this.secondSpecFee = educationProgramTuitionFee.getSecondSpecFee();
			this.secondSpecFeeImprove = educationProgramTuitionFee.getSecondSpecFeeImprove();
			this.secondSpecFeeRetake = educationProgramTuitionFee.getSecondSpecFeeRetake();
			if(educationProgramTuitionFee.getDepartment()!=null) {
				this.department = new DepartmentDto();
				this.department.setId(educationProgramTuitionFee.getDepartment().getId());
				this.department.setName(educationProgramTuitionFee.getDepartment().getName());
				this.department.setCode(educationProgramTuitionFee.getDepartment().getCode());
			}
			this.educationProgramType = educationProgramTuitionFee.getEducationProgramType();
			if(educationProgramTuitionFee.getEducationProgram()!=null) {
				this.educationProgram = new EducationProgramDto(educationProgramTuitionFee.getEducationProgram());
			}
			if(educationProgramTuitionFee.getSemester()!=null) {
				this.semester = new SemesterDto(educationProgramTuitionFee.getSemester());
			}
			if(educationProgramTuitionFee.getEducationLevel()!=null) {
				this.educationLevel=new EducationLevelDto();
				this.educationLevel.setId(educationProgramTuitionFee.getEducationLevel().getId());
				this.educationLevel.setCode(educationProgramTuitionFee.getEducationLevel().getCode());
				this.educationLevel.setName(educationProgramTuitionFee.getEducationLevel().getName());
			}
			if(educationProgramTuitionFee.getEducationType()!=null) {
				this.educationType=new EducationTypeDto();
				this.educationType.setId(educationProgramTuitionFee.getEducationType().getId());
				this.educationType.setCode(educationProgramTuitionFee.getEducationType().getCode());
				this.educationType.setName(educationProgramTuitionFee.getEducationType().getName());
			}
			if(educationProgramTuitionFee.getTrainingBase()!=null) {
				this.trainingBase=new TrainingBaseDto();
				this.trainingBase.setId(educationProgramTuitionFee.getTrainingBase().getId());
				this.trainingBase.setCode(educationProgramTuitionFee.getTrainingBase().getCode());
				this.trainingBase.setName(educationProgramTuitionFee.getTrainingBase().getName());
			}
			if(educationProgramTuitionFee.getCourseYear()!=null) {
				this.courseYear=new CourseYearDto();
				this.courseYear.setId(educationProgramTuitionFee.getCourseYear().getId());
				this.courseYear.setCode(educationProgramTuitionFee.getCourseYear().getCode());
				this.courseYear.setName(educationProgramTuitionFee.getCourseYear().getName());
			}
			if(educationProgramTuitionFee.getSpeciality()!=null) {
				this.speciality=new SpecialityDto();
				this.speciality.setId(educationProgramTuitionFee.getSpeciality().getId());
				this.speciality.setCode(educationProgramTuitionFee.getSpeciality().getCode());
				this.speciality.setName(educationProgramTuitionFee.getSpeciality().getName());
			}
			if(educationProgramTuitionFee.getEnrollmentClass()!=null) {
				this.enrollmentClass=new EnrollmentClassDto();
				this.enrollmentClass.setId(educationProgramTuitionFee.getEnrollmentClass().getId());
				this.enrollmentClass.setClassCode(educationProgramTuitionFee.getEnrollmentClass().getClassCode());
				this.enrollmentClass.setClassName(educationProgramTuitionFee.getEnrollmentClass().getClassName());
			}
			if(educationProgramTuitionFee.getRegisterPeriod()!=null) {
				this.registerPeriod=new SemesterRegisterPeriodDto();
				this.registerPeriod.setId(educationProgramTuitionFee.getRegisterPeriod().getId());
				this.registerPeriod.setName(educationProgramTuitionFee.getRegisterPeriod().getName());
			}
			this.type=educationProgramTuitionFee.getType();
		}		
	}
}
