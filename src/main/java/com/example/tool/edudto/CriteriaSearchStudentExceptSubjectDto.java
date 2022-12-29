package com.example.tool.edudto;

import java.util.Set;

import com.globits.education.domain.CriteriaSearchStudent;
import com.globits.education.domain.CriteriaSearchStudentExceptSubject;
import com.globits.education.domain.Subject;
import com.globits.education.dto.SubjectDto;

public class CriteriaSearchStudentExceptSubjectDto {
	private Long id;
	
	private SubjectDto subject;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public SubjectDto getSubject() {
		return subject;
	}
	public void setSubject(SubjectDto subject) {
		this.subject = subject;
	}
	
}
