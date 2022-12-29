package com.example.tool.edudto;

import java.util.Date;
import java.util.List;

public class StudentSearchDto {
	
	private Long studentId;
	private List<Long> studentIds;
	private String firstName;
	private String lastName;
	private Date birthDate;
	private String classCode;
	private String nameCode;
	private Integer status;
	private List<Long> studentNotIds;
	private List<Long> statusStudent;
	
	private Long courseYearId;
	private Long departmentId;	
	private Long specialityId;
	private Long enrollmentClassId;
	private Long semesterId;
	private Long courseSubjectId;
	private Long subjectId;
	private Long semesterRegisterPeriodDtoId;
	private Long trainingBaseId;

	private List<Long> listEnrollmentClassId;
	private List<Long> courseSubjectIds;
	private Integer receivePayAbleStatus;
	
	private Integer isReceive;
	private Integer type;
	private Integer typeExpectationRegister;
	private Integer statusExpectationRegister;
	private Date fromDate;
	private Date toDate;
	private String gender;
	private Date fromDateDecision;
	private Date toDateDecision;
	private Integer monthDecision;
	private List<Long> decisionTypeIds;
	private Boolean checkBankAccount;
	private Long schoolYearId;
	private String address;
	private Boolean isStudentObjectSemester;
	private Boolean voided;
	private Boolean isSubjectStatus;//true không tính trường hợp hủy đăng ký học
	private Boolean isRoleStudent;//quyền sinh viên
	private Boolean active;//trạng thái kích hoạt tài khoản
	
	private List<Long>listStatus;//danh sách trạng thái sinh viên
	private List<Long> listNotStatus;//
	private List<Long>listStatusSemester;//danh sách trạng thái sv theo kỳ
	
	private int simpleLevel;
	private int syncLevel;
	private boolean setIsSync;
	private boolean hasReg;
	
	public List<Long> getListEnrollmentClassId() {
		return listEnrollmentClassId;
	}
	public void setListEnrollmentClassId(List<Long> listEnrollmentClassId) {
		this.listEnrollmentClassId = listEnrollmentClassId;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public List<Long> getStudentIds() {
		return studentIds;
	}
	public void setStudentIds(List<Long> studentIds) {
		this.studentIds = studentIds;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getClassCode() {
		return classCode;
	}
	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}
	public String getNameCode() {
		return nameCode;
	}
	public void setNameCode(String nameCode) {
		this.nameCode = nameCode;
	}
	public Integer getIsReceive() {
		return isReceive;
	}
	public void setIsReceive(Integer isReceive) {
		this.isReceive = isReceive;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
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
	public Long getSemesterId() {
		return semesterId;
	}
	public void setSemesterId(Long semesterId) {
		this.semesterId = semesterId;
	}
	public Long getCourseSubjectId() {
		return courseSubjectId;
	}
	public void setCourseSubjectId(Long courseSubjectId) {
		this.courseSubjectId = courseSubjectId;
	}
	public List<Long> getCourseSubjectIds() {
		return courseSubjectIds;
	}
	public void setCourseSubjectIds(List<Long> courseSubjectIds) {
		this.courseSubjectIds = courseSubjectIds;
	}
	public Integer getReceivePayAbleStatus() {
		return receivePayAbleStatus;
	}
	public void setReceivePayAbleStatus(Integer receivePayAbleStatus) {
		this.receivePayAbleStatus = receivePayAbleStatus;
	}
	public Integer getTypeExpectationRegister() {
		return typeExpectationRegister;
	}
	public void setTypeExpectationRegister(Integer typeExpectationRegister) {
		this.typeExpectationRegister = typeExpectationRegister;
	}
	public Long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}
	public Long getSemesterRegisterPeriodDtoId() {
		return semesterRegisterPeriodDtoId;
	}
	public void setSemesterRegisterPeriodDtoId(Long semesterRegisterPeriodDtoId) {
		this.semesterRegisterPeriodDtoId = semesterRegisterPeriodDtoId;
	}
	public Long getTrainingBaseId() {
		return trainingBaseId;
	}
	public void setTrainingBaseId(Long trainingBaseId) {
		this.trainingBaseId = trainingBaseId;
	}
	public Integer getStatusExpectationRegister() {
		return statusExpectationRegister;
	}
	public void setStatusExpectationRegister(Integer statusExpectationRegister) {
		this.statusExpectationRegister = statusExpectationRegister;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getFromDateDecision() {
		return fromDateDecision;
	}
	public void setFromDateDecision(Date fromDateDecision) {
		this.fromDateDecision = fromDateDecision;
	}
	public Date getToDateDecision() {
		return toDateDecision;
	}
	public void setToDateDecision(Date toDateDecision) {
		this.toDateDecision = toDateDecision;
	}
	
	public Integer getMonthDecision() {
		return monthDecision;
	}
	public void setMonthDecision(Integer monthDecision) {
		this.monthDecision = monthDecision;
	}
	public List<Long> getDecisionTypeIds() {
		return decisionTypeIds;
	}
	public void setDecisionTypeIds(List<Long> decisionTypeIds) {
		this.decisionTypeIds = decisionTypeIds;
	}
	public Boolean getCheckBankAccount() {
		return checkBankAccount;
	}
	public void setCheckBankAccount(Boolean checkBankAccount) {
		this.checkBankAccount = checkBankAccount;
	}
	public Long getSchoolYearId() {
		return schoolYearId;
	}
	public void setSchoolYearId(Long schoolYearId) {
		this.schoolYearId = schoolYearId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Boolean getIsStudentObjectSemester() {
		return isStudentObjectSemester;
	}
	public void setIsStudentObjectSemester(Boolean isStudentObjectSemester) {
		this.isStudentObjectSemester = isStudentObjectSemester;
	}
	public Boolean getVoided() {
		return voided;
	}
	public void setVoided(Boolean voided) {
		this.voided = voided;
	}
	public Boolean getIsSubjectStatus() {
		return isSubjectStatus;
	}
	public void setIsSubjectStatus(Boolean isSubjectStatus) {
		this.isSubjectStatus = isSubjectStatus;
	}
	
	public List<Long> getStudentNotIds() {
		return studentNotIds;
	}
	public void setStudentNotIds(List<Long> studentNotIds) {
		this.studentNotIds = studentNotIds;
	}
	public Boolean getIsRoleStudent() {
		return isRoleStudent;
	}
	public void setIsRoleStudent(Boolean isRoleStudent) {
		this.isRoleStudent = isRoleStudent;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public List<Long> getStatusStudent() {
		return statusStudent;
	}
	public void setStatusStudent(List<Long> statusStudent) {
		this.statusStudent = statusStudent;
	}
	public List<Long> getListStatus() {
		return listStatus;
	}
	public void setListStatus(List<Long> listStatus) {
		this.listStatus = listStatus;
	}
	public List<Long> getListNotStatus() {
		return listNotStatus;
	}
	public void setListNotStatus(List<Long> listNotStatus) {
		this.listNotStatus = listNotStatus;
	}
	public List<Long> getListStatusSemester() {
		return listStatusSemester;
	}
	public void setListStatusSemester(List<Long> listStatusSemester) {
		this.listStatusSemester = listStatusSemester;
	}
	public int getSimpleLevel() {
		return simpleLevel;
	}
	public void setSimpleLevel(int simpleLevel) {
		this.simpleLevel = simpleLevel;
	}
	public int getSyncLevel() {
		return syncLevel;
	}
	public void setSyncLevel(int syncLevel) {
		this.syncLevel = syncLevel;
	}
	public boolean isSetIsSync() {
		return setIsSync;
	}
	public void setSetIsSync(boolean setIsSync) {
		this.setIsSync = setIsSync;
	}
	public boolean isHasReg() {
		return hasReg;
	}
	public void setHasReg(boolean hasReg) {
		this.hasReg = hasReg;
	}
}
