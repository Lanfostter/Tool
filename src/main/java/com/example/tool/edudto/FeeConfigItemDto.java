package com.example.tool.edudto;

import java.io.Serializable;

import com.globits.education.domain.FeeConfigItem;
import com.globits.education.domain.FeeItem;
import com.globits.education.domain.SchoolFeeConfig;
import com.globits.education.dto.FeeItemDto;
import com.globits.education.dto.SchoolFeeConfigDto;

public class FeeConfigItemDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private SchoolFeeConfigDto schoolFeeConfig;
	private FeeItemDto feeItem;
	private Double amount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

	public SchoolFeeConfigDto getSchoolFeeConfig() {
		return schoolFeeConfig;
	}

	public void setSchoolFeeConfig(SchoolFeeConfigDto schoolFeeConfig) {
		this.schoolFeeConfig = schoolFeeConfig;
	}

	public FeeItemDto getFeeItem() {
		return feeItem;
	}

	public void setFeeItem(FeeItemDto feeItem) {
		this.feeItem = feeItem;
	}

	

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public FeeConfigItemDto() {

	}

	public FeeConfigItemDto(FeeConfigItem cy) {
		if(cy !=null) {
			this.id = cy.getId();
			this.amount=cy.getAmount();
			if(cy.getFeeItem()!=null)
			this.feeItem=new FeeItemDto(cy.getFeeItem());
			if(cy.getSchoolFeeConfig()!=null) {
				this.schoolFeeConfig=new SchoolFeeConfigDto();
				this.schoolFeeConfig.setId(cy.getSchoolFeeConfig().getId());
				this.schoolFeeConfig.setIsCurrent(cy.getSchoolFeeConfig().getIsCurrent());
				this.schoolFeeConfig.setFromDate(cy.getSchoolFeeConfig().getFromDate());
				this.schoolFeeConfig.setToDate(cy.getSchoolFeeConfig().getToDate());
			}
			
			
		}
	}
}
