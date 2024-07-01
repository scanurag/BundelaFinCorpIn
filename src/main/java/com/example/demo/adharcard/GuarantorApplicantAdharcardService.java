package com.example.demo.adharcard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuarantorApplicantAdharcardService {
	@Autowired
	private GuarantorApplicantAdharcardRepo r;
	public  GuarantorApplicantAdharcard saveGuarantorApplicantAdharcard( GuarantorApplicantAdharcard a) {
		return r.save(a);
	}
	
	public List<GuarantorApplicantAdharcard> getGuarantorApplicantAdharcard(){
		return r.findAll();
	}
	
}
