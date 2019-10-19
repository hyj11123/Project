package com.practice.signup;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;



@Service("signUpService")
public class SignUpService {
	
	@Resource(name = "signUpDao")
	private SignUpDao sDao;
	
	public void signUp(MemberVO vo)
	{
		sDao.signUp(vo);
	}

}
