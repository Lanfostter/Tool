package com.example.tool.edudto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.tool.edudto.TimeTableDto;
import com.globits.education.domain.CourseSubject;
import com.globits.education.domain.Student;
import com.globits.education.domain.StudentCallRoll;
import com.globits.education.domain.TimetableDetail;
import com.globits.education.dto.StudentDto;
import com.globits.education.dto.TimetableDetailDto;

public class StudentCallRollDto {
	
	private Long id;
	private TimetableDetailDto timeTableDetail;// Lịch giảng dạy chi tiết
	
	private StudentDto student;// Sinh viên
	private Integer numberHours;// Số tiết học
	private Integer numberAbsences;// Số tiết vắng
	private String note;// ghi chú
	private Integer status;// có phép hay không 
	
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public TimetableDetailDto getTimeTableDetail() {
		return timeTableDetail;
	}

	public void setTimeTableDetail(TimetableDetailDto timeTableDetail) {
		this.timeTableDetail = timeTableDetail;
	}

	public StudentDto getStudent() {
		return student;
	}

	public void setStudent(StudentDto student) {
		this.student = student;
	}

	public Integer getNumberHours() {
		return numberHours;
	}

	public void setNumberHours(Integer numberHours) {
		this.numberHours = numberHours;
	}

	public Integer getNumberAbsences() {
		return numberAbsences;
	}

	public void setNumberAbsences(Integer numberAbsences) {
		this.numberAbsences = numberAbsences;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public StudentCallRollDto() {
		
	}
	public StudentCallRollDto(StudentCallRoll scr) {
			this.id=scr.getId();
			this.note=scr.getNote();
			this.numberAbsences=scr.getNumberAbsences();
			this.numberHours=scr.getNumberHours();
			this.status=scr.getStatus();
			if(scr.getTimetableDetail()!=null)
			this.timeTableDetail=new TimetableDetailDto(scr.getTimetableDetail());
			
			if(scr.getStudent()!=null) {
				this.student=new StudentDto();
				this.student.setId(scr.getStudent().getId());
				this.student.setDisplayName(scr.getStudent().getDisplayName());
				this.student.setStudentCode(scr.getStudent().getStudentCode());
				if(scr.getStudent().getEnrollmentClass()!=null)
				this.student.setClassName(scr.getStudent().getEnrollmentClass().getClassName());
			}
			
			
		}
}
