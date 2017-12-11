package com.esgyn.dbmgr.utils;
import java.util.HashMap;
import java.util.Map;

public class DiscoverBean{
		private String doc ;
		private Integer intVal;
		private String expectValue="";
		private Map<String,String> nodeStatus = new HashMap<String, String>();
		
		public DiscoverBean(String doc ,Integer intVal,String expectValue,Map<String,String> map){
			this.doc = doc;
			this.intVal = intVal;
			this.expectValue = expectValue;
			this.nodeStatus.putAll(map);
		}

		
		
		public String getDoc() {
			return doc;
		}



		public void setDoc(String doc) {
			this.doc = doc;
		}



		public Integer getIntVal() {
			return intVal;
		}

		public void setIntVal(Integer intVal) {
			this.intVal = intVal;
		}

		public String getExpectValue() {
			return expectValue;
		}

		public void setExpectValue(String expectValue) {
			this.expectValue = expectValue;
		}

		public Map<String, String> getNodeStatus() {
			return nodeStatus;
		}

		public void setNodeStatus(Map<String, String> nodeStatus) {
			this.nodeStatus = nodeStatus;
		}
		
		
		
}