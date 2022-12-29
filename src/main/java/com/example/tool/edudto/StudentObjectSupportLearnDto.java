package com.example.tool.edudto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.globits.education.domain.CourseYear;
import com.globits.education.domain.Semester;
import com.globits.education.domain.StudentObject;
import com.globits.education.domain.StudentObjectSupportLearn;
import com.globits.education.dto.CourseYearDto;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.StudentObjectDto;

public class StudentObjectSupportLearnDto {
    private Long id;
    private String name; // Tên hỗ trợ
    private float moneySupport; // Tiền hỗ trợ hàng tháng
    private Integer numberMonthSupport; // Số tháng hỗ trợ
    private CourseYearDto courseYear; //Khóa học
    private SemesterDto semester; // năm học
    private StudentObjectDto studentObject; // năm học
    private Integer academicClassification; //Xếp loại học tập
    private Integer behaviorClassification; //Xếp loại rèn luyện
    private Boolean isDisciplined;//Bị kỷ luật
    private Integer numberOfRetestAllowed;//Số lần thi lại cho phép
    private Integer numberOfCreditLearning;//Số tin chỉ yêu cầu
    private Integer status;
    
    public StudentObjectSupportLearnDto() {
      
    }
    
    public StudentObjectSupportLearnDto(StudentObjectSupportLearn entity) {
        if(entity == null)
            return;
        this.id = entity.getId();
        this.name = entity.getName();
        this.moneySupport = entity.getMoneySupport();
        this.numberMonthSupport = entity.getNumberMonthSupport();
        if(entity.getCourseYear() != null)
            this.courseYear = new CourseYearDto(entity.getCourseYear());
        if(entity.getSemester() != null)
            this.semester = new SemesterDto(entity.getSemester());
        if(entity.getStudentObject() != null)
            this.studentObject = new StudentObjectDto(entity.getStudentObject());
        this.academicClassification = entity.getAcademicClassification();
        this.behaviorClassification = entity.getBehaviorClassification();
        this.isDisciplined = entity.getIsDisciplined();
        this.numberOfRetestAllowed = entity.getNumberOfRetestAllowed();
        this.numberOfCreditLearning = entity.getNumberOfCreditLearning();
    }

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

    public float getMoneySupport() {
        return moneySupport;
    }

    public void setMoneySupport(float moneySupport) {
        this.moneySupport = moneySupport;
    }

    public Integer getNumberMonthSupport() {
        return numberMonthSupport;
    }

    public void setNumberMonthSupport(Integer numberMonthSupport) {
        this.numberMonthSupport = numberMonthSupport;
    }

    public CourseYearDto getCourseYear() {
        return courseYear;
    }

    public void setCourseYear(CourseYearDto courseYear) {
        this.courseYear = courseYear;
    }

    public SemesterDto getSemester() {
        return semester;
    }

    public void setSemester(SemesterDto semester) {
        this.semester = semester;
    }

    public StudentObjectDto getStudentObject() {
        return studentObject;
    }

    public void setStudentObject(StudentObjectDto studentObject) {
        this.studentObject = studentObject;
    }

    public Integer getAcademicClassification() {
        return academicClassification;
    }

    public void setAcademicClassification(Integer academicClassification) {
        this.academicClassification = academicClassification;
    }

    public Integer getBehaviorClassification() {
        return behaviorClassification;
    }

    public void setBehaviorClassification(Integer behaviorClassification) {
        this.behaviorClassification = behaviorClassification;
    }

    public Boolean getIsDisciplined() {
        return isDisciplined;
    }

    public void setIsDisciplined(Boolean isDisciplined) {
        this.isDisciplined = isDisciplined;
    }

    public Integer getNumberOfRetestAllowed() {
        return numberOfRetestAllowed;
    }

    public void setNumberOfRetestAllowed(Integer numberOfRetestAllowed) {
        this.numberOfRetestAllowed = numberOfRetestAllowed;
    }

    public Integer getNumberOfCreditLearning() {
        return numberOfCreditLearning;
    }

    public void setNumberOfCreditLearning(Integer numberOfCreditLearning) {
        this.numberOfCreditLearning = numberOfCreditLearning;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    
}
