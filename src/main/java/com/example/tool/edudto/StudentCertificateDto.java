package com.example.tool.edudto;

import java.io.Serializable;
import java.util.Date;

import com.globits.education.domain.Student;
import com.globits.education.domain.StudentCertificate;
import com.globits.education.dto.CertificateDto;
import com.globits.education.dto.ClassificationDto;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.StudentDto;

public class StudentCertificateDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private StudentDto student;
	private CertificateDto certificate;
	private ClassificationDto classification;
	private SemesterDto semester;
	private double mark;
	private String note;
	private Date dateOfSigningDecisive; // ngày ký quyết định
	private Integer numberOfDecisive; //số quyết định
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public StudentDto getStudent() {
		return student;
	}
	public void setStudent(StudentDto student) {
		this.student = student;
	}
	public CertificateDto getCertificate() {
		return certificate;
	}
	public void setCertificate(CertificateDto certificate) {
		this.certificate = certificate;
	}
	public ClassificationDto getClassification() {
		return classification;
	}
	public void setClassification(ClassificationDto classification) {
		this.classification = classification;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}

	public SemesterDto getSemester() {
		return semester;
	}
	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	public Date getDateOfSigningDecisive() {
		return dateOfSigningDecisive;
	}
	public void setDateOfSigningDecisive(Date dateOfSigningDecisive) {
		this.dateOfSigningDecisive = dateOfSigningDecisive;
	}
	public Integer getNumberOfDecisive() {
		return numberOfDecisive;
	}
	public void setNumberOfDecisive(Integer numberOfDecisive) {
		this.numberOfDecisive = numberOfDecisive;
	}
	
	public StudentCertificateDto() {

	}
	
	public StudentCertificateDto(StudentCertificate certificateInput) {
		if (certificateInput != null) {
			this.id = certificateInput.getId();
			this.note = certificateInput.getNote();
			this.mark = certificateInput.getMark();
			this.dateOfSigningDecisive = certificateInput.getDateOfSigningDecisive();
			this.numberOfDecisive = certificateInput.getNumberOfDecisive();
			
			if (certificateInput.getSemester() != null) {
				this.semester = new SemesterDto(certificateInput.getSemester().getId(),certificateInput.getSemester().getSemesterName(),certificateInput.getSemester().getSemesterCode());
			}

			if (certificateInput.getStudent() != null) {
				this.student = new StudentDto(certificateInput.getStudent(),true);
			}
			if (certificateInput.getCertificate() != null) {
				this.certificate = new CertificateDto(certificateInput.getCertificate());
			}
			if(certificateInput.getClassification()!=null) {
				this.classification = new ClassificationDto(certificateInput.getClassification());
			}
		}
	}

	public StudentCertificateDto(StudentCertificate entity, Student student) {
		if(student!=null) {
			this.student = new StudentDto();
			this.student.setId(student.getId());
			this.student.setStudentCode(student.getStudentCode());
			this.student.setDisplayName(student.getDisplayName());
			this.student.setBankAccount(student.getBankAccount());
			if(student.getEnrollmentClass()!=null) {
				this.student.setClassName(student.getEnrollmentClass().getClassName());
				if(student.getEnrollmentClass().getSpeciality()!=null) {
					this.student.setSpeciality(student.getEnrollmentClass().getSpeciality().getName());
				}
				if(student.getEnrollmentClass().getDepartment()!=null) {
					this.student.setDepartment(student.getEnrollmentClass().getDepartment().getName());
				}
				if(student.getEnrollmentClass().getCourseyear()!=null) {
					this.student.setCourseYear(student.getEnrollmentClass().getCourseyear().getName());
				}
			}
			
		}
		
		if (entity != null) {
			this.id = entity.getId();
			this.note = entity.getNote();
			this.mark = entity.getMark();
			this.dateOfSigningDecisive = entity.getDateOfSigningDecisive();
			this.numberOfDecisive = entity.getNumberOfDecisive();
			
			if(entity.getSemester()!=null) {
				this.semester = new SemesterDto();
				this.semester.setId(entity.getSemester().getId());
				this.semester.setSemesterCode(entity.getSemester().getSemesterCode());
				this.semester.setSemesterName(entity.getSemester().getSemesterName());
			}
			if (entity.getCertificate() != null) {
				this.certificate = new CertificateDto();
				this.certificate.setId(entity.getCertificate().getId());
				this.certificate.setName(entity.getCertificate().getName());
				this.certificate.setCode(entity.getCertificate().getCode());
				this.certificate.setPlaceOfIssue(entity.getCertificate().getPlaceOfIssue());
			}
			if (entity.getClassification() != null) {
				this.classification = new ClassificationDto();
				this.classification.setId(entity.getClassification().getId());
				this.classification.setName(entity.getClassification().getName());
				this.classification.setCode(entity.getClassification().getCode());
				this.classification.setLevel(entity.getClassification().getLevel());
			}
		}
		
	}
	
}
