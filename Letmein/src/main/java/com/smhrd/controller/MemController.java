package com.smhrd.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
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

	@PostMapping("/join")
	public void join(@RequestBody MemberDTO dto) {
		memberService.MemberJoin(dto);
		System.out.println("실행");
		System.out.println(dto);

	}
	
	@PostMapping("/login")
	public List<MemberDTO> login(@RequestBody MemberDTO dto, HttpSession session) {
		List<MemberDTO> loginList = memberService.MemberLogin(dto);
		if (loginList != null && !loginList.isEmpty()) {
			session.setAttribute("loggedInUser", loginList.get(0));
			return loginList;
		}
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
	
	@PostMapping("/logout")
	public boolean logout(HttpSession session) {
		session.invalidate();
		return true;
	}
	@PostMapping("/profileEditor")
	   public int profileEditor(@RequestBody MemberDTO dto) {
	      int profileEditor = memberService.profileEditor(dto);
	      return profileEditor;
	   }
	
	@GetMapping("/allUser")
	public List<MemberDTO> allUser() {
		List<MemberDTO> member = memberService.allUser();
		return member;
	}
	
	@PostMapping("/UserSearch")
	public List<MemberDTO> UserSearch(@RequestBody MemberDTO dto) {
		List<MemberDTO> user = memberService.UserSearch(dto);
		return user;
	}
	
	// 관리자 -> 회원 탈퇴
	@PostMapping("/AdminDelete")
	public void AdminDelete(@RequestBody MemberDTO dto) {
		memberService.AdminDelete(dto);
	}
}
