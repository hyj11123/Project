package com.practice.signup;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.practice.signin.MemberVO;



@Service("signUpService")
public class SignUpService {
	
	@Resource(name = "signUpDao")
	private SignUpDao sDao;
	
	public void signUp(MemberVO vo)
	{
		sDao.signUp(vo);
	}

}
