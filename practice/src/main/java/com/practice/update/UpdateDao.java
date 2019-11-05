package com.practice.update;


import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.practice.signin.MemberVO;

@Repository("updateDao")
public class UpdateDao {

	@Resource(name="sqlSessionTemplate")
	private SqlSessionTemplate sqlSessionTemplate;
	
	
	public void update(MemberVO vo)
	{
		System.out.println("Dao");
		System.out.println("Dao");
		System.out.println("Dao");
		System.out.println("Dao");
		sqlSessionTemplate.update("revise.update", vo);
	}
}
