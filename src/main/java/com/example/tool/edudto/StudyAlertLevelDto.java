package com.example.tool.edudto;

import com.globits.education.domain.ExamSkill;
import com.globits.education.domain.StudyAlertLevel;

public class StudyAlertLevelDto {
	private Long id;
	private String name;
	private String code;
	
	private boolean isDuplicate;
	private String dupName;
	private String dupCode;
	private Integer level;
	private Integer studyAlertType;
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
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public boolean isDuplicate() {
		return isDuplicate;
	}
	public void setDuplicate(boolean isDuplicate) {
		this.isDuplicate = isDuplicate;
	}
	public String getDupName() {
		return dupName;
	}
	public void setDupName(String dupName) {
		this.dupName = dupName;
	}
	public String getDupCode() {
		return dupCode;
	}
	public void setDupCode(String dupCode) {
		this.dupCode = dupCode;
	}
	
	public Integer getStudyAlertType() {
		return studyAlertType;
	}
	public void setStudyAlertType(Integer studyAlertType) {
		this.studyAlertType = studyAlertType;
	}
	public StudyAlertLevelDto() {
		
	}
	
	public StudyAlertLevelDto( StudyAlertLevel entity) {
		this.name = entity.getName();
		this.code = entity.getCode();
		this.id = entity.getId();
		this.level = entity.getLevel();
		this.studyAlertType=entity.getStudyAlertType();
	}
}
