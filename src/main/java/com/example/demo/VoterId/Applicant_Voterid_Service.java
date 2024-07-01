package com.example.demo.VoterId;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ApplicantPhoto.ApplicantPhoto;
import com.example.demo.ApplicantPhoto.ApplicantPhoto_Repo;
@Service
public class Applicant_Voterid_Service {
	@Autowired
	private Applicant_Voterid_repo repo;
	public ApplicantVoterid saveApplicantVoterid(ApplicantVoterid a) {
		return repo.save(a);
	}

public List<ApplicantVoterid> getApplicantVoterid(){
		return repo.findAll();
	}
}
