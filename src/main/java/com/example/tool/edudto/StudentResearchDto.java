package com.example.tool.edudto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.JoinColumn;

import com.globits.education.domain.StudentResearch;
import com.globits.education.dto.SchoolYearDto;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.StudentDto;

public class StudentResearchDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long Id;

	private StudentDto student; // Sinh viên
	private SemesterDto semester; // Học kỳ
	@JoinColumn(name = "department_type")
	private Integer departmentType;// loại

	@Column(name = "level")
	private Integer level;// cấp
	@Column(name = "won")
	private Integer won;// đạt giải
	@Column(name = "content")
	private String content;// nội dung

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

	public SemesterDto getSemester() {
		return semester;
	}

	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}

	public Integer getDepartmentType() {
		return departmentType;
	}

	public void setDepartmentType(Integer departmentType) {
		this.departmentType = departmentType;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getWon() {
		return won;
	}

	public void setWon(Integer won) {
		this.won = won;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public StudentResearchDto() {

	}

	public StudentResearchDto(StudentResearch sr) {
		if(sr != null) {
			this.Id = sr.getId();
			this.content = sr.getContent();
			this.departmentType = sr.getDepartmentType();
			this.level = sr.getLevel();
			this.won = sr.getWon();
	
			if (sr.getSemester() != null) {
				SemesterDto semesterDto = new SemesterDto();
				semesterDto.setId(sr.getSemester().getId());
				semesterDto.setDescription(sr.getSemester().getDescription());
				semesterDto.setSemesterCode(sr.getSemester().getSemesterCode());
				semesterDto.setSemesterName(sr.getSemester().getSemesterName());
				semesterDto.setStartDate(sr.getSemester().getStartDate());
				semesterDto.setEndDate(sr.getSemester().getEndDate());
				semesterDto.setYear(sr.getSemester().getYear());
				semesterDto.setSchoolYear(new SchoolYearDto(sr.getSemester().getSchoolYear()));
				if(semesterDto != null) {
					this.setSemester(semesterDto);
				}
			}
	
			if (sr.getStudent() != null) {
				StudentDto stuDto = new StudentDto();
				stuDto.setId(sr.getStudent().getId());
				stuDto.setDisplayName(sr.getStudent().getDisplayName());
				stuDto.setStudentCode(sr.getStudent().getStudentCode());
				stuDto.setBirthDate(sr.getStudent().getBirthDate());
				stuDto.setBirthPlace(sr.getStudent().getBirthPlace());
				stuDto.setGender(sr.getStudent().getGender());
				if(stuDto != null) {
					this.setStudent(stuDto);
				}
			}
		}
	}

}
