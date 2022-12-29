package com.example.tool.edudto;

import java.io.Serializable;

import com.globits.education.domain.SemesterSubject;
import com.globits.education.domain.SubjectExam;
import com.globits.education.domain.TrainingBaseSemesterSubject;
import com.globits.education.dto.CourseSubjectDto;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.SemesterSubjectDto;
import com.globits.education.dto.SubjectDto;
import com.globits.education.dto.SubjectExamTypeDto;

public class SubjectExamDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String code;
	private SubjectDto subject;
	private double coefficient;
	private Integer inputMarkType;// =0 tự nhập, =1 là tính toán
	private Integer examType;
	private SemesterSubjectDto semesterSubject;
	private String subjectExamName;
	private Integer type;//loại điểm =1: kiểm tra,=2: quá trình; =3 điểm thi
	private String semesterName;
	private SubjectExamTypeDto subjectExamType;
	private Integer coffi;//hệ số theo số nguyên 30,40,...
	private CourseSubjectDto courseSubject;
	private Boolean voided;
	private Long nodeId;
	private Integer nodeType;
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

	public double getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(double coefficient) {
		this.coefficient = coefficient;
	}

	public Integer getInputMarkType() {
		return inputMarkType;
	}

	public void setInputMarkType(Integer inputMarkType) {
		this.inputMarkType = inputMarkType;
	}

	public Integer getExamType() {
		return examType;
	}

	public void setExamType(Integer examType) {
		this.examType = examType;
	}
	
	public SemesterSubjectDto getSemesterSubject() {
		return semesterSubject;
	}

	public void setSemesterSubject(SemesterSubjectDto semesterSubject) {
		this.semesterSubject = semesterSubject;
	}	

	public String getSubjectExamName() {
		return subjectExamName;
	}

	public void setSubjectExamName(String subjectExamName) {
		this.subjectExamName = subjectExamName;
	}
	
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}	

	public String getSemesterName() {
		return semesterName;
	}

	public void setSemesterName(String semesterName) {
		this.semesterName = semesterName;
	}	

	public SubjectExamTypeDto getSubjectExamType() {
		return subjectExamType;
	}

	public void setSubjectExamType(SubjectExamTypeDto subjectExamType) {
		this.subjectExamType = subjectExamType;
	}	

	public Integer getCoffi() {
		return coffi;
	}

	public void setCoffi(Integer coffi) {
		this.coffi = coffi;
	}	

	public CourseSubjectDto getCourseSubject() {
		return courseSubject;
	}

	public void setCourseSubject(CourseSubjectDto courseSubject) {
		this.courseSubject = courseSubject;
	}	
	public Boolean getVoided() {
		return voided;
	}

	public void setVoided(Boolean voided) {
		this.voided = voided;
	}	

	public Long getNodeId() {
		return nodeId;
	}

	public void setNodeId(Long nodeId) {
		this.nodeId = nodeId;
	}

	public Integer getNodeType() {
		return nodeType;
	}

	public void setNodeType(Integer nodeType) {
		this.nodeType = nodeType;
	}

	public SubjectExamDto() {

	}

	public SubjectExamDto(SubjectExam se) {
		this.id = se.getId();
		this.code = se.getCode();
		this.name = se.getName();
		this.coefficient = se.getCoefficient();
		this.coffi=(int)(se.getCoefficient()*100);
		this.inputMarkType = se.getInputMarkType();
		this.examType = se.getExamType();
		
		if(se.getSubject()!=null) {
			this.subject = new SubjectDto();
			this.subject.setSubjectCode(se.getSubject().getSubjectCode());
			this.subject.setSubjectName(se.getSubject().getSubjectName());
			this.subject.setId(se.getSubject().getId());
		}
		if(se.getSemesterSubject()!=null) {
			this.semesterSubject = new SemesterSubjectDto();
			this.semesterSubject.setSemester(new SemesterDto(se.getSemesterSubject().getSemester()));
			this.semesterSubject.setSubject(new SubjectDto(se.getSemesterSubject().getSubject()));
			String name="";
			if(se.getSemesterSubject().getSubjectName()!=null) {
				this.semesterSubject.setSubjectName(se.getSemesterSubject().getSubjectName());
				if(name!=null && name.length()>0) {
					name=name+"_" + se.getSemesterSubject().getSubjectName();
				}else {
					name=se.getSemesterSubject().getSubjectName();
				}
			}else if(se.getSemesterSubject().getSubject()!=null) {
				this.semesterSubject.setSubjectName(se.getSemesterSubject().getSubject().getSubjectName());
				if(name!=null && name.length()>0) {
					name=name+"_" + se.getSemesterSubject().getSubject().getSubjectName();
				}else {
					name=se.getSemesterSubject().getSubject().getSubjectName();
				}
			}
			if(se.getSemesterSubject().getSemesterName()!=null) {
				this.semesterSubject.setSemesterName(se.getSemesterSubject().getSemesterName());
				if(name!=null && name.length()>0) {
					name=name+"_" + se.getSemesterSubject().getSemesterName();
				}else
				name=se.getSemesterSubject().getSemesterName();
			}else if(se.getSemesterSubject().getSemester()!=null) {
				this.semesterSubject.setSemesterName(se.getSemesterSubject().getSemester().getSemesterName());
				if(name!=null && name.length()>0) {
					name=name+"_" + se.getSemesterSubject().getSemester().getSemesterName();
				}else
				name=se.getSemesterSubject().getSemester().getSemesterName();
			}
			
			this.semesterSubject.setName(name);
			this.semesterSubject.setMaxNumberStudentPerChildCourse(se.getSemesterSubject().getMaxNumberStudentPerChildCourse());
			this.semesterSubject.setMaxNumberStudentPerParentCourse(se.getSemesterSubject().getMaxNumberStudentPerParentCourse());
			this.semesterSubject.setMinNumberStudentPerChildCourse(se.getSemesterSubject().getMinNumberStudentPerChildCourse());
			this.semesterSubject.setMinNumberStudentPerParentCourse(se.getSemesterSubject().getMinNumberStudentPerParentCourse());
			this.semesterSubject.setId(se.getSemesterSubject().getId());
			this.semesterName=se.getSemesterSubject().getSemester().getSemesterName();
		}
		if(se.getSubjectExamType()!=null) {
			this.subjectExamType=new SubjectExamTypeDto();
			this.subjectExamType.setId(se.getSubjectExamType().getId());
			this.subjectExamType.setName(se.getSubjectExamType().getName());
			this.subjectExamType.setCode(se.getSubjectExamType().getCode());
			this.subjectExamType.setType(se.getSubjectExamType().getType());
		}
		if(se.getVoided()!=null) {
			this.voided=se.getVoided();
		}
		if(se.getCourseSubject()!=null) {
			CourseSubjectDto csDto=new CourseSubjectDto();
			csDto.setId(se.getCourseSubject().getId());
			csDto.setShortCode(se.getCourseSubject().getShortCode());
			csDto.setDisplayName(se.getCourseSubject().getDisplayName());
			csDto.setCheck(true);
			this.courseSubject=csDto;
		}
		
	}
	public SubjectExamDto(SubjectExam se , Boolean collapse) {
		if(se!=null) {
			this.id = se.getId();
			this.code = se.getCode();
			this.name = se.getName();
			this.coefficient = se.getCoefficient();
			this.coffi=(int)(se.getCoefficient()*100);
			this.inputMarkType = se.getInputMarkType();
			this.examType = se.getExamType();
//			if(se.getSubject()!=null) {
//				this.subject = new SubjectDto();
//				this.subject.setSubjectCode(se.getSubject().getSubjectCode());
//				this.subject.setSubjectName(se.getSubject().getSubjectName());
//				this.subject.setId(se.getSubject().getId());
//			}
			if(se.getSemesterSubject()!=null) {
				this.semesterSubject = new SemesterSubjectDto();
				this.semesterSubject.setId(se.getSemesterSubject().getId());
				this.subjectExamName="";
//				this.semesterSubject = new SemesterSubjectDto();
				 if(se.getSemesterSubject().getSemester()!=null) {
					this.subjectExamName=" Học kỳ "+ se.getSemesterSubject().getSemester().getSemesterCode();
//					this.semesterSubject.setSemesterName(se.getSemesterSubject().getSemester().getSemesterName());
				}
				if(se.getSemesterSubject().getRegisterPeriod()!=null){
					if(this.subjectExamName!=null && this.subjectExamName.length()>0) {
						this.subjectExamName=this.subjectExamName+ " - Đợt học "+se.getSemesterSubject().getRegisterPeriod().getName();
					}else {
						this.subjectExamName="Đợt học "+se.getSemesterSubject().getRegisterPeriod().getName();
					}
//					this.semesterSubject.setRegisterPeriodName(se.getSemesterSubject().getRegisterPeriod().getName());
				}
				if(se.getSemesterSubject().getCourseyear()!=null) {
					if(this.subjectExamName!=null && this.subjectExamName.length()>0) {
						this.subjectExamName=this.subjectExamName+ " - Khóa "+se.getSemesterSubject().getCourseyear().getCode();
					}else {
						this.subjectExamName="Khóa "+se.getSemesterSubject().getCourseyear().getCode();
					}
				}
				if(se.getSemesterSubject().getTrainingBaseSemesterSubjects()!=null && se.getSemesterSubject().getTrainingBaseSemesterSubjects().size()>0) {
					if(subjectExamName!=null && subjectExamName.length()>0) {
						subjectExamName=subjectExamName+ " - Cơ sở ";
					}else {
						subjectExamName="Cơ sở ";
					}
					String cs=null;
					for (TrainingBaseSemesterSubject tbss : se.getSemesterSubject().getTrainingBaseSemesterSubjects()) {
						if(cs==null) {
							cs = tbss.getTrainingBase().getCode();
						}else {
							cs =cs + ", "+ tbss.getTrainingBase().getCode();
						}
						
					}
					subjectExamName=subjectExamName+cs;
				}
			}
			if(se.getSubjectExamType()!=null) {
				this.subjectExamType=new SubjectExamTypeDto();
				this.subjectExamType.setId(se.getSubjectExamType().getId());
				this.subjectExamType.setName(se.getSubjectExamType().getName());
				this.subjectExamType.setCode(se.getSubjectExamType().getCode());
				this.subjectExamType.setType(se.getSubjectExamType().getType());
			}
			if(se.getVoided()!=null) {
				this.voided=se.getVoided();
			}
			if(se.getCourseSubject()!=null) {
				CourseSubjectDto csDto=new CourseSubjectDto();
				csDto.setId(se.getCourseSubject().getId());
				csDto.setShortCode(se.getCourseSubject().getShortCode());
				csDto.setDisplayName(se.getCourseSubject().getDisplayName());
				this.courseSubject=csDto;
			}
		}		
	}
	public SubjectExamDto(SubjectExam se , int collapse) {
		if(se!=null) {
			this.id = se.getId();
			this.code = se.getCode();
			this.name = se.getName();
			this.coefficient = se.getCoefficient();
			this.coffi=(int)(se.getCoefficient()*100);
			this.inputMarkType = se.getInputMarkType();
			this.examType = se.getExamType();
		}
	}
}
