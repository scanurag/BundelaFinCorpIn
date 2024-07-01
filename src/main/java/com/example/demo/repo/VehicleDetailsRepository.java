package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.VehicleDetails;

public interface VehicleDetailsRepository extends JpaRepository<VehicleDetails,Long> {
	 @Query("SELECT c FROM VehicleDetails c ORDER BY c.id_vehicle DESC")
	    List<VehicleDetails> findTopByOrderById_vehicleDesc();
}
