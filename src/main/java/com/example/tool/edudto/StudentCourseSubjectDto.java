package com.example.tool.edudto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;

import com.globits.education.domain.Student;
import com.globits.education.domain.StudentCourseSubject;
import com.globits.education.dto.CourseRegisterViewDto;
import com.globits.education.dto.CourseSubjectDto;
import com.globits.education.dto.EnrollmentClassDto;
import com.globits.education.dto.StudentDto;

public class StudentCourseSubjectDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String studentName;
	private String subjectName;
	private String subjectCode;
	private Long subjectId;
	private CourseSubjectDto courseSubject;
	private Long courseSubjectId;
	private StudentDto student;
	private Long studentId;
	private String message;
	private int status;
	private Long totalCredit;
	private Double totalFee;
	private Double tuitionFeePerCredit;//Mức học phí/1 tín chỉ
	/*
	 * Mức phí cơ bản (dùng để tính miễn giảm)
	 * Trường hợp bình thường sẽ bằng tuitionFeePerCredit
	 * Trường hợp chương trình tiên tiến sẽ = chương trình tương đường cùng ngành
	 */
	private Double basicTuitionFee;
	private Integer subjectStatus;	
	private Integer examStatus;
	private Double tuitionFee;//Tổng tiền học phí= đơn giá * số tín chỉ
	
	private Date studentBirthDate;
	private Double discountPercent;
	private Double discountValue;
	private int numberOfCredit;
	
	private CourseRegisterViewDto courseRegister;
	/*Loại hình đăng ký:
	 * 0 học đi 
	 * 1 học lại
	 * 2 học nâng điểm
	 * EducationConstant.StudentCourseSubjectRegisterType
	 */
	private int typeRegister;
	/*
	 * Có phải ngành chính hay không
	 */
	private Boolean isMainSpec;
	
	private Integer studyTime;
	/*
	 * Loại đăng ký:
	 * 0 hoặc NULL thì là sinh viên đăng ký hoặc Giáo viên CN đăng ký thông thường
	 * 1 : ép lớp
	 * 2 : Khác (cần bổ sung) 
	 */
	private Integer regType=0;
	/*
	 * % học phí khi hủy môn
	 */
	private double cancelFeePercent;
	private Boolean isSelected;//dùng checkbox
	private String traniningBaseCourseSubject;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public StudentDto getStudent() {
		return student;
	}

	public void setStudent(StudentDto student) {
		this.student = student;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public CourseSubjectDto getCourseSubject() {
		return courseSubject;
	}

	public void setCourseSubject(CourseSubjectDto courseSubject) {
		this.courseSubject = courseSubject;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}	
	
	public Long getTotalCredit() {
		return totalCredit;
	}

	public void setTotalCredit(Long totalCredit) {
		this.totalCredit = totalCredit;
	}

	public Double getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(Double totalFee) {
		this.totalFee = totalFee;
	}

	public Double getTuitionFeePerCredit() {
		return tuitionFeePerCredit;
	}

	public void setTuitionFeePerCredit(Double tuitionFeePerCredit) {
		this.tuitionFeePerCredit = tuitionFeePerCredit;
	}
	
	public Double getBasicTuitionFee() {
		return basicTuitionFee;
	}

	public void setBasicTuitionFee(Double basicTuitionFee) {
		this.basicTuitionFee = basicTuitionFee;
	}

	public Integer getSubjectStatus() {
		return subjectStatus;
	}

	public void setSubjectStatus(Integer subjectStatus) {
		this.subjectStatus = subjectStatus;
	}

	public Integer getExamStatus() {
		return examStatus;
	}

	public void setExamStatus(Integer examStatus) {
		this.examStatus = examStatus;
	}

	public Double getTuitionFee() {
		return tuitionFee;
	}

	public void setTuitionFee(Double tuitionFee) {
		this.tuitionFee = tuitionFee;
	}

	public int getTypeRegister() {
		return typeRegister;
	}

	public void setTypeRegister(int typeRegister) {
		this.typeRegister = typeRegister;
	}
	
	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public Boolean getIsMainSpec() {
		return isMainSpec;
	}

	public void setIsMainSpec(Boolean isMainSpec) {
		this.isMainSpec = isMainSpec;
	}

	public Integer getStudyTime() {
		return studyTime;
	}

	public void setStudyTime(Integer studyTime) {
		this.studyTime = studyTime;
	}

	public Integer getRegType() {
		return regType;
	}

	public void setRegType(Integer regType) {
		this.regType = regType;
	}

	public double getCancelFeePercent() {
		return cancelFeePercent;
	}

	public void setCancelFeePercent(double cancelFeePercent) {
		this.cancelFeePercent = cancelFeePercent;
	}

	public CourseRegisterViewDto getCourseRegister() {
		return courseRegister;
	}

	public void setCourseRegister(CourseRegisterViewDto courseRegister) {
		this.courseRegister = courseRegister;
	}

	public Date getStudentBirthDate() {
		return studentBirthDate;
	}

	public void setStudentBirthDate(Date studentBirthDate) {
		this.studentBirthDate = studentBirthDate;
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

	public int getNumberOfCredit() {
		return numberOfCredit;
	}

	public void setNumberOfCredit(int numberOfCredit) {
		this.numberOfCredit = numberOfCredit;
	}	

	public Boolean getIsSelected() {
		return isSelected;
	}

	public void setIsSelected(Boolean isSelected) {
		this.isSelected = isSelected;
	}

	public String getTraniningBaseCourseSubject() {
		return traniningBaseCourseSubject;
	}

	public void setTraniningBaseCourseSubject(String traniningBaseCourseSubject) {
		this.traniningBaseCourseSubject = traniningBaseCourseSubject;
	}

	public Long getCourseSubjectId() {
		return courseSubjectId;
	}

	public void setCourseSubjectId(Long courseSubjectId) {
		this.courseSubjectId = courseSubjectId;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public StudentCourseSubjectDto() {

	}

	public StudentCourseSubjectDto(Long id, String displayName, int status) {
		this.setId(id);
		this.studentName = displayName;
		this.status = status;		
	}
	public StudentCourseSubjectDto(StudentCourseSubject scb, Boolean isGetFull) {
		if(isGetFull) {
			if (scb != null) {
				this.id = scb.getId();
				this.tuitionFee = scb.getTuitionFee();
				this.subjectStatus = scb.getSubjectStatus();
				if (scb.getStudent() != null) {
					Student student = scb.getStudent();
					StudentDto stuDto = new StudentDto();
					stuDto.setId(student.getId());
					stuDto.setLastName(student.getLastName());
					stuDto.setFirstName(student.getFirstName());
					stuDto.setDisplayName(student.getDisplayName());
					stuDto.setStudentCode(student.getStudentCode());
					if(student.getEnrollmentClass()!=null) {
						stuDto.setClassName(student.getEnrollmentClass().getClassName());
						stuDto.setClassCode(student.getEnrollmentClass().getClassCode());
					}
					this.student = stuDto;
					this.studentBirthDate = scb.getStudent().getBirthDate();
					this.studentName = scb.getStudent().getDisplayName();
				}
				if (scb.getCourseSubject() != null) {
					this.courseSubject = new CourseSubjectDto(scb.getCourseSubject());
					if(this.courseSubject!=null && this.courseSubject.getSemesterSubject()!=null && this.courseSubject.getSemesterSubject().getSubject()!=null) {
						this.subjectName = this.courseSubject.getSemesterSubject().getSubject().getSubjectName();
						this.numberOfCredit=this.courseSubject.getSemesterSubject().getSubject().getNumberOfCredit();
						if(courseSubject.getShortCode() !=null && courseSubject.getShortCode().length()>0) {
							if(courseSubject.getShortCode().indexOf("-")>0) {//Đoạn code này chỉ phục vụ cho việc đặt tên lớp khi import dữ liệu từ file excel, cần phải xem xét lại sau này
								this.subjectCode = this.subjectName + this.courseSubject.getShortCode().substring(courseSubject.getShortCode().indexOf("-"), courseSubject.getShortCode().length());
							}
							else {
								this.subjectCode = this.subjectName + " " + this.courseSubject.getShortCode();
							}
						}
					}
					if(scb.getCourseSubject().getTrainingBase()!=null) {
						this.traniningBaseCourseSubject=scb.getCourseSubject().getTrainingBase().getName();
					}
				}
				this.studyTime = scb.getStudyTime();
				this.status = scb.getStatus();
				this.regType  = scb.getRegType();
				this.examStatus=scb.getExamStatus();
			}			
		}else {
			this.id = scb.getId();
			this.tuitionFee = scb.getTuitionFee();
			this.subjectStatus = scb.getSubjectStatus();
			if (scb.getStudent() != null) {
				Student student = scb.getStudent();
				StudentDto stuDto = new StudentDto();
				stuDto.setId(student.getId());
				stuDto.setLastName(student.getLastName());
				stuDto.setFirstName(student.getFirstName());
				stuDto.setDisplayName(student.getDisplayName());
				stuDto.setStudentCode(student.getStudentCode());
				if(student.getEnrollmentClass()!=null) {
					stuDto.setClassName(student.getEnrollmentClass().getClassName());
				}
				this.student = stuDto;
				this.studentBirthDate = scb.getStudent().getBirthDate();
				this.studentName = scb.getStudent().getDisplayName();
			}	
			
			if (scb.getCourseSubject() != null) {
				this.courseSubject = new CourseSubjectDto();
				this.courseSubject.setId(scb.getCourseSubject().getId());
				this.courseSubject.setCode(scb.getCourseSubject().getCode());
				this.courseSubject.setShortCode(scb.getCourseSubject().getShortCode());
				this.courseSubject.setDisplayName(scb.getCourseSubject().getDisplayName());
			}
			this.studyTime = scb.getStudyTime();
			this.status = scb.getStatus();
			this.regType  = scb.getRegType();
			this.examStatus=scb.getExamStatus();
		}
	}
	public StudentCourseSubjectDto(StudentCourseSubject scb) {
		if (scb != null) {
			this.id = scb.getId();
			this.tuitionFee = scb.getTuitionFee();
			this.subjectStatus = scb.getSubjectStatus();
			if (scb.getStudent() != null) {
				Student student = scb.getStudent();
				StudentDto stuDto = new StudentDto();
				stuDto.setId(student.getId());
				stuDto.setLastName(student.getLastName());
				stuDto.setFirstName(student.getFirstName());
				stuDto.setDisplayName(student.getDisplayName());
				stuDto.setStudentCode(student.getStudentCode());
				if(student.getEnrollmentClass()!=null) {
					stuDto.setClassName(student.getEnrollmentClass().getClassName());
				}
				this.student = stuDto;
				this.studentBirthDate = scb.getStudent().getBirthDate();
				this.studentName = scb.getStudent().getDisplayName();
			}
			if (scb.getCourseSubject() != null) {
				this.courseSubject = new CourseSubjectDto(scb.getCourseSubject());
				if(this.courseSubject!=null && this.courseSubject.getSemesterSubject()!=null && this.courseSubject.getSemesterSubject().getSubject()!=null) {
//					this.subjectCode = this.courseSubject.getSemesterSubject().getSubject().getSubjectCode();
					this.subjectName = this.courseSubject.getSemesterSubject().getSubject().getSubjectName();
					if(courseSubject.getShortCode() !=null && courseSubject.getShortCode().length()>0) {
						if(courseSubject.getShortCode().indexOf("-")>0) {//Đoạn code này chỉ phục vụ cho việc đặt tên lớp khi import dữ liệu từ file excel, cần phải xem xét lại sau này
							this.subjectCode = this.subjectName + this.courseSubject.getShortCode().substring(courseSubject.getShortCode().indexOf("-"), courseSubject.getShortCode().length());
						}
						else {
							this.subjectCode = this.subjectName + " " + this.courseSubject.getShortCode();
						}
					}
				}
			}
			this.studyTime = scb.getStudyTime();
			this.status = scb.getStatus();
			this.regType  = scb.getRegType();
			this.examStatus=scb.getExamStatus();
		}
	}
	public StudentCourseSubjectDto(StudentCourseSubject scb,int isRegister) {
		if (scb != null) {
			this.id = scb.getId();
			this.tuitionFee = scb.getTuitionFee();
			this.subjectStatus = scb.getSubjectStatus();
			if (scb.getStudent() != null) {
				Student student = scb.getStudent();
				StudentDto stuDto = new StudentDto();
				stuDto.setId(student.getId());
				stuDto.setLastName(student.getLastName());
				stuDto.setFirstName(student.getFirstName());
				stuDto.setDisplayName(student.getDisplayName());
				stuDto.setStudentCode(student.getStudentCode());
				if(student.getEnrollmentClass()!=null) {
					stuDto.setClassName(student.getEnrollmentClass().getClassName());
				}
				this.student = stuDto;
				this.studentBirthDate = scb.getStudent().getBirthDate();
				this.studentName = scb.getStudent().getDisplayName();
			}
			if (scb.getCourseSubject() != null) {
				this.courseSubject = new CourseSubjectDto();
				this.courseSubject.setCode(scb.getCourseSubject().getCode()); 
				this.courseSubject.setShortCode(scb.getCourseSubject().getShortCode());
				this.courseSubject.setId(scb.getCourseSubject().getId()); 
				if(this.courseSubject!=null && this.courseSubject.getSemesterSubject()!=null && this.courseSubject.getSemesterSubject().getSubject()!=null) {
//					this.subjectCode = this.courseSubject.getSemesterSubject().getSubject().getSubjectCode();
					this.subjectName = this.courseSubject.getSemesterSubject().getSubject().getSubjectName();
					if(courseSubject.getShortCode() !=null && courseSubject.getShortCode().length()>0) {
						if(courseSubject.getShortCode().indexOf("-")>0) {//Đoạn code này chỉ phục vụ cho việc đặt tên lớp khi import dữ liệu từ file excel, cần phải xem xét lại sau này
							this.subjectCode = this.subjectName + this.courseSubject.getShortCode().substring(courseSubject.getShortCode().indexOf("-"), courseSubject.getShortCode().length());
						}
						else {
							this.subjectCode = this.subjectName + " " + this.courseSubject.getShortCode();
						}
					}
				}
			}
			this.studyTime = scb.getStudyTime();
			this.status = scb.getStatus();
			this.regType  = scb.getRegType();
			this.examStatus=scb.getExamStatus();
		}
	}
	public StudentCourseSubjectDto(Student scb,Long totalCredit,Double tuitionFeePerCredit) {
		if (scb != null) {
			this.id = scb.getId();			
			if (scb != null) {
				Student student = scb;
				StudentDto stuDto = new StudentDto();
				stuDto.setId(student.getId());
				stuDto.setLastName(student.getLastName());
				stuDto.setFirstName(student.getFirstName());
				stuDto.setDisplayName(student.getDisplayName());
				stuDto.setStudentCode(student.getStudentCode());
				this.studentName = scb.getDisplayName();
				if(student.getEnrollmentClass() != null) {
					stuDto.setEnrollmentClass(new EnrollmentClassDto(student.getEnrollmentClass()));
					stuDto.setClassName(student.getEnrollmentClass().getClassName());
				}
				this.student = stuDto;
			}
		}
		if(totalCredit!=null) {
			this.totalCredit = totalCredit;
		}		
		if(tuitionFeePerCredit!=null) {
			this.tuitionFeePerCredit = tuitionFeePerCredit;
		}
		if(tuitionFeePerCredit!=null && totalCredit!=null) {
			this.totalFee = tuitionFeePerCredit * totalCredit;
		}
	}
	public StudentCourseSubjectDto(Student scb) {
		if (scb != null) {
			this.id = scb.getId();			
//			if (scb != null) {
				Student student = scb;
				StudentDto stuDto = new StudentDto();
				stuDto.setId(student.getId());
				stuDto.setLastName(student.getLastName());
				stuDto.setFirstName(student.getFirstName());
				stuDto.setDisplayName(student.getDisplayName());
				stuDto.setStudentCode(student.getStudentCode());
				if(student.getEnrollmentClass()!=null) {
					stuDto.setClassName(student.getEnrollmentClass().getClassName());
					stuDto.setClassCode(student.getEnrollmentClass().getClassCode());
				}
				this.student = stuDto;
				this.studentName = scb.getDisplayName();
//				if(student.getEnrollmentClass() != null) {
//					stuDto.setEnrollmentClass(new EnrollmentClassDto(student.getEnrollmentClass()));
//				}
//			}
		}
		
	}
}
