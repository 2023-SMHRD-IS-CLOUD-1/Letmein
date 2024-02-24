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
import com.smhrd.model.LikeDTO;
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
	public List<Post> searchTitle(String postTitle){
		List<Post> postList = postRepository.findByPostTitleContaining(postTitle);
		return postList;
	}
	
	@Transactional
	public List<Post> searchWriter(String userId){
		List<Post> postList = postRepository.findByUserIdContaining(userId);
		return postList;
	}

	public void postDelete(PostDTO dto) {
		postMapper.postDelete(dto);
	}

	public void postModify(PostDTO dto) {
		postMapper.postModify(dto);
		
	}

	public List<PostDTO> postNumFind(PostDTO dto) {
		List<PostDTO> result = postMapper.postNumFind(dto);
		return result;
	}
	
	public List<PostDTO> searchMyPost(PostDTO dto) {
	      List<PostDTO> mypost = postMapper.searchMyPost(dto);
	      return mypost;
	   }

	public List<PostDTO> sortLike() {
		List<PostDTO> sortLike = postMapper.sortLike();
		return sortLike;
	}

	public List<PostDTO> sortWriter(PostDTO dto) {
		List<PostDTO> writer = postMapper.sortWriter(dto);
		return writer;
	}

	public List<PostDTO> sortTitle(PostDTO dto) {
		List<PostDTO> title = postMapper.sortTitle(dto);
		return title;
	}

	public List<PostDTO> myLike(String user_id) {
		List<PostDTO> like = postMapper.myLike(user_id);
		return like;
	}


	
}
