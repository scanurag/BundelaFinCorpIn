package com.example.demo.Pancard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuarantorApplicantPancardService {
	@Autowired
	private GuarantorApplicantPancardRepo repo;
	public GuarantorApplicantPancard saveGuarantorApplicantPancard(GuarantorApplicantPancard a) {
		return repo.save(a);
	}
	

public List<GuarantorApplicantPancard> getGuarantorApplicantPancard(){
		return repo.findAll();
	}
}
