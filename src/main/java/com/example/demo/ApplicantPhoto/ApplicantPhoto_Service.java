package com.example.demo.ApplicantPhoto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.adharcard.GuarantorApplicantAdharcard;

@Service
public class ApplicantPhoto_Service {
@Autowired
private ApplicantPhoto_Repo service;
public ApplicantPhoto saveApplicantPhoto(ApplicantPhoto a) {
	return service.save(a);
}

public List<ApplicantPhoto> getApplicantPhoto(){
	return service.findAll();
}

}
