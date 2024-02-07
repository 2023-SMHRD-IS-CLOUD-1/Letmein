package com.smhrd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.smhrd.db.MemberMapper;
import com.smhrd.db.PostMapper;
import com.smhrd.model.MemberDTO;
import com.smhrd.model.PostDTO;
@Service
public class PostService {
	
	@Autowired
	private PostMapper postMapper;

	public void postUpdate(PostDTO dto) {
		postMapper.postUpdate(dto);
	}


	public List<PostDTO> selectAll() {
		List<PostDTO> all =postMapper.selectAll();
		return all;
	}


	
}
