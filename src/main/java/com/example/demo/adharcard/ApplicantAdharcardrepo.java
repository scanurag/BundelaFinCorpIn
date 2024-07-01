package com.example.demo.adharcard;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ApplicantAdharcardrepo extends JpaRepository<ApplicantAdharcard,Long>{

}