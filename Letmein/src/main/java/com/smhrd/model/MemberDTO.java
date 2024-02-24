package com.smhrd.model;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

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
	
	 public void incode(String user_pw) {
	        this.user_pw = encryptPassword(user_pw);
	    }
	    
	 private String encryptPassword(String user_pw) {
	  // BCryptPasswordEncoder를 사용하여 비밀번호를 암호화
	  PasswordEncoder encoder = new BCryptPasswordEncoder();
	     return encoder.encode(user_pw);
	    }
}
