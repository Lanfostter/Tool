package com.example.tool.edudto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.globits.core.domain.Department;
import com.globits.core.domain.TrainingBase;
import com.globits.core.dto.DepartmentDto;
import com.globits.core.dto.TrainingBaseDto;
import com.globits.education.domain.CourseYear;
import com.globits.education.domain.EducationFeeConfig;
import com.globits.education.domain.EducationLevel;
import com.globits.education.domain.Semester;
import com.globits.education.domain.SemesterRegisterPeriod;
import com.globits.education.domain.Speciality;
import com.globits.education.dto.CourseYearDto;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.SemesterRegisterPeriodDto;
import com.globits.education.dto.SpecialityDto;

public class EducationFeeConfigDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String code;
	private Double amount;//Số tiền lệ phí	
	private TrainingBaseDto trainingBase;//Cơ sở đào tạo	
	private CourseYearDto courseYear;//Khóa học	
	private DepartmentDto department;//Khoa
	private SpecialityDto speciality;//Ngành
	
	/*
	 * 0: Thi --> tính theo semesterSubjectExam
	 * 1: Học --> tính theo CourseSubject
	 * Const.ExpectationRegisterTypeEnum
	 */
	private Integer type;//Loại lệ phí (học hay thi)
	
	/*
	 * Loại chương trình đào tạo
	 * 0 || null = chương trình thường
	 * 1 = chương trình tiên tiến	 * 
	 * Giá trị : Const.EducationProgramTypeEnum
	 */
	private Integer educationProgramType;	
	private SemesterDto semester;//Bắt đầu áp dụng cho học kỳ nào	
	private SemesterRegisterPeriodDto registerPeriod;//đợt học áp dụng
	private Long trainingBaseId;//Cơ sở đào tạo	
	private Long courseYearId;//Khóa học	
	private Long departmentId;//Khoa
	private Long specialityId;//Ngành
	private Long semesterId;//Bắt đầu áp dụng cho học kỳ nào	
	private Long registerPeriodId;//đợt học áp dụng
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
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

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getEducationProgramType() {
		return educationProgramType;
	}

	public void setEducationProgramType(Integer educationProgramType) {
		this.educationProgramType = educationProgramType;
	}

	public SemesterDto getSemester() {
		return semester;
	}

	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}

	public SemesterRegisterPeriodDto getRegisterPeriod() {
		return registerPeriod;
	}

	public void setRegisterPeriod(SemesterRegisterPeriodDto registerPeriod) {
		this.registerPeriod = registerPeriod;
	}
	
	public Long getTrainingBaseId() {
		return trainingBaseId;
	}

	public void setTrainingBaseId(Long trainingBaseId) {
		this.trainingBaseId = trainingBaseId;
	}

	public Long getCourseYearId() {
		return courseYearId;
	}

	public void setCourseYearId(Long courseYearId) {
		this.courseYearId = courseYearId;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public Long getSpecialityId() {
		return specialityId;
	}

	public void setSpecialityId(Long specialityId) {
		this.specialityId = specialityId;
	}

	public Long getSemesterId() {
		return semesterId;
	}

	public void setSemesterId(Long semesterId) {
		this.semesterId = semesterId;
	}

	public Long getRegisterPeriodId() {
		return registerPeriodId;
	}

	public void setRegisterPeriodId(Long registerPeriodId) {
		this.registerPeriodId = registerPeriodId;
	}
	
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

	public EducationFeeConfigDto() {

	}

	public EducationFeeConfigDto(EducationFeeConfig ef) {
		this.id = ef.getId();
		this.code  = ef.getCode();
		this.name  = ef.getName();
		this.amount = ef.getAmount();
		this.type = ef.getType();
		this.educationProgramType = ef.getEducationProgramType();
		if(ef.getTrainingBase()!=null) {
			this.trainingBase  = new TrainingBaseDto();
			this.trainingBase.setId(ef.getTrainingBase().getId());
			this.trainingBase.setCode(ef.getTrainingBase().getCode());
			this.trainingBase.setName(ef.getTrainingBase().getName());
		}
		if(ef.getCourseYear()!=null) {
			this.courseYear  = new CourseYearDto();
			this.courseYear.setId(ef.getCourseYear().getId());
			this.courseYear.setCode(ef.getCourseYear().getCode());
			this.courseYear.setName(ef.getCourseYear().getName());
		}
		if(ef.getDepartment()!=null) {
			this.department  = new DepartmentDto();
			this.department.setId(ef.getDepartment().getId());
			this.department.setCode(ef.getDepartment().getCode());
			this.department.setName(ef.getDepartment().getName());
		}
		if (ef.getSpeciality() != null) {
			this.speciality = new SpecialityDto();
			this.speciality.setId(ef.getSpeciality().getId());
			this.speciality.setCode(ef.getSpeciality().getCode());
			this.speciality.setName(ef.getSpeciality().getName());
		}
		if (ef.getSemester() != null) {
			this.semester = new SemesterDto();
			this.semester.setId(ef.getSemester().getId());
			this.semester.setSemesterCode(ef.getSemester().getSemesterCode());
			this.semester.setSemesterName(ef.getSemester().getSemesterName());
		}
		if (ef.getRegisterPeriod() != null) {
			this.registerPeriod= new SemesterRegisterPeriodDto();
			this.registerPeriod.setId(ef.getRegisterPeriod().getId());
			this.registerPeriod.setDisplayOrder(ef.getRegisterPeriod().getDisplayOrder());
			this.registerPeriod.setName(ef.getRegisterPeriod().getName());
		}
	}
}
