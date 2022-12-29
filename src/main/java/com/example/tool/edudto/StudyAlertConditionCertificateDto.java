package com.example.tool.edudto;

import java.io.Serializable;

import com.globits.core.dto.BaseObjectDto;
import com.globits.education.Const.StudyAlertEnum;
import com.globits.education.domain.Certificate;
import com.globits.education.domain.StudentObject;
import com.globits.education.domain.StudyAlertCondition;
import com.globits.education.domain.StudyAlertConditionCertificate;
import com.globits.education.domain.StudyAlertConditionLevel;
import com.globits.education.domain.StudyAlertConditionStudentObject;
import com.globits.education.domain.StudyAlertLevel;
import com.globits.education.dto.CertificateDto;
import com.globits.education.dto.StudyAlertConditionDto;

public class StudyAlertConditionCertificateDto extends BaseObjectDto
{
	private Long id;
	private CertificateDto certificate;
	private StudyAlertConditionDto studyAlertCondition;
//	private String operator;//Toán tử (>, >=, ...)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public CertificateDto getCertificate() {
		return certificate;
	}
	public void setCertificate(CertificateDto certificate) {
		this.certificate = certificate;
	}
	public StudyAlertConditionDto getStudyAlertCondition() {
		return studyAlertCondition;
	}
	public void setStudyAlertCondition(StudyAlertConditionDto studyAlertCondition) {
		this.studyAlertCondition = studyAlertCondition;
	}
	
//	public String getOperator() {
//		return operator;
//	}
//	public void setOperator(String operator) {
//		this.operator = operator;
//	}
//	
	public StudyAlertConditionCertificateDto() {
		
	}
	
	public StudyAlertConditionCertificateDto(StudyAlertConditionCertificate entity) {
		this.id = entity.getId();
		if(entity.getCertificate()!=null) {
			this.certificate=new CertificateDto(entity.getCertificate());
		}
		if(entity.getStudyAlertCondition()!=null) {
			this.studyAlertCondition=new StudyAlertConditionDto();
			this.studyAlertCondition.setId(entity.getStudyAlertCondition().getId());
			//bổ sung thêm
		}
		
//		this.operator=entity.getOperator();
	}
	
}
