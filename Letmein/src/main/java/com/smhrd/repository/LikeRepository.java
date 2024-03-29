package com.smhrd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smhrd.entity.Like;

@Repository
public interface LikeRepository extends JpaRepository<Like, Integer> {
	
}
