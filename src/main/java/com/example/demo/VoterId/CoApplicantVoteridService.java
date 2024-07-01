package com.example.demo.VoterId;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoApplicantVoteridService {
	@Autowired
	private CoApplicantVoteridRepo repo;
	public CoApplicantVoterid  saveApplicantVoterid(CoApplicantVoterid  a) {
		return repo.save(a);
	}
	

public List<CoApplicantVoterid> getCoApplicantVoterid(){
		return repo.findAll();
	}
}
