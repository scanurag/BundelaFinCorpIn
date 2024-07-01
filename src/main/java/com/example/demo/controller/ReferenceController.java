package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.ReferenceDetails;
import com.example.demo.entity.VehicleDetails;
import com.example.demo.servic.ReferenceService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ReferenceController {

    @Autowired
    private ReferenceService referenceService;

    @PostMapping("/ref")
    public ResponseEntity<String> addReferenceDetails(@RequestBody ReferenceDetails referenceDetails) {
        try {
            if (referenceDetails == null) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid input data");
            }
            referenceService.saveReferenceDetails(referenceDetails);
            return ResponseEntity.status(HttpStatus.OK).body("Data saved successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred: " + e.getMessage());
        }
    }

    
    @GetMapping("/ref")
    public ResponseEntity<List<ReferenceDetails>> getRefDetails() {
        try {
            List<ReferenceDetails> details = referenceService.getALLReference();
            return new ResponseEntity<>(details, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping(path="/ref/{id}")
    public ResponseEntity<ReferenceDetails> getReferenceDetails(@PathVariable Long id) {
        try {
            ReferenceDetails referenceDetails = referenceService.getReferenceDetailss(id);
            if(referenceDetails==null) {
            	return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }
            return ResponseEntity.ok(referenceDetails);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
}

