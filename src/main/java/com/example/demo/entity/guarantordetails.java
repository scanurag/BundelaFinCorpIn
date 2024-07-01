package com.example.demo.entity;

import java.util.List;

import com.example.demo.ApplicantPhoto.GuarantorApplicantPhoto;
import com.example.demo.DrivingLicense.GuarantorApplicantDrivingLicense;
import com.example.demo.Pancard.GuarantorApplicantPancard;
import com.example.demo.Signature.GuarantorApplicantSignature;
import com.example.demo.VoterId.GuarantorVoterid;
import com.example.demo.adharcard.GuarantorApplicantAdharcard;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name =  "guarant")
public class guarantordetails {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id_guar; 
	private String name;
	private String father;
	private String mother;
	private String dob;
	private String mob;
	private String age;
	private String gender;
	private String maritalstatus;
	private String permanentAddress;
	private String locailty;
	private String district;
	private String city;
	private String stateName;
	private String pinCode;
	private String landmark;
	private String distanceinkm;
	private String addresstype;
	@ManyToOne
	@JoinColumn(name = "id_applicant")
	private ApplicantDetails1 applicantDetails1;
	
	@JsonIgnore
	@OneToMany(mappedBy = "guarantdetails1", cascade = CascadeType.ALL)
    private List<GuarantorApplicantAdharcard> applicant; 
	@JsonIgnore
    @OneToMany(mappedBy = "guarantdetails1", cascade = CascadeType.ALL)
    private List<GuarantorApplicantPhoto> photo; 
	@JsonIgnore
    @OneToMany(mappedBy = "guarantdetails1", cascade = CascadeType.ALL)
    private List<GuarantorApplicantDrivingLicense> dl; 
	@JsonIgnore
    @OneToMany(mappedBy = "guarantdetails1", cascade = CascadeType.ALL)
    private List<GuarantorApplicantPancard> pancard;
	@JsonIgnore
    @OneToMany(mappedBy = "guarantdetails1", cascade = CascadeType.ALL)
    private List<GuarantorApplicantSignature> sing; 
	@JsonIgnore
    @OneToMany(mappedBy = "guarantdetails1", cascade = CascadeType.ALL)
    private List<GuarantorVoterid> voter;
	
	
	

	public Long getId_guar() {
		return id_guar;
	}
	public void setId_guar(Long id_guar) {
		this.id_guar = id_guar;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMother() {
		return mother;
	}
	public void setMother(String mother) {
		this.mother = mother;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	
	
	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public String getLocailty() {
		return locailty;
	}
	public void setLocailty(String locailty) {
		this.locailty = locailty;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getDistanceinkm() {
		return distanceinkm;
	}
	public void setDistanceinkm(String distanceinkm) {
		this.distanceinkm = distanceinkm;
	}

	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getFather() {
		return father;
	}
	public void setFather(String father) {
		this.father = father;
	}
	public String getMaritalstatus() {
		return maritalstatus;
	}
	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}
	public String getAddresstype() {
		return addresstype;
	}
	public void setAddresstype(String addresstype) {
		this.addresstype = addresstype;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public ApplicantDetails1 getApplicantDetails1() {
		return applicantDetails1;
	}
	public void setApplicantDetails1(ApplicantDetails1 applicantDetails1) {
		this.applicantDetails1 = applicantDetails1;
	}
	public List<GuarantorApplicantAdharcard> getApplicant() {
		return applicant;
	}
	public void setApplicant(List<GuarantorApplicantAdharcard> applicant) {
		this.applicant = applicant;
	}
	public List<GuarantorApplicantPhoto> getPhoto() {
		return photo;
	}
	public void setPhoto(List<GuarantorApplicantPhoto> photo) {
		this.photo = photo;
	}
	public List<GuarantorApplicantDrivingLicense> getDl() {
		return dl;
	}
	public void setDl(List<GuarantorApplicantDrivingLicense> dl) {
		this.dl = dl;
	}
	public List<GuarantorApplicantPancard> getPancard() {
		return pancard;
	}
	public void setPancard(List<GuarantorApplicantPancard> pancard) {
		this.pancard = pancard;
	}
	public List<GuarantorApplicantSignature> getSing() {
		return sing;
	}
	public void setSing(List<GuarantorApplicantSignature> sing) {
		this.sing = sing;
	}
	public List<GuarantorVoterid> getVoter() {
		return voter;
	}
	public void setVoter(List<GuarantorVoterid> voter) {
		this.voter = voter;
	}
	
	
	
}
