package com.example.demo.adharcard;
import com.example.demo.entity.ApplicantDetails1;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "applicantadharcard")
public class ApplicantAdharcard {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long applicantAdhar;
	 private String adharcard;
	 
	 
	 public  ApplicantAdharcard() {
		 
	 }
	 
	 @ManyToOne
	    @JoinColumn(name = "id_applicant")
	    private ApplicantDetails1 applicantDetails1;
    
	public ApplicantDetails1 getApplicantDetails1() {
		return applicantDetails1;
	}

	public void setApplicantDetails1(ApplicantDetails1 applicantDetails1) {
		this.applicantDetails1 = applicantDetails1;
	}

	public String getAdharcard() {
		return adharcard;
	}

	public void setAdharcard(String adharcard) {
		this.adharcard = adharcard;
	}

	public Long getApplicantAdhar() {
		return applicantAdhar;
	}

	public void setApplicantAdhar(Long applicantAdhar) {
		this.applicantAdhar = applicantAdhar;
	}
	 

	 
	 

}
