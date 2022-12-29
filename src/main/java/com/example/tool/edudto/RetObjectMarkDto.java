package com.example.tool.edudto;

import java.util.ArrayList;
import java.util.List;

import com.globits.education.dto.StudentMarkDto;

public class RetObjectMarkDto<T> {
	private String code;
	private String message;
	private String detailErrorMessage;
	private int numberOfFailed;
	private int numberOfSuccess;
	private int total;
	private List<String> listError = new ArrayList<String>();
	private List<T> resultContents = new ArrayList<T>();
	private List<StudentMarkDto> listMark = new ArrayList<StudentMarkDto>();
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getNumberOfFailed() {
		return numberOfFailed;
	}
	public void setNumberOfFailed(int numberOfFailed) {
		this.numberOfFailed = numberOfFailed;
	}
	public int getNumberOfSuccess() {
		return numberOfSuccess;
	}
	public void setNumberOfSuccess(int numberOfSuccess) {
		this.numberOfSuccess = numberOfSuccess;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getDetailErrorMessage() {
		return detailErrorMessage;
	}
	public void setDetailErrorMessage(String detailErrorMessage) {
		this.detailErrorMessage = detailErrorMessage;
	}
	public List<String> getListError() {
		return listError;
	}
	public void setListError(List<String> listError) {
		this.listError = listError;
	}
	public List<T> getResultContents() {
		return resultContents;
	}
	public void setResultContents(List<T> resultContents) {
		this.resultContents = resultContents;
	}
	public List<StudentMarkDto> getListMark() {
		return listMark;
	}
	public void setListMark(List<StudentMarkDto> listMark) {
		this.listMark = listMark;
	}
	
}
