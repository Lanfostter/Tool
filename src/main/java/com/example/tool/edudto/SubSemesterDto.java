package com.example.tool.edudto;

import java.io.Serializable;

import com.globits.education.domain.SubSemester;
import com.globits.education.dto.SemesterDto;

public class SubSemesterDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private SemesterDto semester;
	private Integer fromWeek;// Tuần bắt đầu
	private Integer toWeek;// Tuần kết thúc

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

	public Integer getFromWeek() {
		return fromWeek;
	}

	public void setFromWeek(Integer fromWeek) {
		this.fromWeek = fromWeek;
	}

	public Integer getToWeek() {
		return toWeek;
	}

	public void setToWeek(Integer toWeek) {
		this.toWeek = toWeek;
	}

	public SubSemesterDto() {

	}

	public SubSemesterDto(SubSemester sy) {
		this.fromWeek = sy.getFromWeek();
		this.toWeek = sy.getToWeek();
		if (sy.getSemester() != null)
			this.semester = new SemesterDto(sy.getSemester());
		this.id = sy.getId();
	}
}
