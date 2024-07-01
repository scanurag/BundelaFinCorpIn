package com.example.demo.Signature;

import com.example.demo.entity.guarantordetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="guarantorSignature")
public class GuarantorApplicantSignature {
	 @Id
	 @GeneratedValue(strategy =  GenerationType.IDENTITY) 
	 private Long appli_Signature_id;
	 private String signature;
	 
	 @ManyToOne
	    @JoinColumn(name = "guarant")
	    private guarantordetails guarantdetails1;
	 
	public Long getAppli_Signature_id() {
		return appli_Signature_id;
	}
	public void setAppli_Signature_id(Long appli_Signature_id) {
		this.appli_Signature_id = appli_Signature_id;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public guarantordetails getGuarantdetails1() {
		return guarantdetails1;
	}
	public void setGuarantdetails1(guarantordetails guarantdetails1) {
		this.guarantdetails1 = guarantdetails1;
	}
	
	public GuarantorApplicantSignature() {
		
	}
	 
}
