package com.example.tool.edudto;

public class studentSizeDto {
	private String name;
	private Long course_year_id;
	private Long quantity;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getCourse_year_id() {
		return course_year_id;
	}
	public void setCourse_year_id(Long course_year_id) {
		this.course_year_id = course_year_id;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	
	public studentSizeDto()
	{
		
	}
	
	public studentSizeDto(String name,Long course_year_id,Long quantity)
	{
		this.name = name;
		this.course_year_id = course_year_id;
		this.quantity = quantity;
	}
}
