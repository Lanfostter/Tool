package com.example.tool.edudto;

import org.springframework.web.bind.annotation.PathVariable;

public class SearchDTO {
	private Long studentId;
	private Long periodId;
	private Long courseSubjectId;
	private String keyword;
	private String studentName;
	private String studentCode;
	private String courseSubject;
	private Boolean isSync;
	private Boolean isDeleted;
	private Integer pageIndex; 
	private Integer pageSize;
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public Long getPeriodId() {
		return periodId;
	}
	public void setPeriodId(Long periodId) {
		this.periodId = periodId;
	}
	public Long getCourseSubjectId() {
		return courseSubjectId;
	}
	public void setCourseSubjectId(Long courseSubjectId) {
		this.courseSubjectId = courseSubjectId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCode() {
		return studentCode;
	}
	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}
	public String getCourseSubject() {
		return courseSubject;
	}
	public void setCourseSubject(String courseSubject) {
		this.courseSubject = courseSubject;
	}
	public Boolean getIsSync() {
		return isSync;
	}
	public void setIsSync(Boolean isSync) {
		this.isSync = isSync;
	}
	public Boolean getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	public Integer getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	

	
}
