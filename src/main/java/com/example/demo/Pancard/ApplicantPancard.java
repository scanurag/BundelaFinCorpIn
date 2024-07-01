package com.example.demo.Pancard;

import com.example.demo.entity.ApplicantDetails1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="applicantpancard")
public class ApplicantPancard {
	 @Id
	 @GeneratedValue(strategy =  GenerationType.IDENTITY) 
	 private Long apli_pancard_id;
	 private String pancard;
	 
	 @ManyToOne
	    @JoinColumn(name = "id_applicant")
	    private ApplicantDetails1 applicantDetails1;
	 
	public Long getApli_pancard_id() {
		return apli_pancard_id;
	}
	public void setApli_pancard_id(Long apli_pancard_id) {
		this.apli_pancard_id = apli_pancard_id;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public ApplicantPancard(Long apli_pancard_id, String pancard) {
		super();
		this.apli_pancard_id = apli_pancard_id;
		this.pancard = pancard;
	}
	public ApplicantDetails1 getApplicantDetails1() {
		return applicantDetails1;
	}
	public void setApplicantDetails1(ApplicantDetails1 applicantDetails1) {
		this.applicantDetails1 = applicantDetails1;
	}
	
	public  ApplicantPancard() {
		
	}
	 
}
