package com.practice.signin;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository("signInDao")
public class SignInDao {

	@Resource(name="sqlSessionTemplate")
	private SqlSessionTemplate sqlSessionTemplate;
	
	public List<MemberVO> signin(MemberVO vo)
	{
		List<MemberVO> list = sqlSessionTemplate.selectList("signin.signin", vo);
		
		return list;
	}
}
