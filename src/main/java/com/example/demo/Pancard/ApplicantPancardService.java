package com.example.demo.Pancard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ApplicantPhoto.ApplicantPhoto;
import com.example.demo.ApplicantPhoto.ApplicantPhoto_Repo;
@Service
public class ApplicantPancardService {
	@Autowired
	private Applicant_pancard_repo repo;
	public ApplicantPancard saveApplicantPancard(ApplicantPancard a) {
		return repo.save(a);
	}

public List<ApplicantPancard> getApplicantPancard(){
		return repo.findAll();
	}
}
