package com.smhrd.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HelpDTO {
	private int help_num;
	private String help_title;
	private String help_content;
	private String help_answer_content;
	private String help_answer;
	private String user_id;
	private Date post_at;
}
