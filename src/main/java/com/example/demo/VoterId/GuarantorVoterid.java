package com.example.demo.VoterId;

import com.example.demo.entity.guarantordetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="guarapplicantvoterid")
public class GuarantorVoterid {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long guarVoterId;
	 private String Voter;

	 @ManyToOne
	    @JoinColumn(name = "guarant")
	    private guarantordetails guarantdetails1;
	 
	public String getVoter() {
		return Voter;
	}
	public void setVoter(String voter) {
		Voter = voter;
	}
	public Long getGuarVoterId() {
		return guarVoterId;
	}
	public void setGuarVoterId(Long guarVoterId) {
		this.guarVoterId = guarVoterId;
	}
	public guarantordetails getGuarantdetails1() {
		return guarantdetails1;
	}
	public void setGuarantdetails1(guarantordetails guarantdetails1) {
		this.guarantdetails1 = guarantdetails1;
	}
	public GuarantorVoterid() {
		
	}
	 
}
