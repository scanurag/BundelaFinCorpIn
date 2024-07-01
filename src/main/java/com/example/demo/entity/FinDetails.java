package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "finance1")
public class FinDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String loanAmount;
    private String disbursedAmount;
    private String modeOfInstallment;
    private String roi;
    private String processingFees;
    private String gst;
    private String installmentAmount;
    private String timePeriod;
    private String interestAmount;
    private String noOfInstallment;
    private String totalReturningAmount;
    private String installmentDay;
    
    @ManyToOne
    @JoinColumn(name = "id_applicant")
    private ApplicantDetails1 applicantDetails1;
    
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getDisbursedAmount() {
		return disbursedAmount;
	}
	public void setDisbursedAmount(String disbursedAmount) {
		this.disbursedAmount = disbursedAmount;
	}
	public String getModeOfInstallment() {
		return modeOfInstallment;
	}
	public void setModeOfInstallment(String modeOfInstallment) {
		this.modeOfInstallment = modeOfInstallment;
	}
	public String getRoi() {
		return roi;
	}
	public void setRoi(String roi) {
		this.roi = roi;
	}
	public String getProcessingFees() {
		return processingFees;
	}
	public void setProcessingFees(String processingFees) {
		this.processingFees = processingFees;
	}
	public String getGst() {
		return gst;
	}
	public void setGst(String gst) {
		this.gst = gst;
	}
	public String getInstallmentAmount() {
		return installmentAmount;
	}
	public void setInstallmentAmount(String installmentAmount) {
		this.installmentAmount = installmentAmount;
	}
	public String getTimePeriod() {
		return timePeriod;
	}
	public void setTimePeriod(String timePeriod) {
		this.timePeriod = timePeriod;
	}
	public String getInterestAmount() {
		return interestAmount;
	}
	public void setInterestAmount(String interestAmount) {
		this.interestAmount = interestAmount;
	}
	public String getNoOfInstallment() {
		return noOfInstallment;
	}
	public void setNoOfInstallment(String noOfInstallment) {
		this.noOfInstallment = noOfInstallment;
	}
	public String getTotalReturningAmount() {
		return totalReturningAmount;
	}
	public void setTotalReturningAmount(String totalReturningAmount) {
		this.totalReturningAmount = totalReturningAmount;
	}
	public String getInstallmentDay() {
		return installmentDay;
	}
	public void setInstallmentDay(String installmentDay) {
		this.installmentDay = installmentDay;
	}
	public ApplicantDetails1 getApplicantDetails1() {
		return applicantDetails1;
	}
	public void setApplicantDetails1(ApplicantDetails1 applicantDetails1) {
		this.applicantDetails1 = applicantDetails1;
	}
	
    
}
