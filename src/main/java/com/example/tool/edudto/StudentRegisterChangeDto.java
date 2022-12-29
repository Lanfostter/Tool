package com.example.tool.edudto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import com.globits.core.dto.BaseObjectDto;
import com.globits.education.domain.CourseSubject;
import com.globits.education.domain.StudentCourseSubjectCancelFee;
import com.globits.education.domain.StudentRegisterChange;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.SemesterRegisterPeriodDto;
import com.globits.education.dto.StudentDto;

public class StudentRegisterChangeDto extends BaseObjectDto {
	
	private StudentDto student;
	
	private SemesterDto semester;
	
	private SemesterRegisterPeriodDto registerPeriod;
	
	private Integer changeTime;//Số lần sửa đổi
	
	private Date firstTimeChange;//Thời điểm sửa đổi đầu tiên
	
	private Date lastTimeChange;//Thời điểm sửa đổi cuối cùng
	
	private Boolean isLock;//Chốt sửa đổi

//	private List<StudentCourseSubjectCancelFeeDto>  studentCourseSubjectCancelFees;
	
	public StudentDto getStudent() {
		return student;
	}

	public void setStudent(StudentDto student) {
		this.student = student;
	}

	public SemesterDto getSemester() {
		return semester;
	}

	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}

	public SemesterRegisterPeriodDto getRegisterPeriod() {
		return registerPeriod;
	}

	public void setRegisterPeriod(SemesterRegisterPeriodDto registerPeriod) {
		this.registerPeriod = registerPeriod;
	}

	public Integer getChangeTime() {
		return changeTime;
	}

	public void setChangeTime(Integer changeTime) {
		this.changeTime = changeTime;
	}

	public Date getFirstTimeChange() {
		return firstTimeChange;
	}

	public void setFirstTimeChange(Date firstTimeChange) {
		this.firstTimeChange = firstTimeChange;
	}

	public Date getLastTimeChange() {
		return lastTimeChange;
	}

	public void setLastTimeChange(Date lastTimeChange) {
		this.lastTimeChange = lastTimeChange;
	}

	public Boolean getIsLock() {
		return isLock;
	}

	public void setIsLock(Boolean isLock) {
		this.isLock = isLock;
	}
	
	
//	public List<StudentCourseSubjectCancelFeeDto> getStudentCourseSubjectCancelFees() {
//		return studentCourseSubjectCancelFees;
//	}
//
//	public void setStudentCourseSubjectCancelFees(List<StudentCourseSubjectCancelFeeDto> studentCourseSubjectCancelFees) {
//		this.studentCourseSubjectCancelFees = studentCourseSubjectCancelFees;
//	}

	public StudentRegisterChangeDto() {
		
	}
	public StudentRegisterChangeDto(StudentRegisterChange entity) {
		if(entity!=null) {
			this.id = entity.getId();
			this.changeTime = entity.getChangeTime();
			this.lastTimeChange = entity.getLastTimeChange();
			this.firstTimeChange = entity.getFirstTimeChange();
			this.isLock = entity.getIsLock();
			if(entity.getSemester()!=null) {
				this.semester = new SemesterDto();
				this.semester.setId(entity.getSemester().getId());
			}
			if(entity.getStudent()!=null) {
				this.student = new StudentDto();
				this.student.setId(entity.getStudent().getId());
				this.student.setStudentCode(entity.getStudent().getStudentCode());
				this.student.setFirstName(entity.getStudent().getFirstName());
				this.student.setLastName(entity.getStudent().getLastName());
			}			
			if(entity.getRegisterPeriod()!=null) {
				this.registerPeriod = new SemesterRegisterPeriodDto();
				this.registerPeriod.setId(entity.getRegisterPeriod().getId());
				this.registerPeriod.setName(entity.getRegisterPeriod().getName());
				if(entity.getRegisterPeriod().getStartRegisterTime()!=null)
					this.registerPeriod.setStartRegisterTime(entity.getRegisterPeriod().getStartRegisterTime().toDate());
				if(entity.getRegisterPeriod().getEndRegisterTime()!=null)
					this.registerPeriod.setEndRegisterTime(entity.getRegisterPeriod().getEndRegisterTime().toDate());
			}
		}
	}
	
	public StudentRegisterChangeDto(StudentRegisterChange entity, Boolean isGetAll) {
		if(entity!=null) {
			if(isGetAll) {
				this.id = entity.getId();
				this.changeTime = entity.getChangeTime();
				this.lastTimeChange = entity.getLastTimeChange();
				this.firstTimeChange = entity.getFirstTimeChange();
				if(entity.getStudent()!=null) {
					this.student = new StudentDto();
					this.student.setId(entity.getStudent().getId());
					this.student.setStudentCode(entity.getStudent().getStudentCode());
					this.student.setFirstName(entity.getStudent().getFirstName());
					this.student.setLastName(entity.getStudent().getLastName());
				}
				this.isLock = entity.getIsLock();
				if(entity.getSemester()!=null) {
					this.semester = new SemesterDto();
					this.semester.setId(entity.getSemester().getId());
					this.semester.setSemesterCode(entity.getSemester().getSemesterCode());
					this.semester.setSemesterName(entity.getSemester().getSemesterName());
				}
				if(entity.getRegisterPeriod()!=null) {
					this.registerPeriod = new SemesterRegisterPeriodDto();
					this.registerPeriod.setId(entity.getRegisterPeriod().getId());
					this.registerPeriod.setName(entity.getRegisterPeriod().getName());
					if(entity.getRegisterPeriod().getStartRegisterTime()!=null)
						this.registerPeriod.setStartRegisterTime(entity.getRegisterPeriod().getStartRegisterTime().toDate());
					if(entity.getRegisterPeriod().getEndRegisterTime()!=null)
						this.registerPeriod.setEndRegisterTime(entity.getRegisterPeriod().getEndRegisterTime().toDate());
				}
//				if(entity.getStudentCourseSubjectCancelFees()!=null) {
//					this.studentCourseSubjectCancelFees = new ArrayList<StudentCourseSubjectCancelFeeDto>();
//					for(StudentCourseSubjectCancelFee  cancelFee : entity.getStudentCourseSubjectCancelFees()) {
//						StudentCourseSubjectCancelFeeDto cancelFeeDto = new StudentCourseSubjectCancelFeeDto();
//						cancelFeeDto.setId(cancelFee.getId());
//						cancelFeeDto.setPayAmount(cancelFee.getPayAmount());
//						cancelFeeDto.setPayPercent(cancelFee.getPayPercent());
//						
//						
//						CourseSubject courseSubject = cancelFee.getCourseSubject();
//						if(courseSubject.getSemesterSubject()!=null && courseSubject.getSemesterSubject().getSubject()!=null) {
//							String displayName ="";
//							if(courseSubject.getShortCode()!=null && courseSubject.getShortCode().contains("-")) {
//								displayName = courseSubject.getSemesterSubject().getSubject().getSubjectName() + courseSubject.getShortCode().substring(courseSubject.getShortCode().indexOf("-"), courseSubject.getShortCode().length());	
//							}
//							else {
//								displayName = courseSubject.getSemesterSubject().getSubject().getSubjectName() +" " + courseSubject.getShortCode();
//							}
//							cancelFeeDto.setCourseSubjectName(displayName);
////							this.numberOfCredit = courseSubject.getSemesterSubject().getSubject().getNumberOfCredit();
//						}
//						CourseSubjectDto courseSubjectDto = new CourseSubjectDto();
//						courseSubjectDto.setCode(courseSubject.getCode());
//						courseSubjectDto.setId(courseSubject.getId());
//						cancelFeeDto.setCourseSubject(courseSubjectDto);
//						this.studentCourseSubjectCancelFees.add(cancelFeeDto);
//					}
//				}
			}else {
				this.id = entity.getId();
				this.changeTime = entity.getChangeTime();
				this.lastTimeChange = entity.getLastTimeChange();
				this.firstTimeChange = entity.getFirstTimeChange();
				this.isLock = entity.getIsLock();
				if(entity.getStudent()!=null) {
					this.student = new StudentDto();
					this.student.setId(entity.getStudent().getId());
					this.student.setStudentCode(entity.getStudent().getStudentCode());
					this.student.setFirstName(entity.getStudent().getFirstName());
					this.student.setLastName(entity.getStudent().getLastName());
				}
				
				if(entity.getRegisterPeriod()!=null) {
					this.registerPeriod = new SemesterRegisterPeriodDto();
					this.registerPeriod.setId(entity.getRegisterPeriod().getId());
					this.registerPeriod.setName(entity.getRegisterPeriod().getName());
					if(entity.getRegisterPeriod().getStartRegisterTime()!=null)
						this.registerPeriod.setStartRegisterTime(entity.getRegisterPeriod().getStartRegisterTime().toDate());
					if(entity.getRegisterPeriod().getEndRegisterTime()!=null)
						this.registerPeriod.setEndRegisterTime(entity.getRegisterPeriod().getEndRegisterTime().toDate());
				}				
			}
		}
	}
	
}
