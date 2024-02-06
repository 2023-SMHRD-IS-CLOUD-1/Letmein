package com.smhrd.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StarDTO {
	// 연예인 이름 
    private String star_name;

    // 체형 
    private String star_type;

    // 옷주소 
    private String star_imgsrc;

    // 옷 정보 
    private String star_info;

    // 성별 
    private String star_gender;

    // 연예인 코디 번호 
    private Integer star_num;

    // 액세서리 
    private String star_acc;

    // 상의 
    private String star_top;

    // 하의 
    private String star_pants;

    // 신발 
    private String star_shoe;
}
