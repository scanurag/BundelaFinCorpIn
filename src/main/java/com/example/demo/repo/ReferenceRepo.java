package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.ReferenceDetails;

public interface ReferenceRepo extends JpaRepository<ReferenceDetails,Long> {

}
