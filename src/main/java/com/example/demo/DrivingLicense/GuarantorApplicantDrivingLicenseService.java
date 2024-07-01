package com.example.demo.DrivingLicense;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuarantorApplicantDrivingLicenseService {
	@Autowired
	private GuarantorApplicantDrivingLicenseRepo repo;
	public GuarantorApplicantDrivingLicense saveGuarantorApplicantDrivingLicense(GuarantorApplicantDrivingLicense a) {
		return repo.save(a);
	}

public List<GuarantorApplicantDrivingLicense> getGuarantorApplicantDrivingLicense(){
		return repo.findAll();
	}
}
