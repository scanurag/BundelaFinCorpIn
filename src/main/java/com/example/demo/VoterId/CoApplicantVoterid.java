package com.example.demo.VoterId;

import com.example.demo.entity.CoApplicantDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="coapplicantvoterid")
public class CoApplicantVoterid {
	 @Id
	 @GeneratedValue(strategy =  GenerationType.IDENTITY) 
	 
	 private Long coappli_adharcard_id;
	 private String coapplicantVoterid;
	 @ManyToOne
	    @JoinColumn(name = "co-applicant")
	 private CoApplicantDetails coapplicantdetails;
	public Long getCoappli_adharcard_id() {
		return coappli_adharcard_id;
	}
	public void setCoappli_adharcard_id(Long coappli_adharcard_id) {
		this.coappli_adharcard_id = coappli_adharcard_id;
	}
	public String getCoapplicantVoterid() {
		return coapplicantVoterid;
	}
	public void setCoapplicantVoterid(String coapplicantVoterid) {
		this.coapplicantVoterid = coapplicantVoterid;
	}
	public CoApplicantDetails getCoapplicantdetails() {
		return coapplicantdetails;
	}
	public void setCoapplicantdetails(CoApplicantDetails coapplicantdetails) {
		this.coapplicantdetails = coapplicantdetails;
	}
	 
	public CoApplicantVoterid() {
		
	}
	 

}
