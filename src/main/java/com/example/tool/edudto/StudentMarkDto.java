package com.example.tool.edudto;

import java.io.Serializable;
import java.util.List;

import com.globits.education.domain.MarkType;
import com.globits.education.domain.SemesterSubject;
import com.globits.education.domain.SpecialPoint;
import com.globits.education.domain.Student;
import com.globits.education.domain.StudentCourseSubject;
import com.globits.education.domain.StudentMark;
import com.globits.education.domain.StudentSemesterSubjectExamRoom;
import com.globits.education.domain.Subject;
import com.globits.education.domain.SubjectExam;
import com.globits.education.dto.ExamStatusDto;
import com.globits.education.dto.MarkTypeDto;
import com.globits.education.dto.SemesterSubjectDto;
import com.globits.education.dto.SpecialPointDto;
import com.globits.education.dto.StudentCourseSubjectDto;
import com.globits.education.dto.StudentDto;
import com.globits.education.dto.StudentMarkHistoryDto;
import com.globits.education.dto.StudentSemesterSubjectExamRoomDto;
import com.globits.education.dto.SubjectDto;
import com.globits.education.dto.SubjectExamDto;
import com.globits.education.utils.NumberUtils;

public class StudentMarkDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long Id;

	private StudentDto student; // Sinh viên
	private Double originalMark;//Điểm thang 10 chưa qua xử lý(chưa trừ)
	private Double mark;
	private SubjectDto subject;
	private Boolean isLock;//Đã chốt 
	private StudentCourseSubjectDto studentCourseSubject;
	// private CourseSubjectDto courseSubject;

	private MarkTypeDto markType;// MarkType (0 = điểm chuyên cần, 1 = thường xuyên, 2 = điểm thi cuối kỳ lần 1,
	// điểm thi cuối kỳ lần 2, ...)
	private Integer examRound;// Lần thi cho loại điểm này (ví dụ : thi lần 1, thi lần 2, ...).
	private Double coeffiecient;

	private SubjectExamDto subjectExam;
	private Boolean isSelected;
	
	private String markingCode;// Số phách
	
	private Integer studyTime;
	
	private StudentSemesterSubjectExamRoomDto studentExamRoom;

	private SemesterSubjectDto semesterSubject;
	
	private Double oldMark;// Điểm trước khi cập nhật
	
	private Integer updateType;
	
	private SpecialPointDto specialPoint;
	
	private String displaySemester = "";
	
	private Integer markingCodeNumber;
	private Integer examCodeNumber;
	private Integer subjectStatus;//trạng thái học convert từ StudentCourseSubject.subjectStatus
	private String note;//ghi chú
	private Integer examStatus;//trạng thái thi(F, 0F, K, P..)
	private boolean isOld = false;
	private List<StudentMarkHistoryDto> historyModifi;
	
	
	
	public List<StudentMarkHistoryDto> getHistoryModifi() {
		return historyModifi;
	}

	public void setHistoryModifi(List<StudentMarkHistoryDto> historyModifi) {
		this.historyModifi = historyModifi;
	}

	public boolean isOld() {
		return isOld;
	}

	public void setOld(boolean isOld) {
		this.isOld = isOld;
	}

	public Integer getMarkingCodeNumber() {
		return markingCodeNumber;
	}

	public void setMarkingCodeNumber(Integer markingCodeNumber) {
		this.markingCodeNumber = markingCodeNumber;
	}

	public Integer getExamCodeNumber() {
		return examCodeNumber;
	}

	public void setExamCodeNumber(Integer examCodeNumber) {
		this.examCodeNumber = examCodeNumber;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Double getOldMark() {
		return oldMark;
	}

	public void setOldMark(Double oldMark) {
		this.oldMark = oldMark;
	}

	public String getDisplaySemester() {
		return displaySemester;
	}

	public void setDisplaySemester(String displaySemester) {
		this.displaySemester = displaySemester;
	}

	public Integer getUpdateType() {
		return updateType;
	}

	public void setUpdateType(Integer updateType) {
		this.updateType = updateType;
	}

	public SpecialPointDto getSpecialPoint() {
		return specialPoint;
	}

	public void setSpecialPoint(SpecialPointDto specialPoint) {
		this.specialPoint = specialPoint;
	}

	public StudentDto getStudent() {
		return student;
	}

	public void setStudent(StudentDto student) {
		this.student = student;
	}

	public Double getMark() {
		return NumberUtils.round(mark,1);
//		return mark;
	}

	public void setMark(Double mark) {
		this.mark = mark;
	}

	public SubjectDto getSubject() {
		return subject;
	}

	public void setSubject(SubjectDto subject) {
		this.subject = subject;
	}

	public MarkTypeDto getMarkType() {
		return markType;
	}

	public void setMarkType(MarkTypeDto markType) {
		this.markType = markType;
	}

	public Double getCoeffiecient() {
		return coeffiecient;
	}

	public void setCoeffiecient(Double coeffiecient) {
		this.coeffiecient = coeffiecient;
	}

	public Integer getExamRound() {
		return examRound;
	}

	public void setExamRound(Integer examRound) {
		this.examRound = examRound;
	}

	public SubjectExamDto getSubjectExam() {
		return subjectExam;
	}

	public void setSubjectExam(SubjectExamDto subjectExam) {
		this.subjectExam = subjectExam;
	}

	public StudentCourseSubjectDto getStudentCourseSubject() {
		return studentCourseSubject;
	}

	public void setStudentCourseSubject(StudentCourseSubjectDto studentCourseSubject) {
		this.studentCourseSubject = studentCourseSubject;
	}
	
	public Boolean getIsSelected() {
		return isSelected;
	}

	public void setIsSelected(Boolean isSelected) {
		this.isSelected = isSelected;
	}
	

	public String getMarkingCode() {
		return markingCode;
	}

	public void setMarkingCode(String markingCode) {
		this.markingCode = markingCode;
	}	

	public Integer getStudyTime() {
		return studyTime;
	}

	public void setStudyTime(Integer studyTime) {
		this.studyTime = studyTime;
	}

	public StudentSemesterSubjectExamRoomDto getStudentExamRoom() {
		return studentExamRoom;
	}

	public void setStudentExamRoom(StudentSemesterSubjectExamRoomDto studentExamRoom) {
		this.studentExamRoom = studentExamRoom;
	}

	public SemesterSubjectDto getSemesterSubject() {
		return semesterSubject;
	}

	public void setSemesterSubject(SemesterSubjectDto semesterSubject) {
		this.semesterSubject = semesterSubject;
	}

	public Boolean getIsLock() {
		return isLock;
	}

	public void setIsLock(Boolean isLock) {
		this.isLock = isLock;
	}

	public Double getOriginalMark() {
		return NumberUtils.round(originalMark,1);
//		return originalMark;
	}

	public void setOriginalMark(Double originalMark) {
		this.originalMark = originalMark;
	}
	
	public Integer getSubjectStatus() {
		return subjectStatus;
	}

	public void setSubjectStatus(Integer subjectStatus) {
		this.subjectStatus = subjectStatus;
	}
	

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}	

	public Integer getExamStatus() {
		return examStatus;
	}

	public void setExamStatus(Integer examStatus) {
		this.examStatus = examStatus;
	}

	public StudentMarkDto() {

	}

	public StudentMarkDto(StudentMark sr) {
		this.Id = sr.getId();
		this.coeffiecient = sr.getCoeffiecient();
		this.mark = sr.getMark();
		this.examRound = sr.getExamRound();
		this.originalMark=sr.getOriginalMark();
		this.oldMark = sr.getOldMark();
		this.updateType = sr.getUpdateType();
		this.note=sr.getNote();
		if(sr.getIsLock()!=null) {
			this.isLock=sr.getIsLock();
		}
		if (sr.getSubject() != null) {
//			this.subject = new SubjectDto(sr.getSubject());
			SubjectDto sub=new SubjectDto();
			sub.setId(sr.getSubject().getId());
			sub.setSubjectName(sr.getSubject().getSubjectName());
			sub.setSubjectCode(sr.getSubject().getSubjectCode());
			sub.setNumberOfCredit(sr.getSubject().getNumberOfCredit());
			sub.setSubjectNameEng(sr.getSubject().getSubjectNameEng());
			sub.setTotalSubjectName(sr.getSubject().getSubjectName()+ " - "+ sr.getSubject().getNumberOfCredit()+ " - "+sr.getSubject().getSubjectCode());
			this.subject=sub;
		}
		if (sr.getSubjectExam() != null) {
			this.subjectExam = new SubjectExamDto();
			this.subjectExam.setCode(sr.getSubjectExam().getCode());
			this.subjectExam.setName(sr.getSubjectExam().getName());
			this.subjectExam.setId(sr.getSubjectExam().getId());
			this.subjectExam.setInputMarkType(sr.getSubjectExam().getInputMarkType());
		}
		if (sr.getMarkType() != null) {
			this.markType = new MarkTypeDto(sr.getMarkType());
		}
		if (sr.getStudent() != null) {
//			this.student = new StudentDto(sr.getStudent());
			this.student = new StudentDto();
			this.student.setId(sr.getStudent().getId());
			this.student.setFirstName(sr.getStudent().getFirstName()); 
			this.student.setLastName(sr.getStudent().getLastName());
			this.student.setDisplayName(sr.getStudent().getDisplayName());
			this.student.setStudentCode(sr.getStudent().getStudentCode());
			if(sr.getStudent().getEnrollmentClass()!=null) {
				this.student.setClassName(sr.getStudent().getEnrollmentClass().getClassName());
				this.student.setClassCode(sr.getStudent().getEnrollmentClass().getClassCode());
			}
		}
		if(sr.getSemesterSubject()!=null) {
			this.semesterSubject = new SemesterSubjectDto();
			this.semesterSubject.setId(sr.getSemesterSubject().getId());
			if(sr.getSemesterSubject().getSemester() != null) {
				this.displaySemester += sr.getSemesterSubject().getSemester().getSemesterName() + " ";
			}
			if(sr.getSemesterSubject().getRegisterPeriod() != null) {
				this.displaySemester += sr.getSemesterSubject().getRegisterPeriod().getName();
			}
		}
		if(sr.getStudentExamRoom()!=null) {
			this.studentExamRoom = new StudentSemesterSubjectExamRoomDto();
			this.studentExamRoom.setId(sr.getStudentExamRoom().getId());
			this.studentExamRoom.setStatus(sr.getStudentExamRoom().getStatus());
			if(sr.getStudentExamRoom().getStudentCourseSubject()!=null) {
				this.studyTime = sr.getStudentExamRoom().getStudentCourseSubject().getStudyTime();	
			}
			this.studentExamRoom.setExamCode(sr.getStudentExamRoom().getExamCode());
			if(sr.getStudentExamRoom().getExamStatus()!=null) {
				this.studentExamRoom.setExamStatus(new ExamStatusDto(sr.getStudentExamRoom().getExamStatus()));
			}
			try {
				if(sr.getStudentExamRoom().getExamCode()!=null)
				this.setExamCodeNumber(Integer.valueOf(sr.getStudentExamRoom().getExamCode()));
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		if(sr.getSpecialPoint() != null) {
			this.specialPoint = new SpecialPointDto();
			this.specialPoint.setId(sr.getSpecialPoint().getId());
			this.specialPoint.setName(sr.getSpecialPoint().getName());
			this.specialPoint.setCode(sr.getSpecialPoint().getCode());
			this.specialPoint.setNote(sr.getSpecialPoint().getNote());
		}
		if(sr.getStudentCourseSubject()!=null) {
			this.studentCourseSubject=new StudentCourseSubjectDto();
			this.studentCourseSubject.setId(sr.getStudentCourseSubject().getId());
			this.subjectStatus=sr.getStudentCourseSubject().getSubjectStatus();
			
		}
		
	}
	public StudentMarkDto(Long id, double coeffiecient, double mark, Integer examRound,Subject su,
			SubjectExam se,MarkType type,Student student,SemesterSubject sem,StudentSemesterSubjectExamRoom ssser) {
		this.Id = id;
		this.coeffiecient = coeffiecient;
		this.mark = mark;
		this.examRound = examRound;
		if (su != null) {
//			this.subject = new SubjectDto(sr.getSubject());
			SubjectDto sub=new SubjectDto();
			sub.setId(su.getId());
			sub.setSubjectName(su.getSubjectName());
			sub.setSubjectCode(su.getSubjectCode());
			sub.setNumberOfCredit(su.getNumberOfCredit());
			sub.setSubjectNameEng(su.getSubjectNameEng());
			sub.setTotalSubjectName(su.getSubjectName()+ " - "+ su.getNumberOfCredit()+ " - "+su.getSubjectCode());
			this.subject=sub;
		}
		if (se != null) {
			this.subjectExam = new SubjectExamDto();
			this.subjectExam.setCode(se.getCode());
			this.subjectExam.setName(se.getName());
			this.subjectExam.setId(se.getId());
			this.subjectExam.setInputMarkType(se.getInputMarkType());
		}
		if (type != null) {
			this.markType = new MarkTypeDto(type);
		}
		if (student != null) {
			this.student = new StudentDto();
			this.student.setId(student.getId());
			this.student.setFirstName(student.getFirstName()); 
			this.student.setLastName(student.getLastName());
			this.student.setDisplayName(student.getDisplayName());
			this.student.setStudentCode(student.getStudentCode());
			if(student.getEnrollmentClass()!=null)
			this.student.setClassName(student.getEnrollmentClass().getClassName());
		}
		if(sem!=null) {
			this.semesterSubject = new SemesterSubjectDto();
			this.semesterSubject.setId(sem.getId());
		}
		if(ssser!=null) {
			this.studentExamRoom = new StudentSemesterSubjectExamRoomDto();
			this.studentExamRoom.setId(ssser.getId());
			this.studentExamRoom.setStatus(ssser.getStatus());
			if(ssser.getStudentCourseSubject()!=null) {
				this.studyTime = ssser.getStudentCourseSubject().getStudyTime();	
			}
			this.studentExamRoom.setExamCode(ssser.getExamCode());
		}
	}
	
	public StudentMarkDto(Long id, double coeffiecient, Double mark, Integer examRound,Subject su,
			SubjectExam se,MarkType type,Student student,SemesterSubject sem,StudentSemesterSubjectExamRoom ssser) {
		this.Id = id;
		this.coeffiecient = coeffiecient;
		this.mark = mark;
		this.examRound = examRound;
		if (su != null) {
//			this.subject = new SubjectDto(sr.getSubject());
			SubjectDto sub=new SubjectDto();
			sub.setId(su.getId());
			sub.setSubjectName(su.getSubjectName());
			sub.setSubjectCode(su.getSubjectCode());
			sub.setNumberOfCredit(su.getNumberOfCredit());
			sub.setSubjectNameEng(su.getSubjectNameEng());
			sub.setTotalSubjectName(su.getSubjectName()+ " - "+ su.getNumberOfCredit()+ " - "+su.getSubjectCode());
			this.subject=sub;
		}
		if (se != null) {
			this.subjectExam = new SubjectExamDto();
			this.subjectExam.setCode(se.getCode());
			this.subjectExam.setName(se.getName());
			this.subjectExam.setId(se.getId());
			this.subjectExam.setInputMarkType(se.getInputMarkType());
		}
		if (type != null) {
			this.markType = new MarkTypeDto(type);
		}
		if (student != null) {
			this.student = new StudentDto();
			this.student.setId(student.getId());
			this.student.setFirstName(student.getFirstName()); 
			this.student.setLastName(student.getLastName());
			this.student.setDisplayName(student.getDisplayName());
			this.student.setStudentCode(student.getStudentCode());
			if(student.getEnrollmentClass()!=null)
			this.student.setClassName(student.getEnrollmentClass().getClassName());
		}
		if(sem!=null) {
			this.semesterSubject = new SemesterSubjectDto();
			this.semesterSubject.setId(sem.getId());
		}
		if(ssser!=null) {
			this.studentExamRoom = new StudentSemesterSubjectExamRoomDto();
			this.studentExamRoom.setId(ssser.getId());
			this.studentExamRoom.setStatus(ssser.getStatus());
			if(ssser.getStudentCourseSubject()!=null) {
				this.studyTime = ssser.getStudentCourseSubject().getStudyTime();	
			}
			this.studentExamRoom.setExamCode(ssser.getExamCode());
		}
	}
	public StudentMarkDto(Long id, double coeffiecient, Double mark, Integer examRound,Subject su,
			SubjectExam se,MarkType type,Student student,SemesterSubject sem,StudentSemesterSubjectExamRoom ssser,StudentCourseSubject scs) {
		this.Id = id;
		this.coeffiecient = coeffiecient;
		this.mark = mark;
		this.examRound = examRound;
		if (su != null) {
//			this.subject = new SubjectDto(sr.getSubject());
			SubjectDto sub=new SubjectDto();
			sub.setId(su.getId());
			sub.setSubjectName(su.getSubjectName());
			sub.setSubjectCode(su.getSubjectCode());
			sub.setNumberOfCredit(su.getNumberOfCredit());
			sub.setSubjectNameEng(su.getSubjectNameEng());
			sub.setTotalSubjectName(su.getSubjectName()+ " - "+ su.getNumberOfCredit()+ " - "+su.getSubjectCode());
			this.subject=sub;
		}
		if (se != null) {
			this.subjectExam = new SubjectExamDto();
			this.subjectExam.setCode(se.getCode());
			this.subjectExam.setName(se.getName());
			this.subjectExam.setId(se.getId());
			this.subjectExam.setInputMarkType(se.getInputMarkType());
		}
		if (type != null) {
			this.markType = new MarkTypeDto(type);
		}
		if (student != null) {
			this.student = new StudentDto();
			this.student.setId(student.getId());
			this.student.setFirstName(student.getFirstName()); 
			this.student.setLastName(student.getLastName());
			this.student.setDisplayName(student.getDisplayName());
			this.student.setStudentCode(student.getStudentCode());
			if(student.getEnrollmentClass()!=null)
			this.student.setClassName(student.getEnrollmentClass().getClassName());
		}
		if(sem!=null) {
			this.semesterSubject = new SemesterSubjectDto();
			this.semesterSubject.setId(sem.getId());
		}
		if(ssser!=null) {
			this.studentExamRoom = new StudentSemesterSubjectExamRoomDto();
			this.studentExamRoom.setId(ssser.getId());
			this.studentExamRoom.setStatus(ssser.getStatus());
			if(ssser.getStudentCourseSubject()!=null) {
				this.studyTime = ssser.getStudentCourseSubject().getStudyTime();	
			}
			this.studentExamRoom.setExamCode(ssser.getExamCode());
		}
		if(scs!=null) {
			this.studentCourseSubject = new StudentCourseSubjectDto();
			this.studentCourseSubject.setId(scs.getId());			
		}
	}
	
	public StudentMarkDto(StudentMark sr, Boolean collapse) {
		this.Id = sr.getId();
		this.coeffiecient = sr.getCoeffiecient();
		this.mark = sr.getMark();
		this.originalMark=sr.getOriginalMark();
		this.examRound = sr.getExamRound();
		this.note=sr.getNote();
		if(sr.getIsLock()!=null) {
			this.isLock=sr.getIsLock();
		}
		if (sr.getSubject() != null) {
//			this.subject = new SubjectDto(sr.getSubject());
			SubjectDto sub=new SubjectDto();
			sub.setId(sr.getSubject().getId());
			sub.setSubjectName(sr.getSubject().getSubjectName());
			sub.setSubjectCode(sr.getSubject().getSubjectCode());
			sub.setNumberOfCredit(sr.getSubject().getNumberOfCredit());
			sub.setSubjectNameEng(sr.getSubject().getSubjectNameEng());
			sub.setTotalSubjectName(sr.getSubject().getSubjectName()+ " - "+ sr.getSubject().getNumberOfCredit()+ " - "+sr.getSubject().getSubjectCode());
			this.subject=sub;
		}
		if (sr.getSubjectExam() != null) {
			this.subjectExam = new SubjectExamDto();
			this.subjectExam.setCode(sr.getSubjectExam().getCode());
			this.subjectExam.setName(sr.getSubjectExam().getName());
			this.subjectExam.setId(sr.getSubjectExam().getId());
			this.subjectExam.setInputMarkType(sr.getSubjectExam().getInputMarkType());
		}
		if (sr.getMarkType() != null) {
			this.markType = new MarkTypeDto(sr.getMarkType());
		}
		if (sr.getStudent() != null) {
//			this.student = new StudentDto(sr.getStudent());
			this.student = new StudentDto();
			this.student.setId(sr.getStudent().getId());
			this.student.setFirstName(sr.getStudent().getFirstName()); 
			this.student.setLastName(sr.getStudent().getLastName());
			this.student.setDisplayName(sr.getStudent().getDisplayName());
			this.student.setStudentCode(sr.getStudent().getStudentCode());
			if(sr.getStudent().getEnrollmentClass()!=null) {
				this.student.setClassName(sr.getStudent().getEnrollmentClass().getClassName());
				this.student.setClassCode(sr.getStudent().getEnrollmentClass().getClassCode());
			}
				
		}
		if(sr.getStudentExamRoom()!=null) {
			this.studentExamRoom=new StudentSemesterSubjectExamRoomDto(sr.getStudentExamRoom(),true);
			if(sr.getStudentExamRoom().getStudentCourseSubject()!=null) {
				this.studyTime = sr.getStudentExamRoom().getStudentCourseSubject().getStudyTime();	
				this.subjectStatus=sr.getStudentExamRoom().getStudentCourseSubject().getSubjectStatus();
			}
			this.markingCodeNumber = this.studentExamRoom.getMarkingCodeNumber();
			this.examCodeNumber = this.studentExamRoom.getExamCodeNumber();
			this.studentExamRoom.setExamCode(sr.getStudentExamRoom().getExamCode());
		}
		if(sr.getSpecialPoint() != null) {
			this.specialPoint = new SpecialPointDto();
			this.specialPoint.setId(sr.getSpecialPoint().getId());
			this.specialPoint.setName(sr.getSpecialPoint().getName());
			this.specialPoint.setCode(sr.getSpecialPoint().getCode());
			this.specialPoint.setNote(sr.getSpecialPoint().getNote());
		}
	}
	public StudentMarkDto(StudentMark sm, StudentSemesterSubjectExamRoom se,SubjectExam sem,Long subjectExamId) {
		if(sm!=null) {
			this.coeffiecient = sm.getCoeffiecient();
			this.examRound = sm.getExamRound();
			this.Id = sm.getId();
			this.mark = sm.getMark();
			this.markType = new MarkTypeDto(sm.getMarkType());
		}
		this.note=sm.getNote();
		this.studyTime=1;//Mặc định = 1
		if(se!=null) {
			this.studentExamRoom = new StudentSemesterSubjectExamRoomDto();
			this.studentExamRoom.setId(se.getId());
			if(se.getStudent()!=null) {
				this.student = new StudentDto(se.getStudent(),true);
			}
			if(se.getStudentCourseSubject()!=null) {
				if(se.getStudentCourseSubject().getStudyTime()!=null) {
					this.studyTime = se.getStudentCourseSubject().getStudyTime();//Nếu có dữ liệu về lần học thì cập nhật
				}
				this.subjectStatus=se.getStudentCourseSubject().getSubjectStatus();
			}
			if(sm==null) {
				this.examRound = se.getExamRoom().getSemesterSubjectExam().getExamRound();
			}
		}
		if(sem!=null) {
			this.subjectExam = new SubjectExamDto(sem);
			if(sm==null) {
				this.coeffiecient = sem.getCoefficient();
			}
		}
		else {
			this.subjectExam = new SubjectExamDto();
			this.subjectExam.setId(subjectExamId);
		}
	}
}
