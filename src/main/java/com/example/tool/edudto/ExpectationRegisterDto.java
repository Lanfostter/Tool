package com.example.tool.edudto;

import java.io.Serializable;
import com.globits.education.domain.ExpectationRegister;
import com.globits.education.dto.CourseYearDto;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.SemesterRegisterPeriodDto;
import com.globits.education.dto.SubjectDto;

public class ExpectationRegisterDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	private String code;

	private SemesterDto semester;
	
	private SemesterRegisterPeriodDto periodDto;
	
	private SubjectDto subject;
	
	private CourseYearDto courseYear;
	
	private Integer type;
	
	private Double fee;
	
	private boolean isRegisted;
	
//	private Set<StudentExpectationRegisterDto> studentExpectationRegister;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public SemesterDto getSemester() {
		return semester;
	}

	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}

	public SemesterRegisterPeriodDto getPeriodDto() {
		return periodDto;
	}

	public void setPeriodDto(SemesterRegisterPeriodDto periodDto) {
		this.periodDto = periodDto;
	}

	public SubjectDto getSubject() {
		return subject;
	}

	public void setSubject(SubjectDto subject) {
		this.subject = subject;
	}

	public CourseYearDto getCourseYear() {
		return courseYear;
	}

	public void setCourseYear(CourseYearDto courseYear) {
		this.courseYear = courseYear;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	

	public boolean getIsRegisted() {
		return isRegisted;
	}

	public void setIsRegisted(boolean isRegisted) {
		this.isRegisted = isRegisted;
	}

	public ExpectationRegisterDto() {
		super();
	}
	
	public ExpectationRegisterDto(ExpectationRegister expectationRegister) {
		if(expectationRegister != null) {
			this.id = expectationRegister.getId();
			this.code = expectationRegister.getCode();
			this.fee = expectationRegister.getFee();
			if(expectationRegister.getSemester() != null) {
				SemesterDto semesterDto = new SemesterDto();
				semesterDto.setId(expectationRegister.getSemester().getId());
				semesterDto.setSemesterName(expectationRegister.getSemester().getSemesterName());
				semesterDto.setSemesterCode(expectationRegister.getSemester().getSemesterCode());
				this.setSemester(semesterDto);
			}
			if(expectationRegister.getPeriod() != null) {
				this.periodDto = new SemesterRegisterPeriodDto(expectationRegister.getPeriod(),true);				
			}
			if(expectationRegister.getSubject() != null) {
				SubjectDto subjectDto = new SubjectDto();
				subjectDto.setId(expectationRegister.getSubject().getId());
				subjectDto.setSubjectName(expectationRegister.getSubject().getSubjectName());
				subjectDto.setSubjectCode(expectationRegister.getSubject().getSubjectCode());
				subjectDto.setNumberOfCredit(expectationRegister.getSubject().getNumberOfCredit());
				this.setSubject(subjectDto);
			}
			if(expectationRegister.getCourseYear() != null) {
				CourseYearDto courseYearDto = new CourseYearDto();
				courseYearDto.setId(expectationRegister.getCourseYear().getId());
				courseYearDto.setName(expectationRegister.getCourseYear().getName());
				courseYearDto.setCode(expectationRegister.getCourseYear().getCode());
				this.setCourseYear(courseYearDto);
			}
			this.type = expectationRegister.getType();
			
		}
	}

}
