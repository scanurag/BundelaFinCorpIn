package com.example.demo.ApplicantPhoto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuarantorApplicantPhotoService {
	@Autowired
	private GuarantorApplicantPhotoRepo service;
	public GuarantorApplicantPhoto saveApplicantPhoto(GuarantorApplicantPhoto a) {
		return service.save(a);
	}
	public List<GuarantorApplicantPhoto> getGuarantorApplicantPhoto(){
		return service.findAll();
	}
}
