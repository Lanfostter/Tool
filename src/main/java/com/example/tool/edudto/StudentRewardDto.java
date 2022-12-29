package com.example.tool.edudto;

import java.io.Serializable;
import java.util.Date;

import com.example.tool.edudto.SchoolYearDto;
import com.example.tool.edudto.SemesterDto;
import com.example.tool.edudto.StudentDto;
import com.example.tool.edudto.StudentRewardConditionDto;
import com.globits.core.dto.BaseObjectDto;
import com.globits.core.dto.RewardDto;
import com.globits.education.domain.StudentReward;

public class StudentRewardDto extends BaseObjectDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	private StudentDto student; // Sinh viên
	private RewardDto reward; // Khen thưởng

	private String reason; // Lý do

	private Date decisionDate; // Ngày quyết định

	private SemesterDto semester; // Học kỳ


	private Long numberOfDisciplined; //Số lần bị kỉ luật
	private Long numberOfRewarded; //Số lần được khen thưởng
	private Integer rewardName; //Danh hiệu
	
	private Double firstStudentSemesterBehaviorMark; //điểm rèn luyện học kỳ I
	private Integer firstSortStudentSemesterBehaviorMark; 
	private Double secondStudentSemesterBehaviorMark;//điểm rèn luyện học kỳ II
	private Integer secondSortStudentSemesterBehaviorMark;  //Điểm rèn luyện học kỳ II Đạt loại gì? Ví dụ(Xuất sắc, giỏi, khá ....) chú thích trong const SortMark
	
	private Double studentSchoolYearBehaviorMark;//điểm rèn luyện cả năm
	private Integer sortStudentSchoolYearBehaviorMark;  //Điểm rèn luyện cả năm Đạt loại gì? Ví dụ(Xuất sắc, giỏi, khá ....) chú thích trong const SortMark
	
	
	private Double firstStudentSemesterSummaryMark; //Điểm tổng kết học kỳ I
	private Integer firstSortStudentSemesterSummaryMark; //Điểm tổng kết học kỳ I Đạt loại gì? Ví dụ(Xuất sắc, giỏi, khá ....) chú thích trong const SortMark
	private Double secondStudentSemesterSummaryMark;//Điểm tổng kết học kỳ II
	private Integer secondSortStudentSemesterSummaryMark;  //Điểm tổng kết học kỳ II Đạt loại gì? Ví dụ(Xuất sắc, giỏi, khá ....) chú thích trong const SortMark
	
	private Double studentSchoolYearSummaryMark;//Điểm tổng kết cả năm
	private Integer sortStudentSchoolYearSummaryMark;  //Điểm tổng kết cả năm Đạt loại gì? Ví dụ(Xuất sắc, giỏi, khá ....) chú thích trong const SortMark
	
	private Double studentSummaryMark;  //Điểm học tập toàn khóa
	private Integer sortStudentSummaryMark;  //Điểm học tập toàn khóa Đạt loại gì? Ví dụ(Xuất sắc, giỏi, khá ....) chú thích trong const SortMark
	
	private Double studentBehaviorSummaryMark;  //Điểm rèn luyện toàn khóa
	private Integer sortStudentBehaviorSummaryMark;  //Điểm rèn luyện toàn khóa Đạt loại gì? Ví dụ(Xuất sắc, giỏi, khá ....) chú thích trong const SortMark
	
	private Integer status;
	
	private StudentRewardConditionDto studentRewardCondition; //Danh hiệu của sinh viên
	
	private SchoolYearDto schoolYear; //Năm học (Dư thừa dữ liệu nhưng cần để tìm kiếm sinh viên chưa có danh hiệu)
	
	private Boolean isEndCourseYear;//Xét cuối khóa - true => năm học bằng null
	
	private boolean isCanCheck;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isCanCheck() {
		return isCanCheck;
	}

	public void setCanCheck(boolean isCanCheck) {
		this.isCanCheck = isCanCheck;
	}

	public StudentDto getStudent() {
		return student;
	}

	public void setStudent(StudentDto student) {
		this.student = student;
	}

	public RewardDto getReward() {
		return reward;
	}

	public Double getStudentSummaryMark() {
		return studentSummaryMark;
	}

	public void setStudentSummaryMark(Double studentSummaryMark) {
		this.studentSummaryMark = studentSummaryMark;
	}

	public Integer getSortStudentSummaryMark() {
		return sortStudentSummaryMark;
	}

	public void setSortStudentSummaryMark(Integer sortStudentSummaryMark) {
		this.sortStudentSummaryMark = sortStudentSummaryMark;
	}

	public Double getStudentBehaviorSummaryMark() {
		return studentBehaviorSummaryMark;
	}

	public void setStudentBehaviorSummaryMark(Double studentBehaviorSummaryMark) {
		this.studentBehaviorSummaryMark = studentBehaviorSummaryMark;
	}

	public Integer getSortStudentBehaviorSummaryMark() {
		return sortStudentBehaviorSummaryMark;
	}

	public void setSortStudentBehaviorSummaryMark(Integer sortStudentBehaviorSummaryMark) {
		this.sortStudentBehaviorSummaryMark = sortStudentBehaviorSummaryMark;
	}

	public void setReward(RewardDto reward) {
		this.reward = reward;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public SemesterDto getSemester() {
		return semester;
	}

	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}

	public Date getDecisionDate() {
		return decisionDate;
	}

	public void setDecisionDate(Date decisionDate) {
		this.decisionDate = decisionDate;
	}

	public Long getNumberOfDisciplined() {
		return numberOfDisciplined;
	}

	public void setNumberOfDisciplined(Long numberOfDisciplined) {
		this.numberOfDisciplined = numberOfDisciplined;
	}

	public Long getNumberOfRewarded() {
		return numberOfRewarded;
	}

	public void setNumberOfRewarded(Long numberOfRewarded) {
		this.numberOfRewarded = numberOfRewarded;
	}

	public Integer getRewardName() {
		return rewardName;
	}

	public void setRewardName(Integer rewardName) {
		this.rewardName = rewardName;
	}

	public Double getFirstStudentSemesterBehaviorMark() {
		return firstStudentSemesterBehaviorMark;
	}

	public void setFirstStudentSemesterBehaviorMark(Double firstStudentSemesterBehaviorMark) {
		this.firstStudentSemesterBehaviorMark = firstStudentSemesterBehaviorMark;
	}

	public Integer getFirstSortStudentSemesterBehaviorMark() {
		return firstSortStudentSemesterBehaviorMark;
	}

	public void setFirstSortStudentSemesterBehaviorMark(Integer firstSortStudentSemesterBehaviorMark) {
		this.firstSortStudentSemesterBehaviorMark = firstSortStudentSemesterBehaviorMark;
	}

	public Double getSecondStudentSemesterBehaviorMark() {
		return secondStudentSemesterBehaviorMark;
	}

	public void setSecondStudentSemesterBehaviorMark(Double secondStudentSemesterBehaviorMark) {
		this.secondStudentSemesterBehaviorMark = secondStudentSemesterBehaviorMark;
	}

	public Integer getSecondSortStudentSemesterBehaviorMark() {
		return secondSortStudentSemesterBehaviorMark;
	}

	public void setSecondSortStudentSemesterBehaviorMark(Integer secondSortStudentSemesterBehaviorMark) {
		this.secondSortStudentSemesterBehaviorMark = secondSortStudentSemesterBehaviorMark;
	}

	public Double getStudentSchoolYearBehaviorMark() {
		return studentSchoolYearBehaviorMark;
	}

	public void setStudentSchoolYearBehaviorMark(Double studentSchoolYearBehaviorMark) {
		this.studentSchoolYearBehaviorMark = studentSchoolYearBehaviorMark;
	}

	public Integer getSortStudentSchoolYearBehaviorMark() {
		return sortStudentSchoolYearBehaviorMark;
	}

	public void setSortStudentSchoolYearBehaviorMark(Integer sortStudentSchoolYearBehaviorMark) {
		this.sortStudentSchoolYearBehaviorMark = sortStudentSchoolYearBehaviorMark;
	}

	public Double getFirstStudentSemesterSummaryMark() {
		return firstStudentSemesterSummaryMark;
	}

	public void setFirstStudentSemesterSummaryMark(Double firstStudentSemesterSummaryMark) {
		this.firstStudentSemesterSummaryMark = firstStudentSemesterSummaryMark;
	}

	public Integer getFirstSortStudentSemesterSummaryMark() {
		return firstSortStudentSemesterSummaryMark;
	}

	public void setFirstSortStudentSemesterSummaryMark(Integer firstSortStudentSemesterSummaryMark) {
		this.firstSortStudentSemesterSummaryMark = firstSortStudentSemesterSummaryMark;
	}

	public Double getSecondStudentSemesterSummaryMark() {
		return secondStudentSemesterSummaryMark;
	}

	public void setSecondStudentSemesterSummaryMark(Double secondStudentSemesterSummaryMark) {
		this.secondStudentSemesterSummaryMark = secondStudentSemesterSummaryMark;
	}

	public Integer getSecondSortStudentSemesterSummaryMark() {
		return secondSortStudentSemesterSummaryMark;
	}

	public void setSecondSortStudentSemesterSummaryMark(Integer secondSortStudentSemesterSummaryMark) {
		this.secondSortStudentSemesterSummaryMark = secondSortStudentSemesterSummaryMark;
	}

	public Double getStudentSchoolYearSummaryMark() {
		return studentSchoolYearSummaryMark;
	}

	public void setStudentSchoolYearSummaryMark(Double studentSchoolYearSummaryMark) {
		this.studentSchoolYearSummaryMark = studentSchoolYearSummaryMark;
	}

	public Integer getSortStudentSchoolYearSummaryMark() {
		return sortStudentSchoolYearSummaryMark;
	}

	public void setSortStudentSchoolYearSummaryMark(Integer sortStudentSchoolYearSummaryMark) {
		this.sortStudentSchoolYearSummaryMark = sortStudentSchoolYearSummaryMark;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public StudentRewardConditionDto getStudentRewardCondition() {
		return studentRewardCondition;
	}

	public void setStudentRewardCondition(StudentRewardConditionDto studentRewardCondition) {
		this.studentRewardCondition = studentRewardCondition;
	}

	public SchoolYearDto getSchoolYear() {
		return schoolYear;
	}

	public void setSchoolYear(SchoolYearDto schoolYear) {
		this.schoolYear = schoolYear;
	}

	public Boolean getIsEndCourseYear() {
		return isEndCourseYear;
	}

	public void setIsEndCourseYear(Boolean isEndCourseYear) {
		this.isEndCourseYear = isEndCourseYear;
	}

	public StudentRewardDto() {

	}

	public StudentRewardDto(StudentReward sr) {
		this.id = sr.getId();
		this.decisionDate = sr.getDecisionDate();
		this.reason = sr.getReason();
		if (sr.getReward() != null) {
			this.reward = new RewardDto(sr.getReward());
		}

		if (sr.getSemester() != null) {
			this.semester = new SemesterDto(sr.getSemester());
		}

		if (sr.getStudent() != null) {
			this.student = new StudentDto();
			this.student.setId(sr.getStudent().getId());
			this.student.setDisplayName(sr.getStudent().getDisplayName());
			this.student.setStudentCode(sr.getStudent().getStudentCode());
			if (sr.getStudent().getEnrollmentClass() != null) {
				this.student.setClassName(sr.getStudent().getEnrollmentClass().getClassName());
				this.student.setClassCode(sr.getStudent().getEnrollmentClass().getClassCode());
				if(sr.getStudent().getEnrollmentClass().getCourseyear() != null) {
					this.student.setCourseYear(sr.getStudent().getEnrollmentClass().getCourseyear().getName());
				}
				if(sr.getStudent().getEnrollmentClass().getDepartment() != null) {
					this.student.setDepartment(sr.getStudent().getEnrollmentClass().getDepartment().getName());
				}
				if(sr.getStudent().getEnrollmentClass().getSpeciality() != null) {
					this.student.setSpeciality(sr.getStudent().getEnrollmentClass().getSpeciality().getName());
				}
			}
		}
		if(sr.getSchoolYear() != null) {
			this.schoolYear = new SchoolYearDto();
			this.schoolYear.setId(sr.getSchoolYear().getId());
			this.schoolYear.setCode(sr.getSchoolYear().getCode());
			this.schoolYear.setName(sr.getSchoolYear().getName());
		}
		
		if(sr.getStudentRewardCondition() != null) {
			this.studentRewardCondition = new StudentRewardConditionDto();
			this.studentRewardCondition.setId(sr.getStudentRewardCondition().getId());
			this.studentRewardCondition.setRewardName(sr.getStudentRewardCondition().getRewardName());
		}
		
		this.isEndCourseYear = sr.getIsEndCourseYear();
		
		this.firstStudentSemesterBehaviorMark = sr.getFirstStudentSemesterBehaviorMark();
		this.firstSortStudentSemesterBehaviorMark = sr.getFirstSortStudentSemesterBehaviorMark();
		this.secondStudentSemesterBehaviorMark = sr.getSecondStudentSemesterBehaviorMark();
		this.secondSortStudentSemesterBehaviorMark = sr.getSecondSortStudentSemesterBehaviorMark();
		
		this.firstStudentSemesterSummaryMark = sr.getFirstStudentSemesterSummaryMark();
		this.firstSortStudentSemesterSummaryMark = sr.getFirstSortStudentSemesterSummaryMark();
		this.secondStudentSemesterSummaryMark = sr.getSecondStudentSemesterSummaryMark();
		this.secondSortStudentSemesterSummaryMark = sr.getSecondSortStudentSemesterSummaryMark();
		
		this.studentSchoolYearBehaviorMark = sr.getStudentSchoolYearBehaviorMark();
		this.sortStudentSchoolYearBehaviorMark = sr.getSortStudentSchoolYearBehaviorMark();
		this.studentSchoolYearSummaryMark = sr.getStudentSchoolYearSummaryMark();
		this.sortStudentSchoolYearSummaryMark = sr.getSortStudentSchoolYearSummaryMark();
		
		this.studentSummaryMark = sr.getStudentSummaryMark();
		this.sortStudentSummaryMark = sr.getSortStudentSummaryMark();
		
		this.studentBehaviorSummaryMark = sr.getStudentBehaviorSummaryMark();
		this.sortStudentBehaviorSummaryMark = sr.getSortStudentBehaviorSummaryMark();
		
		this.numberOfDisciplined = sr.getNumberOfDisciplined();
		this.numberOfRewarded = sr.getNumberOfRewarded();
		this.status = sr.getStatus();
		if(this.status != null && this.status == 3) {
			this.isCanCheck = false;
		}else {
			this.isCanCheck = true;
		}
	}
	
	


}
