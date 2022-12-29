package com.example.tool.edudto;

import com.globits.education.domain.SchoolYear;
import com.globits.education.domain.Semester;
import com.globits.education.dto.TeachingVolumeDto;
import com.globits.hr.domain.Staff;

public class TeachingVolumeDto {
	private Long staffId;
	private String staffName;
	private String staffCode;
	private Long schoolYearId;
	private String schoolYearName;
	private String schoolYearCode;
	private Long semesterId;
	private String semesterName;
	private String semesterCode;
	private Double numberHours;
	
	public Long getStaffId() {
		return staffId;
	}
	public void setStaffId(Long staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffCode() {
		return staffCode;
	}
	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}
	public Long getSchoolYearId() {
		return schoolYearId;
	}
	public void setSchoolYearId(Long schoolYearId) {
		this.schoolYearId = schoolYearId;
	}
	public String getSchoolYearName() {
		return schoolYearName;
	}
	public void setSchoolYearName(String schoolYearName) {
		this.schoolYearName = schoolYearName;
	}
	public String getSchoolYearCode() {
		return schoolYearCode;
	}
	public void setSchoolYearCode(String schoolYearCode) {
		this.schoolYearCode = schoolYearCode;
	}
	public Long getSemesterId() {
		return semesterId;
	}
	public void setSemesterId(Long semesterId) {
		this.semesterId = semesterId;
	}
	public String getSemesterName() {
		return semesterName;
	}
	public void setSemesterName(String semesterName) {
		this.semesterName = semesterName;
	}
	public String getSemesterCode() {
		return semesterCode;
	}
	public void setSemesterCode(String semesterCode) {
		this.semesterCode = semesterCode;
	}
	public Double getNumberHours() {
		return numberHours;
	}
	public void setNumberHours(Double numberHours) {
		this.numberHours = numberHours;
	}
	public TeachingVolumeDto() {
		
	}
	public TeachingVolumeDto(Double numberHours,Long teacherId) {
		this.staffId = teacherId;
		this.numberHours = numberHours;
	}
	public TeachingVolumeDto(Double numberHours,Staff staff) {
		this.staffId = staff.getId();
		this.numberHours = numberHours;
		this.staffCode = staff.getStaffCode();
		this.staffName = staff.getDisplayName();
	}
	public TeachingVolumeDto(TeachingVolumeDto teachingVolumeDto,SchoolYear schoolYear,Semester semester) {
		if(teachingVolumeDto!=null) {
			this.staffId = teachingVolumeDto.staffId;
			this.numberHours = teachingVolumeDto.numberHours;
			this.staffCode = teachingVolumeDto.staffCode;
			this.staffName = teachingVolumeDto.staffName;
		}		
		if(semester!=null) {
			this.semesterCode = semester.getSemesterCode();
			this.semesterId = semester.getId();
			this.semesterName = semester.getSemesterName();
		}		
		if(schoolYear!=null) {
			this.schoolYearId = schoolYear.getId();
			this.schoolYearCode = schoolYear.getCode();
			this.schoolYearName = schoolYear.getName();
		}		
	}
}
