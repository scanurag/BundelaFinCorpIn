package com.example.demo.DrivingLicense;

import com.example.demo.entity.CoApplicantDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="coapplicantdrivLicense")
public class CoApplicantDrivingLicense {
	 @Id
	 @GeneratedValue(strategy =  GenerationType.IDENTITY) 
	 private Long coappli_deivLic_id;
	 private String codrivinglicense;
	 
	 @ManyToOne
	    @JoinColumn(name = "co-applicant")
	 private CoApplicantDetails coapplicantdetails;
	 
	public Long getCoappli_deivLic_id() {
		return coappli_deivLic_id;
	}
	public void setCoappli_deivLic_id(Long coappli_deivLic_id) {
		this.coappli_deivLic_id = coappli_deivLic_id;
	}
	public String getCodrivinglicense() {
		return codrivinglicense;
	}
	public void setCodrivinglicense(String codrivinglicense) {
		this.codrivinglicense = codrivinglicense;
	}
	public CoApplicantDetails getCoapplicantdetails() {
		return coapplicantdetails;
	}
	public void setCoapplicantdetails(CoApplicantDetails coapplicantdetails) {
		this.coapplicantdetails = coapplicantdetails;
	}
	public CoApplicantDrivingLicense() {
		 
	}
	 
}
