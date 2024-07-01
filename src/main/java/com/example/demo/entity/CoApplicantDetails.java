package com.example.demo.entity;
import java.util.Collection;
import java.util.List;

import org.hibernate.annotations.Cascade;
import org.springframework.beans.factory.annotation.Value;

import com.example.demo.ApplicantPhoto.ApplicantPhoto;
import com.example.demo.ApplicantPhoto.CoApplicantPhoto;
import com.example.demo.DrivingLicense.ApplicantDrivingLicense;
import com.example.demo.DrivingLicense.CoApplicantDrivingLicense;
import com.example.demo.Pancard.ApplicantPancard;
import com.example.demo.Pancard.CoApplicantPancard;
import com.example.demo.Signature.ApplicantSignature;
import com.example.demo.Signature.CoApplicantSignature;
import com.example.demo.VoterId.ApplicantVoterid;
import com.example.demo.VoterId.CoApplicantVoterid;
import com.example.demo.adharcard.ApplicantAdharcard;
import com.example.demo.adharcard.Co_Applicant_Adharcard;
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

import jakarta.persistence.Column;
import jakarta.persistence.Table;
@Entity
@Table(name =  "co-applicant")
public class CoApplicantDetails {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id_coApp; 
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
	
	public CoApplicantDetails() {
		
	}
	
	 @ManyToOne
	    @JoinColumn(name = "id_applicant")
	    private ApplicantDetails1 applicantDetails1;
	 @JsonIgnore
	 @OneToMany(mappedBy = "coapplicantdetails", cascade = CascadeType.ALL)
	    private List<Co_Applicant_Adharcard> applicant; 
	    @JsonIgnore
	    @OneToMany(mappedBy = "coapplicantdetails", cascade = CascadeType.ALL)
	    private List<CoApplicantPhoto> photo; 
	    @JsonIgnore
	    @OneToMany(mappedBy = "coapplicantdetails", cascade = CascadeType.ALL)
	    private List<CoApplicantDrivingLicense> dl; 
	    @JsonIgnore
	    @OneToMany(mappedBy = "coapplicantdetails", cascade = CascadeType.ALL)
	    private List<CoApplicantPancard> pancard;
	    @JsonIgnore
	    @OneToMany(mappedBy = "coapplicantdetails", cascade = CascadeType.ALL)
	    private List<CoApplicantSignature> sing; 
	    @JsonIgnore
	    @OneToMany(mappedBy = "coapplicantdetails", cascade = CascadeType.ALL)
	    private List<CoApplicantVoterid> voter;

	public Long getId_coApp() {
		return id_coApp;
	}
	public void setId_coApp(Long id_coApp) {
		this.id_coApp = id_coApp;
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
	
	public String getFather() {
		return father;
	}
	public void setFather(String father) {
		this.father = father;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public ApplicantDetails1 getApplicantDetails1() {
		return applicantDetails1;
	}
	public void setApplicantDetails1(ApplicantDetails1 applicantDetails1) {
		this.applicantDetails1 = applicantDetails1;
	}
	public List<Co_Applicant_Adharcard> getApplicant() {
		return applicant;
	}
	public void setApplicant(List<Co_Applicant_Adharcard> applicant) {
		this.applicant = applicant;
	}
	public List<CoApplicantPhoto> getPhoto() {
		return photo;
	}
	public void setPhoto(List<CoApplicantPhoto> photo) {
		this.photo = photo;
	}
	public List<CoApplicantDrivingLicense> getDl() {
		return dl;
	}
	public void setDl(List<CoApplicantDrivingLicense> dl) {
		this.dl = dl;
	}
	public List<CoApplicantPancard> getPancard() {
		return pancard;
	}
	public void setPancard(List<CoApplicantPancard> pancard) {
		this.pancard = pancard;
	}
	public List<CoApplicantSignature> getSing() {
		return sing;
	}
	public void setSing(List<CoApplicantSignature> sing) {
		this.sing = sing;
	}
	public List<CoApplicantVoterid> getVoter() {
		return voter;
	}
	public void setVoter(List<CoApplicantVoterid> voter) {
		this.voter = voter;
	}
	
	
}
