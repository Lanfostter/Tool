package com.example.tool.edudto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.globits.education.domain.EnrollmentClassReward;
import com.globits.education.domain.RewardDecree;
import com.globits.education.domain.StudentObjectSubsidizeSemester;
import com.globits.education.domain.StudentReward;
import com.globits.education.dto.EnrollmentClassRewardDto;
import com.globits.education.dto.StudentObjectSubsidizeSemesterDto;
import com.globits.education.dto.StudentRewardDto;

public class RewardDecreeDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String rewardDecreeNumber; //số quyết định
	private Date signDate; // Ngày Ký
//	private Date proclaimDate; // Ngày công bố
	private String content; // Nội dung
	private String signer; // Người ký
	private String rewardLevel; //Khen thưởng cấp
	private String reason; //Lý do
	private String rewardFormat; //Lý do
	private List<StudentRewardDto> studentRewards;
	private List<EnrollmentClassRewardDto> enrollmentClassRewards;
	private List<StudentObjectSubsidizeSemesterDto> subsidizeSemesters;
	
	private List<Long> subsidizeSemesterIds;
	private List<Long> supportLearnSemesterIds;
	
	
	
	public List<Long> getSupportLearnSemesterIds() {
        return supportLearnSemesterIds;
    }

    public void setSupportLearnSemesterIds(List<Long> supportLearnSemesterIds) {
        this.supportLearnSemesterIds = supportLearnSemesterIds;
    }

    public List<Long> getSubsidizeSemesterIds() {
		return subsidizeSemesterIds;
	}

	public void setSubsidizeSemesterIds(List<Long> subsidizeSemesterIds) {
		this.subsidizeSemesterIds = subsidizeSemesterIds;
	}

	public List<StudentObjectSubsidizeSemesterDto> getStudentObjectSubsidizeSemesters() {
		return subsidizeSemesters;
	}

	public void setStudentObjectSubsidizeSemesters(List<StudentObjectSubsidizeSemesterDto> studentObjectSubsidizeSemesters) {
		this.subsidizeSemesters = studentObjectSubsidizeSemesters;
	}

	public List<EnrollmentClassRewardDto> getEnrollmentClassRewards() {
		return enrollmentClassRewards;
	}

	public void setEnrollmentClassRewards(List<EnrollmentClassRewardDto> enrollmentClassRewards) {
		this.enrollmentClassRewards = enrollmentClassRewards;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRewardDecreeNumber() {
		return rewardDecreeNumber;
	}

	public void setRewardDecreeNumber(String rewardDecreeNumber) {
		this.rewardDecreeNumber = rewardDecreeNumber;
	}

	public Date getSignDate() {
		return signDate;
	}

	public void setSignDate(Date signDate) {
		this.signDate = signDate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSigner() {
		return signer;
	}

	public void setSigner(String signer) {
		this.signer = signer;
	}

	public String getRewardLevel() {
		return rewardLevel;
	}

	public void setRewardLevel(String rewardLevel) {
		this.rewardLevel = rewardLevel;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getRewardFormat() {
		return rewardFormat;
	}

	public void setRewardFormat(String rewardFormat) {
		this.rewardFormat = rewardFormat;
	}

	public List<StudentRewardDto> getStudentRewards() {
		return studentRewards;
	}

	public void setStudentRewards(List<StudentRewardDto> studentRewards) {
		this.studentRewards = studentRewards;
	}

	public RewardDecreeDto() {

	}

	public RewardDecreeDto(RewardDecree as) {
		if(as != null) {
			this.id = as.getId();
			this.signDate = as.getSignDate();
			this.content = as.getContent();
			this.rewardDecreeNumber = as.getRewardDecreeNumber();		
			this.signer = as.getSigner();
			this.rewardLevel = as.getRewardLevel();
			this.reason = as.getReason();
			this.rewardFormat = as.getRewardFormat();
			if(as.getStudentRewards() != null && as.getStudentRewards().size() > 0) {
				this.studentRewards = new ArrayList<StudentRewardDto>();
				for (StudentReward studentReward : as.getStudentRewards()) {
					this.studentRewards.add(new StudentRewardDto(studentReward));
				}
			}
			
			if(as.getEnrollmentClassRewards() != null && as.getEnrollmentClassRewards().size() > 0) {
				this.enrollmentClassRewards = new ArrayList<EnrollmentClassRewardDto>();
				for (EnrollmentClassReward enrollmentClassReward : as.getEnrollmentClassRewards()) {
					this.enrollmentClassRewards.add(new EnrollmentClassRewardDto(enrollmentClassReward));
				}
			}
			
			if(as.getStudentObjectSubsidizeSemesters() != null && as.getStudentObjectSubsidizeSemesters().size() > 0) {
				this.subsidizeSemesters = new ArrayList<StudentObjectSubsidizeSemesterDto>();
				for (StudentObjectSubsidizeSemester studentObjectSubsidizeSemester : as.getStudentObjectSubsidizeSemesters()) {
					this.subsidizeSemesters.add(new StudentObjectSubsidizeSemesterDto(studentObjectSubsidizeSemester));
				}
			}
		}
	}

}
