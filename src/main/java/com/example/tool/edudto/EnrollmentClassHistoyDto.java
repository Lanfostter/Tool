package com.example.tool.edudto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

import com.globits.core.domain.TrainingBase;
import com.globits.core.dto.DepartmentDto;
import com.globits.core.dto.TrainingBaseDto;
import com.globits.education.domain.CourseYear;
import com.globits.education.domain.EducationProgram;
import com.globits.education.domain.EnrollmentClass;
import com.globits.education.domain.EnrollmentClassHistory;
import com.globits.education.domain.Student;
import com.globits.education.dto.EnrollmentClassDto;
import com.globits.education.dto.StudentDto;
import com.globits.hr.dto.StaffDto;

@XmlRootElement
public class EnrollmentClassHistoyDto implements Serializable {
	private static final long serialVersionUID = 5405782142010466260L;
	private Long id;
	private EnrollmentClassDto enrollmentClass;//lớp mới
	private StudentDto student;
	private Date dateModify;//Thời điểm thay đổi
	private String userModify;//Người thay đổi
	private EnrollmentClassDto enrollmentClassOld;//Lớp cũ
	private String nameOld;//tên lớp cũ
	private String name;//tên lớp mới
	private String reason;//lý do

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public EnrollmentClassDto getEnrollmentClass() {
		return enrollmentClass;
	}

	public void setEnrollmentClass(EnrollmentClassDto enrollmentClass) {
		this.enrollmentClass = enrollmentClass;
	}

	public StudentDto getStudent() {
		return student;
	}

	public void setStudent(StudentDto student) {
		this.student = student;
	}

	public Date getDateModify() {
		return dateModify;
	}

	public void setDateModify(Date dateModify) {
		this.dateModify = dateModify;
	}

	public String getUserModify() {
		return userModify;
	}

	public void setUserModify(String userModify) {
		this.userModify = userModify;
	}

	public EnrollmentClassDto getEnrollmentClassOld() {
		return enrollmentClassOld;
	}

	public void setEnrollmentClassOld(EnrollmentClassDto enrollmentClassOld) {
		this.enrollmentClassOld = enrollmentClassOld;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getNameOld() {
		return nameOld;
	}

	public void setNameOld(String nameOld) {
		this.nameOld = nameOld;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EnrollmentClassHistoyDto() {

	}

	public EnrollmentClassHistoyDto(EnrollmentClassHistory enrollmentClass) {
		if (enrollmentClass != null) {			
			this.id = enrollmentClass.getId();
			this.dateModify=enrollmentClass.getDateModify();
			this.userModify=enrollmentClass.getUserModify();
			this.reason=enrollmentClass.getReason();			
			if(enrollmentClass.getStudent()!=null) {
				this.student=new StudentDto();
				this.student.setId(enrollmentClass.getStudent().getId());
				this.student.setStudentCode(enrollmentClass.getStudent().getStudentCode());
				this.student.setDisplayName(enrollmentClass.getStudent().getDisplayName());
			}
			if(enrollmentClass.getEnrollmentClass()!=null) {
				this.name=enrollmentClass.getEnrollmentClass().getClassName();
				this.enrollmentClass=new EnrollmentClassDto();
				this.enrollmentClass.setId(enrollmentClass.getEnrollmentClass().getId());
				this.enrollmentClass.setClassCode(enrollmentClass.getEnrollmentClass().getClassCode());
				this.enrollmentClass.setClassName(enrollmentClass.getEnrollmentClass().getClassName());
				if(enrollmentClass.getEnrollmentClass().getCourseyear()!=null) {
					this.name= this.name+ " "+ enrollmentClass.getEnrollmentClass().getCourseyear().getName();
				}if(enrollmentClass.getEnrollmentClass().getSpeciality()!=null) {
					this.name= this.name+ "_"+ enrollmentClass.getEnrollmentClass().getSpeciality().getName();
				}if(enrollmentClass.getEnrollmentClass().getSpeciality()!=null) {
					this.name= this.name+ "_"+ enrollmentClass.getEnrollmentClass().getClassName();
				}
			}
			if(enrollmentClass.getEnrollmentClassOld()!=null) {
				this.enrollmentClassOld=new EnrollmentClassDto();
				this.enrollmentClassOld.setId(enrollmentClass.getEnrollmentClassOld().getId());
				this.enrollmentClassOld.setClassCode(enrollmentClass.getEnrollmentClassOld().getClassCode());
				this.enrollmentClassOld.setClassName(enrollmentClass.getEnrollmentClassOld().getClassName());
				this.nameOld=enrollmentClass.getEnrollmentClassOld().getClassName();
				if(enrollmentClass.getEnrollmentClassOld().getCourseyear()!=null) {
					this.nameOld= this.nameOld+ " "+ enrollmentClass.getEnrollmentClassOld().getCourseyear().getName();
				}if(enrollmentClass.getEnrollmentClassOld().getSpeciality()!=null) {
					this.nameOld= this.nameOld+ "_"+ enrollmentClass.getEnrollmentClassOld().getSpeciality().getName();
				}if(enrollmentClass.getEnrollmentClassOld().getSpeciality()!=null) {
					this.nameOld= this.nameOld+ "_"+ enrollmentClass.getEnrollmentClassOld().getClassName();
				}
			}
			
		}
	}
	
	
}
