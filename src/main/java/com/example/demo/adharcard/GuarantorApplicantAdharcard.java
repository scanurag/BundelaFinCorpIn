package com.example.demo.adharcard;

import com.example.demo.entity.guarantordetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="guarantApplicantadharcard")
public class GuarantorApplicantAdharcard {
	 @Id
	 @GeneratedValue(strategy =  GenerationType.IDENTITY) 
	 
	 private Long appli_adharcard_id;
	 private String guarantadharcard;
	 
	 public GuarantorApplicantAdharcard() {
		 
	 }

	 @ManyToOne
	    @JoinColumn(name = "guarant")
	    private guarantordetails guarantdetails1;
	public Long getAppli_adharcard_id() {
		return appli_adharcard_id;
	}
	public void setAppli_adharcard_id(Long appli_adharcard_id) {
		this.appli_adharcard_id = appli_adharcard_id;
	}
	public String getGuarantadharcard() {
		return guarantadharcard;
	}
	public void setGuarantadharcard(String guarantadharcard) {
		this.guarantadharcard = guarantadharcard;
	}
	public guarantordetails getGuarantdetails1() {
		return guarantdetails1;
	}
	public void setGuarantdetails1(guarantordetails guarantdetails1) {
		this.guarantdetails1 = guarantdetails1;
	}
	
	 
}
