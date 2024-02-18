package com.smhrd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tb_like")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Like {
	@Id
	@Column(name="post_like_num", columnDefinition = "INT")
	private Integer post_like_num;
	
	@Column(name="post_num", columnDefinition = "INT")
	private Integer post_num;
	
	@Column(name="user_id", columnDefinition = "VARCHAR2(20)")
	private String userId;
	
	@Column(name="post_like",columnDefinition = "INT")
	private String postLike;
}
