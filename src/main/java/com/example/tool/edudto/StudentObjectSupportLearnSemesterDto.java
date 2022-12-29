package com.example.tool.edudto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.globits.education.domain.RewardDecree;
import com.globits.education.domain.Student;
import com.globits.education.domain.StudentObjectSupportLearn;
import com.globits.education.domain.StudentObjectSupportLearnSemester;
import com.globits.education.dto.CourseYearDto;
import com.globits.education.dto.RewardDecreeDto;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.StudentDto;
import com.globits.education.dto.StudentObjectDto;
import com.globits.education.dto.StudentObjectSupportLearnDto;

public class StudentObjectSupportLearnSemesterDto {
    private Long id;
    private StudentObjectSupportLearnDto studentObjectSupportLearn; 
    private Integer status;
    private StudentDto student; 
    private RewardDecreeDto rewardDecree;
    private CourseYearDto courseYear;
    private SemesterDto semester;
    private StudentObjectDto studentObject;
    private Float amount;
    
    public StudentObjectSupportLearnSemesterDto() {
        
    }
    
    public StudentObjectSupportLearnSemesterDto(StudentObjectSupportLearnSemester entity) {
        this.id = entity.getId();
        if(entity.getStudentObjectSupportLearn() != null) {
            this.studentObjectSupportLearn = new StudentObjectSupportLearnDto(entity.getStudentObjectSupportLearn());
            if(entity.getStudentObjectSupportLearn().getCourseYear() != null)
                this.courseYear = new CourseYearDto(entity.getStudentObjectSupportLearn().getCourseYear());
            if(entity.getStudentObjectSupportLearn().getSemester() != null)
                this.semester = new SemesterDto(entity.getStudentObjectSupportLearn().getSemester());
            if(entity.getStudentObjectSupportLearn().getStudentObject() != null)
                this.studentObject = new StudentObjectDto(entity.getStudentObjectSupportLearn().getStudentObject());
            this.amount=(this.studentObjectSupportLearn.getMoneySupport()*this.studentObjectSupportLearn.getNumberMonthSupport());
        }
        this.status = entity.getStatus();
        if(entity.getStudent() != null)
            this.student = new StudentDto(entity.getStudent());
        if(entity.getRewardDecree() != null)
            this.rewardDecree = new RewardDecreeDto(entity.getRewardDecree());
    }
    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StudentObjectSupportLearnDto getStudentObjectSupportLearn() {
        return studentObjectSupportLearn;
    }
    public void setStudentObjectSupportLearn(StudentObjectSupportLearnDto studentObjectSupportLearn) {
        this.studentObjectSupportLearn = studentObjectSupportLearn;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public StudentDto getStudent() {
        return student;
    }
    public void setStudent(StudentDto student) {
        this.student = student;
    }
    public RewardDecreeDto getRewardDecree() {
        return rewardDecree;
    }
    public void setRewardDecree(RewardDecreeDto rewardDecree) {
        this.rewardDecree = rewardDecree;
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
    
    
    
}
