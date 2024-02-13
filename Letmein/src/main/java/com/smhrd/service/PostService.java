package com.smhrd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.smhrd.db.PostMapper;
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


	public List<PostDTO> searchTitle(PostDTO dto) {
		List<PostDTO> all = postMapper.searchTitle(dto);
		return all;
	}


	public List<PostDTO> searchWriter(PostDTO dto) {
		List<PostDTO> all = postMapper.searchWriter(dto);
		return all;
	}


	
}
