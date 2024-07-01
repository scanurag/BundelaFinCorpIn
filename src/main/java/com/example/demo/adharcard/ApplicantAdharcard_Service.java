package com.example.demo.adharcard;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ReferenceDetails;

@Service
public class ApplicantAdharcard_Service {
@Autowired
private  ApplicantAdharcardrepo service;
public  ApplicantAdharcard saveApplicantAdharcard( ApplicantAdharcard a) {
	return service.save(a);
}
public List<ApplicantAdharcard> getApplicantAdharcard(){
	return service.findAll();
}
public  ApplicantAdharcard getApplicantAdharcard(Long  appli_adharcard_id) {
	return service.findById(appli_adharcard_id).orElse(null);
}

}
