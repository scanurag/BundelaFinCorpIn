package com.example.demo.VoterId;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.ApplicantPhoto.ApplicantPhoto;
@Repository
public interface Applicant_Voterid_repo extends JpaRepository<ApplicantVoterid,Long>  {

}
