package com.dating.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Daters implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	int userId;
	int dateId;
	int isBlockedBy;

	public Daters() {
	}

	public Daters(int userId, int dateId, int isBlockedBy) {
		this.userId = userId;
		this.dateId = dateId;
		this.isBlockedBy = isBlockedBy;
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

	public int getIsBlockedBy() {
		return isBlockedBy;
	}

	public void setIsBlockedBy(int isBlockedBy) {
		this.isBlockedBy = isBlockedBy;
	}

	@Override
	public String toString() {
		return "Daters [userId=" + userId + ", dateId=" + dateId + ", isBlockedBy=" + isBlockedBy + "]";
	}

}
