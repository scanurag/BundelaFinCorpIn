package com.example.demo.VoterId;

import com.example.demo.entity.ApplicantDetails1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="applicantvoterid")
public class ApplicantVoterid {
	 @Id
	 @GeneratedValue(strategy =  GenerationType.IDENTITY) 
	 private Long apli_Voterid_id;
	 private String Voter;
	 
	 @ManyToOne
	    @JoinColumn(name = "id_applicant")
	    private ApplicantDetails1 applicantDetails1;
	 
	public Long getApli_Voterid_id() {
		return apli_Voterid_id;
	}
	public void setApli_Voterid_id(Long apli_Voterid_id) {
		this.apli_Voterid_id = apli_Voterid_id;
	}
	public String getVoter() {
		return Voter;
	}
	public void setVoter(String voter) {
		Voter = voter;
	}
	public ApplicantVoterid(Long apli_Voterid_id, String voter) {
		super();
		this.apli_Voterid_id = apli_Voterid_id;
		Voter = voter;
	}
	public ApplicantDetails1 getApplicantDetails1() {
		return applicantDetails1;
	}
	public void setApplicantDetails1(ApplicantDetails1 applicantDetails1) {
		this.applicantDetails1 = applicantDetails1;
	}
	
	public ApplicantVoterid() {
		
	}
	 
}
