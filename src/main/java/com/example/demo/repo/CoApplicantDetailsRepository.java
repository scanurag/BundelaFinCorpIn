package com.example.demo.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.ApplicantDetails1;
import com.example.demo.entity.CoApplicantDetails;

public interface CoApplicantDetailsRepository extends JpaRepository<CoApplicantDetails, Long> {
	 List<CoApplicantDetails> findByName(String name);
	 @Query("SELECT c FROM CoApplicantDetails c ORDER BY c.id_coApp DESC")
	    List<CoApplicantDetails> findTopByOrderById_coAppDesc();
}
