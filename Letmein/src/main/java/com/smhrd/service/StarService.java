package com.smhrd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.smhrd.db.MemberMapper;
import com.smhrd.db.StarMapper;
import com.smhrd.model.MemberDTO;
@Service
public class StarService {
	
	@Autowired
	private StarMapper starMapper;


	
}
