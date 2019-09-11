package com.itheima.shop.domain;

//网站基础返回信息
public class BaseResult {

	private String statu;
	private String message;
	private boolean success;

	public BaseResult() {
		super();
	}

	public BaseResult(String message, boolean success) {
		super(); 
		this.message = message;
		this.success = success;
	}

	public String getStatu() {
		return statu;
	}

	public void setStatu(String statu) {
		this.statu = statu;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

}
