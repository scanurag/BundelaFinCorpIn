package com.example.demo.Pancard;

import com.example.demo.entity.guarantordetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="guarapplicantpancard")
public class GuarantorApplicantPancard {
	 @Id
	 @GeneratedValue(strategy =  GenerationType.IDENTITY) 
	 private Long apli_pancard_id;
	 private String pancard;
	 @ManyToOne
	    @JoinColumn(name = "guarant")
	    private guarantordetails guarantdetails1;
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
	public guarantordetails getGuarantdetails1() {
		return guarantdetails1;
	}
	public void setGuarantdetails1(guarantordetails guarantdetails1) {
		this.guarantdetails1 = guarantdetails1;
	}
	
	public GuarantorApplicantPancard() {
		
	}
	 
}
