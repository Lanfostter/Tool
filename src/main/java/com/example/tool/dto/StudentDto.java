package com.example.tool.dto;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.globits.core.dto.EthnicsDto;
import com.globits.core.dto.PersonDto;
import com.globits.core.dto.ProfessionDto;
import com.globits.core.dto.ReligionDto;
import com.globits.core.dto.StatusDto;
import com.globits.education.Const;
import com.globits.education.domain.Student;
import com.globits.education.domain.StudentCandidateProfile;
import com.globits.education.domain.StudentDecision;
import com.globits.education.domain.StudentEducationProgram;
import com.globits.education.domain.StudentObjectStudent;
import com.globits.education.domain.StudentObjectStudentSemester;
import com.globits.education.domain.StudentStatusStudentSemester;
import com.globits.education.dto.view.ViewStudentVoucherReceivePayDto;
import com.globits.education.utils.EducationConstant;
import com.globits.security.dto.UserDto;

public class StudentDto extends PersonDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String studentCode;

	private Integer highSchoolGraduationYear;// Năm tốt nghiệp phổ thông trung học

	private Integer yearOfAdmission;// Năm bắt đầu học

	private String fatherFullName; // Họ tên bố

	private String motherFullName; // Họ tên mẹ

	private Date fatherBirthDate; // Ngày sinh bố
	private String fatherBirthDateString;
	private Date motherBirthDate; // Ngày sinh mẹ
	private String motherBirthDateString;
	private Boolean isBoarder;
	private ProfessionDto fatherProfession;// Nghề nghiệp bố

	private ProfessionDto motherProfession; // Nghề nghiệp mẹ
	private String fatherPhoneNumber; // Số đt bố
	private String motherPhoneNumber; // Số đt mẹ

	
	private Integer status;
	private Boolean updateStatus = true;
	private Boolean isStatusStudentExamRoom = false;//xét sinh viên  tồn tại ở phòng thi
	private Boolean isHave = false;//xét sinh viên  lưu vào phòng thi
	private Boolean isExempt = false;//xét trường hợp không học nhưng thi để lấy hệ số=1
	private String courseYear;
	private String department;
	private String speciality;
	private String specialityEng;
	private String className;
	private String classCode;
	private Boolean isAbleToGraduate;
	private Boolean isInGraduateList;
	
	private Integer subjectStatus;//Dùng cho trạng của sinh viên trong lớp học phần
	private Long studentCourseSubjectId;
	private ViewStudentVoucherReceivePayDto viewStudentVoucherReceivePayDto;
	
	private String statusName;//trạng thái sv
	private String statusSemesterName;//trạng thái sv theo học kỳ
	private String note; // ghi chu
	private StatusDto studentStatus;//trạng thái sinh viên
	/*Phân loại đối tượng theo hệ - khóa hỗn hợp (hiện tại chỉ dùng cho báo có thu học phí theo ngày+ tổng hợp học bổng)
	 * 1=DHCQ,CD
	 * 2=DHTC
	 * 3=CAOHOC,NCS
	 * 4=LT
	 * 5=CTTT
	 */
	private int studentType;
	private Boolean payedAdmissionFee;
	private Boolean userActive;
	public String getStudentCode() {
		return studentCode;
	}
	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}
	public Integer getHighSchoolGraduationYear() {
		return highSchoolGraduationYear;
	}
	public void setHighSchoolGraduationYear(Integer highSchoolGraduationYear) {
		this.highSchoolGraduationYear = highSchoolGraduationYear;
	}
	public Integer getYearOfAdmission() {
		return yearOfAdmission;
	}
	public void setYearOfAdmission(Integer yearOfAdmission) {
		this.yearOfAdmission = yearOfAdmission;
	}
	public String getFatherFullName() {
		return fatherFullName;
	}
	public void setFatherFullName(String fatherFullName) {
		this.fatherFullName = fatherFullName;
	}
	public String getMotherFullName() {
		return motherFullName;
	}
	public void setMotherFullName(String motherFullName) {
		this.motherFullName = motherFullName;
	}
	public Date getFatherBirthDate() {
		return fatherBirthDate;
	}
	public void setFatherBirthDate(Date fatherBirthDate) {
		this.fatherBirthDate = fatherBirthDate;
	}
	public String getFatherBirthDateString() {
		return fatherBirthDateString;
	}
	public void setFatherBirthDateString(String fatherBirthDateString) {
		this.fatherBirthDateString = fatherBirthDateString;
	}
	public Date getMotherBirthDate() {
		return motherBirthDate;
	}
	public void setMotherBirthDate(Date motherBirthDate) {
		this.motherBirthDate = motherBirthDate;
	}
	public String getMotherBirthDateString() {
		return motherBirthDateString;
	}
	public void setMotherBirthDateString(String motherBirthDateString) {
		this.motherBirthDateString = motherBirthDateString;
	}
	public Boolean getIsBoarder() {
		return isBoarder;
	}
	public void setIsBoarder(Boolean isBoarder) {
		this.isBoarder = isBoarder;
	}
	public ProfessionDto getFatherProfession() {
		return fatherProfession;
	}
	public void setFatherProfession(ProfessionDto fatherProfession) {
		this.fatherProfession = fatherProfession;
	}
	public ProfessionDto getMotherProfession() {
		return motherProfession;
	}
	public void setMotherProfession(ProfessionDto motherProfession) {
		this.motherProfession = motherProfession;
	}
	public String getFatherPhoneNumber() {
		return fatherPhoneNumber;
	}
	public void setFatherPhoneNumber(String fatherPhoneNumber) {
		this.fatherPhoneNumber = fatherPhoneNumber;
	}
	public String getMotherPhoneNumber() {
		return motherPhoneNumber;
	}
	public void setMotherPhoneNumber(String motherPhoneNumber) {
		this.motherPhoneNumber = motherPhoneNumber;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Boolean getUpdateStatus() {
		return updateStatus;
	}
	public void setUpdateStatus(Boolean updateStatus) {
		this.updateStatus = updateStatus;
	}
	public Boolean getIsStatusStudentExamRoom() {
		return isStatusStudentExamRoom;
	}
	public void setIsStatusStudentExamRoom(Boolean isStatusStudentExamRoom) {
		this.isStatusStudentExamRoom = isStatusStudentExamRoom;
	}
	public Boolean getIsHave() {
		return isHave;
	}
	public void setIsHave(Boolean isHave) {
		this.isHave = isHave;
	}
	public Boolean getIsExempt() {
		return isExempt;
	}
	public void setIsExempt(Boolean isExempt) {
		this.isExempt = isExempt;
	}
	public String getCourseYear() {
		return courseYear;
	}
	public void setCourseYear(String courseYear) {
		this.courseYear = courseYear;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getSpecialityEng() {
		return specialityEng;
	}
	public void setSpecialityEng(String specialityEng) {
		this.specialityEng = specialityEng;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getClassCode() {
		return classCode;
	}
	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}
	public Boolean getIsAbleToGraduate() {
		return isAbleToGraduate;
	}
	public void setIsAbleToGraduate(Boolean isAbleToGraduate) {
		this.isAbleToGraduate = isAbleToGraduate;
	}
	public Boolean getIsInGraduateList() {
		return isInGraduateList;
	}
	public void setIsInGraduateList(Boolean isInGraduateList) {
		this.isInGraduateList = isInGraduateList;
	}
	public Integer getSubjectStatus() {
		return subjectStatus;
	}
	public void setSubjectStatus(Integer subjectStatus) {
		this.subjectStatus = subjectStatus;
	}
	public Long getStudentCourseSubjectId() {
		return studentCourseSubjectId;
	}
	public void setStudentCourseSubjectId(Long studentCourseSubjectId) {
		this.studentCourseSubjectId = studentCourseSubjectId;
	}
	public ViewStudentVoucherReceivePayDto getViewStudentVoucherReceivePayDto() {
		return viewStudentVoucherReceivePayDto;
	}
	public void setViewStudentVoucherReceivePayDto(ViewStudentVoucherReceivePayDto viewStudentVoucherReceivePayDto) {
		this.viewStudentVoucherReceivePayDto = viewStudentVoucherReceivePayDto;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	public String getStatusSemesterName() {
		return statusSemesterName;
	}
	public void setStatusSemesterName(String statusSemesterName) {
		this.statusSemesterName = statusSemesterName;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public StatusDto getStudentStatus() {
		return studentStatus;
	}
	public void setStudentStatus(StatusDto studentStatus) {
		this.studentStatus = studentStatus;
	}
	public int getStudentType() {
		return studentType;
	}
	public void setStudentType(int studentType) {
		this.studentType = studentType;
	}
	public Boolean getPayedAdmissionFee() {
		return payedAdmissionFee;
	}
	public void setPayedAdmissionFee(Boolean payedAdmissionFee) {
		this.payedAdmissionFee = payedAdmissionFee;
	}
	public Boolean getUserActive() {
		return userActive;
	}
	public void setUserActive(Boolean userActive) {
		this.userActive = userActive;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public StudentDto(String studentCode, Integer highSchoolGraduationYear, Integer yearOfAdmission,
			String fatherFullName, String motherFullName, Date fatherBirthDate, String fatherBirthDateString,
			Date motherBirthDate, String motherBirthDateString, Boolean isBoarder, ProfessionDto fatherProfession,
			ProfessionDto motherProfession, String fatherPhoneNumber, String motherPhoneNumber, Integer status,
			Boolean updateStatus, Boolean isStatusStudentExamRoom, Boolean isHave, Boolean isExempt, String courseYear,
			String department, String speciality, String specialityEng, String className, String classCode,
			Boolean isAbleToGraduate, Boolean isInGraduateList, Integer subjectStatus, Long studentCourseSubjectId,
			ViewStudentVoucherReceivePayDto viewStudentVoucherReceivePayDto, String statusName,
			String statusSemesterName, String note, StatusDto studentStatus, int studentType, Boolean payedAdmissionFee,
			Boolean userActive) {
		super();
		this.studentCode = studentCode;
		this.highSchoolGraduationYear = highSchoolGraduationYear;
		this.yearOfAdmission = yearOfAdmission;
		this.fatherFullName = fatherFullName;
		this.motherFullName = motherFullName;
		this.fatherBirthDate = fatherBirthDate;
		this.fatherBirthDateString = fatherBirthDateString;
		this.motherBirthDate = motherBirthDate;
		this.motherBirthDateString = motherBirthDateString;
		this.isBoarder = isBoarder;
		this.fatherProfession = fatherProfession;
		this.motherProfession = motherProfession;
		this.fatherPhoneNumber = fatherPhoneNumber;
		this.motherPhoneNumber = motherPhoneNumber;
		this.status = status;
		this.updateStatus = updateStatus;
		this.isStatusStudentExamRoom = isStatusStudentExamRoom;
		this.isHave = isHave;
		this.isExempt = isExempt;
		this.courseYear = courseYear;
		this.department = department;
		this.speciality = speciality;
		this.specialityEng = specialityEng;
		this.className = className;
		this.classCode = classCode;
		this.isAbleToGraduate = isAbleToGraduate;
		this.isInGraduateList = isInGraduateList;
		this.subjectStatus = subjectStatus;
		this.studentCourseSubjectId = studentCourseSubjectId;
		this.viewStudentVoucherReceivePayDto = viewStudentVoucherReceivePayDto;
		this.statusName = statusName;
		this.statusSemesterName = statusSemesterName;
		this.note = note;
		this.studentStatus = studentStatus;
		this.studentType = studentType;
		this.payedAdmissionFee = payedAdmissionFee;
		this.userActive = userActive;
	}
	public StudentDto() {
		super();
	}
	
	

}
