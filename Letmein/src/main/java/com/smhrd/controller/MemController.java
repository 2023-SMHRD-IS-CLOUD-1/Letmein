package com.smhrd.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.smhrd.model.MemberDTO;
import com.smhrd.service.MemberService;


// @Controller : 동기
// @Restcontroller : 비동기 통신

@RestController
public class MemController {
	@Resource
	private MemberService memberService;
	// React <---> Spring : 비동기 요청, 응답을 이용해서 구현
	// Spring Boot 역할 --> 요청을 받았을 때, 특정 데이터를 응답하는 형식
	// Rest API Server : 요청이 들어왔을 때, 알맞은 데이터를 응답하는 서버
	
	// info라는 요청이 들어왔을 때, 학생목록을 응답하는 기능
	
	// test 라는 요청이 들어왔을 때.
	// "Hello world"를 응답하려면
	@PostMapping("/join")
	public void join(@RequestBody MemberDTO dto) {
		memberService.MemberJoin(dto);
		System.out.println("실행");
		System.out.println(dto);

	}
	@PostMapping("/login")
	public List<MemberDTO> login(@RequestBody MemberDTO dto) {
		List<MemberDTO> loginList = memberService.MemberLogin(dto);
		System.out.println(loginList);
		return loginList;
	}
	@PostMapping("/loginChk")
	public int loginChk(@RequestBody MemberDTO dto) {
		int loginChk = memberService.MemberChk(dto);
		return loginChk;
	}
	
	@PostMapping("/nickFind")
	public List<MemberDTO> nickFind(@RequestBody MemberDTO dto){
		List<MemberDTO> nickList = memberService.nickFind(dto);
		return nickList;
	}
}
