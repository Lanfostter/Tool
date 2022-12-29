package com.example.tool.edudto;

import java.io.Serializable;

import com.globits.education.domain.ScholarshipFundType;

public class ScholarshipFundTypeDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String code;
	private String description;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ScholarshipFundTypeDto() {

	}

	public ScholarshipFundTypeDto(ScholarshipFundType sy) {
		this.description = sy.getDescription();
		this.code = sy.getCode();
		this.name = sy.getName();
		this.id = sy.getId();
	}
}
