package com.handy.aws.functions;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

public class HttpProductResponse {
	
	private String body;
	private String statusCode;
	private Map<String,String> headers= new HashMap<>();
	
	public HttpProductResponse(Product product) {
		this();
		Gson gson=new Gson();	
		this.body = gson.toJson(product);
	
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public Map<String, String> getHeaders() {
		return headers;
	}

	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}

	public HttpProductResponse() {
		super();
		this.headers.put("Content-Type","application/json");
		// TODO Auto-generated constructor stub
	}

}
