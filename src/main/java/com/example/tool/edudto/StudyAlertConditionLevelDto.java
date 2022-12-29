package com.example.tool.edudto;

import java.io.Serializable;

import com.globits.core.dto.BaseObjectDto;
import com.globits.education.Const.StudyAlertEnum;
import com.globits.education.domain.StudyAlertCondition;
import com.globits.education.domain.StudyAlertConditionLevel;
import com.globits.education.domain.StudyAlertLevel;
import com.globits.education.dto.StudyAlertConditionDto;
import com.globits.education.dto.StudyAlertLevelDto;

public class StudyAlertConditionLevelDto extends BaseObjectDto
{
	private Long id;
	private StudyAlertLevelDto studyAlertLevel;
	private StudyAlertConditionDto studyAlertCondition;
	private Integer conditionType;//0= liên tục, 1= tổng,
	private Integer numberStudyAlert;//Giá trị số lượng lần cảnh báo
	private String operator;//Toán tử (>, >=, ...)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public StudyAlertLevelDto getStudyAlertLevel() {
		return studyAlertLevel;
	}
	public void setStudyAlertLevel(StudyAlertLevelDto studyAlertLevel) {
		this.studyAlertLevel = studyAlertLevel;
	}
	public StudyAlertConditionDto getStudyAlertCondition() {
		return studyAlertCondition;
	}
	public void setStudyAlertCondition(StudyAlertConditionDto studyAlertCondition) {
		this.studyAlertCondition = studyAlertCondition;
	}
	public Integer getConditionType() {
		return conditionType;
	}
	public void setConditionType(Integer conditionType) {
		this.conditionType = conditionType;
	}
	public Integer getNumberStudyAlert() {
		return numberStudyAlert;
	}
	public void setNumberStudyAlert(Integer numberStudyAlert) {
		this.numberStudyAlert = numberStudyAlert;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	public StudyAlertConditionLevelDto() {
		
	}
	
	public StudyAlertConditionLevelDto( StudyAlertConditionLevel entity) {
		this.id = entity.getId();
		if(entity.getStudyAlertLevel()!=null) {
			this.studyAlertLevel=new StudyAlertLevelDto(entity.getStudyAlertLevel());
		}
		if(entity.getStudyAlertCondition()!=null) {
			this.studyAlertCondition=new StudyAlertConditionDto();
			this.studyAlertCondition.setId(entity.getStudyAlertCondition().getId());
			//bổ sung thêm
		}
		this.conditionType=entity.getConditionType();
		this.numberStudyAlert=entity.getNumberStudyAlert();
		this.operator=entity.getOperator();
	}
	
}
