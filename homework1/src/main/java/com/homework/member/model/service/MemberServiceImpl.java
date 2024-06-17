package com.homework.member.model.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.homework.member.model.repository.MemberRepository;
import com.homework.member.model.vo.Member;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

	private final SqlSessionTemplate sqlSession;
	private final MemberRepository memberRepository;
	
	@Override
	public Member login(Member member) {
		return memberRepository.login(sqlSession, member);
	}

	@Override
	public int insert(Member member) {
		return 0;
	}

	@Override
	public int update(Member member) {
		return 0;
	}

	@Override
	public int delete(String userId) {
		return 0;
	}
}
