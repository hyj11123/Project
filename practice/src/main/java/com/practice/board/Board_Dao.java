package com.practice.board;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository("board_Dao")
public class Board_Dao {

	@Resource(name="sqlSessionTemplate")
	private SqlSessionTemplate sqlSessionTemplate;
	
	//boardList
	public List<BoardVO> boardList(){
		
		List<BoardVO> list = sqlSessionTemplate.selectList("board.boardAllList");
		
		return list;
		
	}
	
	// wirteBoard
	public void wirteBoard(BoardVO vo) {
		
		sqlSessionTemplate.insert("board.boardWrite", vo);
		
			
	}
	
	// updateBoard
	
	// deleteBoard
	
	public void deleteBoard(BoardVO vo) {
		
		sqlSessionTemplate.insert("board.boardDelete", vo);
		
			
	}
	
}
