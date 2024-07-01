package com.example.demo.Pancard;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.ApplicantPhoto.ApplicantPhoto;
@Repository
public interface Applicant_pancard_repo  extends JpaRepository<ApplicantPancard,Long> {

}
