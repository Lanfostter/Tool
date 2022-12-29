package com.example.tool.edudto;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.globits.core.domain.Room;
import com.globits.core.dto.RoomDto;
import com.globits.core.dto.TrainingBaseDto;
import com.globits.education.Const;
import com.globits.education.domain.CourseSubject;
import com.globits.education.domain.SemesterSubjectExamHour;
import com.globits.education.domain.SemesterSubjectExamRoom;
import com.globits.education.domain.Student;
import com.globits.education.domain.StudentCourseSubject;
import com.globits.education.domain.StudentSemesterSubjectExamRoom;
import com.globits.education.dto.CourseHourDto;
import com.globits.education.dto.CourseSubjectDto;
import com.globits.education.dto.CourseYearDto;
import com.globits.education.dto.ExamHourDto;
import com.globits.education.dto.ExamRegisterPeriodDto;
import com.globits.education.dto.ExamSkillDto;
import com.globits.education.dto.ExamTypeDto;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.SemesterRegisterPeriodDto;
import com.globits.education.dto.SemesterSubjectDto;
import com.globits.education.dto.SemesterSubjectExamDto;
import com.globits.education.dto.SemesterSubjectExamHourDto;
import com.globits.education.dto.SpecialPointDto;
import com.globits.education.dto.StudentCourseSubjectDto;
import com.globits.education.dto.StudentDto;
import com.globits.education.dto.StudentSemesterSubjectExamRoomDto;
import com.globits.education.dto.SubjectDto;
import com.globits.education.utils.EducationConstant;


public class SemesterSubjectExamRoomDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String roomCode;
	private CourseHourDto startHour;
	private CourseHourDto endHour;
	private SemesterSubjectExamHourDto subjectExamHour;
	private int duration;// Tính theo phút tính thời gian thi chính xác bao nhiêu phút.
	private Date examDate;
	private String examDateString;
	private Integer numberExpectedStudent;// So luong sinh vien du kien
	private Integer numberStudent;// So luong sinh vien thuc te du thi
	private Integer numberStudentAddToBag;
	private Boolean isAddedToTestBag;
	private String resultCode;// Trả về kết quả thành công hay thất bại, thuộc tính này không có trong Entity
							  // chỉ có trong model
	private Boolean isAddedFullToTestBag;
	private Boolean isAbleToCreateBag;
	private SemesterSubjectExamDto semesterSubjectExam;

	private List<StudentSemesterSubjectExamRoomDto> studentList;
	private String subjectName;
	private String semesterName;
	private String courseYearName;
	private String registerPeriodName;
	
	private ExamHourDto examHour;
	private TrainingBaseDto trainingBase;
	private ExamSkillDto examSkill;
	
	private RoomDto room;
	private Integer viewOrder;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoomCode() {
		return roomCode;
	}

	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public CourseHourDto getStartHour() {
		return startHour;
	}

	public void setStartHour(CourseHourDto startHour) {
		this.startHour = startHour;
	}

	public CourseHourDto getEndHour() {
		return endHour;
	}

	public void setEndHour(CourseHourDto endHour) {
		this.endHour = endHour;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Integer getNumberExpectedStudent() {
		return numberExpectedStudent;
	}

	public void setNumberExpectedStudent(Integer numberExpectedStudent) {
		this.numberExpectedStudent = numberExpectedStudent;
	}

	public Integer getNumberStudent() {
		return numberStudent;
	}

	public void setNumberStudent(Integer numberStudent) {
		this.numberStudent = numberStudent;
	}

	public SemesterSubjectExamDto getSemesterSubjectExam() {
		return semesterSubjectExam;
	}

	public Date getExamDate() {
		return examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	public void setSemesterSubjectExam(SemesterSubjectExamDto semesterSubjectExam) {
		this.semesterSubjectExam = semesterSubjectExam;
	}

	public List<StudentSemesterSubjectExamRoomDto> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<StudentSemesterSubjectExamRoomDto> studentList) {
		this.studentList = studentList;
	}
	public RoomDto getRoom() {
		return room;
	}

	public void setRoom(RoomDto room) {
		this.room = room;
	}

	public Boolean getIsAddedToTestBag() {
		return isAddedToTestBag;
	}

	public void setIsAddedToTestBag(Boolean isAddedToTestBag) {
		this.isAddedToTestBag = isAddedToTestBag;
	}	
	
	public Boolean getIsAddedFullToTestBag() {
		return isAddedFullToTestBag;
	}

	public void setIsAddedFullToTestBag(Boolean isAddedFullToTestBag) {
		this.isAddedFullToTestBag = isAddedFullToTestBag;
	}

	public Boolean getIsAbleToCreateBag() {
		return isAbleToCreateBag;
	}

	public void setIsAbleToCreateBag(Boolean isAbleToCreateBag) {
		this.isAbleToCreateBag = isAbleToCreateBag;
	}

	public Integer getNumberStudentAddToBag() {
		return numberStudentAddToBag;
	}

	public void setNumberStudentAddToBag(Integer numberStudentAddToBag) {
		this.numberStudentAddToBag = numberStudentAddToBag;
	}
	

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSemesterName() {
		return semesterName;
	}

	public void setSemesterName(String semesterName) {
		this.semesterName = semesterName;
	}

	public String getCourseYearName() {
		return courseYearName;
	}

	public void setCourseYearName(String courseYearName) {
		this.courseYearName = courseYearName;
	}
	
	public String getRegisterPeriodName() {
		return registerPeriodName;
	}

	public void setRegisterPeriodName(String registerPeriodName) {
		this.registerPeriodName = registerPeriodName;
	}	

	public ExamHourDto getExamHour() {
		return examHour;
	}

	public void setExamHour(ExamHourDto examHour) {
		this.examHour = examHour;
	}
	

	public TrainingBaseDto getTrainingBase() {
		return trainingBase;
	}

	public void setTrainingBase(TrainingBaseDto trainingBase) {
		this.trainingBase = trainingBase;
	}

	public ExamSkillDto getExamSkill() {
		return examSkill;
	}

	public void setExamSkill(ExamSkillDto examSkill) {
		this.examSkill = examSkill;
	}

	public SemesterSubjectExamHourDto getSubjectExamHour() {
		return subjectExamHour;
	}

	public void setSubjectExamHour(SemesterSubjectExamHourDto subjectExamHour) {
		this.subjectExamHour = subjectExamHour;
	}

	public Integer getViewOrder() {
		return viewOrder;
	}

	public void setViewOrder(Integer viewOrder) {
		this.viewOrder = viewOrder;
	}	

	public String getExamDateString() {
		try {
			 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
			 examDateString = formatter.format(this.examDate);
		} catch (Exception e) {
			// TODO: handle exception
		}
		  
		return examDateString;
	}

	public void setExamDateString(String examDateString) {
		this.examDateString = examDateString;
	}

	public SemesterSubjectExamRoomDto() {

	}

	public SemesterSubjectExamRoomDto(SemesterSubjectExamRoom sse) {
		if (sse != null) {
			this.id = sse.getId();
			this.duration = sse.getDuration();
			this.viewOrder = sse.getViewOrder();
			if(sse.getSemesterSubjectExam()!=null) {
				SemesterSubjectExamDto dto=new SemesterSubjectExamDto();
				dto.setId(sse.getSemesterSubjectExam().getId());
				dto.setSemester(new SemesterDto(sse.getSemesterSubjectExam().getSemester()));
				dto.setSubject(new SubjectDto(sse.getSemesterSubjectExam().getSubject()));
				if(sse.getSemesterSubjectExam().getCourseyear()!=null)
				dto.setCourseYearDto(new CourseYearDto(sse.getSemesterSubjectExam().getCourseyear(),true));
				if(sse.getSemesterSubjectExam().getRegisterPeriod()!=null) {
					dto.setRegisterPeriod(new SemesterRegisterPeriodDto(sse.getSemesterSubjectExam().getRegisterPeriod(),true));
				}
				if(sse.getSemesterSubjectExam().getSemesterSubject()!=null) {
					SemesterSubjectDto ssDto=new SemesterSubjectDto();
					ssDto.setId(sse.getSemesterSubjectExam().getSemesterSubject().getId());
					dto.setSemesterSubject(ssDto);
				}
				dto.setExamRound(sse.getSemesterSubjectExam().getExamRound());
				if(sse.getSemesterSubjectExam().getExamRegisterPeriod()!=null) {
					ExamRegisterPeriodDto examDto=new ExamRegisterPeriodDto();
					examDto.setId(sse.getSemesterSubjectExam().getExamRegisterPeriod().getId());
					examDto.setName(sse.getSemesterSubjectExam().getExamRegisterPeriod().getName());
					examDto.setCode(sse.getSemesterSubjectExam().getExamRegisterPeriod().getCode());
					dto.setExamPeriod(examDto);
					
				}
				this.semesterSubjectExam=dto;
			}
			if (sse.getStartHour() != null){
				CourseHourDto start = new CourseHourDto();
				start.setId(sse.getStartHour().getId());
				start.setName(sse.getStartHour().getName());
				start.setIndexNumber(sse.getStartHour().getIndexNumber());
				this.startHour = start;
			}
			if (sse.getEndHour() != null){
				CourseHourDto endHour = new CourseHourDto();
				endHour.setId(sse.getEndHour().getId());
				endHour.setName(sse.getEndHour().getName());
				endHour.setIndexNumber(sse.getEndHour().getIndexNumber());
				this.endHour =endHour;
			}
			
			if(sse.getSubjectExamHour()!=null) {
				subjectExamHour = new SemesterSubjectExamHourDto();
				subjectExamHour.setId(sse.getId());
				ExamHourDto examHourDto= new ExamHourDto();
				examHourDto.setId(sse.getSubjectExamHour().getExamHour().getId());
				examHourDto.setName(sse.getSubjectExamHour().getExamHour().getName());
				examHourDto.setCode(sse.getSubjectExamHour().getExamHour().getCode());
				
				
				subjectExamHour.setExamHour(examHourDto);
			}
			if (sse.getRoom() != null) {
				RoomDto r = new RoomDto();
				r.setId(sse.getRoom().getId());
				r.setCode(sse.getRoom().getCode());
				r.setName(sse.getRoom().getName());
				this.room=r;				
			}
			if(sse.getExamHour()!=null) {
				ExamHourDto eh=new ExamHourDto();
				eh.setId(sse.getExamHour().getId());
				eh.setStart(sse.getExamHour().getStart());
				eh.setEnd(sse.getExamHour().getEnd());
				eh.setType(sse.getExamHour().getType());
				eh.setName(sse.getExamHour().getName());
				eh.setCode(sse.getExamHour().getCode());
				if(sse.getExamHour().getExamType()!=null) {
					ExamTypeDto typeDto=new ExamTypeDto();
					typeDto.setName(sse.getExamHour().getExamType().getName());
					typeDto.setCode(sse.getExamHour().getExamType().getCode());
					eh.setExamType(typeDto);
				}
				this.examHour=eh;
			}
			if(sse.getTrainingBase()!=null) {
				TrainingBaseDto trainDto=new TrainingBaseDto();
				trainDto.setId(sse.getTrainingBase().getId());
				trainDto.setCode(sse.getTrainingBase().getCode());
				trainDto.setName(sse.getTrainingBase().getName());
				this.trainingBase=trainDto;
			}
			if(sse.getExamSkill()!=null) {
				ExamSkillDto esDto=new ExamSkillDto();
				esDto.setId(sse.getExamSkill().getId());
				esDto.setCode(sse.getExamSkill().getCode());
				esDto.setName(sse.getExamSkill().getName());
				this.examSkill=esDto;
			}
//			if(sse.getNumberStudent()!=null)
//				this.numberStudent = sse.getNumberStudent();
//			else 
//				this.numberStudent = 0;
			if(sse.getNumberExpectedStudent()!=null) 
				this.numberExpectedStudent = sse.getNumberExpectedStudent();
			else
				this.numberExpectedStudent=0;
			this.roomCode = sse.getRoomCode();
			this.isAddedToTestBag = sse.getIsAddedToTestBag();
			this.isAddedFullToTestBag = sse.getIsAddedFullToTestBag();
			if (sse.getExamDate() != null) {
				this.examDate = sse.getExamDate();
			}
			this.numberStudentAddToBag=0;
			this.numberStudent=0;
			if (sse.getStudentList() != null && sse.getStudentList().size() > 0) {				
				this.studentList = new ArrayList<StudentSemesterSubjectExamRoomDto>();
				for (StudentSemesterSubjectExamRoom ssse : sse.getStudentList()) {
					StudentSemesterSubjectExamRoomDto ssseDto = new StudentSemesterSubjectExamRoomDto();
					if(ssse.getTestBag()!=null) {
						this.numberStudentAddToBag+=1;
					}
					if(ssse.getStatus()==0) this.numberStudent +=1;
					ssseDto.setExamCode(ssse.getExamCode());
					ssseDto.setId(ssse.getId());
					ssseDto.setMarkingCode(ssse.getMarkingCode());
					if(ssse.getSpecialPoint()!=null) {
						ssseDto.setSpecialPoint(new SpecialPointDto(ssse.getSpecialPoint()));
					}
					if (ssse.getStudent() != null) {
						Student d = ssse.getStudent();
						StudentDto studentDto = new StudentDto();
						studentDto.setId(d.getId());
						studentDto.setDisplayName(d.getDisplayName());
						studentDto.setStudentCode(d.getStudentCode());
						ssseDto.setStudentCode(d.getStudentCode());
						studentDto.setFirstName(d.getFirstName());
						studentDto.setLastName(d.getLastName());
						if(d.getEnrollmentClass()!=null) {
							ssseDto.setClassName(d.getEnrollmentClass().getClassName());
							ssseDto.setClassCode(d.getEnrollmentClass().getClassCode());
						}
						ssseDto.setStudent(studentDto);
					}
					if (ssse.getStudentCourseSubject() != null) {
						StudentCourseSubject scs = ssse.getStudentCourseSubject();
						StudentCourseSubjectDto scsDto = new StudentCourseSubjectDto();
						if (scs.getCourseSubject() != null) {
							CourseSubject cs = scs.getCourseSubject();
							CourseSubjectDto courseSubject = new CourseSubjectDto();
							courseSubject.setId(cs.getId());
							courseSubject.setCode(cs.getCode());
							scsDto.setCourseSubject(courseSubject);
						}
						ssseDto.setStudentCourseSubject(scsDto);
					}
					if(ssse.getIsExempt()!=null) {
						ssseDto.setIsExempt(ssse.getIsExempt());//xét trường hợp không học nhưng được thi
					}
					ssseDto.setStatus(ssse.getStatus());
					this.studentList.add(ssseDto);
				}
			}
			if(this.getNumberStudent()<1) {
				this.setIsAbleToCreateBag(false);
				this.setIsAddedToTestBag(false);
				this.setIsAddedFullToTestBag(false);
			}
			else if(this.getNumberStudent()>0 && this.getNumberStudentAddToBag() < this.getNumberStudent()){
				this.setIsAbleToCreateBag(true);
				this.setIsAddedToTestBag(true);
				this.setIsAddedFullToTestBag(false);
			}
			else if(this.getNumberStudent()>0 && this.getNumberStudentAddToBag() >= this.getNumberStudent()) {
				this.setIsAbleToCreateBag(false);
				this.setIsAddedToTestBag(true);
				this.setIsAddedFullToTestBag(true);
			}
		}
	}
	
	public SemesterSubjectExamRoomDto(SemesterSubjectExamRoom sse, boolean collapse) {
		if (sse != null) {
			this.id = sse.getId();
			this.duration = sse.getDuration();
			this.viewOrder = sse.getViewOrder();
			if(sse.getSemesterSubjectExam()!=null) {
				SemesterSubjectExamDto dto=new SemesterSubjectExamDto();
				dto.setId(sse.getSemesterSubjectExam().getId());
				dto.setSemester(new SemesterDto(sse.getSemesterSubjectExam().getSemester()));
				dto.setSubject(new SubjectDto(sse.getSemesterSubjectExam().getSubject()));
//				if(sse.getSemesterSubjectExam().getCourseyear()!=null)
//				dto.setCourseYearDto(new CourseYearDto(sse.getSemesterSubjectExam().getCourseyear(),true));
//				if(sse.getSemesterSubjectExam().getRegisterPeriod()!=null) {
//					dto.setRegisterPeriod(new SemesterRegisterPeriodDto(sse.getSemesterSubjectExam().getRegisterPeriod(),true));
//				}
				dto.setExamRound(sse.getSemesterSubjectExam().getExamRound());
				this.semesterSubjectExam=dto;
				if(sse.getSemesterSubjectExam().getSemester()!=null)
				this.semesterName=sse.getSemesterSubjectExam().getSemester().getSemesterName();
				if(sse.getSemesterSubjectExam().getSubject()!=null)
				this.subjectName=sse.getSemesterSubjectExam().getSubject().getSubjectName();
				if(sse.getSemesterSubjectExam().getCourseyear()!=null)
					this.courseYearName=sse.getSemesterSubjectExam().getCourseyear().getName();
				if(sse.getSemesterSubjectExam().getRegisterPeriod()!=null)
					this.registerPeriodName=sse.getSemesterSubjectExam().getRegisterPeriod().getName();
			}
			if (sse.getStartHour() != null){
				CourseHourDto start = new CourseHourDto();
				start.setId(sse.getStartHour().getId());
				start.setName(sse.getStartHour().getName());
				start.setIndexNumber(sse.getStartHour().getIndexNumber());
				this.startHour = start;
			}
			if (sse.getEndHour() != null){
				CourseHourDto endHour = new CourseHourDto();
				endHour.setId(sse.getEndHour().getId());
				endHour.setName(sse.getEndHour().getName());
				endHour.setIndexNumber(sse.getEndHour().getIndexNumber());
				this.endHour =endHour;
			}
			if (sse.getRoom() != null) {
				RoomDto r = new RoomDto();
				r.setId(sse.getRoom().getId());
				r.setCode(sse.getRoom().getCode());
				r.setName(sse.getRoom().getName());
				this.room=r;				
			}
			if(sse.getExamHour()!=null) {
				ExamHourDto eh=new ExamHourDto();
				eh.setId(sse.getExamHour().getId());
				eh.setStart(sse.getExamHour().getStart());
				eh.setEnd(sse.getExamHour().getEnd());
//				eh.setType(sse.getExamHour().getType());
				eh.setCode(sse.getExamHour().getCode());
				eh.setName(sse.getExamHour().getName());
				if(sse.getExamHour().getExamType()!=null) {
					ExamTypeDto typeDto=new ExamTypeDto();
					typeDto.setName(sse.getExamHour().getExamType().getName());
					typeDto.setCode(sse.getExamHour().getExamType().getCode());
					eh.setExamType(typeDto);
				}
				this.examHour=eh;
			}
			if(sse.getTrainingBase()!=null) {
				TrainingBaseDto trainDto=new TrainingBaseDto();
				trainDto.setId(sse.getTrainingBase().getId());
				trainDto.setCode(sse.getTrainingBase().getCode());
				trainDto.setName(sse.getTrainingBase().getName());
				this.trainingBase=trainDto;
			}
			if(sse.getExamSkill()!=null) {
				ExamSkillDto esDto=new ExamSkillDto();
				esDto.setId(sse.getExamSkill().getId());
				esDto.setCode(sse.getExamSkill().getCode());
				esDto.setName(sse.getExamSkill().getName());
				this.examSkill=esDto;
			}
//			if(sse.getNumberStudent()!=null)
//				this.numberStudent = sse.getNumberStudent();
//			else 
//				this.numberStudent = 0;
			if(sse.getNumberExpectedStudent()!=null) 
				this.numberExpectedStudent = sse.getNumberExpectedStudent();
			else
				this.numberExpectedStudent=0;
			this.roomCode = sse.getRoomCode();
			this.isAddedToTestBag = sse.getIsAddedToTestBag();
			this.isAddedFullToTestBag = sse.getIsAddedFullToTestBag();
			this.numberStudentAddToBag =0;
			this.numberStudent = 0;
			if (sse.getStudentList() != null && sse.getStudentList().size() > 0) {
				
				for (StudentSemesterSubjectExamRoom ssse : sse.getStudentList()) {
					if(ssse.getStatus()==0) this.numberStudent +=1;
					if(ssse.getTestBag()!=null) this.numberStudentAddToBag+=1;
				}
			}
			if (sse.getExamDate() != null) {
				this.examDate = sse.getExamDate();
			}
			if(this.getNumberStudent()<1) {
				this.setIsAbleToCreateBag(false);
				this.setIsAddedToTestBag(false);
				this.setIsAddedFullToTestBag(false);
			}
			else if(this.getNumberStudent()>0 && this.getNumberStudentAddToBag() < this.getNumberStudent()){
				this.setIsAbleToCreateBag(true);
				this.setIsAddedToTestBag(true);
				this.setIsAddedFullToTestBag(false);
			}
			else if(this.getNumberStudent()>0 && this.getNumberStudentAddToBag() >= this.getNumberStudent()) {
				this.setIsAbleToCreateBag(false);
				this.setIsAddedToTestBag(true);
				this.setIsAddedFullToTestBag(true);
			}			
		}
	}

}
