package com.example.demo.DrivingLicense;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ApplicantPhoto.ApplicantPhoto;

@Service
public class ApplicantDrivingLicenseService {
	@Autowired
	private ApplicantDrivingLicense_repo repo;
	public ApplicantDrivingLicense saveApplicantDrivingLicense(ApplicantDrivingLicense a) {
		return repo.save(a);
	}

public List<ApplicantDrivingLicense> getGuarantorApplicantDL(){
		return repo.findAll();
	}
	
}
