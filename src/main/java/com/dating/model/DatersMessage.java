package com.dating.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "daters_message")
public class DatersMessage {

	@Id
	int userId;
	int dateId;
	String message;

	public DatersMessage() {
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getDateId() {
		return dateId;
	}

	public void setDateId(int dateId) {
		this.dateId = dateId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "DatersMessage [userId=" + userId + ", dateId=" + dateId + ", message=" + message + "]";
	}

}
