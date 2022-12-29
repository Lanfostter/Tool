package com.example.tool.edudto;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.globits.core.dto.BaseObjectDto;
import com.globits.education.domain.Certificate;
import com.globits.education.domain.EducationVoucher;
import com.globits.education.domain.EducationVoucherDetail;
import com.globits.education.domain.ReceivePayAble;
import com.globits.education.domain.VoucherDetailRecievePayAbleLink;
import com.globits.education.dto.EducationVoucherDetailDto;
import com.globits.education.dto.ReceivePayAbleDto;

public class VoucherDetailRecievePayAbleLinkDto extends BaseObjectDto implements Serializable {
	/**
	 * 
	 */
	private ReceivePayAbleDto receivePayAble;
	
	private EducationVoucherDetailDto educationVoucherDetail;
	
	private double amount;//Số tiền thu - chi

	private Integer isReceive;//Khoản thu = 1, Khoản chi = -1

	private Date voucherDate;
	
	public ReceivePayAbleDto getReceivePayAble() {
		return receivePayAble;
	}

	public void setReceivePayAble(ReceivePayAbleDto receivePayAble) {
		this.receivePayAble = receivePayAble;
	}

	public EducationVoucherDetailDto getEducationVoucherDetail() {
		return educationVoucherDetail;
	}

	public void setEducationVoucherDetail(EducationVoucherDetailDto educationVoucherDetail) {
		this.educationVoucherDetail = educationVoucherDetail;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Integer getIsReceive() {
		return isReceive;
	}

	public void setIsReceive(Integer isReceive) {
		this.isReceive = isReceive;
	}
	
	public VoucherDetailRecievePayAbleLinkDto() {
		
	}
	public VoucherDetailRecievePayAbleLinkDto(VoucherDetailRecievePayAbleLink entity) {
		if(entity!=null) {
			this.id = entity.getId();
			this.amount = entity.getAmount();
			this.isReceive = entity.getIsReceive();
			if(entity.getReceivePayAble()!=null) {
				this.receivePayAble = new ReceivePayAbleDto();
				this.receivePayAble.setId(entity.getReceivePayAble().getId());
			}
			if(entity.getEducationVoucherDetail()!=null) {
				this.educationVoucherDetail = new EducationVoucherDetailDto();
				this.educationVoucherDetail.setId(entity.getEducationVoucherDetail().getId());
			}
			this.voucherDate = entity.getVoucherDate();
		}		
	}
	
}
