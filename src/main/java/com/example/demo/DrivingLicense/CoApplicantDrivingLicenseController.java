package com.example.demo.DrivingLicense;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin 
@RequestMapping("/api")
public class CoApplicantDrivingLicenseController {
	@Autowired
	private  CoApplicantDrivingLicenseService  repo;
	public static String uploadDirectory = System.getProperty("user.dir")+"/src/main/webapp/images";
	@PostMapping(path = "/coapplicantDl")
	public CoApplicantDrivingLicense saveStudent(@ModelAttribute CoApplicantDrivingLicense sig, @RequestParam("file") MultipartFile file) throws IOException {
	       
        Path uploadPath = Paths.get(uploadDirectory);
        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }

        String originalFilename = file.getOriginalFilename();
        Path fileNameAndPath = Paths.get(uploadDirectory, originalFilename);
        
        Files.write(fileNameAndPath, file.getBytes());
        
        sig.setCodrivinglicense(originalFilename);
        CoApplicantDrivingLicense savedSignatureData =repo.saveCoApplicantDrivingLicense(sig);
        return savedSignatureData;
    }
	
	   @GetMapping("/coapplicantDl")
	    public ResponseEntity<List<CoApplicantDrivingLicense>> getCoDl() {
	        try {
	            List<CoApplicantDrivingLicense> details = repo.getDrivingLicense();
	            return new ResponseEntity<>(details, HttpStatus.OK);
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    } 
}
