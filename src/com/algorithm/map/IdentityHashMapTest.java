package com.algorithm.map;

import java.util.IdentityHashMap;
import java.util.Map.Entry;

public class IdentityHashMapTest {

	public static void main(String[] args) {
//		IdentityHashMap<String,Object> map = new IdentityHashMap<String,Object>();
//		map.put(new String("xx"), "first");
//		map.put(new String("xx"), "second");
//		for (Entry<String, Object> entry : map.entrySet()) {
//		    System.out.print(entry.getKey() + "    ");
//		    System.out.println(entry.getValue());
//		}
//		System.out.println("idenMap="+map.containsKey("xx"));
//		System.out.println("idenMap="+map.get("xx"));
		
		
		IdentityHashMap<String,Object> map = new IdentityHashMap<String,Object>();
		   String fsString = new String("xx");
		   map.put(fsString, "first");
		   map.put(new String("xx"), "second");
		   for (Entry<String, Object> entry : map.entrySet()) {
		       System.out.print(entry.getKey() + "    ");
		       System.out.println(entry.getValue());
		   }
		   System.out.println("idenMap="+map.containsKey(fsString));
		   System.out.println("idenMap="+map.get(fsString));


	}

}
