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
	
	public List<BhcVO> bhcList2(BhcVO vo){

		System.out.println("Service");
		System.out.println("Service");
		System.out.println("Service");
		System.out.println("Service");
		System.out.println("Service");
		
		List<BhcVO> list = bDao.bhcList2(vo);
		
		return list;
		
		
		
	}
	
	
	
	//BhcSubmmit
	public void bhcSubmit(BhcVO vo) {
		
		System.out.println("Service");
		System.out.println("Service");
		System.out.println("Service");
		System.out.println("Service");
		System.out.println("Service");
		bDao.bhcSubmit(vo);
		
	}
	
	
	//BhcUpdate
	public void bhcUpdate(BhcVO vo) {
		
		System.out.println("Service");
		System.out.println("Service");
		System.out.println("Service");
		System.out.println("Service");
		System.out.println("Service");
		System.out.println("Service");
		bDao.bhcUpadte(vo);
		
		
	}
	
	
	
	//BhcDelete
	
	public void delete(BhcVO vo) {
		bDao.bhcdelete(vo);
	}
	
}
