package com.practice.contentmain.chickens;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository("brandDao")
public class BrandDao {

	@Resource(name = "sqlSessionTemplate")
	private SqlSessionTemplate sqlSessionTemplate;
	
	public List<BrandVO> brandList(String type){
		
		List<BrandVO> list = sqlSessionTemplate.selectList("brand.selectList", type);
		
		return list;
	}
	
	public void insertBrand(BrandVO vo) {
		
		sqlSessionTemplate.insert("brand.insertBrand", vo);
	}
	
	public List<BrandVO> editBrand(String brand_uid) {
		
		List<BrandVO> list = sqlSessionTemplate.selectList("brand.selectList02", brand_uid);
		
		return list;
	}
	
	public void updateBrand(BrandVO vo) {
		
		sqlSessionTemplate.update("brand.updateBrand", vo);
	}
}
