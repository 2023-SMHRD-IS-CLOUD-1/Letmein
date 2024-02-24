package com.smhrd.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.smhrd.entity.Post;
import com.smhrd.model.PostDTO;
@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
      public List<Post> findAllByOrderByPostNumDesc(Pageable pageable);
      public List<Post> findByPostTitleContaining(String postTitle);
      public List<Post> findByUserIdContaining(String UserId);
      public Page<Post> findByUserId(String userId, Pageable pageable);
      

}
