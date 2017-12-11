package com.esgyn.dbmgr.agent;

import java.io.IOException;

import com.alibaba.fastjson.JSONObject;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

public class RequestTest  implements Runnable {
	
	public static void main(String[] args) throws IOException {
		long a =System.currentTimeMillis();
			Thread thread1 = new Thread(){
				@Override
				public void run() {
					for (int j = 0; j < 3; j++) {
						try {
							new RequestTest().request();
						} catch (IOException e) {
							e.printStackTrace();
						}		
					}
				};
			};
			thread1.run();
		long b = System.currentTimeMillis();
		System.out.println((b-a)/1000 +"s");
	}

	public void request() throws IOException{
		JSONObject json = new JSONObject();
		OkHttpClient client = new OkHttpClient();
		MediaType mediaType = MediaType.parse("application/json");
		RequestBody body = RequestBody.create(mediaType,json.toJSONString());
		Request request = new Request.Builder()
		  .url("http://localhost:4205/resources/heartbeat/request")
		  .post(body)
		  .addHeader("content-type", "application/json")
		  .addHeader("cache-control", "no-cache")
		  .addHeader("postman-token", "367c9a60-1769-1953-8870-4692a2a9a9fe")
		  .build();
		Response response = client.newCall(request).execute();
	}	
	
	
	public void run() {
		try {
			request();
		} catch (Exception e) {
			e.printStackTrace();;
		}
	}
}
