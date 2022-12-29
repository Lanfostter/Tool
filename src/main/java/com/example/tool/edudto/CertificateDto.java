package com.example.tool.edudto;
import java.io.Serializable;
import com.globits.education.domain.Certificate;

public class CertificateDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String code;
	private String placeOfIssue;	//nơi cấp
	private boolean isDuplicate;
	private String dupName;
	private String dupCode;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPlaceOfIssue() {
		return placeOfIssue;
	}
	public void setPlaceOfIssue(String placeOfIssue) {
		this.placeOfIssue = placeOfIssue;
	}

	public boolean isDuplicate() {
		return isDuplicate;
	}
	public void setDuplicate(boolean isDuplicate) {
		this.isDuplicate = isDuplicate;
	}
	public String getDupName() {
		return dupName;
	}
	public void setDupName(String dupName) {
		this.dupName = dupName;
	}
	public String getDupCode() {
		return dupCode;
	}
	public void setDupCode(String dupCode) {
		this.dupCode = dupCode;
	}
	public CertificateDto() {

	}

	public CertificateDto(Certificate c) {
		this.id = c.getId();
		this.name = c.getName();
		this.code = c.getCode();
		this.placeOfIssue = c.getPlaceOfIssue();
	}
}
