package com.example.tool.edudto;

import java.io.Serializable;

import com.example.tool.edudto.CourseYearDto;
import com.example.tool.edudto.SchoolYearDto;
import com.example.tool.edudto.SemesterDto;
import com.globits.core.dto.DisciplineDto;
import com.globits.education.domain.BehaviorMarkClassificationStandard;
import com.globits.education.utils.EducationConstant;
import com.globits.education.utils.MarkUtil;

public class BehaviorMarkClassificationStandardDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private Double lowestMark;
	private Double highestMark;
	private CourseYearDto courseYear;
	private SemesterDto semester;
	private SchoolYearDto schoolYear;
	private DisciplineDto highestDiscipline;
	private Boolean isEndCourseYear;
	private Integer classification;//chú thích trong const sortmark
	private String classificationName=MarkUtil.convertClassificationToString(this.classification);
	private Integer numberStudent;
	private Double percent;//phần trăm
	private String name;
	public Double getLowestMark() {
		return lowestMark;
	}
	public void setLowestMark(Double lowestMark) {
		this.lowestMark = lowestMark;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getHighestMark() {
		return highestMark;
	}
	public void setHighestMark(Double highestMark) {
		this.highestMark = highestMark;
	}
	public Integer getClassification() {
		return classification;
	}
	public void setClassification(Integer classification) {
		this.classification = classification;
	}
	public String getClassificationName() {
			return classificationName;
	}
	public DisciplineDto getHighestDiscipline() {
		return highestDiscipline;
	}
	public void setHighestDiscipline(DisciplineDto highestDiscipline) {
		this.highestDiscipline = highestDiscipline;
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
	public SchoolYearDto getSchoolYear() {
		return schoolYear;
	}
	public void setSchoolYear(SchoolYearDto schoolYear) {
		this.schoolYear = schoolYear;
	}
	public Boolean getIsEndCourseYear() {
		return isEndCourseYear;
	}
	public void setIsEndCourseYear(Boolean isEndCourseYear) {
		this.isEndCourseYear = isEndCourseYear;
	}
	public Integer getNumberStudent() {
		return numberStudent;
	}
	public void setNumberStudent(Integer numberStudent) {
		this.numberStudent = numberStudent;
	}
	public Double getPercent() {
		return percent;
	}
	public void setPercent(Double percent) {
		this.percent = percent;
	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BehaviorMarkClassificationStandardDto() {
	}
	public BehaviorMarkClassificationStandardDto(BehaviorMarkClassificationStandard b) {
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
		if(b.getSchoolYear() != null) {
			this.schoolYear = new SchoolYearDto();
			this.schoolYear.setId(b.getSchoolYear().getId());
			this.schoolYear.setName(b.getSchoolYear().getName());
			this.schoolYear.setCode(b.getSchoolYear().getCode());
		}
		if(b.getHighestDiscipline() != null) {
			this.highestDiscipline = new DisciplineDto();
			this.highestDiscipline.setId(b.getHighestDiscipline().getId());
			this.highestDiscipline.setName(b.getHighestDiscipline().getName());
			this.highestDiscipline.setCode(b.getHighestDiscipline().getCode());
		}
		this.id = b.getId();
		this.lowestMark = b.getLowestMark();
		this.highestMark = b.getHighestMark();
		this.isEndCourseYear = b.getIsEndCourseYear();
		this.classification = b.getClassification();
	}
}
