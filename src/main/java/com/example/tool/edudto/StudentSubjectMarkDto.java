package com.example.tool.edudto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

import javax.persistence.Column;

import com.globits.core.dto.DepartmentDto;
import com.globits.education.domain.CourseSubject;
import com.globits.education.domain.Semester;
import com.globits.education.domain.StudentMark;
import com.globits.education.domain.StudentSubjectMark;
import com.globits.education.domain.Subject;
import com.globits.education.dto.ExamStatusDto;
import com.globits.education.dto.MarkTypeDto;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.SpecialPointDto;
import com.globits.education.dto.StudentCourseSubjectDto;
import com.globits.education.dto.StudentDto;
import com.globits.education.dto.StudentMarkDto;
import com.globits.education.dto.StudentSemesterSubjectExamRoomDto;
import com.globits.education.dto.SubjectDto;
import com.globits.education.dto.SubjectExamDto;
import com.globits.education.utils.MarkUtil;
import com.globits.education.utils.NumberUtils;



public class StudentSubjectMarkDto implements Serializable {
	private Long id;
	private StudentDto student;

	private SubjectDto subject;
	private SemesterDto semester;
	
	private Long studentId;
	private Long subjectId;
	private Long semesterId;
	
	private Double mark;//Điểm thang 10
	private Integer examRound;
	private Integer studyTime;//Lần học thứ mấy của sinh viên
	private List<StudentMarkDto> details;
	private Integer status;
	private Double mark4;//Điểm thang 4
	private String charMark;//điểm chữ
	private Boolean isAccepted;
	private String note;//ghi chú
	private Boolean isCounted;//Là môn tính điểm
	
	private Integer result;
	
	private Long equivalentSubjectId;
	
	private String equivalentSubjectCode;
	private String equivalentSubjectName;
	
	private Boolean isInProgram;
	
	/* Trạng thái sinh viên ở phòng thi
	 * 0.Có thi
	 * -1. Bỏ thi
	 * 1. Miễn thi
	 * -2. Đình chỉ thi
	 */	
	private int examStatus;//trạng thái cấm thi
	private String  examStatusCode;//trạng thái cấm thi
	
	private Boolean isPublished;// Được công bố hay chưa
	
	private boolean saveStatus;//trạng thái lưu
	private Double markQT;
	private Double markTHI;
	private Boolean isMarkEquivalent;//Điểm công nhận tương đương;
	private Boolean isConditionalMark;//Là điểm điều kiện (ví dụ điểm của kỳ thi trung học phổ thông quốc gia,...)
	
	public StudentSubjectMarkDto() {
		
	}
		
	public StudentSubjectMarkDto(Long id, Long studentId, Long subjectId, Long semesterId, Double mark,
			Integer examRound, Integer studyTime, Integer status, Double mark4, String charMark, Boolean isAccepted,
			String note, Boolean isCounted, Integer result, Long equivalentSubjectId, String equivalentSubjectCode,
			String equivalentSubjectName, Boolean isInProgram, int examStatus, String examStatusCode,
			Boolean isPublished, boolean saveStatus, Double markQT, Double markTHI, Boolean isMarkEquivalent,
			Boolean isConditionalMark) {
		super();
		this.id = id;
		this.studentId = studentId;
		this.subjectId = subjectId;
		this.semesterId = semesterId;
		this.mark = mark;
		this.examRound = examRound;
		this.studyTime = studyTime;
		this.status = status;
		this.mark4 = mark4;
		this.charMark = charMark;
		this.isAccepted = isAccepted;
		this.note = note;
		this.isCounted = isCounted;
		this.result = result;
		this.equivalentSubjectId = equivalentSubjectId;
		this.equivalentSubjectCode = equivalentSubjectCode;
		this.equivalentSubjectName = equivalentSubjectName;
		this.isInProgram = isInProgram;
		this.examStatus = examStatus;
		this.examStatusCode = examStatusCode;
		this.isPublished = isPublished;
		this.saveStatus = saveStatus;
		this.markQT = markQT;
		this.markTHI = markTHI;
		this.isMarkEquivalent = isMarkEquivalent;
		this.isConditionalMark = isConditionalMark;
	}
	
	public StudentSubjectMarkDto(StudentSubjectMark studentSubjectMark,boolean simple) {
		this.mark = studentSubjectMark.getMark();
		this.mark4=studentSubjectMark.getMark4();
		if(this.mark4==null && this.mark!=null) {
			this.mark4=MarkUtil.convertMark4(this.mark);
		}
		this.charMark=studentSubjectMark.getCharMark();
		if(this.charMark==null && this.mark!=null) {
			this.charMark=MarkUtil.convertCharMark(this.mark).toString();
		}
		this.examRound = studentSubjectMark.getExamRound();
		this.studyTime = studentSubjectMark.getStudyTime();
		if(studentSubjectMark.getIsAccepted()!=null)
		this.isAccepted=studentSubjectMark.getIsAccepted();
		if(studentSubjectMark.getIsCounted()!=null)
		this.isCounted = studentSubjectMark.getIsCounted();
		this.note=studentSubjectMark.getNote();
		this.result = studentSubjectMark.getResult();
		this.status = studentSubjectMark.getStatus();
		this.studyTime =studentSubjectMark.getStudyTime();
		this.isPublished = studentSubjectMark.getIsPublished();
		this.id = studentSubjectMark.getId();
		this.isConditionalMark = studentSubjectMark.getIsConditionalMark();
		if(studentSubjectMark.getStudent()!=null) {
//			this.student = new StudentDto(studentSubjectMark.getStudent());
			this.student = new StudentDto();
			this.student.setId(studentSubjectMark.getStudent().getId());
			this.student.setFirstName(studentSubjectMark.getStudent().getFirstName()); 
			this.student.setLastName(studentSubjectMark.getStudent().getLastName());
			this.student.setDisplayName(studentSubjectMark.getStudent().getDisplayName());
			this.student.setStudentCode(studentSubjectMark.getStudent().getStudentCode());
			this.student.setBirthDate(studentSubjectMark.getStudent().getBirthDate());
			this.student.setGender(studentSubjectMark.getStudent().getGender());
		}
		if(studentSubjectMark.getSubject()!=null) {
//			this.subject = new SubjectDto(studentSubjectMark.getSubject());
			SubjectDto sub=new SubjectDto();
			sub.setId(studentSubjectMark.getSubject().getId());
			sub.setSubjectName(studentSubjectMark.getSubject().getSubjectName());
			sub.setSubjectCode(studentSubjectMark.getSubject().getSubjectCode());
			sub.setNumberOfCredit(studentSubjectMark.getSubject().getNumberOfCredit());
			sub.setSubjectNameEng(studentSubjectMark.getSubject().getSubjectNameEng());
			sub.setIsCalculateMark(studentSubjectMark.getSubject().getIsCalculateMark());
			this.subject=sub;
		}
	}
	public StudentSubjectMarkDto(StudentSubjectMark studentSubjectMark) {
		this.mark = studentSubjectMark.getMark();
		this.mark4=studentSubjectMark.getMark4();
		if(this.mark4==null && this.mark!=null) {
			this.mark4=MarkUtil.convertMark4(this.mark);
		}
		this.charMark=studentSubjectMark.getCharMark();
		if(this.charMark==null && this.mark!=null) {
			this.charMark=MarkUtil.convertCharMark(this.mark).toString();
		}
		this.examRound = studentSubjectMark.getExamRound();
		this.studyTime = studentSubjectMark.getStudyTime();
		if(studentSubjectMark.getIsAccepted()!=null)
		this.isAccepted=studentSubjectMark.getIsAccepted();
		if(studentSubjectMark.getIsCounted()!=null)
		this.isCounted = studentSubjectMark.getIsCounted();
		this.note=studentSubjectMark.getNote();
		this.result = studentSubjectMark.getResult();
		this.status = studentSubjectMark.getStatus();
		this.studyTime =studentSubjectMark.getStudyTime();
		this.isPublished = studentSubjectMark.getIsPublished();
		this.id = studentSubjectMark.getId();
		this.isConditionalMark = studentSubjectMark.getIsConditionalMark();
		if(studentSubjectMark.getSemester()!=null) {
//			this.semester = new SemesterDto(studentSubjectMark.getSemester());
		
			SemesterDto s= new SemesterDto();
			s.setId(studentSubjectMark.getSemester().getId());
			s.setSemesterCode(studentSubjectMark.getSemester().getSemesterCode());
			s.setSemesterName(studentSubjectMark.getSemester().getSemesterName());
			s.setYear(studentSubjectMark.getSemester().getYear());
			s.setStartDate(studentSubjectMark.getSemester().getStartDate());
			s.setEndDate(studentSubjectMark.getSemester().getEndDate());
			this.semester=s;
		}
		if(studentSubjectMark.getSubject()!=null) {
//			this.subject = new SubjectDto(studentSubjectMark.getSubject());
			SubjectDto sub=new SubjectDto();
			sub.setId(studentSubjectMark.getSubject().getId());
			sub.setSubjectName(studentSubjectMark.getSubject().getSubjectName());
			sub.setSubjectCode(studentSubjectMark.getSubject().getSubjectCode());
			sub.setNumberOfCredit(studentSubjectMark.getSubject().getNumberOfCredit());
			sub.setSubjectNameEng(studentSubjectMark.getSubject().getSubjectNameEng());
			sub.setIsCalculateMark(studentSubjectMark.getSubject().getIsCalculateMark());
			this.subject=sub;
		}
		if(studentSubjectMark.getStudent()!=null) {
//			this.student = new StudentDto(studentSubjectMark.getStudent());
			this.student = new StudentDto();
			this.student.setId(studentSubjectMark.getStudent().getId());
			this.student.setFirstName(studentSubjectMark.getStudent().getFirstName()); 
			this.student.setLastName(studentSubjectMark.getStudent().getLastName());
			this.student.setDisplayName(studentSubjectMark.getStudent().getDisplayName());
			this.student.setStudentCode(studentSubjectMark.getStudent().getStudentCode());
			this.student.setBirthDate(studentSubjectMark.getStudent().getBirthDate());
			this.student.setGender(studentSubjectMark.getStudent().getGender());
			if(studentSubjectMark.getStudent().getEnrollmentClass()!=null) {
				this.student.setClassCode(studentSubjectMark.getStudent().getEnrollmentClass().getClassCode());
				this.student.setClassName(studentSubjectMark.getStudent().getEnrollmentClass().getClassName());
			}				
			
		}
		if(studentSubjectMark.getDetails()!=null ) {
			this.details = new ArrayList<StudentMarkDto>();
			for (StudentMark c : studentSubjectMark.getDetails()) {
				if(c!=null) {
					StudentMarkDto cDto = new StudentMarkDto();					
					cDto.setId(c.getId());
					cDto.setCoeffiecient(c.getCoeffiecient());
					cDto.setExamRound(c.getExamRound());
					cDto.setMark(c.getMark());
					if(c.getMarkType()!=null){
						cDto.setMarkType(new MarkTypeDto(c.getMarkType()));
					}		
					if(c.getStudentExamRoom() != null) {
						StudentSemesterSubjectExamRoomDto ssser = new StudentSemesterSubjectExamRoomDto();
						ssser.setId(c.getStudentExamRoom().getId());
						ssser.setExamCode(c.getStudentExamRoom().getExamCode());
						if(c.getStudentExamRoom().getExamStatus()!=null) {
							ssser.setExamStatus(new ExamStatusDto(c.getStudentExamRoom().getExamStatus()));
						}
						cDto.setStudentExamRoom(ssser);
					}
					if(c.getStudentCourseSubject()!=null) {
						StudentCourseSubjectDto scsDto=new StudentCourseSubjectDto();
						scsDto.setId(c.getStudentCourseSubject().getId());
						scsDto.setSubjectStatus(c.getStudentCourseSubject().getSubjectStatus());
						scsDto.setExamStatus(c.getStudentCourseSubject().getExamStatus());
						cDto.setStudentCourseSubject(scsDto);
					}
					if(c.getSubject()!=null) {
						SubjectDto sub = new SubjectDto();
						sub.setId(c.getSubject().getId());
						sub.setSubjectCode(c.getSubject().getSubjectCode());
						sub.setSubjectName(c.getSubject().getSubjectName());
						sub.setSubjectNameEng(c.getSubject().getSubjectNameEng());
						sub.setNumberOfCredit(c.getSubject().getNumberOfCredit());	
						cDto.setSubject(sub);
					}
					if(c.getStudent()!=null) {
						StudentDto stu = new StudentDto();
						stu.setId(studentSubjectMark.getStudent().getId());
						stu.setFirstName(studentSubjectMark.getStudent().getFirstName()); 
						stu.setLastName(studentSubjectMark.getStudent().getLastName());
						stu.setDisplayName(studentSubjectMark.getStudent().getDisplayName());
						stu.setStudentCode(studentSubjectMark.getStudent().getStudentCode());						
						cDto.setStudent (stu);
					}
					if (c.getSubjectExam() != null) {
						SubjectExamDto sr = new SubjectExamDto();
						sr.setCode(c.getSubjectExam().getCode());
						sr.setName(c.getSubjectExam().getName());
						sr.setId(c.getSubjectExam().getId());
						sr.setInputMarkType(c.getSubjectExam().getInputMarkType());
						cDto.setSubjectExam(sr);
					}
					if (c.getSpecialPoint() != null) {
						SpecialPointDto sr = new SpecialPointDto();
						sr.setCode(c.getSpecialPoint().getCode());
						sr.setName(c.getSpecialPoint().getName());
						sr.setId(c.getSpecialPoint().getId());
						sr.setNote(c.getSpecialPoint().getNote());
						cDto.setSpecialPoint(sr);
					}
					cDto.setExamStatus(c.getExamStatus());
					this.details.add(cDto);
				}				
			}
			if(this.details!=null && this.details.size()>0) {
				Collections.sort(this.details, new Comparator<StudentMarkDto>() {
				    @Override
				    public int compare(StudentMarkDto lhs, StudentMarkDto rhs) {
				    	if(lhs.getSubjectExam()!=null && rhs.getSubjectExam()!=null) {
				    		return (lhs.getSubjectExam().getCode().compareTo(rhs.getSubjectExam().getCode()));
				    	}else {
				    		return 0;
				    	}
				        
				    }
				});
			}
			
		}
	}
	public StudentSubjectMarkDto(StudentSubjectMark studentSubjectMark,Semester se,Subject su ) {
		this.mark = studentSubjectMark.getMark();
		this.mark4=studentSubjectMark.getMark4();
		this.charMark=studentSubjectMark.getCharMark();
		this.examRound = studentSubjectMark.getExamRound();
		if(studentSubjectMark.getIsAccepted()!=null)
		this.isAccepted=studentSubjectMark.getIsAccepted();
		this.note=studentSubjectMark.getNote();
		this.status = studentSubjectMark.getStatus();
		this.studyTime =studentSubjectMark.getStudyTime();	
		if(studentSubjectMark.getIsCounted()!=null)
		this.isCounted=studentSubjectMark.getIsCounted();
		this.result=studentSubjectMark.getResult();
		this.isPublished = studentSubjectMark.getIsPublished();
		this.id = studentSubjectMark.getId();
		this.isMarkEquivalent=studentSubjectMark.getIsMarkEquivalent();
		this.isConditionalMark = studentSubjectMark.getIsConditionalMark();
		if(se!=null) {
			this.semester = new SemesterDto();
			this.semester.setId(se.getId());
			this.semester.setSemesterName(se.getSemesterName());
			this.semester.setSemesterCode(se.getSemesterCode());
			this.semester.setYear(se.getYear());
			this.semester.setStartDate(se.getStartDate());
			this.semester.setEndDate(se.getEndDate());
//			if(s.getSchoolYear()!=null) {
//				this.schoolYear = new SchoolYearDto();
//				this.schoolYear.setCode(s.getSchoolYear().getCode());
//				this.schoolYear.setName(s.getSchoolYear().getName());
//				this.schoolYear.setId(s.getSchoolYear().getId());
//			}
		}
		if(su!=null) {
			this.subject = new SubjectDto();
			this.subject.setId(su.getId());
			this.subject.setSubjectCode(su.getSubjectCode());
			this.subject.setSubjectName(su.getSubjectName());
			this.subject.setSubjectNameEng(su.getSubjectNameEng());
			this.subject.setNumberOfCredit(su.getNumberOfCredit());		
			this.subject.setIsCalculateMark(su.getIsCalculateMark());
			if(su.getDepartment()!=null) {
				DepartmentDto de=new DepartmentDto();
				de.setId(su.getDepartment().getId());
				de.setCode(su.getDepartment().getCode());
				de.setName(su.getDepartment().getName());
				this.subject.setDepartment(de);
			}
		}
		if(studentSubjectMark.getStudent()!=null) {
			this.student = new StudentDto();
			this.student.setId(studentSubjectMark.getStudent().getId());
			this.student.setFirstName(studentSubjectMark.getStudent().getFirstName()); 
			this.student.setLastName(studentSubjectMark.getStudent().getLastName());
			this.student.setDisplayName(studentSubjectMark.getStudent().getDisplayName());
			this.student.setStudentCode(studentSubjectMark.getStudent().getStudentCode());
			this.student.setGender(studentSubjectMark.getStudent().getGender());
		}
		if(studentSubjectMark.getDetails()!=null ) {
			this.details = new ArrayList<StudentMarkDto>();
			for (StudentMark c : studentSubjectMark.getDetails()) {
				StudentMarkDto cDto = new StudentMarkDto();
				cDto.setId(c.getId());
				cDto.setCoeffiecient(c.getCoeffiecient());
				cDto.setExamRound(c.getExamRound());
				cDto.setMark(c.getMark());
				if(c.getMarkType()!=null){
					cDto.setMarkType(new MarkTypeDto(c.getMarkType()));
				}
				
				if(c.getSubject()!=null) {
//					cDto.setSubject(new SubjectDto(c.getSubject()));
					SubjectDto sub = new SubjectDto();
					sub.setId(c.getSubject().getId());
					sub.setSubjectCode(c.getSubject().getSubjectCode());
					sub.setSubjectName(c.getSubject().getSubjectName());
					sub.setSubjectNameEng(c.getSubject().getSubjectNameEng());
					sub.setNumberOfCredit(c.getSubject().getNumberOfCredit());	
					cDto.setSubject(sub);
				}
				if(c.getStudent()!=null) {
//					cDto.setStudent (new StudentDto(c.getStudent()));
					StudentDto stu = new StudentDto();
					stu.setId(studentSubjectMark.getStudent().getId());
					stu.setFirstName(studentSubjectMark.getStudent().getFirstName()); 
					stu.setLastName(studentSubjectMark.getStudent().getLastName());
					stu.setDisplayName(studentSubjectMark.getStudent().getDisplayName());
					stu.setStudentCode(studentSubjectMark.getStudent().getStudentCode());
					cDto.setStudent (stu);
				}
				if (c.getSubjectExam() != null) {
					SubjectExamDto sr = new SubjectExamDto();
					sr.setCode(c.getSubjectExam().getCode());
					sr.setName(c.getSubjectExam().getName());
					sr.setId(c.getSubjectExam().getId());
					sr.setInputMarkType(c.getSubjectExam().getInputMarkType());
					cDto.setSubjectExam(sr);
				}
				if(c.getStudentExamRoom() != null) {
					StudentSemesterSubjectExamRoomDto ssser = new StudentSemesterSubjectExamRoomDto();
					ssser.setId(c.getStudentExamRoom().getId());
					ssser.setExamCode(c.getStudentExamRoom().getExamCode());
					cDto.setStudentExamRoom(ssser);
					
				}
				if (c.getSpecialPoint() != null) {
					SpecialPointDto sr = new SpecialPointDto();
					sr.setCode(c.getSpecialPoint().getCode());
					sr.setName(c.getSpecialPoint().getName());
					sr.setId(c.getSpecialPoint().getId());
					sr.setNote(c.getSpecialPoint().getNote());
					cDto.setSpecialPoint(sr);
				}
				cDto.setExamStatus(c.getExamStatus());
				this.details.add(cDto);
			}
			Collections.sort(this.details, new Comparator<StudentMarkDto>() {
			    @Override
			    public int compare(StudentMarkDto lhs, StudentMarkDto rhs) {
			        return (lhs.getSubjectExam().getCode().compareTo(rhs.getSubjectExam().getCode()));
			    }
			});
		}
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public StudentDto getStudent() {
		return student;
	}

	public void setStudent(StudentDto student) {
		this.student = student;
	}

	public SubjectDto getSubject() {
		return subject;
	}

	public void setSubject(SubjectDto subject) {
		this.subject = subject;
	}

	public SemesterDto getSemester() {
		return semester;
	}

	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public Long getSemesterId() {
		return semesterId;
	}

	public void setSemesterId(Long semesterId) {
		this.semesterId = semesterId;
	}

	public Double getMark() {
		return mark;
	}

	public void setMark(Double mark) {
		this.mark = mark;
	}

	public Integer getExamRound() {
		return examRound;
	}

	public void setExamRound(Integer examRound) {
		this.examRound = examRound;
	}

	public Integer getStudyTime() {
		return studyTime;
	}

	public void setStudyTime(Integer studyTime) {
		this.studyTime = studyTime;
	}

	public List<StudentMarkDto> getDetails() {
		return details;
	}

	public void setDetails(List<StudentMarkDto> details) {
		this.details = details;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Double getMark4() {
		return mark4;
	}

	public void setMark4(Double mark4) {
		this.mark4 = mark4;
	}

	public String getCharMark() {
		return charMark;
	}

	public void setCharMark(String charMark) {
		this.charMark = charMark;
	}

	public Boolean getIsAccepted() {
		return isAccepted;
	}

	public void setIsAccepted(Boolean isAccepted) {
		this.isAccepted = isAccepted;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Boolean getIsCounted() {
		return isCounted;
	}

	public void setIsCounted(Boolean isCounted) {
		this.isCounted = isCounted;
	}

	public Integer getResult() {
		return result;
	}

	public void setResult(Integer result) {
		this.result = result;
	}

	public Long getEquivalentSubjectId() {
		return equivalentSubjectId;
	}

	public void setEquivalentSubjectId(Long equivalentSubjectId) {
		this.equivalentSubjectId = equivalentSubjectId;
	}

	public String getEquivalentSubjectCode() {
		return equivalentSubjectCode;
	}

	public void setEquivalentSubjectCode(String equivalentSubjectCode) {
		this.equivalentSubjectCode = equivalentSubjectCode;
	}

	public String getEquivalentSubjectName() {
		return equivalentSubjectName;
	}

	public void setEquivalentSubjectName(String equivalentSubjectName) {
		this.equivalentSubjectName = equivalentSubjectName;
	}

	public Boolean getIsInProgram() {
		return isInProgram;
	}

	public void setIsInProgram(Boolean isInProgram) {
		this.isInProgram = isInProgram;
	}

	public int getExamStatus() {
		return examStatus;
	}

	public void setExamStatus(int examStatus) {
		this.examStatus = examStatus;
	}

	public String getExamStatusCode() {
		return examStatusCode;
	}

	public void setExamStatusCode(String examStatusCode) {
		this.examStatusCode = examStatusCode;
	}

	public Boolean getIsPublished() {
		return isPublished;
	}

	public void setIsPublished(Boolean isPublished) {
		this.isPublished = isPublished;
	}

	public boolean isSaveStatus() {
		return saveStatus;
	}

	public void setSaveStatus(boolean saveStatus) {
		this.saveStatus = saveStatus;
	}

	public Double getMarkQT() {
		return markQT;
	}

	public void setMarkQT(Double markQT) {
		this.markQT = markQT;
	}

	public Double getMarkTHI() {
		return markTHI;
	}

	public void setMarkTHI(Double markTHI) {
		this.markTHI = markTHI;
	}

	public Boolean getIsMarkEquivalent() {
		return isMarkEquivalent;
	}

	public void setIsMarkEquivalent(Boolean isMarkEquivalent) {
		this.isMarkEquivalent = isMarkEquivalent;
	}

	public Boolean getIsConditionalMark() {
		return isConditionalMark;
	}

	public void setIsConditionalMark(Boolean isConditionalMark) {
		this.isConditionalMark = isConditionalMark;
	}
	
}
