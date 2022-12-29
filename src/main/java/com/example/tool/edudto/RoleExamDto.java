package com.example.tool.edudto;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.globits.core.domain.Department;
import com.globits.core.domain.TrainingBase;
import com.globits.core.dto.DepartmentDto;
import com.globits.core.dto.TrainingBaseDto;
import com.globits.education.domain.CourseSubject;
import com.globits.education.domain.CourseYear;
import com.globits.education.domain.EnrollmentClass;
import com.globits.education.domain.ExamRegisterPeriod;
import com.globits.education.domain.RoleExam;
import com.globits.education.domain.Semester;
import com.globits.education.domain.SemesterRegisterPeriod;
import com.globits.education.domain.SemesterSubject;
import com.globits.education.domain.SemesterSubjectExamRoom;
import com.globits.education.domain.Speciality;
import com.globits.education.domain.Subject;
import com.globits.education.domain.SubjectExam;
import com.globits.education.domain.TestBag;
import com.globits.education.dto.CourseSubjectDto;
import com.globits.education.dto.CourseYearDto;
import com.globits.education.dto.EnrollmentClassDto;
import com.globits.education.dto.ExamRegisterPeriodDto;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.SemesterRegisterPeriodDto;
import com.globits.education.dto.SemesterSubjectDto;
import com.globits.education.dto.SemesterSubjectExamDto;
import com.globits.education.dto.SpecialityDto;
import com.globits.education.dto.SubjectDto;
import com.globits.education.dto.SubjectExamDto;
import com.globits.education.dto.TestBagDto;
import com.globits.security.domain.User;
import com.globits.security.dto.UserDto;

public class RoleExamDto {
	
	private Long id;
	private boolean input; // nhập
	private boolean edit; // sửa
	private boolean delete; // xóa
	private boolean publish; // công bố điểm
	private Date startDate; // Từ ngày
	private Date endDate; // Đến ngày
	private Integer type; // Trường này để phân biệt form
	private UserDto user;
	private String userName;
	private TrainingBaseDto trainingBase;
	private String trainingBaseName;
	private CourseYearDto courseYear;
	private String courseYearName;
	private DepartmentDto department;
	private String departmentName;
	private SpecialityDto speciality;
	private String specialityName;
	private EnrollmentClassDto enrollmentClass;
	private String enrollmentClassName;
	private SemesterDto semester;
	private String semesterName;
	private SemesterRegisterPeriodDto semesterRegisterPeriod;
	private String semesterRegisterPeriodName;
	private SemesterSubjectDto semesterSubject;
	private String semesterSubjectName;
	private CourseSubjectDto courseSubject;
	private String courseSubjectName;
	private SubjectExamDto subjectExam;
	private String subjectExamName;
	private ExamRegisterPeriodDto examRegisterPeriod;
	private String examRegisterPeriodName;
	private TestBagDto testBag;
	private String testBagName;
	private SubjectDto subject;
	private String subjectName;
	private SemesterSubjectExamDto semesterSubjectExam;
	private String semesterSubjectExamName;
	private String statusPermission = "Chờ phê duyệt";
	private SemesterSubjectExamRoom semesterSubjectExamRoom;
	private String semesterSubjectExamRoomName;
	private CourseYearDto courseYearCS;
	private String courseYearCSName;
	
	public CourseYearDto getCourseYearCS() {
		return courseYearCS;
	}
	public void setCourseYearCS(CourseYearDto courseYearCS) {
		this.courseYearCS = courseYearCS;
	}
	public String getCourseYearCSName() {
		return courseYearCSName;
	}
	public void setCourseYearCSName(String courseYearCSName) {
		this.courseYearCSName = courseYearCSName;
	}
	public String getSemesterSubjectExamRoomName() {
		return semesterSubjectExamRoomName;
	}
	public void setSemesterSubjectExamRoomName(String semesterSubjectExamRoomName) {
		this.semesterSubjectExamRoomName = semesterSubjectExamRoomName;
	}
	public SemesterSubjectExamRoom getSemesterSubjectExamRoom() {
		return semesterSubjectExamRoom;
	}
	public void setSemesterSubjectExamRoom(SemesterSubjectExamRoom semesterSubjectExamRoom) {
		this.semesterSubjectExamRoom = semesterSubjectExamRoom;
	}
	public SemesterSubjectExamDto getSemesterSubjectExam() {
		return semesterSubjectExam;
	}
	public void setSemesterSubjectExam(SemesterSubjectExamDto semesterSubjectExam) {
		this.semesterSubjectExam = semesterSubjectExam;
	}
	public String getSemesterSubjectExamName() {
		return semesterSubjectExamName;
	}
	public void setSemesterSubjectExamName(String semesterSubjectExamName) {
		this.semesterSubjectExamName = semesterSubjectExamName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public boolean isInput() {
		return input;
	}
	public void setInput(boolean input) {
		this.input = input;
	}
	public boolean isEdit() {
		return edit;
	}
	public void setEdit(boolean edit) {
		this.edit = edit;
	}
	public boolean isDelete() {
		return delete;
	}
	public void setDelete(boolean delete) {
		this.delete = delete;
	}
	public boolean isPublish() {
		return publish;
	}
	public void setPublish(boolean publish) {
		this.publish = publish;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public UserDto getUser() {
		return user;
	}
	public void setUser(UserDto user) {
		this.user = user;
	}
	public TrainingBaseDto getTrainingBase() {
		return trainingBase;
	}
	public void setTrainingBase(TrainingBaseDto trainingBase) {
		this.trainingBase = trainingBase;
	}
	public CourseYearDto getCourseYear() {
		return courseYear;
	}
	public void setCourseYear(CourseYearDto courseYear) {
		this.courseYear = courseYear;
	}
	public DepartmentDto getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentDto department) {
		this.department = department;
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
	public SemesterDto getSemester() {
		return semester;
	}
	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}
	public SemesterRegisterPeriodDto getSemesterRegisterPeriod() {
		return semesterRegisterPeriod;
	}
	public void setSemesterRegisterPeriod(SemesterRegisterPeriodDto semesterRegisterPeriod) {
		this.semesterRegisterPeriod = semesterRegisterPeriod;
	}
	public SemesterSubjectDto getSemesterSubject() {
		return semesterSubject;
	}
	public void setSemesterSubject(SemesterSubjectDto semesterSubject) {
		this.semesterSubject = semesterSubject;
	}
	public CourseSubjectDto getCourseSubject() {
		return courseSubject;
	}
	public void setCourseSubject(CourseSubjectDto courseSubject) {
		this.courseSubject = courseSubject;
	}
	public SubjectExamDto getSubjectExam() {
		return subjectExam;
	}
	public void setSubjectExam(SubjectExamDto subjectExam) {
		this.subjectExam = subjectExam;
	}
	public ExamRegisterPeriodDto getExamRegisterPeriod() {
		return examRegisterPeriod;
	}
	public void setExamRegisterPeriod(ExamRegisterPeriodDto examRegisterPeriod) {
		this.examRegisterPeriod = examRegisterPeriod;
	}
	public TestBagDto getTestBag() {
		return testBag;
	}
	public void setTestBag(TestBagDto testBag) {
		this.testBag = testBag;
	}
	
	public String getTrainingBaseName() {
		return trainingBaseName;
	}
	public void setTrainingBaseName(String trainingBaseName) {
		this.trainingBaseName = trainingBaseName;
	}
	public String getCourseYearName() {
		return courseYearName;
	}
	public void setCourseYearName(String courseYearName) {
		this.courseYearName = courseYearName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getSpecialityName() {
		return specialityName;
	}
	public void setSpecialityName(String specialityName) {
		this.specialityName = specialityName;
	}
	public String getEnrollmentClassName() {
		return enrollmentClassName;
	}
	public void setEnrollmentClassName(String enrollmentClassName) {
		this.enrollmentClassName = enrollmentClassName;
	}
	public String getSemesterName() {
		return semesterName;
	}
	public void setSemesterName(String semesterName) {
		this.semesterName = semesterName;
	}
	public String getSemesterRegisterPeriodName() {
		return semesterRegisterPeriodName;
	}
	public void setSemesterRegisterPeriodName(String semesterRegisterPeriodName) {
		this.semesterRegisterPeriodName = semesterRegisterPeriodName;
	}
	public String getSemesterSubjectName() {
		return semesterSubjectName;
	}
	public void setSemesterSubjectName(String semesterSubjectName) {
		this.semesterSubjectName = semesterSubjectName;
	}
	public String getCourseSubjectName() {
		return courseSubjectName;
	}
	public void setCourseSubjectName(String courseSubjectName) {
		this.courseSubjectName = courseSubjectName;
	}
	public String getSubjectExamName() {
		return subjectExamName;
	}
	public void setSubjectExamName(String subjectExamName) {
		this.subjectExamName = subjectExamName;
	}
	public String getExamRegisterPeriodName() {
		return examRegisterPeriodName;
	}
	public void setExamRegisterPeriodName(String examRegisterPeriodName) {
		this.examRegisterPeriodName = examRegisterPeriodName;
	}
	public String getTestBagName() {
		return testBagName;
	}
	public void setTestBagName(String testBagName) {
		this.testBagName = testBagName;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public SubjectDto getSubject() {
		return subject;
	}
	public void setSubject(SubjectDto subject) {
		this.subject = subject;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public String getStatusPermission() {
		return statusPermission;
	}
	public void setStatusPermission(String statusPermission) {
		this.statusPermission = statusPermission;
	}
	public RoleExamDto() {
		
	}
	
	public RoleExamDto(RoleExam roleExam) {
		if(roleExam != null) {
			this.id = roleExam.getId();
			this.input = roleExam.isInput();
			this.edit = roleExam.isEdit();
			this.delete = roleExam.isDelete();
			this.publish = roleExam.isDelete();
			if(roleExam.getCourseSubject() != null) {
				this.courseSubject = new CourseSubjectDto(roleExam.getCourseSubject());
			}
			if(roleExam.getCourseYear() != null) {
				this.courseYear = new CourseYearDto(roleExam.getCourseYear());
			}
			if(roleExam.getDepartment() != null) {
				this.department = new DepartmentDto(roleExam.getDepartment());
			}
			if(roleExam.getEndDate() != null) {
				this.endDate = roleExam.getEndDate();
			}
			if(roleExam.getStartDate() != null) {
				this.startDate =roleExam.getStartDate();
			}
			if(roleExam.getEnrollmentClass() != null) {
				this.enrollmentClass = new EnrollmentClassDto(roleExam.getEnrollmentClass());
			}
			if(roleExam.getExamRegisterPeriod() != null) {
				this.examRegisterPeriod = new ExamRegisterPeriodDto(roleExam.getExamRegisterPeriod());
			}
			if(roleExam.getSemester() != null) {
				this.semester = new SemesterDto(roleExam.getSemester());
			}
			if(roleExam.getSemesterRegisterPeriod() != null) {
				this.semesterRegisterPeriod = new SemesterRegisterPeriodDto(roleExam.getSemesterRegisterPeriod());
			}
			if(roleExam.getSemesterSubject() != null) {
				this.semesterSubject = new SemesterSubjectDto(roleExam.getSemesterSubject());
			}
			if(roleExam.getSpeciality() != null) {
				this.speciality = new SpecialityDto(roleExam.getSpeciality());
			}
			if(roleExam.getSubjectExam() != null) {
				this.subjectExam = new SubjectExamDto(roleExam.getSubjectExam());
			}
			if(roleExam.getTestBag() != null) {
				this.testBag = new TestBagDto(roleExam.getTestBag());
			}
			if(roleExam.getTrainingBase() != null) {
				this.trainingBase = new TrainingBaseDto(roleExam.getTrainingBase());
			}
			if(roleExam.getType() != null) {
				this.type = roleExam.getType();
			}
			if(roleExam.getUser() != null) {
				this.user = new UserDto(roleExam.getUser());
			}
			if(roleExam.getSubject() != null) {
				this.subject = new SubjectDto(roleExam.getSubject());
			}
			if(roleExam.getStartDate() != null && roleExam.getEndDate() != null) {
				this.statusPermission = "Đã phê duyệt";
			}
			if(roleExam.getSemesterSubjectExam() != null) {
				this.semesterSubjectExam = new SemesterSubjectExamDto(roleExam.getSemesterSubjectExam());
			}
		}
	}
	public RoleExamDto(RoleExam roleExam, Boolean value) {
		if(roleExam != null && value == true) {
			this.id = roleExam.getId();
			this.input = roleExam.isInput();
			this.edit = roleExam.isEdit();
			this.delete = roleExam.isDelete();
			this.publish = roleExam.isPublish();
			if(roleExam.getCourseSubject() != null) {
				this.courseSubjectName = roleExam.getCourseSubject().getDisplayName();
			}
			if(roleExam.getCourseYear() != null) {
				this.courseYearName = roleExam.getCourseYear().getName();
			}
			if(roleExam.getDepartment() != null) {
				this.departmentName = roleExam.getDepartment().getName();
			}
			if(roleExam.getEndDate() != null) {
				this.endDate = roleExam.getEndDate();
			}
			if(roleExam.getStartDate() != null) {
				this.startDate =roleExam.getStartDate();
			}
			if(roleExam.getEnrollmentClass() != null) {
				this.enrollmentClassName = roleExam.getEnrollmentClass().getClassName();
			}
			if(roleExam.getExamRegisterPeriod() != null) {
				this.examRegisterPeriodName = roleExam.getExamRegisterPeriod().getName();
			}
			if(roleExam.getSemester() != null) {
				this.semesterName = roleExam.getSemester().getSemesterName();
			}
			if(roleExam.getSemesterRegisterPeriod() != null) {
				this.semesterRegisterPeriodName = roleExam.getSemesterRegisterPeriod().getName();
			}
			if(roleExam.getSemesterSubject() != null) {
				this.semesterSubjectName = roleExam.getSemesterSubject().getSemesterName();
			}
			if(roleExam.getSpeciality() != null) {
				this.specialityName = roleExam.getSpeciality().getName();
			}
			if(roleExam.getSubjectExam() != null) {
				this.subjectExamName = roleExam.getSubjectExam().getName();
			}
			if(roleExam.getTestBag() != null) {
				this.testBagName = roleExam.getTestBag().getName();
			}
			if(roleExam.getTrainingBase() != null) {
				this.trainingBaseName = roleExam.getTrainingBase().getName();
			}
			if(roleExam.getType() != null) {
				this.type = roleExam.getType();
			}
			if(roleExam.getUser() != null) {
				this.userName = roleExam.getUser().getPerson().getDisplayName();
			}
			if(roleExam.getSubject() != null) {
				this.subjectName = roleExam.getSubject().getSubjectName();
			}
			if(roleExam.getStartDate() != null && roleExam.getEndDate() != null) {
				this.statusPermission = "Đã phê duyệt";
			}
			if(roleExam.getSemesterSubjectExam() != null) {
				this.semesterSubjectExamName = roleExam.getSemesterSubjectExam().getName();
			}
			if(roleExam.getCourseYearCS() != null) {
				this.courseYearCSName = roleExam.getCourseYearCS().getName();
			}
		}
	}
}
