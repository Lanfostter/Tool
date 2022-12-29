package com.example.tool.edudto;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.globits.education.domain.EducationVoucher;
import com.globits.education.domain.EducationVoucherDetail;
import com.globits.education.domain.FeeConfigItem;
import com.globits.education.domain.FeeItem;
import com.globits.education.domain.Semester;
import com.globits.education.domain.Student;
import com.globits.education.dto.EducationVoucherDto;

public class ReportEducationVoucherDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Double totalAmount;//Tổng số tiền thu
	private Double totalRecivedAmount;//Tổng số tiền thực thu
	private int countStudentMissingAdmissionFee;//số sv đóng tiền thiếu(bao gồm cả miễn giảm)
	private int countStudentExcessAdmissionFee;//số sv đóng tiền thừa
	private int countStudentDiscountAdmissionFee;//số sv được miễn giảm
	private int countStudentAdmissionFee;//số sv nộp đủ
	private int totalStudentPay;
	private int totalStudentNotPay;
	private List<EducationVoucherDto> educationVouchers;
	private int totalStudent;//tổng số sinh viên

	
	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Double getTotalRecivedAmount() {
		return totalRecivedAmount;
	}

	public void setTotalRecivedAmount(Double totalRecivedAmount) {
		this.totalRecivedAmount = totalRecivedAmount;
	}

	public int getTotalStudentPay() {
		return totalStudentPay;
	}

	public void setTotalStudentPay(int totalStudentPay) {
		this.totalStudentPay = totalStudentPay;
	}

	public int getTotalStudentNotPay() {
		return totalStudentNotPay;
	}

	public void setTotalStudentNotPay(int totalStudentNotPay) {
		this.totalStudentNotPay = totalStudentNotPay;
	}

	public List<EducationVoucherDto> getEducationVouchers() {
		return educationVouchers;
	}

	public void setEducationVouchers(List<EducationVoucherDto> educationVouchers) {
		this.educationVouchers = educationVouchers;
	}

	public int getCountStudentMissingAdmissionFee() {
		return countStudentMissingAdmissionFee;
	}

	public void setCountStudentMissingAdmissionFee(int countStudentMissingAdmissionFee) {
		this.countStudentMissingAdmissionFee = countStudentMissingAdmissionFee;
	}

	public int getCountStudentExcessAdmissionFee() {
		return countStudentExcessAdmissionFee;
	}

	public void setCountStudentExcessAdmissionFee(int countStudentExcessAdmissionFee) {
		this.countStudentExcessAdmissionFee = countStudentExcessAdmissionFee;
	}

	public int getCountStudentDiscountAdmissionFee() {
		return countStudentDiscountAdmissionFee;
	}

	public void setCountStudentDiscountAdmissionFee(int countStudentDiscountAdmissionFee) {
		this.countStudentDiscountAdmissionFee = countStudentDiscountAdmissionFee;
	}
	

	public int getCountStudentAdmissionFee() {
		return countStudentAdmissionFee;
	}

	public void setCountStudentAdmissionFee(int countStudentAdmissionFee) {
		this.countStudentAdmissionFee = countStudentAdmissionFee;
	}	

	public int getTotalStudent() {
		return totalStudent;
	}

	public void setTotalStudent(int totalStudent) {
		this.totalStudent = totalStudent;
	}

	public ReportEducationVoucherDto() {

	}
}
