package com.practice.board;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("board")
@Controller
public class Board_Controller {
	
	@Resource(name = "board_Service")
	private Board_Service bSerivce;
	
	@RequestMapping("boardList")
	public String boardList(Model model) {
		
		List<BoardVO> list = bSerivce.boardList();
		
		model.addAttribute("bList", list);
		
		return "boardList";
	}
	
	@RequestMapping("moveWritePage")
	public String moveWritePage() {
		
		return "moveWritePage";
	}
	
	@RequestMapping("wirteBoard")
	public String wirteBoard( @RequestParam("title")String title
							, @RequestParam("author")String author){
		
		System.out.println(title);
		System.out.println(author);
		
		BoardVO vo = new BoardVO();
		vo.setT_title(title);
		vo.setT_author(author);
		
		bSerivce.wirteBoard(vo);
	
		
		return "boardList";
	}
	
	// readBoard
	@RequestMapping("readBoard")
	public String readBoard(@RequestParam("title")String title
						   ,@RequestParam("author")String author) {
		
		System.out.println(title);
		System.out.println(author);
		
		return "boardRead";
	}
	
	
	
	// updateBoard
	
	// deleteBoard
	
	public String deleteBoard(@RequestParam("T_uid")String t_uid, HttpSession session)
	{
		BoardVO vo = new BoardVO();
		vo.setT_uid(t_uid);
		
		bSerivce.deleteBoard(vo);
		

		
		return "boardList";
	}

}
