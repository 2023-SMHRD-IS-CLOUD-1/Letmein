package com.smhrd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smhrd.db.AvatarMapper;
import com.smhrd.db.LikeMapper;
import com.smhrd.db.MemberMapper;
import com.smhrd.db.PostMapper;
import com.smhrd.model.MemberDTO;
@Service
public class LikeService {
	
	@Autowired
	private LikeMapper likeMapper;


	
}
