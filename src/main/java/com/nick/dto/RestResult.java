package com.nick.dto;


import com.nick.enums.ErrorCode;
import com.nick.enums.ResultCode;

public class RestResult<T> extends BaseDTO {

	//状态码
	private ResultCode code = ResultCode.SUCCESS;
	//提示信息，通常只有出错时才会有此字段，从ErrorCode中获取
	private ErrorCode msg;
	//返回数据
	private T data;

	public ResultCode getCode() {
		return code;
	}

	public RestResult<T> setCode(ResultCode code) {
		this.code = code;
		return this;
	}

	public ErrorCode getMsg() {
		return msg;
	}

	public RestResult<T> setMsg(ErrorCode msg) {
		this.msg = msg;
		return this;
	}

	public T getData() {
		return data;
	}

	public RestResult<T> setData(T data) {
		this.data = data;
		return this;
	}

	public static <T> RestResult<T> okResponse() {
		RestResult<T> restResult = new RestResult<T>();
		return restResult;
	}

	public static <T> RestResult<T> okResponse(T data) {
		RestResult<T> restResult = new RestResult<T>();
		restResult.data = data;
		return restResult;
	}

	public static <T> RestResult<T> errorResponse() {
		RestResult<T> restResult = new RestResult<T>().setCode(ResultCode.ERROR);
		return restResult;
	}

	public static <T> RestResult<T> errorResponse(ErrorCode message) {
		RestResult<T> restResult = new RestResult<T>().setCode(ResultCode.ERROR).setMsg(message);
		return restResult;
	}

	public static <T> RestResult<T> errorResponse(ErrorCode message, T data) {
		RestResult<T> restResult = new RestResult<T>().setCode(ResultCode.ERROR).setMsg(message).setData(data);
		return restResult;
	}

	//构造方法根据实际需求再增加

}
