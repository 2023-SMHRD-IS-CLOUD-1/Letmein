package com.smhrd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smhrd.db.HelpMapper;
import com.smhrd.model.HelpDTO;

@Service
public class HelpService {

	@Autowired
	private HelpMapper helpMapper;
	
	//문의글 전체 조회
	public List<HelpDTO> customerAll(HelpDTO dto) {
		List<HelpDTO> list = helpMapper.customerAll(dto);
		return list;
	}
	// 문의글 번호 기준 조회
	public List<HelpDTO> customerNum(HelpDTO dto) {
		List<HelpDTO> list = helpMapper.customerNum(dto);
		return list;
	}
	// 문의글 작성
	public void customerPost(HelpDTO dto) {
		helpMapper.customerPost(dto);
	}
	
	// 관리자 페이지 - 답변 안된거
	public List<HelpDTO> helpNo() {
		List<HelpDTO> list = helpMapper.helpNo();
		return list;
	}
	public void helpAnswer(HelpDTO dto) {
		helpMapper.helpAnswer(dto);
	}
	
}
