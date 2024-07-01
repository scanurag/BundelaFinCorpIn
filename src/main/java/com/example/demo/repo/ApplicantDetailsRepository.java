package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ApplicantDetails1;

public interface ApplicantDetailsRepository extends JpaRepository<ApplicantDetails1, Long> {
    List<ApplicantDetails1> findByName(String name);
    @Query("SELECT a FROM ApplicantDetails1 a ORDER BY a.id_applicant DESC")
    List<ApplicantDetails1> findTopByOrderById_applicantDesc();
}
