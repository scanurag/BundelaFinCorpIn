package com.example.demo.controller;
import java.util.List;
import com.example.demo.entity.ApplicantDetails1;
import com.example.demo.servic.ApplicantDetailsService; // Corrected package name
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ApplicantController {

    @Autowired
    private ApplicantDetailsService applicantService;
    
    @PostMapping("/applicantdetails")
    public ResponseEntity<String> addApplicantDetails(@RequestBody ApplicantDetails1 basic) {
        try {
            if (basic == null) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid input data");
            }
            applicantService.saveApplicantDetails(basic);
            return ResponseEntity.status(HttpStatus.OK).body("Data saved successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred: " + e.getMessage());
        }
    }

    @GetMapping("/applicantdetails")
    public ResponseEntity<List<ApplicantDetails1>> getApplicantDetails() {
        try {
            List<ApplicantDetails1> details = applicantService.getAllApplicantDetails();
            return new ResponseEntity<>(details, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    
    @GetMapping("/latest")
    public ResponseEntity<ApplicantDetails1> getlatestApplicant() {
        try {
            ApplicantDetails1 latestApplicant = applicantService.getLatestApplicant();
            return new ResponseEntity<>(latestApplicant, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
