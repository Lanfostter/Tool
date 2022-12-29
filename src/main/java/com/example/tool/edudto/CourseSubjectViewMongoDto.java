package com.example.tool.edudto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import com.globits.education.domain.CourseSubjectViewMongo;
import com.globits.education.dto.TimeTableDto;

public class CourseSubjectViewMongoDto implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//	@Id
    private ObjectId id;

    private String displayName;
    private Long courseSubjectId;
    private Long subjectId;
    private Long semesterSubjectId;
    private Long periodId;
    private Long parentId;
    private Long trainingBaseId;
	private int numberOfStudent;
	private int maxStudent;
	
	
	/**
	 * Tình trạng lớp học
	 * normal(0),//Bình thường
	 * lock(1),//Chốt: nghĩa là đóng băng trạng thái lớp lại, sinh viên ko hủy đi, ko đăng ký mới được (quản trị vẫn được) nhưng vẫn nhìn thấy bình thường
	 * postpone(2),//Hoãn: là những lớp kiểu như đã có kế hoạch nhưng chưa thể triển khai được (kiểu như mấy lớp chưa giảng online ấy), để ở trạng thái chờ
	 * cancel(3);//Hủy: là những lớp ít sinh viên, nhưng vẫn giữ lại dữ liệu lớp và giảng viên để phục vụ tính khối lượng sau này, khi hủy lớp thì người dùng phải xác nhận số tiết đã giảng, số sv ban đầu để lưu lại, sau khi xác nhận hủy thì cũng đóng băng luôn		
	 * Const: EducationConstant.CourseSubjectStatus
	 */
	@Column(name = "status")
	private Integer status;
	
	private List<TimeTableDto> timetables;
	
	public CourseSubjectViewMongoDto() {
		
	}
	
	public CourseSubjectViewMongoDto(CourseSubjectViewMongo entity) {
		this.id = entity.getId();
		this.courseSubjectId = entity.getCourseSubjectId();
		this.subjectId = entity.getSubjectId();
		this.numberOfStudent = entity.getNumberOfStudent();
		this.maxStudent = entity.getMaxStudent();
		this.displayName = entity.getDisplayName();
		this.semesterSubjectId = entity.getSemesterSubjectId();
		this.periodId = entity.getPeriodId();
		this.trainingBaseId = entity.getTrainingBaseId();
		this.status = entity.getStatus();
		this.timetables = entity.getTimetables();
	}
	
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Long getCourseSubjectId() {
		return courseSubjectId;
	}

	public void setCourseSubjectId(Long courseSubjectId) {
		this.courseSubjectId = courseSubjectId;
	}

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public Long getSemesterSubjectId() {
		return semesterSubjectId;
	}

	public void setSemesterSubjectId(Long semesterSubjectId) {
		this.semesterSubjectId = semesterSubjectId;
	}

	public Long getPeriodId() {
		return periodId;
	}

	public void setPeriodId(Long periodId) {
		this.periodId = periodId;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Long getTrainingBaseId() {
		return trainingBaseId;
	}

	public void setTrainingBaseId(Long trainingBaseId) {
		this.trainingBaseId = trainingBaseId;
	}

	public int getNumberOfStudent() {
		return numberOfStudent;
	}

	public void setNumberOfStudent(int numberOfStudent) {
		this.numberOfStudent = numberOfStudent;
	}

	public int getMaxStudent() {
		return maxStudent;
	}

	public void setMaxStudent(int maxStudent) {
		this.maxStudent = maxStudent;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<TimeTableDto> getTimetables() {
		return timetables;
	}

	public void setTimetables(List<TimeTableDto> timetables) {
		this.timetables = timetables;
	}
}
