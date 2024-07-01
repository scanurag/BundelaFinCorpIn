package com.example.demo.Signature;

import com.example.demo.entity.ApplicantDetails1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="applicantSignature")
public class ApplicantSignature {
	 @Id
	 @GeneratedValue(strategy =  GenerationType.IDENTITY) 
	 private Long appli_Signature_id;
	 private String signature;
	 
	 @ManyToOne
	    @JoinColumn(name = "id_applicant")
	    private ApplicantDetails1 applicantDetails1;
	 
	public Long getAppli_Signature_id() {
		return appli_Signature_id;
	}
	public void setAppli_Signature_id(Long appli_Signature_id) {
		this.appli_Signature_id = appli_Signature_id;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public ApplicantSignature(Long appli_Signature_id, String signature) {
		super();
		this.appli_Signature_id = appli_Signature_id;
		this.signature = signature;
	}
	public ApplicantDetails1 getApplicantDetails1() {
		return applicantDetails1;
	}
	public void setApplicantDetails1(ApplicantDetails1 applicantDetails1) {
		this.applicantDetails1 = applicantDetails1;
	}
	public ApplicantSignature() {
		
	}
	 
}
