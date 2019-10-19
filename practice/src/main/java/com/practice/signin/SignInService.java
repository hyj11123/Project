package com.practice.signin;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
@Service("signInService")
public class SignInService {

	@Resource(name="signInDao")
	private SignInDao aDao;
	
	
	public List<MemberVO> signin(MemberVO vo)
	{
		List<MemberVO> list = aDao.signin(vo);
		
		return list;
	}
	
	
}
