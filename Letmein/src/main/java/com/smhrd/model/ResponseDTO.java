package com.smhrd.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ResponseDTO {
	private String result;
	private Object data;
}
