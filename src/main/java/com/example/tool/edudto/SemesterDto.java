package com.example.tool.edudto;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;

import com.globits.education.domain.ExamRegisterPeriod;
import com.globits.education.domain.Semester;

import com.globits.education.domain.SemesterRegisterPeriod;
import com.globits.education.dto.ExamRegisterPeriodDto;
import com.globits.education.dto.SchoolYearDto;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.SemesterRegisterPeriodDto;

public class SemesterDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String semesterCode;
	private String semesterName;
	private String description;
	private SchoolYearDto schoolYear;
	private Integer year;
	//@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private Date startDate; // Ngày bắt đầu
	private Date endDate; // Ngày kết thúc
	private Boolean isCurrent;
	private SemesterDto parent;
	private List<SemesterDto> children;
	private List<SemesterDto> subSemesters;
	private Double tuitionFeePerCredit;// Mức học phí cho một tín chỉ
	private Date startRegisterDate;//Ngày bắt đầu đăng ký
	private String startRegisterDateString;//Ngày bắt đầu đăng ký
	private Date endRegisterDate;//Ngày kết thúc đăng ký
	private String endRegisterDateString;//Ngày kết thúc đăng ký
	private Boolean isLockRegister;//Khóa Đăng ký học
	private Integer ordinalNumbers;
	private Date behaviorMarkStart;
	private Date behaviorMarkEnd;
	private List<SemesterRegisterPeriodDto> semesterRegisterPeriods;
	
	private List<ExamRegisterPeriodDto> examRegisterPeriods;
	private Integer typeMarkRecognition;//loại điểm công nhận (=0 hoặc null thì là công nhận điểm theo lần học cuối, 
	//=1 là công nhận điểm cao nhất)
	private Date educationStart;//cấu hình thời gian cập nhật dữ liệu tự động từ P3 sang cho P5
	private Date educationEnd;//cấu hình thời gian cập nhật dữ liệu tự động từ P3 sang cho P5
	private Date studentStart;//cấu hình thời gian cập nhật dữ liệu tự động từ P7 sang cho P5
	private Date studentEnd;//cấu hình thời gian cập nhật dữ liệu tự động từ P7 sang cho P5
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getOrdinalNumbers() {
		return ordinalNumbers;
	}

	public void setOrdinalNumbers(Integer ordinalNumbers) {
		this.ordinalNumbers = ordinalNumbers;
	}

	public String getSemesterCode() {
		return semesterCode;
	}

	public void setSemesterCode(String semesterCode) {
		this.semesterCode = semesterCode;
	}

	public String getSemesterName() {
		return semesterName;
	}

	public void setSemesterName(String semesterName) {
		this.semesterName = semesterName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public SchoolYearDto getSchoolYear() {
		return schoolYear;
	}

	public void setSchoolYear(SchoolYearDto schoolYear) {
		this.schoolYear = schoolYear;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Boolean getIsCurrent() {
		return isCurrent;
	}

	public void setIsCurrent(Boolean isCurrent) {
		this.isCurrent = isCurrent;
	}

	public SemesterDto getParent() {
		return parent;
	}

	public void setParent(SemesterDto parent) {
		this.parent = parent;
	}

	public List<SemesterDto> getChildren() {
		return children;
	}

	public void setChildren(List<SemesterDto> children) {
		this.children = children;
	}

	public List<SemesterDto> getSubSemesters() {
		return subSemesters;
	}

	public void setSubSemesters(List<SemesterDto> subSemesters) {
		this.subSemesters = subSemesters;
	}

	public List<SemesterRegisterPeriodDto> getSemesterRegisterPeriods() {
		return semesterRegisterPeriods;
	}

	public void setSemesterRegisterPeriods(List<SemesterRegisterPeriodDto> semesterRegisterPeriods) {
		this.semesterRegisterPeriods = semesterRegisterPeriods;
	}

	public Double getTuitionFeePerCredit() {
		return tuitionFeePerCredit;
	}

	public void setTuitionFeePerCredit(Double tuitionFeePerCredit) {
		this.tuitionFeePerCredit = tuitionFeePerCredit;
	}
	
	public Date getStartRegisterDate() {
		return startRegisterDate;
	}

	public void setStartRegisterDate(Date startRegisterDate) {
		this.startRegisterDate = startRegisterDate;
	}

	public String getStartRegisterDateString() {
		return startRegisterDateString;
	}

	public Date getEndRegisterDate() {
		return endRegisterDate;
	}

	public void setEndRegisterDate(Date endRegisterDate) {
		this.endRegisterDate = endRegisterDate;
	}

	public String getEndRegisterDateString() {
		return endRegisterDateString;
	}

	public Boolean getIsLockRegister() {
		return isLockRegister;
	}

	public void setIsLockRegister(Boolean isLockRegister) {
		this.isLockRegister = isLockRegister;
	}
	
	public List<ExamRegisterPeriodDto> getExamRegisterPeriods() {
		return examRegisterPeriods;
	}

	public void setExamRegisterPeriods(List<ExamRegisterPeriodDto> examRegisterPeriods) {
		this.examRegisterPeriods = examRegisterPeriods;
	}

	public Date getBehaviorMarkStart() {
		return behaviorMarkStart;
	}

	public void setBehaviorMarkStart(Date behaviorMarkStart) {
		this.behaviorMarkStart = behaviorMarkStart;
	}

	public Date getBehaviorMarkEnd() {
		return behaviorMarkEnd;
	}

	public void setBehaviorMarkEnd(Date behaviorMarkEnd) {
		this.behaviorMarkEnd = behaviorMarkEnd;
	}	

	public Integer getTypeMarkRecognition() {
		return typeMarkRecognition;
	}

	public void setTypeMarkRecognition(Integer typeMarkRecognition) {
		this.typeMarkRecognition = typeMarkRecognition;
	}
	public Date getEducationStart() {
		return educationStart;
	}

	public void setEducationStart(Date educationStart) {
		this.educationStart = educationStart;
	}

	public Date getEducationEnd() {
		return educationEnd;
	}

	public void setEducationEnd(Date educationEnd) {
		this.educationEnd = educationEnd;
	}

	public Date getStudentStart() {
		return studentStart;
	}

	public void setStudentStart(Date studentStart) {
		this.studentStart = studentStart;
	}

	public Date getStudentEnd() {
		return studentEnd;
	}

	public void setStudentEnd(Date studentEnd) {
		this.studentEnd = studentEnd;
	}

	public SemesterDto() {

	}
	
	private List<SemesterDto> getListChildren(Semester semester){
		List<SemesterDto> ret = new ArrayList<SemesterDto>();
		
		if(semester.getSubSemesters()!=null && semester.getSubSemesters().size()>0) {
			for(Semester s : semester.getSubSemesters()) {
				SemesterDto sDto = new SemesterDto();
				sDto.setDescription(s.getDescription());
				sDto.setId(s.getId());
				sDto.setSemesterCode(s.getSemesterCode());
				sDto.setSemesterName(s.getSemesterName());
				sDto.setStartDate(s.getStartDate());
				sDto.setEndDate(s.getEndDate());
				sDto.setYear(s.getYear());
				sDto.setOrdinalNumbers(s.getOrdinalNumbers());
				sDto.setBehaviorMarkStart(s.getBehaviorMarkStart());
				sDto.setBehaviorMarkEnd(s.getBehaviorMarkEnd());
				sDto.setTypeMarkRecognition(s.getTypeMarkRecognition());
				sDto.setEducationStart(s.getEducationStart());
				sDto.setEducationEnd(s.getEducationEnd());
				sDto.setStudentStart(s.getStudentStart());
				sDto.setStudentEnd(s.getStudentEnd());
				if(s.getTuitionFeePerCredit()!=null  && s.getTuitionFeePerCredit()>0) {
					sDto.setTuitionFeePerCredit(s.getTuitionFeePerCredit());
				}
				if(s.getSchoolYear()!=null) {
					sDto.setSchoolYear(new SchoolYearDto());
					sDto.getSchoolYear().setCode(s.getSchoolYear().getCode());
					sDto.getSchoolYear().setName(s.getSchoolYear().getName());
					sDto.getSchoolYear().setId(s.getSchoolYear().getId());
					sDto.getSchoolYear().setYear(s.getSchoolYear().getYear());
					sDto.getSchoolYear().setStartDate(s.getSchoolYear().getStartDate());
					sDto.getSchoolYear().setEndDate(s.getSchoolYear().getEndDate());
				}
				if(s.getIsLockRegister()!=null) {
					sDto.setIsLockRegister(s.getIsLockRegister());
				}
				sDto.setChildren(getListChildren(s));
				ret.add(sDto);
			}
		}
		return ret;
	}

	public SemesterDto(Semester s) {
		if(s!=null) {
			this.setDescription(s.getDescription());
			this.setId(s.getId());
			this.setSemesterCode(s.getSemesterCode());
			this.setYear(s.getYear());
			this.setStartRegisterDate(s.getStartRegisterDate());
			
			try {
				 SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");  
				 this.startRegisterDateString = formatter.format(s.getStartRegisterDate());
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			this.setEndRegisterDate(s.getEndRegisterDate());
			try {
				 SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");  
				 this.endRegisterDateString = formatter.format(s.getEndRegisterDate());
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			this.setOrdinalNumbers(s.getOrdinalNumbers());
			this.behaviorMarkEnd = s.getBehaviorMarkEnd();
			this.behaviorMarkStart = s.getBehaviorMarkStart();
			this.typeMarkRecognition=s.getTypeMarkRecognition();
			this.educationStart=s.getEducationStart();
			this.educationEnd=s.getEducationEnd();
			this.studentStart=s.getStudentStart();
			this.studentEnd=s.getStudentEnd();
			if(s.getSchoolYear()!=null) {
				this.schoolYear = new SchoolYearDto();
				this.schoolYear.setCode(s.getSchoolYear().getCode());
				this.schoolYear.setName(s.getSchoolYear().getName());
				this.schoolYear.setId(s.getSchoolYear().getId());
				this.schoolYear.setYear(s.getSchoolYear().getYear());
				this.schoolYear.setStartDate(s.getSchoolYear().getStartDate());
				this.schoolYear.setEndDate(s.getSchoolYear().getEndDate());
			}
			this.endDate = s.getEndDate();
			this.isCurrent = s.getIsCurrent();
			this.semesterName = s.getSemesterName();
			this.startDate = s.getStartDate();
			if(s.getTuitionFeePerCredit()!=null  && s.getTuitionFeePerCredit()>0) {
				this.tuitionFeePerCredit=s.getTuitionFeePerCredit();
			}
			if(s.getParent()!=null) {
				this.parent = new SemesterDto();
				this.getParent().setId(s.getParent().getId());
				this.getParent().setDescription(s.getParent().getDescription());
				this.getParent().setId(s.getParent().getId());
				this.getParent().setSemesterCode(s.getParent().getSemesterCode());
				this.getParent().setSemesterName(s.getParent().getSemesterName());
				this.getParent().setYear(s.getParent().getYear());
				this.getParent().setStartDate(s.getParent().getStartDate());
				this.getParent().setEndDate(s.getParent().getEndDate());
				if(s.getParent().getTuitionFeePerCredit()!=null  && s.getParent().getTuitionFeePerCredit()>0)
				this.getParent().setTuitionFeePerCredit(s.getParent().getTuitionFeePerCredit());
				this.getParent().setBehaviorMarkStart(s.getParent().getBehaviorMarkStart());
				this.getParent().setBehaviorMarkEnd(s.getParent().getBehaviorMarkEnd());
				this.getParent().setTypeMarkRecognition(s.getParent().getTypeMarkRecognition());
				this.getParent().setEducationStart(s.getParent().getEducationStart());
				this.getParent().setEducationEnd(s.getParent().getEducationEnd());
				this.getParent().setStudentStart(s.getParent().getStudentStart());
				this.getParent().setStudentEnd(s.getParent().getStudentEnd());
				if(s.getParent().getIsLockRegister()!=null) {
					this.getParent().setIsLockRegister(s.getParent().getIsLockRegister());
				}
			}
			if(s.getSubSemesters()!=null && s.getSubSemesters().size()>0) {
				ArrayList<SemesterDto> subSemesters =new ArrayList<SemesterDto>();
				for(Semester st:s.getSubSemesters()) {
					SemesterDto sDto = new SemesterDto();
					sDto.setDescription(st.getDescription());
					sDto.setId(st.getId());
					sDto.setSemesterCode(st.getSemesterCode());
					sDto.setSemesterName(st.getSemesterName());
					sDto.setStartDate(st.getStartDate());
					sDto.setEndDate(st.getEndDate());
					sDto.setYear(st.getYear());
					sDto.setBehaviorMarkEnd(s.getBehaviorMarkEnd());
					sDto.setBehaviorMarkStart(s.getBehaviorMarkStart());
					sDto.setEducationStart(s.getEducationStart());
					sDto.setEducationEnd(s.getEducationEnd());
					sDto.setStudentStart(s.getStudentStart());
					sDto.setStudentEnd(s.getStudentEnd());
					if(st.getIsLockRegister()!=null) {
						sDto.setIsLockRegister(st.getIsLockRegister());
					}
					if(st.getSchoolYear()!=null) {
						sDto.setSchoolYear(new SchoolYearDto());
						sDto.getSchoolYear().setCode(st.getSchoolYear().getCode());
						sDto.getSchoolYear().setName(st.getSchoolYear().getName());
						sDto.getSchoolYear().setId(st.getSchoolYear().getId());
						sDto.getSchoolYear().setYear(st.getSchoolYear().getYear());
					}
					if(st.getSemesterRegisterPeriods()!=null && !st.getSemesterRegisterPeriods().isEmpty()) {
						sDto.setSemesterRegisterPeriods(new ArrayList<SemesterRegisterPeriodDto>());
						for (SemesterRegisterPeriod registerPeriod : st.getSemesterRegisterPeriods()) {
							sDto.getSemesterRegisterPeriods().add(new SemesterRegisterPeriodDto(registerPeriod));
						}
					}
					sDto.setIsCurrent(st.getIsCurrent());
					sDto.setTypeMarkRecognition(st.getTypeMarkRecognition());
					subSemesters.add(sDto);
				}
				this.setSubSemesters(subSemesters);
			}
			if(s.getSemesterRegisterPeriods()!=null && s.getSemesterRegisterPeriods().size()>0) {
				this.semesterRegisterPeriods = new ArrayList<SemesterRegisterPeriodDto>();
				for (SemesterRegisterPeriod srp : s.getSemesterRegisterPeriods()) {
					SemesterRegisterPeriodDto srpDto = new SemesterRegisterPeriodDto(srp,true);
					this.semesterRegisterPeriods.add(srpDto);
				}
			}
			if(s.getIsLockRegister()!=null) {
				this.isLockRegister=s.getIsLockRegister();
			}
			if(s.getExamRegisterPeriods()!=null && s.getExamRegisterPeriods().size()>0) {
				this.examRegisterPeriods = new ArrayList<ExamRegisterPeriodDto>();
				for (ExamRegisterPeriod srp : s.getExamRegisterPeriods()) {
					this.examRegisterPeriods.add(new ExamRegisterPeriodDto(srp,false));
				}
			}
			this.setChildren(getListChildren(s));
			this.ordinalNumbers = s.getOrdinalNumbers();
		}
	}
	
	public SemesterDto(Semester s,boolean simple) {
		if(s!=null) {
			this.setDescription(s.getDescription());
			this.setId(s.getId());
			this.setSemesterCode(s.getSemesterCode());
			this.setYear(s.getYear());
			this.setStartRegisterDate(s.getStartRegisterDate());
			
			try {
				 SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");  
				 this.startRegisterDateString = formatter.format(s.getStartRegisterDate());
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			this.setEndRegisterDate(s.getEndRegisterDate());
			try {
				 SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");  
				 this.endRegisterDateString = formatter.format(s.getEndRegisterDate());
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			this.setOrdinalNumbers(s.getOrdinalNumbers());
			this.behaviorMarkEnd = s.getBehaviorMarkEnd();
			this.behaviorMarkStart = s.getBehaviorMarkStart();
			this.typeMarkRecognition=s.getTypeMarkRecognition();
			this.educationStart=s.getEducationStart();
			this.educationEnd=s.getEducationEnd();
			this.studentStart=s.getStudentStart();
			this.studentEnd=s.getStudentEnd();
			if(s.getSchoolYear()!=null) {
				this.schoolYear = new SchoolYearDto();
				this.schoolYear.setCode(s.getSchoolYear().getCode());
				this.schoolYear.setName(s.getSchoolYear().getName());
				this.schoolYear.setId(s.getSchoolYear().getId());
				this.schoolYear.setYear(s.getSchoolYear().getYear());
				this.schoolYear.setStartDate(s.getSchoolYear().getStartDate());
				this.schoolYear.setEndDate(s.getSchoolYear().getEndDate());
			}
			this.endDate = s.getEndDate();
			this.isCurrent = s.getIsCurrent();
			this.semesterName = s.getSemesterName();
			this.startDate = s.getStartDate();
			if(s.getTuitionFeePerCredit()!=null  && s.getTuitionFeePerCredit()>0) {
				this.tuitionFeePerCredit=s.getTuitionFeePerCredit();
			}
			if(!simple) {
				if(s.getParent()!=null) {
					this.parent = new SemesterDto();
					this.getParent().setId(s.getParent().getId());
					this.getParent().setDescription(s.getParent().getDescription());
					this.getParent().setId(s.getParent().getId());
					this.getParent().setSemesterCode(s.getParent().getSemesterCode());
					this.getParent().setSemesterName(s.getParent().getSemesterName());
					this.getParent().setYear(s.getParent().getYear());
					this.getParent().setStartDate(s.getParent().getStartDate());
					this.getParent().setEndDate(s.getParent().getEndDate());
					if(s.getParent().getTuitionFeePerCredit()!=null  && s.getParent().getTuitionFeePerCredit()>0)
					this.getParent().setTuitionFeePerCredit(s.getParent().getTuitionFeePerCredit());
					this.getParent().setBehaviorMarkStart(s.getParent().getBehaviorMarkStart());
					this.getParent().setBehaviorMarkEnd(s.getParent().getBehaviorMarkEnd());
					this.getParent().setTypeMarkRecognition(s.getParent().getTypeMarkRecognition());
					this.getParent().setEducationStart(s.getParent().getEducationStart());
					this.getParent().setEducationEnd(s.getParent().getEducationEnd());
					this.getParent().setStudentStart(s.getParent().getStudentStart());
					this.getParent().setStudentEnd(s.getParent().getStudentEnd());
					if(s.getParent().getIsLockRegister()!=null) {
						this.getParent().setIsLockRegister(s.getParent().getIsLockRegister());
					}
				}
				if(s.getSubSemesters()!=null && s.getSubSemesters().size()>0) {
					ArrayList<SemesterDto> subSemesters =new ArrayList<SemesterDto>();
					for(Semester st:s.getSubSemesters()) {
						SemesterDto sDto = new SemesterDto();
						sDto.setDescription(st.getDescription());
						sDto.setId(st.getId());
						sDto.setSemesterCode(st.getSemesterCode());
						sDto.setSemesterName(st.getSemesterName());
						sDto.setStartDate(st.getStartDate());
						sDto.setEndDate(st.getEndDate());
						sDto.setYear(st.getYear());
						sDto.setBehaviorMarkEnd(s.getBehaviorMarkEnd());
						sDto.setBehaviorMarkStart(s.getBehaviorMarkStart());
						sDto.setEducationStart(s.getEducationStart());
						sDto.setEducationEnd(s.getEducationEnd());
						sDto.setStudentStart(s.getStudentStart());
						sDto.setStudentEnd(s.getStudentEnd());
						if(st.getIsLockRegister()!=null) {
							sDto.setIsLockRegister(st.getIsLockRegister());
						}
						if(st.getSchoolYear()!=null) {
							sDto.setSchoolYear(new SchoolYearDto());
							sDto.getSchoolYear().setCode(st.getSchoolYear().getCode());
							sDto.getSchoolYear().setName(st.getSchoolYear().getName());
							sDto.getSchoolYear().setId(st.getSchoolYear().getId());
							sDto.getSchoolYear().setYear(st.getSchoolYear().getYear());
						}
						if(st.getSemesterRegisterPeriods()!=null && !st.getSemesterRegisterPeriods().isEmpty()) {
							sDto.setSemesterRegisterPeriods(new ArrayList<SemesterRegisterPeriodDto>());
							for (SemesterRegisterPeriod registerPeriod : st.getSemesterRegisterPeriods()) {
								sDto.getSemesterRegisterPeriods().add(new SemesterRegisterPeriodDto(registerPeriod));
							}
						}
						sDto.setIsCurrent(st.getIsCurrent());
						sDto.setTypeMarkRecognition(st.getTypeMarkRecognition());
						subSemesters.add(sDto);
					}
					this.setSubSemesters(subSemesters);
				}
				if(s.getSemesterRegisterPeriods()!=null && s.getSemesterRegisterPeriods().size()>0) {
					this.semesterRegisterPeriods = new ArrayList<SemesterRegisterPeriodDto>();
					for (SemesterRegisterPeriod srp : s.getSemesterRegisterPeriods()) {
						SemesterRegisterPeriodDto srpDto = new SemesterRegisterPeriodDto(srp,true);
						this.semesterRegisterPeriods.add(srpDto);
					}
				}
				if(s.getExamRegisterPeriods()!=null && s.getExamRegisterPeriods().size()>0) {
					this.examRegisterPeriods = new ArrayList<ExamRegisterPeriodDto>();
					for (ExamRegisterPeriod srp : s.getExamRegisterPeriods()) {
						this.examRegisterPeriods.add(new ExamRegisterPeriodDto(srp,false));
					}
				}
			}else {
				if(s.getSemesterRegisterPeriods()!=null && s.getSemesterRegisterPeriods().size()>0) {
					this.semesterRegisterPeriods = new ArrayList<SemesterRegisterPeriodDto>();
					for (SemesterRegisterPeriod srp : s.getSemesterRegisterPeriods()) {
						SemesterRegisterPeriodDto srpDto = new SemesterRegisterPeriodDto(srp,true);
						this.semesterRegisterPeriods.add(srpDto);
					}
				}
			}
			if(s.getIsLockRegister()!=null) {
				this.isLockRegister=s.getIsLockRegister();
			}		
		}
	}
	
	public SemesterDto(Long id, String name, String code) {
		this.id = id;
		this.semesterName = name;
		this.semesterCode = code;
	}
}
