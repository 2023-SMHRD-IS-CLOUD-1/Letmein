package com.smhrd.db;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.smhrd.model.MemberDTO;
import com.smhrd.model.PostDTO;

@Mapper
public interface PostMapper {

	public void postUpdate(PostDTO dto);

	public List<PostDTO> selectAll();

}
