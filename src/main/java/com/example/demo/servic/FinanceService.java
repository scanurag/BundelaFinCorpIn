package com.example.demo.servic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CoApplicantDetails;
import com.example.demo.entity.FinDetails;
import com.example.demo.entity.guarantordetails;
import com.example.demo.repo.FinanceDetails;

@Service
public class FinanceService {
	@Autowired
private FinanceDetails f1;
public void saveFinance(FinDetails f12) {
	this.f1.save(f12);
}
public FinDetails getFinDetails(Long id) {
    return f1.findById(id).orElse(null);
}
public List<FinDetails> getAllFinDetails() {
    return f1.findAll();

}
}
