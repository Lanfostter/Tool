package com.example.tool.edudto;

import java.io.Serializable;

import javax.persistence.criteria.CriteriaBuilder.In;

import com.globits.core.dto.RoomDto;
import com.globits.core.dto.TrainingBaseDto;
import com.globits.education.domain.ExamStatus;
import com.globits.education.domain.SemesterSubjectExamRoom;
import com.globits.education.domain.SpecialPoint;
import com.globits.education.domain.StudentSemesterSubjectExamRoom;
import com.globits.education.domain.TestBag;
import com.globits.education.dto.CourseHourDto;
import com.globits.education.dto.ExamHourDto;
import com.globits.education.dto.ExamSkillDto;
import com.globits.education.dto.ExamStatusDto;
import com.globits.education.dto.ExamTypeDto;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.SemesterSubjectExamDto;
import com.globits.education.dto.SemesterSubjectExamRoomDto;
import com.globits.education.dto.SpecialPointDto;
import com.globits.education.dto.StudentCourseSubjectDto;
import com.globits.education.dto.StudentDto;
import com.globits.education.dto.SubjectDto;
import com.globits.education.dto.TestBagDto;

public class StudentSemesterSubjectExamRoomDto implements Serializable {
	private Long id;
	private int status;
	private String examCode;// Số báo danh
	private Integer examCodeNumber;// Số báo danh qui đổi ra số
	private String markingCode;// Số phách
	private Integer markingCodeNumber;// Số phách đổi ra số
	private StudentCourseSubjectDto studentCourseSubject;// Đăng ký cho lần học nào. Một sinh viên phải học ít nhất 1
	private String examPeriodCode;//Mã đợt thi													// lần mới được thi.

	private SemesterSubjectExamRoomDto examRoom;
	private TestBagDto testBag;

	private StudentDto student;// Dư thừa dữ liệu nhưng cần để sử dụng trong trường hợp 1 số môn học không cần
								// học mà cũng được thi.
	private Boolean isExempt;//sinh viên không học nhưng được thi và nhập điểm luôn, lấy hệ số là 1.
	private String className;
	private String classCode;
	private SpecialPointDto specialPoint;
	
	private Integer examRound;
	private Integer subjectCredit;
	private String subjectName;
	private String studentCode;
	private Integer studyTime;
	
	private Long studentExamId;
	private ExamStatusDto examStatus;
	private Long courseSubjectId;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public String getExamCode() {
		return examCode;
	}

	public void setExamCode(String examCode) {
		this.examCode = examCode;
	}

	public void setExamCodeNumber(Integer examCodeNumber) {
		this.examCodeNumber = examCodeNumber;
	}

	public void setMarkingCodeNumber(Integer markingCodeNumber) {
		this.markingCodeNumber = markingCodeNumber;
	}

	public String getMarkingCode() {
		return markingCode;
	}

	public void setMarkingCode(String markingCode) {
		this.markingCode = markingCode;
	}

	public Long getStudentExamId() {
		return studentExamId;
	}

	public void setStudentExamId(Long studentExamId) {
		this.studentExamId = studentExamId;
	}

	public Integer getExamCodeNumber() {
		try {
			examCodeNumber = Integer.parseInt(this.examCode);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return examCodeNumber;
	}

	public Integer getMarkingCodeNumber() {
		try {
			markingCodeNumber = Integer.parseInt(this.markingCode);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return markingCodeNumber;
	}

	public StudentCourseSubjectDto getStudentCourseSubject() {
		return studentCourseSubject;
	}

	public void setStudentCourseSubject(StudentCourseSubjectDto studentCourseSubject) {
		this.studentCourseSubject = studentCourseSubject;
	}

	public String getExamPeriodCode() {
		return examPeriodCode;
	}

	public void setExamPeriodCode(String examPeriodCode) {
		this.examPeriodCode = examPeriodCode;
	}

	public SemesterSubjectExamRoomDto getExamRoom() {
		return examRoom;
	}

	public void setExamRoom(SemesterSubjectExamRoomDto examRoom) {
		this.examRoom = examRoom;
	}

	public StudentDto getStudent() {
		return student;
	}

	public void setStudent(StudentDto student) {
		this.student = student;
	}
	

	public Boolean getIsExempt() {
		return isExempt;
	}

	public void setIsExempt(Boolean isExempt) {
		this.isExempt = isExempt;
	}
	

	public TestBagDto getTestBag() {
		return testBag;
	}

	public void setTestBag(TestBagDto testBag) {
		this.testBag = testBag;
	}
	

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	

	public SpecialPointDto getSpecialPoint() {
		return specialPoint;
	}

	public void setSpecialPoint(SpecialPointDto specialPoint) {
		this.specialPoint = specialPoint;
	}

	public Integer getExamRound() {
		return examRound;
	}

	public void setExamRound(Integer examRound) {
		this.examRound = examRound;
	}

	public Integer getSubjectCredit() {
		return subjectCredit;
	}

	public void setSubjectCredit(Integer subjectCredit) {
		this.subjectCredit = subjectCredit;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public Integer getStudyTime() {
		return studyTime;
	}

	public void setStudyTime(Integer studyTime) {
		this.studyTime = studyTime;
	}

	public ExamStatusDto getExamStatus() {
		return examStatus;
	}

	public void setExamStatus(ExamStatusDto examStatus) {
		this.examStatus = examStatus;
	}

	public Long getCourseSubjectId() {
		return courseSubjectId;
	}

	public void setCourseSubjectId(Long courseSubjectId) {
		this.courseSubjectId = courseSubjectId;
	}

	public StudentSemesterSubjectExamRoomDto() {

	}

	public StudentSemesterSubjectExamRoomDto(StudentSemesterSubjectExamRoom d) {
		this.examCode = d.getExamCode();
		this.id = d.getId();
		this.status = d.getStatus();
		this.markingCode = d.getMarkingCode();
		if(d.getStudent()!=null) {
			this.studentCode = d.getStudent().getStudentCode();
			this.student = new StudentDto(d.getStudent());// Cần thay thế đoạn code này bằng đoạn get set
		}		
//		this.examRoom = new SemesterSubjectExamRoomDto(d.getExamRoom());// Cần thay thế đoạn code này bằng đoạn get set
		//Thay thế đoạn code this.examRoom = new SemesterSubjectExamRoomDto(d.getExamRoom()) bằng đoạn get set ở dưới
		//DANGNH 30/05/2020 12h51
		if(d.getExamRoom()!=null) {
			SemesterSubjectExamRoom sse = d.getExamRoom();
			
			this.examRoom = new SemesterSubjectExamRoomDto();	
			//this.id = sse.getId();
			this.examRoom.setId(sse.getId());
			this.examRoom.setDuration(sse.getDuration());
			this.examRoom.setViewOrder(sse.getViewOrder());
			
			if(sse.getSemesterSubjectExam()!=null) {
				SemesterSubjectExamDto dto=new SemesterSubjectExamDto();
				dto.setId(sse.getSemesterSubjectExam().getId());
				dto.setSemester(new SemesterDto(sse.getSemesterSubjectExam().getSemester()));
				dto.setSubject(new SubjectDto(sse.getSemesterSubjectExam().getSubject()));
				dto.setExamRound(sse.getSemesterSubjectExam().getExamRound());
				this.examRoom.setSemesterSubjectExam(dto);
				if(sse.getSemesterSubjectExam().getSemester()!=null)
					this.examRoom.setSemesterName(sse.getSemesterSubjectExam().getSemester().getSemesterName());
				if(sse.getSemesterSubjectExam().getSubject()!=null)
				this.subjectName=sse.getSemesterSubjectExam().getSubject().getSubjectName();
				if(sse.getSemesterSubjectExam().getCourseyear()!=null)
					this.examRoom.setCourseYearName(sse.getSemesterSubjectExam().getCourseyear().getName());
				if(sse.getSemesterSubjectExam().getRegisterPeriod()!=null)
					this.examRoom.setRegisterPeriodName(sse.getSemesterSubjectExam().getRegisterPeriod().getName());
			}
			if (sse.getStartHour() != null){
				CourseHourDto start = new CourseHourDto();
				start.setId(sse.getStartHour().getId());
				start.setName(sse.getStartHour().getName());
				start.setIndexNumber(sse.getStartHour().getIndexNumber());
				this.examRoom.setStartHour(start);
			}
			if (sse.getEndHour() != null){
				CourseHourDto endHour = new CourseHourDto();
				endHour.setId(sse.getEndHour().getId());
				endHour.setName(sse.getEndHour().getName());
				endHour.setIndexNumber(sse.getEndHour().getIndexNumber());
				this.examRoom.setEndHour(endHour);
			}
			if (sse.getRoom() != null) {
				RoomDto r = new RoomDto();
				r.setId(sse.getRoom().getId());
				r.setCode(sse.getRoom().getCode());
				r.setName(sse.getRoom().getName());
				this.examRoom.setRoom(r);				
			}
			if(sse.getExamHour()!=null) {
				ExamHourDto eh=new ExamHourDto();
				eh.setId(sse.getExamHour().getId());
				eh.setStart(sse.getExamHour().getStart());
				eh.setEnd(sse.getExamHour().getEnd());
				eh.setCode(sse.getExamHour().getCode());
				eh.setName(sse.getExamHour().getName());
				if(sse.getExamHour().getExamType()!=null) {
					ExamTypeDto typeDto=new ExamTypeDto();
					typeDto.setName(sse.getExamHour().getExamType().getName());
					typeDto.setCode(sse.getExamHour().getExamType().getCode());
					eh.setExamType(typeDto);
				}
				this.examRoom.setExamHour(eh);
			}
			if(sse.getTrainingBase()!=null) {
				TrainingBaseDto trainDto=new TrainingBaseDto();
				trainDto.setId(sse.getTrainingBase().getId());
				trainDto.setCode(sse.getTrainingBase().getCode());
				trainDto.setName(sse.getTrainingBase().getName());
				this.examRoom.setTrainingBase(trainDto);
			}
			if(sse.getExamSkill()!=null) {
				ExamSkillDto esDto=new ExamSkillDto();
				esDto.setId(sse.getExamSkill().getId());
				esDto.setCode(sse.getExamSkill().getCode());
				esDto.setName(sse.getExamSkill().getName());
				this.examRoom.setExamSkill(esDto);
			}
			if(sse.getNumberExpectedStudent()!=null) 
				this.examRoom.setNumberExpectedStudent(sse.getNumberExpectedStudent());
			else
				this.examRoom.setNumberExpectedStudent(0);
			
			this.examRoom.setRoomCode(sse.getRoomCode());
			
			this.examRoom.setIsAddedToTestBag(sse.getIsAddedToTestBag());
			this.examRoom.setIsAddedFullToTestBag(sse.getIsAddedFullToTestBag());
			this.examRoom.setNumberStudentAddToBag(0);
			this.examRoom.setNumberStudent(0);
			if (sse.getExamDate() != null) {
				this.examRoom.setExamDate(sse.getExamDate());
			}
			if(this.examRoom.getNumberStudent()<1) {
				this.examRoom.setIsAbleToCreateBag(false);
				this.examRoom.setIsAddedToTestBag(false);
				this.examRoom.setIsAddedFullToTestBag(false);
			}
			else if(this.examRoom.getNumberStudent()>0 && this.examRoom.getNumberStudentAddToBag() < this.examRoom.getNumberStudent()){
				this.examRoom.setIsAbleToCreateBag(true);
				this.examRoom.setIsAddedToTestBag(true);
				this.examRoom.setIsAddedFullToTestBag(false);
			}
			else if(this.examRoom.getNumberStudent()>0 && this.examRoom.getNumberStudentAddToBag() >= this.examRoom.getNumberStudent()) {
				this.examRoom.setIsAbleToCreateBag(false);
				this.examRoom.setIsAddedToTestBag(true);
				this.examRoom.setIsAddedFullToTestBag(true);
			}	
		}
		
		
		this.studentCourseSubject = new StudentCourseSubjectDto(d.getStudentCourseSubject());// Cần thay thế đoạn code này bằng đoạn get set
		if(d.getStudentCourseSubject()!=null && d.getStudentCourseSubject().getCourseSubject()!=null && d.getStudentCourseSubject().getCourseSubject().getId()!=null) {
			this.courseSubjectId=d.getStudentCourseSubject().getCourseSubject().getId();
		}
		if(d.getExamRoom()!=null && d.getExamRoom().getSemesterSubjectExam()!=null && d.getExamRoom().getSemesterSubjectExam().getExamRegisterPeriod()!=null) {
			this.examPeriodCode=d.getExamRoom().getSemesterSubjectExam().getExamRegisterPeriod().getName();
		}
		
		if(d.getStudentCourseSubject()!=null && d.getStudentCourseSubject().getStudyTime()!=null) {			
			this.studyTime = d.getStudentCourseSubject().getStudyTime();		
		}
		else {
			this.studyTime =1;
		}
		if(d.getIsExempt()!=null) {
			this.isExempt=d.getIsExempt();
		}
		if(d.getSpecialPoint()!=null) {
			this.specialPoint=new SpecialPointDto(d.getSpecialPoint());
		}
		if(d.getExamStatus()!=null) {
			this.examStatus=new ExamStatusDto(d.getExamStatus());
		}
		if(d.getExamRoom()!=null && d.getExamRoom().getSemesterSubjectExam()!=null && d.getExamRoom().getSemesterSubjectExam().getExamRound()!=null) {
			this.examRound=d.getExamRoom().getSemesterSubjectExam().getExamRound(); 
		}
	}
	public StudentSemesterSubjectExamRoomDto(StudentSemesterSubjectExamRoom d, Boolean collapse) {
		this.examCode = d.getExamCode();
		this.id = d.getId();
		this.status = d.getStatus();
		this.markingCode = d.getMarkingCode();
		if(d.getStudent()!=null) {
			this.student = new StudentDto();
			this.student.setId(d.getStudent().getId());
			this.student.setFirstName(d.getStudent().getFirstName()); 
			this.student.setLastName(d.getStudent().getLastName());
			this.student.setDisplayName(d.getStudent().getDisplayName());
			this.student.setStudentCode(d.getStudent().getStudentCode());
			this.studentCode = d.getStudent().getStudentCode();
			if(d.getStudent().getEnrollmentClass()!=null) {
//				this.className = d.getStudent().getEnrollmentClass().getClassName();
				this.className = d.getStudent().getEnrollmentClass().getClassCode();
				this.student.setClassName(d.getStudent().getEnrollmentClass().getClassName());
				this.student.setClassCode(d.getStudent().getEnrollmentClass().getClassCode());
			}
		}
		if(d.getStudentCourseSubject()!=null ) {	
			if(d.getStudentCourseSubject().getStudyTime()!=null) {
				this.studyTime = d.getStudentCourseSubject().getStudyTime();					
			}
			if(d.getStudentCourseSubject().getCourseSubject()!=null) {
				this.setCourseSubjectId(d.getStudentCourseSubject().getCourseSubject().getId());
			}
			
		}
		else {
			this.studyTime =1;
		}
//		this.student = new StudentDto(d.getStudent(),0);// Cần thay thế đoạn code này bằng đoạn get set
//		this.examRoom = new SemesterSubjectExamRoomDto(d.getExamRoom());// Cần thay thế đoạn code này bằng đoạn get set
		if(d.getExamRoom()!=null) {
			this.examRoom = new SemesterSubjectExamRoomDto();
			this.examRoom.setId(d.getExamRoom().getId());
			this.examRoom.setRoomCode(d.getExamRoom().getRoomCode());
			this.examRoom.setNumberStudent(d.getExamRoom().getNumberStudent());
			if(d.getExamRoom().getSemesterSubjectExam()!= null) {
				if(d.getExamRoom().getSemesterSubjectExam().getSubject() != null) {
					this.subjectName = d.getExamRoom().getSemesterSubjectExam().getSubject().getSubjectName();
					this.subjectCredit = d.getExamRoom().getSemesterSubjectExam().getSubject().getNumberOfCredit();
				}
				this.examRound = d.getExamRoom().getSemesterSubjectExam().getExamRound();
			}
			if(d.getExamRoom().getExamSkill()!=null) {
				this.examRoom.setExamSkill(new ExamSkillDto(d.getExamRoom().getExamSkill()));
			}
			if(d.getExamRoom().getExamHour()!=null) {
				this.examRoom.setExamHour(new ExamHourDto(d.getExamRoom().getExamHour()));
			}
		}
		if(d.getTestBag()!=null) {
			this.testBag=new TestBagDto();
			this.testBag.setId(d.getTestBag().getId());
			this.testBag.setName(d.getTestBag().getName());
			this.testBag.setCode(d.getTestBag().getCode());
			this.testBag.setNumberStudent(d.getTestBag().getNumberStudent());
		}
//		this.studentCourseSubject = new StudentCourseSubjectDto(d.getStudentCourseSubject());// Cần thay thế đoạn code
																								// này bằng đoạn get set
		if(d.getIsExempt()!=null) {
			this.isExempt=d.getIsExempt();
		}
		if(d.getSpecialPoint()!=null) {
			this.specialPoint=new SpecialPointDto(d.getSpecialPoint());
		}
		if(d.getExamStatus()!=null) {
			this.examStatus=new ExamStatusDto(d.getExamStatus());
		}
	}
	public StudentSemesterSubjectExamRoomDto(Long id,String examCode,String markingCode ) {
		this.id=id;
		this.examCode=examCode;
		this.markingCode=markingCode;
	}
	public StudentSemesterSubjectExamRoomDto(StudentCourseSubjectDto scsDto,StudentDto studentDto,Boolean isExempt) {
//		this.examCode = d.getExamCode();
//		this.id = d.getId();
//		this.status = d.getStatus();
//		this.markingCode = d.getMarkingCode();
		this.student = studentDto;// Cần thay thế đoạn code này bằng đoạn get set
//		this.examRoom = new SemesterSubjectExamRoomDto(d.getExamRoom());// Cần thay thế đoạn code này bằng đoạn get set
		this.studentCourseSubject = scsDto;// Cần thay thế đoạn code này bằng đoạn get set
		if( scsDto.getStudyTime()!=null) {			
			this.studyTime =scsDto.getStudyTime();		
		}
		else {
			this.studyTime =1;
		}
		if(isExempt!=null) {
			this.isExempt=isExempt;
		}
		
	}

}
