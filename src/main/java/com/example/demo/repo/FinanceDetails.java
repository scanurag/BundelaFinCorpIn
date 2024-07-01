package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.FinDetails;

public interface FinanceDetails extends JpaRepository<FinDetails,Long> {

}
