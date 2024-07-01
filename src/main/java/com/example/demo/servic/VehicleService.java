package com.example.demo.servic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CoApplicantDetails;
import com.example.demo.entity.FinDetails;
import com.example.demo.entity.VehicleDetails;
import com.example.demo.repo.VehicleDetailsRepository;

@Service
public class VehicleService {
@Autowired
private VehicleDetailsRepository repo;
public VehicleDetails saveVehicleDetails(VehicleDetails d) {
	return repo.save(d);
}
public List<VehicleDetails> getAllVehicleDetails(){
	return repo.findAll();
}
public VehicleDetails getVehicleDetails(Long id) {
    return repo.findById(id).orElse(null);
}

public VehicleDetails getLatestVehicle() {
    List<VehicleDetails> result = repo.findTopByOrderById_vehicleDesc();
    return result.isEmpty() ? null : result.get(0);
}

}
