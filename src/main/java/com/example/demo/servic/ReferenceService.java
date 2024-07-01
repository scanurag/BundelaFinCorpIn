package com.example.demo.servic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ReferenceDetails;
import com.example.demo.entity.VehicleDetails;
import com.example.demo.repo.ReferenceRepo;

@Service
public class ReferenceService {
@Autowired
private ReferenceRepo rf;
public ReferenceDetails saveReferenceDetails(ReferenceDetails r) {
	return rf.save(r);
}
public List<ReferenceDetails> getALLReference(){
	return rf.findAll();
}
public ReferenceDetails getReferenceDetailss(Long id) {
    return rf.findById(id).orElse(null);
}
}
