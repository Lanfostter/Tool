package com.example.tool.edudto;

import java.io.Serializable;

import com.globits.core.domain.Department;

public class DepartmentTreeDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -991560624348607019L;
	
	private String id;
	private String parentId;
	private String name;
	private String code;
	
	public DepartmentTreeDto(Department department) {
		if (department == null) {
			return;
		}

		this.id = department.getId().toString();
		this.name = department.getName();
		this.code = department.getCode();
		if (department.getParent() != null) {
			this.parentId = department.getParent().getId().toString();
		} else {
			this.parentId = null;
		}
	}

	public String getId() {
		return id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
}
