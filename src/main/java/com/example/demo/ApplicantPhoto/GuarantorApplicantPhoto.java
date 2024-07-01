package com.example.demo.ApplicantPhoto;

import com.example.demo.entity.guarantordetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="guarantApplicantphoto")
public class GuarantorApplicantPhoto {
	 @Id
	 @GeneratedValue(strategy =  GenerationType.IDENTITY) 
	 
	 private Long appli_photo_id;
	 private String guarantphoto;
	 
	 public GuarantorApplicantPhoto() {
		 
	 }
	 
	 @ManyToOne
	    @JoinColumn(name = "guarant")
	    private guarantordetails guarantdetails1;
	public Long getAppli_photo_id() {
		return appli_photo_id;
	}
	public void setAppli_photo_id(Long appli_photo_id) {
		this.appli_photo_id = appli_photo_id;
	}
	public String getGuarantphoto() {
		return guarantphoto;
	}
	public void setGuarantphoto(String guarantphoto) {
		this.guarantphoto = guarantphoto;
	}
	public guarantordetails getGuarantdetails1() {
		return guarantdetails1;
	}
	public void setGuarantdetails1(guarantordetails guarantdetails1) {
		this.guarantdetails1 = guarantdetails1;
	}
	
	 
}
