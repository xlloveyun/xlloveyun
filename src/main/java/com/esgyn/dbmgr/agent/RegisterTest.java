package com.esgyn.dbmgr.agent;

import com.alibaba.fastjson.JSONObject;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;

public class RegisterTest {
	
	public static void main(String[] args) throws Exception {
		
		System.out.println(register());
		
	}
	
	public static JSONObject register() throws Exception{
		OkHttpClient client = new OkHttpClient();
		JSONObject json = getRegisterData();
		System.out.println("requestJSON : "+ json);
		MediaType mediaType = MediaType.parse("application/json");
		RequestBody body = RequestBody.create(mediaType, json.toJSONString());
		Request request = new Request.Builder()
		  .url("http://localhost:4205/resources/heartbeat/register")
		  .post(body)
		  .addHeader("content-type", "application/json")
		  .addHeader("cache-control", "no-cache")
		  .build();

		Response response = client.newCall(request).execute();
		ResponseBody resBody = response.body();
		JSONObject rtnJson = JSONObject.parseObject(resBody.string());
		return rtnJson;
	}

	private static JSONObject getRegisterData() {
		JSONObject json = new JSONObject();
		json.put("hostname", "node1");
		json.put("responseId", -1);
		json.put("timestamp", "1509677537654");
		
		JSONObject hardware = new JSONObject();
		hardware.put("hostname","node1");
		hardware.put("cpu_arch","1");
		hardware.put("cpu_cores","2");
		hardware.put("disk_nums","3");
		hardware.put("user_disk_free","4");
		hardware.put("mem_total","5");
		hardware.put("net_interface","6");
		hardware.put("ext_interfaces","6");
		hardware.put("linux_distro","7");
		hardware.put("kernel_ver","7");
		hardware.put("fqdn","7");
		hardware.put("pid_max","7");
		hardware.put("sqlite","7");
		hardware.put("unzip","7");
		hardware.put("protobuf","7");
		hardware.put("gnuplot","7");
		hardware.put("apr","7");
		hardware.put("lzop","7");
		hardware.put("apr_util","7");
		hardware.put("snappy","7");
		hardware.put("expect","7");
		hardware.put("perl_Time_HiRes","7");
		hardware.put("gzip","7");
		hardware.put("perl_DBD_SQLite","7");
		hardware.put("unixODBC_devel","7");
		hardware.put("libiodbc_devel","7");
		json.put("hostInfo",hardware);
		return json;
	}
}
