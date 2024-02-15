package com.smhrd.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.smhrd.db.PostMapper;
import com.smhrd.entity.Post;
import com.smhrd.model.PostDTO;
import com.smhrd.repository.PostRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class PostService {
	
	@Autowired
	private PostMapper postMapper;
	@Autowired
	private PostRepository postRepository;
	public void postUpdate(PostDTO dto) {
		postMapper.postUpdate(dto);
	}

	public List<PostDTO> searchTitle(PostDTO dto) {
		List<PostDTO> all = postMapper.searchTitle(dto);
		return all;
	}


	public List<PostDTO> searchWriter(PostDTO dto) {
		List<PostDTO> all = postMapper.searchWriter(dto);
		return all;
	}

	public List<Post> getPageList(Pageable pageable){
		return postRepository.findAllByOrderByPostNumDesc(pageable);
	}
	
	
	@Transactional
	public Page<Post> searchTitle(String postTitle, Pageable pageable){
		Page<Post> postList = postRepository.findByPostTitleContaining(postTitle, pageable);
		return postList;
	}
	
	@Transactional
	public Page<Post> searchWriter(String userId, Pageable pageable){
		Page<Post> postList = postRepository.findByUserIdContaining(userId, pageable);
		return postList;
	}

	public void postDelete(PostDTO dto) {
		postMapper.postDelete(dto);
	}

	public void postModify(PostDTO dto) {
		postMapper.postModify(dto);
		
	}
	


	
}
