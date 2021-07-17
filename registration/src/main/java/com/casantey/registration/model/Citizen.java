package com.casantey.registration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="citizen")
public class Citizen {
	
	@Id
	@Column(length=20)
	private String phone;
	private String name;
	private String email;
	private String gender;
	private String nationality;
	private String region;
	private String password;
	private String create_time;
	private String imei;
	private String appLang;
	private String audioLang;
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getAppLang() {
		return appLang;
	}
	public void setAppLang(String appLang) {
		this.appLang = appLang;
	}
	public String getAudioLang() {
		return audioLang;
	}
	public void setAudioLang(String audioLang) {
		this.audioLang = audioLang;
	}
	@Override
	public String toString() {
		return "Citizen [phone=" + phone + ", name=" + name + ", email=" + email + ", gender=" + gender
				+ ", nationality=" + nationality + ", region=" + region + ", password=" + password + ", create_time="
				+ create_time + ", imei=" + imei + ", appLang=" + appLang + ", audioLang=" + audioLang + "]";
	}
	
	
	
	
	

}
