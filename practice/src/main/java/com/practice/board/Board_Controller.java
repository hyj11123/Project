package com.practice.board;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.practice.contentmain.chickens.bhc.BhcVO;

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
	public String input(@RequestParam("uid")String uid
						,Model model) {
		
		System.out.println(uid);
		List<BoardVO> list = bSerivce.getBoardById(uid);
	
		
		
		model.addAttribute("bList", list);
		
		
		return "boardRead";
	}
	
	@RequestMapping("input2")
	public String input2(@RequestParam("uid")String uid
						,Model model)
	{
		System.out.println(uid);
		List<BoardVO> list = bSerivce.getBoardById(uid);
		
		model.addAttribute("bList",list);
		
		return "boardUpdate";
	}
	
	
	
	// updateBoard
	@RequestMapping("clickUpdate")
	public String clickUpdate(@RequestParam("uid")String b_uid
							  ,@RequestParam("title")String b_title
							  ,@RequestParam("content")String b_content) 
	{
		BoardVO vo = new BoardVO();
		
		System.out.println("controller");
		System.out.println("controller");
		System.out.println("controller");
		System.out.println("controller");
		System.out.println("controller");
		
		vo.setB_uid(b_uid);
		vo.setB_title(b_title);
		vo.setB_content(b_content);
		
		bSerivce.updateBoard(vo);
		
		return "redirect:boardList";
	}
	// deleteBoard
	
	@RequestMapping("deleteBoard")
	public String deleteBoard(@RequestParam("uid")String b_uid)
	{
		BoardVO vo = new BoardVO();
		
		System.out.println("controller");
		System.out.println("controller");
		System.out.println("controller");
		System.out.println("controller");
		System.out.println("controller");
		
		vo.setB_uid(b_uid);
		
		bSerivce.deleteBoard(vo);
		

		
		return "redirect:boardList";
	}

}
