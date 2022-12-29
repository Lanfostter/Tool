package com.example.tool.edudto;

import java.util.Date;
import java.util.List;

import com.globits.education.domain.FeeItem;

public class ReportExcelDto {

	private Date fromDate; // từ ngày
	private Date toDate; // đến ngày
	private Long courseYearId; //	khóa học
	private Long semesterId; //	Học kỳ
	private List<FeeItem> ListFeeItem; //	Loại khoản
	private Long trainingBaseId; //	cơ sở
	private Integer paymentMethod;//phương thức thanh toán
	private String serviceProvider; // Nhà cung cấp
	
	public Long getTrainingBaseId() {
		return trainingBaseId;
	}
	public void setTrainingBaseId(Long trainingBaseId) {
		this.trainingBaseId = trainingBaseId;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public Long getCourseYearId() {
		return courseYearId;
	}
	public void setCourseYearId(Long courseYearId) {
		this.courseYearId = courseYearId;
	}
	public Long getSemesterId() {
		return semesterId;
	}
	public void setSemesterId(Long semesterId) {
		this.semesterId = semesterId;
	}
	public List<FeeItem> getListFeeItem() {
		return ListFeeItem;
	}
	public void setListFeeItem(List<FeeItem> listFeeItem) {
		ListFeeItem = listFeeItem;
	}
	public Integer getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(Integer paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getServiceProvider() { return serviceProvider; }
	public void setServiceProvider(String serviceProvider) { this.serviceProvider = serviceProvider; }
}
