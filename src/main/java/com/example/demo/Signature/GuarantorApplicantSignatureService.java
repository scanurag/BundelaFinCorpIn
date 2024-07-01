package com.example.demo.Signature;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuarantorApplicantSignatureService {
	@Autowired
	private GuarantorApplicantSignatureRepo repo;
	public GuarantorApplicantSignature saveGuarantorApplicantSignature(GuarantorApplicantSignature s) {
		return repo.save(s);
	}
	public List<GuarantorApplicantSignature> getGuarantorApplicantSignature (){
		return repo.findAll();
	}
}
