package com.example.demo.servic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.CoApplicantDetails;
import com.example.demo.entity.guarantordetails;
import com.example.demo.repo.guarantonRepo;
@Component
public class guarantonService {

	@Autowired
	private guarantonRepo gr;
	public List<guarantordetails> getOrders(){
		List<guarantordetails> list=this.gr.findAll();
		return list;
	}
	public void saveGuar(guarantordetails g) {
		this.gr.save(g);
	}
	   public guarantordetails getguarantordetails(Long id) {
	        return gr.findById(id).orElse(null);
	    }
	   
	    public List<guarantordetails> getAllGuarDetails() {
	        return gr.findAll();
	    
	    }
	   public guarantordetails getLatestGuar() {
	        List<guarantordetails> result = gr.findTopByOrderById_guarDesc();
	        return result.isEmpty() ? null : result.get(0);
	    }
	 
}
