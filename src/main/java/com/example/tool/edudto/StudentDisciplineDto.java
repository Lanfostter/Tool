package com.example.tool.edudto;

import java.io.Serializable;
import java.util.Date;

import com.globits.core.dto.DisciplineDto;
import com.globits.education.domain.Semester;
import com.globits.education.domain.StudentDiscipline;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.StudentDto;

public class StudentDisciplineDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long Id;

	private StudentDto student; // Sinh viên
	private DisciplineDto discipline; // Kỷ luật
	private String reason; // Lý do
	private Date decisionDate; // Ngày quyết định

	private SemesterDto semester; // Học kỳ
	private SemesterDto endSemester; // Học kỳ kết thúc
	private Date endDate; // Ngày kết thúc 
	private String code;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public StudentDto getStudent() {
		return student;
	}

	public void setStudent(StudentDto student) {
		this.student = student;
	}

	public DisciplineDto getDiscipline() {
		return discipline;
	}

	public void setDiscipline(DisciplineDto discipline) {
		this.discipline = discipline;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public SemesterDto getSemester() {
		return semester;
	}

	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}

	public Date getDecisionDate() {
		return decisionDate;
	}

	public void setDecisionDate(Date decisionDate) {
		this.decisionDate = decisionDate;
	}
	

	public SemesterDto getEndSemester() {
		return endSemester;
	}

	public void setEndSemester(SemesterDto endSemester) {
		this.endSemester = endSemester;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public StudentDisciplineDto() {

	}

	public StudentDisciplineDto(StudentDiscipline sr) {
		this.Id = sr.getId();
		this.decisionDate = sr.getDecisionDate();
		this.reason = sr.getReason();
		if (sr.getDiscipline() != null) {
			this.discipline = new DisciplineDto(sr.getDiscipline());
		}
		if (sr.getSemester() != null) {
			this.semester = new SemesterDto(sr.getSemester());
		}
		if (sr.getStudent() != null) {
			this.student = new StudentDto(sr.getStudent());
		}
		if(sr.getEndSemester()!=null) {
			this.endSemester=new SemesterDto(sr.getEndSemester());
		}
		this.endDate=sr.getEndDate();
		this.code = sr.getCode();
	}

}
