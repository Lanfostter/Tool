package com.example.tool.edudto;

public class ScholarshipSummaryFundDto {
	private String fundCode;
	private Double amount;
	private Double receivedAmount;
	private Double tuitionFeeBalance;//Trừ học phí
	private Double stockAmount;//Còn tồn : amount - receivedAmount - tuitionFeeBalance
	public String getFundCode() {
		return fundCode;
	}
	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getReceivedAmount() {
		return receivedAmount;
	}
	public void setReceivedAmount(Double receivedAmount) {
		this.receivedAmount = receivedAmount;
	}
	public Double getTuitionFeeBalance() {
		return tuitionFeeBalance;
	}
	public void setTuitionFeeBalance(Double tuitionFeeBalance) {
		this.tuitionFeeBalance = tuitionFeeBalance;
	}
	public Double getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(Double stockAmount) {
		this.stockAmount = stockAmount;
	}
	
	
}
