package com.example.tool.edudto;

import java.io.Serializable;

import com.globits.core.dto.BaseObjectDto;
import com.globits.education.Const.StudyAlertEnum;
import com.globits.education.domain.StudentObject;
import com.globits.education.domain.StudyAlertCondition;
import com.globits.education.domain.StudyAlertConditionLevel;
import com.globits.education.domain.StudyAlertConditionStudentObject;
import com.globits.education.domain.StudyAlertLevel;
import com.globits.education.dto.StudentObjectDto;
import com.globits.education.dto.StudyAlertConditionDto;

public class StudyAlertConditionStudentObjectDto extends BaseObjectDto
{
	private Long id;
	private StudentObjectDto studentObject;
	private StudyAlertConditionDto studyAlertCondition;
	private String operator;//Toán tử (>, >=, ...)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public StudentObjectDto getStudentObject() {
		return studentObject;
	}
	public void setStudentObject(StudentObjectDto studentObject) {
		this.studentObject = studentObject;
	}
	public StudyAlertConditionDto getStudyAlertCondition() {
		return studyAlertCondition;
	}
	public void setStudyAlertCondition(StudyAlertConditionDto studyAlertCondition) {
		this.studyAlertCondition = studyAlertCondition;
	}
	
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	public StudyAlertConditionStudentObjectDto() {
		
	}
	
	public StudyAlertConditionStudentObjectDto( StudyAlertConditionStudentObject entity) {
		this.id = entity.getId();
		if(entity.getStudentObject()!=null) {
			this.studentObject=new StudentObjectDto(entity.getStudentObject());
		}
		if(entity.getStudyAlertCondition()!=null) {
			this.studyAlertCondition=new StudyAlertConditionDto();
			this.studyAlertCondition.setId(entity.getStudyAlertCondition().getId());
			//bổ sung thêm
		}
		
		this.operator=entity.getOperator();
	}
	
}
