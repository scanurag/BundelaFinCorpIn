package com.example.demo.adharcard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Co_Applicant_AdharcardServic {
@Autowired
private Co_Applicant_AdharcardRepo service;
public  Co_Applicant_Adharcard saveCo_Applicant_Adharcard( Co_Applicant_Adharcard a) {
	return service.save(a);
}
public  Co_Applicant_Adharcard getApplicantAdharcard(Long  co_appli_adharcard_id) {
	return service.findById(co_appli_adharcard_id).orElse(null);
}

public List<Co_Applicant_Adharcard> getCoApplicantAdharcard(){
	return service.findAll();
}

}
