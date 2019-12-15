package com.practice.contentmain.brand;

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
	
	public List<BrandVO> editBrand(String brand_uid) {
		
		List<BrandVO> list = bDao.editBrand(brand_uid);
		
		return list;
		
	}
	public void updateBrand(BrandVO vo) {
		
		bDao.updateBrand(vo);
	}
}
