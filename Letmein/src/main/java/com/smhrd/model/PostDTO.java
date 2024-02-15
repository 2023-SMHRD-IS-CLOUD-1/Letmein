package com.smhrd.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDTO {
	 // 글번호 
	private Integer post_num;
	
    private String post_title;

    // 글내용 
    private String post_content;

    // 작성자 
    private String user_id;

    // 작성일자 
    //private Date post_at;

    // 수정일자 
    //private Date updated_at;

    // 첨부사진 
    private String post_imgsrc;
    // 액세서리 
    private String post_acc;

    // 상의 
    private String post_top;

    // 하의 
    private String post_pants;

    // 신발 
    private String post_shoe;
    
   
}
