package com.practice.delete;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.practice.signin.MemberVO;

@Repository("deleteDao")
public class DeleteDao {

	@Resource(name = "sqlSessionTemplate")
	private SqlSessionTemplate sqlSessionTemplate;

	public void delete(MemberVO vo) {

		sqlSessionTemplate.delete("member.dmember", vo);

		

	}

}
