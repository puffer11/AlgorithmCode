package com.algorithm.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(11, "111");
		map.put(22, "222");
		map.put(33, "333");

		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			Integer key = entry.getKey();
			String value = map.get(key);
			System.out.println("key=" + key +", value=" + value);
		}
		
	}

}
