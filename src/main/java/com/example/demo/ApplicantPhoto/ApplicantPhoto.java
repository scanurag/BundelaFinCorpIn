package com.example.demo.ApplicantPhoto;

import com.example.demo.entity.ApplicantDetails1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="applicantphoto")
public class ApplicantPhoto {
	 @Id
	 @GeneratedValue(strategy =  GenerationType.IDENTITY) 
	 private Long apli_Photo_id;
	 private String photo;
	 
	 public ApplicantPhoto() {
		 
	 }
	 @ManyToOne
	    @JoinColumn(name = "id_applicant")
	    private ApplicantDetails1 applicantDetails1;
	public Long getApli_Photo_id() {
		return apli_Photo_id;
	}
	public void setApli_Photo_id(Long apli_Photo_id) {
		this.apli_Photo_id = apli_Photo_id;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public ApplicantPhoto(Long apli_Photo_id, String photo) {
		super();
		this.apli_Photo_id = apli_Photo_id;
		this.photo = photo;
	}
	public ApplicantDetails1 getApplicantDetails1() {
		return applicantDetails1;
	}
	public void setApplicantDetails1(ApplicantDetails1 applicantDetails1) {
		this.applicantDetails1 = applicantDetails1;
	}
	
	
	 
}
