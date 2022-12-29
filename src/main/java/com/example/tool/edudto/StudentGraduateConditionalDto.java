package com.example.tool.edudto;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.globits.core.dto.BaseObjectDto;
import com.globits.core.utils.NumberUtils;
import com.globits.education.domain.CriteriaSearchStudent;
import com.globits.education.domain.EducationProgram;
import com.globits.education.domain.ScholarshipFund;
import com.globits.education.domain.StudentGraduateConditional;
import com.globits.education.domain.StudentSemesterScholarship;
import com.globits.education.dto.CriteriaSearchStudentDto;
import com.globits.education.dto.EducationProgramDto;
import com.globits.education.dto.view.ViewSimpleStudentDto;

public class StudentGraduateConditionalDto extends BaseObjectDto{
	private static final long serialVersionUID = 361898697906916508L;
	private Long id;
	private ViewSimpleStudentDto student;
	private CriteriaSearchStudentDto criteria;
	private Boolean isLock;
	private Integer status;
	private Double mark;
	private Double mark4;
	private Integer numberOfCredit;// Số lượng tín chỉ
	private String className;
	private EducationProgramDto educationProgram;
	
	public ViewSimpleStudentDto getStudent() {
		return student;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setStudent(ViewSimpleStudentDto student) {
		this.student = student;
	}
		
	public CriteriaSearchStudentDto getCriteria() {
		return criteria;
	}
	public void setCriteria(CriteriaSearchStudentDto criteria) {
		this.criteria = criteria;
	}
	public Boolean getIsLock() {
		return isLock;
	}
	public void setIsLock(Boolean isLock) {
		this.isLock = isLock;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public Double getMark() {
//		return mark;
		return NumberUtils.round(mark,2);
	}
	public void setMark(Double mark) {
		this.mark = mark;
	}
	public Double getMark4() {
//		return mark4;
		return NumberUtils.round(mark4,2);
	}
	public void setMark4(Double mark4) {
		this.mark4 = mark4;
	}
	public Integer getNumberOfCredit() {
		return numberOfCredit;
	}
	public void setNumberOfCredit(Integer numberOfCredit) {
		this.numberOfCredit = numberOfCredit;
	}
	
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	public EducationProgramDto getEducationProgram() {
		return educationProgram;
	}
	public void setEducationProgram(EducationProgramDto educationProgram) {
		this.educationProgram = educationProgram;
	}
	public StudentGraduateConditionalDto() {
		
	}
	public StudentGraduateConditionalDto(StudentGraduateConditional entity) {
		if(entity!=null) {
			this.id = entity.getId();
			
			if(entity.getStudent() != null) {
				this.student = new ViewSimpleStudentDto();
				this.student.setId(entity.getStudent().getId());
				this.student.setDisplayName(entity.getStudent().getDisplayName());
				this.student.setStudentCode(entity.getStudent().getStudentCode());
				this.student.setDisplayNameCode(entity.getStudent().getDisplayName() + " - " + entity.getStudent().getStudentCode());
				if(entity.getStudent().getEnrollmentClass() != null) {
					this.className = entity.getStudent().getEnrollmentClass().getClassName();
				}
			}
			if(entity.getCriteria() != null) {
				this.criteria = new CriteriaSearchStudentDto(entity.getCriteria());				
			}
			
			this.isLock=entity.getIsLock();
			this.status=entity.getStatus();
			this.mark=entity.getMark();
			this.mark4=entity.getMark4();
			this.numberOfCredit=entity.getNumberOfCredit();
			if(entity.getEducationProgram()!=null) {
				this.educationProgram=new EducationProgramDto();
				this.educationProgram.setId(entity.getEducationProgram().getId());
				this.educationProgram.setCode(entity.getEducationProgram().getCode());
				this.educationProgram.setName(entity.getEducationProgram().getName());
			}
					
		}
	}
}
