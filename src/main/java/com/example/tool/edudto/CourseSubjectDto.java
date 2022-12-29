package com.example.tool.edudto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import org.joda.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.globits.core.dto.BaseObjectDto;
import com.globits.core.dto.RoomDto;
import com.globits.core.dto.TrainingBaseDto;
import com.globits.education.domain.CourseSubject;
import com.globits.education.domain.CourseSubjectConfig;
import com.globits.education.domain.CourseSubjectTimetable;
import com.globits.education.domain.SubjectExam;
import com.globits.education.dto.CourseHourDto;
import com.globits.education.dto.CourseSubjectConfigDto;
import com.globits.education.dto.CourseYearDto;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.SemesterSubjectDto;
import com.globits.education.dto.SubjectDto;
import com.globits.education.dto.SubjectExamDto;
import com.globits.education.utils.EducationConstant;
import com.globits.hr.dto.StaffDto;

public class CourseSubjectDto extends BaseObjectDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long Id;

	private String code; // Mã lớp (dùng để định danh lớp (thông thường sẽ bằng Mã môn học + số thứ tự
							// của lớp trong kỳ : ví dụ - Toan1-001, Toan1-002)
	private String shortCode;
	private Long subjectId;
	private String subjectName;
	private String subjectCode;

	private CourseSubjectDto parent; // Lớp cha (ví dụ : 1 lớp lý thuyết có nhiều lớp bài tập)
	private Set<CourseSubjectDto> subCourseSubjects;

	private Boolean isUsingConfig = false;

	private Boolean isFullClass = false;

	// Các cấu hình (nếu khác NULL có nghĩa là có cấu hình)
	private List<CourseSubjectConfigDto> courseSubjectConfigs;
	private List<TimeTableDto> timetables;// Thời khóa biểu của lớp này (ví dụ : Thứ 3 tiết 1 đến tiết 3, thứ 5 : tiết
											// 4-6)
	private SemesterSubjectDto semesterSubject;
	private Integer maxStudent=0;// Số lượng sinh viên tối đa được đăng ký học vào lớp này
	private Integer minStudent=0;// Số lượng sinh viên tối đa được đăng ký học vào lớp này

	private Integer numberStudent=0;// Số lượng sinh viên thực tế

	private Integer courseSubjectType;// Lý thuyết =0 (mặc định), bài tập=1, thực hành=2, thí nghiệm (=3).

	private Long learningSkillId;
	private String learningSkillName;
	private String learningSkillCode;

	private Boolean isSelected=false;

	private List<CourseSubjectDto> children;

	private Hashtable<String, List<CourseSubjectDto>> hashCourseSubjects = new Hashtable<String, List<CourseSubjectDto>>();
	// private int numberLearningSkill;
	private Boolean expanded = true;
	private Boolean isGrantAll = false;
	private Boolean isDeniedAll = false;
	private TrainingBaseDto trainingBase;

	private Boolean isOvelapTime;

	private List<String> overLapClasses = new ArrayList<String>();

	private Long courseYearId;
	private String courseYearCode;
	private String courseYearName;

	private String displayName;

	private int numberOfCredit;

	private boolean isCheck;

	/*
	 * Tính học phí theo lớp học phần True: tính theo lớp học phần False: tính theo
	 * phương pháp thông thường
	 */
	private Boolean isFeeByCourseSubject;

	/*
	 * Mức phí tối thiểu mở lớp
	 */
//	private Double minFee;

	/*
	 * Mức phí / 1 đơn vị học trình (tín chỉ)
	 */
	private Double feePerCredit;
	/*
	 * Hệ số học phí cho lớp học phần này
	 */
	private Double tuitionCoefficient;

	/*
	 * Tổng học phí của lớp totalFee = minFee+feePerCredit*numberOfCredit
	 */
	private Double totalFee;
	/*
	 * Mức phí/1 sinh viên feePerStudent = totalFee/NumberOfStudent
	 */
	private Double feePerStudent;

//	private EnrollmentClassDto enrollmentClassDto;

	private Long enrollmentClassId;
	private String enrollmentClassCode;
	private Double numberHours;// Số giờ học của lớp
	private StaffDto teacher;
	private String teacherName;
	private String teacherCode;
	private Date startDate;
	private Date endDate;
	private Integer learningMethod;
	private Integer status;
	private List<SubjectExamDto> subjectExams;
	private Long semesterId;
	private String semesterCode;
	private Long periodId;
	private String periodName;
	private String username;
	private LocalDateTime actionTime;

	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CourseSubjectDto other = (CourseSubjectDto) obj;
		return Objects.equals(Id, other.Id);
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		this.Id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getShortCode() {
		return shortCode;
	}

	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public Long getLearningSkillId() {
		return learningSkillId;
	}

	public void setLearningSkillId(Long learningSkillId) {
		this.learningSkillId = learningSkillId;
	}

	public String getLearningSkillName() {
		return learningSkillName;
	}

	public void setLearningSkillName(String learningSkillName) {
		this.learningSkillName = learningSkillName;
	}

	public String getLearningSkillCode() {
		return learningSkillCode;
	}

	public void setLearningSkillCode(String learningSkillCode) {
		this.learningSkillCode = learningSkillCode;
	}

	public Integer getCourseSubjectType() {
		return courseSubjectType;
	}

	public void setCourseSubjectType(Integer courseSubjectType) {
		this.courseSubjectType = courseSubjectType;
	}

	public SemesterSubjectDto getSemesterSubject() {
		return semesterSubject;
	}

	public void setSemesterSubject(SemesterSubjectDto semesterSubject) {
		this.semesterSubject = semesterSubject;
	}

	public CourseSubjectDto getParent() {
		return parent;
	}

	public Boolean getIsFullClass() {
		return isFullClass;
	}

	public void setIsFullClass(Boolean isFullClass) {
		this.isFullClass = isFullClass;
	}

	public void setParent(CourseSubjectDto parent) {
		this.parent = parent;
	}

	public List<TimeTableDto> getTimetables() {
		return timetables;
	}

	public void setTimetables(List<TimeTableDto> timetables) {
		this.timetables = timetables;
	}

	public Integer getMaxStudent() {
		return maxStudent;
	}

	public void setMaxStudent(Integer maxStudent) {
		this.maxStudent = maxStudent;
	}

	public Integer getNumberStudent() {
		return numberStudent;
	}

	public void setNumberStudent(Integer numberStudent) {
		this.numberStudent = numberStudent;
	}

	public Boolean getIsSelected() {
		return this.isSelected;
	}

	public void setIsSelected(Boolean isSelected) {
		this.isSelected = isSelected;
	}

	public Integer getMinStudent() {
		return minStudent;
	}

	public void setMinStudent(Integer minStudent) {
		this.minStudent = minStudent;
	}

	public Set<CourseSubjectDto> getSubCourseSubjects() {
		return subCourseSubjects;
	}

	public void setSubCourseSubjects(Set<CourseSubjectDto> subCourseSubjects) {
		this.subCourseSubjects = subCourseSubjects;
	}

	public Hashtable<String, List<CourseSubjectDto>> getHashCourseSubjects() {
		return hashCourseSubjects;
	}

	public void setHashCourseSubjects(Hashtable<String, List<CourseSubjectDto>> hashCourseSubjects) {
		this.hashCourseSubjects = hashCourseSubjects;
	}

	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	public int getNumberLearningSkill() {
		return hashCourseSubjects.size();
	}

	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	public int getNumberSubCourseSubject() {
		// return numberSubCourseSubject;
		if (subCourseSubjects != null) {
			return subCourseSubjects.size();
		}
		return 0;
	}

	// public void setNumberSubCourseSubject(int numberSubCourseSubject) {
	// this.numberSubCourseSubject = numberSubCourseSubject;
	// }

	public Boolean getIsUsingConfig() {
		return isUsingConfig;
	}

	public void setIsUsingConfig(Boolean isUsingConfig) {
		this.isUsingConfig = isUsingConfig;
	}

	public List<CourseSubjectConfigDto> getCourseSubjectConfigs() {
		return courseSubjectConfigs;
	}

	public void setCourseSubjectConfigs(List<CourseSubjectConfigDto> courseSubjectConfigs) {
		this.courseSubjectConfigs = courseSubjectConfigs;
	}

	public List<CourseSubjectDto> getChildren() {
		return children;
	}

	public void setChildren(List<CourseSubjectDto> children) {
		this.children = children;
	}

	public Boolean getExpanded() {
		return expanded;
	}

	public void setExpanded(Boolean expanded) {
		this.expanded = expanded;
	}

	public Boolean getIsGrantAll() {
		return isGrantAll;
	}

	public void setIsGrantAll(Boolean isGrantAll) {
		this.isGrantAll = isGrantAll;
	}

	public Boolean getIsDeniedAll() {
		return isDeniedAll;
	}

	public void setIsDeniedAll(Boolean isDeniedAll) {
		this.isDeniedAll = isDeniedAll;
	}

	public Boolean getIsOvelapTime() {
		return isOvelapTime;
	}

	public void setIsOvelapTime(Boolean isOvelapTime) {
		this.isOvelapTime = isOvelapTime;
	}

	public Long getCourseYearId() {
		return courseYearId;
	}

	public void setCourseYearId(Long courseYearId) {
		this.courseYearId = courseYearId;
	}

	public String getCourseYearCode() {
		return courseYearCode;
	}

	public void setCourseYearCode(String courseYearCode) {
		this.courseYearCode = courseYearCode;
	}

	public String getCourseYearName() {
		return courseYearName;
	}

	public void setCourseYearName(String courseYearName) {
		this.courseYearName = courseYearName;
	}

	public List<String> getOverLapClasses() {
		return overLapClasses;
	}

	public void setOverLapClasses(List<String> overLapClasses) {
		this.overLapClasses = overLapClasses;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

//	public EnrollmentClassDto getEnrollmentClassDto() {
//		return enrollmentClassDto;
//	}
//
//	public void setEnrollmentClassDto(EnrollmentClassDto enrollmentClassDto) {
//		this.enrollmentClassDto = enrollmentClassDto;
//	}

	public int getNumberOfCredit() {
		return numberOfCredit;
	}

	public void setNumberOfCredit(int numberOfCredit) {
		this.numberOfCredit = numberOfCredit;
	}

	public boolean isCheck() {
		return isCheck;
	}

	public void setCheck(boolean isCheck) {
		this.isCheck = isCheck;
	}

	public Long getEnrollmentClassId() {
		return enrollmentClassId;
	}

	public void setEnrollmentClassId(Long enrollmentClassId) {
		this.enrollmentClassId = enrollmentClassId;
	}

	public String getEnrollmentClassCode() {
		return enrollmentClassCode;
	}

	public void setEnrollmentClassCode(String enrollmentClassCode) {
		this.enrollmentClassCode = enrollmentClassCode;
	}

	public TrainingBaseDto getTrainingBase() {
		return trainingBase;
	}

	public void setTrainingBase(TrainingBaseDto trainingBase) {
		this.trainingBase = trainingBase;
	}

	public Double getNumberHours() {
		return numberHours;
	}

	public void setNumberHours(Double numberHours) {
		this.numberHours = numberHours;
	}

	public StaffDto getTeacher() {
		return teacher;
	}

	public void setTeacher(StaffDto teacher) {
		this.teacher = teacher;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherCode() {
		return teacherCode;
	}

	public void setTeacherCode(String teacherCode) {
		this.teacherCode = teacherCode;
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

	public Boolean getIsFeeByCourseSubject() {
		return isFeeByCourseSubject;
	}

	public void setIsFeeByCourseSubject(Boolean isFeeByCourseSubject) {
		this.isFeeByCourseSubject = isFeeByCourseSubject;
	}

	public Double getFeePerCredit() {
		return feePerCredit;
	}

	public void setFeePerCredit(Double feePerCredit) {
		this.feePerCredit = feePerCredit;
	}

	public Double getTuitionCoefficient() {
		return tuitionCoefficient;
	}

	public void setTuitionCoefficient(Double tuitionCoefficient) {
		this.tuitionCoefficient = tuitionCoefficient;
	}

	public Double getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(Double totalFee) {
		this.totalFee = totalFee;
	}

	public Double getFeePerStudent() {
		return feePerStudent;
	}

	public void setFeePerStudent(Double feePerStudent) {
		this.feePerStudent = feePerStudent;
	}

	public Integer getLearningMethod() {
		return learningMethod;
	}

	public void setLearningMethod(Integer learningMethod) {
		this.learningMethod = learningMethod;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<SubjectExamDto> getSubjectExams() {
		return subjectExams;
	}

	public void setSubjectExams(List<SubjectExamDto> subjectExams) {
		this.subjectExams = subjectExams;
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

	public Long getPeriodId() {
		return periodId;
	}

	public void setPeriodId(Long periodId) {
		this.periodId = periodId;
	}

	public String getPeriodName() {
		return periodName;
	}

	public void setPeriodName(String periodCode) {
		this.periodName = periodCode;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public LocalDateTime getActionTime() {
		return actionTime;
	}

	public void setActionTime(LocalDateTime actionTime) {
		this.actionTime = actionTime;
	}

	public CourseSubjectDto() {

	}

	public CourseSubjectDto(CourseSubject cs) {
		this.code = cs.getCode();
		this.shortCode = cs.getShortCode();
		this.Id = cs.getId();
		this.maxStudent = cs.getMaxStudent();
		if (EducationConstant.courseSubjectsSize.get(cs.getId()) != null) {
			this.numberStudent = (EducationConstant.courseSubjectsSize.get(cs.getId()));
		} else {
			this.numberStudent = cs.getNumberStudent();
		}
		this.minStudent = cs.getMinStudent();
		this.courseSubjectType = cs.getCourseSubjectType();
		this.isDeniedAll = cs.getIsDeniedAll();
		this.isGrantAll = cs.getIsGrantAll();
		this.isUsingConfig = cs.getIsUsingConfig();
		this.numberHours = cs.getNumberHours();
		this.isFeeByCourseSubject = cs.getIsFeeByCourseSubject();
//		this.minFee = cs.getMinFee();
		this.feePerCredit = cs.getFeePerCredit();
		this.tuitionCoefficient = cs.getTuitionCoefficient();
		this.feePerStudent = cs.getFeePerStudent();
		this.totalFee = cs.getTotalFee();
		this.startDate = cs.getStartDate();
		this.endDate = cs.getEndDate();
		this.learningMethod = cs.getLearningMethod();
		this.status = cs.getStatus();
		if (cs.getTeacher() != null) {
//			this.teacher = new StaffDto(cs.getTeacher());
			this.teacher = new StaffDto();
			this.teacher.setId(cs.getTeacher().getId());
			this.teacher.setDisplayName(cs.getTeacher().getDisplayName());
			this.teacher.setStaffCode(cs.getTeacher().getStaffCode());
		}
//		if(cs.getSemesterSubject()!=null) {
//			this.semesterSubject=new SemesterSubjectDto(cs.getSemesterSubject());
//		}
		this.displayName = cs.getDisplayName();

		if (cs.getParent() != null) {
			this.parent = new CourseSubjectDto();
			this.parent.setCode(cs.getParent().getCode());
			this.parent.setId(cs.getParent().getId());
		}
		if (cs.getTimetables() != null && cs.getTimetables().size() > 0) {
			List<TimeTableDto> timetables = new ArrayList<TimeTableDto>();
			for (CourseSubjectTimetable tt : cs.getTimetables()) {
				TimeTableDto ttDto = new TimeTableDto();
				ttDto.setId(tt.getId());
				ttDto.setCourseSubjectId(this.getId());
				ttDto.setFromWeek(tt.getFromWeek());
				ttDto.setToWeek(tt.getToWeek());
				ttDto.setWeekIndex(tt.getWeekIndex());
				ttDto.setStartDate(tt.getStartDate());
				ttDto.setEndDate(tt.getEndDate());
				if (tt.getRoom() != null) {
					RoomDto r = new RoomDto();
					r.setId(tt.getRoom().getId());
					r.setCode(tt.getRoom().getCode());
					r.setName(tt.getRoom().getName());
					ttDto.setRoom(r);
					ttDto.setRoomName(tt.getRoom().getName());
				}
				if (tt.getTeacher() != null) {
					StaffDto teacher = new StaffDto();
					teacher.setId(tt.getTeacher().getId());
					teacher.setDisplayName(tt.getTeacher().getDisplayName());
					teacher.setEmail(tt.getTeacher().getEmail());
					teacher.setStaffCode(tt.getTeacher().getStaffCode());
					ttDto.setTeacher(teacher);
				}
				if (tt.getAssistantTeacher() != null) {
					StaffDto teacher = new StaffDto();
					teacher.setId(tt.getAssistantTeacher().getId());
					teacher.setStaffCode(tt.getAssistantTeacher().getStaffCode());
					teacher.setDisplayName(tt.getAssistantTeacher().getDisplayName());
					teacher.setEmail(tt.getAssistantTeacher().getEmail());
					ttDto.setAssistantTeacher(teacher);
				}
				if (tt.getStart() != null) {
					CourseHourDto start = new CourseHourDto();
					start.setId(tt.getStart().getId());
					start.setName(tt.getStart().getName());
					start.setIndexNumber(tt.getStart().getIndexNumber());
					start.setStart(tt.getStart().getStart());
					ttDto.setStartHour(start);
					ttDto.setCourseHourseStartCode(tt.getStart().getIndexNumber());
					ttDto.setStart(tt.getStart().getName());
				}
				if (tt.getEnd() != null) {
					CourseHourDto endHour = new CourseHourDto();
					endHour.setId(tt.getEnd().getId());
					endHour.setName(tt.getEnd().getName());
					endHour.setIndexNumber(tt.getEnd().getIndexNumber());
					endHour.setEnd(tt.getEnd().getEnd());
					ttDto.setEndHour(endHour);
					ttDto.setCourseHourseEndCode(tt.getEnd().getIndexNumber());
					ttDto.setEnd(tt.getEnd().getName());
				}
				timetables.add(ttDto);
			}
			this.setTimetables(timetables);
		}
		if (cs.getSubCourseSubjects() != null) {
			this.subCourseSubjects = new HashSet<CourseSubjectDto>();
			for (CourseSubject c : cs.getSubCourseSubjects()) {
				CourseSubjectDto cDto = new CourseSubjectDto();
				cDto.setId(c.getId());
				cDto.setCode(c.getCode());
				cDto.setMaxStudent(c.getMaxStudent());

				if (c.getSemesterSubject() != null) {
					if (c.getSemesterSubject().getRegisterPeriod() != null) {
						cDto.setPeriodId(c.getSemesterSubject().getRegisterPeriod().getId());
						cDto.setPeriodName(c.getSemesterSubject().getRegisterPeriod().getName());
					}
					if (c.getSemesterSubject().getSubject() != null) {
						cDto.setSubjectId(c.getSemesterSubject().getSubject().getId());
						cDto.setSubjectName(c.getSemesterSubject().getSubject().getSubjectName());
						cDto.setSubjectCode(c.getSemesterSubject().getSubject().getSubjectCode());
					}

					if (c.getDisplayName() == null || c.getDisplayName() == "") {
						if (c.getShortCode() != null && c.getShortCode().contains("-")) {
							cDto.setDisplayName(c.getSemesterSubject().getSubject().getSubjectName() + c.getShortCode()
									.substring(c.getShortCode().indexOf("-"), c.getShortCode().length()));
						} else {
							cDto.setDisplayName(
									c.getSemesterSubject().getSubject().getSubjectName() + " " + c.getShortCode());
						}
					}
					cDto.setNumberOfCredit(c.getSemesterSubject().getSubject().getNumberOfCredit());

					cDto.setSemesterSubject(new SemesterSubjectDto(c.getSemesterSubject(), 0L));
				}
				cDto.setMinStudent(c.getMinStudent());
				if (EducationConstant.courseSubjectsSize.get(c.getId()) != null) {
					cDto.setNumberStudent(EducationConstant.courseSubjectsSize.get(c.getId()));
				} else {
					cDto.setNumberStudent(c.getNumberStudent());
				}

				cDto.setShortCode(c.getShortCode());
				if (c.getLearningSkill() != null) {
					cDto.setLearningSkillId(c.getLearningSkill().getId());
				}
				cDto.setNumberHours(c.getNumberHours());
				if (c.getTeacher() != null) {
					cDto.setTeacher(new StaffDto(c.getTeacher(),true));
				}
				if (c.getTimetables() != null && c.getTimetables().size() > 0) {
					List<TimeTableDto> timetables = new ArrayList<TimeTableDto>();
					for (CourseSubjectTimetable tt : c.getTimetables()) {
						TimeTableDto ttDto = new TimeTableDto();
						ttDto.setId(tt.getId());
						ttDto.setCourseSubjectId(this.getId());
						ttDto.setFromWeek(tt.getFromWeek());
						ttDto.setToWeek(tt.getToWeek());
						ttDto.setWeekIndex(tt.getWeekIndex());
						ttDto.setStartDate(tt.getStartDate());
						ttDto.setEndDate(tt.getEndDate());
						if (tt.getRoom() != null) {
							RoomDto r = new RoomDto();
							r.setId(tt.getRoom().getId());
							r.setCode(tt.getRoom().getCode());
							r.setName(tt.getRoom().getName());
							ttDto.setRoom(r);
							ttDto.setRoomName(tt.getRoom().getName());
						}
						if (tt.getTeacher() != null) {
							StaffDto teacher = new StaffDto();
							teacher.setId(tt.getTeacher().getId());
							teacher.setDisplayName(tt.getTeacher().getDisplayName());
							teacher.setEmail(tt.getTeacher().getEmail());
							teacher.setStaffCode(tt.getTeacher().getStaffCode());
							ttDto.setTeacher(teacher);
						}
						if (tt.getAssistantTeacher() != null) {
							StaffDto teacher = new StaffDto();
							teacher.setId(tt.getAssistantTeacher().getId());
							teacher.setStaffCode(tt.getAssistantTeacher().getStaffCode());
							teacher.setDisplayName(tt.getAssistantTeacher().getDisplayName());
							teacher.setEmail(tt.getAssistantTeacher().getEmail());
							ttDto.setAssistantTeacher(teacher);
						}
						if (tt.getStart() != null) {
							CourseHourDto start = new CourseHourDto();
							start.setId(tt.getStart().getId());
							start.setName(tt.getStart().getName());
							start.setIndexNumber(tt.getStart().getIndexNumber());
							start.setStart(tt.getStart().getStart());
							ttDto.setStartHour(start);
							ttDto.setCourseHourseStartCode(tt.getStart().getIndexNumber());
						}
						if (tt.getEnd() != null) {
							CourseHourDto endHour = new CourseHourDto();
							endHour.setId(tt.getEnd().getId());
							endHour.setName(tt.getEnd().getName());
							endHour.setIndexNumber(tt.getEnd().getIndexNumber());
							endHour.setEnd(tt.getEnd().getEnd());
							ttDto.setEndHour(endHour);
							ttDto.setCourseHourseEndCode(tt.getEnd().getIndexNumber());
						}
						timetables.add(ttDto);
					}
					cDto.setTimetables(timetables);
				}
				// cDto.setParent(this);//Nếu thêm đoạn này thì khi GEN JSON sẽ bị lỗi
				this.subCourseSubjects.add(cDto);

			}
		}

		if (cs.getCourseSubjectConfigs() != null) {
			this.courseSubjectConfigs = new ArrayList<CourseSubjectConfigDto>();
			for (CourseSubjectConfig csc : cs.getCourseSubjectConfigs()) {
				CourseSubjectConfigDto cscDto = new CourseSubjectConfigDto(csc,1);
				this.courseSubjectConfigs.add(cscDto);
			}
		}
		this.setChildren(getListChildren(cs));
		if (cs.getSemesterSubject() != null) {
			SemesterSubjectDto dto = new SemesterSubjectDto();
			dto.setId(cs.getSemesterSubject().getId());
			dto.setSemester(new SemesterDto(cs.getSemesterSubject().getSemester().getId(),cs.getSemesterSubject().getSemester().getSemesterName(),cs.getSemesterSubject().getSemester().getSemesterCode()));
			dto.setSubject(new SubjectDto(cs.getSemesterSubject().getSubject(),true));
			if (cs.getSemesterSubject().getRegisterPeriod() != null) {
				this.periodId = cs.getSemesterSubject().getRegisterPeriod().getId();
				this.periodName = cs.getSemesterSubject().getRegisterPeriod().getName();
			}
			if (cs.getSemesterSubject().getSubject() != null) {
				this.subjectId = cs.getSemesterSubject().getSubject().getId();
				this.subjectName = cs.getSemesterSubject().getSubject().getSubjectName();
				this.subjectCode = cs.getSemesterSubject().getSubject().getSubjectCode();
				if (cs.getDisplayName() == null || cs.getDisplayName() == "") {
					if (cs.getShortCode() != null && cs.getShortCode().contains("-")) {
						this.displayName = cs.getSemesterSubject().getSubject().getSubjectName() + cs.getShortCode()
								.substring(cs.getShortCode().indexOf("-"), cs.getShortCode().length());
					} else {
						this.displayName = cs.getSemesterSubject().getSubject().getSubjectName() + " "
								+ cs.getShortCode();
					}
				}
				this.numberOfCredit = cs.getSemesterSubject().getSubject().getNumberOfCredit();
			}
			dto.setIsFeeBySubject(cs.getSemesterSubject().getIsFeeBySubject());
			dto.setTuitionFee(cs.getSemesterSubject().getTuitionFee());
			dto.setTuitionFeeCoefficient(cs.getSemesterSubject().getTuitionFeeCoefficient());
			if (cs.getSemesterSubject().getCourseyear() != null) {
				this.courseYearId = cs.getSemesterSubject().getCourseyear().getId();
				this.courseYearCode = cs.getSemesterSubject().getCourseyear().getCode();
				this.courseYearName = cs.getSemesterSubject().getCourseyear().getName();
				CourseYearDto courseYearDto = new CourseYearDto();
				courseYearDto.setCode(cs.getSemesterSubject().getCourseyear().getCode());
				courseYearDto.setName(cs.getSemesterSubject().getCourseyear().getName());
				courseYearDto.setId(cs.getSemesterSubject().getCourseyear().getId());
				dto.setCourseYearDto(courseYearDto);
			}
			this.semesterSubject = dto;
		}
		if (cs.getEnrollmentClass() != null) {
			this.enrollmentClassId = cs.getEnrollmentClass().getId();
			this.enrollmentClassCode = cs.getEnrollmentClass().getClassCode();
//			this.enrollmentClassDto = new EnrollmentClassDto();
//			this.enrollmentClassDto.setId(cs.getEnrollmentClass().getId());
//			this.enrollmentClassDto.setClassCode(cs.getEnrollmentClass().getClassCode());
		}
		if (cs.getTrainingBase() != null) {
			TrainingBaseDto trainDto = new TrainingBaseDto();
			trainDto.setId(cs.getTrainingBase().getId());
			trainDto.setCode(cs.getTrainingBase().getCode());
			trainDto.setName(cs.getTrainingBase().getName());
			this.trainingBase = trainDto;
		}
		if (cs.getLearningSkill() != null) {
			this.learningSkillId = cs.getLearningSkill().getId();
			this.learningSkillName = cs.getLearningSkill().getName();
			this.learningSkillCode = cs.getLearningSkill().getCode();
		}
		subjectExams = new ArrayList<SubjectExamDto>();
		if (cs.getSubjectExams() != null) {
			for (SubjectExam subjectExam : cs.getSubjectExams()) {
				SubjectExamDto subjectExamDto = new SubjectExamDto(subjectExam,1);
				this.subjectExams.add(subjectExamDto);
			}
		}
	}

	public CourseSubjectDto(Long id, String shortCode, String displayName) {
		this.Id = id;
		this.shortCode = shortCode;
		this.displayName = displayName;
	}

	public CourseSubjectDto(Long id, String shortCode, String displayName, String subjectName) {
		this.Id = id;
		this.shortCode = shortCode;
		this.displayName = displayName;
		if (this.displayName == null || this.displayName == "") {
			if (subjectName != null && shortCode != null && shortCode.contains("-")) {
				this.displayName = subjectName + shortCode.substring(shortCode.indexOf("-"), shortCode.length());
			} else {
				this.displayName = subjectName + " " + shortCode;
			}
		}
	}

	private List<CourseSubjectDto> getListChildren(CourseSubject spe) {
		List<CourseSubjectDto> ret = new ArrayList<CourseSubjectDto>();

		if (spe.getSubCourseSubjects() != null && spe.getSubCourseSubjects().size() > 0) {
			for (CourseSubject s : spe.getSubCourseSubjects()) {
				CourseSubjectDto sDto = new CourseSubjectDto();
				sDto.setId(s.getId());
				sDto.setCode(s.getCode());
				sDto.setMaxStudent(s.getMaxStudent());
				sDto.setMinStudent(s.getMinStudent());
				if (EducationConstant.courseSubjectsSize.get(s.getId()) != null) {
					sDto.setNumberStudent(EducationConstant.courseSubjectsSize.get(s.getId()));
				} else {
					sDto.setNumberStudent(s.getNumberStudent());
				}

				sDto.setChildren(getListChildren(s));
				sDto.setShortCode(s.getShortCode());
				sDto.setIsFeeByCourseSubject(s.getIsFeeByCourseSubject());
//				sDto.setMinFee(s.getMinFee());
				sDto.setFeePerCredit(s.getFeePerCredit());
				sDto.tuitionCoefficient = s.getTuitionCoefficient();
				sDto.setFeePerStudent(s.getFeePerStudent());
				sDto.setTotalFee(s.getTotalFee());
				sDto.setStartDate(s.getStartDate());
				sDto.setEndDate(s.getEndDate());
				sDto.status = s.getStatus();
				if (s.getLearningSkill() != null) {
					sDto.setLearningSkillId(s.getLearningSkill().getId());
				}
				sDto.setNumberHours(s.getNumberHours());
				if (s.getTeacher() != null) {
					sDto.setTeacher(new StaffDto(s.getTeacher()));
				}
				sDto.setNumberHours(s.getNumberHours());
				if (s.getTimetables() != null && s.getTimetables().size() > 0) {
					List<TimeTableDto> timetables = new ArrayList<TimeTableDto>();
					for (CourseSubjectTimetable tt : s.getTimetables()) {
						TimeTableDto ttDto = new TimeTableDto();
						ttDto.setId(tt.getId());
						ttDto.setCourseSubjectId(this.getId());
						ttDto.setFromWeek(tt.getFromWeek());
						ttDto.setToWeek(tt.getToWeek());
						ttDto.setWeekIndex(tt.getWeekIndex());
						ttDto.setStartDate(tt.getStartDate());
						ttDto.setEndDate(tt.getEndDate());
						if (tt.getRoom() != null) {
							RoomDto r = new RoomDto();
							r.setId(tt.getRoom().getId());
							r.setCode(tt.getRoom().getCode());
							r.setName(tt.getRoom().getName());
							ttDto.setRoom(r);
							ttDto.setRoomName(tt.getRoom().getName());
						}
						if (tt.getTeacher() != null) {
							StaffDto teacher = new StaffDto();
							teacher.setId(tt.getTeacher().getId());
							teacher.setStaffCode(tt.getTeacher().getStaffCode());
							teacher.setDisplayName(tt.getTeacher().getDisplayName());
							teacher.setEmail(tt.getTeacher().getEmail());
							ttDto.setTeacher(teacher);
						}
						if (tt.getAssistantTeacher() != null) {
							StaffDto teacher = new StaffDto();
							teacher.setId(tt.getAssistantTeacher().getId());
							teacher.setStaffCode(tt.getAssistantTeacher().getStaffCode());
							teacher.setDisplayName(tt.getAssistantTeacher().getDisplayName());
							teacher.setEmail(tt.getAssistantTeacher().getEmail());
							ttDto.setAssistantTeacher(teacher);
						}
						if (tt.getStart() != null) {
							CourseHourDto start = new CourseHourDto();
							start.setId(tt.getStart().getId());
							start.setName(tt.getStart().getName());
							start.setIndexNumber(tt.getStart().getIndexNumber());
							start.setStart(tt.getStart().getStart());
							ttDto.setStartHour(start);
							ttDto.setCourseHourseStartCode(tt.getStart().getIndexNumber());
							ttDto.setStart(tt.getStart().getName());
						}
						if (tt.getEnd() != null) {
							CourseHourDto endHour = new CourseHourDto();
							endHour.setId(tt.getEnd().getId());
							endHour.setName(tt.getEnd().getName());
							endHour.setIndexNumber(tt.getEnd().getIndexNumber());
							endHour.setEnd(tt.getEnd().getEnd());
							ttDto.setEndHour(endHour);
							ttDto.setCourseHourseEndCode(tt.getEnd().getIndexNumber());
							ttDto.setEnd(tt.getEnd().getName());
						}
						timetables.add(ttDto);
					}
					sDto.setTimetables(timetables);
				}
				if (s.getEnrollmentClass() != null) {
					sDto.setEnrollmentClassId(s.getEnrollmentClass().getId());
					sDto.setEnrollmentClassCode(s.getEnrollmentClass().getClassCode());
//					sDto.setEnrollmentClassDto(new EnrollmentClassDto());
//					sDto.getEnrollmentClassDto().setId(spe.getEnrollmentClass().getId());
//					sDto.getEnrollmentClassDto().setClassCode(spe.getEnrollmentClass().getClassCode());
				}
				if (s.getLearningSkill() != null) {
					sDto.setLearningSkillId(s.getLearningSkill().getId());
					sDto.setLearningSkillName(s.getLearningSkill().getName());
				}
				if (s.getTrainingBase() != null) {
					TrainingBaseDto trainDto = new TrainingBaseDto();
					trainDto.setId(s.getTrainingBase().getId());
					trainDto.setCode(s.getTrainingBase().getCode());
					trainDto.setName(s.getTrainingBase().getName());
					sDto.setTrainingBase(trainDto);
				}
				sDto.setDisplayName(s.getDisplayName());

				if (s.getSemesterSubject() != null) {
					if (s.getSemesterSubject().getCourseyear() != null) {
						this.courseYearId = s.getSemesterSubject().getCourseyear().getId();
						this.courseYearCode = s.getSemesterSubject().getCourseyear().getCode();
						this.courseYearName = s.getSemesterSubject().getCourseyear().getName();
					}
					if (s.getSemesterSubject().getSubject() != null) {
						sDto.setSubjectId(s.getSemesterSubject().getSubject().getId());
						sDto.setSubjectName(s.getSemesterSubject().getSubject().getSubjectName());
						sDto.setSubjectCode(s.getSemesterSubject().getSubject().getSubjectCode());
						if (s.getSemesterSubject().getRegisterPeriod() != null) {
							this.periodId = s.getSemesterSubject().getRegisterPeriod().getId();
							this.periodName = s.getSemesterSubject().getRegisterPeriod().getName();
						}
						if (s.getDisplayName() == null || s.getDisplayName() == "") {
							if (s.getShortCode() != null && s.getShortCode().contains("-")) {
								sDto.setDisplayName(
										s.getSemesterSubject().getSubject().getSubjectName() + s.getShortCode()
												.substring(s.getShortCode().indexOf("-"), s.getShortCode().length()));
							} else {
								sDto.setDisplayName(
										s.getSemesterSubject().getSubject().getSubjectName() + " " + s.getShortCode());
							}
						}
						sDto.setNumberOfCredit(s.getSemesterSubject().getSubject().getNumberOfCredit());
					}
					if (s.getSemesterSubject().getRegisterPeriod() != null) {
						this.periodId = s.getSemesterSubject().getRegisterPeriod().getId();
						this.periodName = s.getSemesterSubject().getRegisterPeriod().getName();
					}
				}
				ret.add(sDto);
			}
		}
		return ret;
	}

	public CourseSubjectDto(CourseSubject cs, boolean collapse) {
		this.code = cs.getCode();
		this.shortCode = cs.getShortCode();
		this.Id = cs.getId();
		this.maxStudent = cs.getMaxStudent();
		if (EducationConstant.courseSubjectsSize.get(cs.getId()) != null) {
			this.numberStudent = (EducationConstant.courseSubjectsSize.get(cs.getId()));
		} else {
			this.numberStudent = cs.getNumberStudent();
		}

		this.minStudent = cs.getMinStudent();
		this.courseSubjectType = cs.getCourseSubjectType();
		this.isDeniedAll = cs.getIsDeniedAll();
		this.isGrantAll = cs.getIsGrantAll();
		this.isUsingConfig = cs.getIsUsingConfig();
		this.numberHours = cs.getNumberHours();
		this.learningMethod = cs.getLearningMethod();
		this.isFeeByCourseSubject = cs.getIsFeeByCourseSubject();
		this.feePerCredit = cs.getFeePerCredit();
		this.tuitionCoefficient = cs.getTuitionCoefficient();
		this.feePerStudent = cs.getFeePerStudent();
		this.totalFee = cs.getTotalFee();
		this.displayName = cs.getDisplayName();
		this.startDate = cs.getStartDate();
		this.endDate = cs.getEndDate();
		this.status = cs.getStatus();
		if (cs.getSemesterSubject() != null) {
			SemesterSubjectDto dto = new SemesterSubjectDto();
			dto.setId(cs.getSemesterSubject().getId());
			dto.setSemester(new SemesterDto(cs.getSemesterSubject().getSemester()));
			dto.setSubject(new SubjectDto(cs.getSemesterSubject().getSubject()));
			if(cs.getSemesterSubject().getSemester()!=null) {
				this.semesterId = cs.getSemesterSubject().getSemester().getId();
				this.semesterCode = cs.getSemesterSubject().getSemester().getSemesterCode();
			}
			
			if (cs.getSemesterSubject().getRegisterPeriod() != null) {
				this.periodId = cs.getSemesterSubject().getRegisterPeriod().getId();
				this.periodName = cs.getSemesterSubject().getRegisterPeriod().getName();
			}
			if (cs.getSemesterSubject().getSubject() != null) {
				this.subjectId = cs.getSemesterSubject().getSubject().getId();
				this.subjectName = cs.getSemesterSubject().getSubject().getSubjectName();
				this.subjectCode = cs.getSemesterSubject().getSubject().getSubjectCode();
				if (cs.getDisplayName() == null || cs.getDisplayName() == "") {
					if (cs.getShortCode() != null && cs.getShortCode().contains("-")) {
						this.displayName = cs.getSemesterSubject().getSubject().getSubjectName() + cs.getShortCode()
								.substring(cs.getShortCode().indexOf("-"), cs.getShortCode().length());
					} else {
						this.displayName = cs.getSemesterSubject().getSubject().getSubjectName() + " "
								+ cs.getShortCode();
					}
				}
				this.numberOfCredit = cs.getSemesterSubject().getSubject().getNumberOfCredit();
			}
			dto.setIsFeeBySubject(cs.getSemesterSubject().getIsFeeBySubject());
			dto.setTuitionFee(cs.getSemesterSubject().getTuitionFee());
			dto.setTuitionFeeCoefficient(cs.getSemesterSubject().getTuitionFeeCoefficient());
			if (cs.getSemesterSubject().getCourseyear() != null) {
				this.courseYearId = cs.getSemesterSubject().getCourseyear().getId();
				this.courseYearCode = cs.getSemesterSubject().getCourseyear().getCode();
				this.courseYearName = cs.getSemesterSubject().getCourseyear().getName();
				CourseYearDto courseYearDto = new CourseYearDto();
				courseYearDto.setCode(cs.getSemesterSubject().getCourseyear().getCode());
				courseYearDto.setName(cs.getSemesterSubject().getCourseyear().getName());
				courseYearDto.setId(cs.getSemesterSubject().getCourseyear().getId());
				dto.setCourseYearDto(courseYearDto);
			}
			this.semesterSubject = dto;
		}
		if (cs.getTeacher() != null) {
			this.teacher = new StaffDto(cs.getTeacher());
		}
	}

	public CourseSubjectDto(CourseSubject cs, int simple) {
//		super(cs);
		this.code = cs.getCode();
		this.shortCode = cs.getShortCode();
		this.Id = cs.getId();
		this.maxStudent = cs.getMaxStudent();
		if (EducationConstant.courseSubjectsSize.get(cs.getId()) != null) {
			this.numberStudent = (EducationConstant.courseSubjectsSize.get(cs.getId()));
		} else {
			this.numberStudent = cs.getNumberStudent();
		}

		this.minStudent = cs.getMinStudent();
		this.courseSubjectType = cs.getCourseSubjectType();
		this.isDeniedAll = cs.getIsDeniedAll();
		this.isGrantAll = cs.getIsGrantAll();
		this.isUsingConfig = cs.getIsUsingConfig();
		this.numberHours = cs.getNumberHours();
		this.learningMethod = cs.getLearningMethod();
		this.isFeeByCourseSubject = cs.getIsFeeByCourseSubject();
		this.feePerCredit = cs.getFeePerCredit();
		this.tuitionCoefficient = cs.getTuitionCoefficient();
		this.feePerStudent = cs.getFeePerStudent();
		this.totalFee = cs.getTotalFee();
		this.displayName = cs.getDisplayName();
		this.startDate = cs.getStartDate();
		this.endDate = cs.getEndDate();
		this.status = cs.getStatus();
		if(simple==0) {
			if (cs.getTeacher() != null) {
				this.teacherName = cs.getTeacher().getDisplayName();
				this.teacherCode = cs.getTeacher().getStaffCode();
			}
			this.courseYearId = cs.getSemesterSubject().getCourseyear().getId();
			this.courseYearCode = cs.getSemesterSubject().getCourseyear().getCode();
			this.courseYearName = cs.getSemesterSubject().getCourseyear().getName();
			this.subjectId = cs.getSemesterSubject().getSubject().getId();
			this.subjectName = cs.getSemesterSubject().getSubject().getSubjectName();
			this.subjectCode = cs.getSemesterSubject().getSubject().getSubjectCode();
			this.periodId = cs.getSemesterSubject().getRegisterPeriod().getId();
			this.periodName = cs.getSemesterSubject().getRegisterPeriod().getName();
			this.numberOfCredit = cs.getSemesterSubject().getSubject().getNumberOfCredit();
		}
		if(simple==1) {
			if (cs.getTeacher() != null) {
				if (simple == 2) {
					this.teacherName = cs.getTeacher().getDisplayName();
					this.teacherCode = cs.getTeacher().getStaffCode();
				} else {
					this.teacher = new StaffDto();
					this.teacher.setId(cs.getTeacher().getId());
					this.teacher.setStaffCode(cs.getTeacher().getStaffCode());
					this.teacher.setDisplayName(cs.getTeacher().getDisplayName());
				}

			}
			if (cs.getSemesterSubject() != null) {
				if (cs.getSemesterSubject().getCourseyear() != null) {
					this.courseYearId = cs.getSemesterSubject().getCourseyear().getId();
					this.courseYearCode = cs.getSemesterSubject().getCourseyear().getCode();
					this.courseYearName = cs.getSemesterSubject().getCourseyear().getName();
				}
				if (cs.getSemesterSubject().getSubject() != null) {
					this.subjectId = cs.getSemesterSubject().getSubject().getId();
					this.subjectName = cs.getSemesterSubject().getSubject().getSubjectName();
					this.subjectCode = cs.getSemesterSubject().getSubject().getSubjectCode();
//					if (cs.getSemesterSubject().getRegisterPeriod() != null) {
//						this.periodId = cs.getSemesterSubject().getRegisterPeriod().getId();
//						this.periodName = cs.getSemesterSubject().getRegisterPeriod().getName();
//					}
					if (cs.getDisplayName() == null || cs.getDisplayName() == "") {
						if (cs.getShortCode() != null && cs.getShortCode().contains("-")) {
							this.displayName = cs.getSemesterSubject().getSubject().getSubjectName() + cs.getShortCode()
									.substring(cs.getShortCode().indexOf("-"), cs.getShortCode().length());
						} else {
							this.displayName = cs.getSemesterSubject().getSubject().getSubjectName() + " "
									+ cs.getShortCode();
						}
					}
					this.numberOfCredit = cs.getSemesterSubject().getSubject().getNumberOfCredit();
				}
				if (cs.getSemesterSubject().getRegisterPeriod() != null) {
					this.periodId = cs.getSemesterSubject().getRegisterPeriod().getId();
					this.periodName = cs.getSemesterSubject().getRegisterPeriod().getName();
				}
				if (cs.getSemesterSubject().getId() != null) {
					this.setSemesterSubject(new SemesterSubjectDto(cs.getSemesterSubject(), 1L));
				}
			}
			if (cs.getSubCourseSubjects() != null && cs.getSubCourseSubjects().size() > 0) {
				this.children = new ArrayList<CourseSubjectDto>();
				for (CourseSubject sub : cs.getSubCourseSubjects()) {
					CourseSubjectDto subDto = new CourseSubjectDto(sub, 1);
					// this.subCourseSubjects.add(subDto);
					this.children.add(subDto);
				}
			}
			if (cs.getTimetables() != null && cs.getTimetables().size() > 0) {
				List<TimeTableDto> timetables = new ArrayList<TimeTableDto>();
				for (CourseSubjectTimetable tt : cs.getTimetables()) {
					TimeTableDto ttDto = new TimeTableDto();
					ttDto.setId(tt.getId());
					ttDto.setCourseSubjectId(this.getId());
					ttDto.setFromWeek(tt.getFromWeek());
					ttDto.setToWeek(tt.getToWeek());
					ttDto.setWeekIndex(tt.getWeekIndex());
					ttDto.setStartDate(tt.getStartDate());
					ttDto.setEndDate(tt.getEndDate());
					if (tt.getRoom() != null) {
						RoomDto r = new RoomDto();
						r.setId(tt.getRoom().getId());
						r.setCode(tt.getRoom().getCode());
						r.setName(tt.getRoom().getName());
						ttDto.setRoom(r);
						ttDto.setRoomName(tt.getRoom().getName());
					}
					if (tt.getTeacher() != null) {
						if (simple == 2) {
							ttDto.setTeacherName(tt.getTeacher().getDisplayName());
						} else {
							StaffDto teacher = new StaffDto();
							teacher.setId(tt.getTeacher().getId());
							teacher.setStaffCode(tt.getTeacher().getStaffCode());
							teacher.setDisplayName(tt.getTeacher().getDisplayName());
							teacher.setEmail(tt.getTeacher().getEmail());
							ttDto.setTeacher(teacher);
						}
					}
					if (tt.getAssistantTeacher() != null) {
						StaffDto teacher = new StaffDto();
						teacher.setId(tt.getAssistantTeacher().getId());
						teacher.setStaffCode(tt.getAssistantTeacher().getStaffCode());
						teacher.setDisplayName(tt.getAssistantTeacher().getDisplayName());
						teacher.setEmail(tt.getAssistantTeacher().getEmail());
						ttDto.setAssistantTeacher(teacher);
					}
					if (tt.getStart() != null) {
						CourseHourDto start = new CourseHourDto();
						start.setId(tt.getStart().getId());
						start.setName(tt.getStart().getName());
						start.setIndexNumber(tt.getStart().getIndexNumber());
						start.setStart(tt.getStart().getStart());
						ttDto.setStartHour(start);
						ttDto.setCourseHourseStartCode(tt.getStart().getIndexNumber());
						ttDto.setStart(tt.getStart().getName());
					}
					if (tt.getEnd() != null) {
						CourseHourDto endHour = new CourseHourDto();
						endHour.setId(tt.getEnd().getId());
						endHour.setName(tt.getEnd().getName());
						endHour.setIndexNumber(tt.getEnd().getIndexNumber());
						endHour.setEnd(tt.getEnd().getEnd());
						ttDto.setEndHour(endHour);
						ttDto.setCourseHourseEndCode(tt.getEnd().getIndexNumber());
						ttDto.setEnd(tt.getEnd().getName());
					}
					timetables.add(ttDto);
				}
				this.setTimetables(timetables);
			}
		}		
	}

	public CourseSubjectDto(CourseSubject cs, List<CourseSubjectDto> lstChild) {
		this.code = cs.getCode();
		this.shortCode = cs.getShortCode();
		this.Id = cs.getId();
		this.maxStudent = cs.getMaxStudent();
		if (EducationConstant.courseSubjectsSize.get(cs.getId()) != null) {
			this.numberStudent = (EducationConstant.courseSubjectsSize.get(cs.getId()));
		} else {
			this.numberStudent = cs.getNumberStudent();
		}
		this.minStudent = cs.getMinStudent();
		this.courseSubjectType = cs.getCourseSubjectType();
		this.isDeniedAll = cs.getIsDeniedAll();
		this.isGrantAll = cs.getIsGrantAll();
		this.isUsingConfig = cs.getIsUsingConfig();
		this.numberHours = cs.getNumberHours();
		this.isFeeByCourseSubject = cs.getIsFeeByCourseSubject();
//		this.minFee = cs.getMinFee();
		this.feePerCredit = cs.getFeePerCredit();
		this.tuitionCoefficient = cs.getTuitionCoefficient();
		this.feePerStudent = cs.getFeePerStudent();
		this.totalFee = cs.getTotalFee();
		this.startDate = cs.getStartDate();
		this.endDate = cs.getEndDate();
		this.learningMethod = cs.getLearningMethod();
		this.status = cs.getStatus();
		if (cs.getTeacher() != null) {
//			this.teacher = new StaffDto(cs.getTeacher());
			this.teacher = new StaffDto();
			this.teacher.setId(cs.getTeacher().getId());
			this.teacher.setDisplayName(cs.getTeacher().getDisplayName());
			this.teacher.setStaffCode(cs.getTeacher().getStaffCode());
		}
//		if(cs.getSemesterSubject()!=null) {
//			this.semesterSubject=new SemesterSubjectDto(cs.getSemesterSubject());
//		}
		this.displayName = cs.getDisplayName();

		if (cs.getParent() != null) {
			this.parent = new CourseSubjectDto();
			this.parent.setCode(cs.getParent().getCode());
			this.parent.setId(cs.getParent().getId());
		}
		if (cs.getTimetables() != null && cs.getTimetables().size() > 0) {
			List<TimeTableDto> timetables = new ArrayList<TimeTableDto>();
			for (CourseSubjectTimetable tt : cs.getTimetables()) {
				TimeTableDto ttDto = new TimeTableDto();
				ttDto.setId(tt.getId());
				ttDto.setCourseSubjectId(this.getId());
				ttDto.setFromWeek(tt.getFromWeek());
				ttDto.setToWeek(tt.getToWeek());
				ttDto.setWeekIndex(tt.getWeekIndex());
				ttDto.setStartDate(tt.getStartDate());
				ttDto.setEndDate(tt.getEndDate());
				if (tt.getRoom() != null) {
					RoomDto r = new RoomDto();
					r.setId(tt.getRoom().getId());
					r.setCode(tt.getRoom().getCode());
					r.setName(tt.getRoom().getName());
					ttDto.setRoom(r);
					ttDto.setRoomName(tt.getRoom().getName());
				}
				if (tt.getTeacher() != null) {
					StaffDto teacher = new StaffDto();
					teacher.setId(tt.getTeacher().getId());
					teacher.setDisplayName(tt.getTeacher().getDisplayName());
					teacher.setEmail(tt.getTeacher().getEmail());
					teacher.setStaffCode(tt.getTeacher().getStaffCode());
					ttDto.setTeacher(teacher);
				}
				if (tt.getAssistantTeacher() != null) {
					StaffDto teacher = new StaffDto();
					teacher.setId(tt.getAssistantTeacher().getId());
					teacher.setStaffCode(tt.getAssistantTeacher().getStaffCode());
					teacher.setDisplayName(tt.getAssistantTeacher().getDisplayName());
					teacher.setEmail(tt.getAssistantTeacher().getEmail());
					ttDto.setAssistantTeacher(teacher);
				}
				if (tt.getStart() != null) {
					CourseHourDto start = new CourseHourDto();
					start.setId(tt.getStart().getId());
					start.setName(tt.getStart().getName());
					start.setIndexNumber(tt.getStart().getIndexNumber());
					start.setStart(tt.getStart().getStart());
					ttDto.setStartHour(start);
					ttDto.setCourseHourseStartCode(tt.getStart().getIndexNumber());
					ttDto.setStart(tt.getStart().getName());
				}
				if (tt.getEnd() != null) {
					CourseHourDto endHour = new CourseHourDto();
					endHour.setId(tt.getEnd().getId());
					endHour.setName(tt.getEnd().getName());
					endHour.setIndexNumber(tt.getEnd().getIndexNumber());
					endHour.setEnd(tt.getEnd().getEnd());
					ttDto.setEndHour(endHour);
					ttDto.setCourseHourseEndCode(tt.getEnd().getIndexNumber());
					ttDto.setEnd(tt.getEnd().getName());
				}
				timetables.add(ttDto);
			}
			this.setTimetables(timetables);
		}
		if (cs.getSubCourseSubjects() != null) {
			this.subCourseSubjects = new HashSet<CourseSubjectDto>();
			for (CourseSubject c : cs.getSubCourseSubjects()) {
				CourseSubjectDto cDto = new CourseSubjectDto();
				cDto.setId(c.getId());
				cDto.setCode(c.getCode());
				cDto.setMaxStudent(c.getMaxStudent());

				if (c.getSemesterSubject() != null) {
					if (c.getSemesterSubject().getRegisterPeriod() != null) {
						cDto.setPeriodId(c.getSemesterSubject().getRegisterPeriod().getId());
						cDto.setPeriodName(c.getSemesterSubject().getRegisterPeriod().getName());
					}
					if (c.getSemesterSubject().getSubject() != null) {
						cDto.setSubjectId(c.getSemesterSubject().getSubject().getId());
						cDto.setSubjectName(c.getSemesterSubject().getSubject().getSubjectName());
						cDto.setSubjectCode(c.getSemesterSubject().getSubject().getSubjectCode());
					}

					if (c.getDisplayName() == null || c.getDisplayName() == "") {
						if (c.getShortCode() != null && c.getShortCode().contains("-")) {
							cDto.setDisplayName(c.getSemesterSubject().getSubject().getSubjectName() + c.getShortCode()
									.substring(c.getShortCode().indexOf("-"), c.getShortCode().length()));
						} else {
							cDto.setDisplayName(
									c.getSemesterSubject().getSubject().getSubjectName() + " " + c.getShortCode());
						}
					}
					cDto.setNumberOfCredit(c.getSemesterSubject().getSubject().getNumberOfCredit());

					cDto.setSemesterSubject(new SemesterSubjectDto(c.getSemesterSubject()));
				}
				cDto.setMinStudent(c.getMinStudent());

				cDto.setNumberStudent(c.getNumberStudent());
				cDto.setShortCode(c.getShortCode());
				if (c.getLearningSkill() != null) {
					cDto.setLearningSkillId(c.getLearningSkill().getId());
				}
				cDto.setNumberHours(c.getNumberHours());
				if (c.getTeacher() != null) {
					cDto.setTeacher(new StaffDto(c.getTeacher()));
				}
				if (c.getTimetables() != null && c.getTimetables().size() > 0) {
					List<TimeTableDto> timetables = new ArrayList<TimeTableDto>();
					for (CourseSubjectTimetable tt : c.getTimetables()) {
						TimeTableDto ttDto = new TimeTableDto();
						ttDto.setId(tt.getId());
						ttDto.setCourseSubjectId(this.getId());
						ttDto.setFromWeek(tt.getFromWeek());
						ttDto.setToWeek(tt.getToWeek());
						ttDto.setWeekIndex(tt.getWeekIndex());
						ttDto.setStartDate(tt.getStartDate());
						ttDto.setEndDate(tt.getEndDate());
						if (tt.getRoom() != null) {
							RoomDto r = new RoomDto();
							r.setId(tt.getRoom().getId());
							r.setCode(tt.getRoom().getCode());
							r.setName(tt.getRoom().getName());
							ttDto.setRoom(r);
							ttDto.setRoomName(tt.getRoom().getName());
						}
						if (tt.getTeacher() != null) {
							StaffDto teacher = new StaffDto();
							teacher.setId(tt.getTeacher().getId());
							teacher.setDisplayName(tt.getTeacher().getDisplayName());
							teacher.setEmail(tt.getTeacher().getEmail());
							teacher.setStaffCode(tt.getTeacher().getStaffCode());
							ttDto.setTeacher(teacher);
						}
						if (tt.getAssistantTeacher() != null) {
							StaffDto teacher = new StaffDto();
							teacher.setId(tt.getAssistantTeacher().getId());
							teacher.setStaffCode(tt.getAssistantTeacher().getStaffCode());
							teacher.setDisplayName(tt.getAssistantTeacher().getDisplayName());
							teacher.setEmail(tt.getAssistantTeacher().getEmail());
							ttDto.setAssistantTeacher(teacher);
						}
						if (tt.getStart() != null) {
							CourseHourDto start = new CourseHourDto();
							start.setId(tt.getStart().getId());
							start.setName(tt.getStart().getName());
							start.setIndexNumber(tt.getStart().getIndexNumber());
							start.setStart(tt.getStart().getStart());
							ttDto.setStartHour(start);
							ttDto.setCourseHourseStartCode(tt.getStart().getIndexNumber());
						}
						if (tt.getEnd() != null) {
							CourseHourDto endHour = new CourseHourDto();
							endHour.setId(tt.getEnd().getId());
							endHour.setName(tt.getEnd().getName());
							endHour.setIndexNumber(tt.getEnd().getIndexNumber());
							endHour.setEnd(tt.getEnd().getEnd());
							ttDto.setEndHour(endHour);
							ttDto.setCourseHourseEndCode(tt.getEnd().getIndexNumber());
						}
						timetables.add(ttDto);
					}
					cDto.setTimetables(timetables);
				}
				// cDto.setParent(this);//Nếu thêm đoạn này thì khi GEN JSON sẽ bị lỗi
				this.subCourseSubjects.add(cDto);

			}
		}

		if (cs.getCourseSubjectConfigs() != null) {
			this.courseSubjectConfigs = new ArrayList<CourseSubjectConfigDto>();
			for (CourseSubjectConfig csc : cs.getCourseSubjectConfigs()) {
				CourseSubjectConfigDto cscDto = new CourseSubjectConfigDto(csc);
				this.courseSubjectConfigs.add(cscDto);
			}
		}
		this.setChildren(getListChildren(cs));
		if (cs.getSemesterSubject() != null) {
			SemesterSubjectDto dto = new SemesterSubjectDto();
			dto.setId(cs.getSemesterSubject().getId());
			dto.setSemester(new SemesterDto(cs.getSemesterSubject().getSemester()));
			dto.setSubject(new SubjectDto(cs.getSemesterSubject().getSubject()));
			if (cs.getSemesterSubject().getRegisterPeriod() != null) {
				this.periodId = cs.getSemesterSubject().getRegisterPeriod().getId();
				this.periodName = cs.getSemesterSubject().getRegisterPeriod().getName();
			}
			if (cs.getSemesterSubject().getSubject() != null) {
				this.subjectId = cs.getSemesterSubject().getSubject().getId();
				this.subjectName = cs.getSemesterSubject().getSubject().getSubjectName();
				this.subjectCode = cs.getSemesterSubject().getSubject().getSubjectCode();
				if (cs.getDisplayName() == null || cs.getDisplayName() == "") {
					if (cs.getShortCode() != null && cs.getShortCode().contains("-")) {
						this.displayName = cs.getSemesterSubject().getSubject().getSubjectName() + cs.getShortCode()
								.substring(cs.getShortCode().indexOf("-"), cs.getShortCode().length());
					} else {
						this.displayName = cs.getSemesterSubject().getSubject().getSubjectName() + " "
								+ cs.getShortCode();
					}
				}
				this.numberOfCredit = cs.getSemesterSubject().getSubject().getNumberOfCredit();
			}
			dto.setIsFeeBySubject(cs.getSemesterSubject().getIsFeeBySubject());
			dto.setTuitionFee(cs.getSemesterSubject().getTuitionFee());
			dto.setTuitionFeeCoefficient(cs.getSemesterSubject().getTuitionFeeCoefficient());
			if (cs.getSemesterSubject().getCourseyear() != null) {
				this.courseYearId = cs.getSemesterSubject().getCourseyear().getId();
				this.courseYearCode = cs.getSemesterSubject().getCourseyear().getCode();
				this.courseYearName = cs.getSemesterSubject().getCourseyear().getName();
				CourseYearDto courseYearDto = new CourseYearDto();
				courseYearDto.setCode(cs.getSemesterSubject().getCourseyear().getCode());
				courseYearDto.setName(cs.getSemesterSubject().getCourseyear().getName());
				courseYearDto.setId(cs.getSemesterSubject().getCourseyear().getId());
				dto.setCourseYearDto(courseYearDto);
			}
			this.semesterSubject = dto;
		}
		if (cs.getEnrollmentClass() != null) {
			this.enrollmentClassId = cs.getEnrollmentClass().getId();
			this.enrollmentClassCode = cs.getEnrollmentClass().getClassCode();
//			this.enrollmentClassDto = new EnrollmentClassDto();
//			this.enrollmentClassDto.setId(cs.getEnrollmentClass().getId());
//			this.enrollmentClassDto.setClassCode(cs.getEnrollmentClass().getClassCode());
		}
		if (cs.getTrainingBase() != null) {
			TrainingBaseDto trainDto = new TrainingBaseDto();
			trainDto.setId(cs.getTrainingBase().getId());
			trainDto.setCode(cs.getTrainingBase().getCode());
			trainDto.setName(cs.getTrainingBase().getName());
			this.trainingBase = trainDto;
		}
		if (cs.getLearningSkill() != null) {
			this.learningSkillId = cs.getLearningSkill().getId();
			this.learningSkillName = cs.getLearningSkill().getName();
			this.learningSkillCode = cs.getLearningSkill().getCode();
		}
		subjectExams = new ArrayList<SubjectExamDto>();
		if (cs.getSubjectExams() != null) {
			for (SubjectExam subjectExam : cs.getSubjectExams()) {
				SubjectExamDto subjectExamDto = new SubjectExamDto(subjectExam);
				this.subjectExams.add(subjectExamDto);
			}
		}
		if (lstChild != null && lstChild.size() > 0) {
			this.children = lstChild;
		}
	}
}
