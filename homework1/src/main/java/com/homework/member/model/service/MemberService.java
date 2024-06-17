package com.homework.member.model.service;

import com.homework.member.model.vo.Member;

public interface MemberService {

	// 로그인(SELECT)
	Member login(Member member);
	
	// 회원가입(INSERT)
	int insert(Member member);
	
	// 회원 정보 수정(UPDATE)
	int update(Member member);
	
	// 회원 탈퇴(DELETE, UPDATE)
	int delete(String userId);
	
	// 아이디 중복체크(SELECT)
	
	// 메일인증
}

