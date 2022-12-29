package com.example.tool.edudto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.jdo.annotations.Column;

import com.globits.core.dto.DepartmentDto;
import com.globits.education.dto.CourseYearDto;
import com.globits.education.dto.EnrollmentClassDto;
import com.globits.education.dto.SchoolYearDto;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.SpecialityDto;
import com.globits.education.dto.StudentTuitionFeeDto;
import com.globits.education.dto.TuitionFeePerSemesterByProgramDetailDto;

public class StudentTuitionFeeDto  implements Serializable {
	//Để lọc môn học đã đăng ký
	private SemesterDto semester;
	
	//4 Object dưới đây để lọc sinh viên
	private CourseYearDto courseYearDto;
	private DepartmentDto departmentDto;
	private SpecialityDto specialityDto;
	private EnrollmentClassDto enrollmentClassDto;
	
	//Danh sách học phí chi tiết
	private List<TuitionFeePerSemesterByProgramDetailDto> tuitionFeePerSemesterByProgramDetailDtos;
	
	public SemesterDto getSemester() {
		return semester;
	}
	
	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}

	public CourseYearDto getCourseYearDto() {
		return courseYearDto;
	}

	public void setCourseYearDto(CourseYearDto courseYearDto) {
		this.courseYearDto = courseYearDto;
	}

	public DepartmentDto getDepartmentDto() {
		return departmentDto;
	}

	public void setDepartmentDto(DepartmentDto departmentDto) {
		this.departmentDto = departmentDto;
	}

	public SpecialityDto getSpecialityDto() {
		return specialityDto;
	}

	public void setSpecialityDto(SpecialityDto specialityDto) {
		this.specialityDto = specialityDto;
	}

	public EnrollmentClassDto getEnrollmentClassDto() {
		return enrollmentClassDto;
	}

	public void setEnrollmentClassDto(EnrollmentClassDto enrollmentClassDto) {
		this.enrollmentClassDto = enrollmentClassDto;
	}

	public List<TuitionFeePerSemesterByProgramDetailDto> getTuitionFeePerSemesterByProgramDetailDtos() {
		return tuitionFeePerSemesterByProgramDetailDtos;
	}

	public void setTuitionFeePerSemesterByProgramDetailDtos(
			List<TuitionFeePerSemesterByProgramDetailDto> tuitionFeePerSemesterByProgramDetailDtos) {
		this.tuitionFeePerSemesterByProgramDetailDtos = tuitionFeePerSemesterByProgramDetailDtos;
	}
	public StudentTuitionFeeDto() {
		
	}
	public StudentTuitionFeeDto(StudentTuitionFeeDto dto) {
		if(dto!=null) {
			if(dto.getSemester()!=null) {
				this.semester = new SemesterDto();
				this.semester.setId(dto.getSemester().getId()); 
				this.semester.setSemesterName(dto.getSemester().getSemesterName());
				this.semester.setSemesterCode(dto.getSemester().getSemesterCode());
				this.semester.setIsCurrent(dto.getSemester().getIsCurrent());
				if(dto.getSemester().getSchoolYear()!=null) {
					this.semester.setSchoolYear(new SchoolYearDto());
					this.semester.getSchoolYear().setId(dto.getSemester().getSchoolYear().getId());
				}
				this.semester.setTuitionFeePerCredit(dto.getSemester().getTuitionFeePerCredit());
				this.semester.setYear(dto.getSemester().getYear());
			}
			if(dto.getCourseYearDto()!=null) {
				this.courseYearDto = new CourseYearDto();
				this.courseYearDto.setId(dto.getCourseYearDto().getId());
				this.courseYearDto.setCode(dto.getCourseYearDto().getCode());
				this.courseYearDto.setName(dto.getCourseYearDto().getName()); 
			}
			if(dto.getDepartmentDto()!=null) {
				this.departmentDto = new DepartmentDto();
				this.departmentDto.setId(dto.getDepartmentDto().getId());
				this.departmentDto.setCode(dto.getDepartmentDto().getCode());
				this.departmentDto.setName(dto.getDepartmentDto().getName());
			}
			if(dto.getSpecialityDto()!=null) {
				this.specialityDto = new SpecialityDto();
				this.specialityDto.setId(dto.getSpecialityDto().getId());
				this.specialityDto.setCode(dto.getDepartmentDto().getCode());
				this.specialityDto.setName(dto.getDepartmentDto().getName());
			}
			if(dto.getEnrollmentClassDto()!=null) {
				this.enrollmentClassDto = new EnrollmentClassDto();
				this.enrollmentClassDto.setId(dto.getEnrollmentClassDto().getId());
				this.enrollmentClassDto.setClassName(dto.getEnrollmentClassDto().getClassName());
				this.enrollmentClassDto.setClassCode(dto.getEnrollmentClassDto().getClassCode());
			}
			if(dto.getTuitionFeePerSemesterByProgramDetailDtos()!=null && !dto.getTuitionFeePerSemesterByProgramDetailDtos().isEmpty()) {
				this.tuitionFeePerSemesterByProgramDetailDtos = new ArrayList<TuitionFeePerSemesterByProgramDetailDto>();
				for (TuitionFeePerSemesterByProgramDetailDto tuitionFeePerSemesterByProgramDetailDto : dto.getTuitionFeePerSemesterByProgramDetailDtos()) {
					TuitionFeePerSemesterByProgramDetailDto tf = new TuitionFeePerSemesterByProgramDetailDto(tuitionFeePerSemesterByProgramDetailDto);
					if(this.semester!=null) {
						tf.setSemesterId(this.semester.getId());
					}					
					this.tuitionFeePerSemesterByProgramDetailDtos.add(tf);
				}				
			}
		}		
	}
}
