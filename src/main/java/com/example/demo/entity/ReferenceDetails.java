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
@Table(name= "reference")
public class ReferenceDetails {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private Long id;
private String referencename;
private String referencehomeAddress;
private String referenceMobNo;
private String referenceRelation;
private String referencename1;
private String referencehomeAddress1;
private String referenceMobNo1;
private String referenceRelation1;
@ManyToOne
@JoinColumn(name = "id_applicant")
private ApplicantDetails1 applicantDetails1;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getReferencename() {
	return referencename;
}
public void setReferencename(String referencename) {
	this.referencename = referencename;
}
public String getReferencehomeAddress() {
	return referencehomeAddress;
}
public void setReferencehomeAddress(String referencehomeAddress) {
	this.referencehomeAddress = referencehomeAddress;
}
public String getReferenceMobNo() {
	return referenceMobNo;
}
public void setReferenceMobNo(String referenceMobNo) {
	this.referenceMobNo = referenceMobNo;
}
public String getReferenceRelation() {
	return referenceRelation;
}
public void setReferenceRelation(String referenceRelation) {
	this.referenceRelation = referenceRelation;
}
public String getReferencename1() {
	return referencename1;
}
public void setReferencename1(String referencename1) {
	this.referencename1 = referencename1;
}
public String getReferencehomeAddress1() {
	return referencehomeAddress1;
}
public void setReferencehomeAddress1(String referencehomeAddress1) {
	this.referencehomeAddress1 = referencehomeAddress1;
}
public String getReferenceMobNo1() {
	return referenceMobNo1;
}
public void setReferenceMobNo1(String referenceMobNo1) {
	this.referenceMobNo1 = referenceMobNo1;
}
public String getReferenceRelation1() {
	return referenceRelation1;
}
public void setReferenceRelation1(String referenceRelation1) {
	this.referenceRelation1 = referenceRelation1;
}
public ApplicantDetails1 getApplicantDetails1() {
	return applicantDetails1;
}
public void setApplicantDetails1(ApplicantDetails1 applicantDetails1) {
	this.applicantDetails1 = applicantDetails1;
}


}
