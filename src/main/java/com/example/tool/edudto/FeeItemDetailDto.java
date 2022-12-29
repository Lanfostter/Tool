package com.example.tool.edudto;
import java.io.Serializable;
import com.globits.education.domain.Certificate;
import com.globits.education.domain.FeeItem;
import com.globits.education.domain.FeeItemDetail;
import com.globits.education.dto.FeeItemDto;

public class FeeItemDetailDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String code;
	private FeeItemDto feeItem;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public FeeItemDto getFeeItem() {
		return feeItem;
	}
	public void setFeeItem(FeeItemDto feeItem) {
		this.feeItem = feeItem;
	}
	public FeeItemDetailDto() {

	}

	public FeeItemDetailDto(FeeItemDetail c) {
		this.id = c.getId();
		this.name = c.getName();
		this.code = c.getCode();
		if(c.getFeeItem() != null) {
			this.feeItem = new FeeItemDto();
			this.feeItem.setId(c.getFeeItem().getId());
			this.feeItem.setCode(c.getFeeItem().getCode());
			this.feeItem.setName(c.getFeeItem().getName());
		}
		
	}
}
