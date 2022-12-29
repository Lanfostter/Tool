package com.example.tool.edudto;

import java.io.Serializable;

public class RoomExtDto implements Serializable {

	private Long id;
	private String code;
	private String name;
	private String building;
	private Integer capacity;
	private Integer examCapacity;
	private Long idSai;
	private Long buildingId;
	private String nameCode;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public Integer getExamCapacity() {
		return examCapacity;
	}

	public void setExamCapacity(Integer examCapacity) {
		this.examCapacity = examCapacity;
	}

	public Long getIdSai() {
		return idSai;
	}

	public void setIdSai(Long idSai) {
		this.idSai = idSai;
	}

	public Long getBuildingId() {
		return buildingId;
	}

	public void setBuildingId(Long buildingId) {
		this.buildingId = buildingId;
	}

	public String getNameCode() {
		return nameCode;
	}

	public void setNameCode(String nameCode) {
		this.nameCode = nameCode;
	}

	public RoomExtDto() {

	}


}
