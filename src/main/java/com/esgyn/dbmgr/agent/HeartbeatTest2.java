package com.esgyn.dbmgr.agent;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;

public class HeartbeatTest2 {
	public static void main(String[] args) throws Exception {
		JSONObject json = RegisterTest2.register();
		System.out.println(json);
		for (int i = 0; i < 10000; i++) {
			JSONObject heartbeat = new JSONObject();
			JSONObject componmentStatus = new JSONObject();
			JSONObject count = new JSONObject();
			count.put("configured", 3);
			count.put("actual", 4);
			count.put("down", 6);
			JSONObject count2 = new JSONObject();
			count2.put("configured", 3);
			count2.put("actual", 4);
			count2.put("down", 6);
			JSONObject count3 = new JSONObject();
			count3.put("configured", 3);
			count3.put("actual", 4);
			count3.put("down", 6);
			JSONObject count4 = new JSONObject();
			count4.put("configured", 3);
			count4.put("actual", 4);
			count4.put("down", 6);
			JSONObject count5 = new JSONObject();
			count5.put("configured", 3);
			count5.put("actual", 4);
			count5.put("down", 6);
			componmentStatus.put("restServer", count);
			componmentStatus.put("dcsServer", count2);
			componmentStatus.put("dcsMaster", count3);
			componmentStatus.put("dtm", count4);
			componmentStatus.put("mon", count5);
			
			heartbeat.put("hostname", "node2");
			heartbeat.put("responseId", json.get("responseId"));
			heartbeat.put("timestamp", "1509679377540");
			heartbeat.put("componentStatus", componmentStatus);
			
			JSONArray array = json.getJSONArray("cmds");
			if(array!=null){
				JSONArray jsonArray = new JSONArray();
				for (int j = 0; j < array.size(); j++) {
					System.out.println(array.get(j));
					JSONObject cmd = array.getJSONObject(j);
					JSONObject cmdJson = new JSONObject();
					cmdJson.put("request_id", cmd.get("request_id"));
					cmdJson.put("task_id",cmd.get("task_id"));
					cmdJson.put("hostname", cmd.get("hostname"));
					cmdJson.put("start_time", System.currentTimeMillis());
					cmdJson.put("exitcode", 0);
					cmdJson.put("status", "finished");
					cmdJson.put("end_time", System.currentTimeMillis()+1000);
					cmdJson.put("output_log", "12312312312312312");
					cmdJson.put("error_log", "12312312312312");
					jsonArray.add(cmdJson);
					heartbeat.put("commandResultList",jsonArray);
				}
			}
			json = heartbeat(heartbeat);
			System.out.println("heartbeat "+heartbeat);
			System.out.println(json);
			Thread.sleep(4000);
		}
	}

	public static JSONObject heartbeat(JSONObject json) throws Exception {
		OkHttpClient client = new OkHttpClient();

		MediaType mediaType = MediaType.parse("application/json");
		RequestBody body = RequestBody.create(mediaType, json.toJSONString());
		Request request = new Request.Builder()
				.url("http://localhost:4205/resources/heartbeat/heartbeat")
				.post(body).addHeader("content-type", "application/json")
				.addHeader("cache-control", "no-cache").build();

		Response response = client.newCall(request).execute();
		ResponseBody resBody = response.body();
		JSONObject rtnJson = JSONObject.parseObject(resBody.string());
		return rtnJson;
	}
}
