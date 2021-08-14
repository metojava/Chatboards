package com.dating.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dater")
public class Dater implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int userId;
	
	int dateId;
	
	int gender;
	
	String firstName;
	String lastName;
	Date birthDate;
	Date joiningDate;
	String religion;
	String mother_tongue;
	String country;
	String city;
	String mobile_number;
	int enabled;
	int paid_membership;
	Date paymentDate;
	String username;
	String password;
	
	
	
	public Dater() {

	}
	public Dater(int userId, int dateId, int gender, String firstName, String lastName, Date birthDate,
			Date joiningDate, String religion, String mother_tongue, String country, String city, String mobile_number,
			int enabled, int paid_membership, Date paymentDate, String username, String password) {

		this.userId = userId;
		this.dateId = dateId;
		this.gender = gender;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.joiningDate = joiningDate;
		this.religion = religion;
		this.mother_tongue = mother_tongue;
		this.country = country;
		this.city = city;
		this.mobile_number = mobile_number;
		this.enabled = enabled;
		this.paid_membership = paid_membership;
		this.paymentDate = paymentDate;
		this.username = username;
		this.password = password;
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
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getMother_tongue() {
		return mother_tongue;
	}
	public void setMother_tongue(String mother_tongue) {
		this.mother_tongue = mother_tongue;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
	public int getPaid_membership() {
		return paid_membership;
	}
	public void setPaid_membership(int paid_membership) {
		this.paid_membership = paid_membership;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Dater [userId=" + userId + ", dateId=" + dateId + ", gender=" + gender + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", birthDate=" + birthDate + ", joiningDate=" + joiningDate + ", religion="
				+ religion + ", mother_tongue=" + mother_tongue + ", country=" + country + ", city=" + city
				+ ", mobile_number=" + mobile_number + ", enabled=" + enabled + ", paid_membership=" + paid_membership
				+ ", paymentDate=" + paymentDate + ", username=" + username + ", password=" + password + "]";
	}
	
	

}
