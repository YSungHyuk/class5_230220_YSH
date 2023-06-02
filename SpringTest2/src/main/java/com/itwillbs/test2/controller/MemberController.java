package com.itwillbs.test2.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {

	@RequestMapping(value = "MemberLoginForm", method = RequestMethod.GET)
//	@GetMapping("MemberLoginForm")
	public String loginForm() {
		return "test2/member_login_form";
	}
	
//	@RequestMapping(value = "MemberLoginPro", method = RequestMethod.POST)
//	public String loginPro(String id, String passwd) {
//		System.out.println("id :"+id);
//		System.out.println("pw :"+passwd);
//		return "redirect:/MemberList";
//	}
	
	@RequestMapping(value = "MemberLoginPro", method = RequestMethod.POST)
	public String loginPro(@RequestParam Map<String, String> map) {
		System.out.println("map id : "+map.get("id"));
		System.out.println("map pw : "+map.get("passwd"));
		return "redirect:/MemberList";
	}
	
	@RequestMapping(value = "MemberList", method = RequestMethod.GET)
	public String memberListView() {
		System.out.println("회원 목록 출력");
		return "";
	}
	
	
	
}
