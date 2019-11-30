package com.practice.board;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("board_Service")
public class Board_Service {

	@Resource (name = "board_Dao")
	private Board_Dao bDao;
	
	//boardList
	public List<BoardVO> boardList(){
		
		List<BoardVO> list = bDao.boardList();
		
		return list;
	}
	
	// wirteBoard
	public void wirteBoard(BoardVO vo) {
		
		bDao.wirteBoard(vo);
	}
	
	//input
	public List<BoardVO> getBoardById(String uid){
	
		List<BoardVO> list = bDao.getBoardById(uid);
		
		System.out.println("Service");
		System.out.println("Service");
		System.out.println("Service");
		System.out.println("Service");
		System.out.println("Service");
		
		
		
		return list;
	
	}
	
	// updateBoard
	
	public void updateBoard(BoardVO vo) {
		System.out.println("Service");
		System.out.println("Service");
		System.out.println("Service");
		System.out.println("Service");
		System.out.println("Service");
		bDao.updateBoard(vo);
		
	}
	
	// deleteBoard
	
	public void deleteBoard(BoardVO vo) {
		System.out.println("Service");
		System.out.println("Service");
		System.out.println("Service");
		System.out.println("Service");
		
		bDao.deleteBoard(vo);
	}
}
