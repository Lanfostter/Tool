package com.example.tool.edudto;

import java.io.Serializable;

import com.globits.education.domain.EducationVoucherDetail;
import com.globits.education.dto.EducationVoucherDto;
import com.globits.education.dto.FeeItemDetailDto;
import com.globits.education.dto.FeeItemDto;
import com.globits.education.dto.SemesterDto;

public class EducationVoucherDetailDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private EducationVoucherDto educationVoucher;
	private Double amount;//Số tiền thu - chi
	private Double discountPercent;//Miễn giảm theo phần trăm
	private Double discountAmount;//Số tiền được Miễn giảm
	private Double receivedAmount;//Số tiền thực thu - chi
	private Integer isCredit;//Khoản thu = 1, Khoản chi = -1
	private FeeItemDto feeItem;
//	private Boolean isRecived=false;//tình trạng thu
	
	private FeeItemDetailDto feeItemDetail;
	private String note;
//	private ReceivePayAbleDto receivePayAble;//Thu cho khoản phải thu chi tiết nào?
//	private ReceivePayAbleDetailDto receivePayAbleDetail;//Thu cho khoản phải thu chi tiết nào?
	private Double amountDone;//số tiền đã kết chuyển cho các khoản khác
	private Boolean checked;//dùng để sử dụng checkbox khi thu tiền lại
	private Boolean status;//tình trạng thu phí nhập học
	private Integer type;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EducationVoucherDto getEducationVoucher() {
		return educationVoucher;
	}

	public FeeItemDetailDto getFeeItemDetail() {
		return feeItemDetail;
	}

	public void setFeeItemDetail(FeeItemDetailDto feeItemDetail) {
		this.feeItemDetail = feeItemDetail;
	}

//	public ReceivePayAbleDto getReceivePayAble() {
//		return receivePayAble;
//	}
//
//	public void setReceivePayAble(ReceivePayAbleDto receivePayAble) {
//		this.receivePayAble = receivePayAble;
//	}
//
//	public ReceivePayAbleDetailDto getReceivePayAbleDetail() {
//		return receivePayAbleDetail;
//	}
//
//	public void setReceivePayAbleDetail(ReceivePayAbleDetailDto receivePayAbleDetail) {
//		this.receivePayAbleDetail = receivePayAbleDetail;
//	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setEducationVoucher(EducationVoucherDto educationVoucher) {
		this.educationVoucher = educationVoucher;
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

	public Integer getIsCredit() {
		return isCredit;
	}

	public void setIsCredit(Integer isCredit) {
		this.isCredit = isCredit;
	}

	public FeeItemDto getFeeItem() {
		return feeItem;
	}

	public void setFeeItem(FeeItemDto feeItem) {
		this.feeItem = feeItem;
	}
	

//	public Boolean getIsRecived() {
//		return isRecived;
//	}
//
//	public void setIsRecived(Boolean isRecived) {
//		this.isRecived = isRecived;
//	}

	public Double getAmountDone() {
		return amountDone;
	}

	public void setAmountDone(Double amountDone) {
		this.amountDone = amountDone;
	}

	public Boolean getChecked() {
		return checked;
	}

	public void setChecked(Boolean checked) {
		this.checked = checked;
	}	

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public EducationVoucherDetailDto() {

	}

	public EducationVoucherDetailDto(EducationVoucherDetail ev) {
		if(ev!=null) {
			this.id = ev.getId();
			this.amount=ev.getAmount();
			this.discountAmount=ev.getDiscountAmount();
			this.discountPercent=ev.getDiscountPercent();
			this.type = ev.getType();
			if(this.type==null) {
				if(ev.getEducationVoucher()!=null && ev.getEducationVoucher().getType()!=null) {
					this.type=ev.getEducationVoucher().getType();
				}
			}
			if(ev.getEducationVoucher()!=null) {
				this.educationVoucher=new EducationVoucherDto();
				this.educationVoucher.setId(ev.getEducationVoucher().getId());
				this.educationVoucher.setNote(ev.getEducationVoucher().getNote());
				if(ev.getEducationVoucher().getStudent()!=null) {
					this.educationVoucher.setStudentCode(ev.getEducationVoucher().getStudent().getStudentCode());
					this.educationVoucher.setId(ev.getEducationVoucher().getStudent().getId());
				}
				if(ev.getEducationVoucher().getSemester()!=null) {
					this.educationVoucher.setSemester(new SemesterDto());
					this.educationVoucher.getSemester().setSemesterCode(ev.getEducationVoucher().getSemester().getSemesterCode());
				}
			}			
			if(ev.getFeeItem()!=null) {
				this.feeItem=new FeeItemDto(ev.getFeeItem());
			}
			this.isCredit=ev.getIsReceive();
			this.receivedAmount=ev.getReceivedAmount();
			this.amountDone=ev.getAmountDone();
//			this.isRecived=ev.getIsRecived();
			this.note = ev.getNote();
//			if(ev.getFeeItemDetail() != null) {
//				this.feeItemDetail = new FeeItemDetailDto();
//				this.feeItemDetail = new FeeItemDetailDto();
//				this.feeItemDetail.setId(ev.getFeeItemDetail().getId());
//				this.feeItemDetail.setCode(ev.getFeeItemDetail().getCode());
//				this.feeItemDetail.setName(ev.getFeeItemDetail().getName());
//			}
//			if(ev.getReceivePayAbleDetail() != null) {
//				this.receivePayAbleDetail = new ReceivePayAbleDetailDto();
//				this.receivePayAbleDetail.setId(ev.getReceivePayAbleDetail().getId());
//				this.receivePayAbleDetail.setAmount(ev.getReceivePayAbleDetail().getAmount());
//				this.receivePayAbleDetail.setDiscountPercent(ev.getReceivePayAbleDetail().getDiscountPercent());
//				this.receivePayAbleDetail.setDiscountAmount(ev.getReceivePayAbleDetail().getDiscountAmount());
//				this.receivePayAbleDetail.setTotalAmount(ev.getReceivePayAbleDetail().getTotalAmount());
//				this.receivePayAbleDetail.setIsReceive(ev.getReceivePayAbleDetail().getIsReceive());
//				this.receivePayAbleDetail.setType(ev.getReceivePayAbleDetail().getType());
//				this.receivePayAbleDetail.setWithdrawalValue(ev.getReceivePayAbleDetail().getWithdrawalValue());
//				this.receivePayAbleDetail.setTransferValue(ev.getReceivePayAbleDetail().getTransferValue());
//			}
//			if(ev.getReceivePayAble() != null) {
//				this.receivePayAble = new ReceivePayAbleDto();
//				this.receivePayAble.setId(ev.getReceivePayAble().getId());
//				this.receivePayAble.setAmount(ev.getReceivePayAble().getAmount());
//				this.receivePayAble.setAmountReceived(ev.getReceivePayAble().getAmountReceived());
//				this.receivePayAble.setAmountDone(ev.getReceivePayAble().getAmountDone());
//				this.receivePayAble.setIsComplete(ev.getReceivePayAble().getIsComplete());
//				this.receivePayAble.setNote(ev.getReceivePayAble().getNote());
//				this.receivePayAble.setReceivPayAbleDate(ev.getReceivePayAble().getReceivPayAbleDate());
//				this.receivePayAble.setType(ev.getReceivePayAble().getType());
//				this.receivePayAble.setStatus(ev.getReceivePayAble().getStatus());
//				this.receivePayAble.setIsReceive(ev.getReceivePayAble().getIsReceive());
//				this.receivePayAble.setWithdrawalValue(ev.getReceivePayAble().getWithdrawalValue());
//				this.receivePayAble.setTransferValue(ev.getReceivePayAble().getTransferValue());
//				this.receivePayAble.setAmountAfterBalance(ev.getReceivePayAble().getAmountAfterBalance());
//			}
//			this.code = ev.getCode();
//			this.note = ev.getNote();
//			if(ev.getSemester()!=null) {
//				this.semester =new SemesterDto();
//				this.semester.setId(ev.getSemester().getId());
//				this.semester.setSemesterCode(ev.getSemester().getSemesterCode());
//				this.semester.setSemesterName(ev.getSemester().getSemesterName());
//			}
//			this.totalPayedAmount=ev.getTotalPayedAmount();
//			this.totalRecivedAmount=ev.getTotalRecivedAmount();
//			this.type=ev.getType();
//			this.voucherDate=ev.getVoucherDate();
//			if(ev.getStudent()!=null) {
//				this.student=new StudentDto(ev.getStudent());
//			}
			
		}
	}
	public EducationVoucherDetailDto(EducationVoucherDetail ev,boolean simple) {
		if(ev!=null) {
			this.id = ev.getId();
			this.amount=ev.getAmount();
			this.discountAmount=ev.getDiscountAmount();
			this.discountPercent=ev.getDiscountPercent();
			if(ev.getEducationVoucher()!=null) {
				this.educationVoucher=new EducationVoucherDto();
				this.educationVoucher.setId(ev.getEducationVoucher().getId());
			}			
			if(ev.getFeeItem()!=null) {
				this.feeItem=new FeeItemDto(ev.getFeeItem());
			}
			this.type=ev.getType();
			this.isCredit=ev.getIsReceive();
			this.receivedAmount=ev.getReceivedAmount();
//			this.isRecived=ev.getIsRecived();
			this.note = ev.getNote();
		}
	}
}
