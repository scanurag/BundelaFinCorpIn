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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CoApplicantDetails;
import com.example.demo.entity.FinDetails;
import com.example.demo.entity.VehicleDetails;
import com.example.demo.servic.VehicleService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class VehicleController {
@Autowired
private VehicleService v;

@PostMapping("/vehicle")
public ResponseEntity<String> addVehicleDetails(@RequestBody VehicleDetails f1) {
    try {
        if (f1 == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid input data");
        }
        v.saveVehicleDetails((f1));
        return ResponseEntity.status(HttpStatus.OK).body("Data saved successfully");
    } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred: " + e.getMessage());
    }
}
@GetMapping(path="/vehicle{id}")
public ResponseEntity<VehicleDetails> getVehicleDetails(Long id) {
    try {
    	VehicleDetails d= v.getVehicleDetails(id);
    	if(d==null) {
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    	}
        return ResponseEntity.ok(d);
    } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }	

}

@GetMapping("/vehicle")
public ResponseEntity<List<VehicleDetails>> getVehicleDetails() {
    try {
        List<VehicleDetails> details = v.getAllVehicleDetails();
        return new ResponseEntity<>(details, HttpStatus.OK);
    } catch (Exception e) {
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}


@GetMapping("/latest2")
public ResponseEntity<VehicleDetails> getLatestCoVehicle() {
    try {
    	VehicleDetails latestApplicant = v.getLatestVehicle();
        return new ResponseEntity<>(latestApplicant, HttpStatus.OK);
    } catch (Exception e) {
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

}