package com.example.tool.edudto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;

import com.globits.core.domain.Discipline;
import com.globits.core.dto.BaseObjectDto;
import com.globits.core.dto.DepartmentDto;
import com.globits.core.dto.DisciplineDto;
import com.globits.core.dto.RoomDto;
import com.globits.education.Const.StudyAlertEnum;
import com.globits.education.domain.Certificate;
import com.globits.education.domain.CourseSubjectTimetable;
import com.globits.education.domain.CourseYear;
import com.globits.education.domain.Semester;
import com.globits.education.domain.StudentObject;
import com.globits.education.domain.StudyAlertCondition;
import com.globits.education.domain.StudyAlertConditionCertificate;
import com.globits.education.domain.StudyAlertConditionLevel;
import com.globits.education.domain.StudyAlertConditionStudentObject;
import com.globits.education.domain.StudyAlertLevel;
import com.globits.education.dto.CertificateDto;
import com.globits.education.dto.CourseYearDto;
import com.globits.education.dto.EnrollmentClassDto;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.SpecialityDto;
import com.globits.education.dto.StudentObjectDto;
import com.globits.education.dto.StudyAlertConditionCertificateDto;
import com.globits.education.dto.StudyAlertConditionLevelDto;
import com.globits.education.dto.StudyAlertConditionStudentObjectDto;
import com.globits.education.dto.StudyAlertLevelDto;
import com.globits.hr.dto.StaffDto;

public class StudyAlertConditionDto extends BaseObjectDto
{
	private String name;//tên
	private String code;//mã
	private Long semesterId;//Áp dụng cho kỳ học nào
	private Long courseYearId;//Áp dụng cho khóa học nào
	private Long departmentId;//Áp dụng cho khoa nào
	private Long specialityId;//Áp dụng cho ngành đào tạo nào
	private Long classId;//Áp dụng cho lớp học nào
	private SemesterDto semester;//Áp dụng cho học kỳ nào
	private CourseYearDto courseYear;//Cho khóa học nào
	private DepartmentDto department;//khoa
	private SpecialityDto speciality;//ngành
	private EnrollmentClassDto enrollmentClass; // Lớp nhập học
	private StudyAlertLevelDto studyAlertLevel;
	private Set<StudyAlertConditionLevelDto> conditionLevels;
	private Set<StudyAlertConditionStudentObjectDto> studentObjects;
	private Set<StudyAlertConditionCertificateDto> certificates;
	private Integer studyAlertType = StudyAlertEnum.StudyAlert.getValue();
	private Integer numberCumulativeCreditSemester; //Số tín chỉ tích lũy của học kỳ được xét
	private String numberCumulativeCreditSemesterOperator;//Toán tử : < hoặc <=

	private Integer numberCumulativeCredit2Semester;//Số tín chỉ tích lũy của học kỳ được xét và học kỳ trước đó
	
	private String numberCumulativeCredit2SemesterOperator;//Toán tử : < hoặc <=
	private Double cumulativeMarkSemester;//Điểm trung bình học kỳ

	private String cumulativeMarkSemesterOperator;
	private String cumulativeMarkSemesterType;//Loại điểm trung bình tích lũy học kỳ
	
	private Double cumulativeMark2Semester;//Điểm trung bình  tích lũy 2 học kỳ liên tiếp
	private String cumulativeMark2SemesterType;//Loại Điểm trung bình tích lũy 2 học kỳ liên tiếp
	private String cumulativeMark2SemesterOperator;//Toán tử : < hoặc <=
	private Integer numberLearningCreditSemester;//Tổng số tín chỉ đăng ký học kỳ vừa xét
	private String numberLearningCreditSemesterOperator;//Toán tử : < hoặc <=

	private Integer numberLearningCredit2Semester;//Tổng số tín chỉ tích lũy 2 học kỳ liên tiếp
	private String numberLearningCredit2SemesterOperator;//Toán tử : < hoặc <=
	
	private Integer numberLearningCreditSchoolYear;//Tổng số tín chỉ đăng ký năm học
	private String numberLearningCreditSchoolYearOperator;//Toán tử : < hoặc <=

	private Double learningMarkSemester;//Điểm chung bình chung học kỳ
	private String learningMarkSemesterOperator;//Toán tử : < hoặc <=
	private String learningMarkSemesterType;//Loại (hệ 10 hay hệ 4)
	private Double learningMark2Semester;//Điểm chung bình chung 2 học kỳ liên tiếp
	private String learningMark2SemesterOperator;//Toán tử : < hoặc <=
	private String learningMark2SemesterType;//Loại (hệ 10 hay hệ 4)
	private Double learningMarkSchoolYear;//Điểm chung bình chung năm học
	private String learningMarkSchoolYearOperator;//Toán tử : < hoặc <=
	private String learningMarkSchoolYearType;//Loại (hệ 10 hay hệ 4)
	
	private Double learningMark;//Điểm trung bình chung toàn bộ
	private String learningMarkType;// Loại Điểm trung bình chung toàn bộ
	private String learningMarkOperator;//Toán tử : < hoặc <=
	private Integer numberLearningCredit;//Tổng số tín chỉ đã học
	private String numberLearningCreditOperator;//Toán tử : < hoặc <=
	private Double cumulativeMark;//Điểm trung bình tích lũy toàn bộ
	private String cumulativeMarkOperator;//Toán tử điểm trung bình tích lũy
	private String cumulativeMarkType;// Loại Điểm trung bình tích lũy toàn bộ
	private Integer numberCumulativeCredit; //Số tín chỉ tích lũy toàn bộ
	private String numberCumulativeCreditOperator;//Toán tử : < hoặc <=
	private Boolean isOutOfDurationTime;//Vượt quá thời gian đào tạo không bao gồm thời gian bảo lưu
	private Boolean isIncludeRetain;//Vượt quá thời gian đào tạo bao gồm thời gian bảo lưu
	private Double maxEducationDuration;//Thời gian tối đa cho phép học tại trường

	private Double maxEducationDurationIncludeRetain;//Thời gian tối đa cho phép học tại trường bao gồm bảo lưu
	
	private Boolean isNotCompleteTuitionFee;//Nợ học phí 
	private String condition;//điều kiện
	private DisciplineDto discipline;	//vi phạm kỷ luật	
	private Integer numberDiscipline; //Số lần vi phạm kỷ luật
	
	private Integer numberOfCreditDebt;//Tổng số tín chỉ nợ 	
	private String numberOfCreditDebtOperator;//Toán tử Tổng số tín chỉ nợ >=,>
	private Boolean checkNumberOfCreditDebt;//  Môn không tính điểm nếu =true thì(+ mônKTĐ)
	public Long getSemesterId() {
		return semesterId;
	}
	public void setSemesterId(Long semesterId) {
		this.semesterId = semesterId;
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
	public Long getClassId() {
		return classId;
	}
	public void setClassId(Long classId) {
		this.classId = classId;
	}
	public Integer getStudyAlertType() {
		return studyAlertType;
	}
	public void setStudyAlertType(Integer studyAlertType) {
		this.studyAlertType = studyAlertType;
	}
	
	public Integer getNumberCumulativeCreditSemester() {
		return numberCumulativeCreditSemester;
	}
	public void setNumberCumulativeCreditSemester(Integer numberCumulativeCreditSemester) {
		this.numberCumulativeCreditSemester = numberCumulativeCreditSemester;
	}
	public String getNumberCumulativeCreditSemesterOperator() {
		return numberCumulativeCreditSemesterOperator;
	}
	public void setNumberCumulativeCreditSemesterOperator(String numberCumulativeCreditSemesterOperator) {
		this.numberCumulativeCreditSemesterOperator = numberCumulativeCreditSemesterOperator;
	}
	public Integer getNumberCumulativeCredit2Semester() {
		return numberCumulativeCredit2Semester;
	}
	public void setNumberCumulativeCredit2Semester(Integer numberCumulativeCredit2Semester) {
		this.numberCumulativeCredit2Semester = numberCumulativeCredit2Semester;
	}
	public String getNumberCumulativeCredit2SemesterOperator() {
		return numberCumulativeCredit2SemesterOperator;
	}
	public void setNumberCumulativeCredit2SemesterOperator(String numberCumulativeCredit2SemesterOperator) {
		this.numberCumulativeCredit2SemesterOperator = numberCumulativeCredit2SemesterOperator;
	}
	
	public Double getCumulativeMarkSemester() {
		return cumulativeMarkSemester;
	}
	public void setCumulativeMarkSemester(Double cumulativeMarkSemester) {
		this.cumulativeMarkSemester = cumulativeMarkSemester;
	}
	public String getCumulativeMarkSemesterOperator() {
		return cumulativeMarkSemesterOperator;
	}
	public void setCumulativeMarkSemesterOperator(String cumulativeMarkSemesterOperator) {
		this.cumulativeMarkSemesterOperator = cumulativeMarkSemesterOperator;
	}
	public String getCumulativeMarkSemesterType() {
		return cumulativeMarkSemesterType;
	}
	public void setCumulativeMarkSemesterType(String cumulativeMarkSemesterType) {
		this.cumulativeMarkSemesterType = cumulativeMarkSemesterType;
	}
	public Double getCumulativeMark2Semester() {
		return cumulativeMark2Semester;
	}
	public void setCumulativeMark2Semester(Double cumulativeMark2Semester) {
		this.cumulativeMark2Semester = cumulativeMark2Semester;
	}
	public String getCumulativeMark2SemesterType() {
		return cumulativeMark2SemesterType;
	}
	public void setCumulativeMark2SemesterType(String cumulativeMark2SemesterType) {
		this.cumulativeMark2SemesterType = cumulativeMark2SemesterType;
	}
	public String getCumulativeMark2SemesterOperator() {
		return cumulativeMark2SemesterOperator;
	}
	public void setCumulativeMark2SemesterOperator(String cumulativeMark2SemesterOperator) {
		this.cumulativeMark2SemesterOperator = cumulativeMark2SemesterOperator;
	}
	public Double getLearningMark() {
		return learningMark;
	}
	public void setLearningMark(Double learningMark) {
		this.learningMark = learningMark;
	}
	public String getLearningMarkType() {
		return learningMarkType;
	}
	public void setLearningMarkType(String learningMarkType) {
		this.learningMarkType = learningMarkType;
	}
	public String getLearningMarkOperator() {
		return learningMarkOperator;
	}
	public void setLearningMarkOperator(String learningMarkOperator) {
		this.learningMarkOperator = learningMarkOperator;
	}
	public Integer getNumberLearningCredit() {
		return numberLearningCredit;
	}
	public void setNumberLearningCredit(Integer numberLearningCredit) {
		this.numberLearningCredit = numberLearningCredit;
	}
	public String getNumberLearningCreditOperator() {
		return numberLearningCreditOperator;
	}
	public void setNumberLearningCreditOperator(String numberLearningCreditOperator) {
		this.numberLearningCreditOperator = numberLearningCreditOperator;
	}
	public Integer getNumberLearningCreditSemester() {
		return numberLearningCreditSemester;
	}
	public void setNumberLearningCreditSemester(Integer numberLearningCreditSemester) {
		this.numberLearningCreditSemester = numberLearningCreditSemester;
	}
	public String getNumberLearningCreditSemesterOperator() {
		return numberLearningCreditSemesterOperator;
	}
	public void setNumberLearningCreditSemesterOperator(String numberLearningCreditSemesterOperator) {
		this.numberLearningCreditSemesterOperator = numberLearningCreditSemesterOperator;
	}
	public Integer getNumberLearningCredit2Semester() {
		return numberLearningCredit2Semester;
	}
	public void setNumberLearningCredit2Semester(Integer numberLearningCredit2Semester) {
		this.numberLearningCredit2Semester = numberLearningCredit2Semester;
	}
	public String getNumberLearningCredit2SemesterOperator() {
		return numberLearningCredit2SemesterOperator;
	}
	public void setNumberLearningCredit2SemesterOperator(String numberLearningCredit2SemesterOperator) {
		this.numberLearningCredit2SemesterOperator = numberLearningCredit2SemesterOperator;
	}

	public Double getCumulativeMark() {
		return cumulativeMark;
	}
	public void setCumulativeMark(Double cumulativeMark) {
		this.cumulativeMark = cumulativeMark;
	}
	public String getCumulativeMarkType() {
		return cumulativeMarkType;
	}
	public void setCumulativeMarkType(String cumulativeMarkType) {
		this.cumulativeMarkType = cumulativeMarkType;
	}
	public String getCumulativeMarkOperator() {
		return cumulativeMarkOperator;
	}
	public void setCumulativeMarkOperator(String cumulativeMarkOperator) {
		this.cumulativeMarkOperator = cumulativeMarkOperator;
	}
	public Integer getNumberCumulativeCredit() {
		return numberCumulativeCredit;
	}
	public void setNumberCumulativeCredit(Integer numberCumulativeCredit) {
		this.numberCumulativeCredit = numberCumulativeCredit;
	}
	public String getNumberCumulativeCreditOperator() {
		return numberCumulativeCreditOperator;
	}
	public void setNumberCumulativeCreditOperator(String numberCumulativeCreditOperator) {
		this.numberCumulativeCreditOperator = numberCumulativeCreditOperator;
	}
	public Boolean getIsOutOfDurationTime() {
		return isOutOfDurationTime;
	}
	public void setIsOutOfDurationTime(Boolean isOutOfDurationTime) {
		this.isOutOfDurationTime = isOutOfDurationTime;
	}
	public Boolean getIsIncludeRetain() {
		return isIncludeRetain;
	}
	public void setIsIncludeRetain(Boolean isIncludeRetain) {
		this.isIncludeRetain = isIncludeRetain;
	}
	public Double getMaxEducationDuration() {
		return maxEducationDuration;
	}
	public void setMaxEducationDuration(Double maxEducationDuration) {
		this.maxEducationDuration = maxEducationDuration;
	}
	public Double getMaxEducationDurationIncludeRetain() {
		return maxEducationDurationIncludeRetain;
	}
	public void setMaxEducationDurationIncludeRetain(Double maxEducationDurationIncludeRetain) {
		this.maxEducationDurationIncludeRetain = maxEducationDurationIncludeRetain;
	}
	public Boolean getIsNotCompleteTuitionFee() {
		return isNotCompleteTuitionFee;
	}
	public void setIsNotCompleteTuitionFee(Boolean isNotCompleteTuitionFee) {
		this.isNotCompleteTuitionFee = isNotCompleteTuitionFee;
	}
	
	public SemesterDto getSemester() {
		return semester;
	}
	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}
	public CourseYearDto getCourseYear() {
		return courseYear;
	}
	public void setCourseYear(CourseYearDto courseYear) {
		this.courseYear = courseYear;
	}
	
	public SpecialityDto getSpeciality() {
		return speciality;
	}
	public void setSpeciality(SpecialityDto speciality) {
		this.speciality = speciality;
	}
	public EnrollmentClassDto getEnrollmentClass() {
		return enrollmentClass;
	}
	public void setEnrollmentClass(EnrollmentClassDto enrollmentClass) {
		this.enrollmentClass = enrollmentClass;
	}
	public Set<StudyAlertConditionLevelDto> getConditionLevels() {
		return conditionLevels;
	}
	public void setConditionLevels(Set<StudyAlertConditionLevelDto> conditionLevels) {
		this.conditionLevels = conditionLevels;
	}
	public Set<StudyAlertConditionStudentObjectDto> getStudentObjects() {
		return studentObjects;
	}
	public void setStudentObjects(Set<StudyAlertConditionStudentObjectDto> studentObjects) {
		this.studentObjects = studentObjects;
	}
	public Set<StudyAlertConditionCertificateDto> getCertificates() {
		return certificates;
	}
	public void setCertificates(Set<StudyAlertConditionCertificateDto> certificates) {
		this.certificates = certificates;
	}
	
	public StudyAlertLevelDto getStudyAlertLevel() {
		return studyAlertLevel;
	}
	public void setStudyAlertLevel(StudyAlertLevelDto studyAlertLevel) {
		this.studyAlertLevel = studyAlertLevel;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	public Integer getNumberLearningCreditSchoolYear() {
		return numberLearningCreditSchoolYear;
	}
	public void setNumberLearningCreditSchoolYear(Integer numberLearningCreditSchoolYear) {
		this.numberLearningCreditSchoolYear = numberLearningCreditSchoolYear;
	}
	public String getNumberLearningCreditSchoolYearOperator() {
		return numberLearningCreditSchoolYearOperator;
	}
	public void setNumberLearningCreditSchoolYearOperator(String numberLearningCreditSchoolYearOperator) {
		this.numberLearningCreditSchoolYearOperator = numberLearningCreditSchoolYearOperator;
	}
	public Double getLearningMarkSemester() {
		return learningMarkSemester;
	}
	public void setLearningMarkSemester(Double learningMarkSemester) {
		this.learningMarkSemester = learningMarkSemester;
	}
	public String getLearningMarkSemesterOperator() {
		return learningMarkSemesterOperator;
	}
	public void setLearningMarkSemesterOperator(String learningMarkSemesterOperator) {
		this.learningMarkSemesterOperator = learningMarkSemesterOperator;
	}
	public String getLearningMarkSemesterType() {
		return learningMarkSemesterType;
	}
	public void setLearningMarkSemesterType(String learningMarkSemesterType) {
		this.learningMarkSemesterType = learningMarkSemesterType;
	}
	public Double getLearningMark2Semester() {
		return learningMark2Semester;
	}
	public void setLearningMark2Semester(Double learningMark2Semester) {
		this.learningMark2Semester = learningMark2Semester;
	}
	public String getLearningMark2SemesterOperator() {
		return learningMark2SemesterOperator;
	}
	public void setLearningMark2SemesterOperator(String learningMark2SemesterOperator) {
		this.learningMark2SemesterOperator = learningMark2SemesterOperator;
	}
	public String getLearningMark2SemesterType() {
		return learningMark2SemesterType;
	}
	public void setLearningMark2SemesterType(String learningMark2SemesterType) {
		this.learningMark2SemesterType = learningMark2SemesterType;
	}
	public Double getLearningMarkSchoolYear() {
		return learningMarkSchoolYear;
	}
	public void setLearningMarkSchoolYear(Double learningMarkSchoolYear) {
		this.learningMarkSchoolYear = learningMarkSchoolYear;
	}
	public String getLearningMarkSchoolYearOperator() {
		return learningMarkSchoolYearOperator;
	}
	public void setLearningMarkSchoolYearOperator(String learningMarkSchoolYearOperator) {
		this.learningMarkSchoolYearOperator = learningMarkSchoolYearOperator;
	}
	public String getLearningMarkSchoolYearType() {
		return learningMarkSchoolYearType;
	}
	public void setLearningMarkSchoolYearType(String learningMarkSchoolYearType) {
		this.learningMarkSchoolYearType = learningMarkSchoolYearType;
	}
	public DisciplineDto getDiscipline() {
		return discipline;
	}
	public void setDiscipline(DisciplineDto discipline) {
		this.discipline = discipline;
	}
	public Integer getNumberDiscipline() {
		return numberDiscipline;
	}
	public void setNumberDiscipline(Integer numberDiscipline) {
		this.numberDiscipline = numberDiscipline;
	}
	
	public Integer getNumberOfCreditDebt() {
		return numberOfCreditDebt;
	}
	public void setNumberOfCreditDebt(Integer numberOfCreditDebt) {
		this.numberOfCreditDebt = numberOfCreditDebt;
	}
	public String getNumberOfCreditDebtOperator() {
		return numberOfCreditDebtOperator;
	}
	public void setNumberOfCreditDebtOperator(String numberOfCreditDebtOperator) {
		this.numberOfCreditDebtOperator = numberOfCreditDebtOperator;
	}
	
	public DepartmentDto getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentDto department) {
		this.department = department;
	}
	
	public Boolean getCheckNumberOfCreditDebt() {
		return checkNumberOfCreditDebt;
	}
	public void setCheckNumberOfCreditDebt(Boolean checkNumberOfCreditDebt) {
		this.checkNumberOfCreditDebt = checkNumberOfCreditDebt;
	}
	public StudyAlertConditionDto() {
		
	}
	
	public StudyAlertConditionDto(StudyAlertCondition entity) {
		String code="";
		this.id = entity.getId();
		this.name=entity.getName();
		this.code=entity.getCode();
		if(entity.getSemester()!=null) {
			this.semester=new SemesterDto();
			this.semester.setId(entity.getSemester().getId());
			this.semester.setSemesterName(entity.getSemester().getSemesterName());
			this.semester.setSemesterCode(entity.getSemester().getSemesterCode());
		}
		if(entity.getCourseYear()!=null) {
			this.courseYear=new CourseYearDto();
			this.courseYear.setId(entity.getCourseYear().getId());
			this.courseYear.setName(entity.getCourseYear().getName());
			this.courseYear.setCode(entity.getCourseYear().getCode());
		}
		if(entity.getDepartment()!=null) {
			this.department=new DepartmentDto();
			this.department.setId(entity.getDepartment().getId());
			this.department.setName(entity.getDepartment().getName());
			this.department.setCode(entity.getDepartment().getCode());
		}
		if(entity.getSpeciality()!=null) {
			this.speciality=new SpecialityDto();
			this.speciality.setId(entity.getSpeciality().getId());
			this.speciality.setName(entity.getSpeciality().getName());
			this.speciality.setCode(entity.getSpeciality().getCode());
		}
		if(entity.getEnrollmentClass()!=null) {
			this.enrollmentClass=new EnrollmentClassDto();
			this.enrollmentClass.setId(entity.getEnrollmentClass().getId());
			this.enrollmentClass.setClassCode(entity.getEnrollmentClass().getClassCode());
			this.enrollmentClass.setClassName(entity.getEnrollmentClass().getClassName());
		}
		this.studyAlertType=entity.getStudyAlertType();
		if(entity.getStudyAlertLevel()!=null) {
			this.studyAlertLevel=new StudyAlertLevelDto(entity.getStudyAlertLevel());
		}
		
		this.numberCumulativeCreditSemester=entity.getNumberCumulativeCreditSemester();
		if(entity.getNumberCumulativeCreditSemesterOperator()!=null) {
			code=code+"So TCTL HK "+entity.getNumberCumulativeCreditSemesterOperator() +entity.getNumberCumulativeCreditSemester();
		}
		this.numberCumulativeCreditSemesterOperator=entity.getNumberCumulativeCreditSemesterOperator();
		this.numberCumulativeCredit2Semester=entity.getNumberCumulativeCredit2Semester();
		this.numberCumulativeCredit2SemesterOperator=entity.getNumberCumulativeCredit2SemesterOperator();
		if(entity.getNumberCumulativeCredit2SemesterOperator()!=null) {
			if(code!=null && code.length()>0) {
				code=code+ " AND ";
			}
			code=code+"So TCTL NamHoc "+entity.getNumberCumulativeCredit2SemesterOperator() +entity.getNumberCumulativeCredit2Semester();
		}
		
		this.cumulativeMarkSemester=entity.getCumulativeMarkSemester();
		this.cumulativeMarkSemesterType=entity.getCumulativeMarkSemesterType();
		this.cumulativeMarkSemesterOperator=entity.getCumulativeMarkSemesterOperator();
		if(entity.getCumulativeMarkSemesterOperator()!=null) {
			if(code!=null && code.length()>0) {
				code=code+ " AND ";
			}
			code=code+"Diem TBTL HK "+entity.getCumulativeMarkSemesterOperator() +entity.getCumulativeMarkSemester() +" "+entity.getCumulativeMarkSemesterType();			
		}
		
		this.cumulativeMark2Semester=entity.getCumulativeMark2Semester();
		this.cumulativeMark2SemesterType=entity.getCumulativeMark2SemesterType();
		this.cumulativeMark2SemesterOperator=entity.getCumulativeMark2SemesterOperator();
		if(entity.getCumulativeMark2SemesterOperator()!=null) {
			if(code!=null && code.length()>0) {
				code=code+ " AND ";
			}
			code=code+"Diem TBTL 2 HK LienTiep "+entity.getCumulativeMark2SemesterOperator() +entity.getCumulativeMark2Semester() +" "+entity.getCumulativeMark2SemesterType();			
		}
		
		this.numberLearningCreditSemester=entity.getNumberLearningCreditSemester();
		this.numberLearningCreditSemesterOperator=entity.getNumberLearningCreditSemesterOperator();
		if(entity.getNumberLearningCreditSemesterOperator()!=null) {
			if(code!=null && code.length()>0) {
				code=code+ " AND ";
			}
			code=code+"So TC DangKy HK "+entity.getNumberLearningCreditSemesterOperator() +entity.getNumberLearningCreditSemester() ;			
		}
		this.numberLearningCredit2Semester=entity.getNumberLearningCredit2Semester();
		this.numberLearningCredit2SemesterOperator=entity.getNumberLearningCredit2SemesterOperator();
		if(entity.getNumberLearningCredit2SemesterOperator()!=null) {
			if(code!=null && code.length()>0) {
				code=code+ " AND ";
			}
			code=code+"So TC DangKy HK LienTiep "+entity.getNumberLearningCredit2SemesterOperator() +entity.getNumberLearningCredit2Semester() ;			
		}
		
		this.numberLearningCreditSchoolYear=entity.getNumberLearningCreditSchoolYear();
		this.numberLearningCreditSchoolYearOperator=entity.getNumberLearningCreditSchoolYearOperator();
		if(entity.getNumberLearningCreditSchoolYearOperator()!=null) {
			if(code!=null && code.length()>0) {
				code=code+ " AND ";
			}
			code=code+"So TC DangKy NamHoc "+entity.getNumberLearningCreditSchoolYearOperator() +entity.getNumberLearningCreditSchoolYear() ;			
		}
		
		this.cumulativeMark=entity.getCumulativeMark();
		this.cumulativeMarkType=entity.getCumulativeMarkType();
		this.cumulativeMarkOperator=entity.getCumulativeMarkOperator();
		if(entity.getCumulativeMarkOperator()!=null) {
			if(code!=null && code.length()>0) {
				code=code+ " AND ";
			}
			code=code+"Diem TBTL ToanBo "+entity.getCumulativeMarkOperator() +entity.getCumulativeMark() + " "+ entity.getCumulativeMarkType();			
		}
		this.learningMark=entity.getLearningMark();
		this.learningMarkOperator=entity.getLearningMarkOperator();
		this.learningMarkType=entity.getLearningMarkType();
		if(entity.getLearningMarkOperator()!=null) {
			if(code!=null && code.length()>0) {
				code=code+ " AND ";
			}
			code=code+"Diem TBC ToanBo "+entity.getLearningMarkOperator() +entity.getLearningMark() + " "+ entity.getLearningMarkType();			
		}
		this.learningMarkSemester=entity.getLearningMarkSemester();
		this.learningMarkSemesterOperator=entity.getLearningMarkSemesterOperator();
		this.learningMarkSemesterType=entity.getLearningMarkSemesterType();
		if(entity.getLearningMarkSemesterOperator()!=null) {
			if(code!=null && code.length()>0) {
				code=code+ " AND ";
			}
			code=code+"Diem TBC HK "+entity.getLearningMarkSemesterOperator() +entity.getLearningMarkSemester() + " "+ entity.getLearningMarkSemesterType();			
		}
		this.learningMark2Semester=entity.getLearningMark2Semester();
		this.learningMark2SemesterOperator=entity.getLearningMark2SemesterOperator();
		this.learningMark2SemesterType=entity.getLearningMark2SemesterType();
		if(entity.getLearningMark2SemesterOperator()!=null) {
			if(code!=null && code.length()>0) {
				code=code+ " AND ";
			}
			code=code+"Diem TBC 2 HK "+entity.getLearningMark2SemesterOperator() +entity.getLearningMark2Semester() + " "+ entity.getLearningMark2SemesterType();			
		}
		this.learningMarkSchoolYear=entity.getLearningMarkSchoolYear();
		this.learningMarkSchoolYearOperator=entity.getLearningMarkSchoolYearOperator();
		this.learningMarkSchoolYearType=entity.getLearningMarkSchoolYearType();
		if(entity.getLearningMarkSchoolYearOperator()!=null) {
			if(code!=null && code.length()>0) {
				code=code+ " AND ";
			}
			code=code+"Diem TBC NamHoc "+entity.getLearningMarkSchoolYearOperator() +entity.getLearningMarkSchoolYear() + " "+ entity.getLearningMarkSchoolYearType();			
		}
		
		this.numberCumulativeCredit =entity.getNumberCumulativeCredit();
		this.numberCumulativeCreditOperator=entity.getNumberCumulativeCreditOperator();
		if(entity.getNumberCumulativeCreditOperator()!=null) {
			if(code!=null && code.length()>0) {
				code=code+ " AND ";
			}
			code=code+"So TCTL ToanBo "+entity.getNumberCumulativeCreditOperator() +entity.getNumberCumulativeCredit() ;			
		}
		
		this.isOutOfDurationTime=entity.getIsOutOfDurationTime();
		if(entity.getIsOutOfDurationTime()!=null && entity.getIsOutOfDurationTime()) {
			if(code!=null && code.length()>0) {
				code=code+ " AND ";
			}
			code=code+"Thoi gian dao tao hoc qua";			
		}
		this.isIncludeRetain=entity.getIsIncludeRetain();
		if(entity.getIsIncludeRetain()!=null && entity.getIsIncludeRetain()) {
			if(code!=null && code.length()>0) {
				code=code+ " AND ";
			}
			code=code+"Thoi gian dao tao tinh ca bao luu";			
		}
		this.maxEducationDuration=entity.getMaxEducationDuration();
		
		this.maxEducationDurationIncludeRetain=entity.getMaxEducationDurationIncludeRetain();
		this.isNotCompleteTuitionFee=entity.getIsNotCompleteTuitionFee();
		if(entity.getIsNotCompleteTuitionFee()!=null && entity.getIsNotCompleteTuitionFee()) {
			if(code!=null && code.length()>0) {
				code=code+ " AND ";
			}
			code=code+"No Hoc Phi";			
		}
		this.numberOfCreditDebt=entity.getNumberOfCreditDebt();
		this.numberOfCreditDebtOperator=entity.getNumberOfCreditDebtOperator();
		if(entity.getNumberOfCreditDebtOperator()!=null) {
			if(code!=null && code.length()>0) {
				code=code+ " AND ";
			}
			code=code+"So TC No "+entity.getNumberOfCreditDebtOperator()+entity.getNumberOfCreditDebt();			
		}
		this.checkNumberOfCreditDebt=entity.getCheckNumberOfCreditDebt();
		if(entity.getDiscipline()!=null) {
			this.discipline=new DisciplineDto(entity.getDiscipline());
			this.numberDiscipline=entity.getNumberDiscipline();
		}
		String conditionLevel=" AND ";
		String condi="";
		if (entity.getConditionLevels() != null && entity.getConditionLevels().size() > 0) {
			Set<StudyAlertConditionLevelDto> levels = new HashSet<StudyAlertConditionLevelDto>();
			for (StudyAlertConditionLevel tt : entity.getConditionLevels()) {
				StudyAlertConditionLevelDto ttDto = new StudyAlertConditionLevelDto();
				ttDto.setId(tt.getId());
				ttDto.setConditionType(tt.getConditionType());
				ttDto.setNumberStudyAlert(tt.getNumberStudyAlert());
				ttDto.setOperator(tt.getOperator());
				if(tt.getStudyAlertLevel()!=null) {
					StudyAlertLevelDto dto=new StudyAlertLevelDto(tt.getStudyAlertLevel());
					ttDto.setStudyAlertLevel(dto);
				}
				if(condi!=null && condi.length()>0) {
					condi=condi+ "; ";
				}
				condi=condi+ tt.getStudyAlertLevel().getName() +tt.getOperator()+tt.getNumberStudyAlert().toString();
				if(tt.getConditionType()!=null) {
					if(tt.getConditionType().equals(0)) {
						condi=condi+ "LIENTUC";
					}else if(tt.getConditionType().equals(1)) {
						condi=condi+ "TONG";
					}
				}
				levels.add(ttDto);
			}
			
			if(code!=null && code.length()>0) {
				code=code+ conditionLevel;
			}
			code=code+condi;
			this.setConditionLevels(levels);
		}
		if(entity.getCertificates()!=null && entity.getCertificates().size()>0) {
			String certificate=" CHUNG CHI KHONG DAT: ";
			String certi="";
			Set<StudyAlertConditionCertificateDto> certificates = new HashSet<StudyAlertConditionCertificateDto>();
			for (StudyAlertConditionCertificate tt : entity.getCertificates()) {
				StudyAlertConditionCertificateDto ttDto = new StudyAlertConditionCertificateDto();
				ttDto.setId(tt.getId());
				if(tt.getCertificate()!=null) {
					CertificateDto dto=new CertificateDto(tt.getCertificate());
					ttDto.setCertificate(dto);	
					if(certi!=null && certi.length()>0) {
						certi=certi+ "; ";
					}
					certi=certi+tt.getCertificate().getName() +" ";
				}
				
				certificates.add(ttDto);
			}
			certificate=certificate+certi;
			if(code!=null && code.length()>0) {
				code=code+ " AND ";
			}
			code=code+certificate;
			this.setCertificates(certificates);
		}
		if(entity.getStudentObjects()!=null && entity.getStudentObjects().size()>0) {
			String object=" DOI TUONG SINH VIEN: ";
			String o="";
			Set<StudyAlertConditionStudentObjectDto> studentObjects = new HashSet<StudyAlertConditionStudentObjectDto>();
			for (StudyAlertConditionStudentObject tt : entity.getStudentObjects()) {
				
				StudyAlertConditionStudentObjectDto ttDto = new StudyAlertConditionStudentObjectDto();
				ttDto.setId(tt.getId());
				if(tt.getStudentObject()!=null) {
					StudentObjectDto dto=new StudentObjectDto(tt.getStudentObject());
					ttDto.setStudentObject(dto);
				}
				ttDto.setOperator(tt.getOperator());
				if(o!=null && o.length()>0) {
					o=o+" AND ";
				}
				o=o+ tt.getOperator() +tt.getStudentObject().getName();
				studentObjects.add(ttDto);
				
			}
			object=object+o;
			if(code!=null && code.length()>0) {
				code=code+ " AND ";
			}
			code=code+object;
			this.setStudentObjects(studentObjects);
		}
		this.condition=code;
	}
	
}
