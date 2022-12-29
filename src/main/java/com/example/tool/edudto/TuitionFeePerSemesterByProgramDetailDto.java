package com.example.tool.edudto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.globits.education.dto.CourseSubjectDto;
import com.globits.education.dto.EnrollmentClassDto;
import com.globits.education.dto.StudentCourseSubjectDto;
import com.globits.education.dto.StudentDto;
import com.globits.education.dto.TuitionFeePerSemesterByProgramDetailDto;

public class TuitionFeePerSemesterByProgramDetailDto implements Serializable {
	
	private StudentDto student;
	
	private List<StudentCourseSubjectDto> studentCourseSubjectDtos;
	
	private Long semesterId;
	
	private Long registerPeriodId;
	
	private Double amount;//Số tiền	
	
	private double discountPercent;//Phần trăm miễn giảm
	
	//Số tiền miễn giảm
	private double discountAmount;

	//Số tiền thực thu sau khi trừ các khoản miễn giảm
	private double totalAmount;
	
	//Ghi chú
	private String note;
	
	//Đã chốt
	private Boolean isLock;	
	
	public StudentDto getStudent() {
		return student;
	}
	public void setStudent(StudentDto student) {
		this.student = student;
	}
	public List<StudentCourseSubjectDto> getStudentCourseSubjectDtos() {
		return studentCourseSubjectDtos;
	}
	public void setStudentCourseSubjectDtos(List<StudentCourseSubjectDto> studentCourseSubjectDtos) {
		this.studentCourseSubjectDtos = studentCourseSubjectDtos;
	}	
	public Long getSemesterId() {
		return semesterId;
	}
	public void setSemesterId(Long semesterId) {
		this.semesterId = semesterId;
	}
	public Long getRegisterPeriodId() {
		return registerPeriodId;
	}
	public void setRegisterPeriodId(Long registerPeriodId) {
		this.registerPeriodId = registerPeriodId;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Boolean getIsLock() {
		return isLock;
	}
	public void setIsLock(Boolean isLock) {
		this.isLock = isLock;
	}
	public double getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}
	public double getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public TuitionFeePerSemesterByProgramDetailDto() {
		
	}
	public TuitionFeePerSemesterByProgramDetailDto(TuitionFeePerSemesterByProgramDetailDto dto) {
		if(dto!=null) {
			if(dto.getStudent()!=null) {
				this.student = new StudentDto();
				this.student.setId(dto.getStudent().getId());
				this.student.setFirstName(dto.getStudent().getFirstName());
				this.student.setLastName(dto.getStudent().getLastName());
				this.student.setDisplayName(dto.getStudent().getDisplayName());
				this.student.setStudentCode(dto.getStudent().getStudentCode());
				if(dto.getStudent().getEnrollmentClass()!=null) {
					this.student.setEnrollmentClass(new EnrollmentClassDto());
					this.student.getEnrollmentClass().setId(dto.getStudent().getEnrollmentClass().getId());
					this.student.getEnrollmentClass().setClassCode(dto.getStudent().getEnrollmentClass().getClassCode());
					this.student.getEnrollmentClass().setClassName(dto.getStudent().getEnrollmentClass().getClassName());
				}
			}
			this.amount = dto.getAmount();
			this.discountAmount = dto.getDiscountAmount();
			this.discountPercent = dto.getDiscountAmount();
			this.note = dto.getNote();
			this.isLock = dto.getIsLock();
			this.totalAmount = dto.getTotalAmount();
			if(dto.getStudentCourseSubjectDtos()!=null && !dto.getStudentCourseSubjectDtos().isEmpty()) {
				this.studentCourseSubjectDtos = new ArrayList<StudentCourseSubjectDto>();
				for (StudentCourseSubjectDto studentCourseSubjectDto : dto.getStudentCourseSubjectDtos()) {
					StudentCourseSubjectDto scsDto = new StudentCourseSubjectDto();
					scsDto.setId(studentCourseSubjectDto.getId());
					
					scsDto.setIsMainSpec(studentCourseSubjectDto.getIsMainSpec());					
					scsDto.setTypeRegister(studentCourseSubjectDto.getTypeRegister());
					scsDto.setTuitionFee(studentCourseSubjectDto.getTuitionFee());
					scsDto.setTuitionFeePerCredit(studentCourseSubjectDto.getTuitionFeePerCredit());
					scsDto.setStudent(null);
					
					if(studentCourseSubjectDto.getCourseSubject()!=null ) {
						scsDto.setCourseSubject(new CourseSubjectDto());
						scsDto.getCourseSubject().setId(studentCourseSubjectDto.getCourseSubject().getId());
						if(studentCourseSubjectDto.getCourseSubject().getSemesterSubject()!=null
								&& studentCourseSubjectDto.getCourseSubject().getSemesterSubject().getSubject()!=null) {
							
							scsDto.setSubjectName(studentCourseSubjectDto.getCourseSubject().getSemesterSubject().getSubject().getSubjectName());
							
							
							scsDto.setTotalCredit(new Long (studentCourseSubjectDto.getCourseSubject().getSemesterSubject().getSubject().getNumberOfCredit()));
							scsDto.getCourseSubject().setSubjectId(studentCourseSubjectDto.getCourseSubject().getSemesterSubject().getSubject().getId());
							scsDto.setSubjectId(studentCourseSubjectDto.getCourseSubject().getSemesterSubject().getSubject().getId());
							scsDto.setSubjectCode(studentCourseSubjectDto.getCourseSubject().getSemesterSubject().getSubject().getSubjectCode());
						}
					}						
					this.studentCourseSubjectDtos.add(scsDto);
				}
			}
		}
	}
}
