package com.smhrd.db;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.smhrd.model.HelpDTO;

@Mapper
public interface HelpMapper {
	//문의글 전체 조회
	List<HelpDTO> customerAll(HelpDTO dto);
	// 문의글 번호 기준 조회
	List<HelpDTO> customerNum(HelpDTO dto);
	// 문의글 작성
	void customerPost(HelpDTO dto);

}
