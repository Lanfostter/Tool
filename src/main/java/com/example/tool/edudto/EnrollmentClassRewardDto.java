package com.example.tool.edudto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.tool.edudto.EnrollmentClassDto;
import com.example.tool.edudto.EnrollmentClassRewardConditionDto;
import com.example.tool.edudto.RewardDecreeDto;
import com.example.tool.edudto.SchoolYearDto;
import com.example.tool.edudto.SemesterDto;
import com.example.tool.edudto.StudentDto;
import com.globits.core.domain.Reward;
import com.globits.core.dto.RewardDto;
import com.globits.education.domain.EnrollmentClass;
import com.globits.education.domain.SchoolYear;
import com.globits.education.domain.Semester;
import com.globits.education.domain.EnrollmentClassReward;
import com.globits.education.domain.EnrollmentClassRewardCondition;
import com.globits.education.domain.RewardDecree;

public class EnrollmentClassRewardDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	private EnrollmentClassDto enrollmentClass; // lớp

	private RewardDto reward; // Khen thưởng
	
	private String reason; // Lý do
	
	private Date decisionDate; // Ngày quyết định
	
	private SemesterDto semester; // Học kỳ
	
	private Long numberOfWarning; //Số sinh viên bị cảnh cáo
	
	private Long numberOfExcellentStudents; //Số sinh viên loại xuất sắc

	private Long numberOfVeryGoodStudents; //Số sinh viên loại giỏi

	private Long numberOfGoodStudents; //Số sinh viên loại khá
	
	private SchoolYearDto schoolYear; //Năm học (Dư thừa dữ liệu nhưng cần để tìm kiếm sinh viên chưa có danh hiệu)
	
	private RewardDecreeDto rewardDecree;
	/*trạng thái
	 * 1: Chưa duyêt, 
	 * 2: Đã được phe chuẩn
	 */
	private Integer status;
	
	private EnrollmentClassRewardConditionDto enrollmentClassRewardCondition; //Danh hiệu của lớp
	private boolean isCanCheck;
	
	public boolean isCanCheck() {
		return isCanCheck;
	}

	public void setCanCheck(boolean isCanCheck) {
		this.isCanCheck = isCanCheck;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Date getDecisionDate() {
		return decisionDate;
	}

	public void setDecisionDate(Date decisionDate) {
		this.decisionDate = decisionDate;
	}

	

	public Long getNumberOfWarning() {
		return numberOfWarning;
	}

	public void setNumberOfWarning(Long numberOfWarning) {
		this.numberOfWarning = numberOfWarning;
	}

	public Long getNumberOfExcellentStudents() {
		return numberOfExcellentStudents;
	}

	public void setNumberOfExcellentStudents(Long numberOfExcellentStudents) {
		this.numberOfExcellentStudents = numberOfExcellentStudents;
	}

	public Long getNumberOfVeryGoodStudents() {
		return numberOfVeryGoodStudents;
	}

	public void setNumberOfVeryGoodStudents(Long numberOfVeryGoodStudents) {
		this.numberOfVeryGoodStudents = numberOfVeryGoodStudents;
	}

	public Long getNumberOfGoodStudents() {
		return numberOfGoodStudents;
	}

	public void setNumberOfGoodStudents(Long numberOfGoodStudents) {
		this.numberOfGoodStudents = numberOfGoodStudents;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	
	
	public EnrollmentClassDto getEnrollmentClass() {
		return enrollmentClass;
	}

	public void setEnrollmentClass(EnrollmentClassDto enrollmentClass) {
		this.enrollmentClass = enrollmentClass;
	}

	public RewardDto getReward() {
		return reward;
	}

	public void setReward(RewardDto reward) {
		this.reward = reward;
	}

	public SemesterDto getSemester() {
		return semester;
	}

	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}

	public SchoolYearDto getSchoolYear() {
		return schoolYear;
	}

	public void setSchoolYear(SchoolYearDto schoolYear) {
		this.schoolYear = schoolYear;
	}

	public RewardDecreeDto getRewardDecree() {
		return rewardDecree;
	}

	public void setRewardDecree(RewardDecreeDto rewardDecree) {
		this.rewardDecree = rewardDecree;
	}

	public EnrollmentClassRewardConditionDto getEnrollmentClassRewardCondition() {
		return enrollmentClassRewardCondition;
	}

	public void setEnrollmentClassRewardCondition(EnrollmentClassRewardConditionDto enrollmentClassRewardCondition) {
		this.enrollmentClassRewardCondition = enrollmentClassRewardCondition;
	}

	public EnrollmentClassRewardDto() {

	}

	public EnrollmentClassRewardDto(EnrollmentClassReward sr) {
		this.id = sr.getId();
		this.decisionDate = sr.getDecisionDate();
		this.reason = sr.getReason();
		if (sr.getReward() != null) {
			this.reward = new RewardDto(sr.getReward());
		}
		if (sr.getSemester() != null) {
			this.semester = new SemesterDto(sr.getSemester());
		}
		if (sr.getEnrollmentClass() != null) {
			this.enrollmentClass = new EnrollmentClassDto();
			this.enrollmentClass.setId(sr.getEnrollmentClass().getId());
			this.enrollmentClass.setClassName(sr.getEnrollmentClass().getClassName());
			this.enrollmentClass.setNumberOfStudent(sr.getEnrollmentClass().getNumberOfStudent());
		}
		if(sr.getSchoolYear() != null) {
			this.schoolYear = new SchoolYearDto();
			this.schoolYear.setId(sr.getSchoolYear().getId());
			this.schoolYear.setCode(sr.getSchoolYear().getCode());
			this.schoolYear.setName(sr.getSchoolYear().getName());
		}
		
		if(sr.getEnrollmentClassRewardCondition() != null) {
			this.enrollmentClassRewardCondition = new EnrollmentClassRewardConditionDto();
			this.enrollmentClassRewardCondition.setId(sr.getEnrollmentClassRewardCondition().getId());
			this.enrollmentClassRewardCondition.setRewardName(sr.getEnrollmentClassRewardCondition().getRewardName());
		}
						
		this.numberOfExcellentStudents = sr.getNumberOfExcellentStudents();
		this.numberOfGoodStudents = sr.getNumberOfGoodStudents();
		this.numberOfVeryGoodStudents = sr.getNumberOfVeryGoodStudents();
		this.numberOfWarning = sr.getNumberOfWarning();
		
		this.status = sr.getStatus();
		if(this.status != null && this.status == 2) {
			this.isCanCheck = false;
		}else {
			this.isCanCheck = true;
		}
	}
}
