package com.example.tool.edudto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.globits.education.domain.Subject;
import com.globits.education.domain.SubjectExam;
import com.globits.education.dto.CourseSubjectDto;
import com.globits.education.dto.SemesterSubjectDto;
import com.globits.education.dto.SortSubjectExamDto;
import com.globits.education.dto.SubjectDto;
import com.globits.education.dto.SubjectExamDto;

class SortSubjectExamDto implements Comparator<SubjectExamDto> 
{ 
  // Used for sorting in ascending order of 
  // roll number 
  public int compare(SubjectExamDto a, SubjectExamDto b) 
  { 
	  if(a.getCoffi()!=null && b.getCoffi()!=null) {
		  return a.getCoffi() - b.getCoffi(); 
	  }else {
		  return 0;
	  }
      
  } 
} 
public class FormulaSubjectExamDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String code;
	private SubjectDto subject;
	private boolean isSelected;
	
	private SemesterSubjectDto semesterSubject;
	
	private CourseSubjectDto courseSubject;

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

	public SubjectDto getSubject() {
		return subject;
	}

	public void setSubject(SubjectDto subject) {
		this.subject = subject;
	}

	public SemesterSubjectDto getSemesterSubject() {
		return semesterSubject;
	}

	public void setSemesterSubject(SemesterSubjectDto semesterSubject) {
		this.semesterSubject = semesterSubject;
	}

	public CourseSubjectDto getCourseSubject() {
		return courseSubject;
	}

	public void setCourseSubject(CourseSubjectDto courseSubject) {
		this.courseSubject = courseSubject;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}	
	public FormulaSubjectExamDto() {

	}
	public FormulaSubjectExamDto(Subject subject) {
		String code="";
		String name="";
		this.subject=new SubjectDto();
		this.subject.setId(subject.getId());
		this.subject.setSubjectCode(subject.getSubjectCode());
		this.subject.setSubjectName(subject.getSubjectName());
		this.subject.setNumberOfCredit(subject.getNumberOfCredit());
		this.subject.setIsCalculateMark(subject.getIsCalculateMark());
		if(subject.getDepartment()!=null) {
			this.subject.setDepartmentName(subject.getDepartment().getName());
			this.subject.setDepartmentCode(subject.getDepartment().getCode());
		}
		this.subject.setTotalSubjectName(subject.getSubjectName()+ " - "+ subject.getNumberOfCredit()+ " - "+subject.getSubjectCode());
		if (subject.getExams() != null && subject.getExams().size() > 0) {
			
			 List<SubjectExamDto> exams = new ArrayList<SubjectExamDto>();
			for (SubjectExam ex : subject.getExams()) {
				SubjectExamDto exDto = new SubjectExamDto();
				exDto.setCode(ex.getCode());
				exDto.setName(ex.getName());
				exDto.setId(ex.getId());
				exDto.setCoefficient(ex.getCoefficient());
				exDto.setCoffi((int)(ex.getCoefficient()*100));
				exDto.setInputMarkType(ex.getInputMarkType());
				exDto.setExamType(ex.getExamType());
				exams.add(exDto);				
			}	 
			this.subject.setExams(new ArrayList<SubjectExamDto>());
			if(exams!=null && exams.size()>0) {
				Collections.sort(exams, new SortSubjectExamDto());
				this.subject.setExams(exams);
				for(SubjectExamDto seDto:exams) {
					if(code!=null && code.length()>0) {
						code = code+ " + "+ seDto.getCoffi() +"%*"+seDto.getCode();
					}else {
						code = seDto.getCoffi() +"%*"+seDto.getCode();
					}
					if(name!=null && name.length()>0) {
						name = name+ " + "+ seDto.getCoffi() +"%*"+seDto.getName();
					}else {
						name = seDto.getCoffi() +"%*"+seDto.getName();
					}
				}
			}			
			this.setName(name);
			this.setCode(code);
		}
	}
}
