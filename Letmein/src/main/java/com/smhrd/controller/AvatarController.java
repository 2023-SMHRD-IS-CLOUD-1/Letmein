package com.smhrd.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.smhrd.model.AvatarDTO;
import com.smhrd.service.AvatarService;



@RestController
@CrossOrigin(origins = "*")
public class AvatarController {
	@Resource
	private AvatarService avatarService;
	
	@PostMapping("/avatar")
	private List<AvatarDTO> avatar(@RequestBody AvatarDTO dto){
		List<AvatarDTO> list =  avatarService.avatar(dto);
		return  list;
	}
}
