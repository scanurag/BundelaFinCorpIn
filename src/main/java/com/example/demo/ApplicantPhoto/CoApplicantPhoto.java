package com.example.demo.ApplicantPhoto;

import com.example.demo.entity.CoApplicantDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="coapplicantphoto")
public class CoApplicantPhoto {
	 @Id
	 @GeneratedValue(strategy =  GenerationType.IDENTITY) 
	 
	 private Long coapli_Photo_id;
	 private String photo;
	 @ManyToOne
	    @JoinColumn(name = "co-applicant")
	 private CoApplicantDetails coapplicantdetails;
	 
	 public CoApplicantPhoto() {
		 
	 }
	 
	public Long getCoapli_Photo_id() {
		return coapli_Photo_id;
	}
	public void setCoapli_Photo_id(Long coapli_Photo_id) {
		this.coapli_Photo_id = coapli_Photo_id;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public CoApplicantPhoto(Long coapli_Photo_id, String photo) {
		super();
		this.coapli_Photo_id = coapli_Photo_id;
		this.photo = photo;
	}
	public CoApplicantDetails getCoapplicantdetails() {
		return coapplicantdetails;
	}
	public void setCoapplicantdetails(CoApplicantDetails coapplicantdetails) {
		this.coapplicantdetails = coapplicantdetails;
	}
	 
}
