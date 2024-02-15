package com.smhrd.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.smhrd.entity.Post;
import com.smhrd.model.PostDTO;
import com.smhrd.model.ResponseDTO;
import com.smhrd.repository.PostRepository;
import com.smhrd.service.PostService;

import net.bytebuddy.asm.Advice.OffsetMapping.Sort;



@RestController
public class PostController {
	@Resource
	private PostService postService;
	// 글작성
	@PostMapping("/post")
	public void postUpdate(@RequestBody PostDTO dto) {
		postService.postUpdate(dto);
	}
	// 게시글 조회
	@GetMapping("/selectAll")
	public List<Post> getTestDomainList(Pageable pageable){
		return postService.getPageList(pageable);
	}
	// 제목기준 검색
	@GetMapping("/searchTitle")
	public List<Post> searchTitle(String postTitle,Pageable pageable){
		Page<Post> searchPage = postService.searchTitle(postTitle, pageable);
		List<Post> searchList = searchPage.getContent();
		System.out.println(searchList);
		return searchList;
	}
	// 작성자 기준 검색
	@GetMapping("/searchWriter")
	public List<Post> searchWriter(String userId, Pageable pageable){
		Page<Post> searchPage = postService.searchWriter(userId, pageable);
		List<Post> searchList = searchPage.getContent();
		return searchList;
	}
	// 게시글 삭제
	@PostMapping("/postDelete")
	public void postDelete(@RequestBody PostDTO dto) {
		postService.postDelete(dto);
	}
	// 게시글 수정
	@PostMapping("/postModify")
	public void postModify (@RequestBody PostDTO dto) {
		postService.postModify(dto);
	}
	// 마이페이지 내가 게시한 게시물
	@PostMapping("/mypost")
	public List<PostDTO> myPost(@RequestBody PostDTO dto){
		List<PostDTO> mypost = postService.searchMyPost(dto);
		return mypost;
	}
		
}
