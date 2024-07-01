package com.example.demo.Signature;

import com.example.demo.entity.CoApplicantDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="coapplicantSignature")
public class CoApplicantSignature {
	@Id
	 @GeneratedValue(strategy =  GenerationType.IDENTITY) 
	 private Long coappli_Signature_id;
	 private String cosignature;
	 @ManyToOne
	    @JoinColumn(name = "co-applicant")
	 private CoApplicantDetails coapplicantdetails;
	public Long getCoappli_Signature_id() {
		return coappli_Signature_id;
	}
	public void setCoappli_Signature_id(Long coappli_Signature_id) {
		this.coappli_Signature_id = coappli_Signature_id;
	}
	public String getCosignature() {
		return cosignature;
	}
	public void setCosignature(String cosignature) {
		this.cosignature = cosignature;
	}
	public CoApplicantDetails getCoapplicantdetails() {
		return coapplicantdetails;
	}
	public void setCoapplicantdetails(CoApplicantDetails coapplicantdetails) {
		this.coapplicantdetails = coapplicantdetails;
	}
	
	public CoApplicantSignature () {
		
	}
	 
}
