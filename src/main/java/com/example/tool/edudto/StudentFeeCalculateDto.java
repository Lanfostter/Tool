package com.example.tool.edudto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;

import com.globits.core.domain.TrainingBase;
import com.globits.core.dto.TrainingBaseDto;
import com.globits.education.domain.CourseSubject;
import com.globits.education.domain.EducationFeeConfig;
import com.globits.education.domain.SemesterSubjectExam;
import com.globits.education.domain.Student;
import com.globits.education.domain.StudentFeeCalculate;
import com.globits.education.domain.StudentTuitionFeeCalculate;
import com.globits.education.domain.StudentTuitionFeeCalculateDetail;
import com.globits.education.dto.CourseSubjectDto;
import com.globits.education.dto.EducationFeeConfigDto;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.SemesterRegisterPeriodDto;
import com.globits.education.dto.SemesterSubjectExamDto;
import com.globits.education.dto.StudentDto;

public class StudentFeeCalculateDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private StudentDto student;	
	
	private SemesterDto semester;	
	private String semesterCode;
	private SemesterRegisterPeriodDto registerPeriod;
	private String registerPeriodCode;
	private String subjectCode;
	private String subjectName;
	
	private Date calculateDate;
	private Integer numberOfSubject;//Số học phần	
	
	private Integer numberOfCredit;//Số tín chỉ
	private Double amount;//Tổng số học phí (chưa trừ các khoản miễn giảm)
	
	private Double discountPercent;//Miễn giảm %	
	private Double discountValue;//Miễn giảm số tiền	
	private Double restAmount;//Số tiền phải đóng sau khi trừ các khoản miễn giảm	
	private Boolean isLock;//Đã chốt học phí	
	private Double account;
	private String trainingBaseName;
	private String className;
	/*
	 * Loại học phí
	 * 0: học phí lớp riêng
	 * 1: học phí lớp thường
	 * Const: StudentTuitionFeeCalculateTypeEnum
	 */	
	private Integer type;
	private String modifiedBy;
	private Boolean voided;
	private String createdBy;
	private EducationFeeConfigDto educationFeeConfig;
	private CourseSubjectDto courseSubject;//Lớp học phần
	private SemesterSubjectExamDto semesterSubjectExam;//Lần tổ chức thi
	private TrainingBaseDto trainingBase;
	private Double cancelFeePercent=100D;	
	private Double cancelFee=0D;
	private Integer status;
	private String note;
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
	public SemesterDto getSemester() {
		return semester;
	}
	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}
	public SemesterRegisterPeriodDto getRegisterPeriod() {
		return registerPeriod;
	}
	public void setRegisterPeriod(SemesterRegisterPeriodDto registerPeriod) {
		this.registerPeriod = registerPeriod;
	}
	
	
	public Date getCalculateDate() {
		return calculateDate;
	}
	public void setCalculateDate(Date calculateDate) {
		this.calculateDate = calculateDate;
	}
	public Integer getNumberOfSubject() {
		return numberOfSubject;
	}
	public void setNumberOfSubject(Integer numberOfSubject) {
		this.numberOfSubject = numberOfSubject;
	}
	public Integer getNumberOfCredit() {
		return numberOfCredit;
	}
	public void setNumberOfCredit(Integer numberOfCredit) {
		this.numberOfCredit = numberOfCredit;
	}
	
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(Double discountPercent) {
		this.discountPercent = discountPercent;
	}
	public Double getDiscountValue() {
		return discountValue;
	}
	public void setDiscountValue(Double discountValue) {
		this.discountValue = discountValue;
	}
	public Double getRestAmount() {
		return restAmount;
	}
	public void setRestAmount(Double restAmount) {
		this.restAmount = restAmount;
	}
	public Boolean getIsLock() {
		return isLock;
	}
	public void setIsLock(Boolean isLock) {
		this.isLock = isLock;
	}
	public Double getAccount() {
		return account;
	}
	public void setAccount(Double account) {
		this.account = account;
	}	
	public String getTrainingBaseName() {
		return trainingBaseName;
	}
	public void setTrainingBaseName(String trainingBaseName) {
		this.trainingBaseName = trainingBaseName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}	
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
	public Boolean getVoided() {
		return voided;
	}
	public void setVoided(Boolean voided) {
		this.voided = voided;
	}	
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	public EducationFeeConfigDto getEducationFeeConfig() {
		return educationFeeConfig;
	}
	public void setEducationFeeConfig(EducationFeeConfigDto educationFeeConfig) {
		this.educationFeeConfig = educationFeeConfig;
	}
	public CourseSubjectDto getCourseSubject() {
		return courseSubject;
	}
	public void setCourseSubject(CourseSubjectDto courseSubject) {
		this.courseSubject = courseSubject;
	}
	public SemesterSubjectExamDto getSemesterSubjectExam() {
		return semesterSubjectExam;
	}
	public void setSemesterSubjectExam(SemesterSubjectExamDto semesterSubjectExam) {
		this.semesterSubjectExam = semesterSubjectExam;
	}
	public TrainingBaseDto getTrainingBase() {
		return trainingBase;
	}
	public void setTrainingBase(TrainingBaseDto trainingBase) {
		this.trainingBase = trainingBase;
	}
	
	public String getSemesterCode() {
		return semesterCode;
	}
	public void setSemesterCode(String semesterCode) {
		this.semesterCode = semesterCode;
	}
	public String getRegisterPeriodCode() {
		return registerPeriodCode;
	}
	public void setRegisterPeriodCode(String registerPeriodCode) {
		this.registerPeriodCode = registerPeriodCode;
	}
	public String getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public Double getCancelFeePercent() {
		return cancelFeePercent;
	}
	public void setCancelFeePercent(Double cancelFeePercent) {
		this.cancelFeePercent = cancelFeePercent;
	}
	public Double getCancelFee() {
		return cancelFee;
	}
	public void setCancelFee(Double cancelFee) {
		this.cancelFee = cancelFee;
	}
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public StudentFeeCalculateDto() {
		
	}
	public StudentFeeCalculateDto(StudentFeeCalculate entity) {
		if(entity!=null) {
			this.id = entity.getId();
			if(entity.getStudent()!=null) {
				this.student = new StudentDto();
				this.student.setId(entity.getStudent().getId());
				this.student.setStudentCode(entity.getStudent().getStudentCode());
				this.student.setDisplayName(entity.getStudent().getDisplayName());
				this.student.setBankAccount(entity.getStudent().getBankAccount());
				if(entity.getStudent().getEnrollmentClass()!=null&&entity.getStudent().getEnrollmentClass().getClassName()!=null){
					this.student.setClassName(entity.getStudent().getEnrollmentClass().getClassName());
					this.className=entity.getStudent().getEnrollmentClass().getClassName();
				}
			}
			if(entity.getSemester()!=null) {
				this.semester = new SemesterDto();
				this.semester.setId(entity.getSemester().getId());
				this.semester.setSemesterCode(entity.getSemester().getSemesterCode());
				this.semester.setSemesterName(entity.getSemester().getSemesterName());
				this.semesterCode= entity.getSemester().getSemesterCode();
			}
			if(entity.getPeriod()!=null) {
				this.registerPeriod = new SemesterRegisterPeriodDto();
				this.registerPeriod.setId(entity.getPeriod().getId());
				this.registerPeriod.setName(entity.getPeriod().getName());
				this.registerPeriodCode= entity.getPeriod().getName();
			}
			
			this.calculateDate = entity.getCalculateDate();
			this.discountPercent = entity.getDiscountPercent();
			this.discountValue = entity.getDiscountValue();
			this.isLock = entity.getIsLock();
			this.numberOfCredit = entity.getNumberOfCredit();
			this.numberOfSubject = entity.getNumberOfSubject();
//			this.relearnFee = entity.getRelearnFee();
//			this.firstTimeLearnFee = entity.getFirstTimeLearnFee();
//			this.upgradeMarkFee = entity.getUpgradeMarkFee();
			this.amount= entity.getAmount();
			this.restAmount = entity.getRestAmount();
			this.cancelFee= entity.getCancelFee();
			this.cancelFeePercent= entity.getCancelFeePercent();
//			this.totalTuitionFee = entity.getTotalTuitionFee();
//			this.type = entity.getType();
			this.modifiedBy=entity.getModifiedBy();
			this.voided=entity.getVoided();
			this.createdBy=entity.getCreatedBy();
			this.status= entity.getStatus();
			this.note= entity.getNote();
			if(entity.getTrainingBase()!=null) {
				this.trainingBaseName=entity.getTrainingBase().getName();
			}
			if(entity.getEducationFeeConfig()!=null) {
				this.educationFeeConfig = new  EducationFeeConfigDto();
				this.educationFeeConfig.setId(entity.getEducationFeeConfig().getId());
				this.educationFeeConfig.setCode(entity.getEducationFeeConfig().getCode());
				this.educationFeeConfig.setName(entity.getEducationFeeConfig().getName());
				this.educationFeeConfig.setAmount(entity.getEducationFeeConfig().getAmount());
			}
			if(entity.getCourseSubject()!=null) {
				this.courseSubject = new CourseSubjectDto();
				this.courseSubject.setId(entity.getCourseSubject().getId());
				if(entity.getCourseSubject().getSemesterSubject()!=null && entity.getCourseSubject().getSemesterSubject().getSubject()!=null) {
					this.subjectCode =entity.getCourseSubject().getSemesterSubject().getSubject().getSubjectCode();
					this.subjectName =entity.getCourseSubject().getSemesterSubject().getSubject().getSubjectName();
//					this.numberOfCredit =entity.getCourseSubject().getSemesterSubject().getSubject().getNumberOfCredit();
//					this.numberOfSubject = 1;
				}
			}
			if(entity.getSemesterSubjectExam()!=null) {
				this.semesterSubjectExam  = new SemesterSubjectExamDto();
				this.semesterSubjectExam.setId(entity.getSemesterSubjectExam().getId());
			}
			
		}
	}
	public StudentFeeCalculateDto(StudentFeeCalculate entity,Student student) {
		if(student!=null) {
			this.student = new StudentDto();
			this.student.setId(student.getId());
			this.student.setStudentCode(student.getStudentCode());
			this.student.setDisplayName(student.getDisplayName());
			this.student.setBankAccount(student.getBankAccount());
			if(student.getEnrollmentClass()!=null&&student.getEnrollmentClass().getClassName()!=null) {
				this.student.setClassName(student.getEnrollmentClass().getClassName());
				this.className=student.getEnrollmentClass().getClassName();
			}
		}
		if(entity!=null) {
			this.id = entity.getId();			
			if(entity.getSemester()!=null) {
				this.semester = new SemesterDto();
				this.semester.setId(entity.getSemester().getId());
				this.semester.setSemesterCode(entity.getSemester().getSemesterCode());
				this.semester.setSemesterName(entity.getSemester().getSemesterName());
			}
			if(entity.getPeriod()!=null) {
				this.registerPeriod = new SemesterRegisterPeriodDto();
				this.registerPeriod.setId(entity.getPeriod().getId());
				this.registerPeriod.setName(entity.getPeriod().getName());
			}
//			this.account = entity.getAccount();
			this.calculateDate = entity.getCalculateDate();
			this.discountPercent = entity.getDiscountPercent();
			this.discountValue = entity.getDiscountValue();
			this.isLock = entity.getIsLock();
			this.numberOfCredit = entity.getNumberOfCredit();
			this.numberOfSubject = entity.getNumberOfSubject();
//			this.relearnFee = entity.getRelearnFee();
//			this.firstTimeLearnFee = entity.getFirstTimeLearnFee();
//			this.upgradeMarkFee = entity.getUpgradeMarkFee();
			this.amount= entity.getAmount();
			this.restAmount = entity.getRestAmount();
			this.cancelFee= entity.getCancelFee();
			this.cancelFeePercent= entity.getCancelFeePercent();
			this.status= entity.getStatus();
			this.note= entity.getNote();
//			this.totalTuitionFee = entity.getTotalTuitionFee();
//			this.type = entity.getType();
//			if(entity.getDetails()!=null && entity.getDetails().size()>0) {
//				this.details = new ArrayList<StudentTuitionFeeCalculateDetailDto>();
//				for (StudentTuitionFeeCalculateDetail detail : entity.getDetails()) {					
//					this.details.add(new StudentTuitionFeeCalculateDetailDto(detail));
//				}
//			}
			if(entity.getTrainingBase()!=null) {
				this.trainingBaseName=entity.getTrainingBase().getName();
			}
			if(entity.getEducationFeeConfig()!=null) {
				this.educationFeeConfig = new  EducationFeeConfigDto();
				this.educationFeeConfig.setId(entity.getEducationFeeConfig().getId());
				this.educationFeeConfig.setCode(entity.getEducationFeeConfig().getCode());
				this.educationFeeConfig.setName(entity.getEducationFeeConfig().getName());
			}
			if(entity.getCourseSubject()!=null) {
				this.courseSubject = new CourseSubjectDto();
				this.courseSubject.setId(entity.getCourseSubject().getId());
//				if(entity.getCourseSubject().getSemesterSubject()!=null && entity.getCourseSubject().getSemesterSubject().getSubject()!=null) {
//					this.numberOfCredit = entity.getCourseSubject().getSemesterSubject().getSubject().getNumberOfCredit();
//					this.numberOfSubject = 1;
//				}
			}
			if(entity.getSemesterSubjectExam()!=null) {
				this.semesterSubjectExam  = new SemesterSubjectExamDto();
				this.semesterSubjectExam.setId(entity.getSemesterSubjectExam().getId());
			}
		}
		else {
			this.numberOfCredit = 0;
			this.numberOfSubject = 0;
			this.amount = 0D;			
			this.restAmount = 0D;
			this.discountPercent= 0D;
			this.discountValue= 0D;
			this.cancelFee= 0D;
			this.cancelFeePercent= 0D;
		}
	}
}
