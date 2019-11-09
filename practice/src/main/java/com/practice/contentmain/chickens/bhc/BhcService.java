package com.practice.contentmain.chickens.bhc;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("bhc_Service")
public class BhcService {

	@Resource (name = "bhcDao")
	private BhcDao bDao;
	
	//BhcList
	public List<BhcVO> bhcList(){
		
	List<BhcVO> list = bDao.bhcList();
		
	return list;	
	}
	
	//BhcSubmmit
	public void bhcSubmit(BhcVO vo) {
		
		bDao.bhcSubmit(vo);
		
	}
}
