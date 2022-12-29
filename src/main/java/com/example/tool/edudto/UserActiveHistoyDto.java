package com.example.tool.edudto;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.globits.core.dto.PersonDto;
import com.globits.education.domain.UserActiveHistory;
import com.globits.security.domain.User;
import com.globits.security.dto.UserDto;


public class UserActiveHistoyDto implements Serializable {
	private static final long serialVersionUID = 5405782142010466260L;
	private Long id;
	private UserDto user;
	private Date dateModify;// Thời điểm thay đổi
	private String userModify;// Người thay đổi
	private String reasonLock;// lý do khóa tài khoản
	private String reasonOpen;// lý do mở tài khoản
	private Boolean active;// tình trạng

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateModify() {
		return dateModify;
	}

	public void setDateModify(Date dateModify) {
		this.dateModify = dateModify;
	}

	public String getUserModify() {
		return userModify;
	}

	public void setUserModify(String userModify) {
		this.userModify = userModify;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	public String getReasonLock() {
		return reasonLock;
	}

	public void setReasonLock(String reasonLock) {
		this.reasonLock = reasonLock;
	}

	public String getReasonOpen() {
		return reasonOpen;
	}

	public void setReasonOpen(String reasonOpen) {
		this.reasonOpen = reasonOpen;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public UserActiveHistoyDto() {

	}
	public UserActiveHistoyDto(UserActiveHistory userHistory) {
		this.id = userHistory.getId();
		
		if(userHistory.getUser() != null)
		{
			this.user = new UserDto();
			this.user.setUsername(userHistory.getUser().getUsername());
			this.user.setPassword(userHistory.getUser().getPassword());
			this.user.setDisplayName(userHistory.getUser().getPerson().getDisplayName());
			this.user.setUsername(userHistory.getUser().getUsername());
			if(userHistory.getUser().getPerson() != null)
			{
				PersonDto p = new PersonDto();
				p.setBirthDate(userHistory.getUser().getPerson().getBirthDate());
				this.user.setPerson(p);
			}
		}
		this.active = userHistory.getActive();
		this.reasonLock = userHistory.getReasonLock();
		this.reasonOpen = userHistory.getReasonOpen();
		this.dateModify = userHistory.getDateModify();
		this.userModify=userHistory.getUserModify();
	}
	
	
}
