package com.itwillbs.test2.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {
	
	@GetMapping("BoardWriteForm")
	public String writeForm() {
		return "test2/board_write_form";
	}
	
//	@PostMapping("BoardWritePro")
//	public String writePro(String board_name, String board_pass, String board_subject, String board_content, String board_file) {
//		System.out.println(board_name);
//		System.out.println(board_pass);
//		System.out.println(board_subject);
//		System.out.println(board_content);
//		System.out.println(board_file);
//		return "redirect:/BoardList";
//	}
	
	@PostMapping("BoardWritePro")
	public String writePro(@RequestParam Map<String, String> map) {
		System.out.println(map.toString());
		System.out.println(map.get("board_name"));
		System.out.println(map.get("board_pass"));
		System.out.println(map.get("board_subject"));
		System.out.println(map.get("board_content"));
		System.out.println(map.get("board_file"));
		return "redirect:/BoardList";
	}
	
	@GetMapping("BoardList")
	public String boardList() {
		System.out.println("글 목록 출력");
		return "test2/board_list";
	}
}
