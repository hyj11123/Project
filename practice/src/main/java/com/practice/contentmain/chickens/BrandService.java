package com.practice.contentmain.chickens;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("brand_Service")
public class BrandService {

		@Resource(name = "brandDao")
		private BrandDao bDao;
		
	public List<BrandVO> brandList(String type){
		
		List<BrandVO> list = bDao.brandList(type);
		
		return list;
	}
	
	public void insertBrand(BrandVO vo) {
		
		bDao.insertBrand(vo);
	}
}
