package com.example.tool.edudto;
import java.io.Serializable;
import java.util.List;

import com.globits.education.dto.TuitionSummaryPerSemesterDto;
import com.globits.education.dto.TuitionSummaryPerSemesterSubjectDto;

public class TuitionDto implements Serializable {
	private Long semesterId;
	private Long totalCredit;
	private Double totalFee;
	private Double feePerCredit;
	private Long totalRegister;
	private TuitionSummaryPerSemesterDto tuitionSummaryPerSemesterDto;
	private List<TuitionSummaryPerSemesterSubjectDto> tuitionSummaryPerSemesterSubjectDtos;
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

	public TuitionDto() {
		
	}
	public TuitionDto(Long semesterId,Long totalCredit,Double feePerCredit,Long totalRegister) {
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
	
	public TuitionSummaryPerSemesterDto getTuitionSummaryPerSemesterDto() {
		return tuitionSummaryPerSemesterDto;
	}

	public void setTuitionSummaryPerSemesterDto(TuitionSummaryPerSemesterDto tuitionSummaryPerSemesterDto) {
		this.tuitionSummaryPerSemesterDto = tuitionSummaryPerSemesterDto;
	}

	public List<TuitionSummaryPerSemesterSubjectDto> getTuitionSummaryPerSemesterSubjectDtos() {
		return tuitionSummaryPerSemesterSubjectDtos;
	}

	public void setTuitionSummaryPerSemesterSubjectDtos(
			List<TuitionSummaryPerSemesterSubjectDto> tuitionSummaryPerSemesterSubjectDtos) {
		this.tuitionSummaryPerSemesterSubjectDtos = tuitionSummaryPerSemesterSubjectDtos;
	}

	public TuitionDto(Long totalCredit,Double feePerCredit,Long totalRegister,TuitionSummaryPerSemesterDto tuitionSummaryPerSemesterDto,List<TuitionSummaryPerSemesterSubjectDto> tuitionSummaryPerSemesterSubjectDtos) {
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
		
		if(tuitionSummaryPerSemesterDto!=null)
			this.tuitionSummaryPerSemesterDto=tuitionSummaryPerSemesterDto;
		if(tuitionSummaryPerSemesterSubjectDtos!=null)
			this.tuitionSummaryPerSemesterSubjectDtos=tuitionSummaryPerSemesterSubjectDtos;
	}
}
