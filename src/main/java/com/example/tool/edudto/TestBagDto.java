package com.example.tool.edudto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;

import javax.persistence.Column;

import com.globits.core.dto.RoomDto;
import com.globits.education.domain.CourseSubject;
import com.globits.education.domain.SemesterSubjectExam;
import com.globits.education.domain.Student;
import com.globits.education.domain.StudentCourseSubject;
import com.globits.education.domain.StudentSemesterSubjectExamRoom;
import com.globits.education.domain.TestBag;
import com.globits.education.dto.CourseSubjectDto;
import com.globits.education.dto.CourseYearDto;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.SemesterRegisterPeriodDto;
import com.globits.education.dto.SemesterSubjectExamDto;
import com.globits.education.dto.SemesterSubjectExamRoomDto;
import com.globits.education.dto.StudentCourseSubjectDto;
import com.globits.education.dto.StudentDto;
import com.globits.education.dto.StudentSemesterSubjectExamRoomDto;
import com.globits.education.dto.SubjectDto;
import com.globits.education.dto.TestBagCreateTimeDto;

public class TestBagDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String code;
	private Integer numberStudent;// số lượng bài thi

	private Integer startMarkingCode;//Số phách bắt đầu
	private Integer endMarkingCode;//Số phách kết thúc
	private List<StudentSemesterSubjectExamRoomDto> students;
	private List<SemesterSubjectExamRoomDto> rooms;
	private SemesterSubjectExamDto semesterSubjectExam;
	private TestBagCreateTimeDto testBagCreateTimeDto;
	private List<String> roomsSummary;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	
	public Integer getNumberStudent() {
		return numberStudent;
	}

	public void setNumberStudent(Integer numberStudent) {
		this.numberStudent = numberStudent;
	}

	public Integer getStartMarkingCode() {
		return startMarkingCode;
	}

	public void setStartMarkingCode(Integer startMarkingCode) {
		this.startMarkingCode = startMarkingCode;
	}

	public Integer getEndMarkingCode() {
		return endMarkingCode;
	}

	public void setEndMarkingCode(Integer endMarkingCode) {
		this.endMarkingCode = endMarkingCode;
	}

	public List<StudentSemesterSubjectExamRoomDto> getStudents() {
		return students;
	}

	public void setStudents(List<StudentSemesterSubjectExamRoomDto> students) {
		this.students = students;
	}

	public SemesterSubjectExamDto getSemesterSubjectExam() {
		return semesterSubjectExam;
	}

	public void setSemesterSubjectExam(SemesterSubjectExamDto semesterSubjectExam) {
		this.semesterSubjectExam = semesterSubjectExam;
	}
	public List<SemesterSubjectExamRoomDto> getRooms() {
		return rooms;
	}

	public void setRooms(List<SemesterSubjectExamRoomDto> rooms) {
		this.rooms = rooms;
	}

	public TestBagCreateTimeDto getTestBagCreateTimeDto() {
		return testBagCreateTimeDto;
	}

	public void setTestBagCreateTimeDto(TestBagCreateTimeDto testBagCreateTimeDto) {
		this.testBagCreateTimeDto = testBagCreateTimeDto;
	}

	public List<String> getRoomsSummary() {
		return roomsSummary;
	}

	public void setRoomsSummary(List<String> roomsSummary) {
		this.roomsSummary = roomsSummary;
	}

	public TestBagDto() {
		
	}

	public TestBagDto(TestBag se) {
		if(se!=null) {
			this.id = se.getId();
			this.code = se.getCode();
			this.name = se.getName();
			this.numberStudent=se.getNumberStudent();
			this.startMarkingCode = se.getStartMarkingCode();
			this.endMarkingCode = se.getEndMarkingCode();
			if (se.getStudents() != null && se.getStudents().size() > 0) {
				this.students = new ArrayList<StudentSemesterSubjectExamRoomDto>();
				this.rooms = new ArrayList<SemesterSubjectExamRoomDto>();
				for (StudentSemesterSubjectExamRoom ssse : se.getStudents()) {
					StudentSemesterSubjectExamRoomDto ssseDto = new StudentSemesterSubjectExamRoomDto();

					ssseDto.setExamCode(ssse.getExamCode());
					ssseDto.setId(ssse.getId());
					ssseDto.setMarkingCode(ssse.getMarkingCode());
					if (ssse.getStudent() != null) {
						Student d = ssse.getStudent();
						StudentDto studentDto = new StudentDto();
						studentDto.setId(d.getId());
						studentDto.setDisplayName(d.getDisplayName());
						studentDto.setStudentCode(d.getStudentCode());
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
					if(ssse.getExamRoom()!=null) {
						SemesterSubjectExamRoomDto examRoomDto=new SemesterSubjectExamRoomDto();
						examRoomDto.setRoomCode(ssse.getExamRoom().getRoomCode());
						if(ssse.getExamRoom().getRoom()!=null)
						examRoomDto.setRoom(new RoomDto(ssse.getExamRoom().getRoom()));
						examRoomDto.setExamDate(ssse.getExamRoom().getExamDate());
						examRoomDto.setId(ssse.getExamRoom().getId());
						ssseDto.setExamRoom(examRoomDto);
						
						Boolean isContain = false;
						if(rooms!=null && !rooms.isEmpty()) {
							for (SemesterSubjectExamRoomDto semesterSubjectExamRoomDto : rooms) {
								if(semesterSubjectExamRoomDto.getId().equals(examRoomDto.getId())) {
									isContain=true;
									break;
								}							
							}						
						}
						if(!isContain) {
							rooms.add(examRoomDto);
						}
					}
					this.students.add(ssseDto);
				}
//				if(students.size()>0 && rooms.size()>0) {
//					for (SemesterSubjectExamRoomDto room : rooms) {
//						room.setStudentList(new ArrayList<StudentSemesterSubjectExamRoomDto>());
//						for (StudentSemesterSubjectExamRoomDto student : students) {
//							if(student.getExamRoom().getId()==room.getId()) {
//								room.getStudentList().add(student);
//							}
//						}
//					}
//				}
			}
			if(se.getSemesterSubjectExam()!=null) {
				SemesterSubjectExamDto dto=new SemesterSubjectExamDto();
				dto.setId(se.getSemesterSubjectExam().getId());
				dto.setSemester(new SemesterDto(se.getSemesterSubjectExam().getSemester()));
				dto.setSubject(new SubjectDto(se.getSemesterSubjectExam().getSubject()));
				dto.setExamRound(se.getSemesterSubjectExam().getExamRound());
				dto.setDescription(se.getSemesterSubjectExam().getDescription());
				dto.setNumberRoom(se.getSemesterSubjectExam().getNumberRoom());
				dto.setNumberStudent(se.getSemesterSubjectExam().getNumberStudent());
				dto.setNumberEstimateStudent(se.getSemesterSubjectExam().getNumberEstimateStudent());
				this.semesterSubjectExam=dto;
			}
			if(se.getTestBagCreateTime()!=null) {
				this.testBagCreateTimeDto = new TestBagCreateTimeDto(se.getTestBagCreateTime(),true);
			}
		}		
	}
	public TestBagDto(TestBag se,Boolean simple) {
		if(se!=null) {
			this.id = se.getId();
			this.code = se.getCode();
			this.name = se.getName();
			this.numberStudent=se.getNumberStudent();
			this.startMarkingCode = se.getStartMarkingCode();
			this.endMarkingCode = se.getEndMarkingCode();
			
			if(se.getSemesterSubjectExam()!=null) {
				SemesterSubjectExamDto dto=new SemesterSubjectExamDto();
				dto.setId(se.getSemesterSubjectExam().getId());
				
				if(se.getSemesterSubjectExam().getSemester()!=null) {
					SemesterDto semesterDto = new SemesterDto();
					semesterDto.setId(se.getSemesterSubjectExam().getSemester().getId());
					semesterDto.setSemesterCode(se.getSemesterSubjectExam().getSemester().getSemesterCode());
					semesterDto.setSemesterName(se.getSemesterSubjectExam().getSemester().getSemesterName());
					dto.setSemester(semesterDto);
				}
				if(se.getSemesterSubjectExam().getSubject()!=null) {
					SubjectDto subjectDto = new SubjectDto();
					subjectDto.setId(se.getSemesterSubjectExam().getSubject().getId());
					subjectDto.setSubjectCode(se.getSemesterSubjectExam().getSubject().getSubjectCode());
					subjectDto.setSubjectName(se.getSemesterSubjectExam().getSubject().getSubjectName());
					subjectDto.setSubjectNameEng(se.getSemesterSubjectExam().getSubject().getSubjectNameEng());
					subjectDto.setTotalSubjectName(se.getSemesterSubjectExam().getSubject().getSubjectName() + "( " + se.getSemesterSubjectExam().getSubject().getNumberOfCredit() + " tín chỉ)");
					dto.setSubject(subjectDto);
				}
				if(se.getSemesterSubjectExam().getCourseyear()!=null) {
					CourseYearDto courseYearDto = new CourseYearDto();
					courseYearDto.setName(se.getSemesterSubjectExam().getCourseyear().getName());
					dto.setCourseYearDto(courseYearDto);
				}
				if(se.getSemesterSubjectExam().getRegisterPeriod()!=null) {
					SemesterRegisterPeriodDto semesterRegisterPeriodDto = new SemesterRegisterPeriodDto();
					semesterRegisterPeriodDto.setName(se.getSemesterSubjectExam().getRegisterPeriod().getName());
					dto.setRegisterPeriod(semesterRegisterPeriodDto);
				}
				dto.setExamRound(se.getSemesterSubjectExam().getExamRound());
				dto.setDescription(se.getSemesterSubjectExam().getDescription());
				dto.setNumberRoom(se.getSemesterSubjectExam().getNumberRoom());
				dto.setNumberStudent(se.getSemesterSubjectExam().getNumberStudent());
				dto.setNumberEstimateStudent(se.getSemesterSubjectExam().getNumberEstimateStudent());
				this.semesterSubjectExam=dto;
			}
			if(se.getTestBagCreateTime()!=null) {
				this.testBagCreateTimeDto = new TestBagCreateTimeDto(se.getTestBagCreateTime(),true);
			}			
		}
	}
}
