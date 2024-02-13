package com.smhrd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smhrd.db.AvatarMapper;
@Service
public class AvatarService {
	
	@Autowired
	private AvatarMapper avatarMapper;


	
}
