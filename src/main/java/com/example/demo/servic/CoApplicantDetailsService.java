
package com.example.demo.servic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ApplicantDetails1;
import com.example.demo.entity.CoApplicantDetails;
import com.example.demo.repo.CoApplicantDetailsRepository;

import java.util.List;

@Service
public class CoApplicantDetailsService {

    @Autowired
    private CoApplicantDetailsRepository repository;

    public CoApplicantDetails saveCoApplicantDetails(CoApplicantDetails details) {
        return repository.save(details);
    }

    public List<CoApplicantDetails> getAllCoApplicantDetails() {
        return repository.findAll();
    }
    public CoApplicantDetails getApplicantDetails(Long id) {
        return repository.findById(id).orElse(null);
    }
    public CoApplicantDetails getLatestCoapplicant() {
        List<CoApplicantDetails> result = repository.findTopByOrderById_coAppDesc();
        return result.isEmpty() ? null : result.get(0);
    }
}
