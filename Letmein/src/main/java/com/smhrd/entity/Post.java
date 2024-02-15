package com.smhrd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tb_post")
@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
public class Post {
	@Id
	@Column(name="post_num", columnDefinition = "INT")
	private Integer postNum;
	
	@Column(name = "post_imgsrc" , columnDefinition = "VARCHAR2(50)")
	private String postImgsrc;
	
	@Column(name = "post_title", columnDefinition = "VARCHAR(20)")
	private String postTitle;
	
	@Column(name="user_id",columnDefinition = "VARCHAR2(20)")
	private String userId;
	
	@Column(name="post_content",columnDefinition = "VARCHAR(1000)")
	private String postContent;
	
	@Column(name="post_acc",columnDefinition = "VARCHAR2(1000)")
	private String postAcc;
	
	@Column(name="post_top",columnDefinition = "VARCHAR2(1000)")
	private String postTop;
	
	@Column(name="post_pants",columnDefinition = "VARCHAR2(1000)")
	private String postPants;
	
	@Column(name="post_shoe",columnDefinition = "VARCHAR2(1000)")
	private String postShoe;
}
