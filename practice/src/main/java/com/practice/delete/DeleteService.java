package com.practice.delete;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.practice.signin.MemberVO;

@Service("deleteService")
public class DeleteService {

	@Resource(name = "deleteDao")
	private DeleteDao xDao;
	
	public void delete(MemberVO vo)
	{
		xDao.delete(vo);
	}
}
