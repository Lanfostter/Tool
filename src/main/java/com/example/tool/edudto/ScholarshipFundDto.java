package com.example.tool.edudto;

import java.io.Serializable;

import com.globits.education.domain.ScholarshipFund;
import com.globits.education.dto.ScholarshipFundTypeDto;

public class ScholarshipFundDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String code;
	private String description;
	private int type; // loại
	private ScholarshipFundTypeDto fund;

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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public ScholarshipFundTypeDto getFund() {
		return fund;
	}

	public void setFund(ScholarshipFundTypeDto fund) {
		this.fund = fund;
	}

	public ScholarshipFundDto() {

	}

	public ScholarshipFundDto(ScholarshipFund sy) {
		this.description = sy.getDesciption();
		this.code = sy.getCode();
		this.name = sy.getName();
		this.id = sy.getId();
		this.type = sy.getType();
		if (sy.getFund() != null) {
			this.fund = new ScholarshipFundTypeDto(sy.getFund());
		}
	}
}
