package com.example.tool.edudto;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.globits.core.domain.BaseObject;
import com.globits.education.domain.StudentObject;
import com.globits.education.dto.StudentObjectDto;

/**
 * 
 */
public class StudentObjectPolicyDto extends BaseObject {	
	private static final long serialVersionUID = 7022133530201659729L;
	private Long id;
	
	private String name;	
	
	private String code;	
	
	private StudentObjectDto studentObject;
	
	private double discountValue;	
	
	private double discountPercent;	
	
	private String note;

	
	
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

	public StudentObjectDto getStudentObject() {
		return studentObject;
	}

	public void setStudentObject(StudentObjectDto studentObject) {
		this.studentObject = studentObject;
	}

	public double getDiscountValue() {
		return discountValue;
	}

	public void setDiscountValue(double discountValue) {
		this.discountValue = discountValue;
	}

	public double getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	
}
