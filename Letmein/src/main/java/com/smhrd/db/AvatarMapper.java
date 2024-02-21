package com.smhrd.db;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.smhrd.model.AvatarDTO;


@Mapper
public interface AvatarMapper {

	List<AvatarDTO> avatar(AvatarDTO dto);

}
