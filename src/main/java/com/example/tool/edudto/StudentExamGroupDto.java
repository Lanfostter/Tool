package com.example.tool.edudto;

import com.globits.core.dto.BaseObjectDto;
import com.globits.education.dto.ExamRegisterPeriodDto;

public class StudentExamGroupDto extends BaseObjectDto{
	private ExamRegisterPeriodDto examPeriod;
	private String name;
	private String code;
	public ExamRegisterPeriodDto getExamPeriod() {
		return examPeriod;
	}
	public void setExamPeriod(ExamRegisterPeriodDto examPeriod) {
		this.examPeriod = examPeriod;
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
	public StudentExamGroupDto() {
		super();
	}
}
