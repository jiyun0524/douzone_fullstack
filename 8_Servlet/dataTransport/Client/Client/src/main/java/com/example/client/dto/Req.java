package com.example.client.dto;

public class Req<T> {

	private Header header;
	private T httpBody;
	
	
	public static class Header {
		private String responseCode;

		public String getResponseCode() {
			return responseCode;
		}

		public void setResponseCode(String responseCode) {
			this.responseCode = responseCode;
		}

		@Override
		public String toString() {
			return "Header [responseCode=" + responseCode + "]";
		}
	} // inner class Header


	public Header getHeader() {
		return header;
	}


	public void setHeader(Header header) {
		this.header = header;
	}


	public T getHttpBody() {
		return httpBody;
	}


	public void setHttpBody(T httpBody) {
		this.httpBody = httpBody;
	}


	@Override
	public String toString() {
		return "Req [header=" + header + ", httpBody=" + httpBody + "]";
	}
}

// 서버측에서 내려지는 값이 수시로 변경되는 경우가 있다
//{
//	"header": {
//		"response_code: "OK"
//	},
//	"body" : {
//		"book": "java",
//		"page" : 1024
//	}
//}