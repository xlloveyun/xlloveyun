package com.esgyn.dbmgr.utils;

import java.util.HashMap;
import java.util.Map;

public class HttpTest {
	
	public static void main(String[] args) {
		try {
			Map<String,String> param = new HashMap<String, String>();
			param.put("reponseId", "0");
			String str = HttpClientUtils.simpleGetInvoke("http://localhost:4205/resources/server/services/all?_=1509431686269", param,"UTF-8");
			System.out.println(str);
		}  catch (Exception e) {
			e.printStackTrace();
		}
	}
}
