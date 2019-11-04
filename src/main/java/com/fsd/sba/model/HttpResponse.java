package com.fsd.sba.model;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Response Model")
@JsonInclude(Include.NON_NULL)
public class HttpResponse {
	public static final int STATUS_OK = 200;
	public static final int STATUS_BAD_REQUEST = 400;
	public static final int STATUS_INTERNAL_ERROR = 500;

	@ApiModelProperty(notes = "Response Code", example = "200", required = true, dataType = "java.lang.Integer")
	@NotNull
	private Integer code;

	@ApiModelProperty(notes = "Response Message", example = "Ok", required = true, dataType = "java.lang.String")
	@NotNull
	private String message;

	@ApiModelProperty(notes = "Response Data", required = true, dataType = "java.lang.Object")
	private Object data;
	
	public HttpResponse(Integer code) {
		this(code, null, null);
	}
	
	public HttpResponse(Integer code, String message) {
		this(code, message, null);
	}
	
	public HttpResponse(Integer code, Object data) {
		this(code, null, data);
	}
	
	public HttpResponse(Integer code, String message, Object data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}
	
	
	
	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}