package com.example.tool.edudto;

import java.util.Date;

import javax.jdo.annotations.Column;

import com.globits.education.domain.Student;
import com.globits.education.domain.StudentOtherFee;

public class StudentOtherFeeDto {
	private Long id;
	private Long studentId;
	private double creditAmount;// Số tiền nộp vào từ trước
	private double debitAmount;// Số tiền ghi nợ (bị phạt sách)
	private double returnAmount;// Số tiền trả lại sinh viên
	private double additional;// tiền thu bổ sung
	private Date voucherDate;
	private String studentCode;
	private String studentName;
	private String className;
	private Integer voucherType;
	private String note;
	private String code;
	private int orderNumber;
	private Long semesterId;
	private String semesterCode;
	private String createdBy;
	private Date birthDate;
	private String gender;
	private Long trainingBaseId;
	private String trainingBaseCode;
	private String trainingBaseName;

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getSemesterId() {
		return semesterId;
	}

	public void setSemesterId(Long semesterId) {
		this.semesterId = semesterId;
	}

	public String getSemesterCode() {
		return semesterCode;
	}

	public void setSemesterCode(String semesterCode) {
		this.semesterCode = semesterCode;
	}

	public double getAdditional() {
		return additional;
	}

	public void setAdditional(double additional) {
		this.additional = additional;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public double getCreditAmount() {
		return creditAmount;
	}

	public void setCreditAmount(double creditAmount) {
		this.creditAmount = creditAmount;
	}

	public double getDebitAmount() {
		return debitAmount;
	}

	public void setDebitAmount(double debitAmount) {
		this.debitAmount = debitAmount;
	}

	public double getReturnAmount() {
		return returnAmount;
	}

	public void setReturnAmount(double returnAmount) {
		this.returnAmount = returnAmount;
	}

	public Date getVoucherDate() {
		return voucherDate;
	}

	public void setVoucherDate(Date voucherDate) {
		this.voucherDate = voucherDate;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Integer getVoucherType() {
		return voucherType;
	}

	public void setVoucherType(Integer voucherType) {
		this.voucherType = voucherType;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	public Long getTrainingBaseId() {
		return trainingBaseId;
	}

	public void setTrainingBaseId(Long trainingBaseId) {
		this.trainingBaseId = trainingBaseId;
	}

	public String getTrainingBaseCode() {
		return trainingBaseCode;
	}

	public void setTrainingBaseCode(String trainingBaseCode) {
		this.trainingBaseCode = trainingBaseCode;
	}

	public String getTrainingBaseName() {
		return trainingBaseName;
	}

	public void setTrainingBaseName(String trainingBaseName) {
		this.trainingBaseName = trainingBaseName;
	}

	public StudentOtherFeeDto() {
		super();
	}

	public StudentOtherFeeDto(StudentOtherFee entity) {
		this.id = entity.getId();
		this.studentId = entity.getStudentId();
		this.creditAmount = entity.getCreditAmount();
		this.debitAmount = entity.getDebitAmount();
		this.returnAmount = entity.getReturnAmount();
		this.voucherDate = entity.getVoucherDate();
		this.studentCode = entity.getStudentCode();
		this.className = entity.getClassName();
		this.studentName = entity.getStudentName();
		this.voucherType = entity.getVoucherType();
		this.note = entity.getNote();
		this.code = entity.getCode();
		this.orderNumber = entity.getOrderNumber();
		this.semesterCode = entity.getSemesterCode();
		this.semesterId = entity.getSemesterId();
		this.createdBy = entity.getCreatedBy();
		this.creditAmount = entity.getCreditAmount();
		this.debitAmount = entity.getDebitAmount();
		this.additional = entity.getAdditional();
		this.trainingBaseCode=entity.getTrainingBaseCode();
		this.trainingBaseId=entity.getTrainingBaseId();
		this.trainingBaseName=entity.getTrainingBaseName();
	}
	
	public StudentOtherFeeDto(StudentOtherFee entity, Student student) {
		this.id = entity.getId();
		this.studentId = entity.getStudentId();
		this.creditAmount = entity.getCreditAmount();
		this.debitAmount = entity.getDebitAmount();
		this.returnAmount = entity.getReturnAmount();
		this.voucherDate = entity.getVoucherDate();
		this.studentCode = entity.getStudentCode();
		this.className = entity.getClassName();
		this.studentName = entity.getStudentName();
		this.voucherType = entity.getVoucherType();
		this.note = entity.getNote();
		this.code = entity.getCode();
		this.orderNumber = entity.getOrderNumber();
		this.semesterCode = entity.getSemesterCode();
		this.semesterId = entity.getSemesterId();
		this.createdBy = entity.getCreatedBy();
		this.creditAmount = entity.getCreditAmount();
		this.debitAmount = entity.getDebitAmount();
		this.additional = entity.getAdditional();
		this.trainingBaseCode=entity.getTrainingBaseCode();
		this.trainingBaseId=entity.getTrainingBaseId();
		this.trainingBaseName=entity.getTrainingBaseName();
		if(student != null) {
			if(student.getCandidateProfile() != null) {
				if(student.getCandidateProfile().getBirthDate() != null) {
					this.birthDate = student.getCandidateProfile().getBirthDate();
				}
				this.gender = student.getCandidateProfile().getGender();
			}
		}
	}
}
