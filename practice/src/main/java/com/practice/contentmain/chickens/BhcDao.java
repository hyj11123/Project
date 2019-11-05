package com.practice.contentmain.chickens;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.practice.board.BoardVO;

@Repository("bhcDao")
public class BhcDao {

	@Resource(name="sqlSessionTemplate")
	private SqlSessionTemplate sqlSessionTemplate;
		
	//bhcList
	 public List<BhcVO> bhcList(){
			
	 List<BhcVO> list = sqlSessionTemplate.selectList(null, null);
			
	 return list;
		
	 }
		
		//bhcSubmmit
	public void bhcSubmmit(BhcVO vo) {
		
	sqlSessionTemplate.insert("", vo);
	}
		
		
	//bhcUpdate
		
	//bhcDelete
}
