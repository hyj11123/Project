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
}
