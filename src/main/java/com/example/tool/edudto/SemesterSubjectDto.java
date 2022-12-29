package com.example.tool.edudto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.JoinColumn;

import com.globits.core.dto.DepartmentDto;
import com.globits.core.dto.RoomDto;
import com.globits.core.dto.TrainingBaseDto;
import com.globits.education.domain.CourseSubject;
import com.globits.education.domain.CourseSubjectTimetable;
import com.globits.education.domain.LearningSkill;
import com.globits.education.domain.PrerequisiteSubject;
import com.globits.education.domain.SemesterRegisterPeriod;
import com.globits.education.domain.SemesterSubject;
import com.globits.education.domain.SemesterSubjectLearningSkill;
import com.globits.education.domain.Subject;
import com.globits.education.domain.SubjectExam;
import com.globits.education.domain.TrainingBaseSemesterSubject;
import com.globits.education.dto.CourseHourDto;
import com.globits.education.dto.CourseSubjectDto;
import com.globits.education.dto.CourseYearDto;
import com.globits.education.dto.LearningSkillDto;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.SemesterRegisterPeriodDto;
import com.globits.education.dto.SemesterSubjectLearningSkillDto;
import com.globits.education.dto.SubjectDto;
import com.globits.education.dto.SubjectExamDto;
import com.globits.education.dto.SubjectExamTypeDto;
import com.globits.education.dto.TimeTableDto;
import com.globits.education.dto.TrainingBaseSemesterSubjectDto;
import com.globits.education.utils.EducationConstant;
import com.globits.hr.dto.StaffDto;

public class SemesterSubjectDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private SemesterDto semester;
	private SemesterDto subSemester;
	private SubjectDto subject;
	private int numberCourse; // Số lượng lớp dự kiến mở
	private double tuitionFeeCoefficient;// Hệ số học phí
	private double tuitionFee;// Mức học phí cơ bản cho môn học
	private double remunerationCoefficient;// Hệ số thù lao
	private double remunerationFee;// Mức thù lao cơ bản
	private List<CourseSubjectDto> courseSubjects;
	private Set<TrainingBaseSemesterSubjectDto> trainingBaseSemesterSubjects;
	private String semesterName;
	private String subjectName;
	private String totalSubjectName;// Tên môn học -số tín chỉ- mã môn
	private Integer numberCurrentCourseSubject=0;
	private Boolean generateCourseSubject;
	
	private Integer maxNumberStudentPerParentCourse;//Số lượng sinh viên tối đa sinh viên trong 1 lớp cha
	private Integer minNumberStudentPerParentCourse;//Số lượng sinh viên tối thiểu sinh viên trong 1 lớp cha
	
	private Integer maxNumberStudentPerChildCourse;//Số lượng sinh viên tối đa sinh viên trong 1 lớp con
	private Integer minNumberStudentPerChildCourse;//Số lượng sinh viên tối thiểu sinh viên trong 1 lớp con
	
	private Integer defaultParentCourseType=0;//Loại lớp cha
	private Integer defaultChildCourseType=1;//Loại lớp con
	private Integer numberChildCourse=0;//Số lượng lớp con trong 1 lớp cha
	private Set<SubjectExamDto> subjectExams;
	private CourseYearDto courseYearDto;
	private LearningSkillDto mainLearningSkill;
	
	private List<SemesterSubjectLearningSkillDto> learningSkills;
	
	private Double numberMainSkillHours;//Số giờ của lớp chính
	
	private Double totalNumberHours;//Tổng số giờ
	
	private Boolean isFeeBySubject;
	
	private Boolean useByCourseYear;
	
	private int retCode=1;
	private Long semesterId;
	private Long subjectId;

	private SemesterRegisterPeriodDto registerPeriod;
	private String registerPeriodName;
	
	private Long courseYearId;
	private Long registerPeriodId;

	private Boolean isUsingLearningSkill = false;
	private String name;
	private String formular;//công thức tính điểm
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SemesterDto getSemester() {
		return semester;
	}

	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}

	public SemesterDto getSubSemester() {
		return subSemester;
	}

	public void setSubSemester(SemesterDto subSemester) {
		this.subSemester = subSemester;
	}

	public SubjectDto getSubject() {
		return subject;
	}

	public void setSubject(SubjectDto subject) {
		this.subject = subject;
	}

	public LearningSkillDto getMainLearningSkill() {
		return mainLearningSkill;
	}

	public void setMainLearningSkill(LearningSkillDto mainLearningSkill) {
		this.mainLearningSkill = mainLearningSkill;
	}

	public Double getNumberMainSkillHours() {
		return numberMainSkillHours;
	}

	public void setNumberMainSkillHours(Double numberMainSkillHours) {
		this.numberMainSkillHours = numberMainSkillHours;
	}

	public Double getTotalNumberHours() {
		return totalNumberHours;
	}

	public void setTotalNumberHours(Double totalNumberHours) {
		this.totalNumberHours = totalNumberHours;
	}

	public int getNumberCourse() {
		return numberCourse;
	}

	public void setNumberCourse(int numberCourse) {
		this.numberCourse = numberCourse;
	}

	public double getTuitionFeeCoefficient() {
		return tuitionFeeCoefficient;
	}

	public void setTuitionFeeCoefficient(double tuitionFeeCoefficient) {
		this.tuitionFeeCoefficient = tuitionFeeCoefficient;
	}

	public double getTuitionFee() {
		return tuitionFee;
	}

	public void setTuitionFee(double tuitionFee) {
		this.tuitionFee = tuitionFee;
	}

	public double getRemunerationCoefficient() {
		return remunerationCoefficient;
	}

	public void setRemunerationCoefficient(double remunerationCoefficient) {
		this.remunerationCoefficient = remunerationCoefficient;
	}

	public double getRemunerationFee() {
		return remunerationFee;
	}

	public void setRemunerationFee(double remunerationFee) {
		this.remunerationFee = remunerationFee;
	}	
	
	public Boolean getIsFeeBySubject() {
		return isFeeBySubject;
	}

	public void setIsFeeBySubject(Boolean isFeeBySubject) {
		this.isFeeBySubject = isFeeBySubject;
	}

	public List<CourseSubjectDto> getCourseSubjects() {
		return courseSubjects;
	}

	public void setCourseSubjects(List<CourseSubjectDto> courseSubjects) {
		this.courseSubjects = courseSubjects;
	}

	public String getSemesterName() {
		return semesterName;
	}

	public void setSemesterName(String semesterName) {
		this.semesterName = semesterName;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getRetCode() {
		return retCode;
	}

	public void setRetCode(int retCode) {
		this.retCode = retCode;
	}
	

	public Long getSemesterId() {
		return semesterId;
	}

	public void setSemesterId(Long semesterId) {
		this.semesterId = semesterId;
	}

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public Set<TrainingBaseSemesterSubjectDto> getTrainingBaseSemesterSubjects() {
		return trainingBaseSemesterSubjects;
	}

	public void setTrainingBaseSemesterSubjects(Set<TrainingBaseSemesterSubjectDto> trainingBaseSemesterSubjects) {
		this.trainingBaseSemesterSubjects = trainingBaseSemesterSubjects;
	}

	public List<SemesterSubjectLearningSkillDto> getLearningSkills() {
		return learningSkills;
	}

	public void setLearningSkills(List<SemesterSubjectLearningSkillDto> learningSkills) {
		this.learningSkills = learningSkills;
	}

	public Boolean getGenerateCourseSubject() {
		return generateCourseSubject;
	}

	public Integer getMaxNumberStudentPerParentCourse() {
		return maxNumberStudentPerParentCourse;
	}

	public void setMaxNumberStudentPerParentCourse(Integer maxNumberStudentPerParentCourse) {
		this.maxNumberStudentPerParentCourse = maxNumberStudentPerParentCourse;
	}

	public Integer getMinNumberStudentPerParentCourse() {
		return minNumberStudentPerParentCourse;
	}

	public void setMinNumberStudentPerParentCourse(Integer minNumberStudentPerParentCourse) {
		this.minNumberStudentPerParentCourse = minNumberStudentPerParentCourse;
	}

	public Integer getMaxNumberStudentPerChildCourse() {
		return maxNumberStudentPerChildCourse;
	}

	public void setMaxNumberStudentPerChildCourse(Integer maxNumberStudentPerChildCourse) {
		this.maxNumberStudentPerChildCourse = maxNumberStudentPerChildCourse;
	}

	public Integer getMinNumberStudentPerChildCourse() {
		return minNumberStudentPerChildCourse;
	}

	public void setMinNumberStudentPerChildCourse(Integer minNumberStudentPerChildCourse) {
		this.minNumberStudentPerChildCourse = minNumberStudentPerChildCourse;
	}

	public Integer getDefaultParentCourseType() {
		return defaultParentCourseType;
	}

	public void setDefaultParentCourseType(Integer defaultParentCourseType) {
		this.defaultParentCourseType = defaultParentCourseType;
	}

	public Integer getDefaultChildCourseType() {
		return defaultChildCourseType;
	}

	public void setDefaultChildCourseType(Integer defaultChildCourseType) {
		this.defaultChildCourseType = defaultChildCourseType;
	}

	public Integer getNumberChildCourse() {
		return numberChildCourse;
	}

	public void setNumberChildCourse(Integer numberChildCourse) {
		this.numberChildCourse = numberChildCourse;
	}

	public void setGenerateCourseSubject(Boolean generateCourseSubject) {
		this.generateCourseSubject = generateCourseSubject;
	}

	public Integer getNumberCurrentCourseSubject() {
		return numberCurrentCourseSubject;
	}

	public void setNumberCurrentCourseSubject(Integer numberCurrentCourseSubject) {
		this.numberCurrentCourseSubject = numberCurrentCourseSubject;
	}

	public Set<SubjectExamDto> getSubjectExams() {
		return subjectExams;
	}

	public void setSubjectExams(Set<SubjectExamDto> subjectExams) {
		this.subjectExams = subjectExams;
	}
	
	public CourseYearDto getCourseYearDto() {
		return courseYearDto;
	}

	public void setCourseYearDto(CourseYearDto courseYearDto) {
		this.courseYearDto = courseYearDto;
	}

	public Boolean getUseByCourseYear() {
		return useByCourseYear;
	}

	public void setUseByCourseYear(Boolean useByCourseYear) {
		this.useByCourseYear = useByCourseYear;
	}
	

	public Long getCourseYearId() {
		return courseYearId;
	}

	public void setCourseYearId(Long courseYearId) {
		this.courseYearId = courseYearId;
	}

	public SemesterRegisterPeriodDto getRegisterPeriod() {
		return registerPeriod;
	}

	public void setRegisterPeriod(SemesterRegisterPeriodDto registerPeriod) {
		this.registerPeriod = registerPeriod;
	}

	public String getRegisterPeriodName() {
		return registerPeriodName;
	}

	public void setRegisterPeriodName(String registerPeriodName) {
		this.registerPeriodName = registerPeriodName;
	}

	public Boolean getIsUsingLearningSkill() {
		return isUsingLearningSkill;
	}

	public void setIsUsingLearningSkill(Boolean isUsingLearningSkill) {
		this.isUsingLearningSkill = isUsingLearningSkill;
	}
	

	public Long getRegisterPeriodId() {
		return registerPeriodId;
	}

	public void setRegisterPeriodId(Long registerPeriodId) {
		this.registerPeriodId = registerPeriodId;
	}

	public String getTotalSubjectName() {
		return totalSubjectName;
	}

	public void setTotalSubjectName(String totalSubjectName) {
		this.totalSubjectName = totalSubjectName;
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getFormular() {
		return formular;
	}

	public void setFormular(String formular) {
		this.formular = formular;
	}

	public SemesterSubjectDto() {

	}

	public SemesterSubjectDto(SemesterSubject ss) {
		this.id = ss.getId();
		this.numberCourse = ss.getNumberCourse();
		this.remunerationCoefficient = ss.getRemunerationCoefficient();
		this.remunerationFee = ss.getRemunerationFee();
		this.tuitionFee = ss.getTuitionFee();
		this.tuitionFeeCoefficient = ss.getTuitionFeeCoefficient();
		this.isFeeBySubject = ss.getIsFeeBySubject();
		//Đợt học
		if(ss.getRegisterPeriod()!=null) {
			this.registerPeriod = new SemesterRegisterPeriodDto(ss.getRegisterPeriod());
			this.registerPeriodName = ss.getRegisterPeriod().getName();
			this.registerPeriodId=ss.getRegisterPeriod().getId();
		}
		
		//Khóa học
		if(ss.getCourseyear()!=null) {
			this.courseYearDto = new CourseYearDto();
			this.courseYearDto.setId(ss.getCourseyear().getId());
			this.courseYearDto.setName(ss.getCourseyear().getName());
			this.courseYearDto.setCode(ss.getCourseyear().getCode());
			this.courseYearDto.setYear(ss.getCourseyear().getYear());
			this.courseYearId=ss.getCourseyear().getId();
		}
		this.useByCourseYear = ss.getUseByCourseYear();
		String name="";
		if (ss.getSubject() != null) {
			Subject subject = ss.getSubject();
			this.setSubjectName(subject.getSubjectName());
			this.subject = new SubjectDto();
			this.subject.setId(ss.getSubject().getId());
			this.subject.setSubjectCode(ss.getSubject().getSubjectCode());
			this.subject.setSubjectName(ss.getSubject().getSubjectName());
			this.subject.setSubjectNameEng(ss.getSubject().getSubjectNameEng());
			this.subject.setNumberOfCredit(ss.getSubject().getNumberOfCredit());
			this.subjectId=ss.getSubject().getId();
			this.subjectName=ss.getSubject().getSubjectName();
			name=ss.getSubject().getSubjectName();
			this.totalSubjectName = ss.getSubject().getSubjectName()+ " - "+ ss.getSubject().getNumberOfCredit()+ " - "+ss.getSubject().getSubjectCode();
			this.subject.setTotalSubjectName(ss.getSubject().getSubjectName()+ " - "+ ss.getSubject().getNumberOfCredit()+ " - "+ss.getSubject().getSubjectCode());
			if(ss.getSubject().getDepartment() != null) {
				DepartmentDto depart = new DepartmentDto();
				depart.setId(subject.getDepartment().getId());
				depart.setName(subject.getDepartment().getName());
				depart.setCode(subject.getDepartment().getCode());
				if(ss.getSubject().getDepartment().getParent()!=null) {
					DepartmentDto parent = new DepartmentDto();
					parent.setId(ss.getSubject().getDepartment().getParent().getId());
					parent.setName(ss.getSubject().getDepartment().getParent().getName());
					parent.setCode(ss.getSubject().getDepartment().getParent().getCode());
					depart.setParent(parent);
					this.subject.setDepartmentParentName(ss.getSubject().getDepartment().getParent().getName());
				}
				this.subject.setDepartment(depart);
			}
//			if (subject.getPrerequisiteSubjects() != null && (!subject.getPrerequisiteSubjects().isEmpty())) {
//				this.subject.setPrerequisiteSubjects(new HashSet<PrerequisiteSubjectDto>());
//				for (PrerequisiteSubject pr : subject.getPrerequisiteSubjects()) {
//					PrerequisiteSubjectDto preDto = new PrerequisiteSubjectDto();
//					preDto.setId(pr.getId());
//					preDto.setPrerequiteMark(pr.getPrerequiteMark());
//					preDto.setPrerequiteType(pr.getPrerequiteType());
//					if (pr.getSubject() != null) {
//						preDto.setPrerequiteSubjectCode(pr.getSubject().getSubjectCode());
//						preDto.setSubjectName(pr.getSubject().getSubjectName());
//					}
//					this.subject.getPrerequisiteSubjects().add(preDto);
//				}
//			}
		}
		if (ss.getSemester() != null) {
			this.setSemesterName(ss.getSemester().getSemesterName());
			this.semester = new SemesterDto();
			this.semester.setDescription(ss.getSemester().getDescription());
			this.semester.setId(ss.getSemester().getId());
			this.semester.setSemesterCode(ss.getSemester().getSemesterCode());
			this.semester.setSemesterName(ss.getSemester().getSemesterName());
			this.semesterId=ss.getSemester().getId();
			this.semesterName=ss.getSemester().getSemesterName();
			if(name!=null && name.length()>0) {
				name=name+"_"+ss.getSemester().getSemesterName();
			}else {
				name=ss.getSemester().getSemesterName();
			}
		}
		this.name=name;
		if(ss.getSubSemester()!=null) {
			this.subSemester = new SemesterDto();
			this.subSemester.setDescription(ss.getSubSemester().getDescription());
			this.subSemester.setId(ss.getSubSemester().getId());
			this.subSemester.setSemesterCode(ss.getSubSemester().getSemesterCode());
			this.subSemester.setSemesterName(ss.getSubSemester().getSemesterName());		
		}
		if(ss.getMainLearningSkill()!=null) {
			this.mainLearningSkill = new LearningSkillDto(ss.getMainLearningSkill());
		}
		this.numberMainSkillHours = ss.getNumberMainSkillHours();
		this.totalNumberHours = ss.getTotalNumberHours();
		
		if (ss.getCourseSubjects() != null) {
//			this.generateCourseSubject = true;
			this.courseSubjects = new ArrayList<CourseSubjectDto>();
			for (CourseSubject cs : ss.getCourseSubjects()) {
				CourseSubjectDto csDto = new CourseSubjectDto();
				csDto.setCode(cs.getCode());
				csDto.setId(cs.getId());
				csDto.setMaxStudent(cs.getMaxStudent());
				csDto.setMinStudent(cs.getMinStudent());
				if(EducationConstant.courseSubjectsSize.get(cs.getId())!=null) {
					csDto.setNumberStudent(EducationConstant.courseSubjectsSize.get(cs.getId()));
				}
				else {
					csDto.setNumberStudent(cs.getNumberStudent());
				}
				
				csDto.setCourseSubjectType(cs.getCourseSubjectType());

				if(cs.getSemesterSubject()!=null && cs.getSemesterSubject().getSubject()!=null) {
					if(cs.getShortCode()!=null && cs.getShortCode().contains("-")) {
						csDto.setDisplayName(cs.getSemesterSubject().getSubject().getSubjectName() + cs.getShortCode().substring(cs.getShortCode().indexOf("-"), cs.getShortCode().length()));	
					}
					else {
						csDto.setDisplayName(cs.getSemesterSubject().getSubject().getSubjectName() +" " + cs.getShortCode());
					}
				}
				
				if (cs.getParent() != null) {
					CourseSubject parent = cs.getParent();
					CourseSubjectDto csParentDto = new CourseSubjectDto();
					csParentDto.setCode(parent.getCode());
					csParentDto.setId(parent.getId());
					// csParentDto.setSemesterSubject(this);//Lưu ý không thêm đoạn này vì nếu thêm
					// sẽ lỗi Jackson khi tạo JSON
					csDto.setParent(csParentDto);
				}
				if (cs.getSubCourseSubjects() != null) {
					csDto.setSubCourseSubjects(new HashSet<CourseSubjectDto>());
					for (CourseSubject c : cs.getSubCourseSubjects()) {
						CourseSubjectDto cDto = new CourseSubjectDto();
						cDto.setId(c.getId());
						cDto.setCode(c.getCode());
						cDto.setMaxStudent(c.getMaxStudent());
						// if(c.getSemesterSubject()!=null){
						// cDto.setSemesterSubject(this);//Lưu ý không thêm đoạn này vì nếu thêm sẽ lỗi
						// Jackson khi tạo JSON
						// }
						cDto.setMinStudent(c.getMinStudent());
						if(EducationConstant.courseSubjectsSize.get(c.getId())!=null) {
							cDto.setNumberStudent(EducationConstant.courseSubjectsSize.get(c.getId()));
						}
						else {
							cDto.setNumberStudent(c.getNumberStudent());
						}
						
						// cDto.setParent(csDto);
						csDto.getSubCourseSubjects().add(cDto);
					}
				}
				if (cs.getTimetables() != null && cs.getTimetables().size() > 0) {
					List<TimeTableDto> timetables = new ArrayList<TimeTableDto>();
					for (CourseSubjectTimetable tt : cs.getTimetables()) {
						TimeTableDto ttDto = new TimeTableDto();
						ttDto.setCourseSubjectId(csDto.getId());
						ttDto.setFromWeek(tt.getFromWeek());
						ttDto.setToWeek(tt.getToWeek());
						ttDto.setWeekIndex(tt.getWeekIndex());
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
							ttDto.setStartHour(start);
						}
						if (tt.getEnd() != null) {
							CourseHourDto endHour = new CourseHourDto();
							endHour.setId(tt.getEnd().getId());
							endHour.setName(tt.getEnd().getName());
							endHour.setIndexNumber(tt.getEnd().getIndexNumber());
							ttDto.setEndHour(endHour);
						}
						timetables.add(ttDto);
					}
					csDto.setTimetables(timetables);
				}
				this.courseSubjects.add(csDto);
			}
			if(ss.getTrainingBaseSemesterSubjects()!=null && ss.getTrainingBaseSemesterSubjects().size()>0) {
				this.trainingBaseSemesterSubjects = new HashSet<TrainingBaseSemesterSubjectDto>();
				for(TrainingBaseSemesterSubject t:ss.getTrainingBaseSemesterSubjects()) {
					TrainingBaseSemesterSubjectDto tDto = new TrainingBaseSemesterSubjectDto();
					tDto.setNumberCourseSubject(t.getNumberCourseSubject());
					
					TrainingBaseDto trainingBase = new TrainingBaseDto();
					trainingBase.setAddress(t.getTrainingBase().getAddress());
					trainingBase.setId(t.getTrainingBase().getId());
					trainingBase.setCode(t.getTrainingBase().getCode());
					trainingBase.setDescription(t.getTrainingBase().getDescription());
					tDto.setTrainingBase(trainingBase);

					this.trainingBaseSemesterSubjects.add(tDto);
				}
			}
			if(ss.getChildCourseType()!=null) {
				this.defaultChildCourseType = ss.getChildCourseType();
			}
			if(ss.getMaxNumberStudentPerChildCourse()!=null) {
				this.setMaxNumberStudentPerChildCourse(ss.getMaxNumberStudentPerChildCourse());
			}
			if(ss.getMinNumberStudentPerChildCourse()!=null) {
				this.setMinNumberStudentPerChildCourse(ss.getMinNumberStudentPerChildCourse());
			}
			if(ss.getMaxNumberStudentPerParentCourse()!=null) {
				this.setMaxNumberStudentPerParentCourse(ss.getMaxNumberStudentPerParentCourse());
			}
			if(ss.getMinNumberStudentPerParentCourse()!=null) {
				this.setMinNumberStudentPerParentCourse(ss.getMinNumberStudentPerParentCourse());
			}
			if(ss.getNumberChildCourse()!=null) {
				this.setNumberChildCourse(ss.getNumberChildCourse());
			}
			if(ss.getSubjectExams()!=null && ss.getSubjectExams().size()>0) {
				this.subjectExams = new HashSet<SubjectExamDto>();
				
				for (SubjectExam ex : ss.getSubjectExams()) {
					SubjectExamDto exDto = new SubjectExamDto();
					exDto.setId(ex.getId());
					exDto.setCode(ex.getCode());
					exDto.setName(ex.getName());
					exDto.setCoefficient(ex.getCoefficient());
					exDto.setCoffi((int)(ex.getCoefficient()*100));
					exDto.setInputMarkType(ex.getInputMarkType());
					exDto.setExamType(ex.getExamType());
					if(ex.getSubjectExamType()!=null) {
						SubjectExamTypeDto setDto=new SubjectExamTypeDto();
						setDto.setId(ex.getSubjectExamType().getId());
						setDto.setCode(ex.getSubjectExamType().getCode());
						setDto.setName(ex.getSubjectExamType().getName());
						exDto.setSubjectExamType(setDto);
					}
					this.subjectExams.add(exDto);
					if(this.formular!=null && this.formular.length()>0) {
						this.formular = this.formular+ " + "+ exDto.getCoffi() +"%*"+exDto.getCode();
					}else {
						this.formular = exDto.getCoffi() +"%*"+exDto.getCode();
					}
				}
			}
			
			
			
			if(ss.getLearningSkills()!=null && ss.getLearningSkills().size()>0) {
				this.learningSkills = new ArrayList<SemesterSubjectLearningSkillDto>();				
				for (SemesterSubjectLearningSkill skill : ss.getLearningSkills()) {
					this.learningSkills.add(new SemesterSubjectLearningSkillDto(skill));
				}
			}
		
		}
	}
	public SemesterSubjectDto( Long subjectId,Long semesterId, String semesterName,String subjectName, Long numberCourse) {
		this.semesterId=semesterId;
		this.subjectId=subjectId;
		this.semesterName=semesterName;
		this.subjectName=subjectName;
		this.numberCourse=numberCourse.intValue();
	}

	public SemesterSubjectDto(SemesterSubject entity, boolean simple) {
		this.id = entity.getId();
		if (entity.getSemester() != null) {
			this.semesterId=entity.getSemester().getId();
			this.semesterName=entity.getSemester().getSemesterName();
		}
		if (entity.getSubject() != null) {
			this.subjectId = entity.getSubject().getId();
			this.subjectName=entity.getSubject().getSubjectName();
		}
		if(simple==true) {
			this.name=subjectName + "_"+semesterName;
			if(entity.getRegisterPeriod()!=null) {
				this.name= this.name+ "_"+entity.getRegisterPeriod().getName();
			}
			if(entity.getCourseyear()!=null) {
				this.name= this.name+ "_"+entity.getCourseyear().getName();
			}
			this.name= this.name+ "_"+numberCourse;
			SubjectDto dto=new SubjectDto();
			dto.setId(subjectId);
			if(entity.getSubject() != null)
				dto.setSubjectCode(entity.getSubject().getSubjectCode());
			this.subject=dto;
		}
		if(entity.getRegisterPeriod()!=null) {
			this.registerPeriodName = entity.getRegisterPeriod().getName();
		}
		
		if(entity.getCourseyear()!=null) {
			this.courseYearDto = new CourseYearDto();
			this.courseYearDto.setName(entity.getCourseyear().getName());
		}
		
		if(entity.getSubjectExams()!=null && entity.getSubjectExams().size()>0) {
			this.subjectExams = new HashSet<SubjectExamDto>();
			
			for (SubjectExam ex : entity.getSubjectExams()) {
				SubjectExamDto exDto = new SubjectExamDto();
				exDto.setId(ex.getId());
				exDto.setCode(ex.getCode());
				exDto.setName(ex.getName());
				exDto.setCoefficient(ex.getCoefficient());
				exDto.setCoffi((int)(ex.getCoefficient()*100));
				exDto.setInputMarkType(ex.getInputMarkType());
				exDto.setExamType(ex.getExamType());
				if(ex.getSubjectExamType()!=null) {
					SubjectExamTypeDto setDto=new SubjectExamTypeDto();
					setDto.setId(ex.getSubjectExamType().getId());
					setDto.setCode(ex.getSubjectExamType().getCode());
					setDto.setName(ex.getSubjectExamType().getName());
					exDto.setSubjectExamType(setDto);
				}
				this.subjectExams.add(exDto);
				if(this.formular!=null && this.formular.length()>0) {
					this.formular = this.formular+ " + "+ exDto.getCoffi() +"%*"+exDto.getCode();
				}else {
					this.formular = exDto.getCoffi() +"%*"+exDto.getCode();
				}
			}
		}
		this.numberCourse = entity.getNumberCourse();
	}
	
	public SemesterSubjectDto(SemesterSubject ss, Long type) {
		this.id = ss.getId();
		String name="";
		if (ss.getSubject() != null) {
			Subject subject = ss.getSubject();
			this.setSubjectName(subject.getSubjectName());
			this.subject = new SubjectDto();
			this.subject.setId(ss.getSubject().getId());
			this.subject.setSubjectCode(ss.getSubject().getSubjectCode());
			this.subject.setSubjectName(ss.getSubject().getSubjectName());
			this.subject.setSubjectNameEng(ss.getSubject().getSubjectNameEng());
			this.subject.setNumberOfCredit(ss.getSubject().getNumberOfCredit());
			this.subjectId=ss.getSubject().getId();
			this.subjectName=ss.getSubject().getSubjectName();
			name=ss.getSubject().getSubjectName();
			this.totalSubjectName = ss.getSubject().getSubjectName()+ " - "+ ss.getSubject().getNumberOfCredit()+ " - "+ss.getSubject().getSubjectCode();
			this.subject.setTotalSubjectName(ss.getSubject().getSubjectName()+ " - "+ ss.getSubject().getNumberOfCredit()+ " - "+ss.getSubject().getSubjectCode());
			
		}
		if (ss.getSemester() != null) {
			this.setSemesterName(ss.getSemester().getSemesterName());
			this.semester = new SemesterDto();
			this.semester.setDescription(ss.getSemester().getDescription());
			this.semester.setId(ss.getSemester().getId());
			this.semester.setSemesterCode(ss.getSemester().getSemesterCode());
			this.semester.setSemesterName(ss.getSemester().getSemesterName());
			this.semesterId=ss.getSemester().getId();
			this.semesterName=ss.getSemester().getSemesterName();
			if(name!=null && name.length()>0) {
				name=name+"_"+ss.getSemester().getSemesterName();
			}else {
				name=ss.getSemester().getSemesterName();
			}
		}
		this.name=name;
	}
	public SemesterSubjectDto( Long id,Long subjectId,String subjectName, String semesterName,String periodName, String courseYearName,int numberCourse) {
		this.id=id;		
		this.semesterName=semesterName;
		this.subjectName=subjectName;
		this.name=subjectName + "_"+semesterName;
		if(periodName!=null) {
			this.name= this.name+ "_"+periodName;
		}
		if(courseYearName!=null) {
			this.name= this.name+ "_"+courseYearName;
		}
		this.name= this.name+ "_"+numberCourse;
		SubjectDto dto=new SubjectDto();
		dto.setId(subjectId);
		this.subject=dto;
	}
}
