package com.example.tool.edudto;

import java.util.Date;

import com.globits.education.domain.FeeItemDetail;
import com.globits.education.domain.ReceivePayAbleDetail;
import com.globits.education.domain.ScholarshipFund;
import com.globits.education.domain.StudentExpectationRegister;
import com.globits.education.domain.StudentScholarshipHistory;
import com.globits.education.domain.StudentSemesterScholarship;
import com.globits.education.domain.StudentTuitionFeeCalculate;
import com.globits.education.dto.FeeItemDetailDto;
import com.globits.education.dto.FeeItemDto;
import com.globits.education.dto.ReceivePayAbleDetailDto;
import com.globits.education.dto.ReceivePayAbleDto;
import com.globits.education.dto.ScholarshipFundDto;
import com.globits.education.dto.StudentExpectationRegisterDto;
import com.globits.education.dto.StudentScholarshipHistoryDto;
import com.globits.education.dto.StudentSemesterScholarshipDto;
import com.globits.education.dto.StudentTuitionFeeCalculateDto;

public class ReceivePayAbleDetailDto {
	
	private Long id;
	private ReceivePayAbleDto receivePayAble;

	private FeeItemDto feeItem;
	private FeeItemDetailDto feeItemDetail;//Loại khoản chi tiết: học bổng chính sách, học bổng KKHT, học phí nâng điểm
	private StudentTuitionFeeCalculateDto  studentTuition;//khoản Học phí
	private ReceivePayAbleDetailDto receivePayAbleDetail;//Điều chỉnh cho khoản nào
	private StudentExpectationRegisterDto studentExpectationRegister;//Lần đăng ký thi
	private StudentScholarshipHistoryDto studentScholarshipHistory;//Khoản điều chỉnh học bổng 
	//Số tiền
	private Double amount;
	//Phần trăm miễn giảm
	private Double discountPercent;
	//Số tiền miễn giảm
	private Double discountAmount;
	//Số tiền thực thu sau khi trừ các khoản miễn giảm
	private Double totalAmount;
	//Ghi chú
	private String note;
	// 1 = Khoản phải thu, -1 = khoản phải chi	
	private Integer isReceive;
	
	/*
	 * Loại:
	 * 0:học phí
	 * -1: loại khác
	 * Các trường hợp khác nếu cần sẽ bổ sung sau
	 */	
	private Integer type;
	
	private Double withdrawalValue;//Số tiền đã rút ra
	
	private Double transferValue;//Số tiền đã kết chuyển sang khoản khác
	/*
	 * Quỹ học bổng, nếu thuộc loại học bổng
	 */
	private ScholarshipFundDto scholarshipFund;
	/*
	 * Khoản học bổng, nếu thuộc loại học bổng
	 */
	private StudentSemesterScholarshipDto studentSemesterScholarship;

	public ReceivePayAbleDto getReceivePayAble() {
		return receivePayAble;
	}

	public void setReceivePayAble(ReceivePayAbleDto receivePayAble) {
		this.receivePayAble = receivePayAble;
	}

	public FeeItemDto getFeeItem() {
		return feeItem;
	}

	public ReceivePayAbleDetailDto getReceivePayAbleDetail() {
		return receivePayAbleDetail;
	}

	public void setReceivePayAbleDetail(ReceivePayAbleDetailDto receivePayAbleDetail) {
		this.receivePayAbleDetail = receivePayAbleDetail;
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

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public StudentScholarshipHistoryDto getStudentScholarshipHistory() {
		return studentScholarshipHistory;
	}

	public void setStudentScholarshipHistory(StudentScholarshipHistoryDto studentScholarshipHistory) {
		this.studentScholarshipHistory = studentScholarshipHistory;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Integer getIsReceive() {
		return isReceive;
	}

	public void setIsReceive(Integer isReceive) {
		this.isReceive = isReceive;
	}

	public StudentExpectationRegisterDto getStudentExpectationRegister() {
		return studentExpectationRegister;
	}

	public void setStudentExpectationRegister(StudentExpectationRegisterDto studentExpectationRegister) {
		this.studentExpectationRegister = studentExpectationRegister;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
	
	public Double getWithdrawalValue() {
		return withdrawalValue;
	}

	public void setWithdrawalValue(Double withdrawalValue) {
		this.withdrawalValue = withdrawalValue;
	}

	public Double getTransferValue() {
		return transferValue;
	}

	public void setTransferValue(Double transferValue) {
		this.transferValue = transferValue;
	}

	public ScholarshipFundDto getScholarshipFund() {
		return scholarshipFund;
	}

	public void setScholarshipFund(ScholarshipFundDto scholarshipFund) {
		this.scholarshipFund = scholarshipFund;
	}

	public StudentSemesterScholarshipDto getStudentSemesterScholarship() {
		return studentSemesterScholarship;
	}

	public void setStudentSemesterScholarship(StudentSemesterScholarshipDto studentSemesterScholarship) {
		this.studentSemesterScholarship = studentSemesterScholarship;
	}

	public FeeItemDetailDto getFeeItemDetail() {
		return feeItemDetail;
	}

	public void setFeeItemDetail(FeeItemDetailDto feeItemDetail) {
		this.feeItemDetail = feeItemDetail;
	}

	public StudentTuitionFeeCalculateDto getStudentTuition() {
		return studentTuition;
	}

	public void setStudentTuition(StudentTuitionFeeCalculateDto studentTuition) {
		this.studentTuition = studentTuition;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ReceivePayAbleDetailDto() {
		
	}
	public ReceivePayAbleDetailDto(ReceivePayAbleDetail receivePayAbleDetail) {
		this.id = receivePayAbleDetail.getId();
		this.amount = receivePayAbleDetail.getAmount();
		this.discountAmount = receivePayAbleDetail.getDiscountAmount();
		this.discountPercent = receivePayAbleDetail.getDiscountPercent();
		this.isReceive = receivePayAbleDetail.getIsReceive();
		this.note = receivePayAbleDetail.getNote();
		this.totalAmount = receivePayAbleDetail.getTotalAmount();
		this.type = receivePayAbleDetail.getType();
		if(receivePayAbleDetail.getFeeItem()!=null)
			this.feeItem = new FeeItemDto(receivePayAbleDetail.getFeeItem());
		if(receivePayAbleDetail.getReceivePayAble()!=null)
			this.receivePayAble = new ReceivePayAbleDto(receivePayAbleDetail.getReceivePayAble());
		this.withdrawalValue = receivePayAbleDetail.getWithdrawalValue();
		this.transferValue = receivePayAbleDetail.getTransferValue();
		if(receivePayAbleDetail.getScholarshipFund() != null) {
			this.scholarshipFund = new ScholarshipFundDto();
			this.scholarshipFund.setId(receivePayAbleDetail.getScholarshipFund().getId());
			this.scholarshipFund.setCode(receivePayAbleDetail.getScholarshipFund().getCode());
			this.scholarshipFund.setName(receivePayAbleDetail.getScholarshipFund().getName());
		}
		if(receivePayAbleDetail.getStudentSemesterScholarship() != null) {
			this.studentSemesterScholarship = new StudentSemesterScholarshipDto();
			this.studentSemesterScholarship.setId(receivePayAbleDetail.getStudentSemesterScholarship().getId());
		}
		if(receivePayAbleDetail.getFeeItemDetail() != null) {
			this.feeItemDetail = new FeeItemDetailDto();
			this.feeItemDetail.setId(receivePayAbleDetail.getFeeItemDetail().getId());
			this.feeItemDetail.setCode(receivePayAbleDetail.getFeeItemDetail().getCode());
			this.feeItemDetail.setName(receivePayAbleDetail.getFeeItemDetail().getName());
		}
		if(receivePayAbleDetail.getStudentTuition() != null) {
			this.studentTuition = new StudentTuitionFeeCalculateDto();
			this.studentTuition.setId(receivePayAbleDetail.getStudentTuition().getId());
			this.studentTuition.setCalculateDate(receivePayAbleDetail.getStudentTuition().getCalculateDate());
			this.studentTuition.setTotalTuitionFee(receivePayAbleDetail.getStudentTuition().getTotalTuitionFee());
			this.studentTuition.setFirstTimeLearnFee(receivePayAbleDetail.getStudentTuition().getFirstTimeLearnFee());
			this.studentTuition.setRelearnFee(receivePayAbleDetail.getStudentTuition().getRelearnFee());
			this.studentTuition.setUpgradeMarkFee(receivePayAbleDetail.getStudentTuition().getUpgradeMarkFee());
			this.studentTuition.setDiscountPercent(receivePayAbleDetail.getStudentTuition().getDiscountPercent());
			this.studentTuition.setIsLock(receivePayAbleDetail.getStudentTuition().getIsLock());
			this.studentTuition.setDiscountValue(receivePayAbleDetail.getStudentTuition().getDiscountValue());
			this.studentTuition.setAccount(receivePayAbleDetail.getStudentTuition().getAccount());
			this.studentTuition.setType(receivePayAbleDetail.getStudentTuition().getType());
		}
		if(receivePayAbleDetail.getReceivePayAbleDetail() != null) {
			this.receivePayAbleDetail = new ReceivePayAbleDetailDto();
			this.receivePayAbleDetail.setId(receivePayAbleDetail.getReceivePayAbleDetail().getId());
			this.receivePayAbleDetail.setAmount(receivePayAbleDetail.getReceivePayAbleDetail().getAmount());
			this.receivePayAbleDetail.setDiscountPercent(receivePayAbleDetail.getReceivePayAbleDetail().getDiscountPercent());
			this.receivePayAbleDetail.setDiscountAmount(receivePayAbleDetail.getReceivePayAbleDetail().getDiscountAmount());
			this.receivePayAbleDetail.setTotalAmount(receivePayAbleDetail.getReceivePayAbleDetail().getTotalAmount());
			this.receivePayAbleDetail.setIsReceive(receivePayAbleDetail.getReceivePayAbleDetail().getIsReceive());
			this.receivePayAbleDetail.setType(receivePayAbleDetail.getReceivePayAbleDetail().getType());
			this.receivePayAbleDetail.setWithdrawalValue(receivePayAbleDetail.getReceivePayAbleDetail().getWithdrawalValue());
			this.receivePayAbleDetail.setTransferValue(receivePayAbleDetail.getReceivePayAbleDetail().getTransferValue());
		}
		if(receivePayAbleDetail.getStudentExpectationRegister() != null) {
			this.studentExpectationRegister = new StudentExpectationRegisterDto();
			this.studentExpectationRegister.setId(receivePayAbleDetail.getStudentExpectationRegister().getId());
			this.studentExpectationRegister.setFee(receivePayAbleDetail.getStudentExpectationRegister().getFee());
			this.studentExpectationRegister.setCheckedFee(receivePayAbleDetail.getStudentExpectationRegister().getCheckedFee());
			this.studentExpectationRegister.setStatus(receivePayAbleDetail.getStudentExpectationRegister().getStatus());
		}
		if(receivePayAbleDetail.getStudentScholarshipHistory() != null) {
			this.studentScholarshipHistory = new StudentScholarshipHistoryDto();
			this.studentScholarshipHistory.setId(receivePayAbleDetail.getStudentScholarshipHistory().getId());
			this.studentScholarshipHistory.setAmount(receivePayAbleDetail.getStudentScholarshipHistory().getAmount());
			this.studentScholarshipHistory.setAmountBefore(receivePayAbleDetail.getStudentScholarshipHistory().getAmountBefore());
			this.studentScholarshipHistory.setDateModify(receivePayAbleDetail.getStudentScholarshipHistory().getDateModify());
			this.studentScholarshipHistory.setUserModify(receivePayAbleDetail.getStudentScholarshipHistory().getUserModify());
		}
	}
}
