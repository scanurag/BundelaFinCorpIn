package com.example.demo.entity;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.demo.ApplicantPhoto.ApplicantPhoto;
import com.example.demo.DrivingLicense.ApplicantDrivingLicense;
import com.example.demo.Pancard.ApplicantPancard;
import com.example.demo.Signature.ApplicantSignature;
import com.example.demo.VoterId.ApplicantVoterid;
import com.example.demo.adharcard.ApplicantAdharcard;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Builder;
import lombok.Data;
@Entity
@Table(name =  "applicant1")
public class ApplicantDetails1 {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id_applicant;
	
	private String name;
	
	private String fathername;
	
	private String mother;

	private String dob;

	private String mobile;
	
	private String age;
	
	private String gender;
	
	private String maritalstatus;
	
	private String currentaddress;
	
	private String locality;
	
	private String district;

	private String city;
	
	private String statename;

	private String pincode;
	
	private String landmark;

	private String distanceinkm;
	
	private String addresstype;
	
	private String permanentaddress;
	
	private String permanentlocality;
	
	private String permanentdistrict;
	
	private String permanentcity;

	private String permanentstatename;
	
	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

	private LocalDate createdAt;

	private  String permanentpincode;
	@JsonIgnore
    @OneToMany(mappedBy = "applicantDetails1", cascade = CascadeType.ALL)
    private List<CoApplicantDetails> coApplicants;
	@JsonIgnore
    @OneToMany(mappedBy = "applicantDetails1", cascade = CascadeType.ALL)
    private List<FinDetails> financeDetails;
	@JsonIgnore
    @OneToMany(mappedBy = "applicantDetails1", cascade = CascadeType.ALL)
    private List<VehicleDetails> vehicleDetails;
	@JsonIgnore
    @OneToMany(mappedBy = "applicantDetails1", cascade = CascadeType.ALL)
    private List<ReferenceDetails> referenceDetails; 
	@JsonIgnore
    @OneToMany(mappedBy = "applicantDetails1", cascade = CascadeType.ALL)
    private List<guarantordetails> guardetails; 
    
    public List<guarantordetails> getGuardetails() {
		return guardetails;
	}

	public void setGuardetails(List<guarantordetails> guardetails) {
		this.guardetails = guardetails;
	}

	public List<ApplicantPancard> getPancard() {
		return pancard;
	}

	public void setPancard(List<ApplicantPancard> pancard) {
		this.pancard = pancard;
	}
	@JsonIgnore
	@OneToMany(mappedBy = "applicantDetails1", cascade = CascadeType.ALL)
    private List<ApplicantAdharcard> applicant; 
	@JsonIgnore
    @OneToMany(mappedBy = "applicantDetails1", cascade = CascadeType.ALL)
    private List<ApplicantPhoto> photo; 
	@JsonIgnore
    @OneToMany(mappedBy = "applicantDetails1", cascade = CascadeType.ALL)
    private List<ApplicantDrivingLicense> dl; 
	@JsonIgnore
    @OneToMany(mappedBy = "applicantDetails1", cascade = CascadeType.ALL)
    private List<ApplicantPancard> pancard;
	@JsonIgnore
    @OneToMany(mappedBy = "applicantDetails1", cascade = CascadeType.ALL)
    private List<ApplicantSignature> sing; 
	@JsonIgnore
    @OneToMany(mappedBy = "applicantDetails1", cascade = CascadeType.ALL)
    private List<ApplicantVoterid> voter; 
    
    public Long getId_applicant() {
		return id_applicant;
	}

	public void setId_applicant(Long id_applicant) {
		this.id_applicant = id_applicant;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public String getMother() {
		return mother;
	}

	public void setMother(String mother) {
		this.mother = mother;
	}


	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
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

	public String getCurrentaddress() {
		return currentaddress;
	}

	public void setCurrentaddress(String currentaddress) {
		this.currentaddress = currentaddress;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
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

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
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

	public String getAddresstype() {
		return addresstype;
	}

	public void setAddresstype(String addresstype) {
		this.addresstype = addresstype;
	}

	public String getPermanentaddress() {
		return permanentaddress;
	}

	public void setPermanentaddress(String permanentaddress) {
		this.permanentaddress = permanentaddress;
	}

	public String getPermanentlocality() {
		return permanentlocality;
	}

	public void setPermanentlocality(String permanentlocality) {
		this.permanentlocality = permanentlocality;
	}

	public String getPermanentdistrict() {
		return permanentdistrict;
	}

	public void setPermanentdistrict(String permanentdistrict) {
		this.permanentdistrict = permanentdistrict;
	}

	public String getPermanentcity() {
		return permanentcity;
	}

	public void setPermanentcity(String permanentcity) {
		this.permanentcity = permanentcity;
	}

	public String getPermanentstatename() {
		return permanentstatename;
	}

	public void setPermanentstatename(String permanentstatename) {
		this.permanentstatename = permanentstatename;
	}

	public String getPermanentpincode() {
		return permanentpincode;
	}

	public void setPermanentpincode(String permanentpincode) {
		this.permanentpincode = permanentpincode;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}


	public List<CoApplicantDetails> getCoApplicants() {
		return coApplicants;
	}

	public void setCoApplicants(List<CoApplicantDetails> coApplicants) {
		this.coApplicants = coApplicants;
	}

	public List<FinDetails> getFinanceDetails() {
		return financeDetails;
	}

	public void setFinanceDetails(List<FinDetails> financeDetails) {
		this.financeDetails = financeDetails;
	}

	public List<VehicleDetails> getVehicleDetails() {
		return vehicleDetails;
	}

	public void setVehicleDetails(List<VehicleDetails> vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}

	public List<ReferenceDetails> getReferenceDetails() {
		return referenceDetails;
	}

	public void setReferenceDetails(List<ReferenceDetails> referenceDetails) {
		this.referenceDetails = referenceDetails;
	}

	public List<ApplicantAdharcard> getApplicant() {
		return applicant;
	}

	public void setApplicant(List<ApplicantAdharcard> applicant) {
		this.applicant = applicant;
	}

	public List<ApplicantPhoto> getPhoto() {
		return photo;
	}

	public void setPhoto(List<ApplicantPhoto> photo) {
		this.photo = photo;
	}

	public List<ApplicantDrivingLicense> getDl() {
		return dl;
	}

	public void setDl(List<ApplicantDrivingLicense> dl) {
		this.dl = dl;
	}

	public List<ApplicantSignature> getSing() {
		return sing;
	}

	public void setSing(List<ApplicantSignature> sing) {
		this.sing = sing;
	}

	public List<ApplicantVoterid> getVoter() {
		return voter;
	}

	public void setVoter(List<ApplicantVoterid> voter) {
		this.voter = voter;
	}


	   @PrePersist
	    protected void onCreate() {
	        createdAt = LocalDate.now();
	    }
	
	
}
