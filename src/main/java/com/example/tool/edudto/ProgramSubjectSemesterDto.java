package com.example.tool.edudto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.globits.education.domain.EquivalentSubject;
import com.globits.education.domain.GroupSubjectProgram;
import com.globits.education.domain.PrerequisiteSubject;
import com.globits.education.domain.ProgramSubject;
import com.globits.education.domain.ProgramSubjectSemester;
import com.globits.education.domain.Semester;
import com.globits.education.dto.EducationProgramDto;
import com.globits.education.dto.ProgramSubjectDto;
import com.globits.education.dto.SemesterDto;

public class ProgramSubjectSemesterDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private ProgramSubjectDto programSubject;	
	private SemesterDto semester;
	private Double tuitionCoefficient;
	private Double feePerCredit;
	
	private Boolean checked;
	
	public Double getFeePerCredit() {
		return feePerCredit;
	}

	public void setFeePerCredit(Double feePerCredit) {
		this.feePerCredit = feePerCredit;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ProgramSubjectDto getProgramSubject() {
		return programSubject;
	}

	public void setProgramSubject(ProgramSubjectDto programSubject) {
		this.programSubject = programSubject;
	}

	public SemesterDto getSemester() {
		return semester;
	}

	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}

	
	public Double getTuitionCoefficient() {
		return tuitionCoefficient;
	}

	public void setTuitionCoefficient(Double tuitionCoefficient) {
		this.tuitionCoefficient = tuitionCoefficient;
	}	

	public Boolean getChecked() {
		return checked;
	}

	public void setChecked(Boolean checked) {
		this.checked = checked;
	}

	public ProgramSubjectSemesterDto() {

	}

	public ProgramSubjectSemesterDto(ProgramSubjectSemester ps) {
		if(ps != null) {
			this.tuitionCoefficient = ps.getTuitionCoefficient();
			this.feePerCredit = ps.getFeePerCredit();			
			this.id = ps.getId();			
			if (ps.getProgramSubject() != null) {
				this.programSubject = new ProgramSubjectDto();
				this.programSubject.setId(ps.getProgramSubject().getId());
				this.programSubject.setProgram(new EducationProgramDto());
				this.programSubject.getProgram().setId(ps.getProgramSubject().getProgram().getId());
				this.programSubject.getProgram().setCode(ps.getProgramSubject().getProgram().getCode());
				this.programSubject.getProgram().setName(ps.getProgramSubject().getProgram().getName());
			}
			
			if (ps.getSemester() != null) {
				this.semester = new SemesterDto();				
				this.semester.setId(ps.getSemester().getId());
				this.semester.setSemesterCode(ps.getSemester().getSemesterCode());
				this.semester.setSemesterName(ps.getSemester().getSemesterName());				
			}
			
		}
	}
}
