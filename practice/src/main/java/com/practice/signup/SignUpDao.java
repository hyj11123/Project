package com.practice.signup;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;



@Repository("signUpDao")
public class SignUpDao {
	
	@Resource(name="sqlSessionTemplate")
    private SqlSessionTemplate sqlSessionTemplate;
	
	public void signUp(MemberVO vo)
	{						// MYBATIS
		sqlSessionTemplate.insert("member.signup", vo);
	}

}
