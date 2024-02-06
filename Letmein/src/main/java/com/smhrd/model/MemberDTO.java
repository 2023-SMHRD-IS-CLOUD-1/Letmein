package com.smhrd.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor 
public class MemberDTO {
	private String user_id;
	private String user_pw;
	private String user_name;
	private String user_email;
	private String user_nick;
	private char user_gender;
	private int user_age;
	//private Date user_date;
	private String user_type;
	private String user_role;
}
