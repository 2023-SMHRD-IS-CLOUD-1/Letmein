package com.smhrd.db;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.smhrd.model.MemberDTO;

@Mapper
public interface MemberMapper {

	public void MemberJoin(MemberDTO dto);

	public List<MemberDTO> MemberLogin(MemberDTO dto);

	public int MemberChk(MemberDTO dto);
}
