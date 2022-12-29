package com.example.tool.edudto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;

import com.globits.education.domain.StudentCandidateProfile;
import com.globits.education.dto.CourseYearDto;
import com.globits.education.dto.EnrollmentClassDto;
import com.globits.education.dto.SpecialityDto;

public class StudentCandidateProfileSearchDto implements Serializable {
	
	private static final long serialVersionUID = -4502466700609655017L;
		
	private String searchKey;
	
	private boolean checkEnrolled;
	private Boolean isConfirm;
	private String candidateCode;
	
	private String studentObjectCode;
	
	private Integer admissionsYear;//Năm tuyển sinh

	private String lastName;
	
	private String firstName;
	
	private String displayName;//lastName + firstName
	
	private Boolean isEnroll;//Đã nhập học hay chưa?
	/*
	 * Mã sinh viên
	 * Khi thí sinh này thi đỗ và được làm thủ tục nhập học thì lấy mã sinh viên lưu vào trường này 
	 * đánh dấu là đã nhập học, 
	 * khi không nhập học thì để null
	 * tránh trường hợp nhập học 2 lần
	 */
	private String studentCode;
	private Long trainingBaseId;
	private Float firstSubjectScore; //Điểm môn đầu tiên
	private Float firstSubjectName; //Tên môn đầu tiên

	private Float secondSubjectScore; //Điểm môn thứ hai
	private Float secondSubjectName; //Tên môn thứ hai

	private Float thirdSubjectScore; //Điểm môn thứ ba
	private Float thirdSubjectName; //Tên môn thứ ba
	
	private Float totalScore; //Tổng điểm
	
	private Float dtc0; //Tổng điểm chưa có điểm thưởng
	private String reason; //Lý do được điểm thưởng
	
	private String firstSpecialityDetailCode; //Mã ngành chi tiết thứ nhất
	
	private String firstSpecialityCode; //Ngành đăng ký thứ nhất
	
	private String secondSpecialityCode; //Ngành đăng ký thứ hai
	
	private String gender; //Giới tính
	
	private Integer highSchoolGraduationYear;//Năm tốt nghiệp phổ thông trung học
	private String highSchoolGraduation;//Trường tốt nghiệp phổ thông trung học
	private String highSchoolGraduationPlace;//Nơi tốt nghiệp phổ thông trung học
	private String highSchoolGrade;//Xếp loại PTTH
	private String highSchoolConduct;//Xếp loại hạnh kiểm
	
	private Date birthDate;
	
	private String gradeTen;
	
	private String gradeEleven;
	
	private String gradeTwelve;
	
	private String note;
	
	private String areaCode;
	
	private String idNumber;
	
	private String phoneNumber;
	
	private String priorityGroup;
	
	private String contactAddress;
	
	private String provinceCode;
	
	private String districtCode;
	
	private String examRoom;
	
	private String trainingUnits;
	
	private String firstSchool;//Truong1
	
	private String secondSchool;
	
	private String stage;
	
	private String admissionCommittee;
	
	private String firstGroup;
	
	private String secondGroup;
	
	private String admission;
	
	private String admissionCombination;
	
	private boolean isBoarder;//Sinh viên ở nội trú
	/*
	 *Ngành nhập học, 
	 *Khi nhập học, trong trường hợp tìm đúng 1 thí sinh theo số báo danh 
	 * thì lấy luôn ngành cho thí sinh này 
	 */	
	private SpecialityDto specialityDto;
	
	private CourseYearDto courseYearDto;
			
	private EnrollmentClassDto enrollmentClassDto;
	
	private Long courseYearId;
	
	public Boolean getIsEnroll() {
		return isEnroll;
	}

	public void setIsEnroll(Boolean isEnroll) {
		this.isEnroll = isEnroll;
	}

	public String getSearchKey() {
		return searchKey;
	}

	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}

	public boolean isCheckEnrolled() {
		return checkEnrolled;
	}

	public void setCheckEnrolled(boolean checkEnrolled) {
		this.checkEnrolled = checkEnrolled;
	}

	public Boolean getIsConfirm() {
		return isConfirm;
	}

	public void setIsConfirm(Boolean isConfirm) {
		this.isConfirm = isConfirm;
	}

	public String getCandidateCode() {
		return candidateCode;
	}

	public void setCandidateCode(String candidateCode) {
		this.candidateCode = candidateCode;
	}

	public String getStudentObjectCode() {
		return studentObjectCode;
	}

	public void setStudentObjectCode(String studentObjectCode) {
		this.studentObjectCode = studentObjectCode;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getDisplayName() {
		this.displayName="";
		
		if(this.lastName!=null) {
			this.displayName += lastName + " ";
		}
		if(this.firstName!=null) {
			this.displayName += firstName;
		}
		return displayName;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public Long getTrainingBaseId() {
		return trainingBaseId;
	}

	public void setTrainingBaseId(Long trainingBaseId) {
		this.trainingBaseId = trainingBaseId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Float getFirstSubjectScore() {
		return firstSubjectScore;
	}

	public void setFirstSubjectScore(Float firstSubjectScore) {
		this.firstSubjectScore = firstSubjectScore;
	}

	public Float getSecondSubjectScore() {
		return secondSubjectScore;
	}

	public void setSecondSubjectScore(Float secondSubjectScore) {
		this.secondSubjectScore = secondSubjectScore;
	}

	public Float getThirdSubjectScore() {
		return thirdSubjectScore;
	}

	public void setThirdSubjectScore(Float thirdSubjectScore) {
		this.thirdSubjectScore = thirdSubjectScore;
	}

	public Float getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(Float totalScore) {
		this.totalScore = totalScore;
	}

	public Float getDtc0() {
		return dtc0;
	}

	public void setDtc0(Float dtc0) {
		this.dtc0 = dtc0;
	}

	public String getFirstSpecialityCode() {
		return firstSpecialityCode;
	}

	public void setFirstSpecialityCode(String firstSpecialityCode) {
		this.firstSpecialityCode = firstSpecialityCode;
	}

	public String getSecondSpecialityCode() {
		return secondSpecialityCode;
	}

	public void setSecondSpecialityCode(String secondSpecialityCode) {
		this.secondSpecialityCode = secondSpecialityCode;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getHighSchoolGraduationYear() {
		return highSchoolGraduationYear;
	}

	public void setHighSchoolGraduationYear(Integer highSchoolGraduationYear) {
		this.highSchoolGraduationYear = highSchoolGraduationYear;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getGradeTen() {
		return gradeTen;
	}

	public void setGradeTen(String gradeTen) {
		this.gradeTen = gradeTen;
	}

	public String getGradeEleven() {
		return gradeEleven;
	}

	public void setGradeEleven(String gradeEleven) {
		this.gradeEleven = gradeEleven;
	}

	public String getGradeTwelve() {
		return gradeTwelve;
	}

	public void setGradeTwelve(String gradeTwelve) {
		this.gradeTwelve = gradeTwelve;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPriorityGroup() {
		return priorityGroup;
	}

	public void setPriorityGroup(String priorityGroup) {
		this.priorityGroup = priorityGroup;
	}

	public String getContactAddress() {
		return contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getExamRoom() {
		return examRoom;
	}

	public void setExamRoom(String examRoom) {
		this.examRoom = examRoom;
	}

	public String getTrainingUnits() {
		return trainingUnits;
	}

	public void setTrainingUnits(String trainingUnits) {
		this.trainingUnits = trainingUnits;
	}

	public String getFirstSchool() {
		return firstSchool;
	}

	public void setFirstSchool(String firstSchool) {
		this.firstSchool = firstSchool;
	}

	public String getSecondSchool() {
		return secondSchool;
	}

	public void setSecondSchool(String secondSchool) {
		this.secondSchool = secondSchool;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getAdmissionCommittee() {
		return admissionCommittee;
	}

	public void setAdmissionCommittee(String admissionCommittee) {
		this.admissionCommittee = admissionCommittee;
	}

	public String getFirstGroup() {
		return firstGroup;
	}

	public void setFirstGroup(String firstGroup) {
		this.firstGroup = firstGroup;
	}

	public String getSecondGroup() {
		return secondGroup;
	}

	public void setSecondGroup(String secondGroup) {
		this.secondGroup = secondGroup;
	}

	public String getAdmission() {
		return admission;
	}

	public void setAdmission(String admission) {
		this.admission = admission;
	}

	public String getAdmissionCombination() {
		return admissionCombination;
	}

	public void setAdmissionCombination(String admissionCombination) {
		this.admissionCombination = admissionCombination;
	}

	public boolean isBoarder() {
		return isBoarder;
	}

	public void setBoarder(boolean isBoarder) {
		this.isBoarder = isBoarder;
	}
	

	public Integer getAdmissionsYear() {
		return admissionsYear;
	}

	public void setAdmissionsYear(Integer admissionsYear) {
		this.admissionsYear = admissionsYear;
	}

	public Float getFirstSubjectName() {
		return firstSubjectName;
	}

	public void setFirstSubjectName(Float firstSubjectName) {
		this.firstSubjectName = firstSubjectName;
	}

	public Float getSecondSubjectName() {
		return secondSubjectName;
	}

	public void setSecondSubjectName(Float secondSubjectName) {
		this.secondSubjectName = secondSubjectName;
	}

	public Float getThirdSubjectName() {
		return thirdSubjectName;
	}

	public void setThirdSubjectName(Float thirdSubjectName) {
		this.thirdSubjectName = thirdSubjectName;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getHighSchoolGraduation() {
		return highSchoolGraduation;
	}

	public void setHighSchoolGraduation(String highSchoolGraduation) {
		this.highSchoolGraduation = highSchoolGraduation;
	}

	public String getHighSchoolGraduationPlace() {
		return highSchoolGraduationPlace;
	}

	public void setHighSchoolGraduationPlace(String highSchoolGraduationPlace) {
		this.highSchoolGraduationPlace = highSchoolGraduationPlace;
	}

	public String getHighSchoolGrade() {
		return highSchoolGrade;
	}

	public void setHighSchoolGrade(String highSchoolGrade) {
		this.highSchoolGrade = highSchoolGrade;
	}

	public String getHighSchoolConduct() {
		return highSchoolConduct;
	}

	public void setHighSchoolConduct(String highSchoolConduct) {
		this.highSchoolConduct = highSchoolConduct;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public SpecialityDto getSpecialityDto() {
		return specialityDto;
	}

	public void setSpecialityDto(SpecialityDto specialityDto) {
		this.specialityDto = specialityDto;
	}

	public String getFirstSpecialityDetailCode() {
		return firstSpecialityDetailCode;
	}

	public void setFirstSpecialityDetailCode(String firstSpecialityDetailCode) {
		this.firstSpecialityDetailCode = firstSpecialityDetailCode;
	}

	public CourseYearDto getCourseYearDto() {
		return courseYearDto;
	}

	public void setCourseYearDto(CourseYearDto courseYearDto) {
		this.courseYearDto = courseYearDto;
	}

	public EnrollmentClassDto getEnrollmentClassDto() {
		return enrollmentClassDto;
	}

	public void setEnrollmentClassDto(EnrollmentClassDto enrollmentClassDto) {
		this.enrollmentClassDto = enrollmentClassDto;
	}
	
	public Long getCourseYearId() {
		return courseYearId;
	}

	public void setCourseYearId(Long courseYearId) {
		this.courseYearId = courseYearId;
	}

	public StudentCandidateProfileSearchDto() {
	}

//	public StudentCandidateProfileSearchDto(StudentCandidateProfile studentCandidateProfile) {
//		super();
//		if(studentCandidateProfile != null) {
//			this.id = studentCandidateProfile.getId();
//			this.trainingBaseId = studentCandidateProfile.getTrainingBaseId();
//			this.candidateCode = studentCandidateProfile.getCandidateCode();
//			this.studentObjectCode = studentCandidateProfile.getStudentObjectCode();
//			this.admissionsYear=studentCandidateProfile.getAdmissionsYear();
//			this.lastName = studentCandidateProfile.getLastName();
//			this.firstName = studentCandidateProfile.getFirstName();
//			this.firstSubjectScore = studentCandidateProfile.getFirstSubjectScore();
//			this.firstSubjectName=studentCandidateProfile.getFirstSubjectName();
//			this.secondSubjectScore = studentCandidateProfile.getSecondSubjectScore();
//			this.secondSubjectName=studentCandidateProfile.getSecondSubjectName();
//			this.thirdSubjectScore = studentCandidateProfile.getThirdSubjectScore();
//			this.thirdSubjectName=studentCandidateProfile.getThirdSubjectName();
//			this.totalScore = studentCandidateProfile.getTotalScore();
//			this.dtc0 = studentCandidateProfile.getDtc0();
//			this.reason=studentCandidateProfile.getReason();
//			this.firstSpecialityCode = studentCandidateProfile.getFirstSpecialityCode();
//			this.secondSpecialityCode = studentCandidateProfile.getSecondSpecialityCode();
//			this.gender = studentCandidateProfile.getGender();
//			this.highSchoolGraduationYear  = studentCandidateProfile.getHighSchoolGraduationYear();
//			this.highSchoolGraduation=studentCandidateProfile.getHighSchoolGrade();
//			this.highSchoolGraduationPlace=studentCandidateProfile.getHighSchoolGraduationPlace();
//			this.highSchoolGrade=studentCandidateProfile.getHighSchoolGrade();
//			this.highSchoolConduct=studentCandidateProfile.getHighSchoolConduct();
//			this.birthDate = studentCandidateProfile.getBirthDate();
//			this.gradeTen = studentCandidateProfile.getGradeTen();
//			this.gradeEleven = studentCandidateProfile.getGradeEleven();
//			this.gradeTwelve = studentCandidateProfile.getGradeTwelve();
//			this.note = studentCandidateProfile.getNote();
//			this.areaCode = studentCandidateProfile.getAreaCode();
//			this.idNumber = studentCandidateProfile.getIdNumber();
//			this.phoneNumber = studentCandidateProfile.getPhoneNumber();
//			this.priorityGroup = studentCandidateProfile.getPriorityGroup();
//			this.contactAddress = studentCandidateProfile.getContactAddress();
//			this.provinceCode = studentCandidateProfile.getProvinceCode();
//			this.districtCode = studentCandidateProfile.getDistrictCode();
//			this.examRoom = studentCandidateProfile.getExamRoom();
//			this.trainingUnits = studentCandidateProfile.getTrainingUnits();
//			this.firstSchool = studentCandidateProfile.getFirstSchool();
//			this.secondSchool = studentCandidateProfile.getSecondSchool();
//			this.stage = studentCandidateProfile.getStage();
//			this.admissionCommittee = studentCandidateProfile.getAdmissionCommittee();
//			this.firstGroup = studentCandidateProfile.getFirstGroup();
//			this.secondGroup = studentCandidateProfile.getSecondGroup();
//			this.admission = studentCandidateProfile.getAdmission();
//			this.admissionCombination = studentCandidateProfile.getAdmissionCombination();
//			this.studentCode = studentCandidateProfile.getStudentCode();
//			if(this.studentCode!=null && this.studentCode!="") {
//				this.isEnroll = true;
//			}
//			else {
//				this.isEnroll = false;
//			}
//			this.firstSpecialityDetailCode = studentCandidateProfile.getFirstSpecialityDetailCode();
//			if(studentCandidateProfile.getEnrollmentClass()!=null) {
//				this.enrollmentClassDto = new EnrollmentClassDto();
//				this.enrollmentClassDto.setId(studentCandidateProfile.getEnrollmentClass().getId());
//				this.enrollmentClassDto.setClassName(studentCandidateProfile.getEnrollmentClass().getClassName());
//				this.enrollmentClassDto.setClassCode(studentCandidateProfile.getEnrollmentClass().getClassCode());
//				if(studentCandidateProfile.getEnrollmentClass().getSpeciality()!=null) {
//					this.enrollmentClassDto.setSpeciality(new SpecialityDto());
//					this.enrollmentClassDto.getSpeciality().setId(studentCandidateProfile.getEnrollmentClass().getSpeciality().getId());
//					this.enrollmentClassDto.getSpeciality().setName(studentCandidateProfile.getEnrollmentClass().getSpeciality().getName());
//				}
//				if(studentCandidateProfile.getEnrollmentClass().getCourseyear()!=null) {
//					this.enrollmentClassDto.setCourseyear(new CourseYearDto());
//					this.enrollmentClassDto.getCourseyear().setId(studentCandidateProfile.getEnrollmentClass().getCourseyear().getId());
//					this.enrollmentClassDto.getCourseyear().setCode(studentCandidateProfile.getEnrollmentClass().getCourseyear().getCode());
//					this.enrollmentClassDto.getCourseyear().setName(studentCandidateProfile.getEnrollmentClass().getCourseyear().getName());
//				}
//			}
//			if(studentCandidateProfile.getCourseYear()!=null) {
//				this.courseYearDto = new CourseYearDto();
//				this.courseYearDto.setName(studentCandidateProfile.getCourseYear().getName());
//				this.courseYearDto.setCode(studentCandidateProfile.getCourseYear().getCode());
//				this.courseYearDto.setId(studentCandidateProfile.getCourseYear().getId());
//			}
//		}
//	}
	
}
