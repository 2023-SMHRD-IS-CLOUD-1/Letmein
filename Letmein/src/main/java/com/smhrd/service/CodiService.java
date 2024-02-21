package com.smhrd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smhrd.db.CodiMapper;
import com.smhrd.db.MemberMapper;
import com.smhrd.db.PostMapper;
import com.smhrd.model.CodiDTO;
import com.smhrd.model.MemberDTO;
@Service
public class CodiService {
	
	@Autowired
	private CodiMapper codiMapper;

	public List<CodiDTO> codiTop(CodiDTO dto) {
		List<CodiDTO> list = codiMapper.codiTop(dto);
		return list;
	}



	
}
