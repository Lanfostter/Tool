package com.example.tool.edudto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.tool.edudto.CourseYearDto;
import com.example.tool.edudto.EnrollmentClassDto;
import com.example.tool.edudto.SchoolYearDto;
import com.example.tool.edudto.SemesterDto;
import com.example.tool.edudto.StudentDto;
import com.example.tool.edudto.StudentObjectDto;
import com.globits.core.domain.Reward;
import com.globits.core.dto.RewardDto;
import com.globits.education.domain.EnrollmentClass;
import com.globits.education.domain.SchoolYear;
import com.globits.education.domain.Semester;
import com.globits.education.domain.Student;
import com.globits.education.domain.StudentObject;
import com.globits.education.domain.EnrollmentClassReward;
import com.globits.education.domain.EnrollmentClassRewardCondition;
import com.globits.education.domain.RewardDecree;
import com.globits.education.domain.StudentObjectSubsidize;
import com.globits.education.domain.StudentObjectSubsidizeSemester;
import com.globits.education.domain.StudentReward;
import com.globits.education.dto.RewardDecreeDto;
import com.globits.education.dto.StudentObjectSubsidizeDto;

public class StudentObjectSubsidizeSemesterDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private Integer status;
	private StudentDto student; // Sinh viên
	private StudentObjectSubsidizeDto studentObjectSubsidize; 
	private boolean isCanCheck;
	private RewardDecreeDto rewardDecree;
	private boolean checkboxSelected;
	private boolean state;
	private Float amount;
	
	public boolean isCheckboxSelected() {
		return checkboxSelected;
	}

	public void setCheckboxSelected(boolean checkboxSelected) {
		this.checkboxSelected = checkboxSelected;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public boolean isCanCheck() {
		return isCanCheck;
	}

	public void setCanCheck(boolean isCanCheck) {
		this.isCanCheck = isCanCheck;
	}

	public RewardDecreeDto getRewardDecree() {
		return rewardDecree;
	}

	public void setRewardDecree(RewardDecreeDto rewardDecree) {
		this.rewardDecree = rewardDecree;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public StudentDto getStudent() {
		return student;
	}

	public void setStudent(StudentDto student) {
		this.student = student;
	}

	public StudentObjectSubsidizeDto getStudentObjectSubsidize() {
		return studentObjectSubsidize;
	}

	public void setStudentObjectSubsidize(StudentObjectSubsidizeDto studentObjectSubsidize) {
		this.studentObjectSubsidize = studentObjectSubsidize;
	}
	
	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public StudentObjectSubsidizeSemesterDto(StudentObjectSubsidizeSemester sos) {
		// TODO Auto-generated constructor stub
		this.id = sos.getId();
		this.status = sos.getStatus();
		
		if(sos.getStudent() != null) {
			this.student = new StudentDto();
			this.student.setId(sos.getStudent().getId());
			this.student.setDisplayName(sos.getStudent().getDisplayName());
			this.student.setStudentCode(sos.getStudent().getStudentCode());
			if(sos.getStudent().getEnrollmentClass()!=null) {
				this.student.setClassCode(sos.getStudent().getEnrollmentClass().getClassCode());
				this.student.setClassName(sos.getStudent().getEnrollmentClass().getClassName());
				this.student.setEnrollmentClass(new EnrollmentClassDto());
				this.student.getEnrollmentClass().setId(sos.getStudent().getEnrollmentClass().getId());
				this.student.getEnrollmentClass().setClassCode(sos.getStudent().getEnrollmentClass().getClassCode());
				this.student.getEnrollmentClass().setClassName(sos.getStudent().getEnrollmentClass().getClassName());
				this.student.getEnrollmentClass().setCourseyear(new CourseYearDto(sos.getStudent().getEnrollmentClass().getCourseyear()));
				if(sos.getStudent().getEnrollmentClass().getDepartment()!=null)
					this.student.setDepartment(sos.getStudent().getEnrollmentClass().getDepartment().getName());
			}
		}

		if(sos.getStudentObjectSubsidize() != null) {
			this.studentObjectSubsidize = new StudentObjectSubsidizeDto();
			this.studentObjectSubsidize.setId(sos.getStudentObjectSubsidize().getId());
			this.studentObjectSubsidize.setName(sos.getStudentObjectSubsidize().getName());
			this.studentObjectSubsidize.setMoney_subsidize(sos.getStudentObjectSubsidize().getMoney_subsidize());	
			this.studentObjectSubsidize.setNumber_month_subsidize(sos.getStudentObjectSubsidize().getNumber_month_subsidize());
			if(this.studentObjectSubsidize.getMoney_subsidize()>0&&this.studentObjectSubsidize.getNumber_month_subsidize()!=null )
			this.amount=(this.studentObjectSubsidize.getMoney_subsidize()*this.studentObjectSubsidize.getNumber_month_subsidize());
			if(sos.getStudentObjectSubsidize().getSemester()!=null ) {
				SemesterDto semester = new SemesterDto(sos.getStudentObjectSubsidize().getSemester());
				this.studentObjectSubsidize.setSemester(semester);
			}
			if(sos.getStudentObjectSubsidize().getCourseYear()!=null ) {
				CourseYearDto courseYear = new CourseYearDto(sos.getStudentObjectSubsidize().getCourseYear());
				this.studentObjectSubsidize.setCourseYear(courseYear);
			}
			
			if(sos.getStudentObjectSubsidize().getStudentObject() != null) {
				StudentObjectDto studentObjectDto = new StudentObjectDto(sos.getStudentObjectSubsidize().getStudentObject());
				this.studentObjectSubsidize.setStudentObject(studentObjectDto);
			}
			
			this.status = sos.getStatus();
			if(this.status != null && this.status == 4) {
				this.isCanCheck = false;
			}else {
				this.isCanCheck = true;
			}
			
		}
	}
	
}
