package com.example.demo.servic;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.example.demo.entity.ApplicantDetails1;
import com.example.demo.repo.ApplicantDetailsRepository;


@Service
public class ApplicantDetailsService {

    @Autowired
    private ApplicantDetailsRepository repository;

    public ApplicantDetails1 saveApplicantDetails(ApplicantDetails1 applicantDetails) {
        return repository.save(applicantDetails);
    }

    public List<ApplicantDetails1> getAllApplicantDetails() {
        return repository.findAll();
    }
  
    public ApplicantDetails1 getApplicantDetails(Long id) {
        return repository.findById(id).orElse(null);
    }
     
    public List<ApplicantDetails1> findByName(String name) {
        return repository.findByName(name);
    }
    
    public ApplicantDetails1 getLatestApplicant() {
        List<ApplicantDetails1> result = repository.findTopByOrderById_applicantDesc();
        return result.isEmpty() ? null : result.get(0);
    }

  
}
