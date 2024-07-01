package com.example.demo.DrivingLicense;

import com.example.demo.entity.ApplicantDetails1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="applicantdrivLicense")
public class ApplicantDrivingLicense {
	 @Id
	 @GeneratedValue(strategy =  GenerationType.IDENTITY) 
	 private Long appli_deivLic_id;
	 private String drivinglicense;
	 
	 @ManyToOne
	    @JoinColumn(name = "id_applicant")
	    private ApplicantDetails1 applicantDetails1;
	 
	public Long getAppli_deivLic_id() {
		return appli_deivLic_id;
	}
	public void setAppli_deivLic_id(Long appli_deivLic_id) {
		this.appli_deivLic_id = appli_deivLic_id;
	}
	public String getDrivinglicense() {
		return drivinglicense;
	}
	public void setDrivinglicense(String drivinglicense) {
		this.drivinglicense = drivinglicense;
	}
	public ApplicantDrivingLicense(Long appli_deivLic_id, String drivinglicense) {
		super();
		this.appli_deivLic_id = appli_deivLic_id;
		this.drivinglicense = drivinglicense;
	}
	public ApplicantDetails1 getApplicantDetails1() {
		return applicantDetails1;
	}
	public void setApplicantDetails1(ApplicantDetails1 applicantDetails1) {
		this.applicantDetails1 = applicantDetails1;
	}
   
	public  ApplicantDrivingLicense() {
		
	}
	 
}
