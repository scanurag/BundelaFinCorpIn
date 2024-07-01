package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.demo.entity.guarantordetails;

public interface guarantonRepo extends JpaRepository<guarantordetails, Long>{
	 @Query("SELECT c FROM guarantordetails c ORDER BY c.id_guar DESC")
	    List<guarantordetails> findTopByOrderById_guarDesc();
}
