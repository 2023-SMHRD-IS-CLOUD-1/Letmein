package com.smhrd.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.smhrd.model.CodiDTO;
import com.smhrd.model.MemberDTO;
import com.smhrd.service.CodiService;
import com.smhrd.service.MemberService;
import com.smhrd.service.StarService;



@RestController
@CrossOrigin(origins = "*")
public class CodiController {
	@Resource
	private CodiService codiService;
	
	@PostMapping("/codiTop")
	private List<CodiDTO> codiTop(@RequestBody CodiDTO dto){
	 List<CodiDTO> list = codiService.codiTop(dto);
	 return list;
	}
	
	
}
