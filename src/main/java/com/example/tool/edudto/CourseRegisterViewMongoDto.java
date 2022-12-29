package com.example.tool.edudto;

import java.io.Serializable;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import com.globits.education.domain.CourseRegisterViewMongo;
import com.globits.education.dto.StudentCourseRegisterViewDto;
import com.globits.education.utils.JsonUtil;

public class CourseRegisterViewMongoDto implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ObjectId id;
    private Long studentId;
	private Long semesterId;
	private Long periodId;    
	private Long classId;
    private StudentCourseRegisterViewDto studentCourseRegisterView;
    
    public CourseRegisterViewMongoDto() {
    	
    }
    public CourseRegisterViewMongoDto(CourseRegisterViewMongo entity) {
    	if(entity!=null) {
    		this.id = new ObjectId(entity.getId());
    		this.studentId = entity.getStudentId();
    		this.semesterId = entity.getSemesterId();
    		this.periodId = entity.getPeriodId();
    		if(entity.getStudentCourseRegisterView()!=null && entity.getStudentCourseRegisterView().length()>0) {
//    			System.out.println(entity.getStudentCourseRegisterView());
    			this.studentCourseRegisterView = JsonUtil.jsonToObject(entity.getStudentCourseRegisterView(), StudentCourseRegisterViewDto.class);
    		}
    	}
    }
	public CourseRegisterViewMongoDto(ObjectId _id, Long studentId, Long semesterId, Long periodId,
			StudentCourseRegisterViewDto studentCourseRegisterView) {
		super();
		this.id = _id;
		this.studentId = studentId;
		this.semesterId = semesterId;
		this.periodId = periodId;
		this.studentCourseRegisterView = studentCourseRegisterView;
	}

	public String getId() {
		return id.toHexString();
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public Long getSemesterId() {
		return semesterId;
	}

	public void setSemesterId(Long semesterId) {
		this.semesterId = semesterId;
	}

	public Long getPeriodId() {
		return periodId;
	}

	public void setPeriodId(Long periodId) {
		this.periodId = periodId;
	}

	public Long getClassId() {
		return classId;
	}
	public void setClassId(Long classId) {
		this.classId = classId;
	}
	public StudentCourseRegisterViewDto getStudentCourseRegisterView() {
		return studentCourseRegisterView;
	}

	public void setStudentCourseRegisterView(StudentCourseRegisterViewDto studentCourseRegisterView) {
		this.studentCourseRegisterView = studentCourseRegisterView;
	}
    
    
}
