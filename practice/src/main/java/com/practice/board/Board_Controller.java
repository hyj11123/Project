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
							, @RequestParam("author")String author
							, @RequestParam("content")String content){
		
		System.out.println(title);
		System.out.println(author);
		System.out.println(content);
		
		BoardVO vo = new BoardVO();
		vo.setB_title(title);
		vo.setB_author(author);
		vo.setB_content(content);
		
		bSerivce.wirteBoard(vo);
	
		
		return "redirect:boardList";
	}
	
	// readBoard
	@RequestMapping("readBoard")
	public String readBoard(@RequestParam("title")String title
						   ,@RequestParam("author")String author) {
		
		System.out.println(title);
		System.out.println(author);
		
		return "boardRead";
	}
	
	@RequestMapping("input")
	public String input() {
		
		
		return "boardRead";
	}
	
	
	// updateBoard
	
	// deleteBoard
	
	public String deleteBoard(@RequestParam("B_uid")String b_uid, HttpSession session)
	{
		BoardVO vo = new BoardVO();
		vo.setB_uid(b_uid);
		
		bSerivce.deleteBoard(vo);
		

		
		return "redirect:boardList";
	}

}
