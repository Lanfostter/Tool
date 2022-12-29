package com.example.tool.edudto;

import java.io.Serializable;
import java.util.Date;

import org.bson.types.ObjectId;

import com.globits.education.domain.RegisterPeriodTimeConfigViewMongo;

public class RegisterPeriodTimeConfigViewMongoDto implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ObjectId id;
	private Long classId;
	private Long periodId;
	private Boolean isGrant;
	private Date startRegisterDate; // ngày bắt đầu đăng ký học
	private Date endRegisterDate;// ngày kết thúc đăng ký học
	private Date startUnRegisterTime; // ngày bắt đầu hủy đăng ký học
	private Date endUnRegisterTime; // ngày kết thúc hủy đăng ký học
    
    public RegisterPeriodTimeConfigViewMongoDto() {
    	
    }

	public RegisterPeriodTimeConfigViewMongoDto(RegisterPeriodTimeConfigViewMongo entity) {
    	if(entity!=null) {
    		this.id = new ObjectId(entity.getId());
    		this.classId = entity.getClassId();
    		this.isGrant = entity.getIsGrant();
    		this.periodId = entity.getPeriodId();
    		this.startRegisterDate=entity.getStartRegisterDate();
    		this.endRegisterDate=entity.getEndRegisterDate();
    		this.startUnRegisterTime=entity.getStartUnRegisterTime();
    		this.endUnRegisterTime=entity.getEndUnRegisterTime();
    	
    	}
    }
	public RegisterPeriodTimeConfigViewMongoDto(ObjectId _id, Long classId, Long periodId, Boolean isGrant,
			Date startRegisterDate, Date endRegisterDate, Date startUnRegisterTime, Date endUnRegisterTime) {
		super();
		this.id = _id;
		this.classId = classId;
		this.periodId = periodId;
		this.isGrant = isGrant;
		this.startRegisterDate = startRegisterDate;
		this.endRegisterDate = endRegisterDate;
		this.startUnRegisterTime = startUnRegisterTime;
		this.endUnRegisterTime = endUnRegisterTime;
	}

	public String getId() {
		return id.toHexString();
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public Long getClassId() {
		return classId;
	}
	public void setClassId(Long classId) {
		this.classId = classId;
	}
	public Long getPeriodId() {
		return periodId;
	}
	public void setPeriodId(Long periodId) {
		this.periodId = periodId;
	}
	public Boolean getIsGrant() {
		return isGrant;
	}
	public void setIsGrant(Boolean isGrant) {
		this.isGrant = isGrant;
	}
	public Date getStartRegisterDate() {
		return startRegisterDate;
	}
	public void setStartRegisterDate(Date startRegisterDate) {
		this.startRegisterDate = startRegisterDate;
	}
	public Date getEndRegisterDate() {
		return endRegisterDate;
	}
	public void setEndRegisterDate(Date endRegisterDate) {
		this.endRegisterDate = endRegisterDate;
	}
	public Date getStartUnRegisterTime() {
		return startUnRegisterTime;
	}
	public void setStartUnRegisterTime(Date startUnRegisterTime) {
		this.startUnRegisterTime = startUnRegisterTime;
	}
	public Date getEndUnRegisterTime() {
		return endUnRegisterTime;
	}
	public void setEndUnRegisterTime(Date endUnRegisterTime) {
		this.endUnRegisterTime = endUnRegisterTime;
	}
	
    
}
