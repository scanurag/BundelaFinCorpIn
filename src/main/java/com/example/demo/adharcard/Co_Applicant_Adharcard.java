package com.example.demo.adharcard;


import com.example.demo.entity.CoApplicantDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="co_applicantadharcard")
public class Co_Applicant_Adharcard {
	 @Id
	 @GeneratedValue(strategy =  GenerationType.IDENTITY)
	 
	 private Long co_appli_adharcard_id;
	 private String co_adharcard;
	 @ManyToOne
	    @JoinColumn(name = "coapplicant_id")
	    private CoApplicantDetails coapplicantdetails;
	public Long getCo_appli_adharcard_id() {
		return co_appli_adharcard_id;
	}
	public void setCo_appli_adharcard_id(Long co_appli_adharcard_id) {
		this.co_appli_adharcard_id = co_appli_adharcard_id;
	}
	public String getCo_adharcard() {
		return co_adharcard;
	}
	public void setCo_adharcard(String co_adharcard) {
		this.co_adharcard = co_adharcard;
	}
	public Co_Applicant_Adharcard(Long co_appli_adharcard_id, String co_adharcard) {
		super();
		this.co_appli_adharcard_id = co_appli_adharcard_id;
		this.co_adharcard = co_adharcard;
	}
	public CoApplicantDetails getCoapplicantdetails() {
		return coapplicantdetails;
	}
	public void setCoapplicantdetails(CoApplicantDetails coapplicantdetails) {
		this.coapplicantdetails = coapplicantdetails;
	}
	
	public Co_Applicant_Adharcard () {
		
	}
	 
}
