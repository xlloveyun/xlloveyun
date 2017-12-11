package com.esgyn.dbmgr.agent;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import okio.BufferedSink;

public class GetFileTest {
	 final static int BUFFER_SIZE = 4096;

	public static void main(String[] args) throws IOException {
		request();
	}

	public static void request() throws IOException {
		OkHttpClient client = new OkHttpClient();

		RequestBody body = RequestBody.create(null,"UTF_8");
		Request request = new Request.Builder()
				.url("http://localhost:4205/resources/heartbeat/getFile")
				.post(body).addHeader("content-type", "application/json")
				.addHeader("cache-control", "no-cache")
				.addHeader("postman-token",
						"343a0180-95e5-0bae-b166-38c31cc8a1f8")
				.build();

		Response response = client.newCall(request).execute();
		try {
			System.out.println(InputStreamTOString(response.body().byteStream()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	 public static String InputStreamTOString(InputStream in) throws Exception{
	        
	        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
	        byte[] data = new byte[BUFFER_SIZE];
	        int count = -1;
	        while((count = in.read(data,0,BUFFER_SIZE)) != -1)
	            outStream.write(data, 0, count);
	        
	        data = null;
	        return new String(outStream.toByteArray(),"UTF-8");
	    }
}