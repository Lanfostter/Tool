package com.example.tool.edudto;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.globits.core.dto.TrainingBaseDto;
import com.globits.education.Const;
import com.globits.education.datatype.OnlinePaymentServiceProvider;
import com.globits.education.domain.EducationVoucher;
import com.globits.education.domain.EducationVoucherDetail;
import com.globits.education.domain.EnrollmentClass;
import com.globits.education.domain.FeeItem;
import com.globits.education.domain.Semester;
import com.globits.education.domain.Student;
import com.globits.education.domain.StudentEducationProgram;
import com.globits.education.dto.EducationVoucherDetailDto;
import com.globits.education.dto.EnrollmentClassDto;
import com.globits.education.dto.FeeItemDto;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.SemesterRegisterPeriodDto;
import com.globits.education.dto.StudentCandidateProfileDto;
import com.globits.education.dto.StudentDto;
import com.globits.education.utils.FormatNumberUtil;

public class EducationVoucherDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private OnlinePaymentServiceProvider serviceProvider;
	private String code;//Số hóa đơn
	private String bankImportCode;//Mã số khi import tiền ngân hàng
	private String numberBook;//Quyển số
	private Date voucherDate;//Ngày lập hóa đơn
	private StudentDto student;//Thuộc về sinh viên nào
	private String studentCode;
	private SemesterDto semester;//Học kỳ phát sinh hóa đơn này (nếu cần)
//	private Double totalPayedAmount;//Tổng số tiền chi
	private Double totalRecivedAmount;//Tổng số tiền thực thu - thực chi
	private String totalReceivedAmountConvertToString;//Đọc tổng số tiền thực thu - chi = chữ
	private Double totalAmount;//Tổng số phải tiền thu
	private String note;//Ghi chú
	private Integer type;//Loại hóa đơn (phòng xa, có thể ko dùng) -1:Khác, 0:Nhập học, 1:Học phí, 2:Học bổng, 3: rút học bổng sang học phí
	private String createdBy;
	private Boolean voided;
	private Set<EducationVoucherDetailDto> educationVoucherDetails;
	private List<EducationVoucherDetailDto> listEducationVoucherDetails;
	private Integer paymentMethod;//phương thức thanh toán
	private Boolean isWithdrawAble;//Cho phép rút tiền (trường hợp đã đóng tiền nhưng chưa có khoản phải thu nào, cho phép sinh viên rút tiền ra)
	private Long totalElements;//lấy tổng danh sách sv chưa đóng phí nhập học
	private Integer isReceive;//=1 thu, =-1 chi
	private Integer status;//trạng thái
	private TrainingBaseDto trainingBase;
	private FeeItemDto feeItem;
	private SemesterRegisterPeriodDto period;
	private EnrollmentClassDto enrollmentClass;
	/*Phân loại đối tượng theo hệ - khóa hỗn hợp (hiện tại chỉ dùng cho báo có thu học phí theo ngày)
	 * 1=DHCQ,CD
	 * 2=DHTC
	 * 3=CAOHOC,NCS
	 * 4=LT
	 * 5=CTTT
	 */
	private int studentType;
	private String createBy;
	private Boolean isRedundant;//thu thừa tiền cần thu lại tiền (so sánh receiveAmount >amountDone ở educationVoucherDetail)
	private String modifiedBy;
	private boolean isSelected;
	private String action;//thao tác
	private Date modifiedDate;
	public String getTotalReceivedAmountConvertToString() {
		return totalReceivedAmountConvertToString;
	}

	public void setTotalReceivedAmountConvertToString(String totalReceivedAmountConvertToString) {
		this.totalReceivedAmountConvertToString = totalReceivedAmountConvertToString;
	}

	public EnrollmentClassDto getEnrollmentClass() {
		return enrollmentClass;
	}

	public void setEnrollmentClass(EnrollmentClassDto enrollmentClass) {
		this.enrollmentClass = enrollmentClass;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getBankImportCode() {
		return bankImportCode;
	}

	public void setBankImportCode(String bankImportCode) {
		this.bankImportCode = bankImportCode;
	}

	public Date getVoucherDate() {
		return voucherDate;
	}

	public void setVoucherDate(Date voucherDate) {
		this.voucherDate = voucherDate;
	}

	public StudentDto getStudent() {
		return student;
	}

	public void setStudent(StudentDto student) {
		this.student = student;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public SemesterDto getSemester() {
		return semester;
	}

	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}

//	public Double getTotalPayedAmount() {
//		return totalPayedAmount;
//	}
//
//	public void setTotalPayedAmount(Double totalPayedAmount) {
//		this.totalPayedAmount = totalPayedAmount;
//	}

	public Double getTotalRecivedAmount() {
		return totalRecivedAmount;
	}

	public void setTotalRecivedAmount(Double totalRecivedAmount) {
		this.totalRecivedAmount = totalRecivedAmount;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}	

	public Set<EducationVoucherDetailDto> getEducationVoucherDetails() {
		return educationVoucherDetails;
	}

	public void setEducationVoucherDetails(Set<EducationVoucherDetailDto> educationVoucherDetails) {
		this.educationVoucherDetails = educationVoucherDetails;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	public Boolean getVoided() {
		return voided;
	}

	public void setVoided(Boolean voided) {
		this.voided = voided;
	}	

	public Long getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(Long totalElements) {
		this.totalElements = totalElements;
	}
	
	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public List<EducationVoucherDetailDto> getListEducationVoucherDetails() {
		return listEducationVoucherDetails;
	}

	public void setListEducationVoucherDetails(List<EducationVoucherDetailDto> listEducationVoucherDetails) {
		this.listEducationVoucherDetails = listEducationVoucherDetails;
	}


	public Integer getIsReceive() {
		return isReceive;
	}

	public void setIsReceive(Integer isReceive) {
		this.isReceive = isReceive;
	}


	public Integer getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(Integer paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public Boolean getIsWithdrawAble() {
		return isWithdrawAble;
	}

	public void setIsWithdrawAble(Boolean isWithdrawAble) {
		this.isWithdrawAble = isWithdrawAble;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public TrainingBaseDto getTrainingBase() {
		return trainingBase;
	}

	public void setTrainingBase(TrainingBaseDto trainingBase) {
		this.trainingBase = trainingBase;
	}

	public FeeItemDto getFeeItem() {
		return feeItem;
	}

	public void setFeeItem(FeeItemDto feeItem) {
		this.feeItem = feeItem;
	}

	public SemesterRegisterPeriodDto getPeriod() {
		return period;
	}

	public void setPeriod(SemesterRegisterPeriodDto period) {
		this.period = period;
	}

	public int getStudentType() {
		return studentType;
	}
	
	public void setStudentType(int studentType) {
		this.studentType = studentType;
	}
	
	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}	
	
	public String getNumberBook() {
		return numberBook;
	}

	public void setNumberBook(String numberBook) {
		this.numberBook = numberBook;
	}

	public Boolean getIsRedundant() {
		return isRedundant;
	}

	public void setIsRedundant(Boolean isRedundant) {
		this.isRedundant = isRedundant;
	}
	
	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}	

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}	

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public OnlinePaymentServiceProvider getServiceProvider() {
		return serviceProvider;
	}

	public void setServiceProvider(OnlinePaymentServiceProvider serviceProvider) {
		this.serviceProvider = serviceProvider;
	}

	public EducationVoucherDto() {

	}
	public EducationVoucherDto(Long id, Student student, Semester semester,Date voucherDate,Integer type, Double totalRecivedAmountInput,Double totalAmount) {
		this.setId(id);
		if(student!=null) {
			this.student=new StudentDto(student);
		}
		if(semester!=null) {
			this.semester =new SemesterDto();
			this.semester.setId(semester.getId());
			this.semester.setSemesterCode(semester.getSemesterCode());
			this.semester.setSemesterName(semester.getSemesterName());
		}
		this.setVoucherDate(voucherDate);
		this.setType(type);
		this.setTotalRecivedAmount(totalRecivedAmountInput);
		if (totalRecivedAmountInput != null) {
			this.totalReceivedAmountConvertToString = FormatNumberUtil.numberCurrentcyToString(totalRecivedAmountInput);
		}
		this.setTotalAmount(totalAmount);
	}
	public EducationVoucherDto(Long id, Student student, Semester semester,Date voucherDate,Integer type, Double totalRecivedAmountInput,Double totalAmount, Integer paymentMethod) {
		this.setId(id);
		if(student!=null) {
			this.student=new StudentDto(student);
		}
		if(semester!=null) {
			this.semester =new SemesterDto();
			this.semester.setId(semester.getId());
			this.semester.setSemesterCode(semester.getSemesterCode());
			this.semester.setSemesterName(semester.getSemesterName());
		}
		this.setVoucherDate(voucherDate);
		this.setType(type);
		this.setTotalRecivedAmount(totalRecivedAmountInput);
		if (totalRecivedAmountInput != null) {
			this.totalReceivedAmountConvertToString = FormatNumberUtil.numberCurrentcyToString(totalRecivedAmountInput);
		}
		this.setTotalAmount(totalAmount);
		this.setPaymentMethod(paymentMethod);
	}
	public EducationVoucherDto(EducationVoucher ev,FeeItem feeItem,Double totalAmount,Double totalRecivedAmountInput) {
		if(ev!=null) {
			this.id = ev.getId();
			this.code = ev.getCode();
			this.bankImportCode = ev.getBankImportCode();
			this.note = ev.getNote();
			if(ev.getSemester()!=null) {
				this.semester =new SemesterDto();
				this.semester.setId(ev.getSemester().getId());
				this.semester.setSemesterCode(ev.getSemester().getSemesterCode());
				this.semester.setSemesterName(ev.getSemester().getSemesterName());
			}			
//			this.totalPayedAmount=ev.getTotalPayedAmount();
//			this.totalRecivedAmount=ev.getTotalReceivedAmount();
//			this.totalAmount=ev.getTotalAmount();
			this.type=ev.getType();
			this.voucherDate=ev.getVoucherDate();
			this.createdBy=ev.getCreatedBy();

			this.isReceive = ev.getIsReceive();
			this.serviceProvider = ev.getServiceProvider();
			this.paymentMethod = ev.getPaymentMethod();
			this.status=ev.getStatus();
			if (ev.getEnrollmentClass() != null) {
				this.enrollmentClass = new EnrollmentClassDto(ev.getEnrollmentClass(), false, 1);
			}
			if(ev.getVoided()!=null) {
				this.voided=ev.getVoided();
			}
			if(ev.getStudent()!=null) {
				this.student=new StudentDto(ev.getStudent(),true);
				this.student.setCandidateProfile(new StudentCandidateProfileDto(ev.getStudent().getCandidateProfile(), true));
				if(this.student!=null && this.student.getEnrollmentClass()!=null && this.student.getEnrollmentClass().getCourseyear()!=null
						&& this.student.getEnrollmentClass().getCourseyear().getEducationLevel()!=null
						&& this.student.getEnrollmentClass().getCourseyear().getEducationType()!=null) {
					//DHCQ,CD
					if((this.student.getEnrollmentClass().getCourseyear().getEducationLevel().getCode().equals("DH")
						|| this.student.getEnrollmentClass().getCourseyear().getEducationLevel().getCode().equals("CD"))
							&& this.student.getEnrollmentClass().getCourseyear().getEducationType().getCode().equals("CQ")) {
						this.studentType=1;
					}
					//DHTC
					if((this.student.getEnrollmentClass().getCourseyear().getEducationLevel().getCode().equals("DH")
							|| this.student.getEnrollmentClass().getCourseyear().getEducationLevel().getCode().equals("CD"))
								&& this.student.getEnrollmentClass().getCourseyear().getEducationType().getCode().equals("VLVH")) {
							this.studentType=2;
					}
					//CAOHOC,NCS
					if((this.student.getEnrollmentClass().getCourseyear().getEducationLevel().getCode().equals("CH")
							|| this.student.getEnrollmentClass().getCourseyear().getEducationLevel().getCode().equals("NCS"))
								) {
							this.studentType=3;
					}
					//LT
					if(this.student.getEnrollmentClass().getCourseyear().getEducationLevel().getCode().equals("LT")
							){
							this.studentType=4;
					}
					if(ev.getStudent().getPrograms()!=null && ev.getStudent().getPrograms().size()>0) {
						for (StudentEducationProgram pro : ev.getStudent().getPrograms()) {
							if(pro.getProgram().getType()!=null && pro.getProgram().getType().equals(Const.EducationProgramTypeEnum.Advanced.getValue())) {
								this.studentType=5;
								break;
							}
						}
					}
				}
			}
			if(ev.getTrainingBase()!=null) {
				this.trainingBase = new TrainingBaseDto(ev.getTrainingBase());
			}
//			if (ev.getEducationVoucherDetails() != null && ev.getEducationVoucherDetails().size() > 0) {
//				Set<EducationVoucherDetailDto> educationVoucherDetails = new HashSet<EducationVoucherDetailDto>();
//				for (EducationVoucherDetail tt : ev.getEducationVoucherDetails()) {
//					EducationVoucherDetailDto ttDto = new EducationVoucherDetailDto();
//					ttDto.setId(tt.getId());
//					ttDto.setAmount(tt.getAmount());
//					ttDto.setDiscountAmount(tt.getDiscountAmount());
//					ttDto.setDiscountPercent(tt.getDiscountPercent());
//					ttDto.setIsCredit(tt.getIsCredit());
//					ttDto.setReceivedAmount(tt.getReceivedAmount());
//					ttDto.setIsRecived(tt.getIsRecived());
//					
//					if (tt.getFeeItem() != null) {
//						FeeItemDto r = new FeeItemDto();
//						r.setId(tt.getFeeItem().getId());
//						r.setCode(tt.getFeeItem().getCode());
//						r.setName(tt.getFeeItem().getName());
//						ttDto.setFeeItem(r);
//						
//					}
//					if (tt.getEducationVoucher() != null) {
//						EducationVoucherDto educationVoucher = new EducationVoucherDto();
//						educationVoucher.setId(tt.getEducationVoucher().getId());
//						if(tt.getEducationVoucher().getSemester()!=null)
//						educationVoucher.setSemester(new SemesterDto(tt.getEducationVoucher().getSemester()));
//						if(tt.getEducationVoucher().getStudent()!=null)
//							educationVoucher.setStudent(new StudentDto(tt.getEducationVoucher().getStudent()));
////						educationVoucher.setTotalPayedAmount(tt.getEducationVoucher().getTotalPayedAmount());
//						educationVoucher.setTotalRecivedAmount(tt.getEducationVoucher().getTotalReceivedAmount());
//						educationVoucher.setType(tt.getEducationVoucher().getType());
//						educationVoucher.setVoucherDate(tt.getEducationVoucher().getVoucherDate());
//						educationVoucher.setCode(tt.getEducationVoucher().getCode());
//						educationVoucher.setNote(tt.getEducationVoucher().getNote());
//						ttDto.setEducationVoucher(educationVoucher);
//					}
//					educationVoucherDetails.add(ttDto);
//				}
//				this.setEducationVoucherDetails(educationVoucherDetails);
//			}
		}
		if(feeItem!=null) {
			this.feeItem = new FeeItemDto(feeItem);
		}
		this.totalRecivedAmount = totalRecivedAmountInput;

		if (totalRecivedAmountInput != null) {
			this.totalReceivedAmountConvertToString = FormatNumberUtil.numberCurrentcyToString(totalRecivedAmountInput);
		}
		this.totalAmount = totalAmount;
	}
	public EducationVoucherDto(EducationVoucher ev,Double totalAmount,Double totalRecivedAmountInput) {
		if(ev!=null) {
			this.id = ev.getId();
			this.code = ev.getCode();
			this.note = ev.getNote();
			this.bankImportCode = ev.getBankImportCode();
			this.serviceProvider = ev.getServiceProvider();
			if(ev.getSemester()!=null) {
				this.semester =new SemesterDto();
				this.semester.setId(ev.getSemester().getId());
				this.semester.setSemesterCode(ev.getSemester().getSemesterCode());
				this.semester.setSemesterName(ev.getSemester().getSemesterName());
			}			
			if (ev.getEnrollmentClass() != null) {
				this.enrollmentClass = new EnrollmentClassDto(ev.getEnrollmentClass(), false, 1);
			}
//			this.totalPayedAmount=ev.getTotalPayedAmount();
//			this.totalRecivedAmount=ev.getTotalReceivedAmount();
//			this.totalAmount=ev.getTotalAmount();
			this.type=ev.getType();
			this.voucherDate=ev.getVoucherDate();
			this.createdBy=ev.getCreatedBy();

			this.isReceive = ev.getIsReceive();

			this.paymentMethod = ev.getPaymentMethod();
			this.status=ev.getStatus();

			if(ev.getVoided()!=null) {
				this.voided=ev.getVoided();
			}
			if(ev.getStudent()!=null) {
				this.student=new StudentDto(ev.getStudent(),true);
				this.student.setCandidateProfile(new StudentCandidateProfileDto(ev.getStudent().getCandidateProfile(), true));
				if(this.student!=null && this.student.getEnrollmentClass()!=null && this.student.getEnrollmentClass().getCourseyear()!=null
						&& this.student.getEnrollmentClass().getCourseyear().getEducationLevel()!=null
						&& this.student.getEnrollmentClass().getCourseyear().getEducationType()!=null) {
					//DHCQ,CD
					if((this.student.getEnrollmentClass().getCourseyear().getEducationLevel().getCode().equals("DH")
						|| this.student.getEnrollmentClass().getCourseyear().getEducationLevel().getCode().equals("CD"))
							&& this.student.getEnrollmentClass().getCourseyear().getEducationType().getCode().equals("CQ")) {
						this.studentType=1;
					}
					//DHTC
					if((this.student.getEnrollmentClass().getCourseyear().getEducationLevel().getCode().equals("DH")
							|| this.student.getEnrollmentClass().getCourseyear().getEducationLevel().getCode().equals("CD"))
								&& this.student.getEnrollmentClass().getCourseyear().getEducationType().getCode().equals("VLVH")) {
							this.studentType=2;
					}
					//CAOHOC,NCS
					if((this.student.getEnrollmentClass().getCourseyear().getEducationLevel().getCode().equals("CH")
							|| this.student.getEnrollmentClass().getCourseyear().getEducationLevel().getCode().equals("NCS"))
								) {
							this.studentType=3;
					}
					//LT
					if(this.student.getEnrollmentClass().getCourseyear().getEducationLevel().getCode().equals("LT")
							){
							this.studentType=4;
					}
					if(ev.getStudent().getPrograms()!=null && ev.getStudent().getPrograms().size()>0) {
						for (StudentEducationProgram pro : ev.getStudent().getPrograms()) {
							if(pro.getProgram().getType()!=null && pro.getProgram().getType().equals(Const.EducationProgramTypeEnum.Advanced.getValue())) {
								this.studentType=5;
								break;
							}
						}
					}
				}
			}
			if(ev.getTrainingBase()!=null) {
				this.trainingBase = new TrainingBaseDto(ev.getTrainingBase());
			}
			if (ev.getEducationVoucherDetails() != null && ev.getEducationVoucherDetails().size() > 0) {
				Set<EducationVoucherDetailDto> educationVoucherDetails = new HashSet<EducationVoucherDetailDto>();
				for (EducationVoucherDetail tt : ev.getEducationVoucherDetails()) {
					EducationVoucherDetailDto ttDto = new EducationVoucherDetailDto();
					ttDto.setId(tt.getId());
					ttDto.setAmount(tt.getAmount());
					ttDto.setDiscountAmount(tt.getDiscountAmount());
					ttDto.setDiscountPercent(tt.getDiscountPercent());
					ttDto.setIsCredit(tt.getIsReceive());
					ttDto.setReceivedAmount(tt.getReceivedAmount());
					ttDto.setAmountDone(tt.getAmountDone());
					ttDto.setType(tt.getType());
					if(tt.getAmountDone()!=null && tt.getReceivedAmount()!=null && tt.getReceivedAmount()>tt.getAmountDone()) {
						this.isRedundant=true;//trường hợp thu thừa tiền cần thu lại
					}
					//set tình trạng thu phí nhập học
					if(tt.getReceivedAmount()>0 ||(tt.getReceivedAmount()==0 && tt.getDiscountAmount()!=null&& tt.getDiscountAmount()>0)) {
						ttDto.setStatus(true);
					}else {
						ttDto.setStatus(false);
					}
//					ttDto.setIsRecived(tt.getIsRecived());
					
					if (tt.getFeeItem() != null) {
						FeeItemDto r = new FeeItemDto();
						r.setId(tt.getFeeItem().getId());
						r.setCode(tt.getFeeItem().getCode());
						r.setName(tt.getFeeItem().getName());
						r.setType(tt.getFeeItem().getType());
						ttDto.setFeeItem(r);
					}
					educationVoucherDetails.add(ttDto);
				}
				this.setEducationVoucherDetails(educationVoucherDetails);
			}
		}		
		this.totalRecivedAmount = totalRecivedAmountInput;

		if (totalRecivedAmountInput != null) {
			this.totalReceivedAmountConvertToString = FormatNumberUtil.numberCurrentcyToString(totalRecivedAmountInput);
		}
		this.totalAmount = totalAmount;
	}
	public EducationVoucherDto(EducationVoucher ev) {
		if(ev!=null) {
			this.id = ev.getId();
			this.code = ev.getCode();
			this.note = ev.getNote();
			this.bankImportCode = ev.getBankImportCode();
			this.serviceProvider = ev.getServiceProvider();
			if(ev.getSemester()!=null) {
				this.semester =new SemesterDto();
				this.semester.setId(ev.getSemester().getId());
				this.semester.setSemesterCode(ev.getSemester().getSemesterCode());
				this.semester.setSemesterName(ev.getSemester().getSemesterName());
			}
			if(ev.getPeriod()!=null) {
				this.period = new SemesterRegisterPeriodDto();
				this.period.setId(ev.getPeriod().getId());
				this.period.setName(ev.getPeriod().getName());				
			}
			if (ev.getEnrollmentClass() != null) {
				this.enrollmentClass = new EnrollmentClassDto(ev.getEnrollmentClass(), false, 1);
			}
//			this.totalPayedAmount=ev.getTotalPayedAmount();
			this.totalRecivedAmount=ev.getTotalReceivedAmount();
			if (ev.getTotalReceivedAmount() != null) {
				this.totalReceivedAmountConvertToString = FormatNumberUtil.numberCurrentcyToString(ev.getTotalReceivedAmount());
			}
			this.totalAmount=ev.getTotalAmount();
			this.type=ev.getType();
			this.voucherDate=ev.getVoucherDate();
			this.createdBy=ev.getCreatedBy();
			this.modifiedBy=ev.getModifiedBy();
			this.isReceive = ev.getIsReceive();

			this.paymentMethod = ev.getPaymentMethod();
			this.status=ev.getStatus();

			if(ev.getVoided()!=null) {
				this.voided=ev.getVoided();
			}
			if(ev.getStudent()!=null) {
				this.student=new StudentDto(ev.getStudent(),1);
			}
			if(ev.getTrainingBase()!=null) {
				this.trainingBase = new TrainingBaseDto(ev.getTrainingBase());
			}
			this.createBy = ev.getCreatedBy();
			if (ev.getEducationVoucherDetails() != null && ev.getEducationVoucherDetails().size() > 0) {
				Set<EducationVoucherDetailDto> educationVoucherDetails = new HashSet<EducationVoucherDetailDto>();
				for (EducationVoucherDetail tt : ev.getEducationVoucherDetails()) {
					EducationVoucherDetailDto ttDto = new EducationVoucherDetailDto();
					ttDto.setId(tt.getId());
					ttDto.setAmount(tt.getAmount());
					ttDto.setDiscountAmount(tt.getDiscountAmount());
					ttDto.setDiscountPercent(tt.getDiscountPercent());
					ttDto.setIsCredit(tt.getIsReceive());
					ttDto.setReceivedAmount(tt.getReceivedAmount());
					ttDto.setAmountDone(tt.getAmountDone());
					ttDto.setType(tt.getType());
					if(tt.getAmountDone()!=null && tt.getReceivedAmount()!=null && tt.getReceivedAmount()>tt.getAmountDone()) {
						this.isRedundant=true;//trường hợp thu thừa tiền cần thu lại
					}
					//set tình trạng thu phí nhập học
					if(tt.getReceivedAmount()>0 ||(tt.getReceivedAmount()==0 && tt.getDiscountAmount()!=null&& tt.getDiscountAmount()>0)) {
						ttDto.setStatus(true);
					}else {
						ttDto.setStatus(false);
					}
//					ttDto.setIsRecived(tt.getIsRecived());
					
					if (tt.getFeeItem() != null) {
						FeeItemDto r = new FeeItemDto();
						r.setId(tt.getFeeItem().getId());
						r.setCode(tt.getFeeItem().getCode());
						r.setName(tt.getFeeItem().getName());
						r.setType(tt.getFeeItem().getType());
						ttDto.setFeeItem(r);
					}
//					if (tt.getEducationVoucher() != null) {
//						EducationVoucherDto educationVoucher = new EducationVoucherDto();
//						educationVoucher.setId(tt.getEducationVoucher().getId());
//						if(tt.getEducationVoucher().getSemester()!=null)
//						educationVoucher.setSemester(new SemesterDto(tt.getEducationVoucher().getSemester()));
//						if(tt.getEducationVoucher().getStudent()!=null)
//							educationVoucher.setStudent(new StudentDto(tt.getEducationVoucher().getStudent()));
////						educationVoucher.setTotalPayedAmount(tt.getEducationVoucher().getTotalPayedAmount());
//						educationVoucher.setTotalRecivedAmount(tt.getEducationVoucher().getTotalReceivedAmount());
//						if (tt.getEducationVoucher().getTotalReceivedAmount() != null) {
//							educationVoucher.setTotalReceivedAmountConvertToString(FormatNumberUtil.numberCurrentcyToString(ev.getTotalReceivedAmount()));
//						}
//						educationVoucher.setType(tt.getEducationVoucher().getType());
//						educationVoucher.setVoucherDate(tt.getEducationVoucher().getVoucherDate());
//						educationVoucher.setCode(tt.getEducationVoucher().getCode());
//						educationVoucher.setNote(tt.getEducationVoucher().getNote());
//						
//					}
					educationVoucherDetails.add(ttDto);
				}
				this.setEducationVoucherDetails(educationVoucherDetails);
			}
		}
	}
	public EducationVoucherDto(EducationVoucher ev,boolean simple) {
		if(ev!=null) {
			this.id = ev.getId();
			this.code = ev.getCode();
			this.note = ev.getNote();
			this.bankImportCode = ev.getBankImportCode();
			this.serviceProvider = ev.getServiceProvider();
			if(ev.getSemester()!=null) {
				this.semester =new SemesterDto();
				this.semester.setId(ev.getSemester().getId());
				this.semester.setSemesterCode(ev.getSemester().getSemesterCode());
				this.semester.setSemesterName(ev.getSemester().getSemesterName());
			}
			if(ev.getPeriod()!=null) {
				this.period = new SemesterRegisterPeriodDto();
				this.period.setId(ev.getPeriod().getId());
				this.period.setName(ev.getPeriod().getName());				
			}
			if (ev.getEnrollmentClass() != null) {
				this.enrollmentClass = new EnrollmentClassDto(ev.getEnrollmentClass(), false, 1);
			}
//			this.totalPayedAmount=ev.getTotalPayedAmount();
			this.totalRecivedAmount=ev.getTotalReceivedAmount();
//			if (ev.getTotalReceivedAmount() != null) {
//				this.totalReceivedAmountConvertToString = FormatNumberUtil.numberCurrentcyToString(ev.getTotalReceivedAmount());
//			}
			this.totalAmount=ev.getTotalAmount();
			this.type=ev.getType();
			this.voucherDate=ev.getVoucherDate();
			this.createdBy=ev.getCreatedBy();
			this.modifiedBy=ev.getModifiedBy();
			this.isReceive = ev.getIsReceive();

			this.paymentMethod = ev.getPaymentMethod();
			this.status=ev.getStatus();

			if(ev.getVoided()!=null) {
				this.voided=ev.getVoided();
			}
			if(ev.getStudent()!=null) {
				this.student=new StudentDto(ev.getStudent(),1);
			}
			if(ev.getTrainingBase()!=null) {
				this.trainingBase = new TrainingBaseDto(ev.getTrainingBase());
			}
			this.createBy = ev.getCreatedBy();
			this.modifiedDate=ev.getModifyDate().toDate();
		}
	}
}
