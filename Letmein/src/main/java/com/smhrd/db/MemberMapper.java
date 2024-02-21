package com.smhrd.db;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.smhrd.model.MemberDTO;

@Mapper
public interface MemberMapper {

	public void MemberJoin(MemberDTO dto);

	public List<MemberDTO> MemberLogin(MemberDTO dto);

	public int MemberChk(MemberDTO dto);

	public List<MemberDTO> nickFind(MemberDTO dto);
	
	public int profileEditor(MemberDTO dto);

	public List<MemberDTO> allUser();

	public List<MemberDTO> UserSearch(MemberDTO dto);

	public void AdminDelete(MemberDTO dto);

	public List<MemberDTO> FindEmail(MemberDTO dto);
}
