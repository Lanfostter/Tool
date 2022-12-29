package com.example.tool.edudto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.globits.core.dto.TrainingBaseDto;
import com.globits.education.domain.ReceivePayAble;
import com.globits.education.domain.ReceivePayAbleDetail;
import com.globits.education.domain.Semester;
import com.globits.education.domain.Student;
import com.globits.education.dto.FeeItemDto;
import com.globits.education.dto.ReceivePayAbleDetailDto;
import com.globits.education.dto.ReceivePayAbleDto;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.SemesterRegisterPeriodDto;
import com.globits.education.dto.StudentDto;
import com.globits.education.utils.EducationConstant;

public class ReceivePayAbleDto implements Serializable {
	
	private Long id;
	
	private StudentDto student;	
	
	private SemesterDto semester;	
	
	private SemesterRegisterPeriodDto registerPeriod;
	
	private double amount;
		
	private double amountReceived;
	private Double amountDone;//Số tiền thực đã rút	/đã nộp
	private double calculateAmount;//Số tiền sau khi đã điều chỉnh
	/*
	 * -1:Khác
	 * 0: Nhập học
	 * 1: Học phí
	 * 2: Học bổng
	 * 3: Lệ phí thi
	 * 4: Lớp riêng
	 */
	private int type;	
	
	private Date receivPayAbleDate;	
	
	private boolean isComplete;
	
	private String note;

	private Integer status;
	
	List<ReceivePayAbleDetailDto> details;
	
	private Integer isReceive;
	private boolean isSelected;
	private boolean checked;
	private TrainingBaseDto trainingBase;//cơ sở
	
	private Double withdrawalValue;//Số tiền đã rút ra
	private Double transferValue;//Số tiền đã kết chuyển sang khoản khác
	private Double amountAfterBalance;//Số tiền sau khi điều chỉnh
	private ReceivePayAbleDto adjustedReceivePayAble;//Điều chỉnh cho khoản nào, nếu là loại khoản điều chỉnh?
	private List<ReceivePayAbleDto> subReceivePayAble;//Các khoản mục điều chỉnh cho loại khoản này
	
	private Boolean isCompleted;
	private String createdBy;
	
	private Date dateChangeCreditForRegistration;// Ngày thay đổi đăng ký học
	private double amountBalanceDone;//số tiền còn phải đóng hoặc số tiền còn được rút ( amountAfterBalance- amountDone)
	private List<Long> listReceiveId;//danh sách 
	public Date getDateChangeCreditForRegistration() {
		return dateChangeCreditForRegistration;
	}


	public void setDateChangeCreditForRegistration(Date dateChangeCreditForRegistration) {
		this.dateChangeCreditForRegistration = dateChangeCreditForRegistration;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public StudentDto getStudent() {
		return student;
	}


	public void setStudent(StudentDto student) {
		this.student = student;
	}


	public SemesterDto getSemester() {
		return semester;
	}


	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}


	public SemesterRegisterPeriodDto getRegisterPeriod() {
		return registerPeriod;
	}


	public void setRegisterPeriod(SemesterRegisterPeriodDto registerPeriod) {
		this.registerPeriod = registerPeriod;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public double getAmountReceived() {
		return amountReceived;
	}


	public void setAmountReceived(double amountReceived) {
		this.amountReceived = amountReceived;
	}


	public int getType() {
		return type;
	}


	public void setType(int type) {
		this.type = type;
	}


	
	public Date getReceivPayAbleDate() {
		return receivPayAbleDate;
	}


	public void setReceivPayAbleDate(Date receivPayAbleDate) {
		this.receivPayAbleDate = receivPayAbleDate;
	}


	public boolean getIsComplete() {
		return isComplete;
	}


	public void setIsComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}


	public String getNote() {
		return note;
	}


	public void setNote(String note) {
		this.note = note;
	}
	
	public Integer getStatus() {
		return status;
	}


	public void setStatus(Integer status) {
		this.status = status;
	}


	public List<ReceivePayAbleDetailDto> getDetails() {
		return details;
	}


	public void setDetails(List<ReceivePayAbleDetailDto> details) {
		this.details = details;
	}


	public Integer getIsReceive() {
		return isReceive;
	}

	public void setIsReceive(Integer isReceive) {
		this.isReceive = isReceive;
	}
	
	public boolean isSelected() {
		return isSelected;
	}


	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}
	
	public Double getAmountDone() {
		return amountDone;
	}


	public void setAmountDone(Double amountDone) {
		this.amountDone = amountDone;
	}

	public double getCalculateAmount() {
		return calculateAmount;
	}


	public void setCalculateAmount(double calculateAmount) {
		this.calculateAmount = calculateAmount;
	}


	public TrainingBaseDto getTrainingBase() {
		return trainingBase;
	}

	public void setTrainingBase(TrainingBaseDto trainingBase) {
		this.trainingBase = trainingBase;
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


	public Double getAmountAfterBalance() {
		return amountAfterBalance;
	}


	public void setAmountAfterBalance(Double amountAfterBalance) {
		this.amountAfterBalance = amountAfterBalance;
	}

	public List<ReceivePayAbleDto> getSubReceivePayAble() {
		return subReceivePayAble;
	}

	public void setSubReceivePayAble(List<ReceivePayAbleDto> subReceivePayAble) {
		this.subReceivePayAble = subReceivePayAble;
	}

	public ReceivePayAbleDto getAdjustedReceivePayAble() {
		return adjustedReceivePayAble;
	}


	public void setAdjustedReceivePayAble(ReceivePayAbleDto adjustedReceivePayAble) {
		this.adjustedReceivePayAble = adjustedReceivePayAble;
	}


	public Boolean getIsCompleted() {
		return isCompleted;
	}


	public void setIsCompleted(Boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	public boolean isChecked() {
		return checked;
	}


	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	
	public String getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public double getAmountBalanceDone() {
		if(amountAfterBalance!=null && amountDone!=null)
		return amountAfterBalance - amountDone;
		else
			return amountBalanceDone;
	}


	public void setAmountBalanceDone(double amountBalanceDone) {
		this.amountBalanceDone = amountBalanceDone;
	}


	public List<Long> getListReceiveId() {
		return listReceiveId;
	}


	public void setListReceiveId(List<Long> listReceiveId) {
		this.listReceiveId = listReceiveId;
	}


	public ReceivePayAbleDto() {
		
	}
	public ReceivePayAbleDto(ReceivePayAble receivePayAble) {
		this.id = receivePayAble.getId();
		this.amount = receivePayAble.getAmount();
		if(receivePayAble.getAmountReceived() != null) {
			this.amountReceived = receivePayAble.getAmountReceived();
		}else {
			this.amountReceived = 0D;
		}
		if(receivePayAble.getAmountDone() != null) {
			this.amountDone=receivePayAble.getAmountDone();
		}else {
			this.amountDone = 0D;
		}
		if(receivePayAble.getAmountAfterBalance()!=null) {
			this.amountAfterBalance = receivePayAble.getAmountAfterBalance();
		}
		else {
			this.amountAfterBalance=0D;
		}
		
		if(receivePayAble.getIsComplete() != null) {
			this.isComplete = receivePayAble.getIsComplete();
		}else {
			this.isComplete = false;
		}
		this.note = receivePayAble.getNote();
		this.receivPayAbleDate = receivePayAble.getReceivPayAbleDate();
		this.type = receivePayAble.getType();
		this.status = receivePayAble.getStatus();
		this.isReceive = receivePayAble.getIsReceive();
		if(receivePayAble.getRegisterPeriod()!=null) {
			this.registerPeriod = new SemesterRegisterPeriodDto(receivePayAble.getRegisterPeriod());
		}
		if(receivePayAble.getSemester()!=null)
			this.semester = new SemesterDto(receivePayAble.getSemester());
		if(receivePayAble.getStudent()!=null)
			this.student = new StudentDto(receivePayAble.getStudent(),true);
		if(receivePayAble.getDetails()!=null && !receivePayAble.getDetails().isEmpty()) {
			this.details = new ArrayList<ReceivePayAbleDetailDto>();
			for (ReceivePayAbleDetail receivePayAbleDetail : receivePayAble.getDetails()) {
				ReceivePayAbleDetailDto dto = new ReceivePayAbleDetailDto();
				dto.setAmount(receivePayAbleDetail.getAmount());
				dto.setDiscountAmount(receivePayAbleDetail.getDiscountAmount());
				dto.setDiscountPercent(receivePayAbleDetail.getDiscountPercent());
				dto.setFeeItem(new FeeItemDto(receivePayAbleDetail.getFeeItem()));
				dto.setIsReceive(receivePayAbleDetail.getIsReceive());
				dto.setType(receivePayAbleDetail.getType());
				dto.setNote(receivePayAbleDetail.getNote());
				dto.setTotalAmount(receivePayAbleDetail.getTotalAmount());
				this.details.add(dto);
			}
		}
		this.withdrawalValue = receivePayAble.getWithdrawalValue();
		this.transferValue = receivePayAble.getTransferValue();
		this.amountAfterBalance = receivePayAble.getAmountAfterBalance();
		if(receivePayAble != null) {
			if(receivePayAble.getReceivPayAbleDate() != null) {
				dateChangeCreditForRegistration = receivePayAble.getReceivPayAbleDate();
			}else {
				if(receivePayAble.getCreateDate() != null)
				dateChangeCreditForRegistration = receivePayAble.getCreateDate().toDate();
			}
		}
		if(receivePayAble.getAdjustedReceivePayAble() != null) {
			this.adjustedReceivePayAble = new ReceivePayAbleDto();
			this.adjustedReceivePayAble.setId(receivePayAble.getAdjustedReceivePayAble().getId());
			this.adjustedReceivePayAble.setStatus(receivePayAble.getAdjustedReceivePayAble().getStatus());
			this.adjustedReceivePayAble.setType(receivePayAble.getAdjustedReceivePayAble().getType());
			this.adjustedReceivePayAble.setAmount(receivePayAble.getAdjustedReceivePayAble().getAmount());
			this.adjustedReceivePayAble.setAmountReceived(receivePayAble.getAdjustedReceivePayAble().getAmountReceived());
			this.adjustedReceivePayAble.setAmountDone(receivePayAble.getAdjustedReceivePayAble().getAmountDone());
			this.adjustedReceivePayAble.setWithdrawalValue(receivePayAble.getAdjustedReceivePayAble().getWithdrawalValue());
			this.adjustedReceivePayAble.setTransferValue(receivePayAble.getAdjustedReceivePayAble().getTransferValue());
			this.adjustedReceivePayAble.setAmountAfterBalance(receivePayAble.getAmountAfterBalance());
			this.adjustedReceivePayAble.setIsReceive(receivePayAble.getIsReceive());
		}
		
		if(receivePayAble.getSubReceivePayAble() != null && receivePayAble.getSubReceivePayAble().size() > 0) {
			this.subReceivePayAble = new ArrayList<ReceivePayAbleDto>();
			for (ReceivePayAble domain : receivePayAble.getSubReceivePayAble()) {
				ReceivePayAbleDto dto = new ReceivePayAbleDto();
				dto.setId(domain.getId());
				dto.setStatus(domain.getStatus());
				dto.setType(domain.getType());
				dto.setAmount(domain.getAmount());
				dto.setAmountReceived(domain.getAmountReceived());
				dto.setAmountDone(domain.getAmountDone());
				dto.setWithdrawalValue(domain.getWithdrawalValue());
				dto.setTransferValue(domain.getTransferValue());
				dto.setAmountAfterBalance(domain.getAmountAfterBalance());
				dto.setIsReceive(domain.getIsReceive());
				dto.setNote(domain.getNote());
				this.subReceivePayAble.add(dto);
			}
		}
		if(receivePayAble.getTrainingBase()!=null) {
			this.trainingBase = new TrainingBaseDto(receivePayAble.getTrainingBase());
		}
	}
	public ReceivePayAbleDto(Student student,Semester semester,ReceivePayAble receivePayAble ) {
		if(this.student!=null) {
			this.student = new StudentDto(student,true);
		}
		if(semester!=null) {
			this.semester = new SemesterDto(semester.getId(),semester.getSemesterName(),semester.getSemesterCode());
		}
		this.isReceive = receivePayAble.getIsReceive();
		if(receivePayAble!=null) {
			this.id = receivePayAble.getId();
			this.amount = receivePayAble.getAmount();
			if(receivePayAble.getAmountReceived() != null) {
				this.amountReceived = receivePayAble.getAmountReceived();
			}else {
				this.amountReceived = 0D;
			}
			if(receivePayAble.getAmountDone() != null) {
				this.amountDone=receivePayAble.getAmountDone();
			}else {
				this.amountDone = 0D;
			}
			if(receivePayAble.getAmountAfterBalance()!=null) {
				this.amountAfterBalance = receivePayAble.getAmountAfterBalance();
			}
			else {
				this.amountAfterBalance=0D;
			}
			if(receivePayAble.getIsComplete() != null) {
				this.isComplete = receivePayAble.getIsComplete();
			}else {
				this.isComplete = false;
			}
			this.isComplete = receivePayAble.getIsComplete();
			this.note = receivePayAble.getNote();
			this.receivPayAbleDate = receivePayAble.getReceivPayAbleDate();
			this.type = receivePayAble.getType();
			this.status = receivePayAble.getStatus();
			if(receivePayAble.getDetails()!=null && !receivePayAble.getDetails().isEmpty()) {
				this.details = new ArrayList<ReceivePayAbleDetailDto>();
				for (ReceivePayAbleDetail receivePayAbleDetail : receivePayAble.getDetails()) {
					ReceivePayAbleDetailDto dto = new ReceivePayAbleDetailDto();
					dto.setAmount(receivePayAbleDetail.getAmount());
					dto.setDiscountAmount(receivePayAbleDetail.getDiscountAmount());
					dto.setDiscountPercent(receivePayAbleDetail.getDiscountPercent());
					dto.setFeeItem(new FeeItemDto(receivePayAbleDetail.getFeeItem()));
					dto.setIsReceive(receivePayAbleDetail.getIsReceive());
					dto.setType(receivePayAbleDetail.getType());
					dto.setNote(receivePayAbleDetail.getNote());
					this.details.add(dto);
				}
			}
			if(receivePayAble.getRegisterPeriod()!=null) {
				this.registerPeriod = new SemesterRegisterPeriodDto(receivePayAble.getRegisterPeriod());
			}
			
			this.withdrawalValue = receivePayAble.getWithdrawalValue();
			this.transferValue = receivePayAble.getTransferValue();
			this.amountAfterBalance = receivePayAble.getAmountAfterBalance();
			
			if(receivePayAble.getAdjustedReceivePayAble() != null) {
				this.adjustedReceivePayAble = new ReceivePayAbleDto();
				this.adjustedReceivePayAble.setId(receivePayAble.getAdjustedReceivePayAble().getId());
				this.adjustedReceivePayAble.setStatus(receivePayAble.getAdjustedReceivePayAble().getStatus());
				this.adjustedReceivePayAble.setType(receivePayAble.getAdjustedReceivePayAble().getType());
				this.adjustedReceivePayAble.setAmount(receivePayAble.getAdjustedReceivePayAble().getAmount());
				this.adjustedReceivePayAble.setAmountReceived(receivePayAble.getAdjustedReceivePayAble().getAmountReceived());
				this.adjustedReceivePayAble.setAmountDone(receivePayAble.getAdjustedReceivePayAble().getAmountDone());
				this.adjustedReceivePayAble.setWithdrawalValue(receivePayAble.getAdjustedReceivePayAble().getWithdrawalValue());
				this.adjustedReceivePayAble.setTransferValue(receivePayAble.getAdjustedReceivePayAble().getTransferValue());
				this.adjustedReceivePayAble.setAmountAfterBalance(receivePayAble.getAmountAfterBalance());
				this.adjustedReceivePayAble.setIsReceive(receivePayAble.getIsReceive());
			}
			
			if(receivePayAble.getSubReceivePayAble() != null && receivePayAble.getSubReceivePayAble().size() > 0) {
				this.subReceivePayAble = new ArrayList<ReceivePayAbleDto>();
				for (ReceivePayAble domain : receivePayAble.getSubReceivePayAble()) {
					ReceivePayAbleDto dto = new ReceivePayAbleDto();
					dto.setId(domain.getId());
					dto.setStatus(domain.getStatus());
					dto.setType(domain.getType());
					dto.setAmount(domain.getAmount());
					dto.setAmountReceived(domain.getAmountReceived());
					dto.setAmountDone(domain.getAmountDone());
					dto.setWithdrawalValue(domain.getWithdrawalValue());
					dto.setTransferValue(domain.getTransferValue());
					dto.setAmountAfterBalance(domain.getAmountAfterBalance());
					dto.setIsReceive(domain.getIsReceive());
					dto.setNote(domain.getNote());
					this.subReceivePayAble.add(dto);
				}
			}
		}
	}
	public ReceivePayAbleDto(Student student,ReceivePayAble receivePayAble ) {
		if(this.student!=null) {
			this.student = new StudentDto(student,true);
		}		
		this.isReceive = receivePayAble.getIsReceive();
		if(receivePayAble!=null) {
			this.id = receivePayAble.getId();
			this.amount = receivePayAble.getAmount();
			if(receivePayAble.getAmountReceived() != null) {
				this.amountReceived = receivePayAble.getAmountReceived();
			}else {
				this.amountReceived = 0D;
			}
			if(receivePayAble.getAmountDone() != null) {
				this.amountDone=receivePayAble.getAmountDone();
			}else {
				this.amountDone = 0D;
			}
			if(receivePayAble.getAmountAfterBalance()!=null) {
				this.amountAfterBalance = receivePayAble.getAmountAfterBalance();
			}
			else {
				this.amountAfterBalance=0D;
			}
			if(receivePayAble.getIsComplete() != null) {
				this.isComplete = receivePayAble.getIsComplete();
			}else {
				this.isComplete = false;
			}
			this.note = receivePayAble.getNote();
			this.receivPayAbleDate = receivePayAble.getReceivPayAbleDate();
			this.type = receivePayAble.getType();
			this.status = receivePayAble.getStatus();
			if(receivePayAble.getDetails()!=null && !receivePayAble.getDetails().isEmpty()) {
				this.details = new ArrayList<ReceivePayAbleDetailDto>();
				for (ReceivePayAbleDetail receivePayAbleDetail : receivePayAble.getDetails()) {
					ReceivePayAbleDetailDto dto = new ReceivePayAbleDetailDto();
					dto.setAmount(receivePayAbleDetail.getAmount());
					dto.setDiscountAmount(receivePayAbleDetail.getDiscountAmount());
					dto.setDiscountPercent(receivePayAbleDetail.getDiscountPercent());
					dto.setFeeItem(new FeeItemDto(receivePayAbleDetail.getFeeItem()));
					dto.setIsReceive(receivePayAbleDetail.getIsReceive());
					dto.setType(receivePayAbleDetail.getType());
					dto.setNote(receivePayAbleDetail.getNote());
					this.details.add(dto);
				}
			}
			if(receivePayAble.getRegisterPeriod()!=null) {
				this.registerPeriod = new SemesterRegisterPeriodDto(receivePayAble.getRegisterPeriod());
			}
			
			this.withdrawalValue = receivePayAble.getWithdrawalValue();
			this.transferValue = receivePayAble.getTransferValue();
			this.amountAfterBalance = receivePayAble.getAmountAfterBalance();
			
			if(receivePayAble.getAdjustedReceivePayAble() != null) {
				this.adjustedReceivePayAble = new ReceivePayAbleDto();
				this.adjustedReceivePayAble.setId(receivePayAble.getAdjustedReceivePayAble().getId());
				this.adjustedReceivePayAble.setStatus(receivePayAble.getAdjustedReceivePayAble().getStatus());
				this.adjustedReceivePayAble.setType(receivePayAble.getAdjustedReceivePayAble().getType());
				this.adjustedReceivePayAble.setAmount(receivePayAble.getAdjustedReceivePayAble().getAmount());
				this.adjustedReceivePayAble.setAmountReceived(receivePayAble.getAdjustedReceivePayAble().getAmountReceived());
				this.adjustedReceivePayAble.setAmountDone(receivePayAble.getAdjustedReceivePayAble().getAmountDone());
				this.adjustedReceivePayAble.setWithdrawalValue(receivePayAble.getAdjustedReceivePayAble().getWithdrawalValue());
				this.adjustedReceivePayAble.setTransferValue(receivePayAble.getAdjustedReceivePayAble().getTransferValue());
				this.adjustedReceivePayAble.setAmountAfterBalance(receivePayAble.getAmountAfterBalance());
				this.adjustedReceivePayAble.setIsReceive(receivePayAble.getIsReceive());
			}
			
			if(receivePayAble.getSubReceivePayAble() != null && receivePayAble.getSubReceivePayAble().size() > 0) {
				this.subReceivePayAble = new ArrayList<ReceivePayAbleDto>();
				for (ReceivePayAble domain : receivePayAble.getSubReceivePayAble()) {
					ReceivePayAbleDto dto = new ReceivePayAbleDto();
					dto.setId(domain.getId());
					dto.setStatus(domain.getStatus());
					dto.setType(domain.getType());
					dto.setAmount(domain.getAmount());
					dto.setAmountReceived(domain.getAmountReceived());
					dto.setAmountDone(domain.getAmountDone());
					dto.setWithdrawalValue(domain.getWithdrawalValue());
					dto.setTransferValue(domain.getTransferValue());
					dto.setAmountAfterBalance(domain.getAmountAfterBalance());
					dto.setIsReceive(domain.getIsReceive());
					dto.setNote(domain.getNote());
					dto.setNote(domain.getNote());
					this.subReceivePayAble.add(dto);
				}
			}
		}
	}
	
	public ReceivePayAbleDto(ReceivePayAble receivePayAble,boolean isxempt) {
		this.id = receivePayAble.getId();
		this.amount = receivePayAble.getAmount();
		if(receivePayAble.getAmountReceived() != null) {
			this.amountReceived = receivePayAble.getAmountReceived();
		}else {
			this.amountReceived = 0D;
		}
		if(receivePayAble.getAmountDone() != null) {
			this.amountDone=receivePayAble.getAmountDone();
		}else {
			this.amountDone = 0D;
		}
		if(receivePayAble.getAmountAfterBalance()!=null) {
			this.amountAfterBalance = receivePayAble.getAmountAfterBalance();
		}
		else {
			this.amountAfterBalance=0D;
		}
		
		if(receivePayAble.getIsComplete() != null) {
			this.isComplete = receivePayAble.getIsComplete();
		}else {
			this.isComplete = false;
		}
		this.createdBy=receivePayAble.getCreatedBy();
		this.note = receivePayAble.getNote();
		this.receivPayAbleDate = receivePayAble.getReceivPayAbleDate();
		this.type = receivePayAble.getType();
		this.status = receivePayAble.getStatus();
		this.isReceive = receivePayAble.getIsReceive();
		if(receivePayAble.getRegisterPeriod()!=null) {
			this.registerPeriod = new SemesterRegisterPeriodDto(receivePayAble.getRegisterPeriod());
		}
		if(receivePayAble.getSemester()!=null)
			this.semester = new SemesterDto(receivePayAble.getSemester());
		if(receivePayAble.getStudent()!=null)
			this.student = new StudentDto(receivePayAble.getStudent(),true);
//		if(receivePayAble.getDetails()!=null && !receivePayAble.getDetails().isEmpty()) {
//			this.details = new ArrayList<ReceivePayAbleDetailDto>();
//			for (ReceivePayAbleDetail receivePayAbleDetail : receivePayAble.getDetails()) {
//				ReceivePayAbleDetailDto dto = new ReceivePayAbleDetailDto();
//				dto.setAmount(receivePayAbleDetail.getAmount());
//				dto.setDiscountAmount(receivePayAbleDetail.getDiscountAmount());
//				dto.setDiscountPercent(receivePayAbleDetail.getDiscountPercent());
//				dto.setFeeItem(new FeeItemDto(receivePayAbleDetail.getFeeItem()));
//				dto.setIsReceive(receivePayAbleDetail.getIsReceive());
//				dto.setType(receivePayAbleDetail.getType());
//				dto.setNote(receivePayAbleDetail.getNote());
//				dto.setTotalAmount(receivePayAbleDetail.getTotalAmount());
//				this.details.add(dto);
//			}
//		}
//		this.withdrawalValue = receivePayAble.getWithdrawalValue();
//		this.transferValue = receivePayAble.getTransferValue();
//		this.amountAfterBalance = receivePayAble.getAmountAfterBalance();
		
		
		
	}
	public ReceivePayAbleDto(Object[] results,List<String> columns) {
		if(results!=null && results.length>0 && columns!=null && columns.size()>0) {
			for (int i = 0; i < columns.size(); i++) {
				if(results[i]!=null && columns.get(i)!=null && columns.get(i).equals(EducationConstant.FunctionAndGroupByItem.amount.getValue())) {
					this.amount = (Double)results[i];
				}
				if(results[i]!=null && columns.get(i)!=null && columns.get(i).equals(EducationConstant.FunctionAndGroupByItem.amountAfterBalance.getValue())) {
					this.amountAfterBalance = (Double)results[i];
				}
				if(results[i]!=null && columns.get(i)!=null && columns.get(i).equals(EducationConstant.FunctionAndGroupByItem.amountDone.getValue())) {
					this.amountDone = (Double)results[i];
				}
				
				if(results[i]!=null && columns.get(i)!=null && columns.get(i).equals(EducationConstant.FunctionAndGroupByItem.student.getValue()+"id")) {
					if(this.student==null) this.student = new StudentDto();
					this.student.setId((Long)results[i]);
				}
				if(results[i]!=null && columns.get(i)!=null && columns.get(i).equals(EducationConstant.FunctionAndGroupByItem.student.getValue()+"name")) {
					if(this.student==null) this.student = new StudentDto();
					this.student.setDisplayName(String.valueOf(results[i]));
				}
				if(results[i]!=null && columns.get(i)!=null && columns.get(i).equals(EducationConstant.FunctionAndGroupByItem.student.getValue()+"code")) {
					if(this.student==null) this.student = new StudentDto();
					this.student.setStudentCode(String.valueOf(results[i]));
				}
				if(results[i]!=null && columns.get(i)!=null && columns.get(i).equals(EducationConstant.FunctionAndGroupByItem.student.getValue()+"bankAccount")) {
					if(this.student==null) this.student = new StudentDto();
					this.student.setBankAccount(String.valueOf(results[i]));
				}
				if(results[i]!=null && columns.get(i)!=null && columns.get(i).equals(EducationConstant.FunctionAndGroupByItem.student.getValue()+"classCode")) {
					if(this.student==null) this.student = new StudentDto();
					this.student.setClassCode(String.valueOf(results[i]));
				}
				if(results[i]!=null && columns.get(i)!=null && columns.get(i).equals(EducationConstant.FunctionAndGroupByItem.student.getValue()+"firstName")) {
					if(this.student==null) this.student = new StudentDto();
					this.student.setFirstName(String.valueOf(results[i]));
				}
				if(results[i]!=null && columns.get(i)!=null && columns.get(i).equals(EducationConstant.FunctionAndGroupByItem.student.getValue()+"lastName")) {
					if(this.student==null) this.student = new StudentDto();
					this.student.setLastName(String.valueOf(results[i]));
				}
			
			}
		}
	}
}
