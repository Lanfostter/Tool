package com.example.tool.edudto;

public class RoomSearchDto {
	private Long trainingBaseId;
	private String text;
	private int pageIndex;
	private int pageSize;

	public Long getTrainingBaseId() {
		return trainingBaseId;
	}

	public void setTrainingBaseId(Long trainingBaseId) {
		this.trainingBaseId = trainingBaseId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
}
