package com.example.tool.edudto;
import java.io.Serializable;

public class TuitionSummaryPerSemesterDto implements Serializable {
	private Long semesterId;
	private Long totalCredit;
	private Double totalFee;
	private Double feePerCredit;
	private Long totalRegister;
	
	
	public Long getSemesterId() {
		return semesterId;
	}
	
	public Double getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(Double totalFee) {
		this.totalFee = totalFee;
	}
	public Double getFeePerCredit() {
		return feePerCredit;
	}
	public void setFeePerCredit(Double feePerCredit) {
		this.feePerCredit = feePerCredit;
	}
	
	public Long getTotalCredit() {
		return totalCredit;
	}

	public void setTotalCredit(Long totalCredit) {
		this.totalCredit = totalCredit;
	}

	public Long getTotalRegister() {
		return totalRegister;
	}

	public void setTotalRegister(Long totalRegister) {
		this.totalRegister = totalRegister;
	}

	public void setSemesterId(Long semesterId) {
		this.semesterId = semesterId;
	}

	public TuitionSummaryPerSemesterDto() {
		
	}
	public TuitionSummaryPerSemesterDto(Long semesterId,Long totalCredit,Double feePerCredit,Long totalRegister) {
		if(semesterId!=null) {
			this.semesterId = semesterId;
		}
		else {
			this.semesterId = new Long(0);
		}
		if(totalCredit!=null) {
			this.totalCredit = totalCredit;
		}
		else {
			this.totalCredit = new Long(0);
		}
		if(feePerCredit!=null) {
			this.feePerCredit = feePerCredit;
		}
		else {
			this.feePerCredit = new Double(0);
		}
		if(totalRegister!=null) {
			this.totalRegister = totalRegister;
		}
		else {
			this.totalRegister = new Long(0);
		}
		if(totalCredit!=null && feePerCredit!=null) {
			this.totalFee = totalCredit*feePerCredit;
		}
		else {
			this.totalFee = new Double(0);
		}
	}
	public TuitionSummaryPerSemesterDto(Long totalCredit,Double feePerCredit,Long totalRegister) {
		if(totalCredit!=null)
		this.totalCredit = totalCredit;		
		if(feePerCredit!=null)
		this.feePerCredit = feePerCredit;
		if(totalRegister!=null)
		this.totalRegister = totalRegister;
		if(totalCredit!=null && feePerCredit!=null)
		this.totalFee = totalCredit*feePerCredit;
	}
}
