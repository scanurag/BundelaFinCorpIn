package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.ApplicantDetails1;
import com.example.demo.entity.CoApplicantDetails;
import com.example.demo.servic.CoApplicantDetailsService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class CoApplicantDetailsController {

    @Autowired
    private CoApplicantDetailsService service;

    @PostMapping(path="/coapplicantdetails")
    public ResponseEntity<String> addCoApplicantDetails(@RequestBody CoApplicantDetails co) {
        try {
            if (co == null) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid input data");
            }
            service.saveCoApplicantDetails(co);
            return ResponseEntity.status(HttpStatus.OK).body("Data saved successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred: " + e.getMessage());
        }
    }

    @GetMapping("/coapplicantdetails/{id}")
    public ResponseEntity<CoApplicantDetails> getApplicantDetails(@PathVariable Long id) {
        try {
        	CoApplicantDetails details = service.getApplicantDetails( id);
            if (details == null) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }
            return ResponseEntity.ok(details);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
    @GetMapping("/coapplicantdetails")
    public ResponseEntity<List<CoApplicantDetails>> getDetails() {
        try {
            List<CoApplicantDetails> details = service.getAllCoApplicantDetails();
            return new ResponseEntity<>(details, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping("/latest1")
    public ResponseEntity<CoApplicantDetails> getLatestCoApplicant1() {
        try {
            CoApplicantDetails latestApplicant = service.getLatestCoapplicant();
            return new ResponseEntity<>(latestApplicant, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}




