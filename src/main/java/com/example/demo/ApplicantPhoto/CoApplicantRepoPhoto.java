package com.example.demo.ApplicantPhoto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CoApplicantRepoPhoto extends JpaRepository<CoApplicantPhoto,Long>  {

}
