package com.smhrd.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RestController;

import com.smhrd.service.AvatarService;



@RestController
public class AvatarController {
	@Resource
	private AvatarService avatarService;
}
