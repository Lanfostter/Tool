package com.example.tool.edudto;

import java.io.Serializable;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.globits.education.domain.EducationProgram;
import com.globits.education.domain.GraduationPeriod;
import com.globits.education.domain.Student;
import com.globits.education.domain.StudentGraduate;
import com.globits.education.dto.EducationProgramDto;
import com.globits.education.dto.GraduationPeriodDto;
import com.globits.education.dto.StudentDto;

public class StudentGraduateDto implements Serializable {

	private Long id;
	
	private StudentDto student;//Danh sách sinh viên nào
	
	private GraduationPeriodDto graduationPeriod;
	
	private EducationProgramDto educationProgram;//Theo chương trình đào tạo nào
	
	private Integer status;//0 = mới đề xuất, 1 = đã phê duyệt, 2= đã phát bằng, -1 = bị loại khỏi danh sách (không được phê duyệt)

	private Boolean isEligible;//Đủ điều kiện xét tốt nghiệp
	
	private String displayName;
	
	private String studentCode;
	
	private String eduProgramName;
	
	private Long studentId;
	
	private Long eduProgramId;
	
	private Long classId;
	
	private String classCode;
	
	private Long courseYearId;
	
	private String courseYearCode;
	
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

	public GraduationPeriodDto getGraduationPeriod() {
		return graduationPeriod;
	}

	public void setGraduationPeriod(GraduationPeriodDto graduationPeriod) {
		this.graduationPeriod = graduationPeriod;
	}

	public EducationProgramDto getEducationProgram() {
		return educationProgram;
	}

	public void setEducationProgram(EducationProgramDto educationProgram) {
		this.educationProgram = educationProgram;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Boolean getIsEligible() {
		return isEligible;
	}

	public void setIsEligible(Boolean isEligible) {
		this.isEligible = isEligible;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public Long getClassId() {
		return classId;
	}

	public void setClassId(Long classId) {
		this.classId = classId;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
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

	public String getEduProgramName() {
		return eduProgramName;
	}

	public void setEduProgramName(String eduProgramName) {
		this.eduProgramName = eduProgramName;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public Long getEduProgramId() {
		return eduProgramId;
	}

	public void setEduProgramId(Long eduProgramId) {
		this.eduProgramId = eduProgramId;
	}

	public StudentGraduateDto() {
		
	}
	
	public StudentGraduateDto(StudentGraduate sg) {
		if(sg!=null) {
			this.id = sg.getId();
			if(sg.getEducationProgram()!=null) {
				this.educationProgram = new EducationProgramDto(sg.getEducationProgram());
				this.eduProgramId = sg.getEducationProgram().getId();
				this.eduProgramName = sg.getEducationProgram().getName();
			}
			
			if(sg.getGraduationPeriod()!=null) {
				this.graduationPeriod = new GraduationPeriodDto(sg.getGraduationPeriod());
			}
			
			if(sg.getStudent()!=null) {
				this.student = new StudentDto(sg.getStudent(), true);
				this.studentId = sg.getStudent().getId();
				this.displayName = sg.getStudent().getDisplayName();
				this.studentCode = sg.getStudent().getStudentCode();
				if(sg.getStudent().getEnrollmentClass()!=null) {
					this.classId = sg.getStudent().getEnrollmentClass().getId();
					this.classCode = sg.getStudent().getEnrollmentClass().getClassCode();
					if(sg.getStudent().getEnrollmentClass().getCourseyear()!=null) {
						this.courseYearCode = sg.getStudent().getEnrollmentClass().getCourseyear().getCode();
						this.courseYearId = sg.getStudent().getEnrollmentClass().getCourseyear().getId();
					}
				}
			}
				
			this.status = sg.getStatus();
			this.isEligible = sg.getIsEligible();			
		}
	}
	public StudentGraduateDto(StudentGraduate sg,Boolean simple) {
		if(sg!=null) {
			this.id = sg.getId();
			if(sg.getEducationProgram()!=null) {
				this.eduProgramId = sg.getEducationProgram().getId();
				this.eduProgramName = sg.getEducationProgram().getName();
			}
			if(sg.getGraduationPeriod()!=null)
				this.graduationPeriod = new GraduationPeriodDto(sg.getGraduationPeriod());
			if(sg.getStudent()!=null)
			{
				this.studentId = sg.getStudent().getId();
				this.displayName = sg.getStudent().getDisplayName();
				this.studentCode = sg.getStudent().getStudentCode();
				if(sg.getStudent().getEnrollmentClass()!=null) {
					this.classId = sg.getStudent().getEnrollmentClass().getId();
					this.classCode = sg.getStudent().getEnrollmentClass().getClassCode();
					if(sg.getStudent().getEnrollmentClass().getCourseyear()!=null) {
						this.courseYearCode = sg.getStudent().getEnrollmentClass().getCourseyear().getCode();
						this.courseYearId = sg.getStudent().getEnrollmentClass().getCourseyear().getId();
					}
				}				
			}
			this.status = sg.getStatus();
			this.isEligible = sg.getIsEligible();
		}
	}
}
