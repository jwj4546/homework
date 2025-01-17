package com.homework.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.homework.member.model.service.MemberService;
import com.homework.member.model.vo.Member;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MemberController {

	private final MemberService memberService;
	
	
	@PostMapping("login.do")
	public ModelAndView login(Member member,
										ModelAndView mv,
										HttpSession session) {
		
		Member loginUser = memberService.login(member);
		
		if(loginUser != null) {
			session.setAttribute("loginUser", loginUser);
			mv.setViewName("redirect:/");
		} else {
			mv.addObject("errorMsg", "로그인 실패!");
			mv.setViewName("include/errorPage");
		}
		return mv;
	}
	
}