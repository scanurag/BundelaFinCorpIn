package com.example.demo.Signature;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoApplicantSignatureService {
	@Autowired
	private CoApplicantSignatureRepo repo;
	public CoApplicantSignature saveCoApplicantSignature(CoApplicantSignature s) {
		return repo.save(s);
	}

public List<CoApplicantSignature > getCoApplicantSignature (){
		return repo.findAll();
	}
}
