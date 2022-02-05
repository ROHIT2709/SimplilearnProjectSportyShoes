package com.example.ecommerce.controller;
////import com.example.ecommerce.*;

import java.util.Date;
////import java.util.List;

////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.http.HttpStatus;
////import org.springframework.http.ResponseEntity;
////import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.exceptions.BusinessException;
////import com.example.ecommerce.model.PurchaseReport;
import com.example.ecommerce.service.PurchaseImpl;
//import com.example.ecommerce.service.PurchaseReportService;

@RestController
public class PurchaseController {
	 
	@GetMapping("category/{category}")
	public PurchaseImpl getAllPurchaseReportsByCategory(@PathVariable String category){
		return new PurchaseImpl();
	}
	@GetMapping("date/{dateInMs}")
	public PurchaseImpl getAllPurchaseReportsByDop(@PathVariable Long dateInMs){
		Date dop = new Date(dateInMs);
		return new PurchaseImpl();
	}
	@GetMapping("purchaseReport/all")
	public PurchaseImpl getAllPurchaseReport(){
		return new PurchaseImpl();
	}
	
	 
	 
	}

	


