package com.gj.main.dto;

import java.util.List;

import com.gj.main.model.Product;

public class CommonResponse {
	private String statusCode;
	private String statusMessage;

	private Product product;
	private List<Product> productlist;

	private Requestdto data;
	private List<Requestdto> requestdtolist;

	public CommonResponse(String statusCode, String statusMessage, Requestdto data) {
		super();
		this.statusCode = statusCode;
		this.statusMessage = statusMessage;
		this.data = data;
	}

	public CommonResponse(String statusCode, String statusMessage, List<Requestdto> requestdtolist) {
		super();
		this.statusCode = statusCode;
		this.statusMessage = statusMessage;
		this.requestdtolist = requestdtolist;
	}

	public List<Requestdto> getRequestdtolist() {
		return requestdtolist;
	}

	public void setRequestdtolist(List<Requestdto> requestdtolist) {
		this.requestdtolist = requestdtolist;
	}

	public Requestdto getData() {
		return data;
	}

	public void setData(Requestdto data) {
		this.data = data;
	}

	public CommonResponse() {
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<Product> getProductlist() {
		return productlist;
	}

	public void setProductlist(List<Product> productlist) {
		this.productlist = productlist;
	}

}
