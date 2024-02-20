package com.smhrd.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.smhrd.model.HelpDTO;
import com.smhrd.service.HelpService;

@RestController
public class HelpController {
	@Resource
	HelpService helpService;
	
	//문의글 전체 조회
	@PostMapping("/customerAll")
	private List<HelpDTO> customerAll(@RequestBody HelpDTO dto){
		System.out.println(dto);
		List<HelpDTO> list = helpService.customerAll(dto);
		return list;
	}
	
	// 문의글 번호 기준 조회
	@PostMapping("/customerNum")
	private List<HelpDTO> customerNum(@RequestBody HelpDTO dto){
		List<HelpDTO> list = helpService.customerNum(dto);
		return list;
	}
	// 문의글 작성
	@PostMapping("/customerPost")
	private void customerPost(@RequestBody HelpDTO dto){
		 helpService.customerPost(dto);
	}
	
	@GetMapping("/helpNo")
	private List<HelpDTO> helpNo(){
		List<HelpDTO> list = helpService.helpNo();
		return list;
	}
	
	// 문의글 답변 작성
	@PostMapping("/helpAnswer")
	private void helpAnswer(@RequestBody HelpDTO dto){
		helpService.helpAnswer(dto);
	}
}
