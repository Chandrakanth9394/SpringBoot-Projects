package com.gj.main.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gj.main.IProductService.IProductService;
import com.gj.main.dto.CommonResponse;
import com.gj.main.dto.Requestdto;
import com.gj.main.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class ProductRestController {
	@Autowired
	private IProductService service;

//	@PostMapping("/add")
//	public CommonResponse Add(@RequestBody Product product) {
//		CommonResponse commonResponse = new CommonResponse();
//		Product product1 = service.addproduct(product);
//		if (product1 != null) {
//			commonResponse.setStatusCode("200");
//			commonResponse.setStatusMessage("New Product " + product + " added!");
//			commonResponse.setProduct(product1);
//		} else {
//			commonResponse.setStatusCode("404");
//			commonResponse.setStatusMessage("Sorry something went wrong!");
//		}
//		return commonResponse;
//	}

	@PostMapping("/save")
	public CommonResponse Save(@RequestBody Requestdto dto) {
		CommonResponse commonResponse = service.save(dto);
		return commonResponse;
	}

	@GetMapping("/list")
	public CommonResponse DisplayList() {
		return service.DisplayList();
	}

	@GetMapping("/withid")
	public CommonResponse SearchWithId(@RequestParam("id") UUID ID) {

		return service.SearchUsingId(ID);
	}

	@PutMapping("/update")
	public CommonResponse Update(@RequestBody Requestdto requestdto) {
		return service.UpdatePro(requestdto);
	}

}
