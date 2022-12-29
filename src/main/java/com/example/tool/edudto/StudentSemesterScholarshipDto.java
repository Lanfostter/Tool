package com.example.tool.edudto;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.apache.commons.collections4.CollectionUtils;

import com.globits.core.dto.BaseObjectDto;
import com.globits.core.dto.DepartmentDto;
import com.globits.core.utils.NumberUtils;
import com.globits.education.domain.ReceivePayAble;
import com.globits.education.domain.ScholarshipCondition;
import com.globits.education.domain.ScholarshipFund;
import com.globits.education.domain.StudentObject;
import com.globits.education.domain.StudentObjectStudent;
import com.globits.education.domain.StudentObjectStudentSemester;
import com.globits.education.domain.StudentScholarshipHistory;
import com.globits.education.domain.StudentSemesterScholarship;
import com.globits.education.domain.StudentStatusStudentSemester;
import com.globits.education.dto.CourseYearDto;
import com.globits.education.dto.EnrollmentClassDto;
import com.globits.education.dto.ReceivePayAbleDto;
import com.globits.education.dto.ScholarshipConditionDto;
import com.globits.education.dto.ScholarshipFundDto;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.SpecialityDto;
import com.globits.education.dto.StudentScholarshipHistoryDto;
import com.globits.education.dto.view.ViewSimpleStudentDto;
import com.globits.education.utils.EducationConstant;

public class StudentSemesterScholarshipDto extends BaseObjectDto{
	private static final long serialVersionUID = 361898697906916508L;
	private Long id;
	private ViewSimpleStudentDto student;
	private SemesterDto semester;
	private Double amount;
	
	private Double firstAmount;//Số tiền trong lần xét đầu tiên	
	private Double lastAmount;//Số tiền trong lần điều chỉnh cuối cùng, thông thường sau khi điều chỉnh sẽ lấy amount=lastAmount
	private Double doneAmount;//Số tiền thực nhận (là trường hợp đã duyệt - được công nhận đủ điểm rèn luyện
	private String studentEnrollmentClassName;
	private Boolean isForward;
	private Boolean isLock;
	private Integer status;
	private Double mark;

	private Double mark4;
	private Integer numberOfCredit;// Số lượng tín chỉ tích lũy ngành 1 (-) KTĐ
	private Integer numberOfCreditAndNotCaculateMark;// Số lượng tín chỉ tích lũy ngành 1 (+) KTĐ
	private Double behaviorMark;//điểm rèn luyện

	private String behaviorMarkChar;//xếp loại
	private Double markAdvanced;//điểm tb mở rộng
	private Double mark4Advanced;
	private Integer type;//loại học bổng

	private Integer level;//mức học bổng
	private ScholarshipFundDto scholarshipFund;
	private ScholarshipConditionDto scholarshipCondition;//điều kiện xét học bổng
	
	private List<StudentScholarshipHistoryDto> editHistories;
	private String note;//ghi chú
	Boolean isFirstNumberOfCreditLearning=null;//trường hợp thỏa mãn số tín chỉ đăng ký ko.
	Boolean isFirstNumberOfCreditLearningCaculateMark=null;//Số TC đăng ký là môn tính điểm (=false là (+) môn KTĐ, =true (-) môn KTĐ)
	private Long programMainId;//chương trình đào tạo ngành 1
	private String description;//diễn giải
	private ReceivePayAbleDto receivePayAble;
	private Date lockDate;
	private EnrollmentClassDto enrollmentClass;
	private CourseYearDto courseYear;
	private SpecialityDto speciality;
	private DepartmentDto department;
	private String createdBy;
	private StudentObject studentObject;
	private StudentObject studentObjectSemester;
	
	public StudentObject getStudentObject() {
		return studentObject;
	}
	public void setStudentObject(StudentObject studentObject) {
		this.studentObject = studentObject;
	}
	public StudentObject getStudentObjectSemester() {
		return studentObjectSemester;
	}
	public void setStudentObjectSemester(StudentObject studentObjectSemester) {
		this.studentObjectSemester = studentObjectSemester;
	}
	public ViewSimpleStudentDto getStudent() {
		return student;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setStudent(ViewSimpleStudentDto student) {
		this.student = student;
	}
	public SemesterDto getSemester() {
		return semester;
	}
	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getStudentEnrollmentClassName() {
		return studentEnrollmentClassName;
	}
	public void setStudentEnrollmentClassName(String studentEnrollmentClassName) {
		this.studentEnrollmentClassName = studentEnrollmentClassName;
	}
	public Boolean getIsForward() {
		return isForward;
	}
	public void setIsForward(Boolean isForward) {
		this.isForward = isForward;
	}
	
	public Boolean getIsLock() {
		return isLock;
	}
	public void setIsLock(Boolean isLock) {
		this.isLock = isLock;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public Double getMark() {
//		return mark;
		return NumberUtils.round(mark,2);
	}
	public void setMark(Double mark) {
		this.mark = mark;
	}
	public Double getMark4() {
//		return mark4;
		return NumberUtils.round(mark4,2);
	}
	public void setMark4(Double mark4) {
		this.mark4 = mark4;
	}
	public Integer getNumberOfCredit() {
		return numberOfCredit;
	}
	public void setNumberOfCredit(Integer numberOfCredit) {
		this.numberOfCredit = numberOfCredit;
	}	
	public Integer getNumberOfCreditAndNotCaculateMark() {
		return numberOfCreditAndNotCaculateMark;
	}
	public void setNumberOfCreditAndNotCaculateMark(Integer numberOfCreditAndNotCaculateMark) {
		this.numberOfCreditAndNotCaculateMark = numberOfCreditAndNotCaculateMark;
	}
	public Double getBehaviorMark() {
		return NumberUtils.round(behaviorMark,2);
//		return behaviorMark;
	}
	public void setBehaviorMark(Double behaviorMark) {
		this.behaviorMark = behaviorMark;
	}
	public String getBehaviorMarkChar() {
		return behaviorMarkChar;
	}
	public void setBehaviorMarkChar(String behaviorMarkChar) {
		this.behaviorMarkChar = behaviorMarkChar;
	}
	public Double getMarkAdvanced() {
//		return markAdvanced;
		return NumberUtils.round(markAdvanced,2);
	}
	public void setMarkAdvanced(Double markAdvanced) {
		this.markAdvanced = markAdvanced;
	}
	public Double getMark4Advanced() {
//		return mark4Advanced;
		return NumberUtils.round(mark4Advanced,2);
	}
	public void setMark4Advanced(Double mark4Advanced) {
		this.mark4Advanced = mark4Advanced;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public ScholarshipFundDto getScholarshipFund() {
		return scholarshipFund;
	}
	public void setScholarshipFund(ScholarshipFundDto scholarshipFund) {
		this.scholarshipFund = scholarshipFund;
	}
	public List<StudentScholarshipHistoryDto> getEditHistories() {
		return editHistories;
	}
	public void setEditHistories(List<StudentScholarshipHistoryDto> editHistories) {
		this.editHistories = editHistories;
	}
	public Double getFirstAmount() {
		return firstAmount;
	}
	public void setFirstAmount(Double firstAmount) {
		this.firstAmount = firstAmount;
	}
	public Double getLastAmount() {
		return lastAmount;
	}
	public void setLastAmount(Double lastAmount) {
		this.lastAmount = lastAmount;
	}
	
	public ScholarshipConditionDto getScholarshipCondition() {
		return scholarshipCondition;
	}
	public void setScholarshipCondition(ScholarshipConditionDto scholarshipCondition) {
		this.scholarshipCondition = scholarshipCondition;
	}
	
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}	
	public Boolean getIsFirstNumberOfCreditLearning() {
		return isFirstNumberOfCreditLearning;
	}
	public void setIsFirstNumberOfCreditLearning(Boolean isFirstNumberOfCreditLearning) {
		this.isFirstNumberOfCreditLearning = isFirstNumberOfCreditLearning;
	}
	
	public Boolean getIsFirstNumberOfCreditLearningCaculateMark() {
		return isFirstNumberOfCreditLearningCaculateMark;
	}
	public void setIsFirstNumberOfCreditLearningCaculateMark(Boolean isFirstNumberOfCreditLearningCaculateMark) {
		this.isFirstNumberOfCreditLearningCaculateMark = isFirstNumberOfCreditLearningCaculateMark;
	}	
	public Long getProgramMainId() {
		return programMainId;
	}
	public void setProgramMainId(Long programMainId) {
		this.programMainId = programMainId;
	}	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public ReceivePayAbleDto getReceivePayAble() {
		return receivePayAble;
	}
	public void setReceivePayAble(ReceivePayAbleDto receivePayAble) {
		this.receivePayAble = receivePayAble;
	}
		
	public Date getLockDate() {
		return lockDate;
	}
	public void setLockDate(Date lockDate) {
		this.lockDate = lockDate;
	}
	public EnrollmentClassDto getEnrollmentClass() {
		return enrollmentClass;
	}
	public void setEnrollmentClass(EnrollmentClassDto enrollmentClass) {
		this.enrollmentClass = enrollmentClass;
	}
	public CourseYearDto getCourseYear() {
		return courseYear;
	}
	public void setCourseYear(CourseYearDto courseYear) {
		this.courseYear = courseYear;
	}
	public SpecialityDto getSpeciality() {
		return speciality;
	}
	public void setSpeciality(SpecialityDto speciality) {
		this.speciality = speciality;
	}
	public DepartmentDto getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentDto department) {
		this.department = department;
	}	
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Double getDoneAmount() {
		return doneAmount;
	}
	public void setDoneAmount(Double doneAmount) {
		this.doneAmount = doneAmount;
	}
	public StudentSemesterScholarshipDto() {
		
	}
	public StudentSemesterScholarshipDto(StudentSemesterScholarship entity) {
		if(entity!=null) {
			this.id = entity.getId();
			this.isForward = entity.getIsForward();
			this.firstAmount = entity.getFirstAmount();
			this.lastAmount = entity.getLastAmount();
			this.doneAmount=entity.getDoneAmount();
			this.note=entity.getNote();
			this.description=entity.getDescription();
			this.createdBy=entity.getCreatedBy();
			if(entity.getStudent() != null) {
				this.student = new ViewSimpleStudentDto();
				this.student.setId(entity.getStudent().getId());
				this.student.setDisplayName(entity.getStudent().getDisplayName());
				this.student.setStudentCode(entity.getStudent().getStudentCode());
				this.student.setDisplayNameCode(entity.getStudent().getDisplayName() + " - " + entity.getStudent().getStudentCode());
				if(entity.getStudent().getEnrollmentClass() != null) {
					this.studentEnrollmentClassName = entity.getStudent().getEnrollmentClass().getClassName();
				}
				this.student.setLastName(entity.getStudent().getLastName());
				this.student.setFirstName(entity.getStudent().getFirstName());
				try {
					// tình trạng sinh viên
					String status="";
					Date date=null;
					if(entity.getStudent()!=null&&entity.getStudent().getStudentStatusStudentSemesters()!=null&& entity.getStudent().getStudentStatusStudentSemesters().size()>0) {
						for (StudentStatusStudentSemester id : entity.getStudent().getStudentStatusStudentSemesters()) {
							if(date==null && id.getStatus()!=null) {
								if (id.getStatus().equals(EducationConstant.StudentStatus.baoLuu.getValue())) {
									status="Bảo lưu";
								} else if (id.getStatus().equals(EducationConstant.StudentStatus.biDuoiHoc.getValue())) {
									status="Đuổi học";
								} else if (id.getStatus().equals(EducationConstant.StudentStatus.chuyenTruong.getValue())) {
									status="Chuyển trường";
								} else if (id.getStatus().equals(EducationConstant.StudentStatus.thoiHoc.getValue())) {
									status="Thôi học";
								} else if (id.getStatus().equals(EducationConstant.StudentStatus.xoaTen.getValue())) {
									status="Xóa tên";
								} else if (id.getStatus().equals(EducationConstant.StudentStatus.chuaRo.getValue())) {
									status="Chưa rõ";
								} else if (id.getStatus().equals(EducationConstant.StudentStatus.daTotNghiep.getValue())) {
									status="Đã tốt nghiệp";
								} else if (id.getStatus().equals(EducationConstant.StudentStatus.quayTroLai.getValue())) {
									status="Quay trở lại";
								} else {
									status="Bình thường";
								}
								date=id.getStartDate();
							}else if(date!=null && id.getStatus()!=null && id.getStartDate()!=null && (date.equals(id.getStartDate())||date.before(id.getStartDate()))) {
								if (id.getStatus().equals(EducationConstant.StudentStatus.baoLuu.getValue())) {
									status="Bảo lưu";
								} else if (id.getStatus().equals(EducationConstant.StudentStatus.biDuoiHoc.getValue())) {
									status="Đuổi học";
								} else if (id.getStatus().equals(EducationConstant.StudentStatus.chuyenTruong.getValue())) {
									status="Chuyển trường";
								} else if (id.getStatus().equals(EducationConstant.StudentStatus.thoiHoc.getValue())) {
									status="Thôi học";
								} else if (id.getStatus().equals(EducationConstant.StudentStatus.xoaTen.getValue())) {
									status="Xóa tên";
								} else if (id.getStatus().equals(EducationConstant.StudentStatus.chuaRo.getValue())) {
									status="Chưa rõ";
								} else if (id.getStatus().equals(EducationConstant.StudentStatus.daTotNghiep.getValue())) {
									status="Đã tốt nghiệp";
								} else if (id.getStatus().equals(EducationConstant.StudentStatus.quayTroLai.getValue())) {
									status="Quay trở lại";
								} else {
									status="Bình thường";
								}
								date=id.getStartDate();
							}
						}
					}
					else if (entity.getStudent()!=null&&entity.getStudent().getStatus() != null) {
						if (entity.getStudent().getStatus().equals(EducationConstant.StudentStatus.baoLuu.getValue())) {
							status="Bảo lưu";
						} else if (entity.getStudent().getStatus().equals(EducationConstant.StudentStatus.biDuoiHoc.getValue())) {
							status="Đuổi học";
						} else if (entity.getStudent().getStatus().equals(EducationConstant.StudentStatus.chuyenTruong.getValue())) {
							status="Chuyển trường";
						} else if (entity.getStudent().getStatus().equals(EducationConstant.StudentStatus.thoiHoc.getValue())) {
							status="Thôi học";
						} else if (entity.getStudent().getStatus().equals(EducationConstant.StudentStatus.xoaTen.getValue())) {
							status="Xóa tên";
						} else if (entity.getStudent().getStatus().equals(EducationConstant.StudentStatus.chuaRo.getValue())) {
							status="Chưa rõ";
						} else if (entity.getStudent().getStatus().equals(EducationConstant.StudentStatus.daTotNghiep.getValue())) {
							status="Đã tốt nghiệp";
						} else if (entity.getStudent().getStatus().equals(EducationConstant.StudentStatus.quayTroLai.getValue())) {
							status="Quay trở lại";
						} else {
							status="Bình thường";
						}

					} else {
						status="Bình thường";
					}
					this.student.setStatusName(status);
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
			if(entity.getSemester() != null) {
				this.semester = new SemesterDto();
				this.semester.setId(entity.getSemester().getId());
				this.semester.setSemesterCode(entity.getSemester().getSemesterCode());
				this.semester.setSemesterName(entity.getSemester().getSemesterName());
				this.semester.setIsCurrent(entity.getSemester().getIsCurrent());
			}
			this.amount = entity.getAmount();
			this.isLock=entity.getIsLock();
			this.status=entity.getStatus();
			this.mark=entity.getMark();
			this.mark4=entity.getMark4();
			this.level=entity.getLevel();
			this.mark4Advanced=entity.getMark4Advanced();
			this.markAdvanced=entity.getMarkAdvanced();
			this.behaviorMarkChar=entity.getBehaviorMarkChar();
			this.behaviorMark=entity.getBehaviorMark();
			this.numberOfCredit=entity.getNumberOfCredit();
			this.type=entity.getType();
			if(entity.getScholarshipFund()!=null)
			this.scholarshipFund=new ScholarshipFundDto(entity.getScholarshipFund());
			if(entity.getScholarshipCondition()!=null) {
				this.scholarshipCondition=new ScholarshipConditionDto();
				this.scholarshipCondition.setId(entity.getScholarshipCondition().getId());
				this.scholarshipCondition.setAmount(entity.getScholarshipCondition().getAmount());
				this.scholarshipCondition.setLevel(entity.getScholarshipCondition().getLevel());
				//điều kiện so sánh số TCĐk
				this.scholarshipCondition.setNumberCreditRegisterCompare(entity.getScholarshipCondition().getNumberCreditRegisterCompare());
			}
			if(entity.getEditHistories()!=null && entity.getEditHistories().size()>0) {
				this.editHistories = new ArrayList<StudentScholarshipHistoryDto>();
				for (StudentScholarshipHistory his : entity.getEditHistories()) {
					StudentScholarshipHistoryDto hisDto = new StudentScholarshipHistoryDto();
					hisDto.setId(hisDto.getId());
					hisDto.setAmount(his.getAmount());
					hisDto.setAmountBefore(his.getAmountBefore());
					hisDto.setDateModify(his.getDateModify());
					hisDto.setUserModify(his.getUserModify());
					if(his.getReceivePayAble()!=null) {
						hisDto.setReceivePayAble(new ReceivePayAbleDto());
						hisDto.getReceivePayAble().setId(his.getReceivePayAble().getId());
					}	
					this.editHistories.add(hisDto);
				}
			}
			if(entity.getReceivePayAble()!=null) {
				this.receivePayAble=new ReceivePayAbleDto();
				this.receivePayAble.setId(entity.getReceivePayAble().getId());
			}
			if(entity.getLockDate()!=null) {
				this.lockDate=entity.getLockDate();
			}
			if(entity.getEnrollmentClass()!=null) {
				this.enrollmentClass=new EnrollmentClassDto();
				this.enrollmentClass.setId(entity.getEnrollmentClass().getId());
				this.enrollmentClass.setClassCode(entity.getEnrollmentClass().getClassCode());
				this.enrollmentClass.setClassName(entity.getEnrollmentClass().getClassName());
			}
			try {
				if(entity.getStudent().getStudentObjectStudents() != null) {
					for(StudentObjectStudent item : entity.getStudent().getStudentObjectStudents()) {
						if(item.getIsCourse() != null && item.getIsCourse() == true) {
							this.studentObject = item.getStudentObject();
						}
					}
				}
				if(entity.getStudent().getStudentObjectStudentSemesters() != null) {
					for(StudentObjectStudentSemester item : entity.getStudent().getStudentObjectStudentSemesters()) {
						if(entity.getSemester().getId() == item.getSemester().getId()) {
							this.studentObjectSemester= item.getStudentObject();
						}
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	}
		
}
