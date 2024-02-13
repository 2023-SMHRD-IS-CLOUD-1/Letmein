package com.smhrd.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.smhrd.model.PostDTO;
import com.smhrd.service.PostService;



@RestController
public class PostController {
	@Resource
	private PostService postService;
	
	@PostMapping("/post")
	public void postUpdate(@RequestBody PostDTO dto) {
		postService.postUpdate(dto);
	}
	@PostMapping("/selectAll")
	public List<PostDTO> selectAll() {
		List<PostDTO> all = postService.selectAll();
		return all;
	}
	
	@PostMapping("/searchTitle")
	public List<PostDTO> searchTitle(@RequestBody PostDTO dto){
		List<PostDTO> all = postService.searchTitle(dto);
		return all;
	}
	@PostMapping("/searchWriter")
	public List<PostDTO> searchWriter(@RequestBody PostDTO dto){
		List<PostDTO> all = postService.searchWriter(dto);
		return all;
	}
}
