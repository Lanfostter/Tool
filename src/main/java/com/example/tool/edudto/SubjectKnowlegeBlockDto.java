package com.example.tool.edudto;

import java.util.ArrayList;
import java.util.List;

import com.globits.education.domain.ProgramSubject;
import com.globits.education.dto.KnowledgeProgramDto;
import com.globits.education.dto.ProgramSubjectDto;

public class SubjectKnowlegeBlockDto {
	private int level;//=-1=> môn học, = 0 => Block root, =1 => block level 1, ...
	private String name;
	private String code;
	private String englishName;
	private int semesterIndex;
	private int totalNumberCredit;
	private List<Integer> semesters = new ArrayList<Integer>();
	private List<KnowledgeProgramDto> knowledgeProgram;
	private List<ProgramSubjectDto> programSubject;
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
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
	public String getEnglishName() {
		return englishName;
	}
	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}
	public int getSemesterIndex() {
		return semesterIndex;
	}
	public void setSemesterIndex(int semesterIndex) {
		this.semesterIndex = semesterIndex;
	}
	public int getTotalNumberCredit() {
		return totalNumberCredit;
	}
	public void setTotalNumberCredit(int totalNumberCredit) {
		this.totalNumberCredit = totalNumberCredit;
	}
	public List<Integer> getSemesters() {
		return semesters;
	}
	public void setSemesters(List<Integer> semesters) {
		this.semesters = semesters;
	}
	public List<KnowledgeProgramDto> getKnowledgeProgram() {
		return knowledgeProgram;
	}
	public void setKnowledgeProgram(List<KnowledgeProgramDto> knowledgeProgram) {
		this.knowledgeProgram = knowledgeProgram;
	}
	public List<ProgramSubjectDto> getProgramSubject() {
		return programSubject;
	}
	public void setProgramSubject(List<ProgramSubjectDto> programSubject) {
		this.programSubject = programSubject;
	}
	
}
