package com.example.tool.edudto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.globits.core.domain.BaseObject;
import com.globits.education.domain.DiscountTuitionFee;
import com.globits.education.domain.DiscountTuitionFeeItem;
import com.globits.education.domain.FeeItem;
import com.globits.education.domain.Semester;
import com.globits.education.domain.StudentObject;
import com.globits.education.dto.DiscountTuitionFeeDto;
import com.globits.education.dto.FeeItemDto;

public class DiscountTuitionFeeItemDto extends BaseObject {
	private static final long serialVersionUID = -2860077156878857922L;
	
	private Long id;
	private DiscountTuitionFeeDto discountTuitionFee;
	private FeeItemDto feeItem;
	private Float proportionDiscount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DiscountTuitionFeeDto getDiscountTuitionFee() {
		return discountTuitionFee;
	}

	public void setDiscountTuitionFee(DiscountTuitionFeeDto discountTuitionFee) {
		this.discountTuitionFee = discountTuitionFee;
	}

	public FeeItemDto getFeeItem() {
		return feeItem;
	}

	public void setFeeItem(FeeItemDto feeItem) {
		this.feeItem = feeItem;
	}

	public Float getProportionDiscount() {
		return proportionDiscount;
	}

	public void setProportionDiscount(Float proportionDiscount) {
		this.proportionDiscount = proportionDiscount;
	}

	public DiscountTuitionFeeItemDto() {
		
	}
	
	public DiscountTuitionFeeItemDto(DiscountTuitionFeeItem discountTuitionFeeItem) {
		if(discountTuitionFeeItem != null) {
			this.id = discountTuitionFeeItem.getId();
			this.proportionDiscount = discountTuitionFeeItem.getProportionDiscount();
			if(discountTuitionFeeItem.getDiscountTuitionFee() != null) {
				DiscountTuitionFeeDto discountTuitionFeeDto = new DiscountTuitionFeeDto();
				discountTuitionFeeDto.setId(discountTuitionFeeItem.getDiscountTuitionFee().getId());
				this.discountTuitionFee = discountTuitionFeeDto;
			}
			if(discountTuitionFeeItem.getFeeItem() != null) {
				FeeItemDto feeItemDto = new FeeItemDto();
				feeItemDto.setId(discountTuitionFeeItem.getFeeItem().getId());
				feeItemDto.setName(discountTuitionFeeItem.getFeeItem().getName());
				feeItemDto.setCode(discountTuitionFeeItem.getFeeItem().getCode());
				this.feeItem = feeItemDto;
			}
		}
	}
}
