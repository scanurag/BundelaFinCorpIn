package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehicle")
public class VehicleDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_vehicle;
    private String typeOfCase;
    private String productType;
    private String usageType;
    private String manufacturer;
    private String make;
    private String variant;
    private String yearOfManufacture;
    private String exRoomPrice; 
    private String onRoadPrice;
    private String gst;
    private String rtoCharge;
    private String netCost;

    @ManyToOne
    @JoinColumn(name = "id_applicant")
    private ApplicantDetails1 applicantDetails1;



    public Long getId_vehicle() {
		return id_vehicle;
	}

	public void setId_vehicle(Long id_vehicle) {
		this.id_vehicle = id_vehicle;
	}

	public String getTypeOfCase() {
        return typeOfCase;
    }

    public void setTypeOfCase(String typeOfCase) {
        this.typeOfCase = typeOfCase;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getUsageType() {
        return usageType;
    }

    public void setUsageType(String usageType) {
        this.usageType = usageType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(String yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getExRoomPrice() {
        return exRoomPrice;
    }

    public void setExRoomPrice(String exRoomPrice) {
        this.exRoomPrice = exRoomPrice;
    }

    public String getOnRoadPrice() {
        return onRoadPrice;
    }

    public void setOnRoadPrice(String onRoadPrice) {
        this.onRoadPrice = onRoadPrice;
    }

    public String getGst() {
        return gst;
    }

    public void setGst(String gst) {
        this.gst = gst;
    }

    public String getRtoCharge() {
        return rtoCharge;
    }

    public void setRtoCharge(String rtoCharge) {
        this.rtoCharge = rtoCharge;
    }

    public String getNetCost() {
        return netCost;
    }

    public void setNetCost(String netCost) {
        this.netCost = netCost;
    }

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public ApplicantDetails1 getApplicantDetails1() {
		return applicantDetails1;
	}

	public void setApplicantDetails1(ApplicantDetails1 applicantDetails1) {
		this.applicantDetails1 = applicantDetails1;
	}
    
}
