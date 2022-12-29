package com.example.tool.edudto;

import java.util.List;

import com.globits.education.dto.ScholarshipSummaryFundDto;

public class ScholarshipSummaryDto {
	private String studentCode;
	private String firstName;
	private String lastName;
	private String classCode;
	
	private Double amount=0D;//Tổng tiền học bổng của tất cả các loại
	private Double receivedAmount=0D;//Tổng tiền đã nhận của tất cả các loại
	private Double tuitionFeeBalance=0D;//Trừ học phí
	private Double balanceValue=0D;//Số tiền điều chỉnh, luy kế đến thời điểm hiện tại
	private Double stockAmount=0D;//Còn tồn : amount - receivedAmount - tuitionFeeBalance
//
	private Double currentAmount=0D;//Tiền học bổng kỳ này
	private Double currentReceivedAmount=0D;//Tổng tiền học bổng đã nhận kỳ này
	private Double currentTuitionFeeBalance=0D;//Tiền học bổng đã trừ học phí kỳ này
	private Double currentWithdrawValue=0D;
	private Double currentBalanceValue=0D;
	private Double currentStockAmount=0D;//Tiền học bổng còn tồn
//	
	private Double prevAmount=0D;//Tổng tiền học bổng của tất cả các loại của kỳ trước
	private Double prevReceivedAmount=0D;//Tổng tiền đã nhận của tất cả các loại của kỳ trước
	private Double prevTuitionFeeBalance=0D;//Trừ học phí của kỳ trước
	private Double prevBalanceValue=0D;//Giá trị điều chỉnh học bổng kỳ trước - lấy từ bảng StudentSemesterScholarship ra để  điền vào
	private Double prevStockAmount=0D;//Còn tồn : (amount - receivedAmount - tuitionFeeBalance) của kỳ trước
	
	private List<ScholarshipSummaryFundDto> lastSummaryFundDto;//Kỳ trước
	private List<ScholarshipSummaryFundDto> currentSummaryFundDto;//Kỳ này
	public String getStudentCode() {
		return studentCode;
	}
	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getClassCode() {
		return classCode;
	}
	public void setClassCode(String classCode) {
		this.classCode = classCode;
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
	public Double getBalanceValue() {
		return balanceValue;
	}
	public void setBalanceValue(Double balanceValue) {
		this.balanceValue = balanceValue;
	}
	public Double getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(Double stockAmount) {
		this.stockAmount = stockAmount;
	}	
//
	public Double getPrevAmount() {
		return prevAmount;
	}
	public Double getCurrentAmount() {
		return currentAmount;
	}
	public void setCurrentAmount(Double currentAmount) {
		this.currentAmount = currentAmount;
	}
	public Double getCurrentReceivedAmount() {
		return currentReceivedAmount;
	}
	public void setCurrentReceivedAmount(Double currentReceivedAmount) {
		this.currentReceivedAmount = currentReceivedAmount;
	}
	
	public Double getCurrentWithdrawValue() {
		return currentWithdrawValue;
	}
	public void setCurrentWithdrawValue(Double currentWithdrawValue) {
		this.currentWithdrawValue = currentWithdrawValue;
	}
	public Double getCurrentBalanceValue() {
		return currentBalanceValue;
	}
	public void setCurrentBalanceValue(Double currentBalanceValue) {
		this.currentBalanceValue = currentBalanceValue;
	}
	public Double getCurrentTuitionFeeBalance() {
		return currentTuitionFeeBalance;
	}
	public void setCurrentTuitionFeeBalance(Double currentTuitionFeeBalance) {
		this.currentTuitionFeeBalance = currentTuitionFeeBalance;
	}
	public Double getCurrentStockAmount() {
		return currentStockAmount;
	}
	public void setCurrentStockAmount(Double currentStockAmount) {
		this.currentStockAmount = currentStockAmount;
	}
//	
	public void setPrevAmount(Double prevAmount) {
		this.prevAmount = prevAmount;
	}
	public Double getPrevReceivedAmount() {
		return prevReceivedAmount;
	}
	public void setPrevReceivedAmount(Double prevReceivedAmount) {
		this.prevReceivedAmount = prevReceivedAmount;
	}
	public Double getPrevTuitionFeeBalance() {
		return prevTuitionFeeBalance;
	}
	public void setPrevTuitionFeeBalance(Double prevTuitionFeeBalance) {
		this.prevTuitionFeeBalance = prevTuitionFeeBalance;
	}
	public Double getPrevStockAmount() {
		return prevStockAmount;
	}
	public void setPrevStockAmount(Double prevStockAmount) {
		this.prevStockAmount = prevStockAmount;
	}
	public List<ScholarshipSummaryFundDto> getLastSummaryFundDto() {
		return lastSummaryFundDto;
	}
	public void setLastSummaryFundDto(List<ScholarshipSummaryFundDto> lastSummaryFundDto) {
		this.lastSummaryFundDto = lastSummaryFundDto;
	}
	public List<ScholarshipSummaryFundDto> getCurrentSummaryFundDto() {
		return currentSummaryFundDto;
	}
	public void setCurrentSummaryFundDto(List<ScholarshipSummaryFundDto> currentSummaryFundDto) {
		this.currentSummaryFundDto = currentSummaryFundDto;
	}
	public Double getPrevBalanceValue() {
		return prevBalanceValue;
	}
	public void setPrevBalanceValue(Double prevBalanceValue) {
		this.prevBalanceValue = prevBalanceValue;
	}
	
	public ScholarshipSummaryDto() {
		
	}
	public ScholarshipSummaryDto(Double stockAmount, String studentCode) {
		this.stockAmount = stockAmount;
		this.studentCode = studentCode;
	}
	
}
