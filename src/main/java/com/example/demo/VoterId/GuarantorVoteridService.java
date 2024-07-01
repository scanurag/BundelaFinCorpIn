package com.example.demo.VoterId;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GuarantorVoteridService {

	@Autowired
	public GuarantorVoteridRepo repo;
	public GuarantorVoterid saveGuarantorVoterid(GuarantorVoterid a) {
		return repo.save(a);
	}
	public List<GuarantorVoterid> getGuarantorVoterid(){
		return repo.findAll();
	}
	
}
