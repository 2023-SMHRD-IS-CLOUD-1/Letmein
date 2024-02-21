package com.smhrd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smhrd.db.AvatarMapper;
import com.smhrd.model.AvatarDTO;
@Service
public class AvatarService {
	
	@Autowired
	private AvatarMapper avatarMapper;

	public List<AvatarDTO> avatar(AvatarDTO dto) {
		List<AvatarDTO> list = avatarMapper.avatar(dto);
		return list;
	}


	
}
