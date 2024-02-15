package com.smhrd.db;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.smhrd.model.LikeDTO;
import com.smhrd.model.MemberDTO;
import com.smhrd.model.PostDTO;

@Mapper
public interface LikeMapper {

	void likePlus(LikeDTO dto);

	void unLike(LikeDTO dto);

	int countLike(LikeDTO dto);

	List<LikeDTO> countUser(LikeDTO dto);

}
