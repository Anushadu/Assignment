package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long patientId;
	@Column(nullable = false)
	private String patientName;

	@Column(nullable = false)
	private String gender;

	@Column(nullable = false)
	private Integer age;

	@Column(nullable = false)
	private String phoneNo;

	@Column(nullable = false)
	private String address;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(Long patientId, String patientName, String gender, Integer age, String phoneNo, String address) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.gender = gender;
		this.age = age;
		this.phoneNo = phoneNo;
		this.address = address;
	}

	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}