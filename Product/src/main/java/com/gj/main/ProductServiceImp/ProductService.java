package com.gj.main.ProductServiceImp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gj.main.IProductService.IProductService;
import com.gj.main.dto.CommonResponse;
import com.gj.main.dto.Requestdto;
import com.gj.main.model.Product;
import com.gj.main.repository.IProductRepository;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Service
public class ProductService implements IProductService {

	@Autowired
	private IProductRepository dao;

//	@Override
//	public Product addproduct(Product product) {
//		return dao.save(product);
//	}

//using T
	@Override
	public CommonResponse save(Requestdto dto) {
		Product product = new Product();
		BeanUtils.copyProperties(dto, product);
		dao.save(product);
		dto.setId(product.getId());

		return new CommonResponse("201", "saved succesfully", dto);
	}

	// normal method
//	@Override
//	public CommonResponse save(Requestdto dto) {
//		Product product = new Product();
//		BeanUtils.copyProperties(dto, product);
//		dao.save(product);
//		return new CommonResponse("201", "saved succesfully", product);
//
//	}

	@Override
	public CommonResponse DisplayList() {
		List<Product> productLists = dao.findAll();
		List<Requestdto> dtoList = new ArrayList<Requestdto>();
		for (Product product : productLists) {
			Requestdto requestdto = new Requestdto();
			BeanUtils.copyProperties(product, requestdto);
			dtoList.add(requestdto);
		}
		CommonResponse response = new CommonResponse("200", "the list are : ", dtoList);
		return response;
	}

	@Override
	public CommonResponse SearchUsingId(UUID id) {
		Optional<Product> optional = dao.findById(id);
		Requestdto dto = new Requestdto();
		if (optional.isPresent()) {
			Product product = optional.get();
			BeanUtils.copyProperties(product, dto);
		}
		String Message = "the id " + optional + "details are ";
		return new CommonResponse("200", Message, dto);
	}

	@Override
	public CommonResponse UpdatePro(Requestdto dto) {
		Optional<Product> product = dao.findById(dto.getId());
		if (product.isPresent()) {
			Product existingProduct = product.get();
			BeanUtils.copyProperties(dto, existingProduct);
			dao.save(existingProduct);
		}
		return new CommonResponse("200", "updated!", dto);
	}

}
