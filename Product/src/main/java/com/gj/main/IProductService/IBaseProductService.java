package com.gj.main.IProductService;

import java.util.UUID;

import com.gj.main.dto.CommonResponse;
import com.gj.main.dto.Requestdto;
import com.gj.main.model.Product;

public interface IBaseProductService<T> {
	// public Product addproduct(Product product);

//normal way
	// public CommonResponse save(Requestdto dto);

	// using T
	public CommonResponse save(T product);

	public CommonResponse DisplayList();

	public CommonResponse SearchUsingId(UUID id);

}
