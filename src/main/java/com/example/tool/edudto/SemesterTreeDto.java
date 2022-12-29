package com.example.tool.edudto;

import java.io.Serializable;

import com.globits.education.domain.Semester;

public class SemesterTreeDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -991560624348607019L;
	
	private String id;
	private String parentId;
	private String name;
	private String description;
	
	public SemesterTreeDto(Semester semester) {
		if (semester == null) {
			return;
		}

		this.id = semester.getId().toString();
		this.name = semester.getSemesterName();
		this.description = semester.getDescription();
		if (semester.getParent() != null) {
			this.parentId = semester.getParent().getId().toString();
		} else {
			this.parentId = null;
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
