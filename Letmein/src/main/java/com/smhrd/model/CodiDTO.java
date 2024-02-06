package com.smhrd.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CodiDTO {
	private int codi_num;
	private String codi_type;
	private char codi_gender;
	private String codi_imgsrc;
	private String codi_info;
	private String codi_category;
	private String codi_shopping;
}
