package com.example.tool.edudto;

import java.io.Serializable;

import com.globits.education.domain.Classification;

public class ClassificationDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String code;
	private Integer level;
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
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}

	public ClassificationDto() {

	}

	public ClassificationDto(Classification c) {
		this.id = c.getId();
		this.name = c.getName();
		this.code = c.getCode();
		this.level = c.getLevel();
	}
}
