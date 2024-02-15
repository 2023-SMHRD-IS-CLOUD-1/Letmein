package com.smhrd.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.smhrd.entity.Post;
import com.smhrd.model.LikeDTO;
import com.smhrd.model.MemberDTO;
import com.smhrd.model.PostDTO;
import com.smhrd.service.LikeService;
import com.smhrd.service.MemberService;
import com.smhrd.service.StarService;



@RestController
public class LikeController {
	@Resource
	private LikeService likeService;
	
	// 좋아요
	@PostMapping("/like")
	private void likePlus(@RequestBody LikeDTO dto) {
	   likeService.likePlus(dto);
	}
	
	// 좋아요 취소
	@PostMapping("/unlike")
	private void unLike(@RequestBody LikeDTO dto) {
		likeService.unLike(dto);
	}
	
	// 좋아요 수
	@PostMapping("/countLike")
	private int countLike(@RequestBody LikeDTO dto) {
		int count = likeService.countLike(dto);
		return count;
	}
	
	// 사용자가 누른 좋아요 글 번호 조회
	@PostMapping("/countUser")
	private List<LikeDTO> countUser(@RequestBody LikeDTO dto) {
		List<LikeDTO> count = likeService.countUser(dto);
		return count;
	}
	

}
