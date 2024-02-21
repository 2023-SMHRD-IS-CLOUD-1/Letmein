package com.smhrd.db;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.smhrd.model.CodiDTO;
import com.smhrd.model.MemberDTO;

@Mapper
public interface CodiMapper {

	List<CodiDTO> codiTop(CodiDTO dto);


}
