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
import com.example.demo.entity.guarantordetails;
import com.example.demo.servic.guarantonService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class guarantonController {
	  @Autowired
	  private guarantonService gs;
	  @PostMapping(path="/guarantordetails")
	    public ResponseEntity<String> addGuarantonDetails(@RequestBody guarantordetails co) {
	        try {
	            if (co == null) {
	                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid input data");
	            }
	            gs.saveGuar(co);
	            return ResponseEntity.status(HttpStatus.OK).body("Data saved successfully");
	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred: " + e.getMessage());
	        }
	    }

	    @GetMapping("/guarantordetails/{id}")
	    public ResponseEntity<guarantordetails> getGuarantonDetails(@PathVariable Long id) {
	    	
	        try {
	            guarantordetails d= gs.getguarantordetails(id);
	            if(d==null) {
	            	return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	            }
	            return ResponseEntity.ok(d);
	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	        }
	    }
	    
	    @GetMapping("/guarantordetails")
	    public ResponseEntity<List<guarantordetails>> getGuarDetails() {
	        try {
	            List<guarantordetails> details = gs.getAllGuarDetails();
	            return new ResponseEntity<>(details, HttpStatus.OK);
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	    
	    
	    @GetMapping("/latest-guarantor")
	    public ResponseEntity<guarantordetails> getLatestGuarantor() {
	        try {
	            guarantordetails latestGuarantor = gs.getLatestGuar();
	            return new ResponseEntity<>(latestGuarantor, HttpStatus.OK);
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	    
}
