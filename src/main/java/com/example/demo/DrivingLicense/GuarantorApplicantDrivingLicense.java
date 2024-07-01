package com.example.demo.DrivingLicense;
import com.example.demo.entity.guarantordetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="guarapplicantdrivLicense")
public class GuarantorApplicantDrivingLicense {
	 @Id
	 @GeneratedValue(strategy =  GenerationType.IDENTITY) 
	 private Long Guar_appli_deivLic_id;
	 private String drivinglicense;
	 
	 @ManyToOne
	    @JoinColumn(name = "guarant")
	    private guarantordetails guarantdetails1;
	 public GuarantorApplicantDrivingLicense() {
		 
	 }
	public Long getGuar_appli_deivLic_id() {
		return Guar_appli_deivLic_id;
	}
	public void setGuar_appli_deivLic_id(Long guar_appli_deivLic_id) {
		Guar_appli_deivLic_id = guar_appli_deivLic_id;
	}
	public String getDrivinglicense() {
		return drivinglicense;
	}
	public void setDrivinglicense(String drivinglicense) {
		this.drivinglicense = drivinglicense;
	}
	public guarantordetails getGuarantdetails1() {
		return guarantdetails1;
	}
	public void setGuarantdetails1(guarantordetails guarantdetails1) {
		this.guarantdetails1 = guarantdetails1;
	}
	
	 
}
