package com.example.tool.edudto;
import java.io.Serializable;

public class TuitionSummaryPerSemesterSubjectDto implements Serializable {
	
	private Long semesterId;
	private Long semesterSubjectId;
	private Long subjectId;
	private long totalCredit;
	private double totalFee;
	private double feePerCredit;
	private long totalRegister;
	private String subjectName; 
	
	public Long getSemesterId() {
		return semesterId;
	}
	public void setSemesterId(Long semesterId) {
		this.semesterId = semesterId;
	}
	public Long getSemesterSubjectId() {
		return semesterSubjectId;
	}
	public void setSemesterSubjectId(Long semesterSubjectId) {
		this.semesterSubjectId = semesterSubjectId;
	}
	public Long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}
	public long getTotalCredit() {
		return totalCredit;
	}
	public void setTotalCredit(long totalCredit) {
		this.totalCredit = totalCredit;
	}
	public double getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(double totalFee) {
		this.totalFee = totalFee;
	}
	public double getFeePerCredit() {
		return feePerCredit;
	}
	public void setFeePerCredit(double feePerCredit) {
		this.feePerCredit = feePerCredit;
	}
	public long getTotalRegister() {
		return totalRegister;
	}
	public void setTotalRegister(long totalRegister) {
		this.totalRegister = totalRegister;
	}	
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public TuitionSummaryPerSemesterSubjectDto() {
		
	}
	public TuitionSummaryPerSemesterSubjectDto(Long semesterSubjectId,long totalCredit,double feePerCredit) {
		if(semesterSubjectId!=null) {
			this.semesterSubjectId = semesterSubjectId;
		}
		
		this.totalCredit = totalCredit;
		this.feePerCredit = feePerCredit;
	}
	public TuitionSummaryPerSemesterSubjectDto(Long semesterSubjectId,Long semesterId,Long subjectId,Long totalCredit,Double feePerCredit) {
		if(semesterSubjectId!=null) {
			this.semesterSubjectId = semesterSubjectId;
		}
		if(semesterId!=null) {
			this.semesterId = semesterId;
		}
		if(subjectId!=null) {
			this.subjectId = subjectId;
		}
		if(totalCredit!=null) {
			this.totalCredit = totalCredit;
		}	
		if(feePerCredit!=null)
		this.feePerCredit = feePerCredit;
	}
	public TuitionSummaryPerSemesterSubjectDto(Long semesterSubjectId,Long semesterId,Long subjectId,Long totalCredit,Double feePerCredit,Long totalRegister) {
		if(semesterSubjectId!=null) {
			this.semesterSubjectId = semesterSubjectId;
		}
		if(semesterId!=null) {
			this.semesterId = semesterId;
		}
		if(subjectId!=null) {
			this.subjectId = subjectId;
		}
		if(totalCredit!=null) {
			this.totalCredit = totalCredit;
		}	
		if(feePerCredit!=null)
		this.feePerCredit = feePerCredit;
		if(totalRegister!=null)
			this.totalRegister = totalRegister;
	}
	public TuitionSummaryPerSemesterSubjectDto(Long semesterSubjectId,Long semesterId,Long subjectId,Long totalCredit,Double feePerCredit,Long totalRegister,String subjectName) {
		if(semesterSubjectId!=null) {
			this.semesterSubjectId = semesterSubjectId;
		}
		if(semesterId!=null) {
			this.semesterId = semesterId;
		}
		if(subjectId!=null) {
			this.subjectId = subjectId;
		}
		if(totalCredit!=null) {
			this.totalCredit = totalCredit;
		}	
		if(feePerCredit!=null)
		this.feePerCredit = feePerCredit;
		if(totalRegister!=null)
			this.totalRegister = totalRegister;
		if(subjectName!=null) {
			this.subjectName = subjectName;
		}
	}
}
