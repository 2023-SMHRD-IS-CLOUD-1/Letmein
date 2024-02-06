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

	
}
