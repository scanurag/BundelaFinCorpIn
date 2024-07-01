package com.example.demo.DrivingLicense;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoApplicantDrivingLicenseService {
	@Autowired
	private CoApplicantDrivingLicenseRepo repo;
	public CoApplicantDrivingLicense saveCoApplicantDrivingLicense(CoApplicantDrivingLicense a) {
		return repo.save(a);
	}
	
	public List<CoApplicantDrivingLicense> getDrivingLicense(){
		return repo.findAll();
	}
}
