package com.example.tool.edudto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.globits.core.domain.Department;
import com.globits.core.dto.DepartmentDto;
import com.globits.education.domain.EnrollmentClass;
import com.globits.education.domain.Speciality;
import com.globits.education.dto.TreeItemDto;
import com.globits.education.utils.EducationConstant.TreeItemType;

public class TreeItemDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9221702458846407907L;
	
	private String id;
	private String name;
	private String code;
	private int nodeType;
	private List<TreeItemDto> children = new ArrayList<TreeItemDto>();
	
	public TreeItemDto(DepartmentDto department, List<Speciality> speciality, List<EnrollmentClass> enrollClasses) {
		if(department == null)
			return;
		this.id = department.getId().toString();
		this.name = department.getName();
		this.code = department.getCode();
		this.nodeType = TreeItemType.Department.getValue();//Department

		if(speciality!=null && speciality.size()>0) {
			for(int i=0;i<speciality.size();i++) {
				Speciality spec = speciality.get(i);
				if(spec.getDepartment().getId() == department.getId()) {
					TreeItemDto item = new TreeItemDto(spec, enrollClasses);
					this.children.add(item);
				}
			}
		}
		
		
	}

	public TreeItemDto(Speciality speciality, List<EnrollmentClass> enrollClasses) {
		if (speciality == null) {
			return;
		}
		this.id = speciality.getId().toString();
		this.name = speciality.getName();
		this.code = speciality.getCode();
		this.nodeType = TreeItemType.Speciality.getValue();//Speciality
		
		if(speciality.getSubSpecialities()!=null && speciality.getSubSpecialities().size()>0) {
			//children = new ArrayList<TreeItemDto>();
			for(Speciality child : speciality.getSubSpecialities()) {
				TreeItemDto item = new TreeItemDto(child, enrollClasses);
				children.add(item);
			}
		}
		if(enrollClasses!=null && enrollClasses.size()>0) {
			for(int i=0;i<enrollClasses.size();i++) {
				Speciality s = enrollClasses.get(i).getSpeciality();
				if(s!=null && s.getId()== speciality.getId()) {
					TreeItemDto eChild = new TreeItemDto(enrollClasses.get(i));
					this.children.add(eChild);
				}
			}	
		}

	}

	public TreeItemDto(EnrollmentClass enrollClass) {
		if (enrollClass == null) {
			return;
		}
		this.id = enrollClass.getId().toString();
		this.name = enrollClass.getClassName();
		this.code = enrollClass.getClassCode();
		this.nodeType = TreeItemType.EnrollmentClass.getValue();//Class
		
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public int getNodeType() {
		return nodeType;
	}

	public void setNodeType(int nodeType) {
		this.nodeType = nodeType;
	}

	public List<TreeItemDto> getChildren() {
		return children;
	}

	public void setChildren(List<TreeItemDto> children) {
		this.children = children;
	}
	
	
}
