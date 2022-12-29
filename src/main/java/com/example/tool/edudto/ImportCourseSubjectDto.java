package com.example.tool.edudto;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import com.globits.education.dto.ImportCourseSubjectDto;

public class ImportCourseSubjectDto {
	private Integer maxStudent;
	private String courseSubjectCode;
	private String fullCourseSubjectCode;
	private String displayName;
	private String type;
	private String parentOrChild;
	private Hashtable<Integer,Hashtable<String,String>> timesTable = new Hashtable<Integer,Hashtable<String,String>>();
	private ImportCourseSubjectDto parent;
	private List<ImportCourseSubjectDto> childs = new ArrayList<ImportCourseSubjectDto>();
	public Integer getMaxStudent() {
		return maxStudent;
	}
	public void setMaxStudent(Integer maxStudent) {
		this.maxStudent = maxStudent;
	}
	public String getCourseSubjectCode() {
		return courseSubjectCode;
	}
	public void setCourseSubjectCode(String courseSubjectCode) {
		this.courseSubjectCode = courseSubjectCode;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}	
	
	public Hashtable<Integer, Hashtable<String, String>> getTimesTable() {
		return timesTable;
	}
	public void setTimesTable(Hashtable<Integer, Hashtable<String, String>> timesTable) {
		this.timesTable = timesTable;
	}
	public ImportCourseSubjectDto getParent() {
		return parent;
	}
	public void setParent(ImportCourseSubjectDto parent) {
		this.parent = parent;
	}
	public List<ImportCourseSubjectDto> getChilds() {
		return childs;
	}
	public void setChilds(List<ImportCourseSubjectDto> childs) {
		this.childs = childs;
	}
	public String getFullCourseSubjectCode() {
		return fullCourseSubjectCode;
	}
	public void setFullCourseSubjectCode(String fullCourseSubjectCode) {
		this.fullCourseSubjectCode = fullCourseSubjectCode;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getParentOrChild() {
		return parentOrChild;
	}
	public void setParentOrChild(String parentOrChild) {
		this.parentOrChild = parentOrChild;
	}
	
}
