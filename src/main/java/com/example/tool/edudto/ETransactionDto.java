package com.example.tool.edudto;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.globits.core.dto.BaseObjectDto;
import com.globits.education.datatype.ETransactionStatus;
import com.globits.education.datatype.ETransactionType;
import com.globits.education.datatype.OnlinePaymentServiceProvider;
import com.globits.education.domain.ETransaction;
import com.globits.education.domain.ETransactionDetail;
import com.globits.education.domain.EducationVoucher;
import com.globits.education.domain.Semester;
import com.globits.education.domain.Student;
import com.globits.education.dto.ETransactionDetailDto;
import com.globits.education.dto.EducationVoucherDto;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.StudentDto;
import com.globits.education.dto.TuitionFeeDto.AdmissionFeePayOnlineDto;
import com.globits.education.dto.TuitionFeeDto.VnPayRequestDto;

public class ETransactionDto extends BaseObjectDto {
	
	private ETransactionType type;//Loại: ví điện tử, giao dịch ngân hàng trực tuyến (internet banking), thẻ tín dụng...
	
	//Mã ví điện tử, ví dụ: VNPay, Momo, VietCombank
	private OnlinePaymentServiceProvider serviceProvider;
	
	private ETransactionStatus status;
	
	private String statusContent;
	
	private String cardCode;//Mã số thẻ ngân hàng, tài khoản ví điện tử,...
	
	private StudentDto student;//Thuộc về sinh viên nào
	
	private Long studentId;
	
	private EducationVoucherDto educationVoucher;
	
	private SemesterDto semester;
	
	private String transactionNo;//Mã giao dịch
	
	private String contentRequest;//Nội dung giao dịch gửi đi
	
	private String contentRespone;//Nội dung giao dịch nhận về

	private List<ETransactionDetailDto> transactionDetails;
	
	private Double totalAmount;//Tổng số tiền phải nộp (dựa theo khoản phải thu của sinh viên)
	
	private Double totalReceivedAmount;//Tổng số tiền đã nhận qua giao dịch

	private VnPayRequestDto vnPayRequestDto;
	
	private String requestURL;
	
	private String providerTransactionNo;//Mã giao dịch của nhà cung cấp dịch vụ
	
	private String studentCode;//Mã sinh viên
	
	private Long semesterId;//Hoc kỳ
	
	public ETransactionDto() {
		
	}
	
	public ETransactionDto(ETransaction entity) {
		super();
		if(entity!=null) {
			this.type = entity.getType();
			this.serviceProvider = entity.getServiceProvider();
			this.status = entity.getStatus();
			this.statusContent = entity.getStatusContent();
			this.cardCode = entity.getCardCode();
			if(entity.getStudent()!=null) {
				this.student = new StudentDto();
				this.student.setId(entity.getStudent().getId());
				this.student.setStudentCode(entity.getStudent().getStudentCode());
				this.student.setDisplayName(entity.getStudent().getDisplayName());
				
				this.studentId = entity.getStudent().getId();
			}	
			if(entity.getEducationVoucher()!=null) {
				this.educationVoucher = new EducationVoucherDto();
				this.educationVoucher.setId(entity.getEducationVoucher().getId());
			}
			if(entity.getSemester()!=null) {
				this.semester = new SemesterDto();
				this.semester.setId(entity.getSemester().getId());
				this.semester.setSemesterCode(entity.getSemester().getSemesterCode());
				this.semester.setSemesterName(entity.getSemester().getSemesterName());
			}
			this.transactionNo = entity.getTransactionNo();
			this.contentRequest = entity.getContentRequest();
			this.contentRespone = entity.getContentRespone();
			this.totalAmount = entity.getTotalAmount();
			this.totalReceivedAmount = entity.getTotalReceivedAmount();
			this.requestURL = entity.getRequestURL();
			if(entity.getContentRequest()!=null && entity.getContentRequest().length()>0) {
				ObjectMapper objectMapper = new ObjectMapper();
	        	try {
					this.vnPayRequestDto = objectMapper.readValue(entity.getContentRequest(), VnPayRequestDto.class);
				} catch (JsonParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (JsonMappingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public ETransactionDto(AdmissionFeePayOnlineDto admissionFeeDto) {
		if(admissionFeeDto!=null) {
			this.type = ETransactionType.E_WALLET;
			this.serviceProvider = OnlinePaymentServiceProvider.VNPay;
			this.status = ETransactionStatus.NEW;
			this.statusContent = "";
			this.cardCode = "";			
			if(admissionFeeDto.getStudent()!=null) {
				this.student = admissionFeeDto.getStudent();
				this.studentId = admissionFeeDto.getStudent().getId();
			}
			if(admissionFeeDto.getSemester()!=null) {
				this.semester = new SemesterDto();
				this.semester.setId(admissionFeeDto.getSemester().getId());
			}
			this.educationVoucher = admissionFeeDto.getEducationVoucher();
			this.transactionNo = "";
			this.contentRequest = "";
			this.contentRespone = "";
			this.transactionDetails = admissionFeeDto.getTransactionDetails();
			this.totalAmount = admissionFeeDto.getTotalAmount();
			this.totalReceivedAmount = admissionFeeDto.getTotalReceivedAmount();
			this.vnPayRequestDto = null;;
			this.requestURL = "";
		}
	}
	
	public ETransactionDto(ETransactionType type, OnlinePaymentServiceProvider serviceProvider,
			ETransactionStatus status, String statusContent, String cardCode, StudentDto student, Long studentId,
			EducationVoucherDto educationVoucher, String transactionNo, String contentRequest, String contentRespone,
			List<ETransactionDetailDto> transactionDetails, Double totalAmount, Double totalReceivedAmount,
			VnPayRequestDto vnPayRequestDto, String requestURL) {
		super();
		this.type = type;
		this.serviceProvider = serviceProvider;
		this.status = status;
		this.statusContent = statusContent;
		this.cardCode = cardCode;
		this.student = student;
		this.studentId = studentId;
		this.educationVoucher = educationVoucher;
		this.transactionNo = transactionNo;
		this.contentRequest = contentRequest;
		this.contentRespone = contentRespone;
		this.transactionDetails = transactionDetails;
		this.totalAmount = totalAmount;
		this.totalReceivedAmount = totalReceivedAmount;
		this.vnPayRequestDto = vnPayRequestDto;
		this.requestURL = requestURL;
	}

	public ETransactionType getType() {
		return type;
	}

	public void setType(ETransactionType type) {
		this.type = type;
	}

	public OnlinePaymentServiceProvider getServiceProvider() {
		return serviceProvider;
	}

	public void setServiceProvider(OnlinePaymentServiceProvider serviceProvider) {
		this.serviceProvider = serviceProvider;
	}

	public ETransactionStatus getStatus() {
		return status;
	}

	public void setStatus(ETransactionStatus status) {
		this.status = status;
	}

	public String getStatusContent() {
		return statusContent;
	}

	public void setStatusContent(String statusContent) {
		this.statusContent = statusContent;
	}

	public String getCardCode() {
		return cardCode;
	}

	public void setCardCode(String cardCode) {
		this.cardCode = cardCode;
	}

	public StudentDto getStudent() {
		return student;
	}

	public void setStudent(StudentDto student) {
		this.student = student;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public EducationVoucherDto getEducationVoucher() {
		return educationVoucher;
	}

	public void setEducationVoucher(EducationVoucherDto educationVoucher) {
		this.educationVoucher = educationVoucher;
	}

	public SemesterDto getSemester() {
		return semester;
	}

	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}

	public String getTransactionNo() {
		return transactionNo;
	}

	public void setTransactionNo(String transactionNo) {
		this.transactionNo = transactionNo;
	}

	public String getContentRequest() {
		return contentRequest;
	}

	public void setContentRequest(String contentRequest) {
		this.contentRequest = contentRequest;
	}

	public String getContentRespone() {
		return contentRespone;
	}

	public void setContentRespone(String contentRespone) {
		this.contentRespone = contentRespone;
	}

	public List<ETransactionDetailDto> getTransactionDetails() {
		return transactionDetails;
	}

	public void setTransactionDetails(List<ETransactionDetailDto> transactionDetails) {
		this.transactionDetails = transactionDetails;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public Double getTotalReceivedAmount() {
		return totalReceivedAmount;
	}

	public void setTotalReceivedAmount(Double totalReceivedAmount) {
		this.totalReceivedAmount = totalReceivedAmount;
	}

	public VnPayRequestDto getVnPayRequestDto() {
		return vnPayRequestDto;
	}

	public void setVnPayRequestDto(VnPayRequestDto vnPayRequestDto) {
		this.vnPayRequestDto = vnPayRequestDto;
	}

	public String getRequestURL() {
		return requestURL;
	}

	public void setRequestURL(String requestURL) {
		this.requestURL = requestURL;
	}

	public String getProviderTransactionNo() {
		return providerTransactionNo;
	}

	public void setProviderTransactionNo(String providerTransactionNo) {
		this.providerTransactionNo = providerTransactionNo;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public Long getSemesterId() {
		return semesterId;
	}

	public void setSemesterId(Long semesterId) {
		this.semesterId = semesterId;
	}
}
