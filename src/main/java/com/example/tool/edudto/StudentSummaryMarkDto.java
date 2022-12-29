package com.example.tool.edudto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.persistence.Column;

import com.globits.core.domain.BaseObject;
import com.globits.core.dto.BaseObjectDto;
import com.globits.core.utils.NumberUtils;
import com.globits.education.domain.Semester;
import com.globits.education.domain.StudentSchoolYearSummaryMark;
import com.globits.education.domain.StudentSemesterSummaryMark;
import com.globits.education.domain.StudentSummaryMark;
import com.globits.education.dto.SchoolYearDto;
import com.globits.education.dto.SemesterDto;
import com.globits.education.dto.SortStudentSchoolYearSummaryMarkDto;
import com.globits.education.dto.StudentDto;
import com.globits.education.dto.StudentSchoolYearSummaryMarkDto;
import com.globits.education.dto.StudentSemesterSummaryMarkDto;

class SortStudentSchoolYearSummaryMarkDto implements Comparator<StudentSchoolYearSummaryMarkDto> 
{ 
    // Used for sorting in ascending order of 
    // roll number 
    public int compare(StudentSchoolYearSummaryMarkDto a, StudentSchoolYearSummaryMarkDto b) 
    { 
        return a.getSchoolYear().getYear() - b.getSchoolYear().getYear(); 
    } 
} 
public class StudentSummaryMarkDto extends BaseObjectDto {

	private static final long serialVersionUID = 1L;

	private StudentSummaryMark summaryMark;
	
	private StudentDto student;
	private Double mark;//Điểm thang 10 
	
	private Double mark4;//Điểm thang 4
	
	private String charMark;//điểm chữ 
	
	private Double markN2;//Điểm thang 10 lần 2 
	
	private Double mark4N2;//Điểm thang 4 lần 2
	
	private String charMarkN2;//điểm chữ lần 2
	
	private int totalCredit;// Số lượng tín chỉ tích lũy 
	
	private int totalCreditN2;// Số lượng tín chỉ tích lũy lần 2
	
	private Double learningMark;//Điểm chung bình chung hệ 10 ngành 1 

	private Double learningMarkN2;//Điểm chung bình chung hệ 10 ngành 2 

	private Double learningMark4;//Điểm chung bình chung hệ 4 ngành 1 

	private Double learningMark4N2;//Điểm chung bình chung hệ 4 ngành 2 
	
	private Integer learningTotalCredit;// Tổng số lượng tín chỉ học ngành 1
	
	private Integer learningTotalCreditN2;// Tổng số lượng tín chỉ học ngành 2
	
	
	private int semesterIndex;//học kỳ thứ bao nhiêu trong quá trình học
	
	private Double firstMark;//Điểm thang 10 lần 1 
	
	private Double firstMark4;//Điểm thang 4 lần 1 

	private Double firstMarkN2;//Điểm thang 10 ngành 2 lần 1 - có thể chưa cần dùng 

	private Double firstLearningMark;//Điểm chung bình chung hệ 10 ngành 1 lần 1 
	
	private Double firstLearningMark4;//Điểm chung bình chung hệ 4 ngành 1 lần 1 

	private Double firstLearningMarkN2;//Điểm chung bình chung hệ 10 ngành 2 lần 1
	
	private Integer firstTotalCredit;// Số lượng tín chỉ tích lũy lần 1 (số lượng tín chỉ học lần 1 và đạt)
	private Integer firstTotalLearningCredit;// Số lượng tín chỉ học lần 1 (cả thi đạt và không đạt)
	private Integer status;// Trạng thái =0 chưa rà soát, =1 đã rà soát	
	private Boolean isLock;//Đã chốt điểm
	private Boolean isTrue;//Đã đúng chưa?
	
	private List<StudentSchoolYearSummaryMarkDto>  schoolYearSummaryMarks = new ArrayList<StudentSchoolYearSummaryMarkDto>();

	public StudentSummaryMark getSummaryMark() {
		return summaryMark;
	}

	public void setSummaryMark(StudentSummaryMark summaryMark) {
		this.summaryMark = summaryMark;
	}

	public StudentDto getStudent() {
		return student;
	}

	public void setStudent(StudentDto student) {
		this.student = student;
	}

	public Double getMark() {
		return NumberUtils.round(mark,2);
	}

	public void setMark(Double mark) {
		this.mark = mark;
	}

	public Double getMark4() {
		//return mark4;
		return NumberUtils.round(mark4,2);
	}

	public void setMark4(Double mark4) {
		this.mark4 = mark4;
	}

	public String getCharMark() {
		return charMark;
	}

	public void setCharMark(String charMark) {
		this.charMark = charMark;
	}

	public Double getMarkN2() {
//		return markN2;
		return NumberUtils.round(markN2,2);
	}

	public void setMarkN2(Double markN2) {
		this.markN2 = markN2;
	}

	public Double getMark4N2() {
//		return mark4N2;
		return NumberUtils.round(mark4N2,2);
	}

	public void setMark4N2(Double mark4n2) {
		mark4N2 = mark4n2;
	}

	public String getCharMarkN2() {
		return charMarkN2;
	}

	public void setCharMarkN2(String charMarkN2) {
		this.charMarkN2 = charMarkN2;
	}

	public int getTotalCredit() {
		return totalCredit;
	}

	public void setTotalCredit(int totalCredit) {
		this.totalCredit = totalCredit;
	}

	public int getTotalCreditN2() {
		return totalCreditN2;
	}

	public void setTotalCreditN2(int totalCreditN2) {
		this.totalCreditN2 = totalCreditN2;
	}

	public int getSemesterIndex() {
		return semesterIndex;
	}

	public void setSemesterIndex(int semesterIndex) {
		this.semesterIndex = semesterIndex;
	}

	public List<StudentSchoolYearSummaryMarkDto> getSchoolYearSummaryMarks() {
		return schoolYearSummaryMarks;
	}

	public void setSchoolYearSummaryMarks(List<StudentSchoolYearSummaryMarkDto> schoolYearSummaryMarks) {
		this.schoolYearSummaryMarks = schoolYearSummaryMarks;
	}

	public Double getLearningMark() {
//		return learningMark;
		return NumberUtils.round(learningMark,2);
	}

	public void setLearningMark(Double learningMark) {
		this.learningMark = learningMark;
	}

	public Double getLearningMarkN2() {
//		return learningMarkN2;
		return NumberUtils.round(learningMarkN2,2);
	}

	public void setLearningMarkN2(Double learningMarkN2) {
		this.learningMarkN2 = learningMarkN2;
	}

	public Double getLearningMark4() {
//		return learningMark4;
		return NumberUtils.round(learningMark4,2);
	}

	public void setLearningMark4(Double learningMark4) {
		this.learningMark4 = learningMark4;
	}

	public Double getLearningMark4N2() {
//		return learningMark4N2;
		return NumberUtils.round(learningMark4N2,2);
	}

	public void setLearningMark4N2(Double learningMark4N2) {
		this.learningMark4N2 = learningMark4N2;
	}

	public Integer getLearningTotalCredit() {
		return learningTotalCredit;
	}

	public void setLearningTotalCredit(Integer learningTotalCredit) {
		this.learningTotalCredit = learningTotalCredit;
	}

	public Integer getLearningTotalCreditN2() {
		return learningTotalCreditN2;
	}

	public void setLearningTotalCreditN2(Integer learningTotalCreditN2) {
		this.learningTotalCreditN2 = learningTotalCreditN2;
	}

	public Double getFirstMark() {
		//return firstMark;
		return NumberUtils.round(firstMark,2);
	}

	public void setFirstMark(Double firstMark) {
		this.firstMark = firstMark;
	}

	public Double getFirstMarkN2() {
		return firstMarkN2;
	}

	public void setFirstMarkN2(Double firstMarkN2) {
		this.firstMarkN2 = firstMarkN2;
	}

	public Double getFirstLearningMark() {
		//return firstLearningMark;
		return NumberUtils.round(firstLearningMark,2);
	}

	public void setFirstLearningMark(Double firstLearningMark) {
		this.firstLearningMark = firstLearningMark;
	}

	public Double getFirstLearningMarkN2() {
//		return firstLearningMarkN2;
		return NumberUtils.round(firstLearningMarkN2,2);
	}

	public void setFirstLearningMarkN2(Double firstLearningMarkN2) {
		this.firstLearningMarkN2 = firstLearningMarkN2;
	}

	public Integer getFirstTotalCredit() {
		return firstTotalCredit;
	}

	public void setFirstTotalCredit(Integer firstTotalCredit) {
		this.firstTotalCredit = firstTotalCredit;
	}

	public Integer getFirstTotalLearningCredit() {
		return firstTotalLearningCredit;
	}

	public void setFirstTotalLearningCredit(Integer firstTotalLearningCredit) {
		this.firstTotalLearningCredit = firstTotalLearningCredit;
	}

	public Double getFirstMark4() {
//		return firstMark4;
		return NumberUtils.round(firstMark4,2);
	}

	public void setFirstMark4(Double firstMark4) {
		this.firstMark4 = firstMark4;
	}

	public Double getFirstLearningMark4() {
//		return firstLearningMark4;
		return NumberUtils.round(firstLearningMark4,2);
	}

	public void setFirstLearningMark4(Double firstLearningMark4) {
		this.firstLearningMark4 = firstLearningMark4;
	}	

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Boolean getIsLock() {
		return isLock;
	}

	public void setIsLock(Boolean isLock) {
		this.isLock = isLock;
	}

	public Boolean getIsTrue() {
		return isTrue;
	}

	public void setIsTrue(Boolean isTrue) {
		this.isTrue = isTrue;
	}

	public StudentSummaryMarkDto() {
		
	}
	
	public StudentSummaryMarkDto(StudentSummaryMark entity) {
		if(entity!=null) {
			this.charMark = entity.getCharMark();
			this.mark = entity.getMark();
			this.mark4 = entity.getMark4();
			this.totalCredit = entity.getTotalCredit();
			this.totalCreditN2=entity.getTotalCreditN2();
			this.markN2 = entity.getMarkN2();
			this.mark4N2 = entity.getMark4N2();
			
			this.learningMark = entity.getLearningMark();
			this.learningMark4 = entity.getLearningMark4();
			this.learningMark4N2 = entity.getLearningMark4N2();
			this.learningMarkN2 = entity.getLearningMark4N2();
			this.learningTotalCredit = entity.getLearningTotalCredit();
			this.learningTotalCreditN2 = entity.getLearningTotalCreditN2();
			
			this.firstLearningMark = entity.getFirstLearningMark();
			this.firstLearningMark4=entity.getFirstLearningMark4();
			this.firstLearningMarkN2 = entity.getFirstLearningMarkN2();
			this.firstMark = entity.getFirstMark();
			this.firstMark4=entity.getFirstMark4();
			this.firstMarkN2 = entity.getFirstMarkN2();
			
			this.firstTotalCredit = entity.getFirstTotalCredit();
			this.firstTotalLearningCredit = entity.getFirstTotalLearningCredit();
			this.status=entity.getStatus();
			this.isTrue=entity.getIsTrue();
			this.isLock=entity.getIsLock();
			this.setId(entity.getId());
			if(entity.getStudent()!=null) {
				this.student = new StudentDto(entity.getStudent());
			}
			if(entity.getSchoolYearSummaryMarks()!=null) {
				
				for(StudentSchoolYearSummaryMark ssym : entity.getSchoolYearSummaryMarks()) {
					StudentSchoolYearSummaryMarkDto ssymDto = new StudentSchoolYearSummaryMarkDto();
					ssymDto.setCharMark(ssym.getCharMark());
					ssymDto.setCharMarkN2(ssym.getCharMarkN2());
					ssymDto.setMark(ssym.getMark());
					ssymDto.setMark4(ssym.getMark4());
					ssymDto.setMarkN2(ssym.getMark4N2());
					ssymDto.setMark4N2(ssym.getMark4N2());
					ssymDto.setTotalCredit(ssym.getTotalCredit());
					ssymDto.setTotalCreditN2(ssym.getTotalCreditN2());
					ssymDto.setSchoolYear(new SchoolYearDto(ssym.getSchoolYear()));
					ssymDto.setLearningMark(ssym.getLearningMark());
					ssymDto.setLearningMarkN2(ssym.getLearningMarkN2());
					ssymDto.setLearningMark4(ssym.getLearningMark4());
					ssymDto.setLearningMark4N2(ssym.getLearningMark4N2());
					ssymDto.setLearningTotalCredit(ssym.getLearningTotalCredit());
					ssymDto.setLearningTotalCreditN2(ssym.getLearningTotalCreditN2());
					ssymDto.setFirstLearningMark(ssym.getFirstLearningMark());
					ssymDto.setFirstLearningMark4(ssym.getFirstLearningMark4());
					ssymDto.setFirstLearningMarkN2(ssym.getFirstLearningMarkN2());
					ssymDto.setFirstMark(ssym.getFirstMark());
					ssymDto.setFirstMark4(ssym.getFirstMark4());
					ssymDto.setFirstMarkN2(ssym.getFirstMarkN2());
					ssymDto.setFirstTotalCredit(ssym.getFirstTotalCredit());
					ssymDto.setFirstTotalLearningCredit(ssym.getFirstTotalLearningCredit());
					ssymDto.setIsLock(ssym.getIsLock());
					for(StudentSemesterSummaryMark sssm: ssym.getSemesterMarks()) {
						StudentSemesterSummaryMarkDto sssmDto = new StudentSemesterSummaryMarkDto(); 
						sssmDto.setCharMark(sssm.getCharMark());
						sssmDto.setCharMarkN2(sssm.getCharMarkN2());
						sssmDto.setMark(sssm.getMark());
						sssmDto.setMark4(sssm.getMark4());
						sssmDto.setMarkN2(sssm.getMark4N2());
						sssmDto.setMark4N2(sssm.getMark4N2());
						sssmDto.setTotalCredit(sssm.getTotalCredit());
						sssmDto.setTotalCreditN2(sssm.getTotalCreditN2());
						sssmDto.setSemester(new SemesterDto(sssm.getSemester()));
						sssmDto.setLearningMark(sssm.getLearningMark());
						sssmDto.setLearningMarkN2(sssm.getLearningMarkN2());
						sssmDto.setLearningMark4(sssm.getLearningMark4());
						sssmDto.setLearningMark4N2(sssm.getLearningMark4N2());
						sssmDto.setLearningTotalCredit(sssm.getLearningTotalCredit());
						sssmDto.setLearningTotalCreditN2(sssm.getLearningTotalCreditN2());
						sssmDto.setFirstLearningMark(sssm.getFirstLearningMark());
						sssmDto.setFirstLearningMark4(sssm.getFirstLearningMark4());
						sssmDto.setFirstLearningMarkN2(sssm.getFirstLearningMarkN2());
						sssmDto.setFirstMark(sssm.getFirstMark());
						sssmDto.setFirstMark4(sssm.getFirstMark4());
						sssmDto.setFirstMarkN2(sssm.getFirstMarkN2());
						sssmDto.setFirstTotalCredit(sssm.getFirstTotalCredit());
						sssmDto.setFirstTotalLearningCredit(sssm.getFirstTotalLearningCredit());
						sssmDto.setIsLock(sssm.getIsLock());
						ssymDto.getSemesterMarks().add(sssmDto);
					}
					
					this.schoolYearSummaryMarks.add(ssymDto);
				}
			}
			Collections.sort(this.schoolYearSummaryMarks, new SortStudentSchoolYearSummaryMarkDto()); 
		}
	}
	public StudentSummaryMarkDto(StudentSummaryMark entity,boolean simple) {
		if(entity!=null) {
			this.charMark = entity.getCharMark();
			this.mark = entity.getMark();
			this.mark4 = entity.getMark4();
			this.totalCredit = entity.getTotalCredit();
			this.totalCreditN2=entity.getTotalCreditN2();
			this.markN2 = entity.getMarkN2();
			this.mark4N2 = entity.getMark4N2();
			
			this.learningMark = entity.getLearningMark();
			this.learningMark4 = entity.getLearningMark4();
			this.learningMark4N2 = entity.getLearningMark4N2();
			this.learningMarkN2 = entity.getLearningMark4N2();
			this.learningTotalCredit = entity.getLearningTotalCredit();
			this.learningTotalCreditN2 = entity.getLearningTotalCreditN2();
			
			this.firstLearningMark = entity.getFirstLearningMark();
			this.firstLearningMark4=entity.getFirstLearningMark4();
			this.firstLearningMarkN2 = entity.getFirstLearningMarkN2();
			this.firstMark = entity.getFirstMark();
			this.firstMark4=entity.getFirstMark4();
			this.firstMarkN2 = entity.getFirstMarkN2();
			
			this.firstTotalCredit = entity.getFirstTotalCredit();
			this.firstTotalLearningCredit = entity.getFirstTotalLearningCredit();
			this.status=entity.getStatus();
			this.isTrue=entity.getIsTrue();
			this.isLock=entity.getIsLock();
			this.setId(entity.getId());
			if(entity.getStudent()!=null) {
				this.student = new StudentDto(entity.getStudent(),true);
			}
			
		}
	}
}
