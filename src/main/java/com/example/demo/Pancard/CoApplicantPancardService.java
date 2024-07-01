package com.example.demo.Pancard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoApplicantPancardService {
	@Autowired
	private CoApplicantPancardRepo repo;
	public CoApplicantPancard saveCoApplicantPancard(CoApplicantPancard a) {
		return repo.save(a);
	}
	


public List<CoApplicantPancard> getCoApplicantPancard(){
		return repo.findAll();
	}
}
