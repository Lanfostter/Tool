package com.example.tool.edudto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import com.globits.core.dto.DepartmentDto;
import com.globits.education.domain.BehaviorMarkCriteria;
import com.globits.education.domain.Student;
import com.globits.education.domain.StudentBehaviorCriteriaMark;
import com.globits.education.domain.StudentSemesterBehaviorMark;
import com.globits.education.domain.StudentStatusStudentSemester;
import com.globits.education.dto.BehaviorMarkClassificationStandardDto;
import com.globits.education.dto.BehaviorMarkSemesterDto;
import com.globits.education.dto.CourseYearDto;
import com.globits.education.dto.EnrollmentClassDto;
import com.globits.education.dto.SchoolYearDto;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.SpecialityDto;
import com.globits.education.dto.StudentBehaviorCriteriaMarkDto;
import com.globits.education.dto.StudentDto;
import com.globits.education.dto.StudentStatusStudentSemesterDto;
import com.globits.education.utils.MarkUtil;
import com.globits.education.utils.NumberUtils;

public class StudentSemesterBehaviorMarkDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private StudentDto student;
	private SemesterDto semester;
	private Double mark;//Mức điểm rèn luyện (chấm đến 100).
	private String sort;//xếp loại
	private List<StudentBehaviorCriteriaMarkDto> studentBehaviorCriteriaMarks;
	private String code;
	private SchoolYearDto schoolYear;
	private Integer level;
	private Double markConversion;//điểm quy đổi (mark/100). Ví dụ điểm rèn luyện 75 => điểm quy đổi=75/100=0.75
	private BehaviorMarkClassificationStandardDto classification;
	private Double totalMarkStudent;
	private Double totalMarkCVHT;
	private Double totalMarktDepartment;
	private Double totalMarkStudentConvert;
	private Double totalMarkCVHTConvert;
	private Double totalMarktDepartmentConvert;
	private Double totalMarkMax;
	private Integer sortMarkStudent;// Xếp loại điểm sinh viên nhập
	private Integer sortMarkCVHT;// xếp loại điểm của cố vấn học tập nhập
	private Integer sortMarkDep;// Xếp loại điểm Khoa nhập
	private Boolean isLock;//Đã chốt học bổng
	private Boolean isSelected;
	private String departmentName;
	private String specialityName;
	private String enrollmentClassName;
	private String semesterName;
	private String schoolYearName;
	private String courseYearName;
	private Long courseYearId;
	private String note;//ghi chú
	
	private Double mark2;//Mức điểm rèn luyện (chấm đến 100) ky 2
	private String Sort2;//xếp loại kyf 2
	private Integer sortMark2;
	private Double markConversion2;//điểm quy đổi (mark/100). Ví dụ điểm rèn luyện 75 => điểm quy đổi=75/100=0.75
	
	private Double endMark;//Mức điểm rèn luyện (chấm đến 100) ky 2
	private String endSort;//xếp loại kyf 2
	private Integer endSortMark;	
	private Double endYearMarkConversion;//điểm quy đổi (mark/100). Ví dụ điểm rèn luyện 75 => điểm quy đổi=75/100=0.75
	private Double learningMarkSemester;//điểm trung bình học tập
	private Long countSemester = 1L; // Dùng để tính điểm cuối khóa 
	private Double totalMark;
	private BehaviorMarkSemesterDto behaviorMarkSemester;
	private Double markBehavior1_4;
	private Double markBehavior1_5;
	
	public Double getMarkBehavior1_4() {
		return markBehavior1_4;
	}

	public void setMarkBehavior1_4(Double markBehavior1_4) {
		this.markBehavior1_4 = markBehavior1_4;
	}

	public Double getMarkBehavior1_5() {
		return markBehavior1_5;
	}

	public void setMarkBehavior1_5(Double markBehavior1_5) {
		this.markBehavior1_5 = markBehavior1_5;
	}

	public BehaviorMarkSemesterDto getBehaviorMarkSemester() {
		return behaviorMarkSemester;
	}

	public void setBehaviorMarkSemester(BehaviorMarkSemesterDto behaviorMarkSemester) {
		this.behaviorMarkSemester = behaviorMarkSemester;
	}
	
	public Double getTotalMark() {
		return NumberUtils.round(totalMark,0);
//		return totalMark;
	}
	public void setTotalMark(Double totalMark) {
		this.totalMark = totalMark;
	}
	public Long getCountSemester() {
		return countSemester;
	}
	
	public void setCountSemester(Long countSemester) {
		this.countSemester=countSemester;
	}
	
	public Integer getSortMarkStudent() {
		return sortMarkStudent;
	}

	public void setSortMarkStudent(Integer sortMarkStudent) {
		this.sortMarkStudent = sortMarkStudent;
	}

	public Integer getSortMarkCVHT() {
		return sortMarkCVHT;
	}

	public void setSortMarkCVHT(Integer sortMarkCVHT) {
		this.sortMarkCVHT = sortMarkCVHT;
	}

	public Integer getSortMarkDep() {
		return sortMarkDep;
	}

	public void setSortMarkDep(Integer sortMarkDep) {
		this.sortMarkDep = sortMarkDep;
	}

	public Double getTotalMarkMax() {
		return NumberUtils.round(totalMarkMax,0);
//		return totalMarkMax;
	}

	public void setTotalMarkMax(Double totalMarkMax) {
		this.totalMarkMax = totalMarkMax;
	}

	public Double getTotalMarkStudentConvert() {
		if(totalMarkMax != null && totalMarkMax != 0 && totalMarkStudent != null) {
			totalMarkMax=NumberUtils.round(totalMarkMax,0);
			totalMarkStudent=NumberUtils.round(totalMarkStudent,0);
			this.totalMarkStudentConvert = new BigDecimal(totalMarkStudent/this.totalMarkMax).setScale(2, RoundingMode.HALF_UP).doubleValue();
		}
		return totalMarkStudentConvert;
	}

	public void setTotalMarkStudentConvert(double totalMarkStudentConvert) {
		this.totalMarkStudentConvert = totalMarkStudentConvert;
	}

	public Double getTotalMarkCVHTConvert() {
		if(totalMarkMax != null && totalMarkMax != 0 && totalMarkCVHT != null) {
			totalMarkMax=NumberUtils.round(totalMarkMax,0);
			totalMarkCVHT=NumberUtils.round(totalMarkCVHT,0);
			this.totalMarkCVHTConvert = new BigDecimal(totalMarkCVHT/this.totalMarkMax).setScale(2, RoundingMode.HALF_UP).doubleValue();;
		}
		return totalMarkCVHTConvert;
	}

	public void setTotalMarkCVHTConvert(Double totalMarkCVHTConvert) {
		this.totalMarkCVHTConvert = totalMarkCVHTConvert;
	}

	public Double getTotalMarktDepartmentConvert() {
		if(totalMarkMax != null && totalMarkMax != 0 && totalMarktDepartment != null) {
			totalMarkMax=NumberUtils.round(totalMarkMax,0);
			totalMarktDepartment=NumberUtils.round(totalMarktDepartment,0);
			this.totalMarktDepartmentConvert= new BigDecimal(totalMarktDepartment/this.totalMarkMax).setScale(2, RoundingMode.HALF_UP).doubleValue();
		}
		return totalMarktDepartmentConvert;
	}

	public void setTotalMarktDepartmentConvert(Double totalMarktDepartmentConvert) {
		this.totalMarktDepartmentConvert = totalMarktDepartmentConvert;
	}

	public Double getTotalMarkStudent() {
		return NumberUtils.round(totalMarkStudent,0);
//		return totalMarkStudent;
	}

	public void setTotalMarkStudent(Double totalMarkStudent) {
		this.totalMarkStudent = totalMarkStudent;
	}

	public Double getTotalMarkCVHT() {
		return NumberUtils.round(totalMarkCVHT,0);
//		return totalMarkCVHT;
	}

	public void setTotalMarkCVHT(Double totalMarkCVHT) {
		this.totalMarkCVHT = totalMarkCVHT;
	}

	public Double getTotalMarktDepartment() {
		return NumberUtils.round(totalMarktDepartment,0);
//		return totalMarktDepartment;
	}

	public void setTotalMarktDepartment(Double totalMarktDepartment) {
		this.totalMarktDepartment = totalMarktDepartment;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}
	private Integer sortMark;
	
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

	public SemesterDto getSemester() {
		return semester;
	}

	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}

	public String getCourseYearName() {
		return courseYearName;
	}

	public void setCourseYearName(String courseYearName) {
		this.courseYearName = courseYearName;
	}

	public Double getMark() {
		return NumberUtils.round(mark,0);
//		return mark;
	}

	public void setMark(Double mark) {
		this.mark = mark;
	}
	
	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}
	
	public List<StudentBehaviorCriteriaMarkDto> getStudentBehaviorCriteriaMarks() {
		return studentBehaviorCriteriaMarks;
	}

	public void setStudentBehaviorCriteriaMarks(List<StudentBehaviorCriteriaMarkDto> studentBehaviorCriteriaMarks) {
		this.studentBehaviorCriteriaMarks = studentBehaviorCriteriaMarks;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public SchoolYearDto getSchoolYear() {
		return schoolYear;
	}

	public void setSchoolYear(SchoolYearDto schoolYear) {
		this.schoolYear = schoolYear;
	}	

	public Integer getSortMark() {
		return sortMark;
	}

	public BehaviorMarkClassificationStandardDto getClassification() {
		return classification;
	}

	public void setClassification(BehaviorMarkClassificationStandardDto classification) {
		this.classification = classification;
	}

	public void setSortMark(Integer sortMark) {
		this.sortMark = sortMark;
	}	

	public Double getMarkConversion() {
		return NumberUtils.round(markConversion,2);
//		return markConversion;
	}

	public void setMarkConversion(Double markConversion) {
		this.markConversion = markConversion;
	}	

	public Boolean getIsLock() {
		return isLock;
	}

	public void setIsLock(Boolean isLock) {
		this.isLock = isLock;
	}

	public Boolean getIsSelected() {
		return isSelected;
	}

	public void setIsSelected(Boolean isSelected) {
		this.isSelected = isSelected;
	}	

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getSpecialityName() {
		return specialityName;
	}

	public void setSpecialityName(String specialityName) {
		this.specialityName = specialityName;
	}

	public String getEnrollmentClassName() {
		return enrollmentClassName;
	}

	public void setEnrollmentClassName(String enrollmentClassName) {
		this.enrollmentClassName = enrollmentClassName;
	}	

	public Long getCourseYearId() {
		return courseYearId;
	}

	public void setCourseYearId(Long courseYearId) {
		this.courseYearId = courseYearId;
	}	

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getSemesterName() {
		return semesterName;
	}

	public void setSemesterName(String semesterName) {
		this.semesterName = semesterName;
	}

	public String getSchoolYearName() {
		return schoolYearName;
	}

	public void setSchoolYearName(String schoolYearName) {
		this.schoolYearName = schoolYearName;
	}
	
	public Double getMark2() {
		return mark2;
	}

	public void setMark2(Double mark2) {
		this.mark2 = mark2;
	}

	public String getSort2() {
		return Sort2;
	}

	public void setSort2(String sort2) {
		Sort2 = sort2;
	}

	public Integer getSortMark2() {
		return sortMark2;
	}

	public void setSortMark2(Integer sortMark2) {
		this.sortMark2 = sortMark2;
	}

	public Double getEndMark() {
		return endMark;
	}

	public void setEndMark(Double endMark) {
		this.endMark = endMark;
	}

	public String getEndSort() {
		return endSort;
	}

	public void setEndSort(String endSort) {
		this.endSort = endSort;
	}

	public Integer getEndSortMark() {
		return endSortMark;
	}

	public void setEndSortMark(Integer endSortMark) {
		this.endSortMark = endSortMark;
	}

	public void setTotalMarkStudentConvert(Double totalMarkStudentConvert) {
		this.totalMarkStudentConvert = totalMarkStudentConvert;
	}
	
	public Double getMarkConversion2() {
		return NumberUtils.round(markConversion2,2);
//		return markConversion2;
	}

	public void setMarkConversion2(Double markConversion2) {
		this.markConversion2 = markConversion2;
	}

	public Double getEndYearMarkConversion() {
		return endYearMarkConversion;
	}

	public void setEndYearMarkConversion(Double endYearMarkConversion) {
		this.endYearMarkConversion = endYearMarkConversion;
	}

	public Double getLearningMarkSemester() {
		return NumberUtils.round(learningMarkSemester,2);
//		return learningMarkSemester;
	}

	public void setLearningMarkSemester(Double learningMarkSemester) {
		this.learningMarkSemester = learningMarkSemester;
	}

	public StudentSemesterBehaviorMarkDto() {

	}

	public StudentSemesterBehaviorMarkDto(StudentSemesterBehaviorMark domain) {
		this.id = domain.getId();
		this.mark = domain.getMark();
		this.level = domain.getLevel();
		this.sortMark=domain.getSortMark();
		this.markConversion=domain.getMarkConversion();
		this.note=domain.getNote();
		if(domain!=null && domain.getIsLock()!=null)
		this.isLock=domain.getIsLock();
		if(domain.getStudent() != null) {
			this.student = new StudentDto();
			this.student.setId(domain.getStudent().getId());
			this.student.setDisplayName(domain.getStudent().getDisplayName());
			this.student.setStudentCode(domain.getStudent().getStudentCode());
			if(domain.getStudent().getEnrollmentClass() != null) {
				this.student.setEnrollmentClass(new EnrollmentClassDto());
				this.student.getEnrollmentClass().setId(student.getEnrollmentClass().getId());
				this.student.getEnrollmentClass().setClassName(student.getEnrollmentClass().getClassName());
				this.enrollmentClassName=student.getEnrollmentClass().getClassName();
				if(student.getEnrollmentClass().getSpeciality()!=null && student.getEnrollmentClass().getSpeciality().getName()!=null) {
					this.student.setSpeciality(student.getEnrollmentClass().getSpeciality().getName());
					this.specialityName=student.getEnrollmentClass().getSpeciality().getName();
				}
				
				if(student.getEnrollmentClass().getDepartment()!=null && student.getEnrollmentClass().getDepartment().getName()!=null) {
					this.student.setDepartment(student.getEnrollmentClass().getDepartment().getName());
					this.departmentName=student.getEnrollmentClass().getDepartment().getName();
				}
					
				if(student.getEnrollmentClass().getCourseyear()!=null && student.getEnrollmentClass().getCourseyear().getName()!=null)
					this.student.setCourseYear(student.getEnrollmentClass().getCourseyear().getName());
			}
		}
		if(domain.getSemester() != null) {
			this.semester = new SemesterDto();
			this.semester.setId(domain.getSemester().getId());
			this.semester.setSemesterName(domain.getSemester().getSemesterName());
			this.semester.setSemesterCode(domain.getSemester().getSemesterCode());
		}
		if(domain.getSchoolYear() != null) {
			this.schoolYear = new SchoolYearDto();
			this.schoolYear.setId(domain.getSchoolYear().getId());
			this.schoolYear.setName(domain.getSchoolYear().getName());
			this.schoolYear.setCode(domain.getSchoolYear().getCode());
		}
		if(domain.getClassification()!=null) {
			this.classification = new BehaviorMarkClassificationStandardDto();
			this.classification.setId(domain.getClassification().getId());			
			this.classification.setClassification(domain.getClassification().getClassification());
			this.sort=MarkUtil.convertClassificationToString(domain.getClassification().getClassification());
		}
		
		if(domain.getStudentBehaviorCriteriaMarks() != null && domain.getStudentBehaviorCriteriaMarks().size() > 0) {
			List<StudentBehaviorCriteriaMarkDto> dtos = new ArrayList<StudentBehaviorCriteriaMarkDto>();
			this.studentBehaviorCriteriaMarks = new ArrayList<StudentBehaviorCriteriaMarkDto>();
			for (StudentBehaviorCriteriaMark studentBehaviorCriteriaMark : domain.getStudentBehaviorCriteriaMarks()) {
				if(studentBehaviorCriteriaMark != null) {
					dtos.add(new StudentBehaviorCriteriaMarkDto(studentBehaviorCriteriaMark));
					if(studentBehaviorCriteriaMark.getBehaviorMarkCriteria() != null) {
						this.code = studentBehaviorCriteriaMark.getBehaviorMarkCriteria().getCode();
					}
					
					
					if(studentBehaviorCriteriaMark.getMark() != null) {
						if(this.totalMarkStudent == null) {
							this.totalMarkStudent = studentBehaviorCriteriaMark.getMark().doubleValue();
						}else
						this.totalMarkStudent += studentBehaviorCriteriaMark.getMark().doubleValue();
						this.totalMarkStudent = NumberUtils.round(this.totalMarkStudent,0);
					}
					if(studentBehaviorCriteriaMark.getMark_teacher() != null && studentBehaviorCriteriaMark.getBehaviorMarkCriteria() != null && studentBehaviorCriteriaMark.getBehaviorMarkCriteria().getParent() != null) {
						if(this.totalMarkCVHT == null) {
							this.totalMarkCVHT = studentBehaviorCriteriaMark.getMark_teacher().doubleValue();
						}else
						this.totalMarkCVHT += studentBehaviorCriteriaMark.getMark_teacher().doubleValue();
						this.totalMarkCVHT = NumberUtils.round(this.totalMarkCVHT,0);
					}
					if(studentBehaviorCriteriaMark.getMark_department_managerment() != null && studentBehaviorCriteriaMark.getBehaviorMarkCriteria().getParent() != null) {
						if(this.totalMarktDepartment == null) {
							this.totalMarktDepartment = studentBehaviorCriteriaMark.getMark_department_managerment().doubleValue();
						}else
						this.totalMarktDepartment += studentBehaviorCriteriaMark.getMark_department_managerment().doubleValue();
						this.totalMarktDepartment = NumberUtils.round(this.totalMarktDepartment,0);
					}
					
				}
				
			}
			this.studentBehaviorCriteriaMarks.addAll(dtos);
		}
		if(domain.getLevel()==null||(domain.getLevel()!=null && domain.getLevel()<3)) {
			//nếu cấp khoa chưa chấm thì coi điểm cuối chưa có gì
			this.mark=null;
			this.classification=null;
			this.sortMark=null;
			this.markConversion=null;
		}
	}
	
	public StudentSemesterBehaviorMarkDto(StudentSemesterBehaviorMark domain,Student student) {
		if(student != null) {
			this.student = new StudentDto();
			this.student.setId(student.getId());
			this.student.setDisplayName(student.getDisplayName());
			this.student.setStudentCode(student.getStudentCode());
			this.student.setBirthDate(student.getBirthDate());
			this.student.setGender(student.getGender());	
			if(student.getStudentStatus()!=null && student.getStudentStatus().getName()!=null) {
				this.student.setStatusName(student.getStudentStatus().getName());
			}else {
				this.student.setStatusName("Đang học");
			}
			if(student.getStudentStatusStudentSemesters()!=null && student.getStudentStatusStudentSemesters().size()>0) {
				this.student.setStudentStatusStudentSemesters( new HashSet<StudentStatusStudentSemesterDto>());
				Iterator<StudentStatusStudentSemester> iters = student.getStudentStatusStudentSemesters().iterator();
				while (iters.hasNext()) {
					this.student.getStudentStatusStudentSemesters().add(new StudentStatusStudentSemesterDto(iters.next()));
				}
			}
			if(student.getEnrollmentClass() != null) {
				this.student.setEnrollmentClass(new EnrollmentClassDto());
				this.student.getEnrollmentClass().setId(student.getEnrollmentClass().getId());
				this.student.getEnrollmentClass().setClassName(student.getEnrollmentClass().getClassName());
				this.enrollmentClassName=student.getEnrollmentClass().getClassName();
				this.student.setClassCode(student.getEnrollmentClass().getClassCode());
				if(student.getEnrollmentClass().getSpeciality()!=null && student.getEnrollmentClass().getSpeciality().getName()!=null) {
					this.student.setSpeciality(student.getEnrollmentClass().getSpeciality().getName());
					this.specialityName=student.getEnrollmentClass().getSpeciality().getName();
				}
				
				if(student.getEnrollmentClass().getDepartment()!=null && student.getEnrollmentClass().getDepartment().getName()!=null) {
					this.student.setDepartment(student.getEnrollmentClass().getDepartment().getName());
					this.departmentName=student.getEnrollmentClass().getDepartment().getName();
				}
					
				if(student.getEnrollmentClass().getCourseyear()!=null ) {
					this.courseYearId=student.getEnrollmentClass().getCourseyear().getId();
					this.courseYearName = student.getEnrollmentClass().getCourseyear().getName();
					this.student.setCourseYear(student.getEnrollmentClass().getCourseyear().getName());
				}
				this.schoolYearName = student.getEnrollmentClass().getSchoolYear()+"";
					
			}
		}
		
		if(domain != null) {
			this.id = domain.getId();
			this.mark = domain.getMark();
			this.sortMark=domain.getSortMark();
			this.markConversion=domain.getMarkConversion();
			if(domain.getIsLock()!=null)
				this.isLock=domain.getIsLock();
			this.note=domain.getNote();
			if(domain.getSemester() != null) {
				this.semester = new SemesterDto();
				this.semester.setId(domain.getSemester().getId());
				this.semester.setSemesterName(domain.getSemester().getSemesterName());
				this.semester.setSemesterCode(domain.getSemester().getSemesterCode());
				this.semesterName = domain.getSemester().getSemesterName();
				this.semester.setOrdinalNumbers(domain.getSemester().getOrdinalNumbers());
			}
			if(domain.getSchoolYear() != null) {
				this.schoolYear = new SchoolYearDto();
				this.schoolYear.setId(domain.getSchoolYear().getId());
				this.schoolYear.setName(domain.getSchoolYear().getName());
				this.schoolYear.setCode(domain.getSchoolYear().getCode());
			}
			if(domain.getClassification()!=null) {
				this.classification = new BehaviorMarkClassificationStandardDto();
				this.classification.setId(domain.getClassification().getId());			
				this.classification.setClassification(domain.getClassification().getClassification());
				this.sort=MarkUtil.convertClassificationToString(domain.getClassification().getClassification());
			}
			Hashtable<Long, BehaviorMarkCriteria> hashBeahviorMark = new Hashtable<Long, BehaviorMarkCriteria>();
			if(domain.getStudentBehaviorCriteriaMarks() != null && domain.getStudentBehaviorCriteriaMarks().size() > 0) {
				List<StudentBehaviorCriteriaMarkDto> dtos = new ArrayList<StudentBehaviorCriteriaMarkDto>();
				this.studentBehaviorCriteriaMarks = new ArrayList<StudentBehaviorCriteriaMarkDto>();
				for (StudentBehaviorCriteriaMark studentBehaviorCriteriaMark : domain.getStudentBehaviorCriteriaMarks()) {
					if(studentBehaviorCriteriaMark != null) {
						dtos.add(new StudentBehaviorCriteriaMarkDto(studentBehaviorCriteriaMark));
						if(studentBehaviorCriteriaMark.getBehaviorMarkCriteria() != null) {
							this.code = studentBehaviorCriteriaMark.getBehaviorMarkCriteria().getCode();
							if(studentBehaviorCriteriaMark.getBehaviorMarkCriteria().getParent()!=null&& studentBehaviorCriteriaMark.getBehaviorMarkCriteria().getParent().getId()!=null) {
								BehaviorMarkCriteria bmc=hashBeahviorMark.get(studentBehaviorCriteriaMark.getBehaviorMarkCriteria().getParent().getId());
								if(bmc==null) {
									if(this.totalMarkMax==null) {
										this.totalMarkMax=0D;
									}
									if(studentBehaviorCriteriaMark.getBehaviorMarkCriteria().getParent().getMark()!=null)
									this.totalMarkMax=this.totalMarkMax+studentBehaviorCriteriaMark.getBehaviorMarkCriteria().getParent().getMark();
									hashBeahviorMark.put(studentBehaviorCriteriaMark.getBehaviorMarkCriteria().getParent().getId(), studentBehaviorCriteriaMark.getBehaviorMarkCriteria().getParent());
								}
							}
						}
						
						if(studentBehaviorCriteriaMark.getMark() != null) {
							if(this.totalMarkStudent==null) {
								this.totalMarkStudent = studentBehaviorCriteriaMark.getMark();
							}else
								this.totalMarkStudent += studentBehaviorCriteriaMark.getMark();
						}
						if(studentBehaviorCriteriaMark.getMark_teacher() != null) {
							if(this.totalMarkCVHT==null) {
								this.totalMarkCVHT = studentBehaviorCriteriaMark.getMark_teacher();
							}else
								this.totalMarkCVHT += studentBehaviorCriteriaMark.getMark_teacher();
						}
						if(studentBehaviorCriteriaMark.getMark_department_managerment() != null) {
							if(this.totalMarktDepartment==null) {
								this.totalMarktDepartment = studentBehaviorCriteriaMark.getMark_department_managerment();
							}else
								this.totalMarktDepartment += studentBehaviorCriteriaMark.getMark_department_managerment();
						}
						
					}
					
				}
				this.studentBehaviorCriteriaMarks.addAll(dtos);
				Collections.sort(this.studentBehaviorCriteriaMarks, new Comparator<StudentBehaviorCriteriaMarkDto>() {
					@Override
					public int compare(StudentBehaviorCriteriaMarkDto o1, StudentBehaviorCriteriaMarkDto o2) {
						// TODO Auto-generated method stub
						int c;
					    c = o1.getId().compareTo(o2.getId());
					    Integer code1 = 0;
					    Integer code2 = 0;
					    try {
					    	code1 = Integer.parseInt(o1.getBehaviorMarkCriteria().getCode());
						} catch (Exception e) {
							// TODO: handle exception
						}
					    try {
					    	code2 = Integer.parseInt(o2.getBehaviorMarkCriteria().getCode());
						} catch (Exception e) {
							// TODO: handle exception
						}
					    if (c == 0)
					       c = code1.compareTo(code2);
					    return c;								
					}
				});
			}
			if(domain.getLevel()==null||(domain.getLevel()!=null && domain.getLevel()<3)) {
				//nếu cấp khoa chưa chấm thì coi điểm cuối chưa có gì
				this.mark=null;
				this.classification=null;
				this.sortMark=null;
				this.markConversion=null;
			}
		}
	}	
	public StudentSemesterBehaviorMarkDto(Student student, Double totalMark, Long countSemester) {
		if(student != null) {
			this.totalMark = totalMark;
			this.countSemester =countSemester;
			this.student = new StudentDto();
			this.student.setId(student.getId());
			this.student.setDisplayName(student.getDisplayName());
			this.student.setStudentCode(student.getStudentCode());
			this.student.setBirthDate(student.getBirthDate());
			this.student.setGender(student.getGender());			
			if(student.getEnrollmentClass() != null) {
				this.student.setEnrollmentClass(new EnrollmentClassDto());
				this.student.getEnrollmentClass().setId(student.getEnrollmentClass().getId());
				this.student.getEnrollmentClass().setClassName(student.getEnrollmentClass().getClassName());
				this.student.getEnrollmentClass().setCourseyear(new CourseYearDto(student.getEnrollmentClass().getCourseyear()));
				this.student.getEnrollmentClass().setDepartment(new DepartmentDto(student.getEnrollmentClass().getDepartment()));;
				this.student.getEnrollmentClass().setSpeciality(new SpecialityDto(student.getEnrollmentClass().getSpeciality()));;
				this.enrollmentClassName=student.getEnrollmentClass().getClassName();
				this.student.setClassCode(student.getEnrollmentClass().getClassCode());
				if(student.getEnrollmentClass().getSpeciality()!=null && student.getEnrollmentClass().getSpeciality().getName()!=null) {
					this.student.setSpeciality(student.getEnrollmentClass().getSpeciality().getName());
					this.specialityName=student.getEnrollmentClass().getSpeciality().getName();
				}
				
				if(student.getEnrollmentClass().getDepartment()!=null && student.getEnrollmentClass().getDepartment().getName()!=null) {
					this.student.setDepartment(student.getEnrollmentClass().getDepartment().getName());
					this.departmentName=student.getEnrollmentClass().getDepartment().getName();
				}
					
				if(student.getEnrollmentClass().getCourseyear()!=null ) {
					this.courseYearId=student.getEnrollmentClass().getCourseyear().getId();
					this.courseYearName = student.getEnrollmentClass().getCourseyear().getName();
					this.student.setCourseYear(student.getEnrollmentClass().getCourseyear().getName());
				}
				this.schoolYearName = student.getEnrollmentClass().getSchoolYear()+"";
					
			}
		}
	}	

}
