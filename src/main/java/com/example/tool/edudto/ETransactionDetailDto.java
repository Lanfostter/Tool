package com.example.tool.edudto;

import com.globits.core.dto.BaseObjectDto;
import com.globits.education.domain.ETransactionDetail;
import com.globits.education.dto.ETransactionDto;
import com.globits.education.dto.FeeItemDto;

public class ETransactionDetailDto extends BaseObjectDto{
	
	private ETransactionDto transaction;//Thuộc về sinh viên nào
	
	private FeeItemDto feeItem;
	
	private Double amount=0D;//Số tiền phải thu - chi
	
	private Double discountPercent=0D;//Miễn giảm theo phần trăm
	
	private Double discountAmount=0D;//Số tiền được Miễn giảm

	private Double receivedAmount=0D;
	
	private Double payedAmount=0D;//Số tiền đã trả cho khoản này (trong trường hợp sinh viên nộp nhiều lần)
	
	private Boolean isAcceptedPay;
	
	private String feeItemCode;
	
	public ETransactionDetailDto() {
		super();
		isAcceptedPay = true;
	}
	
	public ETransactionDetailDto(ETransactionDetail entity) {
		super();
		isAcceptedPay = true;
		if(entity!=null) {
			if(entity.getTransaction()!=null) {
				this.transaction = new ETransactionDto();
				this.transaction.setId(entity.getTransaction().getId());
			}
			if(entity.getFeeItem()!=null) {
				this.feeItem = new FeeItemDto(entity.getFeeItem());
			}			
			this.amount = entity.getAmount();
			this.discountPercent = entity.getDiscountPercent();
			this.discountAmount = entity.getDiscountAmount();
			this.receivedAmount = entity.getReceivedAmount();
//			this.payedAmount = entity.getAmount()-entity.getReceivedAmount();
		}		
	}
	
//	public ETransactionDetailDto(ETransactionDto transaction, FeeItemDto feeItem, Double amount, Double discountPercent,
//			Double discountAmount, Double receivedAmount) {
//		super();
//		this.transaction = transaction;
//		this.feeItem = feeItem;
//		this.amount = amount;
//		this.discountPercent = discountPercent;
//		this.discountAmount = discountAmount;
//		this.receivedAmount = receivedAmount;
//	}

	public ETransactionDto getTransaction() {
		return transaction;
	}

	public void setTransaction(ETransactionDto transaction) {
		this.transaction = transaction;
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

	public Double getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(Double discountPercent) {
		this.discountPercent = discountPercent;
	}

	public Double getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(Double discountAmount) {
		this.discountAmount = discountAmount;
	}

	public Double getReceivedAmount() {
		return receivedAmount;
	}

	public void setReceivedAmount(Double receivedAmount) {
		this.receivedAmount = receivedAmount;
	}
	
	public Double getPayedAmount() {
//		if(payedAmount==null) {
//			payedAmount = this.amount-this.receivedAmount;
//		}
		return payedAmount;
	}

	public void setPayedAmount(Double payedAmount) {
		this.payedAmount = payedAmount;
	}

	public Boolean getIsAcceptedPay() {
		return isAcceptedPay;
	}

	public void setIsAcceptedPay(Boolean isAcceptedPay) {
		this.isAcceptedPay = isAcceptedPay;
	}

	public String getFeeItemCode() {
		return feeItemCode;
	}

	public void setFeeItemCode(String feeItemCode) {
		this.feeItemCode = feeItemCode;
	}
}
