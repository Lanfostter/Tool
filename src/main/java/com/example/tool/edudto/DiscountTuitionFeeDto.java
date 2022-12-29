package com.example.tool.edudto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.globits.core.domain.BaseObject;
import com.globits.education.domain.DiscountTuitionFee;
import com.globits.education.domain.DiscountTuitionFeeItem;
import com.globits.education.domain.FeeItem;
import com.globits.education.domain.Semester;
import com.globits.education.domain.StudentObject;
import com.globits.education.dto.CourseYearDto;
import com.globits.education.dto.DiscountTuitionFeeItemDto;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.StudentObjectDto;

public class DiscountTuitionFeeDto extends BaseObject {
	private static final long serialVersionUID = -2860077156878857922L;
	
	private Long id;

	private String name;
	
	private String code;
	
	private CourseYearDto courseYear; 
	
	private Float proportionDiscount;
	
	private StudentObjectDto studentObject;
	
	private SemesterDto semester;
	/*
	 * Miễn giảm mọi khoản (học phí, lệ phí,...)
	 */
	private Boolean isDiscountAll;
	/*
	 * Miễn giảm trong mọi trường hợp (học đi, học lại, nâng điểm)
	 */
	private boolean isDiscountAllCase;
	
	private Boolean isDiscountByTuitionFee;
	/*
	Mức miễn giảm được sử dụng, 
	sử dụng trong trường hợp miễn giảm theo loại khoản nhất định, 
	khi chỉ cần lấy mức miễn giảm của loại khoản đó
	Mặc định = proportionDiscount
	*/
	private float usedProportionDiscount;
	
	private List<DiscountTuitionFeeItemDto> discountTuitionFeeItems;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CourseYearDto getCourseYear() {
		return courseYear;
	}

	public void setCourseYear(CourseYearDto courseYear) {
		this.courseYear = courseYear;
	}

	public Float getProportionDiscount() {
		return proportionDiscount;
	}

	public void setProportionDiscount(Float proportionDiscount) {
		this.proportionDiscount = proportionDiscount;
	}

	public StudentObjectDto getStudentObject() {
		return studentObject;
	}

	public void setStudentObject(StudentObjectDto studentObject) {
		this.studentObject = studentObject;
	}

	public SemesterDto getSemester() {
		return semester;
	}

	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}

	public List<DiscountTuitionFeeItemDto> getDiscountTuitionFeeItems() {
		return discountTuitionFeeItems;
	}

	public void setDiscountTuitionFeeItems(List<DiscountTuitionFeeItemDto> discountTuitionFeeItems) {
		this.discountTuitionFeeItems = discountTuitionFeeItems;
	}

	public Boolean getIsDiscountAll() {
		return isDiscountAll;
	}

	public void setIsDiscountAll(Boolean isDiscountAll) {
		this.isDiscountAll = isDiscountAll;
	}

	public boolean getIsDiscountAllCase() {
		return isDiscountAllCase;
	}

	public void setDiscountAllCase(boolean isDiscountAllCase) {
		this.isDiscountAllCase = isDiscountAllCase;
	}

	public Boolean getIsDiscountByTuitionFee() {
		return isDiscountByTuitionFee;
	}

	public void setIsDiscountByTuitionFee(Boolean isDiscountByTuitionFee) {
		this.isDiscountByTuitionFee = isDiscountByTuitionFee;
	}

	public float getUsedProportionDiscount() {
		return usedProportionDiscount;
	}

	public void setUsedProportionDiscount(float usedProportionDiscount) {
		this.usedProportionDiscount = usedProportionDiscount;
	}

	public DiscountTuitionFeeDto() {
		
	}
	
	public DiscountTuitionFeeDto(DiscountTuitionFee discountTuitionFee) {
		if(discountTuitionFee != null) {
			this.id = discountTuitionFee.getId();
			this.name = discountTuitionFee.getName();
			this.code = discountTuitionFee.getCode();
			this.isDiscountAll = discountTuitionFee.getIsDiscountAll();			
			this.isDiscountAllCase = discountTuitionFee.getIsDiscountAllCase();
			this.usedProportionDiscount = discountTuitionFee.getUsedProportionDiscount();
			this.isDiscountByTuitionFee = discountTuitionFee.getIsDiscountByTuitionFee();
			if(discountTuitionFee.getSemester() != null) {
				SemesterDto semesterDto = new SemesterDto();
				semesterDto.setId(discountTuitionFee.getSemester().getId());
				semesterDto.setSemesterName(discountTuitionFee.getSemester().getSemesterName());
				semesterDto.setSemesterCode(discountTuitionFee.getSemester().getSemesterCode());
				this.semester = semesterDto;
			}
			if(discountTuitionFee.getCourseYear() != null) {
				CourseYearDto courseYearDto = new CourseYearDto();
				courseYearDto.setId(discountTuitionFee.getCourseYear().getId());
				courseYearDto.setName(discountTuitionFee.getCourseYear().getName());
				courseYearDto.setCode(discountTuitionFee.getCourseYear().getCode());
				this.courseYear = courseYearDto;
			}
			this.proportionDiscount = discountTuitionFee.getProportionDiscount();
			if(discountTuitionFee.getStudentObject() != null) {
				StudentObjectDto studentObjectDto = new StudentObjectDto();
				studentObjectDto.setId(discountTuitionFee.getStudentObject().getId());
				studentObjectDto.setName(discountTuitionFee.getStudentObject().getName());
				studentObjectDto.setCode(discountTuitionFee.getStudentObject().getCode());
				this.studentObject = studentObjectDto;
			}
			if(discountTuitionFee.getDiscountTuitionFeeItems() != null) {
				List<DiscountTuitionFeeItemDto> dtos = new ArrayList<DiscountTuitionFeeItemDto>();
				for (DiscountTuitionFeeItem discountTuitionFeeItem : discountTuitionFee.getDiscountTuitionFeeItems()) {
					DiscountTuitionFeeItemDto dto = new DiscountTuitionFeeItemDto(discountTuitionFeeItem);
					dtos.add(dto);
				}
				this.setDiscountTuitionFeeItems(dtos);
			}
		}
	}
}
