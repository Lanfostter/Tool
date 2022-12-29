package com.example.tool.edudto;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.globits.core.domain.TrainingBase;
import com.globits.core.dto.DepartmentDto;
import com.globits.core.dto.RoomDto;
import com.globits.core.dto.TrainingBaseDto;
import com.globits.education.domain.CourseSubjectTimetable;
import com.globits.education.domain.CourseYear;
import com.globits.education.domain.FeeConfigItem;
import com.globits.education.domain.SchoolFeeConfig;
import com.globits.education.domain.Speciality;
import com.globits.education.domain.StudentObject;
import com.globits.education.dto.CourseYearDto;
import com.globits.education.dto.DiscountTuitionFeeDto;
import com.globits.education.dto.FeeConfigItemDto;
import com.globits.education.dto.FeeItemDto;
import com.globits.education.dto.SchoolFeeConfigDto;
import com.globits.education.dto.SpecialityDto;
import com.globits.education.dto.StudentObjectDto;
import com.globits.hr.dto.StaffDto;
public class SchoolFeeConfigDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String code;
	private Boolean isCurrent;
	private Date fromDate;
	private Date toDate;//Nếu đang còn hiều lực thì toDate=null
	private Set<FeeConfigItemDto> feeConfigItems;
	private CourseYearDto courseYear;
	private SpecialityDto speciality;
	private TrainingBaseDto trainingBase;
	private StudentObjectDto studentObject;
	private Double totalAmount;
	private int totalNumberOfItem;
	private DepartmentDto department;
	private DiscountTuitionFeeDto discountTuitionFee;
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	

	public Boolean getIsCurrent() {
		return isCurrent;
	}

	public void setIsCurrent(Boolean isCurrent) {
		this.isCurrent = isCurrent;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	

	public CourseYearDto getCourseYear() {
		return courseYear;
	}

	public void setCourseYear(CourseYearDto courseYear) {
		this.courseYear = courseYear;
	}

	public SpecialityDto getSpeciality() {
		return speciality;
	}

	public void setSpeciality(SpecialityDto speciality) {
		this.speciality = speciality;
	}

	public TrainingBaseDto getTrainingBase() {
		return trainingBase;
	}

	public void setTrainingBase(TrainingBaseDto trainingBase) {
		this.trainingBase = trainingBase;
	}

	public StudentObjectDto getStudentObject() {
		return studentObject;
	}

	public void setStudentObject(StudentObjectDto studentObject) {
		this.studentObject = studentObject;
	}
	

	public Set<FeeConfigItemDto> getFeeConfigItems() {
		return feeConfigItems;
	}

	public void setFeeConfigItems(Set<FeeConfigItemDto> feeConfigItems) {
		this.feeConfigItems = feeConfigItems;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getTotalNumberOfItem() {
		return totalNumberOfItem;
	}

	public void setTotalNumberOfItem(int totalNumberOfItem) {
		this.totalNumberOfItem = totalNumberOfItem;
	}

	public DepartmentDto getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentDto department) {
		this.department = department;
	}

	public DiscountTuitionFeeDto getDiscountTuitionFee() {
		return discountTuitionFee;
	}

	public void setDiscountTuitionFee(DiscountTuitionFeeDto discountTuitionFee) {
		this.discountTuitionFee = discountTuitionFee;
	}

	public SchoolFeeConfigDto() {

	}

	public SchoolFeeConfigDto(SchoolFeeConfig cy) {
		if(cy !=null) {
			this.id = cy.getId();
			this.code = cy.getCode();
			this.name = cy.getName();
			this.isCurrent=cy.getIsCurrent();
			this.fromDate=cy.getFromDate();
			this.toDate=cy.getToDate();
			
			if (cy.getCourseYear() != null) {
				this.courseYear = new CourseYearDto();
				this.courseYear.setId(cy.getCourseYear().getId());
				this.courseYear.setCode(cy.getCourseYear().getCode());
				this.courseYear.setName(cy.getCourseYear().getName());
				this.courseYear.setYear(cy.getCourseYear().getYear());
			}
			if (cy.getSpeciality() != null) {
				this.speciality = new SpecialityDto();
				this.speciality.setId(cy.getSpeciality().getId());
				this.speciality.setCode(cy.getSpeciality().getCode());
				this.speciality.setName(cy.getSpeciality().getName());
			}
			if(cy.getTrainingBase()!=null) {
				this.trainingBase=new TrainingBaseDto();
				this.trainingBase.setId(cy.getTrainingBase().getId());
				this.trainingBase.setCode(cy.getTrainingBase().getCode());
				this.trainingBase.setName(cy.getTrainingBase().getName());
			}
			if(cy.getStudentObject()!=null) {
				this.studentObject=new StudentObjectDto();
				this.studentObject.setId(cy.getStudentObject().getId());
				this.studentObject.setCode(cy.getStudentObject().getCode());
				this.studentObject.setName(cy.getStudentObject().getName());
			}
			if(cy.getDepartment()!= null) {
				this.department = new DepartmentDto();
				this.department.setId(cy.getDepartment().getId());
				this.department.setCode(cy.getDepartment().getCode());
				this.department.setName(cy.getDepartment().getName());
			}
			if (cy.getFeeConfigItems() != null && cy.getFeeConfigItems().size() > 0) {
				Set<FeeConfigItemDto> feeConfigItems = new HashSet<FeeConfigItemDto>();
				for (FeeConfigItem tt : cy.getFeeConfigItems()) {
					FeeConfigItemDto ttDto = new FeeConfigItemDto();
					ttDto.setId(tt.getId());
					ttDto.setAmount(tt.getAmount());;
					
					if (tt.getFeeItem() != null) {
						FeeItemDto r = new FeeItemDto();
						r.setId(tt.getFeeItem().getId());
						r.setCode(tt.getFeeItem().getCode());
						r.setName(tt.getFeeItem().getName());
						r.setType(tt.getFeeItem().getType());
						ttDto.setFeeItem(r);
						
					}
					if (tt.getSchoolFeeConfig() != null) {
						SchoolFeeConfigDto schoolFeeConfig = new SchoolFeeConfigDto();
						schoolFeeConfig.setId(tt.getSchoolFeeConfig().getId());
						schoolFeeConfig.setCode(tt.getSchoolFeeConfig().getCode());
						schoolFeeConfig.setName(tt.getSchoolFeeConfig().getName());
						ttDto.setSchoolFeeConfig(schoolFeeConfig);
					}
					feeConfigItems.add(ttDto);
				}
				this.setFeeConfigItems(feeConfigItems);
			}
			if(this.feeConfigItems!=null && !this.feeConfigItems.isEmpty()) {
				this.totalAmount = 0D;
				this.totalNumberOfItem = this.feeConfigItems.size();
				for (FeeConfigItemDto feeConfigItemDto : feeConfigItems) {
					if(feeConfigItemDto.getAmount()!=null) {
						this.totalAmount+=feeConfigItemDto.getAmount();
					}
				}
			}
		}
	}
}
