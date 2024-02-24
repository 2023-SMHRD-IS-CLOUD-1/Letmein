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
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.smhrd.entity.Post;
import com.smhrd.model.LikeDTO;
import com.smhrd.model.PostDTO;
import com.smhrd.model.ResponseDTO;
import com.smhrd.repository.PostRepository;
import com.smhrd.service.PostService;

import net.bytebuddy.asm.Advice.OffsetMapping.Sort;



@RestController
@CrossOrigin(origins = "*")
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
		List<Post> post = postService.getPageList(pageable);
		return post;
	}
	// 제목기준 검색
	@GetMapping("/searchTitle")
	public List<Post> searchTitle(String postTitle){
		List<Post> searchList = postService.searchTitle(postTitle);
		return searchList;
	}
	// 작성자 기준 검색
	@GetMapping("/searchWriter")
	public List<Post> searchWriter(String userId){
		List<Post> searchPage = postService.searchWriter(userId);
		return searchPage;
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
	// 게시글 번호 기준 조회
	@PostMapping("/postNumFind")
	public List<PostDTO> postNumFind (@RequestBody PostDTO dto) {
		List<PostDTO> result = postService.postNumFind(dto);
		return result;
	}
	// 마이페이지 내가 게시한 게시물
	   @PostMapping("/mypost")
	   public List<PostDTO> myPost(@RequestBody PostDTO dto){
	      List<PostDTO> mypost = postService.searchMyPost(dto);
	      return mypost;
	   }
	   
	 // 인기순 정렬
	   @GetMapping ("/sortLike")
	   public List<PostDTO> sortLike(){
		   List<PostDTO> like = postService.sortLike();
		   return like;
	   }
	   
	   // 인기순 정렬 후 작성자 검색
	   @PostMapping("/sortWriter")
	   public List<PostDTO> sortWriter(@RequestBody PostDTO dto) {
		   System.out.println(dto);
		   List<PostDTO> writer = postService.sortWriter(dto);
		   System.out.println(writer);
		   return writer;
	   }
	   
	   // 인기순 정렬 후 제목 검색
	   @PostMapping("/sortTitle")
	   public List<PostDTO> sortTitle(@RequestBody PostDTO dto){
		   List<PostDTO> title = postService.sortTitle(dto);
		   return title;
	   }
	   
	   // 좋아요 누른 글 조회
	   @GetMapping("/myLike")
	   public List<PostDTO> myLike(@RequestParam String user_id){
		   System.out.println(user_id);
		   List<PostDTO> like = postService.myLike(user_id);
		   return like;
	   }
	 
		
}
