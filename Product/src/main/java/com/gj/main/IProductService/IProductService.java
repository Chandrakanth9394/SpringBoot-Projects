package com.gj.main.IProductService;

import java.util.UUID;

import com.gj.main.dto.CommonResponse;
import com.gj.main.dto.Requestdto;

public interface IProductService extends IBaseProductService<Requestdto> {
	public CommonResponse UpdatePro(Requestdto dto);
}
