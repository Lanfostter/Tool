package com.example.tool.edudto;

import java.util.HashSet;
import java.util.Set;

import com.globits.core.domain.Discipline;
import com.globits.core.dto.DisciplineDto;
import com.globits.core.dto.RoomDto;
import com.globits.education.domain.CourseSubjectTimetable;
import com.globits.education.domain.CourseYear;
import com.globits.education.domain.CriteriaSearchStudent;
import com.globits.education.domain.CriteriaSearchStudentExceptSubject;
import com.globits.education.domain.EducationProgram;
import com.globits.education.domain.ScholarshipCondition;
import com.globits.education.dto.CourseYearDto;
import com.globits.education.dto.CriteriaSearchStudentExceptSubjectDto;
import com.globits.education.dto.EducationProgramDto;
import com.globits.education.dto.SubjectDto;
import com.globits.hr.dto.StaffDto;

public class CriteriaSearchStudentDto {
	private Long id;
	private String name;
	private Long courseYearId;
	private Long departmentId;	
	private Long specialityId;
	private Long enrollmentClassId;
	private CourseYearDto courseYear;
	private EducationProgramDto educationProgram;
	private Long educationProgramId;
	
	private Double minMark;//Điểm tích lũy tối thiểu
	private Double minMark4;//Điểm tích lũy tối thiểu theo thang 4
	private Double maxMark;//Điểm tích lũy tối đa theo thang 10
	private Double maxMark4;//Điểm tích lũy tối đa theo thang 4
	private Integer maxNumberSubjectNotPass;//Số môn học còn nợ không quá số này
	private Integer maxNumberCreditNotPass;//Tổng số tín chỉ còn nợ không quá số này
	private Boolean payFullTuitionFees;//Đã nộp đủ học phí
	private Set<CriteriaSearchStudentExceptSubjectDto> exceptSubjectList;
	private DisciplineDto discipline;	//mức kỉ luật không được làm tốt nghiệp với điều kiện thời gian
	
	
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
	public Long getCourseYearId() {
		return courseYearId;
	}
	public void setCourseYearId(Long courseYearId) {
		this.courseYearId = courseYearId;
	}
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	public Long getSpecialityId() {
		return specialityId;
	}
	public void setSpecialityId(Long specialityId) {
		this.specialityId = specialityId;
	}
	public Long getEnrollmentClassId() {
		return enrollmentClassId;
	}
	public void setEnrollmentClassId(Long enrollmentClassId) {
		this.enrollmentClassId = enrollmentClassId;
	}
	public Double getMinMark() {
		return minMark;
	}
	public void setMinMark(Double minMark) {
		this.minMark = minMark;
	}
	public Double getMinMark4() {
		return minMark4;
	}
	public void setMinMark4(Double minMark4) {
		this.minMark4 = minMark4;
	}
	public Double getMaxMark() {
		return maxMark;
	}
	public void setMaxMark(Double maxMark) {
		this.maxMark = maxMark;
	}
	
	public Double getMaxMark4() {
		return maxMark4;
	}
	public void setMaxMark4(Double maxMark4) {
		this.maxMark4 = maxMark4;
	}
	public Integer getMaxNumberSubjectNotPass() {
		return maxNumberSubjectNotPass;
	}
	public void setMaxNumberSubjectNotPass(Integer maxNumberSubjectNotPass) {
		this.maxNumberSubjectNotPass = maxNumberSubjectNotPass;
	}
	public Integer getMaxNumberCreditNotPass() {
		return maxNumberCreditNotPass;
	}
	public void setMaxNumberCreditNotPass(Integer maxNumberCreditNotPass) {
		this.maxNumberCreditNotPass = maxNumberCreditNotPass;
	}
	public Boolean getPayFullTuitionFees() {
		return payFullTuitionFees;
	}
	public void setPayFullTuitionFees(Boolean payFullTuitionFees) {
		this.payFullTuitionFees = payFullTuitionFees;
	}
			
	public CourseYearDto getCourseYear() {
		return courseYear;
	}
	public void setCourseYear(CourseYearDto courseYear) {
		this.courseYear = courseYear;
	}
	public EducationProgramDto getEducationProgram() {
		return educationProgram;
	}
	public void setEducationProgram(EducationProgramDto educationProgram) {
		this.educationProgram = educationProgram;
	}
	public Set<CriteriaSearchStudentExceptSubjectDto> getExceptSubjectList() {
		return exceptSubjectList;
	}
	public void setExceptSubjectList(Set<CriteriaSearchStudentExceptSubjectDto> exceptSubjectList) {
		this.exceptSubjectList = exceptSubjectList;
	}
	
	public Long getEducationProgramId() {
		return educationProgramId;
	}
	public void setEducationProgramId(Long educationProgramId) {
		this.educationProgramId = educationProgramId;
	}
	
	public DisciplineDto getDiscipline() {
		return discipline;
	}
	public void setDiscipline(DisciplineDto discipline) {
		this.discipline = discipline;
	}
	public CriteriaSearchStudentDto() {

	}

	public CriteriaSearchStudentDto(CriteriaSearchStudent css) {
		this.id=css.getId();
		this.name=css.getName();
		this.minMark=css.getMinMark();
		this.maxMark=css.getMaxMark();
		this.minMark4=css.getMinMark4();
		this.maxMark4=css.getMaxMark4();
		this.maxNumberSubjectNotPass=css.getMaxNumberSubjectNotPass();
		this.maxNumberCreditNotPass=css.getMaxNumberCreditNotPass();
		if(css.getPayFullTuitionFees()!=null) {
			this.payFullTuitionFees=css.getPayFullTuitionFees();
		}
		if(css.getCourseYear()!=null) {
			this.courseYear=new CourseYearDto();
			this.courseYear.setId(css.getCourseYear().getId());
			this.courseYear.setCode(css.getCourseYear().getCode());
			this.courseYear.setName(css.getCourseYear().getName());
			this.courseYearId=css.getCourseYear().getId();
		}
		if(css.getEducationProgram()!=null) {
			this.educationProgram=new EducationProgramDto();
			this.educationProgram.setId(css.getEducationProgram().getId());
			this.educationProgram.setCode(css.getEducationProgram().getCode());
			this.educationProgram.setName(css.getEducationProgram().getName());
		}
		if (css.getExceptSubjectList() != null && css.getExceptSubjectList().size() > 0) {
			Set<CriteriaSearchStudentExceptSubjectDto> subjects = new HashSet<CriteriaSearchStudentExceptSubjectDto>();
			for (CriteriaSearchStudentExceptSubject tt : css.getExceptSubjectList()) {
				CriteriaSearchStudentExceptSubjectDto ttDto = new CriteriaSearchStudentExceptSubjectDto();
				ttDto.setId(tt.getId());
				if(tt.getSubject()!=null) {
					SubjectDto sub=new SubjectDto(tt.getSubject(),true);
					ttDto.setSubject(sub);
				}
				subjects.add(ttDto);
			}
			this.setExceptSubjectList(subjects);
		}
		if(css.getDiscipline()!=null) {
			this.discipline=new DisciplineDto(css.getDiscipline());
		}
		
	}
	
}
