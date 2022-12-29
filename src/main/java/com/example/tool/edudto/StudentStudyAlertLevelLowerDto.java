package com.example.tool.edudto;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.globits.core.dto.BaseObjectDto;
import com.globits.education.domain.BehaviorMarkCriteria;
import com.globits.education.domain.CourseYear;
import com.globits.education.domain.Semester;
import com.globits.education.domain.Student;
import com.globits.education.domain.StudentStudyAlertLevel;
import com.globits.education.domain.StudentStudyAlertLevelLower;
import com.globits.education.domain.StudyAlertCondition;
import com.globits.education.domain.StudyAlertLevel;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.StudentDto;
import com.globits.education.dto.StudentStudyAlertLevelDto;
import com.globits.education.utils.NumberUtils;

public class StudentStudyAlertLevelLowerDto extends BaseObjectDto {

	private static final long serialVersionUID = 1L;
	private Long id;
	private StudentDto student;
	private StudentStudyAlertLevelDto studentStudyAlertLevel;
	private SemesterDto semester;//Học kỳ thực hiện cảnh báo
	
	private String note;
	private Boolean isLowered;//=true đã hạ mức, =false chưa hạ

	private Date loweredDate;//ngày hạ

	private Double learningMarkSemester ;//điểm TBC học kỳ  hệ 10
	
	private Double learningMark4Semester ;//điểm TBC học kỳ hệ 4
	
	private Integer numberOfCreditDebt ;//số tín chỉ nợ
	
	private Double learningMark4 ;//điểm TBC toàn khóa
	
	private Double mark4 ;//điểm TBTL toàn khóa hệ 4
	
	private Double mark ;//điểm TBTL toàn khóa hệ 10
	
	private Integer numberOfCredit ;//số tín chỉ tích lũy toàn khóa
	private Integer studyAlertType;// StudyAlertEnum;loại học vụ, loại thôi học
	private Boolean isSelected;
	private Boolean isDelete;//=true đã xóa, =false chưa xóa
	private Integer numberOfCreditSemester ;//số tín chỉ học kỳ
	private String studyAlertLevelName;//mức học vụ kỳ hiện tại
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
	
		
	public Double getMark4() {
		return NumberUtils.round(mark4,2);
//		return mark4;
	}
	public void setMark4(Double mark4) {
		this.mark4 = mark4;
	}
	
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}	
		
	public Double getLearningMarkSemester() {
		return NumberUtils.round(learningMarkSemester,2);
//		return learningMarkSemester;
	}
	public void setLearningMarkSemester(Double learningMarkSemester) {
		this.learningMarkSemester = learningMarkSemester;
	}
	public Double getLearningMark4Semester() {
		return NumberUtils.round(learningMark4Semester,2);
//		return learningMark4Semester;
	}
	public void setLearningMark4Semester(Double learningMark4Semester) {
		this.learningMark4Semester = learningMark4Semester;
	}
	public Double getMark() {
		return NumberUtils.round(mark,2);
//		return mark;
	}
	public void setMark(Double mark) {
		this.mark = mark;
	}
	public Integer getNumberOfCredit() {
		return numberOfCredit;
	}
	public void setNumberOfCredit(Integer numberOfCredit) {
		this.numberOfCredit = numberOfCredit;
	}
	
	public Integer getNumberOfCreditDebt() {
		return numberOfCreditDebt;
	}
	public void setNumberOfCreditDebt(Integer numberOfCreditDebt) {
		this.numberOfCreditDebt = numberOfCreditDebt;
	}
	
	public Double getLearningMark4() {
		return NumberUtils.round(learningMark4,2);
//		return learningMark4;
	}
	public void setLearningMark4(Double learningMark4) {
		this.learningMark4 = learningMark4;
	}
	
	public StudentStudyAlertLevelDto getStudentStudyAlertLevel() {
		return studentStudyAlertLevel;
	}
	public void setStudentStudyAlertLevel(StudentStudyAlertLevelDto studentStudyAlertLevel) {
		this.studentStudyAlertLevel = studentStudyAlertLevel;
	}
	public Boolean getIsLowered() {
		return isLowered;
	}
	public void setIsLowered(Boolean isLowered) {
		this.isLowered = isLowered;
	}
	public Date getLoweredDate() {
		return loweredDate;
	}
	public void setLoweredDate(Date loweredDate) {
		this.loweredDate = loweredDate;
	}
	
	public Boolean getIsSelected() {
		return isSelected;
	}
	public void setIsSelected(Boolean isSelected) {
		this.isSelected = isSelected;
	}
	
	public Integer getStudyAlertType() {
		return studyAlertType;
	}
	public void setStudyAlertType(Integer studyAlertType) {
		this.studyAlertType = studyAlertType;
	}
	
	public Boolean getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}
	
	public Integer getNumberOfCreditSemester() {
		return numberOfCreditSemester;
	}
	public void setNumberOfCreditSemester(Integer numberOfCreditSemester) {
		this.numberOfCreditSemester = numberOfCreditSemester;
	}
	
	public String getStudyAlertLevelName() {
		return studyAlertLevelName;
	}
	public void setStudyAlertLevelName(String studyAlertLevelName) {
		this.studyAlertLevelName = studyAlertLevelName;
	}
	public StudentStudyAlertLevelLowerDto() {

	}

	public StudentStudyAlertLevelLowerDto(StudentStudyAlertLevelLower b) {
		this.id = b.getId();
		this.note = b.getNote();
		this.studyAlertType=b.getStudyAlertType();
		if(b.getStudent() != null) {
			this.student = new StudentDto();
			this.student.setId(b.getStudent().getId());
			this.student.setDisplayName(b.getStudent().getDisplayName());
			this.student.setStudentCode(b.getStudent().getStudentCode());
			if(b.getStudent().getEnrollmentClass()!=null) {
				this.student.setClassName(b.getStudent().getEnrollmentClass().getClassName());
				this.student.setClassCode(b.getStudent().getEnrollmentClass().getClassCode());
				if(b.getStudent().getEnrollmentClass().getDepartment()!=null) {
					this.student.setDepartment(b.getStudent().getEnrollmentClass().getDepartment().getName());
				}
			}
		}
		if(b.getStudentStudyAlertLevel() != null) {
			this.studentStudyAlertLevel = new StudentStudyAlertLevelDto(b.getStudentStudyAlertLevel());			
		}
		if(b.getSemester() != null) {
			this.semester = new SemesterDto();
			this.semester.setId(b.getSemester().getId());
			this.semester.setSemesterName(b.getSemester().getSemesterName());
			this.semester.setSemesterCode(b.getSemester().getSemesterCode());
		}
		
		this.isLowered=b.getIsLowered();
		this.loweredDate=b.getLoweredDate();
		this.isDelete=b.getIsDelete();
		this.numberOfCredit=b.getNumberOfCredit();
		this.numberOfCreditDebt=b.getNumberOfCreditDebt();
		this.mark=b.getMark();
		this.mark4=b.getMark4();
		this.learningMark4=b.getLearningMark4();
		this.learningMarkSemester=b.getLearningMarkSemester();
		this.learningMark4Semester=b.getLearningMark4Semester();
		this.numberOfCreditSemester=b.getNumberOfCreditSemester();
	}
	public StudentStudyAlertLevelLowerDto(StudentStudyAlertLevelLower b, StudentStudyAlertLevel ssal) {
		if(b!=null) {
			this.id = b.getId();
			this.note = b.getNote();
			if(b.getSemester() != null) {
				this.semester = new SemesterDto();
				this.semester.setId(b.getSemester().getId());
				this.semester.setSemesterName(b.getSemester().getSemesterName());
				this.semester.setSemesterCode(b.getSemester().getSemesterCode());
			}
			
			this.isLowered=b.getIsLowered();
			this.loweredDate=b.getLoweredDate();
			this.isDelete=b.getIsDelete();
			this.numberOfCredit=b.getNumberOfCredit();
			this.numberOfCreditDebt=b.getNumberOfCreditDebt();
			this.mark=b.getMark();
			this.mark4=b.getMark4();
			this.learningMark4=b.getLearningMark4();
			this.learningMarkSemester=b.getLearningMarkSemester();
			this.learningMark4Semester=b.getLearningMark4Semester();
			this.studyAlertType=b.getStudyAlertType();
			this.numberOfCreditSemester=b.getNumberOfCreditSemester();
			if(b.getStudent() != null) {
				this.student = new StudentDto();
				this.student.setId(b.getStudent().getId());
				this.student.setDisplayName(b.getStudent().getDisplayName());
				this.student.setStudentCode(b.getStudent().getStudentCode());
				if(b.getStudent().getEnrollmentClass()!=null) {
					this.student.setClassName(b.getStudent().getEnrollmentClass().getClassName());
					this.student.setClassCode(b.getStudent().getEnrollmentClass().getClassCode());
				}
			}
		}
		if(ssal!= null) {
			this.studentStudyAlertLevel = new StudentStudyAlertLevelDto(ssal);			
//			if(ssal.getStudent() != null) {
//				this.student = new StudentDto();
//				this.student.setId(ssal.getStudent().getId());
//				this.student.setDisplayName(ssal.getStudent().getDisplayName());
//				this.student.setStudentCode(ssal.getStudent().getStudentCode());
//				if(ssal.getStudent().getEnrollmentClass()!=null) {
//					this.student.setClassName(ssal.getStudent().getEnrollmentClass().getClassName());
//					this.student.setClassCode(ssal.getStudent().getEnrollmentClass().getClassCode());
//				}
//			}
		}
	}
}
