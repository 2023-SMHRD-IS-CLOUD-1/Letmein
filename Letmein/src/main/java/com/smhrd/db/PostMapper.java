package com.smhrd.db;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.smhrd.model.PostDTO;

@Mapper
public interface PostMapper {

	public void postUpdate(PostDTO dto);

	public List<PostDTO> searchTitle(PostDTO dto);

	public List<PostDTO> searchWriter(PostDTO dto);

	public List<PostDTO> selectAll();

	public void postDelete(PostDTO dto);

	public void postModify(PostDTO dto);
	
	public List<PostDTO> searchMyPost(PostDTO dto);

	public List<PostDTO> postNumFind(PostDTO dto);
	
}
