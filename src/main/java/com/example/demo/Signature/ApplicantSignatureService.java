package com.example.demo.Signature;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicantSignatureService {
@Autowired
private ApplicantSignatureRepo repo;
public ApplicantSignature saveApplicantSignature(ApplicantSignature s) {
	return repo.save(s);
}


public List<ApplicantSignature> getApplicantSignature(){
		return repo.findAll();
	}

}
