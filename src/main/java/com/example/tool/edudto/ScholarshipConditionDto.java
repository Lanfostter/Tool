package com.example.tool.edudto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.globits.core.domain.Department;
import com.globits.core.domain.Discipline;
import com.globits.core.dto.DepartmentDto;
import com.globits.core.dto.DisciplineDto;
import com.globits.education.domain.CourseYear;
import com.globits.education.domain.EnrollmentClass;
import com.globits.education.domain.ScholarshipCondition;
import com.globits.education.domain.ScholarshipFund;
import com.globits.education.domain.Semester;
import com.globits.education.domain.Speciality;
import com.globits.education.domain.StudentObject;
import com.globits.education.dto.CourseYearDto;
import com.globits.education.dto.EnrollmentClassDto;
import com.globits.education.dto.ScholarshipFundDto;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.SpecialityDto;
import com.globits.education.dto.StudentObjectDto;
import com.globits.education.utils.EducationConstant;

public class ScholarshipConditionDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	
	private Integer level;//mức
	private Double amount;// phần trăm số tiền học phí
	private SemesterDto semester;//học kỳ	
	private CourseYearDto courseyear;//Dành cho khóa học 
	private SpecialityDto speciality;//ngành
	private EnrollmentClassDto enrollmentClass; // Lớp nhập học
	private DepartmentDto department;//Dành cho khoa 
	private ScholarshipFundDto scholarshipFund; //Quỹ học bổng
		
	private Double mark4;//điểm học tập 4	
	private Double mark10;//điểm học tập hệ 10	
	private Double markChar;//điểm học tập điểm chữ
	private String markCompare;// dấu so sánh điểm học tập
	private Boolean checkFullSchoolYearMark;//  điểm học tập cả năm=true
	private String markType;
	private Double mark;//điểm học tập 	
	

	private Double  behaviourMark;//điểm rèn luyện
	private String behaviourMarkCompare;// dấu so sánh điểm rèn luyện
	private Boolean checkPreYearmark;//  điểm học rèn luyện năm trước
	private Boolean checkYearMark;//  điểm học rèn luyện năm nay
	
	private Double markExtend;//điểm tb mở rộng
	private String markExtendCompare;// dấu so sánh điểm học tập mở rộng
	
	private Integer numberSubjectFailed;//số môn không đạt
	private String numberSubjectFailedCompare;// dấu so sánh số môn không đạt
	private Boolean checkFullYearNumberSubjectFailed;//  số môn không đạt cả năm=true
	private Boolean checkSubjectNotCounted;//  Xét học phần không tính điểm
	
	private Double minMark4;//điểm học phần tối thiểu hệ 4
	private Double minMark10;//điểm học phần tối thiểu hệ 10
	private Double minMarkChar;//điểm học phần tối thiểu điểm chữ
	private String minMarkCompare;// dấu so sánh điểm tối thiểu
	private Boolean checkFullYearMinMark;//  điểm tối thiểu cả năm=true
	private Boolean checkSubjectNotCountedMinMark;//  Xét học phần không tính điểm
	private String minMarkType;
	private Double minMark;//điểm học phần tối thiểu hệ 
		
	private Integer numberSubjectNotExam;//số môn vắng thi
	private String numberSubjectNotExamCompare;// dấu so sánh số môn vắng thi
	private Boolean checkSubjectNotMark;//  Môn không tính điểm nếu =true thì(+ mônKTĐ)
	
	private Double certificateMark4;//điểm chứng chỉ hệ 4
	private Double certificateMark10;//điểm chứng chỉ hệ 10
	private Double certificateMarkChar;//điểm chứng chỉ điểm chữ
	private String certificateMarkCompare;// dấu so sánh điểm học tập
	private Boolean checkFullYearCertificateMark;//  điểm học tập cả năm=true
	private String certificateMarkType;
	private Double certificateMark;//điểm chứng chỉ hệ 

	private Integer numberCreditRegister;//số tín chỉ đăng ký
	private String numberCreditRegisterCompare;// dấu so sánh số tín chỉ đăng ký
	private Boolean checkSubjectNotMarkRegister;
	private Integer numberCreditSemester;//số tín chỉ tích lũy học kỳ hiện tại
	private String numberCreditSemesterCompare;// dấu so sánh số tín chỉ tích lũy học kỳ hiện tại
	
	private Integer numberCreditPreSemester;//số tín chỉ tích lũy học kỳ trước
	private String numberCreditPreSemesterCompare;// dấu so sánh số tín chỉ tích lũy học kỳ trước
	private Integer numberCreditToSemester;//số tín chỉ tích lũy đến học kỳ hiện tại
	private String numberCreditToSemesterCompare;// dấu so sánh số tín chỉ tích lũy đến học kỳ hiện tại
	private Boolean checkTime;// lần 1
	
	private StudentObjectDto studentObject; //đối tượng sinh viên trong hồ sơ	
	private String studentObjectCompare;// dấu so sánh đối tượng sinh viên trong hồ sơ	
	
	private StudentObjectDto studentObjectSemester; //đối tượng sinh viên được duyệt trong kỳ
	private String studentObjectSemesterCompare;// dấu so sánh đối tượng sinh viên được duyệt trong kỳ
	
	private DisciplineDto disciplineNotScholarship;;//mức kỉ luật không được cấp học bổng
	private String condition;//điều kiện
	private Double amountNumberOfCredit;//số tiền/1 tín chỉ

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public SemesterDto getSemester() {
		return semester;
	}

	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}

	public CourseYearDto getCourseyear() {
		return courseyear;
	}

	public void setCourseyear(CourseYearDto courseyear) {
		this.courseyear = courseyear;
	}

	public SpecialityDto getSpeciality() {
		return speciality;
	}

	public void setSpeciality(SpecialityDto speciality) {
		this.speciality = speciality;
	}

	public EnrollmentClassDto getEnrollmentClass() {
		return enrollmentClass;
	}

	public void setEnrollmentClass(EnrollmentClassDto enrollmentClass) {
		this.enrollmentClass = enrollmentClass;
	}

	public DepartmentDto getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentDto department) {
		this.department = department;
	}

	public ScholarshipFundDto getScholarshipFund() {
		return scholarshipFund;
	}

	public void setScholarshipFund(ScholarshipFundDto scholarshipFund) {
		this.scholarshipFund = scholarshipFund;
	}

	public Double getMark4() {
		return mark4;
	}

	public void setMark4(Double mark4) {
		this.mark4 = mark4;
	}

	public Double getMark10() {
		return mark10;
	}

	public void setMark10(Double mark10) {
		this.mark10 = mark10;
	}

	public Double getMarkChar() {
		return markChar;
	}

	public void setMarkChar(Double markChar) {
		this.markChar = markChar;
	}

	public String getMarkCompare() {
		return markCompare;
	}

	public void setMarkCompare(String markCompare) {
		this.markCompare = markCompare;
	}

	public Boolean getCheckFullSchoolYearMark() {
		return checkFullSchoolYearMark;
	}

	public void setCheckFullSchoolYearMark(Boolean checkFullSchoolYearMark) {
		this.checkFullSchoolYearMark = checkFullSchoolYearMark;
	}

	public Double getBehaviourMark() {
		return behaviourMark;
	}

	public void setBehaviourMark(Double behaviourMark) {
		this.behaviourMark = behaviourMark;
	}

	public String getBehaviourMarkCompare() {
		return behaviourMarkCompare;
	}

	public void setBehaviourMarkCompare(String behaviourMarkCompare) {
		this.behaviourMarkCompare = behaviourMarkCompare;
	}

	public Boolean getCheckPreYearmark() {
		return checkPreYearmark;
	}

	public void setCheckPreYearmark(Boolean checkPreYearmark) {
		this.checkPreYearmark = checkPreYearmark;
	}

	public Boolean getCheckYearMark() {
		return checkYearMark;
	}

	public void setCheckYearMark(Boolean checkYearMark) {
		this.checkYearMark = checkYearMark;
	}

	public Double getMarkExtend() {
		return markExtend;
	}

	public void setMarkExtend(Double markExtend) {
		this.markExtend = markExtend;
	}

	public String getMarkExtendCompare() {
		return markExtendCompare;
	}

	public void setMarkExtendCompare(String markExtendCompare) {
		this.markExtendCompare = markExtendCompare;
	}

	public Integer getNumberSubjectFailed() {
		return numberSubjectFailed;
	}

	public void setNumberSubjectFailed(Integer numberSubjectFailed) {
		this.numberSubjectFailed = numberSubjectFailed;
	}

	public String getNumberSubjectFailedCompare() {
		return numberSubjectFailedCompare;
	}

	public void setNumberSubjectFailedCompare(String numberSubjectFailedCompare) {
		this.numberSubjectFailedCompare = numberSubjectFailedCompare;
	}

	public Boolean getCheckFullYearNumberSubjectFailed() {
		return checkFullYearNumberSubjectFailed;
	}

	public void setCheckFullYearNumberSubjectFailed(Boolean checkFullYearNumberSubjectFailed) {
		this.checkFullYearNumberSubjectFailed = checkFullYearNumberSubjectFailed;
	}

	public Boolean getCheckSubjectNotCounted() {
		return checkSubjectNotCounted;
	}

	public void setCheckSubjectNotCounted(Boolean checkSubjectNotCounted) {
		this.checkSubjectNotCounted = checkSubjectNotCounted;
	}

	public Double getMinMark4() {
		return minMark4;
	}

	public void setMinMark4(Double minMark4) {
		this.minMark4 = minMark4;
	}

	public Double getMinMark10() {
		return minMark10;
	}

	public void setMinMark10(Double minMark10) {
		this.minMark10 = minMark10;
	}

	public Double getMinMarkChar() {
		return minMarkChar;
	}

	public void setMinMarkChar(Double minMarkChar) {
		this.minMarkChar = minMarkChar;
	}

	public String getMinMarkCompare() {
		return minMarkCompare;
	}

	public void setMinMarkCompare(String minMarkCompare) {
		this.minMarkCompare = minMarkCompare;
	}


	public Boolean getCheckFullYearMinMark() {
		return checkFullYearMinMark;
	}

	public void setCheckFullYearMinMark(Boolean checkFullYearMinMark) {
		this.checkFullYearMinMark = checkFullYearMinMark;
	}

	public Boolean getCheckSubjectNotCountedMinMark() {
		return checkSubjectNotCountedMinMark;
	}

	public void setCheckSubjectNotCountedMinMark(Boolean checkSubjectNotCountedMinMark) {
		this.checkSubjectNotCountedMinMark = checkSubjectNotCountedMinMark;
	}

	public Integer getNumberSubjectNotExam() {
		return numberSubjectNotExam;
	}

	public void setNumberSubjectNotExam(Integer numberSubjectNotExam) {
		this.numberSubjectNotExam = numberSubjectNotExam;
	}

	public String getNumberSubjectNotExamCompare() {
		return numberSubjectNotExamCompare;
	}

	public void setNumberSubjectNotExamCompare(String numberSubjectNotExamCompare) {
		this.numberSubjectNotExamCompare = numberSubjectNotExamCompare;
	}

	public Boolean getCheckSubjectNotMark() {
		return checkSubjectNotMark;
	}

	public void setCheckSubjectNotMark(Boolean checkSubjectNotMark) {
		this.checkSubjectNotMark = checkSubjectNotMark;
	}

	public Double getCertificateMark4() {
		return certificateMark4;
	}

	public void setCertificateMark4(Double certificateMark4) {
		this.certificateMark4 = certificateMark4;
	}

	public Double getCertificateMark10() {
		return certificateMark10;
	}

	public void setCertificateMark10(Double certificateMark10) {
		this.certificateMark10 = certificateMark10;
	}

	public Double getCertificateMarkChar() {
		return certificateMarkChar;
	}

	public void setCertificateMarkChar(Double certificateMarkChar) {
		this.certificateMarkChar = certificateMarkChar;
	}

	public String getCertificateMarkCompare() {
		return certificateMarkCompare;
	}

	public void setCertificateMarkCompare(String certificateMarkCompare) {
		this.certificateMarkCompare = certificateMarkCompare;
	}

	public Boolean getCheckFullYearCertificateMark() {
		return checkFullYearCertificateMark;
	}

	public void setCheckFullYearCertificateMark(Boolean checkFullYearCertificateMark) {
		this.checkFullYearCertificateMark = checkFullYearCertificateMark;
	}

	public Integer getNumberCreditRegister() {
		return numberCreditRegister;
	}

	public void setNumberCreditRegister(Integer numberCreditRegister) {
		this.numberCreditRegister = numberCreditRegister;
	}

	public String getNumberCreditRegisterCompare() {
		return numberCreditRegisterCompare;
	}

	public void setNumberCreditRegisterCompare(String numberCreditRegisterCompare) {
		this.numberCreditRegisterCompare = numberCreditRegisterCompare;
	}

	public Integer getNumberCreditSemester() {
		return numberCreditSemester;
	}

	public void setNumberCreditSemester(Integer numberCreditSemester) {
		this.numberCreditSemester = numberCreditSemester;
	}

	public String getNumberCreditSemesterCompare() {
		return numberCreditSemesterCompare;
	}

	public void setNumberCreditSemesterCompare(String numberCreditSemesterCompare) {
		this.numberCreditSemesterCompare = numberCreditSemesterCompare;
	}

	public Integer getNumberCreditPreSemester() {
		return numberCreditPreSemester;
	}

	public void setNumberCreditPreSemester(Integer numberCreditPreSemester) {
		this.numberCreditPreSemester = numberCreditPreSemester;
	}

	public String getNumberCreditPreSemesterCompare() {
		return numberCreditPreSemesterCompare;
	}

	public void setNumberCreditPreSemesterCompare(String numberCreditPreSemesterCompare) {
		this.numberCreditPreSemesterCompare = numberCreditPreSemesterCompare;
	}

	public Integer getNumberCreditToSemester() {
		return numberCreditToSemester;
	}

	public void setNumberCreditToSemester(Integer numberCreditToSemester) {
		this.numberCreditToSemester = numberCreditToSemester;
	}

	public String getNumberCreditToSemesterCompare() {
		return numberCreditToSemesterCompare;
	}

	public void setNumberCreditToSemesterCompare(String numberCreditToSemesterCompare) {
		this.numberCreditToSemesterCompare = numberCreditToSemesterCompare;
	}

	public Boolean getCheckTime() {
		return checkTime;
	}

	public void setCheckTime(Boolean checkTime) {
		this.checkTime = checkTime;
	}

	public StudentObjectDto getStudentObject() {
		return studentObject;
	}

	public void setStudentObject(StudentObjectDto studentObject) {
		this.studentObject = studentObject;
	}

	public String getStudentObjectCompare() {
		return studentObjectCompare;
	}

	public void setStudentObjectCompare(String studentObjectCompare) {
		this.studentObjectCompare = studentObjectCompare;
	}

	public StudentObjectDto getStudentObjectSemester() {
		return studentObjectSemester;
	}

	public void setStudentObjectSemester(StudentObjectDto studentObjectSemester) {
		this.studentObjectSemester = studentObjectSemester;
	}

	public String getStudentObjectSemesterCompare() {
		return studentObjectSemesterCompare;
	}

	public void setStudentObjectSemesterCompare(String studentObjectSemesterCompare) {
		this.studentObjectSemesterCompare = studentObjectSemesterCompare;
	}

	public DisciplineDto getDisciplineNotScholarship() {
		return disciplineNotScholarship;
	}

	public void setDisciplineNotScholarship(DisciplineDto disciplineNotScholarship) {
		this.disciplineNotScholarship = disciplineNotScholarship;
	}

	public String getMarkType() {
		return markType;
	}

	public void setMarkType(String markType) {
		this.markType = markType;
	}

	public String getMinMarkType() {
		return minMarkType;
	}

	public void setMinMarkType(String minMarkType) {
		this.minMarkType = minMarkType;
	}

	public String getCertificateMarkType() {
		return certificateMarkType;
	}

	public void setCertificateMarkType(String certificateMarkType) {
		this.certificateMarkType = certificateMarkType;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	public Double getMark() {
		return mark;
	}

	public void setMark(Double mark) {
		this.mark = mark;
	}

	public Double getMinMark() {
		return minMark;
	}

	public void setMinMark(Double minMark) {
		this.minMark = minMark;
	}

	public Double getCertificateMark() {
		return certificateMark;
	}

	public void setCertificateMark(Double certificateMark) {
		this.certificateMark = certificateMark;
	}
	

	public Boolean getCheckSubjectNotMarkRegister() {
		return checkSubjectNotMarkRegister;
	}

	public void setCheckSubjectNotMarkRegister(Boolean checkSubjectNotMarkRegister) {
		this.checkSubjectNotMarkRegister = checkSubjectNotMarkRegister;
	}

	public Double getAmountNumberOfCredit() {
		return amountNumberOfCredit;
	}

	public void setAmountNumberOfCredit(Double amountNumberOfCredit) {
		this.amountNumberOfCredit = amountNumberOfCredit;
	}

	public ScholarshipConditionDto() {

	}

	public ScholarshipConditionDto(ScholarshipCondition sc) {
		String code="";
		this.level = sc.getLevel();
		this.amount = sc.getAmount();
		this.id = sc.getId();	
		if(sc.getAmountNumberOfCredit()!=null)
			this.amountNumberOfCredit=sc.getAmountNumberOfCredit();
		else
			this.amountNumberOfCredit=0D;
	
		if (sc.getScholarshipFund() != null) {
			this.scholarshipFund = new ScholarshipFundDto();
			this.scholarshipFund.setId(sc.getScholarshipFund().getId());
			this.scholarshipFund.setCode(sc.getScholarshipFund().getCode());
			this.scholarshipFund.setName(sc.getScholarshipFund().getName());
		}
		if(sc.getCourseyear()!=null) {
			this.courseyear=new CourseYearDto();
			this.courseyear.setId(sc.getCourseyear().getId());
			this.courseyear.setCode(sc.getCourseyear().getCode());
			this.courseyear.setName(sc.getCourseyear().getName());
		}
		if(sc.getDepartment()!=null) {
			this.department=new DepartmentDto();
			this.department.setId(sc.getDepartment().getId());
			this.department.setCode(sc.getDepartment().getCode());
			this.department.setName(sc.getDepartment().getName());
		}
		if(sc.getSpeciality()!=null) {
			this.speciality=new SpecialityDto();
			this.speciality.setId(sc.getSpeciality().getId());
			this.speciality.setName(sc.getSpeciality().getName());
			this.speciality.setCode(sc.getSpeciality().getCode());
		}
		if(sc.getEnrollmentClass()!=null) {
			this.enrollmentClass=new EnrollmentClassDto();
			this.enrollmentClass.setId(sc.getEnrollmentClass().getId());
			this.enrollmentClass.setClassCode(sc.getEnrollmentClass().getClassCode());
			this.enrollmentClass.setClassName(sc.getEnrollmentClass().getClassName());
		}
		if(sc.getSemester()!=null) {
			this.semester=new SemesterDto();
			this.semester.setId(sc.getSemester().getId());
			this.semester.setSemesterName(sc.getSemester().getSemesterName());
			this.semester.setSemesterCode(sc.getSemester().getSemesterCode());
		}
		this.mark4=sc.getMark4();
		if(sc.getMark4()!=null && sc.getMark4()>0) {
			this.markType="He4";
			this.mark=sc.getMark4();
			code= code+ "DHT" + sc.getMarkCompare()+ sc.getMark4()+ "HE4 " ;
		}
		this.mark10=sc.getMark10();
		if(sc.getMark10()!=null && sc.getMark10()>0) {
			this.markType="He10";
			this.mark=sc.getMark10();
			code= code+ "DHT" + sc.getMarkCompare()+sc.getMark10()+ "HE10 ";
		}
		this.markChar=sc.getMarkChar();
		this.markCompare=sc.getMarkCompare();
		if(sc.getCheckFullSchoolYearMark()!=null) {
			this.checkFullSchoolYearMark=sc.getCheckFullSchoolYearMark();
		}
		this.behaviourMark=sc.getBehaviourMark();
		if(sc.getBehaviourMark()!=null && sc.getBehaviourMark()>0) {
			if(code.length()>1) {
				code = code + " AND ";
			}
			String xl=null;
			if(sc.getBehaviourMark()==EducationConstant.SortMark.excellent.getValue()) {
				xl="Xuất sắc";
			}else if(sc.getBehaviourMark()==EducationConstant.SortMark.veryGood.getValue()) {
				xl="Tốt";
			}else if(sc.getBehaviourMark()==EducationConstant.SortMark.good.getValue()) {
				xl="Khá";
			}else if(sc.getBehaviourMark()==EducationConstant.SortMark.upperMiddle.getValue()) {
				xl="Trung bình khá";
			}else if(sc.getBehaviourMark()==EducationConstant.SortMark.middle.getValue()) {
				xl="Trung bình";
			}else if(sc.getBehaviourMark()==EducationConstant.SortMark.weak.getValue()) {
				xl="yếu";
			}else if(sc.getBehaviourMark()==EducationConstant.SortMark.poor.getValue()) {
				xl="Kém";
			}
			
			code= code+ "DRL" + sc.getBehaviourMarkCompare()+xl;
		}
		this.behaviourMarkCompare=sc.getBehaviourMarkCompare();
		if(sc.getCheckPreYearmark()!=null) {
			this.checkPreYearmark=sc.getCheckPreYearmark();
		}
		if(sc.getCheckYearMark()!=null) {
			this.checkYearMark=sc.getCheckYearMark();
		}
		this.markExtend=sc.getMarkExtend();
		if(sc.getMarkExtend()!=null && sc.getMarkExtend()>0) {
			if(code.length()>1) {
				code = code + " AND ";
			}
			code= code+ "DTBMR" + sc.getMarkExtendCompare()+sc.getMarkExtend();
		}
		this.markExtendCompare=sc.getMarkExtendCompare();
		this.numberSubjectFailed=sc.getNumberSubjectFailed();
		if(sc.getNumberSubjectFailed()!=null) {
			if(code.length()>1) {
				code = code + " AND ";
			}
			code= code+ "SMKD" + sc.getNumberSubjectFailedCompare()+sc.getNumberSubjectFailed();
		}
		this.numberSubjectFailedCompare=sc.getNumberSubjectFailedCompare();
		if(sc.getCheckFullYearNumberSubjectFailed()!=null) {
			this.checkFullYearNumberSubjectFailed=sc.getCheckFullYearNumberSubjectFailed();
		}
		if(sc.getCheckSubjectNotCounted()!=null) {
			this.checkSubjectNotCounted=sc.getCheckSubjectNotCounted();
		}
		this.minMark4=sc.getMinMark4();
		if(sc.getMinMark4()!=null && sc.getMinMark4()>0) {
			this.minMarkType="He4";
			this.minMark=sc.getMinMark4();
			if(code.length()>1) {
				code = code + " AND ";
			}
			code= code+ "DHPTT" + sc.getMinMarkCompare()+sc.getMinMark4()+"He4";
		}
		this.minMark10=sc.getMinMark10();
		if(sc.getMinMark10()!=null && sc.getMinMark10()>0) {
			this.minMarkType="He10";
			this.minMark=sc.getMinMark10();
			if(code.length()>1) {
				code = code + " AND ";
			}
			code= code+ "DHPTT" + sc.getMinMarkCompare()+sc.getMinMark10()+"He10";
		}
		this.minMarkChar=sc.getMinMarkChar();
		this.minMarkCompare=sc.getMinMarkCompare();
		if(sc.getCheckFullYearMinMark()!=null)
		this.checkFullYearMinMark=sc.getCheckFullYearMinMark();
		if(sc.getCheckSubjectNotCountedMinMark()!=null)
		this.checkSubjectNotCountedMinMark=sc.getCheckSubjectNotCountedMinMark();
		this.numberSubjectNotExam=sc.getNumberSubjectNotExam();
		if(sc.getNumberSubjectNotExam()!=null) {
			if(code.length()>1) {
				code = code + " AND ";
			}
			code= code+ "SMVT" + sc.getNumberSubjectNotExamCompare()+sc.getNumberSubjectNotExam();
			if(sc.getCheckSubjectNotMark()!=null && sc.getCheckSubjectNotMark()==true ) {
				code= code+ "+ MonKTD";
			}
		}
		this.numberSubjectNotExamCompare=sc.getNumberSubjectNotExamCompare();
		if(sc.getCheckSubjectNotMark()!=null)
		this.checkSubjectNotMark=sc.getCheckSubjectNotMark();
		
		this.certificateMark4=sc.getCertificateMark4();
		if(sc.getCertificateMark4()!=null && sc.getCertificateMark4()>0) {
			this.certificateMarkType="He4";
			this.certificateMark=sc.getCertificateMark4();
			if(code.length()>1) {
				code = code + " AND ";
			}
			code= code+ "DHPCC" + sc.getCertificateMarkCompare()+sc.getCertificateMark4()+"He4";
		}
		this.certificateMark10=sc.getCertificateMark10();
		if(sc.getCertificateMark10()!=null && sc.getCertificateMark10()>0) {
			this.certificateMarkType="He10";
			this.certificateMark=sc.getCertificateMark10();
			if(code.length()>1) {
				code = code + " AND ";
			}
			code= code+ "DHPCC" + sc.getCertificateMarkCompare()+sc.getCertificateMark10()+"He10";
		}
		this.certificateMarkChar=sc.getCertificateMarkChar();
		this.certificateMarkCompare=sc.getCertificateMarkCompare();
		if(sc.getCheckFullYearCertificateMark()!=null)
		this.checkFullYearCertificateMark=sc.getCheckFullYearCertificateMark();
		this.numberCreditRegister=sc.getNumberCreditRegister();
		if(sc.getNumberCreditRegister()!=null ) {
			if(code.length()>1) {
				code = code + " AND ";
			}
			code= code+ "STCDK" + sc.getNumberCreditRegisterCompare()+sc.getNumberCreditRegister();
		}
		this.numberCreditRegisterCompare=sc.getNumberCreditRegisterCompare();
		this.numberCreditSemester=sc.getNumberCreditSemester();
		if(sc.getNumberCreditSemester()!=null ) {
			if(code.length()>1) {
				code = code + " AND ";
			}
			code= code+ "STCTLHKHT" + sc.getNumberCreditSemesterCompare()+sc.getNumberCreditSemester();
		}
		this.numberCreditSemesterCompare=sc.getNumberCreditSemesterCompare();
		this.numberCreditPreSemester=sc.getNumberCreditPreSemester();
		if(sc.getNumberCreditPreSemester()!=null ) {
			if(code.length()>1) {
				code = code + " AND ";
			}
			code= code+ "STCTLHKT" + sc.getNumberCreditPreSemesterCompare()+sc.getNumberCreditPreSemester();
		}
		this.numberCreditPreSemesterCompare=sc.getNumberCreditPreSemesterCompare();
		this.numberCreditToSemester=sc.getNumberCreditToSemester();
		if(sc.getNumberCreditToSemester()!=null ) {
			if(code.length()>1) {
				code = code + " AND ";
			}
			code= code+ "STCTLDHKHT" + sc.getNumberCreditToSemesterCompare()+sc.getNumberCreditToSemester();
		}
		this.numberCreditToSemesterCompare=sc.getNumberCreditToSemesterCompare();
		if(sc.getCheckTime()!=null)
		this.checkTime=sc.getCheckTime();
		if(sc.getStudentObject()!=null) {
			this.studentObject=new StudentObjectDto();
			this.studentObject.setId(sc.getStudentObject().getId());
			this.studentObject.setCode(sc.getStudentObject().getCode());
			this.studentObject.setName(sc.getStudentObject().getName());
			if(code.length()>1) {
				code = code + " AND ";
			}
			code= code+ "DTSVTHS" + sc.getStudentObjectCompare()+sc.getStudentObject().getName();
		}
		this.studentObjectCompare=sc.getStudentObjectCompare();
		if(sc.getStudentObjectSemester()!=null) {
			this.studentObjectSemester=new StudentObjectDto();
			this.studentObjectSemester.setId(sc.getStudentObjectSemester().getId());
			this.studentObjectSemester.setCode(sc.getStudentObjectSemester().getCode());
			this.studentObjectSemester.setName(sc.getStudentObjectSemester().getName());
			
			if(code.length()>1) {
				code = code + " AND ";
			}
			code= code+ "DTSVDDTK" + sc.getStudentObjectSemesterCompare()+sc.getStudentObjectSemester().getName();
			
		}
		if(sc.getCheckSubjectNotMarkRegister()!=null)
			this.checkSubjectNotMarkRegister=sc.getCheckSubjectNotMarkRegister();
		this.studentObjectSemesterCompare=sc.getStudentObjectSemesterCompare();
		if(sc.getDisciplineNotScholarship()!=null) {
			this.disciplineNotScholarship=new DisciplineDto(sc.getDisciplineNotScholarship());
		}		
		this.condition=code;
	}
	public ScholarshipConditionDto(ScholarshipCondition sc, boolean valueCheck) {
		if(valueCheck) {
			String code="";
			this.level = sc.getLevel();
			this.amount = sc.getAmount();
			this.id = sc.getId();	
			if(sc.getAmountNumberOfCredit()!=null)
				this.amountNumberOfCredit=sc.getAmountNumberOfCredit();
			else
				this.amountNumberOfCredit=0D;
		
			if (sc.getScholarshipFund() != null) {
				this.scholarshipFund = new ScholarshipFundDto();
				this.scholarshipFund.setId(sc.getScholarshipFund().getId());
				this.scholarshipFund.setCode(sc.getScholarshipFund().getCode());
				this.scholarshipFund.setName(sc.getScholarshipFund().getName());
			}
			if(sc.getCourseyear()!=null) {
				this.courseyear=new CourseYearDto();
				this.courseyear.setId(sc.getCourseyear().getId());
				this.courseyear.setCode(sc.getCourseyear().getCode());
				this.courseyear.setName(sc.getCourseyear().getName());
			}
			if(sc.getDepartment()!=null) {
				this.department=new DepartmentDto();
				this.department.setId(sc.getDepartment().getId());
				this.department.setCode(sc.getDepartment().getCode());
				this.department.setName(sc.getDepartment().getName());
			}
			if(sc.getSpeciality()!=null) {
				this.speciality=new SpecialityDto();
				this.speciality.setId(sc.getSpeciality().getId());
				this.speciality.setCode(sc.getSpeciality().getCode());
				if(sc.getSpeciality().getParent() != null) {
					this.speciality.setName("..."+sc.getSpeciality().getName());
					this.speciality.setParent(new SpecialityDto(sc.getSpeciality().getParent()));
				}
				else
					this.speciality.setName(sc.getSpeciality().getName());
			}
			if(sc.getEnrollmentClass()!=null) {
				this.enrollmentClass=new EnrollmentClassDto();
				this.enrollmentClass.setId(sc.getEnrollmentClass().getId());
				this.enrollmentClass.setClassCode(sc.getEnrollmentClass().getClassCode());
				this.enrollmentClass.setClassName(sc.getEnrollmentClass().getClassName());
			}
			if(sc.getSemester()!=null) {
				this.semester=new SemesterDto();
				this.semester.setId(sc.getSemester().getId());
				this.semester.setSemesterName(sc.getSemester().getSemesterName());
				this.semester.setSemesterCode(sc.getSemester().getSemesterCode());
			}
			this.mark4=sc.getMark4();
			if(sc.getMark4()!=null && sc.getMark4()>0) {
				this.markType="He4";
				this.mark=sc.getMark4();
				code= code+ "DHT" + sc.getMarkCompare()+ sc.getMark4()+ "HE4 " ;
			}
			this.mark10=sc.getMark10();
			if(sc.getMark10()!=null && sc.getMark10()>0) {
				this.markType="He10";
				this.mark=sc.getMark10();
				code= code+ "DHT" + sc.getMarkCompare()+sc.getMark10()+ "HE10 ";
			}
			this.markChar=sc.getMarkChar();
			this.markCompare=sc.getMarkCompare();
			if(sc.getCheckFullSchoolYearMark()!=null) {
				this.checkFullSchoolYearMark=sc.getCheckFullSchoolYearMark();
			}
			this.behaviourMark=sc.getBehaviourMark();
			if(sc.getBehaviourMark()!=null && sc.getBehaviourMark()>0) {
				if(code.length()>1) {
					code = code + " AND ";
				}
				String xl=null;
				if(sc.getBehaviourMark()==EducationConstant.SortMark.excellent.getValue()) {
					xl="Xuất sắc";
				}else if(sc.getBehaviourMark()==EducationConstant.SortMark.veryGood.getValue()) {
					xl="Tốt";
				}else if(sc.getBehaviourMark()==EducationConstant.SortMark.good.getValue()) {
					xl="Khá";
				}else if(sc.getBehaviourMark()==EducationConstant.SortMark.upperMiddle.getValue()) {
					xl="Trung bình khá";
				}else if(sc.getBehaviourMark()==EducationConstant.SortMark.middle.getValue()) {
					xl="Trung bình";
				}else if(sc.getBehaviourMark()==EducationConstant.SortMark.weak.getValue()) {
					xl="yếu";
				}else if(sc.getBehaviourMark()==EducationConstant.SortMark.poor.getValue()) {
					xl="Kém";
				}
				
				code= code+ "DRL" + sc.getBehaviourMarkCompare()+xl;
			}
			this.behaviourMarkCompare=sc.getBehaviourMarkCompare();
			if(sc.getCheckPreYearmark()!=null) {
				this.checkPreYearmark=sc.getCheckPreYearmark();
			}
			if(sc.getCheckYearMark()!=null) {
				this.checkYearMark=sc.getCheckYearMark();
			}
			this.markExtend=sc.getMarkExtend();
			if(sc.getMarkExtend()!=null && sc.getMarkExtend()>0) {
				if(code.length()>1) {
					code = code + " AND ";
				}
				code= code+ "DTBMR" + sc.getMarkExtendCompare()+sc.getMarkExtend();
			}
			this.markExtendCompare=sc.getMarkExtendCompare();
			this.numberSubjectFailed=sc.getNumberSubjectFailed();
			if(sc.getNumberSubjectFailed()!=null) {
				if(code.length()>1) {
					code = code + " AND ";
				}
				code= code+ "SMKD" + sc.getNumberSubjectFailedCompare()+sc.getNumberSubjectFailed();
			}
			this.numberSubjectFailedCompare=sc.getNumberSubjectFailedCompare();
			if(sc.getCheckFullYearNumberSubjectFailed()!=null) {
				this.checkFullYearNumberSubjectFailed=sc.getCheckFullYearNumberSubjectFailed();
			}
			if(sc.getCheckSubjectNotCounted()!=null) {
				this.checkSubjectNotCounted=sc.getCheckSubjectNotCounted();
			}
			this.minMark4=sc.getMinMark4();
			if(sc.getMinMark4()!=null && sc.getMinMark4()>0) {
				this.minMarkType="He4";
				this.minMark=sc.getMinMark4();
				if(code.length()>1) {
					code = code + " AND ";
				}
				code= code+ "DHPTT" + sc.getMinMarkCompare()+sc.getMinMark4()+"He4";
			}
			this.minMark10=sc.getMinMark10();
			if(sc.getMinMark10()!=null && sc.getMinMark10()>0) {
				this.minMarkType="He10";
				this.minMark=sc.getMinMark10();
				if(code.length()>1) {
					code = code + " AND ";
				}
				code= code+ "DHPTT" + sc.getMinMarkCompare()+sc.getMinMark10()+"He10";
			}
			this.minMarkChar=sc.getMinMarkChar();
			this.minMarkCompare=sc.getMinMarkCompare();
			if(sc.getCheckFullYearMinMark()!=null)
			this.checkFullYearMinMark=sc.getCheckFullYearMinMark();
			if(sc.getCheckSubjectNotCountedMinMark()!=null)
			this.checkSubjectNotCountedMinMark=sc.getCheckSubjectNotCountedMinMark();
			this.numberSubjectNotExam=sc.getNumberSubjectNotExam();
			if(sc.getNumberSubjectNotExam()!=null) {
				if(code.length()>1) {
					code = code + " AND ";
				}
				code= code+ "SMVT" + sc.getNumberSubjectNotExamCompare()+sc.getNumberSubjectNotExam();
				if(sc.getCheckSubjectNotMark()!=null && sc.getCheckSubjectNotMark()==true ) {
					code= code+ "+ MonKTD";
				}
			}
			this.numberSubjectNotExamCompare=sc.getNumberSubjectNotExamCompare();
			if(sc.getCheckSubjectNotMark()!=null)
			this.checkSubjectNotMark=sc.getCheckSubjectNotMark();
			
			this.certificateMark4=sc.getCertificateMark4();
			if(sc.getCertificateMark4()!=null && sc.getCertificateMark4()>0) {
				this.certificateMarkType="He4";
				this.certificateMark=sc.getCertificateMark4();
				if(code.length()>1) {
					code = code + " AND ";
				}
				code= code+ "DHPCC" + sc.getCertificateMarkCompare()+sc.getCertificateMark4()+"He4";
			}
			this.certificateMark10=sc.getCertificateMark10();
			if(sc.getCertificateMark10()!=null && sc.getCertificateMark10()>0) {
				this.certificateMarkType="He10";
				this.certificateMark=sc.getCertificateMark10();
				if(code.length()>1) {
					code = code + " AND ";
				}
				code= code+ "DHPCC" + sc.getCertificateMarkCompare()+sc.getCertificateMark10()+"He10";
			}
			this.certificateMarkChar=sc.getCertificateMarkChar();
			this.certificateMarkCompare=sc.getCertificateMarkCompare();
			if(sc.getCheckFullYearCertificateMark()!=null)
			this.checkFullYearCertificateMark=sc.getCheckFullYearCertificateMark();
			this.numberCreditRegister=sc.getNumberCreditRegister();
			if(sc.getNumberCreditRegister()!=null ) {
				if(code.length()>1) {
					code = code + " AND ";
				}
				code= code+ "STCDK" + sc.getNumberCreditRegisterCompare()+sc.getNumberCreditRegister();
			}
			this.numberCreditRegisterCompare=sc.getNumberCreditRegisterCompare();
			this.numberCreditSemester=sc.getNumberCreditSemester();
			if(sc.getNumberCreditSemester()!=null ) {
				if(code.length()>1) {
					code = code + " AND ";
				}
				code= code+ "STCTLHKHT" + sc.getNumberCreditSemesterCompare()+sc.getNumberCreditSemester();
			}
			this.numberCreditSemesterCompare=sc.getNumberCreditSemesterCompare();
			this.numberCreditPreSemester=sc.getNumberCreditPreSemester();
			if(sc.getNumberCreditPreSemester()!=null ) {
				if(code.length()>1) {
					code = code + " AND ";
				}
				code= code+ "STCTLHKT" + sc.getNumberCreditPreSemesterCompare()+sc.getNumberCreditPreSemester();
			}
			this.numberCreditPreSemesterCompare=sc.getNumberCreditPreSemesterCompare();
			this.numberCreditToSemester=sc.getNumberCreditToSemester();
			if(sc.getNumberCreditToSemester()!=null ) {
				if(code.length()>1) {
					code = code + " AND ";
				}
				code= code+ "STCTLDHKHT" + sc.getNumberCreditToSemesterCompare()+sc.getNumberCreditToSemester();
			}
			this.numberCreditToSemesterCompare=sc.getNumberCreditToSemesterCompare();
			if(sc.getCheckTime()!=null)
			this.checkTime=sc.getCheckTime();
			if(sc.getStudentObject()!=null) {
				this.studentObject=new StudentObjectDto();
				this.studentObject.setId(sc.getStudentObject().getId());
				this.studentObject.setCode(sc.getStudentObject().getCode());
				this.studentObject.setName(sc.getStudentObject().getName());
				if(code.length()>1) {
					code = code + " AND ";
				}
				code= code+ "DTSVTHS" + sc.getStudentObjectCompare()+sc.getStudentObject().getName();
			}
			this.studentObjectCompare=sc.getStudentObjectCompare();
			if(sc.getStudentObjectSemester()!=null) {
				this.studentObjectSemester=new StudentObjectDto();
				this.studentObjectSemester.setId(sc.getStudentObjectSemester().getId());
				this.studentObjectSemester.setCode(sc.getStudentObjectSemester().getCode());
				this.studentObjectSemester.setName(sc.getStudentObjectSemester().getName());
				
				if(code.length()>1) {
					code = code + " AND ";
				}
				code= code+ "DTSVDDTK" + sc.getStudentObjectSemesterCompare()+sc.getStudentObjectSemester().getName();
				
			}
			if(sc.getCheckSubjectNotMarkRegister()!=null)
				this.checkSubjectNotMarkRegister=sc.getCheckSubjectNotMarkRegister();
			this.studentObjectSemesterCompare=sc.getStudentObjectSemesterCompare();
			if(sc.getDisciplineNotScholarship()!=null) {
				this.disciplineNotScholarship=new DisciplineDto(sc.getDisciplineNotScholarship());
			}		
			this.condition=code;
		}
	}
}
