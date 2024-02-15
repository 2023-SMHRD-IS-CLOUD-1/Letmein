package com.smhrd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smhrd.db.AvatarMapper;
import com.smhrd.db.LikeMapper;
import com.smhrd.db.MemberMapper;
import com.smhrd.db.PostMapper;
import com.smhrd.entity.Post;
import com.smhrd.model.LikeDTO;
import com.smhrd.model.MemberDTO;
import com.smhrd.model.PostDTO;
@Service
public class LikeService {
	
	@Autowired
	private LikeMapper likeMapper;

	public void likePlus(LikeDTO dto) {
		likeMapper.likePlus(dto);
		
	}


	public void unLike(LikeDTO dto) {
		likeMapper.unLike(dto);
	}


	public int countLike(LikeDTO dto) {
		int count = likeMapper.countLike(dto);
		return count;
	}


	public List<LikeDTO> countUser(LikeDTO dto) {
		List<LikeDTO> count = likeMapper.countUser(dto);
		return count;
	}




	
}
