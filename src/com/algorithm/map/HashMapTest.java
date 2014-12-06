package com.algorithm.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	
	public static void main(String args[]) {
		Map<byte[], String> map = new HashMap<byte[], String>();
		map.put("sogou".getBytes(), "sogou");
//		System.out.println(map);
		
		System.out.println(map.containsKey("sogou".getBytes()));
	}
}
