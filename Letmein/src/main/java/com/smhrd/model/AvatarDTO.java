package com.smhrd.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AvatarDTO {

	private int avatar_num;
	private String avatar_gender;
	private String avatar_type;
	private String avatar_imgsrc;
}
