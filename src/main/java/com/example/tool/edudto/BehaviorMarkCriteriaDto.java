package com.example.tool.edudto;

import java.io.Serializable;
import java.util.List;

import com.example.tool.edudto.CourseYearDto;
import com.example.tool.edudto.SemesterDto;
import com.globits.education.domain.BehaviorMarkCriteria;
import com.globits.education.dto.BehaviorMarkCriteriaDto;

public class BehaviorMarkCriteriaDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String code;
	private Double mark;
	private CourseYearDto courseYear;
	private SemesterDto semester;
	private BehaviorMarkCriteriaDto parent;
	private List<BehaviorMarkCriteriaDto> childs;
	
	public BehaviorMarkCriteriaDto getParent() {
		return parent;
	}
	public void setParent(BehaviorMarkCriteriaDto parent) {
		this.parent = parent;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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

	public Double getMark() {
		return mark;
	}
	public void setMark(Double mark) {
		this.mark = mark;
	}
	public CourseYearDto getCourseYear() {
		return courseYear;
	}
	public void setCourseYear(CourseYearDto courseYear) {
		this.courseYear = courseYear;
	}
	public SemesterDto getSemester() {
		return semester;
	}
	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}
		
	public List<BehaviorMarkCriteriaDto> getChilds() {
		return childs;
	}
	public void setChilds(List<BehaviorMarkCriteriaDto> childs) {
		this.childs = childs;
	}
	public BehaviorMarkCriteriaDto() {

	}

	public BehaviorMarkCriteriaDto(BehaviorMarkCriteria b) {
		this.id = b.getId();
		this.name = b.getName();
		this.code = b.getCode();
		this.mark = b.getMark();
		if(b.getParent() != null) {
			this.parent = new BehaviorMarkCriteriaDto();
			this.parent.setId(b.getParent().getId());
			this.parent.setName(b.getParent().getName());
			this.parent.setCode(b.getParent().getCode());
			this.parent.setMark(b.getParent().getMark());
		}
		if(b.getSemester() != null) {
			this.semester = new SemesterDto();
			this.semester.setId(b.getSemester().getId());
			this.semester.setSemesterName(b.getSemester().getSemesterName());
			this.semester.setSemesterCode(b.getSemester().getSemesterCode());
			this.semester.setOrdinalNumbers(b.getSemester().getOrdinalNumbers());
		}
		if(b.getCourseYear() != null) {
			this.courseYear = new CourseYearDto();
			this.courseYear.setId(b.getCourseYear().getId());
			this.courseYear.setName(b.getCourseYear().getName());
			this.courseYear.setCode(b.getCourseYear().getCode());
		}
	}
}
