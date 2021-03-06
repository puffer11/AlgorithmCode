package com.algorithm.set;

import java.util.EnumMap;

public class EnumMapTest {
	public enum Time {
		ONE, TWO, THREE, FOUR, FIVE, SIX;
	}

	public EnumMap<Time, String> times = new EnumMap<Time, String>(Time.class);

	public EnumMapTest() {
		times.put(Time.ONE, "1个月内");
		times.put(Time.TWO, "1—3个月");
		times.put(Time.THREE, "4—6个月");
		times.put(Time.FOUR, "7—12个月");
		times.put(Time.FIVE, "1年后");
		times.put(Time.SIX, "不确定");
	}
	
	public static void main(String args[]) {
		EnumMapTest enumMapTest = new EnumMapTest();
		System.out.println(enumMapTest.times);
	}

}
