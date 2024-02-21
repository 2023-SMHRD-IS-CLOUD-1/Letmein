package com.smhrd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.smhrd.db.MemberMapper;
import com.smhrd.model.MemberDTO;
@Service
public class MemberService {
	
	@Autowired
	private MemberMapper memberMapper;

	public void MemberJoin(MemberDTO dto) {
		memberMapper.MemberJoin(dto);
	}

	public List<MemberDTO> MemberLogin(MemberDTO dto) {
		List<MemberDTO> member =  memberMapper.MemberLogin(dto);
		return member;
	}
	
	public int MemberChk(MemberDTO dto) {
		int chk = memberMapper.MemberChk(dto);
		return chk;
	}

	public List<MemberDTO> nickFind(MemberDTO dto) {
		List<MemberDTO> member = memberMapper.nickFind(dto);
		return member;
	}

	public int profileEditor(MemberDTO dto) {
	      int profileEditor = memberMapper.profileEditor(dto);
	      return profileEditor;
	   }

	public List<MemberDTO> allUser() {
		List<MemberDTO> member = memberMapper.allUser();
		return member;
	}

	public List<MemberDTO> UserSearch(MemberDTO dto) {
		List<MemberDTO> member = memberMapper.UserSearch(dto);
		return member;
	}

	public void AdminDelete(MemberDTO dto) {
		memberMapper.AdminDelete(dto);
	}

	public List<MemberDTO> FindEmail(MemberDTO dto) {
		List<MemberDTO> list = memberMapper.FindEmail(dto);
		return list;
	}
}
