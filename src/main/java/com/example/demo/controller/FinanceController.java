package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CoApplicantDetails;
import com.example.demo.entity.FinDetails;
import com.example.demo.entity.guarantordetails;
import com.example.demo.repo.FinanceDetails;
import com.example.demo.servic.FinanceService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class FinanceController {
@Autowired 
private FinanceService fs;

@PostMapping(path="/financedetails")
public ResponseEntity<String> addFinanceDetails(@RequestBody FinDetails f1) {
    try {
        if (f1 == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid input data");
        }
        fs.saveFinance((f1));
        return ResponseEntity.status(HttpStatus.OK).body("Data saved successfully");
    } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred: " + e.getMessage());
    }
}

@GetMapping("/financedetails")
public ResponseEntity<List<FinDetails>> getFinDetails() {
    try {
        List<FinDetails> details = fs.getAllFinDetails();
        return new ResponseEntity<>(details, HttpStatus.OK);
    } catch (Exception e) {
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

@GetMapping(path="/financedetails/{id}")
public ResponseEntity<FinDetails> getFinanceDetails(@PathVariable Long id) {
    try {
    	FinDetails f=fs.getFinDetails(id);
    	if(f==null) {
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    	}
        return ResponseEntity.ok(f);
    } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }
}
}
