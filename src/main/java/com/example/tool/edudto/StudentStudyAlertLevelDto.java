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
import com.globits.education.domain.StudyAlertCondition;
import com.globits.education.domain.StudyAlertLevel;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.StudentDto;
import com.globits.education.dto.StudyAlertConditionDto;
import com.globits.education.dto.StudyAlertLevelDto;
import com.globits.education.utils.NumberUtils;

public class StudentStudyAlertLevelDto extends BaseObjectDto {

	private static final long serialVersionUID = 1L;
	private Long id;
	private StudentDto student;
	private StudyAlertLevelDto studyAlertLevel;
	private SemesterDto semester;//Học kỳ thực hiện cảnh báo
	private StudyAlertConditionDto studyAlertCondition;//Học kỳ thực hiện cảnh báo
	private Integer status;
	//search
	private String textSearch;
	private Long courseYearId;
	private Long departmentId;
	private Long specialityId;
	private Long enrollmentClassId;
	private Long trainingBaseId;
	private String note;
	private Double mark4;//trung bình cộng học kỳ hệ 4
	private Integer numberOfCredit;//số tín chỉ đăng ký
	private Integer studyAlertType;// StudyAlertEnum;loại học vụ, loại thôi học
	private Boolean isLock;//Đã chốt học bổng
	private Date lockDate;
	private Integer numberOfCreditPreSemester ;//số tín chỉ đăng ký học kỳ trước
	
	private Double mark4PreSemester ;//điểm TBC học kỳ trước
	
	private Integer numberOfCreditSemester ;//số tín chỉ đăng ký học kỳ

	private Double mark4Semester ;//điểm TBC học kỳ 
	
	private Integer numberOfCreditDebt ;//số tín chỉ nợ
	
	private Double mark4Year ;//điểm TBC cả năm
	
	private Double mark4CourseYear ;//điểm TBC toàn khóa
	
	private Double learningMark4 ;//điểm TBTL toàn khóa
	
	private Integer learningNumberOfCredit ;//số tín chỉ tích lũy toàn khóa
	private Boolean voided;//Đã xóa
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
	public StudyAlertLevelDto getStudyAlertLevel() {
		return studyAlertLevel;
	}
	public void setStudyAlertLevel(StudyAlertLevelDto studyAlertLevel) {
		this.studyAlertLevel = studyAlertLevel;
	}
	public String getTextSearch() {
		return textSearch;
	}
	public void setTextSearch(String textSearch) {
		this.textSearch = textSearch;
	}
	public SemesterDto getSemester() {
		return semester;
	}
	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}
	public StudyAlertConditionDto getStudyAlertCondition() {
		return studyAlertCondition;
	}
	public void setStudyAlertCondition(StudyAlertConditionDto studyAlertCondition) {
		this.studyAlertCondition = studyAlertCondition;
	}
	public Long getCourseYearId() {
		return courseYearId;
	}
	public void setCourseYearId(Long courseYearId) {
		this.courseYearId = courseYearId;
	}
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	public Long getSpecialityId() {
		return specialityId;
	}
	public void setSpecialityId(Long specialityId) {
		this.specialityId = specialityId;
	}
	public Long getEnrollmentClassId() {
		return enrollmentClassId;
	}
	public void setEnrollmentClassId(Long enrollmentClassId) {
		this.enrollmentClassId = enrollmentClassId;
	}	
	public Long getTrainingBaseId() {
		return trainingBaseId;
	}
	public void setTrainingBaseId(Long trainingBaseId) {
		this.trainingBaseId = trainingBaseId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
		
	public Double getMark4() {
		return NumberUtils.round(mark4,2);
//		return mark4;
	}
	public void setMark4(Double mark4) {
		this.mark4 = mark4;
	}
	public Integer getNumberOfCredit() {
		return numberOfCredit;
	}
	public void setNumberOfCredit(Integer numberOfCredit) {
		this.numberOfCredit = numberOfCredit;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}	
	
	public Integer getStudyAlertType() {
		return studyAlertType;
	}
	public void setStudyAlertType(Integer studyAlertType) {
		this.studyAlertType = studyAlertType;
	}
	public Boolean getIsLock() {
		return isLock;
	}
	public void setIsLock(Boolean isLock) {
		this.isLock = isLock;
	}
	public Date getLockDate() {
		return lockDate;
	}
	public void setLockDate(Date lockDate) {
		this.lockDate = lockDate;
	}
	
	public Integer getNumberOfCreditPreSemester() {
		return numberOfCreditPreSemester;
	}
	public void setNumberOfCreditPreSemester(Integer numberOfCreditPreSemester) {
		this.numberOfCreditPreSemester = numberOfCreditPreSemester;
	}
	public Double getMark4PreSemester() {
		return NumberUtils.round(mark4PreSemester,2);
//		return mark4PreSemester;
	}
	public void setMark4PreSemester(Double mark4PreSemester) {
		this.mark4PreSemester = mark4PreSemester;
	}
	public Integer getNumberOfCreditSemester() {
		return numberOfCreditSemester;
	}
	public void setNumberOfCreditSemester(Integer numberOfCreditSemester) {
		this.numberOfCreditSemester = numberOfCreditSemester;
	}
	public Double getMark4Semester() {
		return NumberUtils.round(mark4Semester,2);
//		return mark4Semester;
	}
	public void setMark4Semester(Double mark4Semester) {
		this.mark4Semester = mark4Semester;
	}
	public Integer getNumberOfCreditDebt() {
		return numberOfCreditDebt;
	}
	public void setNumberOfCreditDebt(Integer numberOfCreditDebt) {
		this.numberOfCreditDebt = numberOfCreditDebt;
	}
	public Double getMark4Year() {
		return NumberUtils.round(mark4Year,2);
//		return mark4Year;
	}
	public void setMark4Year(Double mark4Year) {
		this.mark4Year = mark4Year;
	}
	public Double getMark4CourseYear() {
		return NumberUtils.round(mark4CourseYear,2);
//		return mark4CourseYear;
	}
	public void setMark4CourseYear(Double mark4CourseYear) {
		this.mark4CourseYear = mark4CourseYear;
	}
	public Double getLearningMark4() {
		return NumberUtils.round(learningMark4,2);
//		return learningMark4;
	}
	public void setLearningMark4(Double learningMark4) {
		this.learningMark4 = learningMark4;
	}
	public Integer getLearningNumberOfCredit() {
		return learningNumberOfCredit;
	}
	public void setLearningNumberOfCredit(Integer learningNumberOfCredit) {
		this.learningNumberOfCredit = learningNumberOfCredit;
	}
	
	public Boolean getVoided() {
		return voided;
	}
	public void setVoided(Boolean voided) {
		this.voided = voided;
	}
	public StudentStudyAlertLevelDto() {

	}

	public StudentStudyAlertLevelDto(StudentStudyAlertLevel b) {
		this.id = b.getId();
		this.status = b.getStatus();
		this.note = b.getNote();
		if(b.getVoided()!=null) {
			this.voided=b.getVoided();
		}
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
		if(b.getStudyAlertLevel() != null) {
			this.studyAlertLevel = new StudyAlertLevelDto();
			this.studyAlertLevel.setId(b.getStudyAlertLevel().getId());
			this.studyAlertLevel.setName(b.getStudyAlertLevel().getName());
			this.studyAlertLevel.setCode(b.getStudyAlertLevel().getCode());
		}
		if(b.getSemester() != null) {
			this.semester = new SemesterDto();
			this.semester.setId(b.getSemester().getId());
			this.semester.setSemesterName(b.getSemester().getSemesterName());
			this.semester.setSemesterCode(b.getSemester().getSemesterCode());
		}
		if(b.getStudyAlertCondition() != null) {
			this.studyAlertCondition = new StudyAlertConditionDto();
			this.studyAlertCondition.setId(b.getStudyAlertCondition().getId());
			this.studyAlertCondition.setName(b.getStudyAlertCondition().getName());
			this.studyAlertCondition.setCode(b.getStudyAlertCondition().getCode());
		}
		this.studyAlertType=b.getStudyAlertType();
		this.isLock=b.getIsLock();
		this.lockDate=b.getLockDate();
		this.numberOfCreditPreSemester=b.getNumberOfCreditPreSemester();
		this.learningNumberOfCredit=b.getLearningNumberOfCredit();
		this.numberOfCreditDebt=b.getNumberOfCreditDebt();
		this.numberOfCreditSemester=b.getNumberOfCreditSemester();
		this.mark4CourseYear=b.getMark4();
		this.learningMark4=b.getLearningMark4();
		this.mark4PreSemester=b.getMark4PreSemester();
		this.mark4Semester=b.getMark4Semester();
		this.mark4Year=b.getMark4Year();
	}
}
