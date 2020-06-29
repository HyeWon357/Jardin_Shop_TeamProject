package com.javalec.ex.service;

import java.util.List;

import com.javalec.ex.dto.MemberDTO;

public interface MemberService {

	//회원리스트
	public List<MemberDTO> memberList() throws Exception;
	
	//회원가입
	public void signUp(MemberDTO dto) throws Exception;

	//로그인
	public MemberDTO loginCheck(MemberDTO dto) throws Exception;
	
	//회원정보수정
	public void memberUpdate(MemberDTO dto) throws Exception;
	
	//아이디중복체크
	public int idChk(MemberDTO dto) throws Exception;
	
}