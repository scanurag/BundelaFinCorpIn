package com.example.demo.Pancard;

import com.example.demo.entity.CoApplicantDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="coapplicantpancard")
public class CoApplicantPancard {
	 @Id
	 @GeneratedValue(strategy =  GenerationType.IDENTITY) 
	 private Long coapli_pancard_id;
	 private String copancard;
	 
	 @ManyToOne
	    @JoinColumn(name = "co-applicant")
	 private CoApplicantDetails coapplicantdetails;
	 
	public Long getCoapli_pancard_id() {
		return coapli_pancard_id;
	}
	public void setCoapli_pancard_id(Long coapli_pancard_id) {
		this.coapli_pancard_id = coapli_pancard_id;
	}
	public String getCopancard() {
		return copancard;
	}
	public void setCopancard(String copancard) {
		this.copancard = copancard;
	}
	public CoApplicantPancard(Long coapli_pancard_id, String copancard) {
		super();
		this.coapli_pancard_id = coapli_pancard_id;
		this.copancard = copancard;
	}
	public CoApplicantDetails getCoapplicantdetails() {
		return coapplicantdetails;
	}
	public void setCoapplicantdetails(CoApplicantDetails coapplicantdetails) {
		this.coapplicantdetails = coapplicantdetails;
	}
	
	 public CoApplicantPancard() {
		 
	 }
}
