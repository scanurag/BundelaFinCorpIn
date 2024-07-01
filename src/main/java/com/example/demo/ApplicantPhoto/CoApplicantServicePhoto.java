package com.example.demo.ApplicantPhoto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoApplicantServicePhoto {
	@Autowired
	private CoApplicantRepoPhoto service;
	public CoApplicantPhoto saveCoApplicantPhoto(CoApplicantPhoto a) {
		return service.save(a);
	}

public List<CoApplicantPhoto> getCoApplicantPhoto(){
		return service.findAll();
	}
}
